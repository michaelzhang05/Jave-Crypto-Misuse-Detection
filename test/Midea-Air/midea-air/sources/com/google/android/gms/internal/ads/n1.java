package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final /* synthetic */ class n1 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final zzajw f11835f;

    private n1(zzajw zzajwVar) {
        this.f11835f = zzajwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable a(zzajw zzajwVar) {
        return new n1(zzajwVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11835f.destroy();
    }
}
