package s0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        C3713c c3713c = null;
        C3729t c3729t = null;
        ArrayList arrayList = null;
        C3722l c3722l = null;
        C3730u c3730u = null;
        String str = null;
        byte[] bArr = null;
        Bundle bundle = null;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = true;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            switch (S.b.l(r8)) {
                case 1:
                    z8 = S.b.m(parcel, r8);
                    break;
                case 2:
                    z9 = S.b.m(parcel, r8);
                    break;
                case 3:
                    c3713c = (C3713c) S.b.e(parcel, r8, C3713c.CREATOR);
                    break;
                case 4:
                    z10 = S.b.m(parcel, r8);
                    break;
                case 5:
                    c3729t = (C3729t) S.b.e(parcel, r8, C3729t.CREATOR);
                    break;
                case 6:
                    arrayList = S.b.d(parcel, r8);
                    break;
                case 7:
                    c3722l = (C3722l) S.b.e(parcel, r8, C3722l.CREATOR);
                    break;
                case 8:
                    c3730u = (C3730u) S.b.e(parcel, r8, C3730u.CREATOR);
                    break;
                case 9:
                    z11 = S.b.m(parcel, r8);
                    break;
                case 10:
                    str = S.b.f(parcel, r8);
                    break;
                case 11:
                    bundle = S.b.a(parcel, r8);
                    break;
                case 12:
                    bArr = S.b.b(parcel, r8);
                    break;
                default:
                    S.b.x(parcel, r8);
                    break;
            }
        }
        S.b.k(parcel, y8);
        return new C3720j(z8, z9, c3713c, z10, c3729t, arrayList, c3722l, c3730u, z11, str, bArr, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3720j[i8];
    }
}
