package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import r0.C3896d;
import r0.C3898f;
import r0.C3899g;
import r0.C3914w;

/* loaded from: classes3.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        String str = null;
        String str2 = null;
        String[] strArr = null;
        String str3 = null;
        C3914w c3914w = null;
        C3914w c3914w2 = null;
        C3898f[] c3898fArr = null;
        C3899g[] c3899gArr = null;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        C3896d[] c3896dArr = null;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            switch (R.b.l(r8)) {
                case 2:
                    str = R.b.f(parcel, r8);
                    break;
                case 3:
                    str2 = R.b.f(parcel, r8);
                    break;
                case 4:
                    strArr = R.b.g(parcel, r8);
                    break;
                case 5:
                    str3 = R.b.f(parcel, r8);
                    break;
                case 6:
                    c3914w = (C3914w) R.b.e(parcel, r8, C3914w.CREATOR);
                    break;
                case 7:
                    c3914w2 = (C3914w) R.b.e(parcel, r8, C3914w.CREATOR);
                    break;
                case 8:
                    c3898fArr = (C3898f[]) R.b.i(parcel, r8, C3898f.CREATOR);
                    break;
                case 9:
                    c3899gArr = (C3899g[]) R.b.i(parcel, r8, C3899g.CREATOR);
                    break;
                case 10:
                    userAddress = (UserAddress) R.b.e(parcel, r8, UserAddress.CREATOR);
                    break;
                case 11:
                    userAddress2 = (UserAddress) R.b.e(parcel, r8, UserAddress.CREATOR);
                    break;
                case 12:
                    c3896dArr = (C3896d[]) R.b.i(parcel, r8, C3896d.CREATOR);
                    break;
                default:
                    R.b.x(parcel, r8);
                    break;
            }
        }
        R.b.k(parcel, y8);
        return new MaskedWallet(str, str2, strArr, str3, c3914w, c3914w2, c3898fArr, c3899gArr, userAddress, userAddress2, c3896dArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new MaskedWallet[i8];
    }
}
