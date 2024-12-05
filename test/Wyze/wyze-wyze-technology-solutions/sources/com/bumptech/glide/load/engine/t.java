package com.bumptech.glide.load.engine;

import com.bumptech.glide.r.l.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LockedResource.java */
/* loaded from: classes.dex */
public final class t<Z> implements u<Z>, a.f {

    /* renamed from: f, reason: collision with root package name */
    private static final c.h.j.g<t<?>> f8600f = com.bumptech.glide.r.l.a.d(20, new a());

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.r.l.c f8601g = com.bumptech.glide.r.l.c.a();

    /* renamed from: h, reason: collision with root package name */
    private u<Z> f8602h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8603i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f8604j;

    /* compiled from: LockedResource.java */
    /* loaded from: classes.dex */
    class a implements a.d<t<?>> {
        a() {
        }

        @Override // com.bumptech.glide.r.l.a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public t<?> a() {
            return new t<>();
        }
    }

    t() {
    }

    private void a(u<Z> uVar) {
        this.f8604j = false;
        this.f8603i = true;
        this.f8602h = uVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <Z> t<Z> b(u<Z> uVar) {
        t<Z> tVar = (t) com.bumptech.glide.r.j.d(f8600f.b());
        tVar.a(uVar);
        return tVar;
    }

    private void f() {
        this.f8602h = null;
        f8600f.a(this);
    }

    @Override // com.bumptech.glide.load.engine.u
    public synchronized void c() {
        this.f8601g.c();
        this.f8604j = true;
        if (!this.f8603i) {
            this.f8602h.c();
            f();
        }
    }

    @Override // com.bumptech.glide.load.engine.u
    public int d() {
        return this.f8602h.d();
    }

    @Override // com.bumptech.glide.load.engine.u
    public Class<Z> e() {
        return this.f8602h.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void g() {
        this.f8601g.c();
        if (this.f8603i) {
            this.f8603i = false;
            if (this.f8604j) {
                c();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    @Override // com.bumptech.glide.load.engine.u
    public Z get() {
        return this.f8602h.get();
    }

    @Override // com.bumptech.glide.r.l.a.f
    public com.bumptech.glide.r.l.c n() {
        return this.f8601g;
    }
}
