package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class z30 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f12500f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ long f12501g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ zzto f12502h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z30(zzto zztoVar, int i2, long j2) {
        this.f12502h = zztoVar;
        this.f12500f = i2;
        this.f12501g = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zztn zztnVar;
        zztnVar = this.f12502h.f15598b;
        zztnVar.a(this.f12500f, this.f12501g);
    }
}
