package v0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        long j8 = 0;
        long j9 = 0;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            int l8 = S.b.l(r8);
            if (l8 != 2) {
                if (l8 != 3) {
                    S.b.x(parcel, r8);
                } else {
                    j9 = S.b.u(parcel, r8);
                }
            } else {
                j8 = S.b.u(parcel, r8);
            }
        }
        S.b.k(parcel, y8);
        return new C3816f(j8, j9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3816f[i8];
    }
}