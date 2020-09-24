package com.github.zheng93775.study.struct.constant;

public class Utf8Constant extends Constant {
    /**
     * (1字节) 常量类型标志
     * @see ConstantTagEnum
     */
    public byte tag = ConstantTagEnum.Utf8.value;

    /**
     * (2字节) utf8字符串长度的字节数
     */
    public short length;

    /**
     * (length字节) UTF-8编码表示的字符串
     */
    public byte[] bytes = new byte[this.length];
}
