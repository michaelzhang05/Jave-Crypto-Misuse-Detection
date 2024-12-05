package s0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class T implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        boolean z8 = false;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            switch (S.b.l(r8)) {
                case 2:
                    arrayList = S.b.d(parcel, r8);
                    break;
                case 3:
                default:
                    S.b.x(parcel, r8);
                    break;
                case 4:
                    str = S.b.f(parcel, r8);
                    break;
                case 5:
                    str2 = S.b.f(parcel, r8);
                    break;
                case 6:
                    arrayList2 = S.b.d(parcel, r8);
                    break;
                case 7:
                    z8 = S.b.m(parcel, r8);
                    break;
                case 8:
                    str3 = S.b.f(parcel, r8);
                    break;
            }
        }
        S.b.k(parcel, y8);
        return new C3715e(arrayList, str, str2, arrayList2, z8, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3715e[i8];
    }
}
