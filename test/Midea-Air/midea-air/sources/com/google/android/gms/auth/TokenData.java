package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new zzk();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.VersionField
    private final int f10313f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f10314g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private final Long f10315h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private final boolean f10316i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    private final boolean f10317j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.Field
    private final List<String> f10318k;

    @SafeParcelable.Field
    private final String l;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public TokenData(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) Long l, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) List<String> list, @SafeParcelable.Param(id = 7) String str2) {
        this.f10313f = i2;
        this.f10314g = Preconditions.g(str);
        this.f10315h = l;
        this.f10316i = z;
        this.f10317j = z2;
        this.f10318k = list;
        this.l = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.f10314g, tokenData.f10314g) && Objects.a(this.f10315h, tokenData.f10315h) && this.f10316i == tokenData.f10316i && this.f10317j == tokenData.f10317j && Objects.a(this.f10318k, tokenData.f10318k) && Objects.a(this.l, tokenData.l);
    }

    public int hashCode() {
        return Objects.b(this.f10314g, this.f10315h, Boolean.valueOf(this.f10316i), Boolean.valueOf(this.f10317j), this.f10318k, this.l);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f10313f);
        SafeParcelWriter.q(parcel, 2, this.f10314g, false);
        SafeParcelWriter.m(parcel, 3, this.f10315h, false);
        SafeParcelWriter.c(parcel, 4, this.f10316i);
        SafeParcelWriter.c(parcel, 5, this.f10317j);
        SafeParcelWriter.s(parcel, 6, this.f10318k, false);
        SafeParcelWriter.q(parcel, 7, this.l, false);
        SafeParcelWriter.b(parcel, a);
    }
}
