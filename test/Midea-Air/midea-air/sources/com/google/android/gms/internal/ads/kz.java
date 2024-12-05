package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class kz implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f11738f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ int f11739g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ float f11740h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ zzhd f11741i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public kz(zzhd zzhdVar, int i2, int i3, float f2) {
        this.f11741i = zzhdVar;
        this.f11738f = i2;
        this.f11739g = i3;
        this.f11740h = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhh zzhhVar;
        zzhhVar = this.f11741i.H;
        zzhhVar.e(this.f11738f, this.f11739g, this.f11740h);
    }
}
