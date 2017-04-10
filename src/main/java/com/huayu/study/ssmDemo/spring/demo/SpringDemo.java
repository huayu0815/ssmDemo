package com.huayu.study.ssmDemo.spring.demo;

/**
 * Created by zhaohuayu on 17/3/9.
 */
public class SpringDemo {

    int id;
    String name;

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer() ;
        stringBuffer.append("id:").append(id).append(",name:").append(name) ;
        return  stringBuffer.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
