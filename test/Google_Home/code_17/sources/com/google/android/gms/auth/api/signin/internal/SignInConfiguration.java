package com.google.android.gms.auth.api.signin.internal;

import K.b;
import K.w;
import Q.AbstractC1400p;
import R.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes3.dex */
public final class SignInConfiguration extends R.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new w();

    /* renamed from: a, reason: collision with root package name */
    private final String f15875a;

    /* renamed from: b, reason: collision with root package name */
    private final GoogleSignInOptions f15876b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f15875a = AbstractC1400p.f(str);
        this.f15876b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f15875a.equals(signInConfiguration.f15875a)) {
            GoogleSignInOptions googleSignInOptions = this.f15876b;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f15876b;
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
        return new b().a(this.f15875a).a(this.f15876b).b();
    }

    public final GoogleSignInOptions p() {
        return this.f15876b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f15875a;
        int a8 = c.a(parcel);
        c.q(parcel, 2, str, false);
        c.p(parcel, 5, this.f15876b, i8, false);
        c.b(parcel, a8);
    }
}
