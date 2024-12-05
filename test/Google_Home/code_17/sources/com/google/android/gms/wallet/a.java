package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import r0.C3892E;
import r0.C3896d;
import r0.C3903k;
import r0.C3914w;

/* loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        String str = null;
        String str2 = null;
        C3892E c3892e = null;
        String str3 = null;
        C3914w c3914w = null;
        C3914w c3914w2 = null;
        String[] strArr = null;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        C3896d[] c3896dArr = null;
        C3903k c3903k = null;
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
                    c3892e = (C3892E) R.b.e(parcel, r8, C3892E.CREATOR);
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
                    strArr = R.b.g(parcel, r8);
                    break;
                case 9:
                    userAddress = (UserAddress) R.b.e(parcel, r8, UserAddress.CREATOR);
                    break;
                case 10:
                    userAddress2 = (UserAddress) R.b.e(parcel, r8, UserAddress.CREATOR);
                    break;
                case 11:
                    c3896dArr = (C3896d[]) R.b.i(parcel, r8, C3896d.CREATOR);
                    break;
                case 12:
                    c3903k = (C3903k) R.b.e(parcel, r8, C3903k.CREATOR);
                    break;
                default:
                    R.b.x(parcel, r8);
                    break;
            }
        }
        R.b.k(parcel, y8);
        return new FullWallet(str, str2, c3892e, str3, c3914w, c3914w2, strArr, userAddress, userAddress2, c3896dArr, c3903k);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new FullWallet[i8];
    }
}
