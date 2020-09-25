package com.github.zheng93775.study.struct.constant;

import com.github.zheng93775.study.struct.base.Byte2;

public class StringConstant extends Constant {
    /**
     * (1字节) 常量类型标志
     * @see ConstantTagEnum
     */
    public byte tag = ConstantTagEnum.String.value;

    /**
     * (2字节) 字符串字面量，指向Utf8类型常量的索引
     */
    public Byte2<Utf8Constant> index;
}
