package com.github.zheng93775.study;

import com.github.zheng93775.study.struct.*;

public class ClassStruct {
    /**
     * 魔数与Class文件的版本
     */
    public HeadStruct headStruct;

    /**
     * 常量池
     */
    public ConstantPoolStruct constantPoolStruct;

    /**
     * 访问标志
     * 2字节
     */
    public AccessFlagStruct accessFlagStruct;

    /**
     * 类索引、父类索引、接口索引集合
     */
    public IndexStruct indexStruct;

    /**
     * 字段表集合
     */
    public FieldStruct fieldStruct;

    /**
     * 方法表集合
     */
    public MethodStruct methodStruct;

    /**
     * 属性表集合
     */
    public AttributeStruct attributeStruct;
}
