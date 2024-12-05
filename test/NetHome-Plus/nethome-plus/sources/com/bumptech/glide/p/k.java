package com.bumptech.glide.p;

/* compiled from: ThumbnailRequestCoordinator.java */
/* loaded from: classes.dex */
public class k implements e, d {

    /* renamed from: f, reason: collision with root package name */
    private final e f8918f;

    /* renamed from: g, reason: collision with root package name */
    private d f8919g;

    /* renamed from: h, reason: collision with root package name */
    private d f8920h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8921i;

    k() {
        this(null);
    }

    private boolean n() {
        e eVar = this.f8918f;
        return eVar == null || eVar.m(this);
    }

    private boolean o() {
        e eVar = this.f8918f;
        return eVar == null || eVar.g(this);
    }

    private boolean p() {
        e eVar = this.f8918f;
        return eVar == null || eVar.j(this);
    }

    private boolean q() {
        e eVar = this.f8918f;
        return eVar != null && eVar.b();
    }

    @Override // com.bumptech.glide.p.e
    public void a(d dVar) {
        e eVar;
        if (dVar.equals(this.f8919g) && (eVar = this.f8918f) != null) {
            eVar.a(this);
        }
    }

    @Override // com.bumptech.glide.p.e
    public boolean b() {
        return q() || f();
    }

    @Override // com.bumptech.glide.p.d
    public void c() {
        this.f8919g.c();
        this.f8920h.c();
    }

    @Override // com.bumptech.glide.p.d
    public void clear() {
        this.f8921i = false;
        this.f8920h.clear();
        this.f8919g.clear();
    }

    @Override // com.bumptech.glide.p.d
    public void d() {
        this.f8921i = true;
        if (!this.f8919g.l() && !this.f8920h.isRunning()) {
            this.f8920h.d();
        }
        if (!this.f8921i || this.f8919g.isRunning()) {
            return;
        }
        this.f8919g.d();
    }

    @Override // com.bumptech.glide.p.d
    public boolean e(d dVar) {
        if (!(dVar instanceof k)) {
            return false;
        }
        k kVar = (k) dVar;
        d dVar2 = this.f8919g;
        if (dVar2 == null) {
            if (kVar.f8919g != null) {
                return false;
            }
        } else if (!dVar2.e(kVar.f8919g)) {
            return false;
        }
        d dVar3 = this.f8920h;
        d dVar4 = kVar.f8920h;
        if (dVar3 == null) {
            if (dVar4 != null) {
                return false;
            }
        } else if (!dVar3.e(dVar4)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.p.d
    public boolean f() {
        return this.f8919g.f() || this.f8920h.f();
    }

    @Override // com.bumptech.glide.p.e
    public boolean g(d dVar) {
        return o() && dVar.equals(this.f8919g) && !b();
    }

    @Override // com.bumptech.glide.p.d
    public boolean h() {
        return this.f8919g.h();
    }

    @Override // com.bumptech.glide.p.d
    public boolean i() {
        return this.f8919g.i();
    }

    @Override // com.bumptech.glide.p.d
    public boolean isRunning() {
        return this.f8919g.isRunning();
    }

    @Override // com.bumptech.glide.p.e
    public boolean j(d dVar) {
        return p() && (dVar.equals(this.f8919g) || !this.f8919g.f());
    }

    @Override // com.bumptech.glide.p.e
    public void k(d dVar) {
        if (dVar.equals(this.f8920h)) {
            return;
        }
        e eVar = this.f8918f;
        if (eVar != null) {
            eVar.k(this);
        }
        if (this.f8920h.l()) {
            return;
        }
        this.f8920h.clear();
    }

    @Override // com.bumptech.glide.p.d
    public boolean l() {
        return this.f8919g.l() || this.f8920h.l();
    }

    @Override // com.bumptech.glide.p.e
    public boolean m(d dVar) {
        return n() && dVar.equals(this.f8919g);
    }

    public void r(d dVar, d dVar2) {
        this.f8919g = dVar;
        this.f8920h = dVar2;
    }

    public k(e eVar) {
        this.f8918f = eVar;
    }
}
