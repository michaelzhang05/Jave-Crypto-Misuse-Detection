package com.mbridge.msdk.mbsignalcommon.c;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static InterfaceC0409a f20493a;

    /* renamed from: com.mbridge.msdk.mbsignalcommon.c.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0409a {
        boolean a(b.C0410a c0410a);
    }

    /* loaded from: classes4.dex */
    public static abstract class b {

        /* renamed from: com.mbridge.msdk.mbsignalcommon.c.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0410a extends Throwable {

            /* renamed from: a, reason: collision with root package name */
            private Class<?> f20494a;

            /* renamed from: b, reason: collision with root package name */
            private String f20495b;

            public C0410a(String str) {
                super(str);
            }

            public final void a(Class<?> cls) {
                this.f20494a = cls;
            }

            @Override // java.lang.Throwable
            public final String toString() {
                if (getCause() != null) {
                    return C0410a.class.getName() + ": " + getCause();
                }
                return super.toString();
            }

            public C0410a(Exception exc) {
                super(exc);
            }

            public final void a(String str) {
                this.f20495b = str;
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class c<C> {

        /* renamed from: a, reason: collision with root package name */
        protected Class<C> f20496a;

        public c(Class<C> cls) {
            this.f20496a = cls;
        }

        public final d a(String str, Class<?>... clsArr) throws b.C0410a {
            return new d(this.f20496a, str, clsArr, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(b.C0410a c0410a) throws b.C0410a {
        InterfaceC0409a interfaceC0409a = f20493a;
        if (interfaceC0409a != null) {
            if (interfaceC0409a.a(c0410a)) {
                return;
            } else {
                throw c0410a;
            }
        }
        throw c0410a;
    }

    public static <T> c<T> a(ClassLoader classLoader, String str) throws b.C0410a {
        try {
            return new c<>(classLoader.loadClass(str));
        } catch (Exception e8) {
            b(new b.C0410a(e8));
            return new c<>(null);
        }
    }

    /* loaded from: classes4.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        protected final Method f20497a;

        d(Class<?> cls, String str, Class<?>[] clsArr, int i8) throws b.C0410a {
            Method method = null;
            if (cls == null) {
                return;
            }
            while (cls != Object.class && cls != null) {
                try {
                    method = cls.getDeclaredMethod(str, clsArr);
                    break;
                } catch (NoSuchMethodException e8) {
                    if (MBridgeConstans.DEBUG && cls.getSuperclass() == Object.class) {
                        e8.printStackTrace();
                    }
                    cls = cls.getSuperclass();
                } catch (SecurityException e9) {
                    try {
                        try {
                            if (MBridgeConstans.DEBUG && cls.getSuperclass() == Object.class) {
                                e9.printStackTrace();
                            }
                            cls = cls.getSuperclass();
                        } catch (Exception e10) {
                            b.C0410a c0410a = new b.C0410a(e10);
                            c0410a.a(cls);
                            c0410a.a(str);
                            a.b(c0410a);
                        }
                    } finally {
                        this.f20497a = method;
                    }
                }
            }
            if (method != null) {
                if (i8 > 0 && (method.getModifiers() & i8) != i8) {
                    a.b(new b.C0410a(method + " does not match modifiers: " + i8));
                }
                method.setAccessible(true);
            }
        }

        public final Object a(Object obj, Object... objArr) throws IllegalArgumentException, InvocationTargetException {
            Method method = this.f20497a;
            if (method == null) {
                return null;
            }
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e8) {
                ad.a("MappingedMethod", "invoke error:" + e8.getMessage());
                return null;
            }
        }

        public final Method a() {
            return this.f20497a;
        }
    }
}
