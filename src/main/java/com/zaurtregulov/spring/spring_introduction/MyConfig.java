package com.zaurtregulov.spring.spring_introduction;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("com.zaurtregulov.spring.spring_introduction")
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Person personBean() {
        Person person = new Person();
        person.setPet(catBean());
        return person;
    }
}
