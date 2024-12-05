package rx.n.b;

import rx.g;

/* compiled from: ProducerArbiter.java */
/* loaded from: classes3.dex */
public final class a implements g {

    /* renamed from: f, reason: collision with root package name */
    static final g f22970f = new C0412a();

    /* renamed from: g, reason: collision with root package name */
    long f22971g;

    /* renamed from: h, reason: collision with root package name */
    g f22972h;

    /* renamed from: i, reason: collision with root package name */
    boolean f22973i;

    /* renamed from: j, reason: collision with root package name */
    long f22974j;

    /* renamed from: k, reason: collision with root package name */
    long f22975k;
    g l;

    /* compiled from: ProducerArbiter.java */
    /* renamed from: rx.n.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class C0412a implements g {
        C0412a() {
        }

        @Override // rx.g
        public void request(long j2) {
        }
    }

    public void a() {
        while (true) {
            synchronized (this) {
                long j2 = this.f22974j;
                long j3 = this.f22975k;
                g gVar = this.l;
                if (j2 == 0 && j3 == 0 && gVar == null) {
                    this.f22973i = false;
                    return;
                }
                this.f22974j = 0L;
                this.f22975k = 0L;
                this.l = null;
                long j4 = this.f22971g;
                if (j4 != Long.MAX_VALUE) {
                    long j5 = j4 + j2;
                    if (j5 < 0 || j5 == Long.MAX_VALUE) {
                        this.f22971g = Long.MAX_VALUE;
                        j4 = Long.MAX_VALUE;
                    } else {
                        j4 = j5 - j3;
                        if (j4 >= 0) {
                            this.f22971g = j4;
                        } else {
                            throw new IllegalStateException("more produced than requested");
                        }
                    }
                }
                if (gVar != null) {
                    if (gVar == f22970f) {
                        this.f22972h = null;
                    } else {
                        this.f22972h = gVar;
                        gVar.request(j4);
                    }
                } else {
                    g gVar2 = this.f22972h;
                    if (gVar2 != null && j2 != 0) {
                        gVar2.request(j2);
                    }
                }
            }
        }
    }

    public void b(long j2) {
        if (j2 > 0) {
            synchronized (this) {
                if (this.f22973i) {
                    this.f22975k += j2;
                    return;
                }
                this.f22973i = true;
                try {
                    long j3 = this.f22971g;
                    if (j3 != Long.MAX_VALUE) {
                        long j4 = j3 - j2;
                        if (j4 >= 0) {
                            this.f22971g = j4;
                        } else {
                            throw new IllegalStateException("more items arrived than were requested");
                        }
                    }
                    a();
                    return;
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f22973i = false;
                        throw th;
                    }
                }
            }
        }
        throw new IllegalArgumentException("n > 0 required");
    }

    public void c(g gVar) {
        synchronized (this) {
            if (this.f22973i) {
                if (gVar == null) {
                    gVar = f22970f;
                }
                this.l = gVar;
                return;
            }
            this.f22973i = true;
            try {
                this.f22972h = gVar;
                if (gVar != null) {
                    gVar.request(this.f22971g);
                }
                a();
            } catch (Throwable th) {
                synchronized (this) {
                    this.f22973i = false;
                    throw th;
                }
            }
        }
    }

    @Override // rx.g
    public void request(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j2 == 0) {
            return;
        }
        synchronized (this) {
            if (this.f22973i) {
                this.f22974j += j2;
                return;
            }
            this.f22973i = true;
            try {
                long j3 = this.f22971g + j2;
                if (j3 < 0) {
                    j3 = Long.MAX_VALUE;
                }
                this.f22971g = j3;
                g gVar = this.f22972h;
                if (gVar != null) {
                    gVar.request(j2);
                }
                a();
            } catch (Throwable th) {
                synchronized (this) {
                    this.f22973i = false;
                    throw th;
                }
            }
        }
    }
}
