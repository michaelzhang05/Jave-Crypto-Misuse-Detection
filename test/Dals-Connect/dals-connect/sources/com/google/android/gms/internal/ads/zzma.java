package com.google.android.gms.internal.ads;

import android.os.Handler;

/* loaded from: classes2.dex */
public final class zzma {
    private final Handler a;

    /* renamed from: b, reason: collision with root package name */
    private final zzlz f15279b;

    public zzma(Handler handler, zzlz zzlzVar) {
        this.a = zzlzVar != null ? (Handler) zzsk.d(handler) : null;
        this.f15279b = zzlzVar;
    }

    public final void b(int i2) {
        if (this.f15279b != null) {
            this.a.post(new a10(this, i2));
        }
    }

    public final void c(zzlh zzlhVar) {
        if (this.f15279b != null) {
            this.a.post(new x00(this, zzlhVar));
        }
    }

    public final void d(zznc zzncVar) {
        if (this.f15279b != null) {
            this.a.post(new v00(this, zzncVar));
        }
    }

    public final void e(String str, long j2, long j3) {
        if (this.f15279b != null) {
            this.a.post(new w00(this, str, j2, j3));
        }
    }

    public final void f(int i2, long j2, long j3) {
        if (this.f15279b != null) {
            this.a.post(new y00(this, i2, j2, j3));
        }
    }

    public final void g(zznc zzncVar) {
        if (this.f15279b != null) {
            this.a.post(new z00(this, zzncVar));
        }
    }
}
