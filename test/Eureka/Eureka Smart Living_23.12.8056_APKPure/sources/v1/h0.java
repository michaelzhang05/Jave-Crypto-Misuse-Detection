package v1;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class h0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q6 = w1.b.q(parcel);
        int i6 = 0;
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i7 = 0;
        while (parcel.dataPosition() < q6) {
            int k6 = w1.b.k(parcel);
            int i8 = w1.b.i(k6);
            if (i8 == 1) {
                i6 = w1.b.m(parcel, k6);
            } else if (i8 == 2) {
                account = (Account) w1.b.c(parcel, k6, Account.CREATOR);
            } else if (i8 == 3) {
                i7 = w1.b.m(parcel, k6);
            } else if (i8 != 4) {
                w1.b.p(parcel, k6);
            } else {
                googleSignInAccount = (GoogleSignInAccount) w1.b.c(parcel, k6, GoogleSignInAccount.CREATOR);
            }
        }
        w1.b.h(parcel, q6);
        return new g0(i6, account, i7, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new g0[i6];
    }
}
