package com.github.zheng93775.study.struct.constant;

import com.github.zheng93775.study.struct.constant.base.Constant;
import com.github.zheng93775.study.struct.constant.base.ConstantTagEnum;

public class DoubleConstant extends Constant {
    /**
     * (1字节) 常量类型标志
     * @see ConstantTagEnum
     */
    public byte tag = ConstantTagEnum.Double.value;

    /**
     * (8字节) 按照高位在前存储的double值
     */
    public double value;
}
