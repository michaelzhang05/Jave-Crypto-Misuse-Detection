package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class U0 extends AbstractBinderC2076b0 implements R0 {
    public U0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC2076b0
    protected final boolean h(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            Bundle bundle = (Bundle) AbstractC2066a0.a(parcel, Bundle.CREATOR);
            AbstractC2066a0.f(parcel);
            e(bundle);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
