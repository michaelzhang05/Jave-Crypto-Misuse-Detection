package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a30 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ y20 f11050f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a30(y20 y20Var) {
        this.f11050f = y20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        zzqk zzqkVar;
        z = this.f11050f.M;
        if (z) {
            return;
        }
        zzqkVar = this.f11050f.v;
        zzqkVar.g(this.f11050f);
    }
}
