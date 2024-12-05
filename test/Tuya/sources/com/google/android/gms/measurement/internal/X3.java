package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class X3 extends AbstractC2236o {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Y3 f16346e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X3(Y3 y32, InterfaceC2263t2 interfaceC2263t2) {
        super(interfaceC2263t2);
        this.f16346e = y32;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2236o
    public final void c() {
        Y3 y32 = this.f16346e;
        y32.f16398d.h();
        y32.d(false, false, y32.f16398d.f16777a.a().elapsedRealtime());
        y32.f16398d.f16777a.y().n(y32.f16398d.f16777a.a().elapsedRealtime());
    }
}
