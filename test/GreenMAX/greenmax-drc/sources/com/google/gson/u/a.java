package com.google.gson.u;

import com.google.gson.t.b;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TypeToken.java */
/* loaded from: classes2.dex */
public class a<T> {
    final int hashCode;
    final Class<? super T> rawType;
    final Type type;

    /* JADX INFO: Access modifiers changed from: protected */
    public a() {
        Type superclassTypeParameter = getSuperclassTypeParameter(getClass());
        this.type = superclassTypeParameter;
        this.rawType = (Class<? super T>) b.k(superclassTypeParameter);
        this.hashCode = superclassTypeParameter.hashCode();
    }

    private static AssertionError buildUnexpectedTypeError(Type type, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder("Unexpected type. Expected one of: ");
        for (Class<?> cls : clsArr) {
            sb.append(cls.getName());
            sb.append(", ");
        }
        sb.append("but got: ");
        sb.append(type.getClass().getName());
        sb.append(", for type token: ");
        sb.append(type.toString());
        sb.append('.');
        return new AssertionError(sb.toString());
    }

    public static a<?> get(Type type) {
        return new a<>(type);
    }

    public static a<?> getArray(Type type) {
        return new a<>(b.a(type));
    }

    public static a<?> getParameterized(Type type, Type... typeArr) {
        return new a<>(b.o(null, type, typeArr));
    }

    static Type getSuperclassTypeParameter(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return b.b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    private static boolean matches(Type type, Type type2, Map<String, Type> map) {
        return type2.equals(type) || ((type instanceof TypeVariable) && type2.equals(map.get(((TypeVariable) type).getName())));
    }

    private static boolean typeEquals(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map<String, Type> map) {
        if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            return false;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
        for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
            if (!matches(actualTypeArguments[i2], actualTypeArguments2[i2], map)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b.f(this.type, ((a) obj).type);
    }

    public final Class<? super T> getRawType() {
        return this.rawType;
    }

    public final Type getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.hashCode;
    }

    @Deprecated
    public boolean isAssignableFrom(Class<?> cls) {
        return isAssignableFrom((Type) cls);
    }

    public final String toString() {
        return b.u(this.type);
    }

    public static <T> a<T> get(Class<T> cls) {
        return new a<>(cls);
    }

    @Deprecated
    public boolean isAssignableFrom(Type type) {
        if (type == null) {
            return false;
        }
        if (this.type.equals(type)) {
            return true;
        }
        Type type2 = this.type;
        if (type2 instanceof Class) {
            return this.rawType.isAssignableFrom(b.k(type));
        }
        if (type2 instanceof ParameterizedType) {
            return isAssignableFrom(type, (ParameterizedType) type2, new HashMap());
        }
        if (type2 instanceof GenericArrayType) {
            return this.rawType.isAssignableFrom(b.k(type)) && isAssignableFrom(type, (GenericArrayType) this.type);
        }
        throw buildUnexpectedTypeError(type2, Class.class, ParameterizedType.class, GenericArrayType.class);
    }

    a(Type type) {
        Type b2 = b.b((Type) com.google.gson.t.a.b(type));
        this.type = b2;
        this.rawType = (Class<? super T>) b.k(b2);
        this.hashCode = b2.hashCode();
    }

    @Deprecated
    public boolean isAssignableFrom(a<?> aVar) {
        return isAssignableFrom(aVar.getType());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v9 */
    private static boolean isAssignableFrom(Type type, GenericArrayType genericArrayType) {
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (!(genericComponentType instanceof ParameterizedType)) {
            return true;
        }
        if (type instanceof GenericArrayType) {
            type = ((GenericArrayType) type).getGenericComponentType();
        } else if (type instanceof Class) {
            type = (Class) type;
            while (type.isArray()) {
                type = type.getComponentType();
            }
        }
        return isAssignableFrom(type, (ParameterizedType) genericComponentType, new HashMap());
    }

    private static boolean isAssignableFrom(Type type, ParameterizedType parameterizedType, Map<String, Type> map) {
        if (type == null) {
            return false;
        }
        if (parameterizedType.equals(type)) {
            return true;
        }
        Class<?> k2 = b.k(type);
        ParameterizedType parameterizedType2 = type instanceof ParameterizedType ? (ParameterizedType) type : null;
        if (parameterizedType2 != null) {
            Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
            TypeVariable<Class<?>>[] typeParameters = k2.getTypeParameters();
            for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                Type type2 = actualTypeArguments[i2];
                TypeVariable<Class<?>> typeVariable = typeParameters[i2];
                while (type2 instanceof TypeVariable) {
                    type2 = map.get(((TypeVariable) type2).getName());
                }
                map.put(typeVariable.getName(), type2);
            }
            if (typeEquals(parameterizedType2, parameterizedType, map)) {
                return true;
            }
        }
        for (Type type3 : k2.getGenericInterfaces()) {
            if (isAssignableFrom(type3, parameterizedType, new HashMap(map))) {
                return true;
            }
        }
        return isAssignableFrom(k2.getGenericSuperclass(), parameterizedType, new HashMap(map));
    }
}
