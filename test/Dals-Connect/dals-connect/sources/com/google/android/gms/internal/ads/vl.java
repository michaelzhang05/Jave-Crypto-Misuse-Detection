package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final /* synthetic */ class vl implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final zzced f12289f;

    private vl(zzced zzcedVar) {
        this.f12289f = zzcedVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable a(zzced zzcedVar) {
        return new vl(zzcedVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12289f.b();
    }
}
