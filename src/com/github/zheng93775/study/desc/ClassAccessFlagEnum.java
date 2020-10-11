package com.github.zheng93775.study.desc;

public enum ClassAccessFlagEnum {
    /**
     * 是否为public类型
     */
    ACC_PUBLIC(0x0001),

    /**
     * 是否被声明为final
     */
    ACC_FINAL(0x0010),

    /**
     * 是否允许使用invokespecial字节码指令的新语义（JDK1.0.2版本对此指令的语义有变更）
     */
    ACC_SUPER(0x0020),

    /**
     * 标识这是一个接口
     */
    ACC_INTERFACE(0x0200),

    /**
     * 是否为abstract类型，接口和抽象类此标志为true
     */
    ACC_ABSTRACT(0x0400),

    /**
     * 标识这个类并非由用户代码产生的
     */
    ACC_SYNTHETIC(0x1000),

    /**
     * 标识这是一个注解
     */
    ACC_ANNOTATION(0x2000),

    /**
     * 标识这是一个玫举
     */
    ACC_ENUM(0x4000),

    /**
     * 标识这是一个模块
     */
    ACC_MODULE(0x8000),
    ;
    public short value;
    ClassAccessFlagEnum(int value) {
        this.value = (short) value;
    }
}
