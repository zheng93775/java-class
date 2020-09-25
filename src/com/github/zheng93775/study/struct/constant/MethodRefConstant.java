package com.github.zheng93775.study.struct.constant;

import com.github.zheng93775.study.struct.base.Byte2;

public class MethodRefConstant extends Constant {
    /**
     * (1字节) 常量类型标志
     * @see ConstantTagEnum
     */
    public byte tag = ConstantTagEnum.MethodRef.value;

    /**
     * (2字节) 指向声明方法的类描述符Class的索引
     */
    public Byte2<ClassConstant> classIndex;

    /**
     * (2字节) 指向名称及类型描述符NameAndType的索引
     */
    public Byte2<NameAndTypeConstant> typeIndex;
}
