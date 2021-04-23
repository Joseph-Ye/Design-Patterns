package com.study.designpatterns.combinationmode;

import com.study.designpatterns.combinationmode.Duck;
import com.study.designpatterns.combinationmode.FlyBehavior;
import com.study.designpatterns.combinationmode.impl.FlyNoWay;
import com.study.designpatterns.combinationmode.impl.MuteQuack;

/**
 * @author jhye4
 * @date 2021/4/4 22:23
 */
public class MuteDuck extends Duck {
    public MuteDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
}
