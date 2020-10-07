package com.github.zheng93775.study.struct.constant;

import com.github.zheng93775.study.struct.BootstrapMethodStruct;
import com.github.zheng93775.study.struct.common.Byte2;
import com.github.zheng93775.study.struct.constant.base.Constant;
import com.github.zheng93775.study.struct.constant.base.ConstantTagEnum;

public class DynamicConstant extends Constant {
    /**
     * (1字节) 常量类型标志
     * @see ConstantTagEnum
     */
    public byte tag = ConstantTagEnum.Dynamic.value;

    /**
     * (2字节) 指向方法引导表 bootstrap_methods[] 数组的有效索引
     */
    public Byte2<BootstrapMethodStruct> bootstrapMethodIndex;

    /**
     * (2字节) 指向方法名和方法描述符 NameAndType 类型常量的索引
     */
    public Byte2<NameAndTypeConstant> nameAndTypeIndex;
}
