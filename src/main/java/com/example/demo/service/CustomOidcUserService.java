package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.model.dto.GoogleOAuth2UserInfo;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserRequest;
import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserService;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CustomOidcUserService extends OidcUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public OidcUser loadUser(OidcUserRequest userRequest) throws OAuth2AuthenticationException {
        OidcUser oidcUser = super.loadUser(userRequest);
        Map attributes = oidcUser.getAttributes();

        GoogleOAuth2UserInfo userInfo = new GoogleOAuth2UserInfo();
        userInfo.setEmail((String) attributes.get("email"));
        userInfo.setId((String) attributes.get("sub"));
        userInfo.setImageUrl((String) attributes.get("picture"));
        userInfo.setName((String) attributes.get("name"));
        //TODO can be more...
        updateUser(userInfo);
        return oidcUser;
    }

    private void updateUser(GoogleOAuth2UserInfo userInfo) {
        User user = userRepository.findUserByEmail(userInfo.getEmail()).orElse(null);
        if (user == null) {
            throw new UsernameNotFoundException("User[email=" + userInfo.getEmail() + "] not found");
        }
//      user.setUserEmail(userInfo.getEmail());
//      user.setImageUrl(userInfo.getImageUrl());
        user.setUserName(userInfo.getName());

        //TODO SAVE or UPDATE
//      user.setUserType(UserType.google);
//      userRepository.save(user);
    }
}
