package R;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class a0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        int i8 = 0;
        boolean z8 = false;
        boolean z9 = false;
        int i9 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            int l8 = S.b.l(r8);
            if (l8 != 1) {
                if (l8 != 2) {
                    if (l8 != 3) {
                        if (l8 != 4) {
                            if (l8 != 5) {
                                S.b.x(parcel, r8);
                            } else {
                                i10 = S.b.t(parcel, r8);
                            }
                        } else {
                            i9 = S.b.t(parcel, r8);
                        }
                    } else {
                        z9 = S.b.m(parcel, r8);
                    }
                } else {
                    z8 = S.b.m(parcel, r8);
                }
            } else {
                i8 = S.b.t(parcel, r8);
            }
        }
        S.b.k(parcel, y8);
        return new r(i8, z8, z9, i9, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new r[i8];
    }
}
