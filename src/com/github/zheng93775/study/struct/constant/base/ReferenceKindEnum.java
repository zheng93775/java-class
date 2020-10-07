package com.github.zheng93775.study.struct.constant.base;

import com.github.zheng93775.study.struct.constant.FieldRefConstant;
import com.github.zheng93775.study.struct.constant.InterfaceMethodRefConstant;
import com.github.zheng93775.study.struct.constant.MethodRefConstant;

public enum ReferenceKindEnum {
    REF_getField(1, FieldRefConstant.class),
    REF_getStatic(2, FieldRefConstant.class),
    REF_putField(3, FieldRefConstant.class),
    REF_putStatic(4, FieldRefConstant.class),
    REF_invokeVirtual(5, MethodRefConstant.class),
    REF_invokeStatic(6, MethodRefConstant.class),
    REF_invokeSpecial(7, MethodRefConstant.class),
    REF_newInvokeSpecial(8, MethodRefConstant.class),
    REF_invokeInterface(9, InterfaceMethodRefConstant.class),
    ;
    public byte value;
    public Class<? extends Constant> referenceType;
    ReferenceKindEnum(int value, Class<? extends Constant> referenceType) {
        this.value = (byte) value;
        this.referenceType = referenceType;
    }
}
