package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f18829a = c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends m {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f18830b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f18831c;

        a(Method method, Object obj) {
            this.f18830b = method;
            this.f18831c = obj;
        }

        @Override // com.google.gson.internal.m
        public Object d(Class cls) {
            m.b(cls);
            return this.f18830b.invoke(this.f18831c, cls);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends m {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f18832b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f18833c;

        b(Method method, int i8) {
            this.f18832b = method;
            this.f18833c = i8;
        }

        @Override // com.google.gson.internal.m
        public Object d(Class cls) {
            m.b(cls);
            return this.f18832b.invoke(null, cls, Integer.valueOf(this.f18833c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends m {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f18834b;

        c(Method method) {
            this.f18834b = method;
        }

        @Override // com.google.gson.internal.m
        public Object d(Class cls) {
            m.b(cls);
            return this.f18834b.invoke(null, cls, Object.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d extends m {
        d() {
        }

        @Override // com.google.gson.internal.m
        public Object d(Class cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Class cls) {
        String a8 = com.google.gson.internal.c.a(cls);
        if (a8 == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + a8);
    }

    private static m c() {
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod.setAccessible(true);
                    return new c(declaredMethod);
                }
            } catch (Exception unused2) {
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod2.setAccessible(true);
                int intValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
                Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod3.setAccessible(true);
                return new b(declaredMethod3, intValue);
            }
        } catch (Exception unused3) {
            return new d();
        }
    }

    public abstract Object d(Class cls);
}
