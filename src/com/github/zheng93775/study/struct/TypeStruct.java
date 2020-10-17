package com.github.zheng93775.study.struct;

import com.github.zheng93775.study.struct.common.Byte2;
import com.github.zheng93775.study.struct.constant.ClassConstant;

public class TypeStruct {
    /**
     * (2字节) 指向本类的全限定名的Class常量的索引
     */
    public Byte2<ClassConstant> thisClass;

    /**
     * (2字节) 指向父类的全限定名的Class常量的索引
     */
    public Byte2<ClassConstant> superClass;

    /**
     * (2字节) 该类实现的接口的数量
     */
    public short interfacesCount;

    /**
     * 实现的接口列表，数组长度为interfacesCount，数组里每一项为指向接口对应的Class常量的索引
     */
    public Byte2<ClassConstant>[] interfaces;
}
