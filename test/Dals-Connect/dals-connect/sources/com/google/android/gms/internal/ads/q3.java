package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class q3 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zzbah f12037f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f12038g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q3(zzaqx zzaqxVar, zzbah zzbahVar, String str) {
        this.f12037f = zzbahVar;
        this.f12038g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12037f.a(this.f12038g);
    }
}
