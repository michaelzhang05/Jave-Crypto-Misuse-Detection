package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class x30 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f12369f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ long f12370g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ long f12371h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ zzto f12372i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x30(zzto zztoVar, String str, long j2, long j3) {
        this.f12372i = zztoVar;
        this.f12369f = str;
        this.f12370g = j2;
        this.f12371h = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zztn zztnVar;
        zztnVar = this.f12372i.f15598b;
        zztnVar.g(this.f12369f, this.f12370g, this.f12371h);
    }
}
