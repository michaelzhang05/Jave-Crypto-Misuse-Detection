package com.mbridge.msdk.dycreator.bus;

import java.lang.reflect.Method;

/* loaded from: classes4.dex */
final class SubscriberMethod {

    /* renamed from: a, reason: collision with root package name */
    final Method f19722a;

    /* renamed from: b, reason: collision with root package name */
    final ThreadMode f19723b;

    /* renamed from: c, reason: collision with root package name */
    final Class<?> f19724c;

    /* renamed from: d, reason: collision with root package name */
    String f19725d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SubscriberMethod(Method method, ThreadMode threadMode, Class<?> cls) {
        this.f19722a = method;
        this.f19723b = threadMode;
        this.f19724c = cls;
    }

    private synchronized void a() {
        if (this.f19725d == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f19722a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f19722a.getName());
            sb.append('(');
            sb.append(this.f19724c.getName());
            this.f19725d = sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SubscriberMethod) {
            a();
            return this.f19725d.equals(((SubscriberMethod) obj).f19725d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19722a.hashCode();
    }
}
