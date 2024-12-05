package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class N0 extends AbstractBinderC2045m0 {

    /* renamed from: a, reason: collision with root package name */
    private final m0.u f15398a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public N0(m0.u uVar) {
        this.f15398a = uVar;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2053n0
    public final int d() {
        return System.identityHashCode(this.f15398a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2053n0
    public final void m(String str, String str2, Bundle bundle, long j8) {
        this.f15398a.a(str, str2, bundle, j8);
    }
}
