package dio.spsecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
public class WebSecurityConfig {
    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        // Para testes
        UserDetails user = User.withDefaultPasswordEncoder()
            .username("User")
            .password("pwd123")
            .roles("USER")
            .build();
        return new InMemoryUserDetailsManager(user);
    }
    
}
