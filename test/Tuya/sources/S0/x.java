package s0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* loaded from: classes3.dex */
public final class x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        String str = null;
        C3712b c3712b = null;
        UserAddress userAddress = null;
        C3721k c3721k = null;
        String str2 = null;
        Bundle bundle = null;
        String str3 = null;
        Bundle bundle2 = null;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            switch (S.b.l(r8)) {
                case 1:
                    str = S.b.f(parcel, r8);
                    break;
                case 2:
                    c3712b = (C3712b) S.b.e(parcel, r8, C3712b.CREATOR);
                    break;
                case 3:
                    userAddress = (UserAddress) S.b.e(parcel, r8, UserAddress.CREATOR);
                    break;
                case 4:
                    c3721k = (C3721k) S.b.e(parcel, r8, C3721k.CREATOR);
                    break;
                case 5:
                    str2 = S.b.f(parcel, r8);
                    break;
                case 6:
                    bundle = S.b.a(parcel, r8);
                    break;
                case 7:
                    str3 = S.b.f(parcel, r8);
                    break;
                case 8:
                    bundle2 = S.b.a(parcel, r8);
                    break;
                default:
                    S.b.x(parcel, r8);
                    break;
            }
        }
        S.b.k(parcel, y8);
        return new C3719i(str, c3712b, userAddress, c3721k, str2, bundle, str3, bundle2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3719i[i8];
    }
}
