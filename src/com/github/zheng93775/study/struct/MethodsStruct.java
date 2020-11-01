package com.github.zheng93775.study.struct;

public class MethodsStruct {
    /**
     * (2字节) 方法数量
     */
    public short methodsCount;

    /**
     * 长度为 methodsCount 的方法列表
     */
    public MethodStruct[] fields = new MethodStruct[methodsCount];
}
