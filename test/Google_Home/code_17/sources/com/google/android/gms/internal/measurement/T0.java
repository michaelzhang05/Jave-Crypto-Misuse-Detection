package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class T0 extends Y implements R0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public T0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.R0
    public final void e(Bundle bundle) {
        Parcel h8 = h();
        AbstractC2066a0.d(h8, bundle);
        k(1, h8);
    }
}
