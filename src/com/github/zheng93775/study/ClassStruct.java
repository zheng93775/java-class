package com.github.zheng93775.study;

import com.github.zheng93775.study.desc.ClassAccessFlagEnum;
import com.github.zheng93775.study.struct.*;

public class ClassStruct {
    /**
     * (8字节) 魔数与Class文件的版本
     */
    public HeadStruct headStruct;

    /**
     * 常量池
     */
    public ConstantPoolStruct constantPoolStruct;

    /**
     * (2字节) 访问标志
     * @see ClassAccessFlagEnum
     */
    public short accessFlags;

    /**
     * 类索引、父类索引、接口索引集合
     */
    public TypeStruct typeStruct;

    /**
     * 字段表集合
     */
    public FieldsStruct fieldsStruct;

    /**
     * 方法表集合
     */
    public MethodStruct methodStruct;

    /**
     * 属性表集合
     */
    public AttributeStruct attributeStruct;
}
