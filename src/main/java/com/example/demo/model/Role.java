package com.example.demo.model;


import org.springframework.security.core.GrantedAuthority;


public enum Role implements GrantedAuthority {

    ADMIN {
        @Override
        public String getAuthority() {
            return "ROLE_ADMIN";
        }
    },

    USER {
        @Override
        public String getAuthority() {
            return "ROLE_USER";
        }
    },

    ANONYMOUS {
        @Override
        public String getAuthority() {
            return "ROLE_ANONYMOUS";
        }
    }


}
