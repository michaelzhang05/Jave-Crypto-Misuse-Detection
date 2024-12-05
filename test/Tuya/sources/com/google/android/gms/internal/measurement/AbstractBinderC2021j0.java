package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC2021j0 extends Q implements InterfaceC2029k0 {
    public AbstractBinderC2021j0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.Q
    protected final boolean i(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            Bundle bundle = (Bundle) S.a(parcel, Bundle.CREATOR);
            S.c(parcel);
            G(bundle);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
