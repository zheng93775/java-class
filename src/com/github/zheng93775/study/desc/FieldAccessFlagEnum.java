package com.github.zheng93775.study.desc;

public enum FieldAccessFlagEnum {
    /**
     * 字段是否 public
     */
    ACC_PUBLIC(0x0001),

    /**
     * 字段是否 private
     */
    ACC_PRIVATE(0x0002),

    /**
     * 字段是否 protected
     */
    ACC_PROTECTED(0x0004),

    /**
     * 字段是否 static
     */
    ACC_STATIC(0x0008),

    /**
     * 字段是否 final
     */
    ACC_FINAL(0x0010),

    /**
     * 字段是否 volatile
     */
    ACC_VOLATILE(0x0040),

    /**
     * 字段是否 transient
     */
    ACC_TRANSIENT(0x0080),

    /**
     * 字段是否由编译器自动产生
     */
    ACC_SYNTHETIC(0x1000),

    /**
     * 字段是否 enum
     */
    ACC_ENUM(0x4000),
    ;
    public short value;
    FieldAccessFlagEnum(int value) {
        this.value = (short) value;
    }
}
