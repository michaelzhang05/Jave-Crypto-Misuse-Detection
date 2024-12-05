package c.f.b.k.m;

import c.f.b.k.d;
import c.f.b.k.e;

/* compiled from: WidgetRun.java */
/* loaded from: classes.dex */
public abstract class p implements d {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    c.f.b.k.e f2605b;

    /* renamed from: c, reason: collision with root package name */
    m f2606c;

    /* renamed from: d, reason: collision with root package name */
    protected e.b f2607d;

    /* renamed from: e, reason: collision with root package name */
    g f2608e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f2609f = 0;

    /* renamed from: g, reason: collision with root package name */
    boolean f2610g = false;

    /* renamed from: h, reason: collision with root package name */
    public f f2611h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public f f2612i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    protected b f2613j = b.NONE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WidgetRun.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.b.values().length];
            a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: WidgetRun.java */
    /* loaded from: classes.dex */
    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(c.f.b.k.e eVar) {
        this.f2605b = eVar;
    }

    private void l(int i2, int i3) {
        int i4;
        int i5 = this.a;
        if (i5 == 0) {
            this.f2608e.d(g(i3, i2));
            return;
        }
        if (i5 == 1) {
            this.f2608e.d(Math.min(g(this.f2608e.m, i2), i3));
            return;
        }
        if (i5 == 2) {
            c.f.b.k.e I = this.f2605b.I();
            if (I != null) {
                if ((i2 == 0 ? I.f2534f : I.f2535g).f2608e.f2575j) {
                    c.f.b.k.e eVar = this.f2605b;
                    this.f2608e.d(g((int) ((r9.f2572g * (i2 == 0 ? eVar.v : eVar.y)) + 0.5f), i2));
                    return;
                }
                return;
            }
            return;
        }
        if (i5 != 3) {
            return;
        }
        c.f.b.k.e eVar2 = this.f2605b;
        p pVar = eVar2.f2534f;
        e.b bVar = pVar.f2607d;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && pVar.a == 3) {
            n nVar = eVar2.f2535g;
            if (nVar.f2607d == bVar2 && nVar.a == 3) {
                return;
            }
        }
        if (i2 == 0) {
            pVar = eVar2.f2535g;
        }
        if (pVar.f2608e.f2575j) {
            float t = eVar2.t();
            if (i2 == 1) {
                i4 = (int) ((pVar.f2608e.f2572g / t) + 0.5f);
            } else {
                i4 = (int) ((t * pVar.f2608e.f2572g) + 0.5f);
            }
            this.f2608e.d(i4);
        }
    }

    @Override // c.f.b.k.m.d
    public void a(d dVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(f fVar, f fVar2, int i2) {
        fVar.l.add(fVar2);
        fVar.f2571f = i2;
        fVar2.f2576k.add(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(f fVar, f fVar2, int i2, g gVar) {
        fVar.l.add(fVar2);
        fVar.l.add(this.f2608e);
        fVar.f2573h = i2;
        fVar.f2574i = gVar;
        fVar2.f2576k.add(fVar);
        gVar.f2576k.add(fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void e();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void f();

    /* JADX INFO: Access modifiers changed from: protected */
    public final int g(int i2, int i3) {
        int max;
        if (i3 == 0) {
            c.f.b.k.e eVar = this.f2605b;
            int i4 = eVar.u;
            max = Math.max(eVar.t, i2);
            if (i4 > 0) {
                max = Math.min(i4, i2);
            }
            if (max == i2) {
                return i2;
            }
        } else {
            c.f.b.k.e eVar2 = this.f2605b;
            int i5 = eVar2.x;
            max = Math.max(eVar2.w, i2);
            if (i5 > 0) {
                max = Math.min(i5, i2);
            }
            if (max == i2) {
                return i2;
            }
        }
        return max;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final f h(c.f.b.k.d dVar) {
        c.f.b.k.d dVar2 = dVar.f2520f;
        if (dVar2 == null) {
            return null;
        }
        c.f.b.k.e eVar = dVar2.f2518d;
        int i2 = a.a[dVar2.f2519e.ordinal()];
        if (i2 == 1) {
            return eVar.f2534f.f2611h;
        }
        if (i2 == 2) {
            return eVar.f2534f.f2612i;
        }
        if (i2 == 3) {
            return eVar.f2535g.f2611h;
        }
        if (i2 == 4) {
            return eVar.f2535g.f2591k;
        }
        if (i2 != 5) {
            return null;
        }
        return eVar.f2535g.f2612i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final f i(c.f.b.k.d dVar, int i2) {
        c.f.b.k.d dVar2 = dVar.f2520f;
        if (dVar2 == null) {
            return null;
        }
        c.f.b.k.e eVar = dVar2.f2518d;
        p pVar = i2 == 0 ? eVar.f2534f : eVar.f2535g;
        int i3 = a.a[dVar2.f2519e.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f2612i;
        }
        return pVar.f2611h;
    }

    public long j() {
        if (this.f2608e.f2575j) {
            return r0.f2572g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f2610g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean m();

    /* JADX INFO: Access modifiers changed from: protected */
    public void n(d dVar, c.f.b.k.d dVar2, c.f.b.k.d dVar3, int i2) {
        f h2 = h(dVar2);
        f h3 = h(dVar3);
        if (h2.f2575j && h3.f2575j) {
            int e2 = h2.f2572g + dVar2.e();
            int e3 = h3.f2572g - dVar3.e();
            int i3 = e3 - e2;
            if (!this.f2608e.f2575j && this.f2607d == e.b.MATCH_CONSTRAINT) {
                l(i2, i3);
            }
            g gVar = this.f2608e;
            if (gVar.f2575j) {
                if (gVar.f2572g == i3) {
                    this.f2611h.d(e2);
                    this.f2612i.d(e3);
                    return;
                }
                c.f.b.k.e eVar = this.f2605b;
                float w = i2 == 0 ? eVar.w() : eVar.M();
                if (h2 == h3) {
                    e2 = h2.f2572g;
                    e3 = h3.f2572g;
                    w = 0.5f;
                }
                this.f2611h.d((int) (e2 + 0.5f + (((e3 - e2) - this.f2608e.f2572g) * w)));
                this.f2612i.d(this.f2611h.f2572g + this.f2608e.f2572g);
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
