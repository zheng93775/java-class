package com.github.zheng93775.study.struct;

import com.github.zheng93775.study.struct.constant.base.Constant;

/**
 * 常量池
 */
public class ConstantPoolStruct {
    /**
     * (2字节) 常量池容量计数值
     * 容量计数值是从1开始，而不是0；比如值为6，代表常量池中有5项常量。最初应该是为指针运算方便而定。
     */
    public short constantPoolCount;

    /**
     * 长度为 constantPoolCount 的常量列表
     */
    public Constant[] constants;
}
