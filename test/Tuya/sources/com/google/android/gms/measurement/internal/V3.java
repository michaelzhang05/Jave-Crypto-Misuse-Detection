package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.U6;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class V3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final long f16319a;

    /* renamed from: b, reason: collision with root package name */
    final long f16320b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ W3 f16321c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public V3(W3 w32, long j8, long j9) {
        this.f16321c = w32;
        this.f16319a = j8;
        this.f16320b = j9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16321c.f16340b.f16777a.f().z(new Runnable() { // from class: com.google.android.gms.measurement.internal.U3
            @Override // java.lang.Runnable
            public final void run() {
                V3 v32 = V3.this;
                W3 w32 = v32.f16321c;
                long j8 = v32.f16319a;
                long j9 = v32.f16320b;
                w32.f16340b.h();
                w32.f16340b.f16777a.d().q().a("Application going to the background");
                w32.f16340b.f16777a.F().f16162r.a(true);
                w32.f16340b.s(true);
                if (!w32.f16340b.f16777a.z().D()) {
                    w32.f16340b.f16425f.b(j9);
                    w32.f16340b.f16425f.d(false, false, j9);
                }
                U6.c();
                if (w32.f16340b.f16777a.z().B(null, AbstractC2217k1.f16552D0)) {
                    w32.f16340b.f16777a.d().u().b("Application backgrounded at: timestamp_millis", Long.valueOf(j8));
                } else {
                    w32.f16340b.f16777a.I().v("auto", "_ab", j8, new Bundle());
                }
            }
        });
    }
}
