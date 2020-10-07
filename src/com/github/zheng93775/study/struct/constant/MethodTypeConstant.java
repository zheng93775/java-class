package com.github.zheng93775.study.struct.constant;

import com.github.zheng93775.study.struct.common.Byte2;
import com.github.zheng93775.study.struct.constant.base.Constant;
import com.github.zheng93775.study.struct.constant.base.ConstantTagEnum;
import com.github.zheng93775.study.struct.constant.base.ReferenceKindEnum;

public class MethodTypeConstant extends Constant {
    /**
     * (1字节) 常量类型标志
     * @see ConstantTagEnum
     */
    public byte tag = ConstantTagEnum.MethodType.value;

    /**
     * (2字节) 指向方法描述符Utf8字符串的索引
     */
    public Byte2<Utf8Constant> descriptorIndex;
}
