package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class g6 extends Thread {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f11467f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g6(f6 f6Var, String str) {
        this.f11467f = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new zzbah().a(this.f11467f);
    }
}
