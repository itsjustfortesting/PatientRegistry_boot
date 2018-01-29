//package com.mmalz.patientregistry.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
////    @Autowired
////    DataSource dataSource;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//
////        auth.jdbcAuthentication().dataSource(dataSource)
////                .usersByUsernameQuery("select username, password, enabled from users where username=?")
////                .authoritiesByUsernameQuery("select usr.username, rl.role_name from user_roles rl " +
////                        "join users usr on usr.role_id = rl.role_id " +
////                        "where usr.username=?")
////                .passwordEncoder(passwordEncoder);
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/").permitAll()//.access("hasRole('ADMIN') OR hasRole('USER')")
//                .and()
//                .formLogin()
//                    .loginPage("/login")
//                    .loginProcessingUrl("/loginauth")
//                    .permitAll()
//                .and()
//                .logout()
//                    .permitAll()
//                .and()
//                .exceptionHandling()
//                    .accessDeniedPage("/access-denied");
//    }
//
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        web.ignoring()
//                .antMatchers("/resources/**");
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}
