package q;

import p.e;
import q.f;
import q.m;

/* loaded from: classes.dex */
public class l extends m {

    /* renamed from: k, reason: collision with root package name */
    public f f8950k;

    /* renamed from: l, reason: collision with root package name */
    g f8951l;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8952a;

        static {
            int[] iArr = new int[m.b.values().length];
            f8952a = iArr;
            try {
                iArr[m.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8952a[m.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8952a[m.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(p.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f8950k = fVar;
        this.f8951l = null;
        this.f8960h.f8922e = f.a.TOP;
        this.f8961i.f8922e = f.a.BOTTOM;
        fVar.f8922e = f.a.BASELINE;
        this.f8958f = 1;
    }

    @Override // q.m, q.d
    public void a(d dVar) {
        int i6;
        float t5;
        int i7 = a.f8952a[this.f8962j.ordinal()];
        if (i7 == 1) {
            p(dVar);
        } else if (i7 == 2) {
            o(dVar);
        } else if (i7 == 3) {
            p.e eVar = this.f8954b;
            n(dVar, eVar.C, eVar.E, 1);
            return;
        }
        g gVar = this.f8957e;
        if (gVar.f8920c && !gVar.f8927j && this.f8956d == e.b.MATCH_CONSTRAINT) {
            p.e eVar2 = this.f8954b;
            int i8 = eVar2.f8665m;
            if (i8 == 2) {
                p.e G = eVar2.G();
                if (G != null) {
                    if (G.f8651f.f8957e.f8927j) {
                        i6 = (int) ((r7.f8924g * this.f8954b.f8679t) + 0.5f);
                        this.f8957e.d(i6);
                    }
                }
            } else if (i8 == 3 && eVar2.f8649e.f8957e.f8927j) {
                int u5 = eVar2.u();
                if (u5 != -1) {
                    if (u5 == 0) {
                        t5 = r7.f8649e.f8957e.f8924g * this.f8954b.t();
                        i6 = (int) (t5 + 0.5f);
                        this.f8957e.d(i6);
                    } else if (u5 != 1) {
                        i6 = 0;
                        this.f8957e.d(i6);
                    }
                }
                t5 = r7.f8649e.f8957e.f8924g / this.f8954b.t();
                i6 = (int) (t5 + 0.5f);
                this.f8957e.d(i6);
            }
        }
        f fVar = this.f8960h;
        if (fVar.f8920c) {
            f fVar2 = this.f8961i;
            if (fVar2.f8920c) {
                if (fVar.f8927j && fVar2.f8927j && this.f8957e.f8927j) {
                    return;
                }
                if (!this.f8957e.f8927j && this.f8956d == e.b.MATCH_CONSTRAINT) {
                    p.e eVar3 = this.f8954b;
                    if (eVar3.f8663l == 0 && !eVar3.X()) {
                        f fVar3 = (f) this.f8960h.f8929l.get(0);
                        f fVar4 = (f) this.f8961i.f8929l.get(0);
                        int i9 = fVar3.f8924g;
                        f fVar5 = this.f8960h;
                        int i10 = i9 + fVar5.f8923f;
                        int i11 = fVar4.f8924g + this.f8961i.f8923f;
                        fVar5.d(i10);
                        this.f8961i.d(i11);
                        this.f8957e.d(i11 - i10);
                        return;
                    }
                }
                if (!this.f8957e.f8927j && this.f8956d == e.b.MATCH_CONSTRAINT && this.f8953a == 1 && this.f8960h.f8929l.size() > 0 && this.f8961i.f8929l.size() > 0) {
                    f fVar6 = (f) this.f8960h.f8929l.get(0);
                    int i12 = (((f) this.f8961i.f8929l.get(0)).f8924g + this.f8961i.f8923f) - (fVar6.f8924g + this.f8960h.f8923f);
                    g gVar2 = this.f8957e;
                    int i13 = gVar2.f8939m;
                    if (i12 < i13) {
                        gVar2.d(i12);
                    } else {
                        gVar2.d(i13);
                    }
                }
                if (this.f8957e.f8927j && this.f8960h.f8929l.size() > 0 && this.f8961i.f8929l.size() > 0) {
                    f fVar7 = (f) this.f8960h.f8929l.get(0);
                    f fVar8 = (f) this.f8961i.f8929l.get(0);
                    int i14 = fVar7.f8924g + this.f8960h.f8923f;
                    int i15 = fVar8.f8924g + this.f8961i.f8923f;
                    float K = this.f8954b.K();
                    if (fVar7 == fVar8) {
                        i14 = fVar7.f8924g;
                        i15 = fVar8.f8924g;
                        K = 0.5f;
                    }
                    this.f8960h.d((int) (i14 + 0.5f + (((i15 - i14) - this.f8957e.f8924g) * K)));
                    this.f8961i.d(this.f8960h.f8924g + this.f8957e.f8924g);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x02d9, code lost:
    
        if (r10.f8954b.S() != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02db, code lost:
    
        r0 = r10.f8950k;
        r1 = r10.f8960h;
        r2 = r10.f8951l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x032e, code lost:
    
        if (r0.f8956d == r1) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03d5, code lost:
    
        r0.f8957e.f8928k.add(r10.f8957e);
        r10.f8957e.f8929l.add(r10.f8954b.f8649e.f8957e);
        r10.f8957e.f8918a = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x035e, code lost:
    
        if (r10.f8954b.S() != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03d3, code lost:
    
        if (r0.f8956d == r1) goto L151;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    @Override // q.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.l.d():void");
    }

    @Override // q.m
    public void e() {
        f fVar = this.f8960h;
        if (fVar.f8927j) {
            this.f8954b.G0(fVar.f8924g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // q.m
    public void f() {
        this.f8955c = null;
        this.f8960h.c();
        this.f8961i.c();
        this.f8950k.c();
        this.f8957e.c();
        this.f8959g = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // q.m
    public boolean m() {
        return this.f8956d != e.b.MATCH_CONSTRAINT || this.f8954b.f8665m == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q() {
        this.f8959g = false;
        this.f8960h.c();
        this.f8960h.f8927j = false;
        this.f8961i.c();
        this.f8961i.f8927j = false;
        this.f8950k.c();
        this.f8950k.f8927j = false;
        this.f8957e.f8927j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f8954b.r();
    }
}
