package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;

/* loaded from: classes2.dex */
public abstract class TypeIdResolverBase implements TypeIdResolver {
    protected final JavaType _baseType;
    protected final TypeFactory _typeFactory;

    /* JADX INFO: Access modifiers changed from: protected */
    public TypeIdResolverBase(JavaType javaType, TypeFactory typeFactory) {
        this._baseType = javaType;
        this._typeFactory = typeFactory;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public String idFromBaseType() {
        return idFromValueAndType(null, this._baseType.getRawClass());
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public void init(JavaType javaType) {
    }
}
