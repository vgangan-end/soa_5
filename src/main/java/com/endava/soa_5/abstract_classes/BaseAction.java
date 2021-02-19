package com.endava.soa_5.abstract_classes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseAction extends BaseClass{
    public BaseAction(){
        Logger logger = LoggerFactory.getLogger(this.getClass());
    }
}
