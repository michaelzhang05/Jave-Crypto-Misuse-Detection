package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zac implements Parcelable.Creator<DataHolder> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DataHolder createFromParcel(Parcel parcel) {
        int I = SafeParcelReader.I(parcel);
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < I) {
            int z = SafeParcelReader.z(parcel);
            int v = SafeParcelReader.v(z);
            if (v == 1) {
                strArr = SafeParcelReader.q(parcel, z);
            } else if (v == 2) {
                cursorWindowArr = (CursorWindow[]) SafeParcelReader.s(parcel, z, CursorWindow.CREATOR);
            } else if (v == 3) {
                i3 = SafeParcelReader.B(parcel, z);
            } else if (v == 4) {
                bundle = SafeParcelReader.f(parcel, z);
            } else if (v != 1000) {
                SafeParcelReader.H(parcel, z);
            } else {
                i2 = SafeParcelReader.B(parcel, z);
            }
        }
        SafeParcelReader.u(parcel, I);
        DataHolder dataHolder = new DataHolder(i2, strArr, cursorWindowArr, i3, bundle);
        dataHolder.Y();
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DataHolder[] newArray(int i2) {
        return new DataHolder[i2];
    }
}
