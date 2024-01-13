package com.alibaba.csp.pts.demo;


import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestLogController {
    private static final Logger LOGGER = LogManager.getLogger(TestLogController.class);

    @RequestMapping(value = "/test/sayHello", method = RequestMethod.GET)
    String sayHello(@RequestParam("name") String name) throws Exception {
        String text = RandomStringUtils.randomNumeric(10);
        LOGGER.trace("testEcho needed more information - {}", text);
        LOGGER.debug("testEcho needed to debug - {}", text);
        LOGGER.info("testEcho took input - {}", text);
        LOGGER.warn("testEcho needed to warn - {}", text);
        LOGGER.error("testEcho encountered an error with value - {}", text);
        return "hello " + name;
    }
}
