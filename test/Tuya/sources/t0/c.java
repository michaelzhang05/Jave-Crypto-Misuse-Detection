package t0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i8 = 0;
        boolean z8 = false;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            switch (S.b.l(r8)) {
                case 1:
                    str = S.b.f(parcel, r8);
                    break;
                case 2:
                    i8 = S.b.t(parcel, r8);
                    break;
                case 3:
                    z8 = S.b.m(parcel, r8);
                    break;
                case 4:
                    str2 = S.b.f(parcel, r8);
                    break;
                case 5:
                    str3 = S.b.f(parcel, r8);
                    break;
                case 6:
                    str4 = S.b.f(parcel, r8);
                    break;
                case 7:
                    str5 = S.b.f(parcel, r8);
                    break;
                case 8:
                    str6 = S.b.f(parcel, r8);
                    break;
                case 9:
                    str7 = S.b.f(parcel, r8);
                    break;
                default:
                    S.b.x(parcel, r8);
                    break;
            }
        }
        S.b.k(parcel, y8);
        return new C3769b(str, i8, z8, str2, str3, str4, str5, str6, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3769b[i8];
    }
}
