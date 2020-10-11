package com.github.zheng93775.study.desc;

/*
    JDK版本和class文件中的主版本号的对应关系
    JDK 6  ===> 50
    JDK 7  ===> 51
    JDK 8  ===> 52
    JDK 9  ===> 53
    JDK 10 ===> 54
    JDK 11 ===> 55
    JDK 12 ===> 56
    JDK 13 ===> 57
    JDK 14 ===> 58
    JDK 15 ===> 59
*/
public enum MajorVersionEnum {
    JDK_6(50),
    JDK_7(51),
    JDK_8(52),
    JDK_9(53),
    JDK_10(54),
    JDK_11(55),
    JDK_12(56),
    JDK_13(57),
    JDK_14(58),
    JDK_15(59),
    ;
    public short value;
    MajorVersionEnum(int value) {
        this.value = (short) value;
    }
}
