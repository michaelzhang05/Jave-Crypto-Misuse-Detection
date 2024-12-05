package kotlin.reflect.jvm.internal.impl.descriptors.r1.b;

import java.lang.reflect.Method;

/* compiled from: ReflectJavaRecordComponent.kt */
/* loaded from: classes2.dex */
final class a {
    public static final a a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static C0371a f21818b;

    /* compiled from: ReflectJavaRecordComponent.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0371a {
        private final Method a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f21819b;

        public C0371a(Method method, Method method2) {
            this.a = method;
            this.f21819b = method2;
        }

        public final Method a() {
            return this.f21819b;
        }

        public final Method b() {
            return this.a;
        }
    }

    private a() {
    }

    private final C0371a a(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new C0371a(cls.getMethod("getType", new Class[0]), cls.getMethod("getAccessor", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new C0371a(null, null);
        }
    }

    private final C0371a b(Object obj) {
        C0371a c0371a = f21818b;
        if (c0371a != null) {
            return c0371a;
        }
        C0371a a2 = a(obj);
        f21818b = a2;
        return a2;
    }

    public final Method c(Object obj) {
        kotlin.jvm.internal.l.f(obj, "recordComponent");
        Method a2 = b(obj).a();
        if (a2 == null) {
            return null;
        }
        Object invoke = a2.invoke(obj, new Object[0]);
        kotlin.jvm.internal.l.d(invoke, "null cannot be cast to non-null type java.lang.reflect.Method");
        return (Method) invoke;
    }

    public final Class<?> d(Object obj) {
        kotlin.jvm.internal.l.f(obj, "recordComponent");
        Method b2 = b(obj).b();
        if (b2 == null) {
            return null;
        }
        Object invoke = b2.invoke(obj, new Object[0]);
        kotlin.jvm.internal.l.d(invoke, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) invoke;
    }
}
