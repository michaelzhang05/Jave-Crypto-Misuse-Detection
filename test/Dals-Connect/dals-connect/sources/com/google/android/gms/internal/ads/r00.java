package com.google.android.gms.internal.ads;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class r00 {
    public final zzqj a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12083b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12084c;

    /* renamed from: d, reason: collision with root package name */
    public final zzqw[] f12085d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean[] f12086e;

    /* renamed from: f, reason: collision with root package name */
    public final long f12087f;

    /* renamed from: g, reason: collision with root package name */
    public int f12088g;

    /* renamed from: h, reason: collision with root package name */
    public long f12089h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f12090i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f12091j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f12092k;
    public r00 l;
    public zzrr m;
    private final zzlo[] n;
    private final zzlp[] o;
    private final zzrp p;
    private final zzll q;
    private final zzql r;
    private zzrr s;

    public r00(zzlo[] zzloVarArr, zzlp[] zzlpVarArr, long j2, zzrp zzrpVar, zzll zzllVar, zzql zzqlVar, Object obj, int i2, int i3, boolean z, long j3) {
        this.n = zzloVarArr;
        this.o = zzlpVarArr;
        this.f12087f = j2;
        this.p = zzrpVar;
        this.q = zzllVar;
        this.r = zzqlVar;
        this.f12083b = zzsk.d(obj);
        this.f12084c = i2;
        this.f12088g = i3;
        this.f12090i = z;
        this.f12089h = j3;
        this.f12085d = new zzqw[zzloVarArr.length];
        this.f12086e = new boolean[zzloVarArr.length];
        this.a = zzqlVar.b(i3, zzllVar.b());
    }

    public final void a() {
        try {
            this.r.c(this.a);
        } catch (RuntimeException e2) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e2);
        }
    }

    public final long b(long j2, boolean z, boolean[] zArr) {
        zzro zzroVar = this.m.f15499b;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= zzroVar.a) {
                break;
            }
            boolean[] zArr2 = this.f12086e;
            if (z || !this.m.a(this.s, i2)) {
                z2 = false;
            }
            zArr2[i2] = z2;
            i2++;
        }
        long d2 = this.a.d(zzroVar.b(), this.f12086e, this.f12085d, zArr, j2);
        this.s = this.m;
        this.f12092k = false;
        int i3 = 0;
        while (true) {
            zzqw[] zzqwVarArr = this.f12085d;
            if (i3 < zzqwVarArr.length) {
                if (zzqwVarArr[i3] != null) {
                    zzsk.e(zzroVar.a(i3) != null);
                    this.f12092k = true;
                } else {
                    zzsk.e(zzroVar.a(i3) == null);
                }
                i3++;
            } else {
                this.q.g(this.n, this.m.a, zzroVar);
                return d2;
            }
        }
    }

    public final void c(int i2, boolean z) {
        this.f12088g = i2;
        this.f12090i = z;
    }

    public final long d(long j2, boolean z) {
        return b(j2, false, new boolean[this.n.length]);
    }

    public final long e() {
        return this.f12087f - this.f12089h;
    }

    public final boolean f() {
        if (this.f12091j) {
            return !this.f12092k || this.a.q() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g() throws com.google.android.gms.internal.ads.zzku {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzrp r0 = r6.p
            com.google.android.gms.internal.ads.zzlp[] r1 = r6.o
            com.google.android.gms.internal.ads.zzqj r2 = r6.a
            com.google.android.gms.internal.ads.zzrb r2 = r2.l()
            com.google.android.gms.internal.ads.zzrr r0 = r0.b(r1, r2)
            com.google.android.gms.internal.ads.zzrr r1 = r6.s
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L16
        L14:
            r1 = 0
            goto L28
        L16:
            r4 = 0
        L17:
            com.google.android.gms.internal.ads.zzro r5 = r0.f15499b
            int r5 = r5.a
            if (r4 >= r5) goto L27
            boolean r5 = r0.a(r1, r4)
            if (r5 != 0) goto L24
            goto L14
        L24:
            int r4 = r4 + 1
            goto L17
        L27:
            r1 = 1
        L28:
            if (r1 == 0) goto L2b
            return r3
        L2b:
            r6.m = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r00.g():boolean");
    }
}
