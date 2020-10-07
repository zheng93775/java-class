package com.github.zheng93775.study.struct.constant;

import com.github.zheng93775.study.struct.constant.base.Constant;
import com.github.zheng93775.study.struct.constant.base.ConstantTagEnum;
import com.github.zheng93775.study.struct.constant.base.ReferenceKindEnum;

public class MethodHandleConstant extends Constant {
    /**
     * (1字节) 常量类型标志
     * @see ConstantTagEnum
     */
    public byte tag = ConstantTagEnum.MethodHandle.value;

    /**
     * (1字节) 方法句柄类型，值在1到9之间
     * @see ReferenceKindEnum
     */
    public byte referenceKind;

    /**
     * (2字节) 常量池的有效索引
     * 根据不同的referenceKind，指向不同的常量类型
     */
    public short referenceIndex;
}
