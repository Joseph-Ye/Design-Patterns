package com.study.designpatterns.combinationmode.impl;

import com.study.designpatterns.combinationmode.QuackBehavior;
import lombok.extern.slf4j.Slf4j;

/**
 * @author jhye4
 * @date 2021/4/4 22:14
 */
@Slf4j
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        log.info("Squeak Squeak...");
    }
}
