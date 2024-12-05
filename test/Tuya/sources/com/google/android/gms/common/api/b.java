package com.google.android.gms.common.api;

import O.C1258b;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        C1258b c1258b = null;
        int i8 = 0;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            int l8 = S.b.l(r8);
            if (l8 != 1) {
                if (l8 != 2) {
                    if (l8 != 3) {
                        if (l8 != 4) {
                            S.b.x(parcel, r8);
                        } else {
                            c1258b = (C1258b) S.b.e(parcel, r8, C1258b.CREATOR);
                        }
                    } else {
                        pendingIntent = (PendingIntent) S.b.e(parcel, r8, PendingIntent.CREATOR);
                    }
                } else {
                    str = S.b.f(parcel, r8);
                }
            } else {
                i8 = S.b.t(parcel, r8);
            }
        }
        S.b.k(parcel, y8);
        return new Status(i8, str, pendingIntent, c1258b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new Status[i8];
    }
}
