package com.github.zheng93775.study.struct;

import com.github.zheng93775.study.desc.MethodAccessFlagEnum;
import com.github.zheng93775.study.struct.common.Byte2;
import com.github.zheng93775.study.struct.constant.Utf8Constant;

public class MethodStruct {
    /**
     * (2字节) 访问标志
     * @see MethodAccessFlagEnum
     */
    public short accessFlags;

    /**
     * (2字节) 指向方法简单名称的UTF8常量的索引
     */
    public Byte2<Utf8Constant> nameIndex;

    /**
     * (2字节) 指向方法描述符的UTF8常量的索引
     */
    public Byte2<Utf8Constant> descriptorIndex;

    /**
     * (2字节) 属性数量
     */
    public short attributesCount;

    /**
     * 长度为 attributesCount 的属性列表
     */
    public AttributeStruct[] attributes = new AttributeStruct[attributesCount];
}
