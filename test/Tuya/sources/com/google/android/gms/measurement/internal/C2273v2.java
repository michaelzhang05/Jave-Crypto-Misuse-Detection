package com.google.android.gms.measurement.internal;

import android.util.Log;
import m0.InterfaceC3392e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.v2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2273v2 implements InterfaceC3392e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Y1 f16893a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2273v2(C2278w2 c2278w2, Y1 y12) {
        this.f16893a = y12;
    }

    @Override // m0.InterfaceC3392e
    public final boolean a() {
        if (this.f16893a.q() && Log.isLoggable(this.f16893a.d().D(), 3)) {
            return true;
        }
        return false;
    }
}
