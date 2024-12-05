package L;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;

/* loaded from: classes3.dex */
public final class w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        String str = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            int l8 = S.b.l(r8);
            if (l8 != 2) {
                if (l8 != 5) {
                    S.b.x(parcel, r8);
                } else {
                    googleSignInOptions = (GoogleSignInOptions) S.b.e(parcel, r8, GoogleSignInOptions.CREATOR);
                }
            } else {
                str = S.b.f(parcel, r8);
            }
        }
        S.b.k(parcel, y8);
        return new SignInConfiguration(str, googleSignInOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new SignInConfiguration[i8];
    }
}
