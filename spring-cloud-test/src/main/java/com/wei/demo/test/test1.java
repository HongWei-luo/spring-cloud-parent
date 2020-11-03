package com.wei.demo.test;

/**
 * @author ：lhw
 * @date ：2020/10/28 14:55
 * @description：描述
 */
@SuppressWarnings("all")
public class test1 {
    public static void main(String[] args) {
        /**
         * 调用函数式接口
         * 使用lambda表达式接口的具体实现
         * */
        //接口只有一个方法，编写方法的具体实现例1
        IDemo demo2 = (x,y)->x+y;
        //接口只有一个方法，编写方法的具体实现例2
        IDemo demo1 = (x,y)->x+y+x;
        Integer sum2 = demo2.sum(3, 5);
        Integer sum1 = demo1.sum(3, 5);
        System.out.println("sum1:"+sum1);
        System.out.println("sum2:"+sum2);
    }
}
