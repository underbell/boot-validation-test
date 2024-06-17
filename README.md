## This is the reproduces repository for the [issue](https://github.com/spring-projects/spring-framework/issues/33043)

It happens after springboot:3.2.2 and spring-web:6.1.3
Reproduce conditions is `spring-security` and `@Valid` and `@Positive` validation

### I want you to run and check it please.

#### Run UserControllerTest

1. test `usersAbnormalViolated` case failed cause `java.lang.NoClassDefFoundError: jakarta/servlet/ServletException`

2. test `usersNormalViolated` cass passed
