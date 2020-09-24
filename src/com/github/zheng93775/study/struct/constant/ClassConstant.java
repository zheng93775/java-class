package com.github.zheng93775.study.struct.constant;

import com.github.zheng93775.study.struct.base.Byte2;

public class ClassConstant extends Constant {
    /**
     * (1字节) 常量类型标志
     * @see ConstantTagEnum
     */
    public byte tag = ConstantTagEnum.Class.value;

    /**
     * (2字节) 类或接口的全限定名，指向Utf8类型常量的索引
     */
    public Byte2<Utf8Constant> nameIndex;
}
