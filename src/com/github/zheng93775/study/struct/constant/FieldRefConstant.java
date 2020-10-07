package com.github.zheng93775.study.struct.constant;

import com.github.zheng93775.study.struct.common.Byte2;
import com.github.zheng93775.study.struct.constant.base.Constant;
import com.github.zheng93775.study.struct.constant.base.ConstantTagEnum;

public class FieldRefConstant extends Constant {
    /**
     * (1字节) 常量类型标志
     * @see ConstantTagEnum
     */
    public byte tag = ConstantTagEnum.FieldRef.value;

    /**
     * (2字节) 指向声明字段的类或者接口描述符Class的索引
     */
    public Byte2<ClassConstant> classIndex;

    /**
     * (2字节) 指向字段描述符NameAndType的索引
     */
    public Byte2<NameAndTypeConstant> typeIndex;
}
