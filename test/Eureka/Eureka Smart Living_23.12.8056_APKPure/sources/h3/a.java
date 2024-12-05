package h3;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6815a = new e().d();

    /* renamed from: b, reason: collision with root package name */
    public static final String f6816b = new p().d();

    /* renamed from: c, reason: collision with root package name */
    public static final String f6817c = new u().d();

    /* renamed from: d, reason: collision with root package name */
    public static final String f6818d = new h().d();

    /* renamed from: e, reason: collision with root package name */
    public static final String f6819e = new d0().d();

    /* renamed from: f, reason: collision with root package name */
    public static final String f6820f = new f0().d();

    /* renamed from: g, reason: collision with root package name */
    public static final String f6821g = new z().d();

    /* renamed from: h, reason: collision with root package name */
    public static final String f6822h = new h0().d();

    /* renamed from: i, reason: collision with root package name */
    public static final t3.j0 f6823i;

    /* renamed from: j, reason: collision with root package name */
    public static final t3.j0 f6824j;

    /* renamed from: k, reason: collision with root package name */
    public static final t3.j0 f6825k;

    static {
        t3.j0 V = t3.j0.V();
        f6823i = V;
        f6824j = V;
        f6825k = V;
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
        d.e();
        p3.o.b();
        e.p(true);
        p.o(true);
        if (k3.a.a()) {
            return;
        }
        h.o(true);
        u.p(true);
        z.m(true);
        d0.m(true);
        f0.m(true);
        h0.m(true);
    }
}
