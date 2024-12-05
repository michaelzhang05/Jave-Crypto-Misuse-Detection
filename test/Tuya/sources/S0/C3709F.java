package s0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: s0.F, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3709F implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        int i8 = 0;
        String str = null;
        String str2 = null;
        int i9 = 0;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            int l8 = S.b.l(r8);
            if (l8 != 2) {
                if (l8 != 3) {
                    if (l8 != 4) {
                        if (l8 != 5) {
                            S.b.x(parcel, r8);
                        } else {
                            i9 = S.b.t(parcel, r8);
                        }
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
        return new C3708E(str, str2, i8, i9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3708E[i8];
    }
}
