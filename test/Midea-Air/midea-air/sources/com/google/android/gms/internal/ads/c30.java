package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
final class c30 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ IOException f11207f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ y20 f11208g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c30(y20 y20Var, IOException iOException) {
        this.f11208g = y20Var;
        this.f11207f = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzqi zzqiVar;
        zzqiVar = this.f11208g.f12426j;
        zzqiVar.f(this.f11207f);
    }
}
