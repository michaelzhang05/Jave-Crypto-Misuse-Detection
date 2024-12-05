package v0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        String str = null;
        String str2 = null;
        C3816f c3816f = null;
        C3817g c3817g = null;
        C3817g c3817g2 = null;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            int l8 = S.b.l(r8);
            if (l8 != 2) {
                if (l8 != 3) {
                    if (l8 != 4) {
                        if (l8 != 5) {
                            if (l8 != 6) {
                                S.b.x(parcel, r8);
                            } else {
                                c3817g2 = (C3817g) S.b.e(parcel, r8, C3817g.CREATOR);
                            }
                        } else {
                            c3817g = (C3817g) S.b.e(parcel, r8, C3817g.CREATOR);
                        }
                    } else {
                        c3816f = (C3816f) S.b.e(parcel, r8, C3816f.CREATOR);
                    }
                } else {
                    str2 = S.b.f(parcel, r8);
                }
            } else {
                str = S.b.f(parcel, r8);
            }
        }
        S.b.k(parcel, y8);
        return new C3818h(str, str2, c3816f, c3817g, c3817g2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3818h[i8];
    }
}
