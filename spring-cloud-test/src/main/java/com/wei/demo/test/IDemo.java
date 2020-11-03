package com.wei.demo.test;

/**
 * 函数式接口
 * 只允许有一个抽象方法
 * 可以用static/default修饰方法的是其可以有具体实现
 * */

@FunctionalInterface
public interface IDemo {
    Integer sum(int x,int y);
}
