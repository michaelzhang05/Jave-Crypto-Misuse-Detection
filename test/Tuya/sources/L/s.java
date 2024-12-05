package L;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import d0.AbstractBinderC2530b;
import d0.AbstractC2532d;

/* loaded from: classes3.dex */
public abstract class s extends AbstractBinderC2530b implements t {
    public s() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // d0.AbstractBinderC2530b
    protected final boolean i(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) AbstractC2532d.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) AbstractC2532d.a(parcel, Status.CREATOR);
                AbstractC2532d.b(parcel);
                N(googleSignInAccount, status);
                break;
            case 102:
                Status status2 = (Status) AbstractC2532d.a(parcel, Status.CREATOR);
                AbstractC2532d.b(parcel);
                U(status2);
                break;
            case 103:
                Status status3 = (Status) AbstractC2532d.a(parcel, Status.CREATOR);
                AbstractC2532d.b(parcel);
                L(status3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
