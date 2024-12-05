package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC2053n0;

/* loaded from: classes3.dex */
final class C4 implements m0.u {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2053n0 f16035a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f16036b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2053n0 interfaceC2053n0) {
        this.f16036b = appMeasurementDynamiteService;
        this.f16035a = interfaceC2053n0;
    }

    @Override // m0.u
    public final void a(String str, String str2, Bundle bundle, long j8) {
        try {
            this.f16035a.m(str, str2, bundle, j8);
        } catch (RemoteException e8) {
            Y1 y12 = this.f16036b.f16009a;
            if (y12 != null) {
                y12.d().w().b("Event listener threw exception", e8);
            }
        }
    }
}
