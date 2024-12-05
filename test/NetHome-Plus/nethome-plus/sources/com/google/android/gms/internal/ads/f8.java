package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
@zzard
/* loaded from: classes2.dex */
public final class f8 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private zzbcq f11403f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f11404g = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f8(zzbcq zzbcqVar) {
        this.f11403f = zzbcqVar;
    }

    private final void c() {
        Handler handler = zzaxi.a;
        handler.removeCallbacks(this);
        handler.postDelayed(this, 250L);
    }

    public final void a() {
        this.f11404g = true;
        this.f11403f.G();
    }

    public final void b() {
        this.f11404g = false;
        c();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f11404g) {
            return;
        }
        this.f11403f.G();
        c();
    }
}
