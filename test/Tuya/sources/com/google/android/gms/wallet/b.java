package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import s0.C3714d;
import s0.C3716f;
import s0.C3717g;
import s0.C3732w;

/* loaded from: classes3.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        String str = null;
        String str2 = null;
        String[] strArr = null;
        String str3 = null;
        C3732w c3732w = null;
        C3732w c3732w2 = null;
        C3716f[] c3716fArr = null;
        C3717g[] c3717gArr = null;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        C3714d[] c3714dArr = null;
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
                    strArr = S.b.g(parcel, r8);
                    break;
                case 5:
                    str3 = S.b.f(parcel, r8);
                    break;
                case 6:
                    c3732w = (C3732w) S.b.e(parcel, r8, C3732w.CREATOR);
                    break;
                case 7:
                    c3732w2 = (C3732w) S.b.e(parcel, r8, C3732w.CREATOR);
                    break;
                case 8:
                    c3716fArr = (C3716f[]) S.b.i(parcel, r8, C3716f.CREATOR);
                    break;
                case 9:
                    c3717gArr = (C3717g[]) S.b.i(parcel, r8, C3717g.CREATOR);
                    break;
                case 10:
                    userAddress = (UserAddress) S.b.e(parcel, r8, UserAddress.CREATOR);
                    break;
                case 11:
                    userAddress2 = (UserAddress) S.b.e(parcel, r8, UserAddress.CREATOR);
                    break;
                case 12:
                    c3714dArr = (C3714d[]) S.b.i(parcel, r8, C3714d.CREATOR);
                    break;
                default:
                    S.b.x(parcel, r8);
                    break;
            }
        }
        S.b.k(parcel, y8);
        return new MaskedWallet(str, str2, strArr, str3, c3732w, c3732w2, c3716fArr, c3717gArr, userAddress, userAddress2, c3714dArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new MaskedWallet[i8];
    }
}
