package p3;

import java.security.GeneralSecurityException;
import t3.j0;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8873a = new k().d();

    /* renamed from: b, reason: collision with root package name */
    public static final j0 f8874b;

    /* renamed from: c, reason: collision with root package name */
    public static final j0 f8875c;

    /* renamed from: d, reason: collision with root package name */
    public static final j0 f8876d;

    static {
        j0 V = j0.V();
        f8874b = V;
        f8875c = V;
        f8876d = V;
        try {
            a();
        } catch (GeneralSecurityException e6) {
            throw new ExceptionInInitializerError(e6);
        }
    }

    public static void a() {
        b();
    }

    public static void b() {
        r.f();
        h.d();
        k.p(true);
        if (k3.a.a()) {
            return;
        }
        c.o(true);
    }
}
