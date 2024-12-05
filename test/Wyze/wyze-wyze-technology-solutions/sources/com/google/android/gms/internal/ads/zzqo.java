package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzqo implements zzql {

    /* renamed from: f, reason: collision with root package name */
    private final zzql[] f15429f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList<zzql> f15430g;

    /* renamed from: i, reason: collision with root package name */
    private zzqm f15432i;

    /* renamed from: j, reason: collision with root package name */
    private zzlr f15433j;

    /* renamed from: k, reason: collision with root package name */
    private Object f15434k;
    private zzqq m;

    /* renamed from: h, reason: collision with root package name */
    private final zzlu f15431h = new zzlu();
    private int l = -1;

    public zzqo(zzql... zzqlVarArr) {
        this.f15429f = zzqlVarArr;
        this.f15430g = new ArrayList<>(Arrays.asList(zzqlVarArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(int i2, zzlr zzlrVar, Object obj) {
        zzqq zzqqVar;
        if (this.m == null) {
            int g2 = zzlrVar.g();
            int i3 = 0;
            while (true) {
                if (i3 < g2) {
                    if (zzlrVar.d(i3, this.f15431h, false).f15266e) {
                        zzqqVar = new zzqq(0);
                        break;
                    }
                    i3++;
                } else {
                    if (this.l == -1) {
                        this.l = zzlrVar.h();
                    } else if (zzlrVar.h() != this.l) {
                        zzqqVar = new zzqq(1);
                    }
                    zzqqVar = null;
                }
            }
            this.m = zzqqVar;
        }
        if (this.m != null) {
            return;
        }
        this.f15430g.remove(this.f15429f[i2]);
        if (i2 == 0) {
            this.f15433j = zzlrVar;
            this.f15434k = obj;
        }
        if (this.f15430g.isEmpty()) {
            this.f15432i.d(this.f15433j, this.f15434k);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzql
    public final void a(zzkv zzkvVar, boolean z, zzqm zzqmVar) {
        this.f15432i = zzqmVar;
        int i2 = 0;
        while (true) {
            zzql[] zzqlVarArr = this.f15429f;
            if (i2 >= zzqlVarArr.length) {
                return;
            }
            zzqlVarArr[i2].a(zzkvVar, false, new h30(this, i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzql
    public final zzqj b(int i2, zzrt zzrtVar) {
        int length = this.f15429f.length;
        zzqj[] zzqjVarArr = new zzqj[length];
        for (int i3 = 0; i3 < length; i3++) {
            zzqjVarArr[i3] = this.f15429f[i3].b(i2, zzrtVar);
        }
        return new g30(zzqjVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzql
    public final void c(zzqj zzqjVar) {
        g30 g30Var = (g30) zzqjVar;
        int i2 = 0;
        while (true) {
            zzql[] zzqlVarArr = this.f15429f;
            if (i2 >= zzqlVarArr.length) {
                return;
            }
            zzqlVarArr[i2].c(g30Var.f11456f[i2]);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzql
    public final void e() {
        for (zzql zzqlVar : this.f15429f) {
            zzqlVar.e();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzql
    public final void f() throws IOException {
        zzqq zzqqVar = this.m;
        if (zzqqVar != null) {
            throw zzqqVar;
        }
        for (zzql zzqlVar : this.f15429f) {
            zzqlVar.f();
        }
    }
}
