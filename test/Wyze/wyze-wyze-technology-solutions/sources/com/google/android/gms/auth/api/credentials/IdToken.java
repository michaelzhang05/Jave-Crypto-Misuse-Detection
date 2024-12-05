package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new zzk();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f10401f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f10402g;

    @SafeParcelable.Constructor
    public IdToken(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2) {
        Preconditions.b(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        Preconditions.b(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.f10401f = str;
        this.f10402g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        return Objects.a(this.f10401f, idToken.f10401f) && Objects.a(this.f10402g, idToken.f10402g);
    }

    public final String w() {
        return this.f10401f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.q(parcel, 1, w(), false);
        SafeParcelWriter.q(parcel, 2, z(), false);
        SafeParcelWriter.b(parcel, a);
    }

    public final String z() {
        return this.f10402g;
    }
}
