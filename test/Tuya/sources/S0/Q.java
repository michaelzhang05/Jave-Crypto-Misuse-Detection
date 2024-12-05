package s0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class Q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        int i8 = 0;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            int l8 = S.b.l(r8);
            if (l8 != 2) {
                if (l8 != 3) {
                    if (l8 != 4) {
                        S.b.x(parcel, r8);
                    } else {
                        i8 = S.b.t(parcel, r8);
                    }
                } else {
                    str2 = S.b.f(parcel, r8);
                }
            } else {
                str = S.b.f(parcel, r8);
            }
        }
        S.b.k(parcel, y8);
        return new C3714d(str, str2, i8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3714d[i8];
    }
}
