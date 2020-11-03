package com.wei.demo.test;

/**
 * @author ：lhw
 * @date ：2020/10/28 15:23
 * @description：描述
 */
public class testDto {
    private String  name;
    private String  sex;
    private String  addr;
    private String  money;
    private String  age;

    public testDto() {
    }

    public testDto(String name, String sex, String addr, String money, String age) {
        this.name = name;
        this.sex = sex;
        this.addr = addr;
        this.money = money;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "testDto{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", addr='" + addr + '\'' +
                ", money='" + money + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
