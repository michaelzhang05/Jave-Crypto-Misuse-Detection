package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.m0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC2045m0 extends Q implements InterfaceC2053n0 {
    public AbstractBinderC2045m0() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.Q
    protected final boolean i(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            if (i8 != 2) {
                return false;
            }
            int d8 = d();
            parcel2.writeNoException();
            parcel2.writeInt(d8);
        } else {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Bundle bundle = (Bundle) S.a(parcel, Bundle.CREATOR);
            long readLong = parcel.readLong();
            S.c(parcel);
            m(readString, readString2, bundle, readLong);
            parcel2.writeNoException();
        }
        return true;
    }
}
