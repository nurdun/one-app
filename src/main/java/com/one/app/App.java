package com.one.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.mybatis.spring.annotation.MapperScan;

import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
//@MapperScan("com.one.app.Mapper")
public class App implements CommandLineRunner
{
    @Autowired
   JdbcTemplate jdbcTemplate;


    private static final Logger log = LoggerFactory.getLogger(App.class);


    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... strings) {
        log.info("StartApplication...");

       String usersTableSql =  "CREATE  TABLE IF NOT EXISTS users" +
               "(userId varchar(255) NOT NULL," +
               "userName varchar(255) NOT NULL," +
               "email varchar(255) NOT NULL,"+
               "country varchar(255) NOT NULL,"+
               "gender varchar(255)," +
               "Age int," +
               "createTime Timestamp, "+
               "updateTime Timestamp, "+
               "PRIMARY KEY (userId)" +
               ")";

       jdbcTemplate.execute(usersTableSql);
    }
}
