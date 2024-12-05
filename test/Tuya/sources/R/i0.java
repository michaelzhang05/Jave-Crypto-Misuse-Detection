package R;

import O.C1260d;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class i0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        Bundle bundle = null;
        C1260d[] c1260dArr = null;
        C1308e c1308e = null;
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
                            c1308e = (C1308e) S.b.e(parcel, r8, C1308e.CREATOR);
                        }
                    } else {
                        i8 = S.b.t(parcel, r8);
                    }
                } else {
                    c1260dArr = (C1260d[]) S.b.i(parcel, r8, C1260d.CREATOR);
                }
            } else {
                bundle = S.b.a(parcel, r8);
            }
        }
        S.b.k(parcel, y8);
        return new h0(bundle, c1260dArr, i8, c1308e);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new h0[i8];
    }
}
