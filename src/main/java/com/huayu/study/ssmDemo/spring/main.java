package com.huayu.study.ssmDemo.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by zhaohuayu on 17/3/9.
 */
public class main {

    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml") ;
        //System.out.println(context.getBean("springDemo").toString());

        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("bean.xml"));
        System.out.println(beanFactory.getBean("springDemo").toString());

    }
}
