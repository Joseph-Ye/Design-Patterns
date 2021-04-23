package com.study.designpatterns.observermode;

import lombok.extern.slf4j.Slf4j;

/**
 * @author jhye4
 * 事件监听者：学生 老师等
 * @date 2021/4/23 10:07
 */
public interface BellEventObserver {

    void hearBell(RingEvent ringEvent);
}
