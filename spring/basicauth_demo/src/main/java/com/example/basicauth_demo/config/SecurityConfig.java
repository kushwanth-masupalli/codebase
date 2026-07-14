package com.example.basicauth_demo.config;


import com.example.basicauth_demo.user.AppUser;
import com.example.basicauth_demo.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/public/**").permitAll()
                        .requestMatchers("/admin/**").hasRole("ADMIN")
                        .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults());

        return http.build();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    @Bean
    CommandLineRunner runner(UserRepository repo,
                             BCryptPasswordEncoder encoder) {
        return args -> {

            if(repo.findByUsername("user").isEmpty()) {
                repo.save(new AppUser(
                        null,
                        "user",
                        encoder.encode("password"),
                        "ROLE_USER"
                ));
            }

            if(repo.findByUsername("admin").isEmpty()) {
                repo.save(new AppUser(
                        null,
                        "admin",
                        encoder.encode("admin123"),
                        "ROLE_ADMIN"
                ));
            }
        };
    }
}


