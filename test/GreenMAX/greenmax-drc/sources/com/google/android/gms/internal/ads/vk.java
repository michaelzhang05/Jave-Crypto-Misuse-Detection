package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final /* synthetic */ class vk implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final zzced f12288f;

    private vk(zzced zzcedVar) {
        this.f12288f = zzcedVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable a(zzced zzcedVar) {
        return new vk(zzcedVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12288f.b();
    }
}
