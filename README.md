# springboot-mybatis-mysql-example

#Active Spring profiles by below several methods

1.vm options -Dspring.profiles.active=dev <br/>

2.application.properties spring.profiles.active=dev <br/>

3.mvn spring-boot:run -Drun.jvmArguments="-Dspring.profiles.active=dev" <br/>

4. pom.xml config <br/>
`<plugins> 
    <plugin>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-maven-plugin</artifactId>
        <configuration>
            <profiles>
                <profile>dev</profile>
            </profiles>
        </configuration>
    </plugin>
    ...
</plugins>`<br/>
then mvn spring-boot:run
