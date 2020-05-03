# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.1.9.RELEASE/maven-plugin/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.1.9.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Security](https://docs.spring.io/spring-boot/docs/2.1.9.RELEASE/reference/htmlsingle/#boot-features-security)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.1.9.RELEASE/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.1.9.RELEASE/reference/htmlsingle/#using-boot-devtools)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/2.1.9.RELEASE/reference/htmlsingle/#production-ready)
* [OAuth2 Client](https://docs.spring.io/spring-boot/docs/2.1.9.RELEASE/reference/htmlsingle/#boot-features-security-oauth2-client)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)

#########################EXAMPLE########################
#https://www.baeldung.com/spring-security-5-oauth2-login

By default, Spring Boot configures 
this redirect URI as /login/oauth2/code/{registrationId}. Therefore, for Google we'll add the URI:

# http://localhost:8081/login/oauth2/code/google

To obtain the client credentials for authentication with Facebook
, we need to register an application on the Facebook for Developers website and set up the corresponding 
URI as a “Valid OAuth redirect URI”:

# http://localhost:8081/login/oauth2/code/facebook

       
