package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class a8 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ boolean f11064f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzbcq f11065g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a8(zzbcq zzbcqVar, boolean z) {
        this.f11065g = zzbcqVar;
        this.f11064f = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11065g.x("windowVisibilityChanged", "isVisible", String.valueOf(this.f11064f));
    }
}
