package R;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes3.dex */
public final class M extends S.a {
    public static final Parcelable.Creator<M> CREATOR = new N();

    /* renamed from: a, reason: collision with root package name */
    final int f8464a;

    /* renamed from: b, reason: collision with root package name */
    private final Account f8465b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8466c;

    /* renamed from: d, reason: collision with root package name */
    private final GoogleSignInAccount f8467d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public M(int i8, Account account, int i9, GoogleSignInAccount googleSignInAccount) {
        this.f8464a = i8;
        this.f8465b = account;
        this.f8466c = i9;
        this.f8467d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f8464a;
        int a8 = S.c.a(parcel);
        S.c.k(parcel, 1, i9);
        S.c.p(parcel, 2, this.f8465b, i8, false);
        S.c.k(parcel, 3, this.f8466c);
        S.c.p(parcel, 4, this.f8467d, i8, false);
        S.c.b(parcel, a8);
    }

    public M(Account account, int i8, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i8, googleSignInAccount);
    }
}
