package com.study.designpatterns;

import com.study.designpatterns.combinationmode.Duck;
import com.study.designpatterns.combinationmode.MuteDuck;
import com.study.designpatterns.combinationmode.impl.MuteQuack;
import com.study.designpatterns.combinationmode.impl.Quack;
import com.study.designpatterns.observermode.BellEventSource;
import com.study.designpatterns.observermode.StudentObserver;
import com.study.designpatterns.observermode.TeacherObserver;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class DesignpatternsApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void combinationMode(){
        Duck duck = new MuteDuck();
        duck.fly();
        duck.quack();
        duck.setQuackBehavior(new Quack());
        duck.quack();
    }

    @Test
    void observerMode(){
        BellEventSource bell = new BellEventSource();
        TeacherObserver teacherObserver = new TeacherObserver();
        StudentObserver studentObserver = new StudentObserver();
        bell.add(teacherObserver);
        bell.add(studentObserver);
        bell.ring(true);
        log.info("------------one thousand year later-----------------");
        bell.ring(false);
    }

}
