package com.google.android.gms.common.api.internal;

/* loaded from: classes2.dex */
final class g0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.signin.internal.zaj f10624f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zace f10625g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(zace zaceVar, com.google.android.gms.signin.internal.zaj zajVar) {
        this.f10625g = zaceVar;
        this.f10624f = zajVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10625g.O5(this.f10624f);
    }
}
