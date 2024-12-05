package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class V0 extends AbstractBinderC2076b0 implements W0 {
    public V0() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC2076b0
    protected final boolean h(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            if (i8 != 2) {
                return false;
            }
            int w8 = w();
            parcel2.writeNoException();
            parcel2.writeInt(w8);
        } else {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Bundle bundle = (Bundle) AbstractC2066a0.a(parcel, Bundle.CREATOR);
            long readLong = parcel.readLong();
            AbstractC2066a0.f(parcel);
            c0(readString, readString2, bundle, readLong);
            parcel2.writeNoException();
        }
        return true;
    }
}
