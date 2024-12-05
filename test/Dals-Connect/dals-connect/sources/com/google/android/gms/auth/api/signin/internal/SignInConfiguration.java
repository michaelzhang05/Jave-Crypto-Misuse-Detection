package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new zzx();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f10449f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private GoogleSignInOptions f10450g;

    @SafeParcelable.Constructor
    public SignInConfiguration(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 5) GoogleSignInOptions googleSignInOptions) {
        this.f10449f = Preconditions.g(str);
        this.f10450g = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f10449f.equals(signInConfiguration.f10449f)) {
            GoogleSignInOptions googleSignInOptions = this.f10450g;
            if (googleSignInOptions == null) {
                if (signInConfiguration.f10450g == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(signInConfiguration.f10450g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new HashAccumulator().a(this.f10449f).a(this.f10450g).b();
    }

    public final GoogleSignInOptions w() {
        return this.f10450g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.q(parcel, 2, this.f10449f, false);
        SafeParcelWriter.o(parcel, 5, this.f10450g, i2, false);
        SafeParcelWriter.b(parcel, a);
    }
}
