package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class TypeBase extends JavaType implements JsonSerializable {
    private static final TypeBindings NO_BINDINGS = TypeBindings.emptyBindings();
    private static final JavaType[] NO_TYPES = new JavaType[0];
    protected final TypeBindings _bindings;
    volatile transient String _canonicalName;
    protected final JavaType _superClass;
    protected final JavaType[] _superInterfaces;

    /* JADX INFO: Access modifiers changed from: protected */
    public TypeBase(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, int i2, Object obj, Object obj2, boolean z) {
        super(cls, i2, obj, obj2, z);
        this._bindings = typeBindings == null ? NO_BINDINGS : typeBindings;
        this._superClass = javaType;
        this._superInterfaces = javaTypeArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static StringBuilder _classSignature(Class<?> cls, StringBuilder sb, boolean z) {
        if (cls.isPrimitive()) {
            if (cls == Boolean.TYPE) {
                sb.append('Z');
            } else if (cls == Byte.TYPE) {
                sb.append('B');
            } else if (cls == Short.TYPE) {
                sb.append('S');
            } else if (cls == Character.TYPE) {
                sb.append('C');
            } else if (cls == Integer.TYPE) {
                sb.append('I');
            } else if (cls == Long.TYPE) {
                sb.append('J');
            } else if (cls == Float.TYPE) {
                sb.append('F');
            } else if (cls == Double.TYPE) {
                sb.append('D');
            } else if (cls == Void.TYPE) {
                sb.append('V');
            } else {
                throw new IllegalStateException("Unrecognized primitive type: " + cls.getName());
            }
        } else {
            sb.append('L');
            String name = cls.getName();
            int length = name.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = name.charAt(i2);
                if (charAt == '.') {
                    charAt = '/';
                }
                sb.append(charAt);
            }
            if (z) {
                sb.append(';');
            }
        }
        return sb;
    }

    protected String buildCanonicalName() {
        return this._class.getName();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType containedType(int i2) {
        return this._bindings.getBoundType(i2);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public int containedTypeCount() {
        return this._bindings.size();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType findSuperType(Class<?> cls) {
        JavaType findSuperType;
        JavaType[] javaTypeArr;
        if (cls == this._class) {
            return this;
        }
        if (cls.isInterface() && (javaTypeArr = this._superInterfaces) != null) {
            int length = javaTypeArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                JavaType findSuperType2 = this._superInterfaces[i2].findSuperType(cls);
                if (findSuperType2 != null) {
                    return findSuperType2;
                }
            }
        }
        JavaType javaType = this._superClass;
        if (javaType == null || (findSuperType = javaType.findSuperType(cls)) == null) {
            return null;
        }
        return findSuperType;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public TypeBindings getBindings() {
        return this._bindings;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public List<JavaType> getInterfaces() {
        JavaType[] javaTypeArr = this._superInterfaces;
        if (javaTypeArr == null) {
            return Collections.emptyList();
        }
        int length = javaTypeArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        if (length != 1) {
            return Arrays.asList(javaTypeArr);
        }
        return Collections.singletonList(javaTypeArr[0]);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType getSuperClass() {
        return this._superClass;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable
    public void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        jsonGenerator.writeString(toCanonical());
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable
    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException, JsonProcessingException {
        typeSerializer.writeTypePrefixForScalar(this, jsonGenerator);
        serialize(jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffixForScalar(this, jsonGenerator);
    }

    @Override // com.fasterxml.jackson.core.type.ResolvedType
    public String toCanonical() {
        String str = this._canonicalName;
        return str == null ? buildCanonicalName() : str;
    }
}
