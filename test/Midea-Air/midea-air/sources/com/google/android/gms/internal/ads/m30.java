package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzag;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class m30 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f11794f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ long f11795g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ zzr f11796h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m30(zzr zzrVar, String str, long j2) {
        this.f11796h = zzrVar;
        this.f11794f = str;
        this.f11795g = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzag.a aVar;
        zzag.a aVar2;
        aVar = this.f11796h.f15456f;
        aVar.a(this.f11794f, this.f11795g);
        aVar2 = this.f11796h.f15456f;
        aVar2.b(this.f11796h.toString());
    }
}
