package com.github.zheng93775.study.struct.constant;

import com.github.zheng93775.study.struct.common.Byte2;
import com.github.zheng93775.study.struct.constant.base.Constant;
import com.github.zheng93775.study.struct.constant.base.ConstantTagEnum;

public class PackageConstant extends Constant {
    /**
     * (1字节) 常量类型标志
     * @see ConstantTagEnum
     */
    public byte tag = ConstantTagEnum.Package.value;

    /**
     * (2字节) 指向包名 Utf8字符串常量 的索引
     */
    public Byte2<Utf8Constant> nameIndex;
}
