package me.fmaffioletti.service;

import me.fmaffioletti.configuration.MyConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fmaffioletti on 2/8/17.
 */
@Service
public class MyServiceImpl implements MyService {

    @Autowired
    private MyConfiguration myConfiguration;

    @Override
    public String getExample() {
        return myConfiguration.getExample();
    }
}
