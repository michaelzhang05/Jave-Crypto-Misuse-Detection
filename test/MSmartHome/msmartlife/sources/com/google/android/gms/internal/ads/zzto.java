package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;

/* loaded from: classes2.dex */
public final class zzto {
    private final Handler a;

    /* renamed from: b, reason: collision with root package name */
    private final zztn f15598b;

    public zzto(Handler handler, zztn zztnVar) {
        this.a = zztnVar != null ? (Handler) zzsk.d(handler) : null;
        this.f15598b = zztnVar;
    }

    public final void b(int i2, int i3, int i4, float f2) {
        if (this.f15598b != null) {
            this.a.post(new a40(this, i2, i3, i4, f2));
        }
    }

    public final void c(Surface surface) {
        if (this.f15598b != null) {
            this.a.post(new b40(this, surface));
        }
    }

    public final void d(zzlh zzlhVar) {
        if (this.f15598b != null) {
            this.a.post(new y30(this, zzlhVar));
        }
    }

    public final void e(zznc zzncVar) {
        if (this.f15598b != null) {
            this.a.post(new w30(this, zzncVar));
        }
    }

    public final void f(String str, long j2, long j3) {
        if (this.f15598b != null) {
            this.a.post(new x30(this, str, j2, j3));
        }
    }

    public final void g(zznc zzncVar) {
        if (this.f15598b != null) {
            this.a.post(new c40(this, zzncVar));
        }
    }

    public final void h(int i2, long j2) {
        if (this.f15598b != null) {
            this.a.post(new z30(this, i2, j2));
        }
    }
}
