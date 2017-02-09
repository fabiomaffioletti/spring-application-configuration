package me.fmaffioletti.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by fmaffioletti on 2/8/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyServiceTest {

    @Autowired
    private MyService myService;

    @Test
    public void testItShouldGetTheConfigurationEntryWithSuccess() {

        assertThat(myService.getExample(), is("text"));

    }

}
