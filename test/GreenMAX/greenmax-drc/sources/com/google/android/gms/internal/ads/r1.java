package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final /* synthetic */ class r1 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final zzajw f12093f;

    private r1(zzajw zzajwVar) {
        this.f12093f = zzajwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable a(zzajw zzajwVar) {
        return new r1(zzajwVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12093f.destroy();
    }
}
