package c.f.b.k.m;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RunGroup.java */
/* loaded from: classes.dex */
public class m {
    public static int a;

    /* renamed from: d, reason: collision with root package name */
    p f2586d;

    /* renamed from: e, reason: collision with root package name */
    p f2587e;

    /* renamed from: g, reason: collision with root package name */
    int f2589g;

    /* renamed from: h, reason: collision with root package name */
    int f2590h;

    /* renamed from: b, reason: collision with root package name */
    public int f2584b = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2585c = false;

    /* renamed from: f, reason: collision with root package name */
    ArrayList<p> f2588f = new ArrayList<>();

    public m(p pVar, int i2) {
        this.f2586d = null;
        this.f2587e = null;
        this.f2589g = 0;
        int i3 = a;
        this.f2589g = i3;
        a = i3 + 1;
        this.f2586d = pVar;
        this.f2587e = pVar;
        this.f2590h = i2;
    }

    private long c(f fVar, long j2) {
        p pVar = fVar.f2569d;
        if (pVar instanceof k) {
            return j2;
        }
        int size = fVar.f2576k.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = fVar.f2576k.get(i2);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f2569d != pVar) {
                    j3 = Math.min(j3, c(fVar2, fVar2.f2571f + j2));
                }
            }
        }
        if (fVar != pVar.f2612i) {
            return j3;
        }
        long j4 = j2 - pVar.j();
        return Math.min(Math.min(j3, c(pVar.f2611h, j4)), j4 - pVar.f2611h.f2571f);
    }

    private long d(f fVar, long j2) {
        p pVar = fVar.f2569d;
        if (pVar instanceof k) {
            return j2;
        }
        int size = fVar.f2576k.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = fVar.f2576k.get(i2);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f2569d != pVar) {
                    j3 = Math.max(j3, d(fVar2, fVar2.f2571f + j2));
                }
            }
        }
        if (fVar != pVar.f2611h) {
            return j3;
        }
        long j4 = j2 + pVar.j();
        return Math.max(Math.max(j3, d(pVar.f2612i, j4)), j4 - pVar.f2612i.f2571f);
    }

    public void a(p pVar) {
        this.f2588f.add(pVar);
        this.f2587e = pVar;
    }

    public long b(c.f.b.k.f fVar, int i2) {
        long j2;
        int i3;
        p pVar = this.f2586d;
        if (pVar instanceof c) {
            if (((c) pVar).f2609f != i2) {
                return 0L;
            }
        } else if (i2 == 0) {
            if (!(pVar instanceof l)) {
                return 0L;
            }
        } else if (!(pVar instanceof n)) {
            return 0L;
        }
        f fVar2 = (i2 == 0 ? fVar.f2534f : fVar.f2535g).f2611h;
        f fVar3 = (i2 == 0 ? fVar.f2534f : fVar.f2535g).f2612i;
        boolean contains = pVar.f2611h.l.contains(fVar2);
        boolean contains2 = this.f2586d.f2612i.l.contains(fVar3);
        long j3 = this.f2586d.j();
        if (contains && contains2) {
            long d2 = d(this.f2586d.f2611h, 0L);
            long c2 = c(this.f2586d.f2612i, 0L);
            long j4 = d2 - j3;
            p pVar2 = this.f2586d;
            int i4 = pVar2.f2612i.f2571f;
            if (j4 >= (-i4)) {
                j4 += i4;
            }
            int i5 = pVar2.f2611h.f2571f;
            long j5 = ((-c2) - j3) - i5;
            if (j5 >= i5) {
                j5 -= i5;
            }
            float f2 = (float) (pVar2.f2605b.o(i2) > 0.0f ? (((float) j5) / r13) + (((float) j4) / (1.0f - r13)) : 0L);
            long j6 = (f2 * r13) + 0.5f + j3 + (f2 * (1.0f - r13)) + 0.5f;
            j2 = r13.f2611h.f2571f + j6;
            i3 = this.f2586d.f2612i.f2571f;
        } else {
            if (contains) {
                return Math.max(d(this.f2586d.f2611h, r13.f2571f), this.f2586d.f2611h.f2571f + j3);
            }
            if (contains2) {
                return Math.max(-c(this.f2586d.f2612i, r13.f2571f), (-this.f2586d.f2612i.f2571f) + j3);
            }
            j2 = r13.f2611h.f2571f + this.f2586d.j();
            i3 = this.f2586d.f2612i.f2571f;
        }
        return j2 - i3;
    }
}
