package R;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class H implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        String str = null;
        String str2 = null;
        long j8 = 0;
        long j9 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            switch (S.b.l(r8)) {
                case 1:
                    i8 = S.b.t(parcel, r8);
                    break;
                case 2:
                    i9 = S.b.t(parcel, r8);
                    break;
                case 3:
                    i10 = S.b.t(parcel, r8);
                    break;
                case 4:
                    j8 = S.b.u(parcel, r8);
                    break;
                case 5:
                    j9 = S.b.u(parcel, r8);
                    break;
                case 6:
                    str = S.b.f(parcel, r8);
                    break;
                case 7:
                    str2 = S.b.f(parcel, r8);
                    break;
                case 8:
                    i11 = S.b.t(parcel, r8);
                    break;
                case 9:
                    i12 = S.b.t(parcel, r8);
                    break;
                default:
                    S.b.x(parcel, r8);
                    break;
            }
        }
        S.b.k(parcel, y8);
        return new C1316m(i8, i9, i10, j8, j9, str, str2, i11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1316m[i8];
    }
}
