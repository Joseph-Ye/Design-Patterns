package com.study.designpatterns.observermode;

import lombok.extern.slf4j.Slf4j;

/**
 * @author jhye4
 * @date 2021/4/23 10:27
 */
@Slf4j
public class StudentObserver implements BellEventObserver{
    @Override
    public void hearBell(RingEvent ringEvent) {
        if(ringEvent.isSound()){
            log.info("起立！老师好");
        }else{
            log.info("老师再见！");
        }
    }
}
