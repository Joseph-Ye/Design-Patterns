package com.study.designpatterns.observermode;

import lombok.extern.slf4j.Slf4j;

/**
 * @author jhye4
 * @date 2021/4/23 10:24
 */
@Slf4j
public class TeacherObserver implements   BellEventObserver{
    @Override
    public void hearBell(RingEvent ringEvent) {
        if(ringEvent.isSound()){
            log.info("上课！");
        }else{
            log.info("下课！");
        }
    }
}
