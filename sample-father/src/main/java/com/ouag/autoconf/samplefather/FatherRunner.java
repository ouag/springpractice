package com.ouag.autoconf.samplefather;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;

@Slf4j
public class FatherRunner implements IApplicationRunner {


    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("=========================   Father Runner called !!!  ======================");
    }
}
