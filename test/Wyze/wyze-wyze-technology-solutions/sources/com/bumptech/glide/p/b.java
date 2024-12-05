package com.bumptech.glide.p;

/* compiled from: ErrorRequestCoordinator.java */
/* loaded from: classes.dex */
public final class b implements e, d {

    /* renamed from: f, reason: collision with root package name */
    private final e f8897f;

    /* renamed from: g, reason: collision with root package name */
    private d f8898g;

    /* renamed from: h, reason: collision with root package name */
    private d f8899h;

    public b(e eVar) {
        this.f8897f = eVar;
    }

    private boolean n(d dVar) {
        return dVar.equals(this.f8898g) || (this.f8898g.h() && dVar.equals(this.f8899h));
    }

    private boolean o() {
        e eVar = this.f8897f;
        return eVar == null || eVar.m(this);
    }

    private boolean p() {
        e eVar = this.f8897f;
        return eVar == null || eVar.g(this);
    }

    private boolean q() {
        e eVar = this.f8897f;
        return eVar == null || eVar.j(this);
    }

    private boolean r() {
        e eVar = this.f8897f;
        return eVar != null && eVar.b();
    }

    @Override // com.bumptech.glide.p.e
    public void a(d dVar) {
        if (!dVar.equals(this.f8899h)) {
            if (this.f8899h.isRunning()) {
                return;
            }
            this.f8899h.d();
        } else {
            e eVar = this.f8897f;
            if (eVar != null) {
                eVar.a(this);
            }
        }
    }

    @Override // com.bumptech.glide.p.e
    public boolean b() {
        return r() || f();
    }

    @Override // com.bumptech.glide.p.d
    public void c() {
        this.f8898g.c();
        this.f8899h.c();
    }

    @Override // com.bumptech.glide.p.d
    public void clear() {
        this.f8898g.clear();
        if (this.f8899h.isRunning()) {
            this.f8899h.clear();
        }
    }

    @Override // com.bumptech.glide.p.d
    public void d() {
        if (this.f8898g.isRunning()) {
            return;
        }
        this.f8898g.d();
    }

    @Override // com.bumptech.glide.p.d
    public boolean e(d dVar) {
        if (!(dVar instanceof b)) {
            return false;
        }
        b bVar = (b) dVar;
        return this.f8898g.e(bVar.f8898g) && this.f8899h.e(bVar.f8899h);
    }

    @Override // com.bumptech.glide.p.d
    public boolean f() {
        return (this.f8898g.h() ? this.f8899h : this.f8898g).f();
    }

    @Override // com.bumptech.glide.p.e
    public boolean g(d dVar) {
        return p() && n(dVar);
    }

    @Override // com.bumptech.glide.p.d
    public boolean h() {
        return this.f8898g.h() && this.f8899h.h();
    }

    @Override // com.bumptech.glide.p.d
    public boolean i() {
        return (this.f8898g.h() ? this.f8899h : this.f8898g).i();
    }

    @Override // com.bumptech.glide.p.d
    public boolean isRunning() {
        return (this.f8898g.h() ? this.f8899h : this.f8898g).isRunning();
    }

    @Override // com.bumptech.glide.p.e
    public boolean j(d dVar) {
        return q() && n(dVar);
    }

    @Override // com.bumptech.glide.p.e
    public void k(d dVar) {
        e eVar = this.f8897f;
        if (eVar != null) {
            eVar.k(this);
        }
    }

    @Override // com.bumptech.glide.p.d
    public boolean l() {
        return (this.f8898g.h() ? this.f8899h : this.f8898g).l();
    }

    @Override // com.bumptech.glide.p.e
    public boolean m(d dVar) {
        return o() && n(dVar);
    }

    public void s(d dVar, d dVar2) {
        this.f8898g = dVar;
        this.f8899h = dVar2;
    }
}
