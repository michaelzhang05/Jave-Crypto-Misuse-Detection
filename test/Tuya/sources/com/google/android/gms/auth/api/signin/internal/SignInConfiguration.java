package com.google.android.gms.auth.api.signin.internal;

import L.b;
import L.w;
import R.AbstractC1319p;
import S.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes3.dex */
public final class SignInConfiguration extends S.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new w();

    /* renamed from: a, reason: collision with root package name */
    private final String f15074a;

    /* renamed from: b, reason: collision with root package name */
    private final GoogleSignInOptions f15075b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f15074a = AbstractC1319p.f(str);
        this.f15075b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f15074a.equals(signInConfiguration.f15074a)) {
            GoogleSignInOptions googleSignInOptions = this.f15075b;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f15075b;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new b().a(this.f15074a).a(this.f15075b).b();
    }

    public final GoogleSignInOptions s() {
        return this.f15075b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = c.a(parcel);
        c.q(parcel, 2, this.f15074a, false);
        c.p(parcel, 5, this.f15075b, i8, false);
        c.b(parcel, a8);
    }
}
