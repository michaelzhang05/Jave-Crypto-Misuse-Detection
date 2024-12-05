package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.i0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2013i0 extends P implements InterfaceC2029k0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2013i0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2029k0
    public final void G(Bundle bundle) {
        Parcel i8 = i();
        S.d(i8, bundle);
        l(1, i8);
    }
}
