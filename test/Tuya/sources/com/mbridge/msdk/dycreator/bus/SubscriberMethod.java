package com.mbridge.msdk.dycreator.bus;

import java.lang.reflect.Method;

/* loaded from: classes4.dex */
final class SubscriberMethod {

    /* renamed from: a, reason: collision with root package name */
    final Method f18667a;

    /* renamed from: b, reason: collision with root package name */
    final ThreadMode f18668b;

    /* renamed from: c, reason: collision with root package name */
    final Class<?> f18669c;

    /* renamed from: d, reason: collision with root package name */
    String f18670d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SubscriberMethod(Method method, ThreadMode threadMode, Class<?> cls) {
        this.f18667a = method;
        this.f18668b = threadMode;
        this.f18669c = cls;
    }

    private synchronized void a() {
        if (this.f18670d == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f18667a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f18667a.getName());
            sb.append('(');
            sb.append(this.f18669c.getName());
            this.f18670d = sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SubscriberMethod) {
            a();
            return this.f18670d.equals(((SubscriberMethod) obj).f18670d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18667a.hashCode();
    }
}
