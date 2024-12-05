package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class f5 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ Context f11396f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzaxi f11397g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f5(zzaxi zzaxiVar, Context context) {
        this.f11397g = zzaxiVar;
        this.f11396f = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        obj = this.f11397g.f13082e;
        synchronized (obj) {
            this.f11397g.f13083f = zzaxi.w(this.f11396f);
            obj2 = this.f11397g.f13082e;
            obj2.notifyAll();
        }
    }
}
