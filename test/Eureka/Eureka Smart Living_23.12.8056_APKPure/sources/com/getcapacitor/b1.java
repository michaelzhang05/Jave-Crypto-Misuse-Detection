package com.getcapacitor;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class b1 {

    /* renamed from: a, reason: collision with root package name */
    private final Method f4273a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4274b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4275c;

    public b1(Method method, a1 a1Var) {
        this.f4273a = method;
        this.f4274b = method.getName();
        this.f4275c = a1Var.returnType();
    }

    public Method a() {
        return this.f4273a;
    }

    public String b() {
        return this.f4274b;
    }

    public String c() {
        return this.f4275c;
    }
}
