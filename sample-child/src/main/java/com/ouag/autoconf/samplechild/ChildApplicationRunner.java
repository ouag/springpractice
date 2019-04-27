package com.ouag.autoconf.samplechild;

import com.ouag.autoconf.samplefather.IApplicationRunner;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ChildApplicationRunner implements IApplicationRunner {

    public void run(ApplicationArguments args) throws Exception {
        log.info("=========================   child Runner called !!!  ======================");
    }
}
