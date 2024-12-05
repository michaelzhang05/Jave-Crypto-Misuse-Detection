package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class mz implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f11831f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ long f11832g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ zzhd f11833h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public mz(zzhd zzhdVar, int i2, long j2) {
        this.f11833h = zzhdVar;
        this.f11831f = i2;
        this.f11832g = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhh zzhhVar;
        zzhhVar = this.f11833h.H;
        zzhhVar.a(this.f11831f, this.f11832g);
    }
}
