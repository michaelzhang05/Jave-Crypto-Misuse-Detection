package v0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        String str = null;
        C3814d c3814d = null;
        C3816f c3816f = null;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            int l8 = S.b.l(r8);
            if (l8 != 2) {
                if (l8 != 3) {
                    if (l8 != 5) {
                        S.b.x(parcel, r8);
                    } else {
                        c3816f = (C3816f) S.b.e(parcel, r8, C3816f.CREATOR);
                    }
                } else {
                    c3814d = (C3814d) S.b.e(parcel, r8, C3814d.CREATOR);
                }
            } else {
                str = S.b.f(parcel, r8);
            }
        }
        S.b.k(parcel, y8);
        return new C3813c(str, c3814d, c3816f);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3813c[i8];
    }
}
