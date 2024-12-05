package com.bumptech.glide.load.engine;

/* compiled from: EngineResource.java */
/* loaded from: classes.dex */
class p<Z> implements u<Z> {

    /* renamed from: f, reason: collision with root package name */
    private final boolean f8590f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f8591g;

    /* renamed from: h, reason: collision with root package name */
    private final u<Z> f8592h;

    /* renamed from: i, reason: collision with root package name */
    private a f8593i;

    /* renamed from: j, reason: collision with root package name */
    private com.bumptech.glide.load.f f8594j;

    /* renamed from: k, reason: collision with root package name */
    private int f8595k;
    private boolean l;

    /* compiled from: EngineResource.java */
    /* loaded from: classes.dex */
    interface a {
        void d(com.bumptech.glide.load.f fVar, p<?> pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(u<Z> uVar, boolean z, boolean z2) {
        this.f8592h = (u) com.bumptech.glide.r.j.d(uVar);
        this.f8590f = z;
        this.f8591g = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a() {
        if (!this.l) {
            this.f8595k++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u<Z> b() {
        return this.f8592h;
    }

    @Override // com.bumptech.glide.load.engine.u
    public synchronized void c() {
        if (this.f8595k <= 0) {
            if (!this.l) {
                this.l = true;
                if (this.f8591g) {
                    this.f8592h.c();
                }
            } else {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
    }

    @Override // com.bumptech.glide.load.engine.u
    public int d() {
        return this.f8592h.d();
    }

    @Override // com.bumptech.glide.load.engine.u
    public Class<Z> e() {
        return this.f8592h.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return this.f8590f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        synchronized (this.f8593i) {
            synchronized (this) {
                int i2 = this.f8595k;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    this.f8595k = i3;
                    if (i3 == 0) {
                        this.f8593i.d(this.f8594j, this);
                    }
                } else {
                    throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
                }
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.u
    public Z get() {
        return this.f8592h.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void h(com.bumptech.glide.load.f fVar, a aVar) {
        this.f8594j = fVar;
        this.f8593i = aVar;
    }

    public synchronized String toString() {
        return "EngineResource{isCacheable=" + this.f8590f + ", listener=" + this.f8593i + ", key=" + this.f8594j + ", acquired=" + this.f8595k + ", isRecycled=" + this.l + ", resource=" + this.f8592h + '}';
    }
}
