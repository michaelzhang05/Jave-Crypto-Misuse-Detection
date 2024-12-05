package com.google.android.gms.auth.api.signin;

import Q.AbstractC1400p;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes3.dex */
public class SignInAccount extends R.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInAccount> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    final String f15870a;

    /* renamed from: b, reason: collision with root package name */
    private final GoogleSignInAccount f15871b;

    /* renamed from: c, reason: collision with root package name */
    final String f15872c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f15871b = googleSignInAccount;
        this.f15870a = AbstractC1400p.g(str, "8.3 and 8.4 SDKs require non-null email");
        this.f15872c = AbstractC1400p.g(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    public final GoogleSignInAccount p() {
        return this.f15871b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f15870a;
        int a8 = R.c.a(parcel);
        R.c.q(parcel, 4, str, false);
        R.c.p(parcel, 7, this.f15871b, i8, false);
        R.c.q(parcel, 8, this.f15872c, false);
        R.c.b(parcel, a8);
    }
}
