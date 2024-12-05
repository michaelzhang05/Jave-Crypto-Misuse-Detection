package s0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* loaded from: classes3.dex */
public final class N implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        UserAddress userAddress = null;
        int i8 = 0;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            int l8 = S.b.l(r8);
            if (l8 != 1) {
                if (l8 != 2) {
                    if (l8 != 3) {
                        if (l8 != 4) {
                            if (l8 != 5) {
                                S.b.x(parcel, r8);
                            } else {
                                userAddress = (UserAddress) S.b.e(parcel, r8, UserAddress.CREATOR);
                            }
                        } else {
                            i8 = S.b.t(parcel, r8);
                        }
                    } else {
                        str3 = S.b.f(parcel, r8);
                    }
                } else {
                    str2 = S.b.f(parcel, r8);
                }
            } else {
                str = S.b.f(parcel, r8);
            }
        }
        S.b.k(parcel, y8);
        return new C3712b(str, str2, str3, i8, userAddress);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3712b[i8];
    }
}
