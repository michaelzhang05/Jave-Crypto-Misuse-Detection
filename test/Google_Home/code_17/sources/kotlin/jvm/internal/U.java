package kotlin.jvm.internal;

import h6.InterfaceC2963c;
import h6.InterfaceC2964d;
import h6.InterfaceC2965e;
import h6.InterfaceC2967g;
import h6.InterfaceC2968h;

/* loaded from: classes5.dex */
public abstract class U {

    /* renamed from: a, reason: collision with root package name */
    private static final V f34163a;

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2963c[] f34164b;

    static {
        V v8 = null;
        try {
            v8 = (V) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (v8 == null) {
            v8 = new V();
        }
        f34163a = v8;
        f34164b = new InterfaceC2963c[0];
    }

    public static InterfaceC2965e a(AbstractC3251u abstractC3251u) {
        return f34163a.a(abstractC3251u);
    }

    public static InterfaceC2963c b(Class cls) {
        return f34163a.b(cls);
    }

    public static InterfaceC2964d c(Class cls) {
        return f34163a.c(cls, "");
    }

    public static InterfaceC2967g d(B b8) {
        return f34163a.d(b8);
    }

    public static InterfaceC2968h e(D d8) {
        return f34163a.e(d8);
    }

    public static h6.j f(H h8) {
        return f34163a.f(h8);
    }

    public static h6.k g(J j8) {
        return f34163a.g(j8);
    }

    public static h6.l h(L l8) {
        return f34163a.h(l8);
    }

    public static String i(InterfaceC3250t interfaceC3250t) {
        return f34163a.i(interfaceC3250t);
    }

    public static String j(AbstractC3256z abstractC3256z) {
        return f34163a.j(abstractC3256z);
    }
}
