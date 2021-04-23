package com.study.designpatterns.combinationmode.impl;

import com.study.designpatterns.combinationmode.FlyBehavior;
import lombok.extern.slf4j.Slf4j;

/**
 * @author jhye4
 * @date 2021/4/4 22:15
 */
@Slf4j
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        log.info("I can not fly...");
    }
}
