package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class z7 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zzbcq f12506f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z7(zzbcq zzbcqVar) {
        this.f12506f = zzbcqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12506f.x("surfaceDestroyed", new String[0]);
    }
}
