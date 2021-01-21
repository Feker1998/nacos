package com.feker.nacosfeign.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class RemoteHystrix implements RemoteClient {
    @Override
    public String helloNacos() {
        log.error("请求超时了");
        return "请求超时了";
    }
}
