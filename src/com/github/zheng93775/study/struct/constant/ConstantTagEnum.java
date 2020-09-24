package com.github.zheng93775.study.struct.constant;

/**
 * 常量类型枚举
 */
public enum ConstantTagEnum {
    Utf8(1, "UTF-8编码的字符串"),
    Integer(3, "整型字面量"),
    Float(4, "浮点型字面量"),
    Long(5, "长整型字面量"),
    Double(6, "双精度浮点型字面量"),
    Class(7, "类或接口的符号引用"),
    String(8, "字符串类型字面量"),
    FieldRef(9, "字段的符号引用"),
    MethodRef(10, "类中方法的符号引用"),
    InterfaceMethodRef(11, "接口中方法的符号引用"),
    NameAndType(12, "字段或方法的部分符号引用"),
    MethodHandle(15, "表示方法句柄"),
    MethodType(16, "表示方法类型"),
    Dynamic(17, "表示一个动态计算常量"),
    InvokeDynamic(18, "表示一个动态方法调用点"),
    Module(19, "表示一个模块"),
    Package(20, "表示一个模块中开放或导出的包"),
    ;
    public byte value;
    public String description;

    ConstantTagEnum(int value, String description) {
        this.value = (byte) value;
        this.description = description;
    }
}
