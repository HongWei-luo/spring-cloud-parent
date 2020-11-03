package com.wei.demo.test;

import java.util.Arrays;
import java.util.List;

/**
 * @author ：lhw
 * @date ：2020/10/28 15:22
 * @description：描述
 */
@SuppressWarnings("all")
public class test2 {

    static List<testDto> testDtos = Arrays.asList(
            new testDto("1","2","3","4","3"),
            new testDto("2","3","3","4","3"),
            new testDto("3","4","3","4","5"),
            new testDto("4","5","3","4","5")
    );

    public static void main(String[] args) {
        /*testDtos.stream()
                .filter(n->n.getAge().equals("3"))
                .limit(1)
                .forEach(System.out::println);*/
      /*  storeList.stream()
                .map(StorePO::getLogo)
                .forEach((x)->uploadRemote.getUrlByKey(x));*/

        /**
         * 每一个参数都可以不添加参数类型
         * lambda会自动联系上下文匹配参数类型
         * */
        testDtos.stream()
                .forEach((x)->{
                   x.setAge(x.getAddr());
                    System.out.println(x);
                });

    }


}
