package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

/* loaded from: classes2.dex */
public final class zzow implements zznn, zznu {
    private static final zznq a = new l20();

    /* renamed from: b, reason: collision with root package name */
    private static final int f15365b = zzsy.i("qt  ");

    /* renamed from: g, reason: collision with root package name */
    private int f15370g;

    /* renamed from: h, reason: collision with root package name */
    private int f15371h;

    /* renamed from: i, reason: collision with root package name */
    private long f15372i;

    /* renamed from: j, reason: collision with root package name */
    private int f15373j;

    /* renamed from: k, reason: collision with root package name */
    private zzst f15374k;
    private int l;
    private int m;
    private zznp n;
    private m20[] o;
    private long p;
    private boolean q;

    /* renamed from: e, reason: collision with root package name */
    private final zzst f15368e = new zzst(16);

    /* renamed from: f, reason: collision with root package name */
    private final Stack<a20> f15369f = new Stack<>();

    /* renamed from: c, reason: collision with root package name */
    private final zzst f15366c = new zzst(zzsq.a);

    /* renamed from: d, reason: collision with root package name */
    private final zzst f15367d = new zzst(4);

    private final void i(long j2) throws zzlm {
        zzpa b2;
        while (!this.f15369f.isEmpty() && this.f15369f.peek().Q0 == j2) {
            a20 pop = this.f15369f.pop();
            if (pop.P0 == z10.B) {
                long j3 = -9223372036854775807L;
                ArrayList arrayList = new ArrayList();
                zzpo zzpoVar = null;
                zznr zznrVar = new zznr();
                b20 d2 = pop.d(z10.A0);
                if (d2 != null && (zzpoVar = c20.d(d2, this.q)) != null) {
                    zznrVar.a(zzpoVar);
                }
                for (int i2 = 0; i2 < pop.S0.size(); i2++) {
                    a20 a20Var = pop.S0.get(i2);
                    if (a20Var.P0 == z10.D && (b2 = c20.b(a20Var, pop.d(z10.C), -9223372036854775807L, null, this.q)) != null) {
                        o20 c2 = c20.c(b2, a20Var.e(z10.E).e(z10.F).e(z10.G), zznrVar);
                        if (c2.a != 0) {
                            m20 m20Var = new m20(b2, c2, this.n.y(i2, b2.f15380b));
                            zzlh j4 = b2.f15384f.j(c2.f11914d + 30);
                            if (b2.f15380b == 1) {
                                if (zznrVar.c()) {
                                    j4 = j4.k(zznrVar.f15348c, zznrVar.f15349d);
                                }
                                if (zzpoVar != null) {
                                    j4 = j4.a(zzpoVar);
                                }
                            }
                            m20Var.f11792c.a(j4);
                            j3 = Math.max(j3, b2.f15383e);
                            arrayList.add(m20Var);
                        }
                    }
                }
                this.p = j3;
                this.o = (m20[]) arrayList.toArray(new m20[arrayList.size()]);
                this.n.c();
                this.n.z(this);
                this.f15369f.clear();
                this.f15370g = 2;
            } else if (!this.f15369f.isEmpty()) {
                this.f15369f.peek().S0.add(pop);
            }
        }
        if (this.f15370g != 2) {
            j();
        }
    }

    private final void j() {
        this.f15370g = 0;
        this.f15373j = 0;
    }

    @Override // com.google.android.gms.internal.ads.zznn
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final long b(long j2) {
        long j3 = Long.MAX_VALUE;
        for (m20 m20Var : this.o) {
            o20 o20Var = m20Var.f11791b;
            int a2 = o20Var.a(j2);
            if (a2 == -1) {
                a2 = o20Var.b(j2);
            }
            long j4 = o20Var.f11912b[a2];
            if (j4 < j3) {
                j3 = j4;
            }
        }
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final boolean c() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x018a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0295 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0006 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zznn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(com.google.android.gms.internal.ads.zzno r24, com.google.android.gms.internal.ads.zznt r25) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzow.d(com.google.android.gms.internal.ads.zzno, com.google.android.gms.internal.ads.zznt):int");
    }

    @Override // com.google.android.gms.internal.ads.zznn
    public final void e(zznp zznpVar) {
        this.n = zznpVar;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final long f() {
        return this.p;
    }

    @Override // com.google.android.gms.internal.ads.zznn
    public final boolean g(zzno zznoVar) throws IOException, InterruptedException {
        return n20.a(zznoVar);
    }

    @Override // com.google.android.gms.internal.ads.zznn
    public final void h(long j2, long j3) {
        this.f15369f.clear();
        this.f15373j = 0;
        this.l = 0;
        this.m = 0;
        if (j2 == 0) {
            j();
            return;
        }
        m20[] m20VarArr = this.o;
        if (m20VarArr != null) {
            for (m20 m20Var : m20VarArr) {
                o20 o20Var = m20Var.f11791b;
                int a2 = o20Var.a(j3);
                if (a2 == -1) {
                    a2 = o20Var.b(j3);
                }
                m20Var.f11793d = a2;
            }
        }
    }
}
