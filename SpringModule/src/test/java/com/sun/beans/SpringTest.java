package com.sun.beans;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author sunjun
 * @create 2020-08-27 15:54
 */
public class SpringTest {
    @Test
    public void testDI(){
//        ClassPathXMLApplicationContext会在生成的classes路径下寻找配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student);

//        FileSystemXmlApplicationContext需要写绝对路径，而且要写编译后的路径，否则找不到文件
//        ApplicationContext applicationContext1 = new FileSystemXmlApplicationContext("D:\\IDEAworkspace\\FrameWork\\SpringModule\\target\\classes\\applicationContext.xml");
//        Student student2 = (Student) applicationContext1.getBean("student");
//        System.out.println(student2);

    }

    @Test
    public void autowireTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
        UserDaoDI userDaoDI = (UserDaoDI) applicationContext.getBean("UserDaoDI");
        userDaoDI.add();
    }

    @Test
    public void typeTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
        TypeBean typeBean = (TypeBean) applicationContext.getBean("typeBean");
//        测试数组注入情况
        typeBean.printArray();
//        测试list集合注入情况
        typeBean.printList();
//        测试set集合注入情况
        typeBean.printSet();
//        测试map集合注入情况
        typeBean.printMap();
//        测试properties注入情况
        typeBean.printPro();
    }
}
