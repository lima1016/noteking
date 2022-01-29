//package com.project.noteking.dbtest;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Component;
//
//import javax.sql.DataSource;
//import java.sql.Connection;
//import java.sql.Statement;
//// https://velog.io/@jwpark06/SpringBoot%EC%97%90-JDBC%EB%A1%9C-Postgresql-%EC%97%B0%EB%8F%99%ED%95%98%EA%B8%B0
//@Component
//public class PostgreSQLRunner implements ApplicationRunner {
//  @Autowired
//  DataSource dataSource;
//
//  @Autowired
//  JdbcTemplate jdbcTemplate;
//
//  @Override
//  public void run(ApplicationArguments args) throws Exception {
//    try (Connection connection = dataSource.getConnection()){
//      System.out.println(dataSource.getClass());
//      System.out.println(connection.getMetaData().getURL());
//      System.out.println(connection.getMetaData().getUserName());
//
//      Statement statement = connection.createStatement();
//      String sql = "CREATE TABLE t_product(product_no INTEGER NOT NULL, product_name VARCHAR(255), PRIMARY KEY (product_no))";
//      statement.executeUpdate(sql);
//      // jdbcTemplate.execute(sql); 이거도 됨
//    }
//    jdbcTemplate.execute("INSERT INTO t_product VALUES (1, 'Big shirt')");
//  }
//}