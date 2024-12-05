package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q6 = w1.b.q(parcel);
        int i6 = 0;
        String str = null;
        while (parcel.dataPosition() < q6) {
            int k6 = w1.b.k(parcel);
            int i7 = w1.b.i(k6);
            if (i7 == 1) {
                i6 = w1.b.m(parcel, k6);
            } else if (i7 != 2) {
                w1.b.p(parcel, k6);
            } else {
                str = w1.b.d(parcel, k6);
            }
        }
        w1.b.h(parcel, q6);
        return new Scope(i6, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new Scope[i6];
    }
}
