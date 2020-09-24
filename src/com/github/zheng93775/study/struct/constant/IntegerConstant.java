package com.github.zheng93775.study.struct.constant;

public class IntegerConstant extends Constant {
    /**
     * (1字节) 常量类型标志
     * @see ConstantTagEnum
     */
    public byte tag = ConstantTagEnum.Integer.value;

    /**
     * (4字节) 按照高位在前存储的int值
     */
    public int value;
}
