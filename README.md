

#Active Spring profiles by below several methods

1.vm options -Dspring.profiles.active=dev <br/>

2.application.properties spring.profiles.active=dev <br/>

3.mvn spring-boot:run -Drun.jvmArguments="-Dspring.profiles.active=dev" or mvn spring-boot:run -Dspring.profiles.active=dev
 <br/>

4. pom.xml config <br/>

`<plugins>` <br/>
    `<plugin>`<br/>
        `<groupId>org.springframework.boot</groupId>`<br/>
        `<artifactId>spring-boot-maven-plugin</artifactId>`<br/>
        `<configuration>`<br/>
            `<profiles>`<br/>
                `<profile>dev</profile>`<br/>
            `</profiles>`<br/>
        `</configuration>`<br/>
    `</plugin>`<br/>
    ...<br/>
`</plugins>`<br/>

then mvn spring-boot:run
