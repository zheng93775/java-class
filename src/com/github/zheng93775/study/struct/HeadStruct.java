package com.github.zheng93775.study.struct;

import com.github.zheng93775.study.desc.MajorVersionEnum;

public class HeadStruct {
    /**
     * (4字节) 魔数
     * 咖啡宝贝
     */
    public int magic = 0xCAFEBABE;

    /**
     * (2字节) 次版本号
     */
    public short minorVersion;

    /**
     * (2字节) 主版本号
     * @see MajorVersionEnum
     */
    public short majorVersion;
}
