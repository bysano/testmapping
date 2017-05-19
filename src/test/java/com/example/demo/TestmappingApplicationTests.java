package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = TestmappingApplication.class)
public class TestmappingApplicationTests {
    @Autowired
    private AccountRepository accountRepository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void fetch() {
      Account account=accountRepository.findByCurrency("testaccount");
    }
}
