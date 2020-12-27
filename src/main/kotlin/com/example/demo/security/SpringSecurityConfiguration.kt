package com.example.demo.security

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

class SpringSecurityConfiguration(disableDefaults: Boolean) : WebSecurityConfigurerAdapter(disableDefaults) {

    override fun configure(http: HttpSecurity) {
        http.csrf().disable()
        http.authorizeRequests()
                .antMatchers("**")
                .authenticated()
                .and()
                .formLogin().permitAll()
    }

    override fun configure(auth: AuthenticationManagerBuilder?) {
        auth.userDetailsService()
    }
}
