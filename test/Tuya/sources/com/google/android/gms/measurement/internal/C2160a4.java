package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.HandlerC1960c0;

/* renamed from: com.google.android.gms.measurement.internal.a4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2160a4 extends A1 {

    /* renamed from: c, reason: collision with root package name */
    private Handler f16422c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16423d;

    /* renamed from: e, reason: collision with root package name */
    protected final Z3 f16424e;

    /* renamed from: f, reason: collision with root package name */
    protected final Y3 f16425f;

    /* renamed from: g, reason: collision with root package name */
    protected final W3 f16426g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2160a4(Y1 y12) {
        super(y12);
        this.f16423d = true;
        this.f16424e = new Z3(this);
        this.f16425f = new Y3(this);
        this.f16426g = new W3(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void q(C2160a4 c2160a4, long j8) {
        c2160a4.h();
        c2160a4.u();
        c2160a4.f16777a.d().v().b("Activity paused, time", Long.valueOf(j8));
        c2160a4.f16426g.a(j8);
        if (c2160a4.f16777a.z().D()) {
            c2160a4.f16425f.b(j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void r(C2160a4 c2160a4, long j8) {
        c2160a4.h();
        c2160a4.u();
        c2160a4.f16777a.d().v().b("Activity resumed, time", Long.valueOf(j8));
        if (c2160a4.f16777a.z().B(null, AbstractC2217k1.f16562I0)) {
            if (c2160a4.f16777a.z().D() || c2160a4.f16423d) {
                c2160a4.f16425f.c(j8);
            }
        } else if (c2160a4.f16777a.z().D() || c2160a4.f16777a.F().f16162r.b()) {
            c2160a4.f16425f.c(j8);
        }
        c2160a4.f16426g.b();
        Z3 z32 = c2160a4.f16424e;
        z32.f16409a.h();
        if (!z32.f16409a.f16777a.o()) {
            return;
        }
        z32.b(z32.f16409a.f16777a.a().currentTimeMillis(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        h();
        if (this.f16422c == null) {
            this.f16422c = new HandlerC1960c0(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.A1
    protected final boolean n() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s(boolean z8) {
        h();
        this.f16423d = z8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean t() {
        h();
        return this.f16423d;
    }
}
