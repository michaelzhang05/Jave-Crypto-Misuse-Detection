package l0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: l0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3268c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        String str = null;
        com.google.android.gms.measurement.internal.C c8 = null;
        String str2 = null;
        long j8 = 0;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            int l8 = R.b.l(r8);
            if (l8 != 2) {
                if (l8 != 3) {
                    if (l8 != 4) {
                        if (l8 != 5) {
                            R.b.x(parcel, r8);
                        } else {
                            j8 = R.b.u(parcel, r8);
                        }
                    } else {
                        str2 = R.b.f(parcel, r8);
                    }
                } else {
                    c8 = (com.google.android.gms.measurement.internal.C) R.b.e(parcel, r8, com.google.android.gms.measurement.internal.C.CREATOR);
                }
            } else {
                str = R.b.f(parcel, r8);
            }
        }
        R.b.k(parcel, y8);
        return new com.google.android.gms.measurement.internal.G(str, c8, str2, j8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new com.google.android.gms.measurement.internal.G[i8];
    }
}
