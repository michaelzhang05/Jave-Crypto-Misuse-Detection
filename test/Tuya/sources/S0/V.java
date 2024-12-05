package s0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

/* loaded from: classes3.dex */
public final class V implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        String str = null;
        String str2 = null;
        CommonWalletObject commonWalletObject = null;
        int i8 = 0;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            int l8 = S.b.l(r8);
            if (l8 != 1) {
                if (l8 != 2) {
                    if (l8 != 3) {
                        if (l8 != 4) {
                            S.b.x(parcel, r8);
                        } else {
                            commonWalletObject = (CommonWalletObject) S.b.e(parcel, r8, CommonWalletObject.CREATOR);
                        }
                    } else {
                        str2 = S.b.f(parcel, r8);
                    }
                } else {
                    str = S.b.f(parcel, r8);
                }
            } else {
                i8 = S.b.t(parcel, r8);
            }
        }
        S.b.k(parcel, y8);
        return new C3717g(i8, str, str2, commonWalletObject);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3717g[i8];
    }
}
