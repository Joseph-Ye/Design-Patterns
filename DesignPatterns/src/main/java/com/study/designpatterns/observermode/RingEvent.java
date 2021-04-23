package com.study.designpatterns.observermode;

import lombok.Getter;
import lombok.Setter;

import java.util.EventObject;

/**
 * @author jhye4
 * 铃声事件类：用于封装事件源及一些与事件相关的参数
 * @date 2021/4/23 10:12
 */
@Getter
@Setter
public class RingEvent extends EventObject {
    /**
     * 铃声 true:上课  false:下课
     */
    private boolean sound;

    public RingEvent(Object source, boolean sound){
        super(source);
        this.sound = sound;
    }
}
