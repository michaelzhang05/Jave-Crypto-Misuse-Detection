package com.mbridge.msdk.mbsignalcommon.c;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static InterfaceC0405a f21548a;

    /* renamed from: com.mbridge.msdk.mbsignalcommon.c.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0405a {
        boolean a(b.C0406a c0406a);
    }

    /* loaded from: classes4.dex */
    public static abstract class b {

        /* renamed from: com.mbridge.msdk.mbsignalcommon.c.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0406a extends Throwable {

            /* renamed from: a, reason: collision with root package name */
            private Class<?> f21549a;

            /* renamed from: b, reason: collision with root package name */
            private String f21550b;

            public C0406a(String str) {
                super(str);
            }

            public final void a(Class<?> cls) {
                this.f21549a = cls;
            }

            @Override // java.lang.Throwable
            public final String toString() {
                if (getCause() != null) {
                    return C0406a.class.getName() + ": " + getCause();
                }
                return super.toString();
            }

            public C0406a(Exception exc) {
                super(exc);
            }

            public final void a(String str) {
                this.f21550b = str;
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class c<C> {

        /* renamed from: a, reason: collision with root package name */
        protected Class<C> f21551a;

        public c(Class<C> cls) {
            this.f21551a = cls;
        }

        public final d a(String str, Class<?>... clsArr) throws b.C0406a {
            return new d(this.f21551a, str, clsArr, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(b.C0406a c0406a) throws b.C0406a {
        InterfaceC0405a interfaceC0405a = f21548a;
        if (interfaceC0405a != null) {
            if (interfaceC0405a.a(c0406a)) {
                return;
            } else {
                throw c0406a;
            }
        }
        throw c0406a;
    }

    public static <T> c<T> a(ClassLoader classLoader, String str) throws b.C0406a {
        try {
            return new c<>(classLoader.loadClass(str));
        } catch (Exception e8) {
            b(new b.C0406a(e8));
            return new c<>(null);
        }
    }

    /* loaded from: classes4.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        protected final Method f21552a;

        d(Class<?> cls, String str, Class<?>[] clsArr, int i8) throws b.C0406a {
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
                            b.C0406a c0406a = new b.C0406a(e10);
                            c0406a.a(cls);
                            c0406a.a(str);
                            a.b(c0406a);
                        }
                    } finally {
                        this.f21552a = method;
                    }
                }
            }
            if (method != null) {
                if (i8 > 0 && (method.getModifiers() & i8) != i8) {
                    a.b(new b.C0406a(method + " does not match modifiers: " + i8));
                }
                method.setAccessible(true);
            }
        }

        public final Object a(Object obj, Object... objArr) throws IllegalArgumentException, InvocationTargetException {
            Method method = this.f21552a;
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
            return this.f21552a;
        }
    }
}
