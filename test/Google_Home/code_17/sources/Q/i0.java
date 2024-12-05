package Q;

import N.C1333d;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class i0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        Bundle bundle = null;
        C1333d[] c1333dArr = null;
        C1389e c1389e = null;
        int i8 = 0;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            int l8 = R.b.l(r8);
            if (l8 != 1) {
                if (l8 != 2) {
                    if (l8 != 3) {
                        if (l8 != 4) {
                            R.b.x(parcel, r8);
                        } else {
                            c1389e = (C1389e) R.b.e(parcel, r8, C1389e.CREATOR);
                        }
                    } else {
                        i8 = R.b.t(parcel, r8);
                    }
                } else {
                    c1333dArr = (C1333d[]) R.b.i(parcel, r8, C1333d.CREATOR);
                }
            } else {
                bundle = R.b.a(parcel, r8);
            }
        }
        R.b.k(parcel, y8);
        return new h0(bundle, c1333dArr, i8, c1389e);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new h0[i8];
    }
}
