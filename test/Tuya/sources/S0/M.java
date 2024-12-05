package s0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class M implements Parcelable.Creator {
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
        String str8 = null;
        String str9 = null;
        String str10 = null;
        boolean z8 = false;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            switch (S.b.l(r8)) {
                case 2:
                    str = S.b.f(parcel, r8);
                    break;
                case 3:
                    str2 = S.b.f(parcel, r8);
                    break;
                case 4:
                    str3 = S.b.f(parcel, r8);
                    break;
                case 5:
                    str4 = S.b.f(parcel, r8);
                    break;
                case 6:
                    str5 = S.b.f(parcel, r8);
                    break;
                case 7:
                    str6 = S.b.f(parcel, r8);
                    break;
                case 8:
                    str7 = S.b.f(parcel, r8);
                    break;
                case 9:
                    str8 = S.b.f(parcel, r8);
                    break;
                case 10:
                    str9 = S.b.f(parcel, r8);
                    break;
                case 11:
                    z8 = S.b.m(parcel, r8);
                    break;
                case 12:
                    str10 = S.b.f(parcel, r8);
                    break;
                default:
                    S.b.x(parcel, r8);
                    break;
            }
        }
        S.b.k(parcel, y8);
        return new C3732w(str, str2, str3, str4, str5, str6, str7, str8, str9, z8, str10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3732w[i8];
    }
}
