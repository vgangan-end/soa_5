package com.endava.soa_5.abstract_classes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseAction extends BaseClass{
    public Logger log;
    public BaseAction(){
        log = LoggerFactory.getLogger(this.getClass());
    }
}
