package com.study.designpatterns.observermode;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author jhye4
 * 目标类：事件源 铃铛
 * @date 2021/4/23 10:05
 */
@Slf4j
public class BellEventSource {
    /**
     * 观察者容器
     */
    private List<BellEventObserver> bellEventObservers;

    public BellEventSource(){
        this.bellEventObservers = new ArrayList<>();
    }

    /**
     * 添加观察者
     * @param bellEventObserver
     */
    public void add(BellEventObserver bellEventObserver){
        bellEventObservers.add(bellEventObserver);
    }

    public void ring(boolean sound){
        String type = sound ? "上课" : "下课";
        log.info(type + "铃声响！！！");
        RingEvent ringEvent = new RingEvent(this, sound);
        publish(ringEvent);
    }

    private void publish(RingEvent ringEvent) {
        BellEventObserver observer = null;
        Iterator<BellEventObserver> it = bellEventObservers.iterator();
        while(it.hasNext()){
            observer = it.next();
            observer.hearBell(ringEvent);
        }
    }

}
