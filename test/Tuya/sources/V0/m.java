package v0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        long j8 = 0;
        String str = null;
        String str2 = null;
        double d8 = 0.0d;
        int i8 = 0;
        int i9 = -1;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            switch (S.b.l(r8)) {
                case 2:
                    i8 = S.b.t(parcel, r8);
                    break;
                case 3:
                    str = S.b.f(parcel, r8);
                    break;
                case 4:
                    d8 = S.b.o(parcel, r8);
                    break;
                case 5:
                    str2 = S.b.f(parcel, r8);
                    break;
                case 6:
                    j8 = S.b.u(parcel, r8);
                    break;
                case 7:
                    i9 = S.b.t(parcel, r8);
                    break;
                default:
                    S.b.x(parcel, r8);
                    break;
            }
        }
        S.b.k(parcel, y8);
        return new C3814d(i8, str, d8, str2, j8, i9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3814d[i8];
    }
}
