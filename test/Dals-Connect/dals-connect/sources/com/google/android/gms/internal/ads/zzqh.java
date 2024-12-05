package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzqh implements zzql, zzqm {

    /* renamed from: f, reason: collision with root package name */
    private final Uri f15423f;

    /* renamed from: g, reason: collision with root package name */
    private final zzrw f15424g;

    /* renamed from: h, reason: collision with root package name */
    private final zznq f15425h;

    /* renamed from: j, reason: collision with root package name */
    private final Handler f15427j;

    /* renamed from: k, reason: collision with root package name */
    private final zzqi f15428k;
    private final int n;
    private zzqm o;
    private zzlr p;
    private boolean q;

    /* renamed from: i, reason: collision with root package name */
    private final int f15426i = -1;
    private final String m = null;
    private final zzlt l = new zzlt();

    public zzqh(Uri uri, zzrw zzrwVar, zznq zznqVar, int i2, Handler handler, zzqi zzqiVar, String str, int i3) {
        this.f15423f = uri;
        this.f15424g = zzrwVar;
        this.f15425h = zznqVar;
        this.f15427j = handler;
        this.f15428k = zzqiVar;
        this.n = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzql
    public final void a(zzkv zzkvVar, boolean z, zzqm zzqmVar) {
        this.o = zzqmVar;
        zzqz zzqzVar = new zzqz(-9223372036854775807L, false);
        this.p = zzqzVar;
        zzqmVar.d(zzqzVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzql
    public final zzqj b(int i2, zzrt zzrtVar) {
        zzsk.a(i2 == 0);
        return new y20(this.f15423f, this.f15424g.a(), this.f15425h.a(), this.f15426i, this.f15427j, this.f15428k, this, zzrtVar, null, this.n);
    }

    @Override // com.google.android.gms.internal.ads.zzql
    public final void c(zzqj zzqjVar) {
        ((y20) zzqjVar).o();
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final void d(zzlr zzlrVar, Object obj) {
        boolean z = zzlrVar.c(0, this.l, false).f15260d != -9223372036854775807L;
        if (!this.q || z) {
            this.p = zzlrVar;
            this.q = z;
            this.o.d(zzlrVar, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzql
    public final void e() {
        this.o = null;
    }

    @Override // com.google.android.gms.internal.ads.zzql
    public final void f() throws IOException {
    }
}
