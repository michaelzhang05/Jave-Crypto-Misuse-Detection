package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class y7 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zzbcq f12439f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y7(zzbcq zzbcqVar) {
        this.f12439f = zzbcqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12439f.x("surfaceCreated", new String[0]);
    }
}
