package com.github.zheng93775.study.struct.constant;

import com.github.zheng93775.study.struct.common.Byte2;
import com.github.zheng93775.study.struct.constant.base.Constant;
import com.github.zheng93775.study.struct.constant.base.ConstantTagEnum;

public class NameAndTypeConstant extends Constant {
    /**
     * (1字节) 常量类型标志
     * @see ConstantTagEnum
     */
    public byte tag = ConstantTagEnum.NameAndType.value;

    /**
     * (2字节) 指向声明字段的类或者接口名称Utf8字符串的索引
     */
    public Byte2<Utf8Constant> nameIndex;

    /**
     * (2字节) 指向声明字段的类或者接口描述符Utf8字符串的索引
     */
    public Byte2<Utf8Constant> typeIndex;
}
