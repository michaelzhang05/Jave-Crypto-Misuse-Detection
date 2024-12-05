package v1;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class g0 extends w1.a {
    public static final Parcelable.Creator<g0> CREATOR = new h0();

    /* renamed from: a, reason: collision with root package name */
    final int f9590a;

    /* renamed from: b, reason: collision with root package name */
    private final Account f9591b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9592c;

    /* renamed from: d, reason: collision with root package name */
    private final GoogleSignInAccount f9593d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(int i6, Account account, int i7, GoogleSignInAccount googleSignInAccount) {
        this.f9590a = i6;
        this.f9591b = account;
        this.f9592c = i7;
        this.f9593d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int a6 = w1.c.a(parcel);
        w1.c.f(parcel, 1, this.f9590a);
        w1.c.i(parcel, 2, this.f9591b, i6, false);
        w1.c.f(parcel, 3, this.f9592c);
        w1.c.i(parcel, 4, this.f9593d, i6, false);
        w1.c.b(parcel, a6);
    }

    public g0(Account account, int i6, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i6, googleSignInAccount);
    }
}
