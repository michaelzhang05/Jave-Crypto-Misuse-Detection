package com.google.gson.reflect;

import com.google.gson.internal.b;
import j$.util.Objects;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public class TypeToken<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Class f17806a;

    /* renamed from: b, reason: collision with root package name */
    private final Type f17807b;

    /* renamed from: c, reason: collision with root package name */
    private final int f17808c;

    /* JADX INFO: Access modifiers changed from: protected */
    public TypeToken() {
        Type e8 = e();
        this.f17807b = e8;
        this.f17806a = b.k(e8);
        this.f17808c = e8.hashCode();
    }

    public static TypeToken a(Class cls) {
        return new TypeToken(cls);
    }

    public static TypeToken b(Type type) {
        return new TypeToken(type);
    }

    private Type e() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == TypeToken.class) {
                return b.b(parameterizedType.getActualTypeArguments()[0]);
            }
        } else if (genericSuperclass == TypeToken.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public final Class c() {
        return this.f17806a;
    }

    public final Type d() {
        return this.f17807b;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof TypeToken) && b.f(this.f17807b, ((TypeToken) obj).f17807b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17808c;
    }

    public final String toString() {
        return b.t(this.f17807b);
    }

    private TypeToken(Type type) {
        Objects.requireNonNull(type);
        Type b8 = b.b(type);
        this.f17807b = b8;
        this.f17806a = b.k(b8);
        this.f17808c = b8.hashCode();
    }
}