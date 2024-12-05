package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;

/* loaded from: classes2.dex */
final class g30 implements zzqj, zzqk {

    /* renamed from: f, reason: collision with root package name */
    public final zzqj[] f11456f;

    /* renamed from: g, reason: collision with root package name */
    private final IdentityHashMap<zzqw, Integer> f11457g = new IdentityHashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private zzqk f11458h;

    /* renamed from: i, reason: collision with root package name */
    private int f11459i;

    /* renamed from: j, reason: collision with root package name */
    private zzrb f11460j;

    /* renamed from: k, reason: collision with root package name */
    private zzqj[] f11461k;
    private zzqx l;

    public g30(zzqj... zzqjVarArr) {
        this.f11456f = zzqjVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzqj, com.google.android.gms.internal.ads.zzqx
    public final long a() {
        return this.l.a();
    }

    @Override // com.google.android.gms.internal.ads.zzqj, com.google.android.gms.internal.ads.zzqx
    public final boolean b(long j2) {
        return this.l.b(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzqk
    public final void c(zzqj zzqjVar) {
        int i2 = this.f11459i - 1;
        this.f11459i = i2;
        if (i2 > 0) {
            return;
        }
        int i3 = 0;
        for (zzqj zzqjVar2 : this.f11456f) {
            i3 += zzqjVar2.l().f15464b;
        }
        zzra[] zzraVarArr = new zzra[i3];
        int i4 = 0;
        for (zzqj zzqjVar3 : this.f11456f) {
            zzrb l = zzqjVar3.l();
            int i5 = l.f15464b;
            int i6 = 0;
            while (i6 < i5) {
                zzraVarArr[i4] = l.b(i6);
                i6++;
                i4++;
            }
        }
        this.f11460j = new zzrb(zzraVarArr);
        this.f11458h.c(this);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final long d(zzrm[] zzrmVarArr, boolean[] zArr, zzqw[] zzqwVarArr, boolean[] zArr2, long j2) {
        zzqw[] zzqwVarArr2 = zzqwVarArr;
        int[] iArr = new int[zzrmVarArr.length];
        int[] iArr2 = new int[zzrmVarArr.length];
        for (int i2 = 0; i2 < zzrmVarArr.length; i2++) {
            iArr[i2] = zzqwVarArr2[i2] == null ? -1 : this.f11457g.get(zzqwVarArr2[i2]).intValue();
            iArr2[i2] = -1;
            if (zzrmVarArr[i2] != null) {
                zzra a = zzrmVarArr[i2].a();
                int i3 = 0;
                while (true) {
                    zzqj[] zzqjVarArr = this.f11456f;
                    if (i3 >= zzqjVarArr.length) {
                        break;
                    }
                    if (zzqjVarArr[i3].l().a(a) != -1) {
                        iArr2[i2] = i3;
                        break;
                    }
                    i3++;
                }
            }
        }
        this.f11457g.clear();
        int length = zzrmVarArr.length;
        zzqw[] zzqwVarArr3 = new zzqw[length];
        zzqw[] zzqwVarArr4 = new zzqw[zzrmVarArr.length];
        zzrm[] zzrmVarArr2 = new zzrm[zzrmVarArr.length];
        ArrayList arrayList = new ArrayList(this.f11456f.length);
        long j3 = j2;
        int i4 = 0;
        while (i4 < this.f11456f.length) {
            for (int i5 = 0; i5 < zzrmVarArr.length; i5++) {
                zzrm zzrmVar = null;
                zzqwVarArr4[i5] = iArr[i5] == i4 ? zzqwVarArr2[i5] : null;
                if (iArr2[i5] == i4) {
                    zzrmVar = zzrmVarArr[i5];
                }
                zzrmVarArr2[i5] = zzrmVar;
            }
            int i6 = i4;
            zzrm[] zzrmVarArr3 = zzrmVarArr2;
            ArrayList arrayList2 = arrayList;
            long d2 = this.f11456f[i4].d(zzrmVarArr2, zArr, zzqwVarArr4, zArr2, j3);
            if (i6 == 0) {
                j3 = d2;
            } else if (d2 != j3) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i7 = 0; i7 < zzrmVarArr.length; i7++) {
                if (iArr2[i7] == i6) {
                    zzsk.e(zzqwVarArr4[i7] != null);
                    zzqwVarArr3[i7] = zzqwVarArr4[i7];
                    this.f11457g.put(zzqwVarArr4[i7], Integer.valueOf(i6));
                    z = true;
                } else if (iArr[i7] == i6) {
                    zzsk.e(zzqwVarArr4[i7] == null);
                }
            }
            if (z) {
                arrayList2.add(this.f11456f[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            zzrmVarArr2 = zzrmVarArr3;
            zzqwVarArr2 = zzqwVarArr;
        }
        zzqw[] zzqwVarArr5 = zzqwVarArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzqwVarArr3, 0, zzqwVarArr5, 0, length);
        zzqj[] zzqjVarArr2 = new zzqj[arrayList3.size()];
        this.f11461k = zzqjVarArr2;
        arrayList3.toArray(zzqjVarArr2);
        this.l = new zzpy(this.f11461k);
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final long e() {
        long e2 = this.f11456f[0].e();
        int i2 = 1;
        while (true) {
            zzqj[] zzqjVarArr = this.f11456f;
            if (i2 >= zzqjVarArr.length) {
                if (e2 != -9223372036854775807L) {
                    for (zzqj zzqjVar : this.f11461k) {
                        if (zzqjVar != this.f11456f[0] && zzqjVar.h(e2) != e2) {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return e2;
            }
            if (zzqjVarArr[i2].e() != -9223372036854775807L) {
                throw new IllegalStateException("Child reported discontinuity");
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void f() throws IOException {
        for (zzqj zzqjVar : this.f11456f) {
            zzqjVar.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqy
    public final /* synthetic */ void g(zzqj zzqjVar) {
        if (this.f11460j != null) {
            this.f11458h.g(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final long h(long j2) {
        long h2 = this.f11461k[0].h(j2);
        int i2 = 1;
        while (true) {
            zzqj[] zzqjVarArr = this.f11461k;
            if (i2 >= zzqjVarArr.length) {
                return h2;
            }
            if (zzqjVarArr[i2].h(h2) != h2) {
                throw new IllegalStateException("Children seeked to different positions");
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void j(zzqk zzqkVar, long j2) {
        this.f11458h = zzqkVar;
        zzqj[] zzqjVarArr = this.f11456f;
        this.f11459i = zzqjVarArr.length;
        for (zzqj zzqjVar : zzqjVarArr) {
            zzqjVar.j(this, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void k(long j2) {
        for (zzqj zzqjVar : this.f11461k) {
            zzqjVar.k(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final zzrb l() {
        return this.f11460j;
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final long q() {
        long j2 = Long.MAX_VALUE;
        for (zzqj zzqjVar : this.f11461k) {
            long q = zzqjVar.q();
            if (q != Long.MIN_VALUE) {
                j2 = Math.min(j2, q);
            }
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j2;
    }
}
