package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class kg implements zzbam<zzp, Bitmap> {
    private final /* synthetic */ double a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ boolean f11719b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ zzcan f11720c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public kg(zzcan zzcanVar, double d2, boolean z) {
        this.f11720c = zzcanVar;
        this.a = d2;
        this.f11719b = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final /* synthetic */ Bitmap a(zzp zzpVar) {
        Bitmap b2;
        b2 = this.f11720c.b(zzpVar.f15375b, this.a, this.f11719b);
        return b2;
    }
}
