package com.github.zheng93775.study.struct;

public class FieldsStruct {
    /**
     * (2字节) 字段数量
     */
    public short fieldsCount;

    /**
     * 长度为 fieldsCount 的字段列表
     */
    public FieldStruct[] fields = new FieldStruct[fieldsCount];
}
