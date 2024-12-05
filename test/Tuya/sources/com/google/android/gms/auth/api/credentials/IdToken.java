package com.google.android.gms.auth.api.credentials;

import I.b;
import R.AbstractC1317n;
import R.AbstractC1319p;
import S.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;

@Deprecated
/* loaded from: classes3.dex */
public final class IdToken extends S.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<IdToken> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    private final String f15025a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15026b;

    public IdToken(String str, String str2) {
        AbstractC1319p.b(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        AbstractC1319p.b(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.f15025a = str;
        this.f15026b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        if (AbstractC1317n.a(this.f15025a, idToken.f15025a) && AbstractC1317n.a(this.f15026b, idToken.f15026b)) {
            return true;
        }
        return false;
    }

    public String s() {
        return this.f15025a;
    }

    public String u() {
        return this.f15026b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = c.a(parcel);
        c.q(parcel, 1, s(), false);
        c.q(parcel, 2, u(), false);
        c.b(parcel, a8);
    }
}
