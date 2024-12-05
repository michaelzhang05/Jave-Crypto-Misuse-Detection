package q;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class k {

    /* renamed from: h, reason: collision with root package name */
    public static int f8942h;

    /* renamed from: c, reason: collision with root package name */
    m f8945c;

    /* renamed from: d, reason: collision with root package name */
    m f8946d;

    /* renamed from: f, reason: collision with root package name */
    int f8948f;

    /* renamed from: g, reason: collision with root package name */
    int f8949g;

    /* renamed from: a, reason: collision with root package name */
    public int f8943a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8944b = false;

    /* renamed from: e, reason: collision with root package name */
    ArrayList f8947e = new ArrayList();

    public k(m mVar, int i6) {
        this.f8945c = null;
        this.f8946d = null;
        int i7 = f8942h;
        this.f8948f = i7;
        f8942h = i7 + 1;
        this.f8945c = mVar;
        this.f8946d = mVar;
        this.f8949g = i6;
    }

    private long c(f fVar, long j6) {
        m mVar = fVar.f8921d;
        if (mVar instanceof i) {
            return j6;
        }
        int size = fVar.f8928k.size();
        long j7 = j6;
        for (int i6 = 0; i6 < size; i6++) {
            d dVar = (d) fVar.f8928k.get(i6);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f8921d != mVar) {
                    j7 = Math.min(j7, c(fVar2, fVar2.f8923f + j6));
                }
            }
        }
        if (fVar != mVar.f8961i) {
            return j7;
        }
        long j8 = j6 - mVar.j();
        return Math.min(Math.min(j7, c(mVar.f8960h, j8)), j8 - mVar.f8960h.f8923f);
    }

    private long d(f fVar, long j6) {
        m mVar = fVar.f8921d;
        if (mVar instanceof i) {
            return j6;
        }
        int size = fVar.f8928k.size();
        long j7 = j6;
        for (int i6 = 0; i6 < size; i6++) {
            d dVar = (d) fVar.f8928k.get(i6);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f8921d != mVar) {
                    j7 = Math.max(j7, d(fVar2, fVar2.f8923f + j6));
                }
            }
        }
        if (fVar != mVar.f8960h) {
            return j7;
        }
        long j8 = j6 + mVar.j();
        return Math.max(Math.max(j7, d(mVar.f8961i, j8)), j8 - mVar.f8961i.f8923f);
    }

    public void a(m mVar) {
        this.f8947e.add(mVar);
        this.f8946d = mVar;
    }

    public long b(p.f fVar, int i6) {
        long j6;
        m mVar;
        long j7;
        long j8;
        m mVar2 = this.f8945c;
        if (mVar2 instanceof c) {
            if (((c) mVar2).f8958f != i6) {
                return 0L;
            }
        } else if (i6 == 0) {
            if (!(mVar2 instanceof j)) {
                return 0L;
            }
        } else if (!(mVar2 instanceof l)) {
            return 0L;
        }
        f fVar2 = (i6 == 0 ? fVar.f8649e : fVar.f8651f).f8960h;
        f fVar3 = (i6 == 0 ? fVar.f8649e : fVar.f8651f).f8961i;
        boolean contains = mVar2.f8960h.f8929l.contains(fVar2);
        boolean contains2 = this.f8945c.f8961i.f8929l.contains(fVar3);
        long j9 = this.f8945c.j();
        if (!contains || !contains2) {
            if (contains) {
                j8 = d(this.f8945c.f8960h, r13.f8923f);
                j7 = this.f8945c.f8960h.f8923f + j9;
            } else if (contains2) {
                j7 = (-this.f8945c.f8961i.f8923f) + j9;
                j8 = -c(this.f8945c.f8961i, r13.f8923f);
            } else {
                j6 = r13.f8960h.f8923f + this.f8945c.j();
                mVar = this.f8945c;
            }
            return Math.max(j8, j7);
        }
        long d6 = d(this.f8945c.f8960h, 0L);
        long c6 = c(this.f8945c.f8961i, 0L);
        long j10 = d6 - j9;
        m mVar3 = this.f8945c;
        int i7 = mVar3.f8961i.f8923f;
        if (j10 >= (-i7)) {
            j10 += i7;
        }
        int i8 = mVar3.f8960h.f8923f;
        long j11 = ((-c6) - j9) - i8;
        if (j11 >= i8) {
            j11 -= i8;
        }
        float f6 = (float) (mVar3.f8954b.o(i6) > 0.0f ? (((float) j11) / r13) + (((float) j10) / (1.0f - r13)) : 0L);
        long j12 = (f6 * r13) + 0.5f + j9 + (f6 * (1.0f - r13)) + 0.5f;
        mVar = this.f8945c;
        j6 = mVar.f8960h.f8923f + j12;
        return j6 - mVar.f8961i.f8923f;
    }
}
