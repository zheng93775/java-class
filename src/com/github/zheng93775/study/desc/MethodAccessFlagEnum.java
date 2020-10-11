package com.github.zheng93775.study.desc;

public enum MethodAccessFlagEnum {
    /**
     * 方法是否为 public
     */
    ACC_PUBLIC(0x0001),

    /**
     * 方法是否为 private
     */
    ACC_PRIVATE(0x0002),

    /**
     * 方法是否为 protected
     */
    ACC_PROTECTED(0x0004),

    /**
     * 方法是否为 static
     */
    ACC_STATIC(0x0008),

    /**
     * 方法是否为 final
     */
    ACC_FINAL(0x0010),

    /**
     * 方法是否为 synchronized
     */
    ACC_SYNCHRONIZED(0x0020),

    /**
     * 方法是不是由编译器产生的桥接方法
     */
    ACC_BRIDGE(0x0040),

    /**
     * 方法是否接受不定参数
     */
    ACC_VARARGS(0x0080),

    /**
     * 方法是否为 native
     */
    ACC_NATIVE(0x0100),

    /**
     * 方法是否为 abstract
     */
    ACC_ABSTRACT(0x0400),

    /**
     * 方法是否为strictfp
     */
    ACC_STRICT(0x0800),

    /**
     * 方法是否由编译器自动产生
     */
    ACC_SYNTHETIC(0x1000),
    ;
    public short value;
    MethodAccessFlagEnum(int value) {
        this.value = (short) value;
    }
}
