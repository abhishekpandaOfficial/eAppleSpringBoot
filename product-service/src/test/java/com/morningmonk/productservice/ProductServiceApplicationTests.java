package com.morningmonk.productservice;


import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
@Testcontainers
public class ProductServiceApplicationTests
{
  @Container
  static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:4.4.2");
  @DynamicPropertySource
  static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry)
      {
          dynamicPropertyRegistry.add("spring.data.mongodb.uri", mongoDBContainer::getReplicaSetUrl);
      }
  @Test
  void contextLoads(){
  }


}
