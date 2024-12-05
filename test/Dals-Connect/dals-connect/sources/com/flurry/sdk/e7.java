package com.flurry.sdk;

/* loaded from: classes2.dex */
public final class e7 {
    private static e7 a;

    /* renamed from: d, reason: collision with root package name */
    public q f9839d = new q();

    /* renamed from: e, reason: collision with root package name */
    public s f9840e = new s();

    /* renamed from: f, reason: collision with root package name */
    public j0 f9841f = new j0();

    /* renamed from: g, reason: collision with root package name */
    public c f9842g = new c();
    public o n = new o(this.f9839d);

    /* renamed from: j, reason: collision with root package name */
    public h7 f9845j = new h7(this.f9839d);

    /* renamed from: h, reason: collision with root package name */
    public h f9843h = new h(this.f9845j);

    /* renamed from: b, reason: collision with root package name */
    public u f9837b = new u(this.f9845j);

    /* renamed from: i, reason: collision with root package name */
    public d f9844i = new d(this.n, this.f9845j);

    /* renamed from: k, reason: collision with root package name */
    public y f9846k = new y(this.f9845j);

    /* renamed from: c, reason: collision with root package name */
    public w f9838c = new w(this.f9845j);
    public d0 l = new d0(this.f9845j);
    public l7 m = new l7();
    public i0 o = new i0(this.l, this.n);
    public a0 p = new a0();
    public k7 q = new k7();

    private e7() {
        this.f9837b.u();
        this.f9839d.u();
        this.f9840e.u();
        this.f9841f.u();
        this.f9842g.u();
        this.n.u();
        this.f9845j.u();
        this.f9843h.u();
        this.f9844i.u();
        this.f9846k.u();
        this.f9838c.u();
        this.l.u();
        this.m.u();
        this.o.u();
        this.p.u();
        this.q.u();
    }

    public static synchronized e7 a() {
        e7 e7Var;
        synchronized (e7.class) {
            if (a == null) {
                a = new e7();
            }
            e7Var = a;
        }
        return e7Var;
    }
}
