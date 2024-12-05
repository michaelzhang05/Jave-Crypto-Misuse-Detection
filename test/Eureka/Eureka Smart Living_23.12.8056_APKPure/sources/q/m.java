package q;

import p.d;
import p.e;

/* loaded from: classes.dex */
public abstract class m implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f8953a;

    /* renamed from: b, reason: collision with root package name */
    p.e f8954b;

    /* renamed from: c, reason: collision with root package name */
    k f8955c;

    /* renamed from: d, reason: collision with root package name */
    protected e.b f8956d;

    /* renamed from: e, reason: collision with root package name */
    g f8957e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f8958f = 0;

    /* renamed from: g, reason: collision with root package name */
    boolean f8959g = false;

    /* renamed from: h, reason: collision with root package name */
    public f f8960h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public f f8961i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    protected b f8962j = b.NONE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8963a;

        static {
            int[] iArr = new int[d.b.values().length];
            f8963a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8963a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8963a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8963a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8963a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes.dex */
    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public m(p.e eVar) {
        this.f8954b = eVar;
    }

    private void l(int i6, int i7) {
        g gVar;
        int g6;
        int i8 = this.f8953a;
        if (i8 != 0) {
            if (i8 == 1) {
                int g7 = g(this.f8957e.f8939m, i6);
                gVar = this.f8957e;
                g6 = Math.min(g7, i7);
                gVar.d(g6);
            }
            if (i8 != 2) {
                if (i8 != 3) {
                    return;
                }
                p.e eVar = this.f8954b;
                m mVar = eVar.f8649e;
                e.b bVar = mVar.f8956d;
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (bVar == bVar2 && mVar.f8953a == 3) {
                    l lVar = eVar.f8651f;
                    if (lVar.f8956d == bVar2 && lVar.f8953a == 3) {
                        return;
                    }
                }
                if (i6 == 0) {
                    mVar = eVar.f8651f;
                }
                if (mVar.f8957e.f8927j) {
                    float t5 = eVar.t();
                    this.f8957e.d(i6 == 1 ? (int) ((mVar.f8957e.f8924g / t5) + 0.5f) : (int) ((t5 * mVar.f8957e.f8924g) + 0.5f));
                    return;
                }
                return;
            }
            p.e G = this.f8954b.G();
            if (G == null) {
                return;
            }
            if (!(i6 == 0 ? G.f8649e : G.f8651f).f8957e.f8927j) {
                return;
            }
            p.e eVar2 = this.f8954b;
            i7 = (int) ((r9.f8924g * (i6 == 0 ? eVar2.f8673q : eVar2.f8679t)) + 0.5f);
        }
        gVar = this.f8957e;
        g6 = g(i7, i6);
        gVar.d(g6);
    }

    @Override // q.d
    public abstract void a(d dVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(f fVar, f fVar2, int i6) {
        fVar.f8929l.add(fVar2);
        fVar.f8923f = i6;
        fVar2.f8928k.add(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(f fVar, f fVar2, int i6, g gVar) {
        fVar.f8929l.add(fVar2);
        fVar.f8929l.add(this.f8957e);
        fVar.f8925h = i6;
        fVar.f8926i = gVar;
        fVar2.f8928k.add(fVar);
        gVar.f8928k.add(fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void e();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void f();

    /* JADX INFO: Access modifiers changed from: protected */
    public final int g(int i6, int i7) {
        int max;
        if (i7 == 0) {
            p.e eVar = this.f8954b;
            int i8 = eVar.f8671p;
            max = Math.max(eVar.f8669o, i6);
            if (i8 > 0) {
                max = Math.min(i8, i6);
            }
            if (max == i6) {
                return i6;
            }
        } else {
            p.e eVar2 = this.f8954b;
            int i9 = eVar2.f8677s;
            max = Math.max(eVar2.f8675r, i6);
            if (i9 > 0) {
                max = Math.min(i9, i6);
            }
            if (max == i6) {
                return i6;
            }
        }
        return max;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final f h(p.d dVar) {
        m mVar;
        m mVar2;
        p.d dVar2 = dVar.f8625d;
        if (dVar2 == null) {
            return null;
        }
        p.e eVar = dVar2.f8623b;
        int i6 = a.f8963a[dVar2.f8624c.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                mVar2 = eVar.f8649e;
            } else if (i6 == 3) {
                mVar = eVar.f8651f;
            } else {
                if (i6 == 4) {
                    return eVar.f8651f.f8950k;
                }
                if (i6 != 5) {
                    return null;
                }
                mVar2 = eVar.f8651f;
            }
            return mVar2.f8961i;
        }
        mVar = eVar.f8649e;
        return mVar.f8960h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final f i(p.d dVar, int i6) {
        p.d dVar2 = dVar.f8625d;
        if (dVar2 == null) {
            return null;
        }
        p.e eVar = dVar2.f8623b;
        m mVar = i6 == 0 ? eVar.f8649e : eVar.f8651f;
        int i7 = a.f8963a[dVar2.f8624c.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 5) {
                        return null;
                    }
                }
            }
            return mVar.f8961i;
        }
        return mVar.f8960h;
    }

    public long j() {
        if (this.f8957e.f8927j) {
            return r0.f8924g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f8959g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean m();

    /* JADX INFO: Access modifiers changed from: protected */
    public void n(d dVar, p.d dVar2, p.d dVar3, int i6) {
        f fVar;
        f h6 = h(dVar2);
        f h7 = h(dVar3);
        if (h6.f8927j && h7.f8927j) {
            int c6 = h6.f8924g + dVar2.c();
            int c7 = h7.f8924g - dVar3.c();
            int i7 = c7 - c6;
            if (!this.f8957e.f8927j && this.f8956d == e.b.MATCH_CONSTRAINT) {
                l(i6, i7);
            }
            g gVar = this.f8957e;
            if (gVar.f8927j) {
                if (gVar.f8924g == i7) {
                    this.f8960h.d(c6);
                    fVar = this.f8961i;
                } else {
                    p.e eVar = this.f8954b;
                    float w5 = i6 == 0 ? eVar.w() : eVar.K();
                    if (h6 == h7) {
                        c6 = h6.f8924g;
                        c7 = h7.f8924g;
                        w5 = 0.5f;
                    }
                    this.f8960h.d((int) (c6 + 0.5f + (((c7 - c6) - this.f8957e.f8924g) * w5)));
                    fVar = this.f8961i;
                    c7 = this.f8960h.f8924g + this.f8957e.f8924g;
                }
                fVar.d(c7);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void o(d dVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p(d dVar) {
    }
}
