package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import okhttp3.HttpUrl;

@zzard
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzaym extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaym> CREATOR = new zzayo();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    public final String f13103f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    public final int f13104g;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzaym(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i2) {
        this.f13103f = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
        this.f13104g = i2;
    }

    public static zzaym w(Throwable th, int i2) {
        return new zzaym(th.getMessage(), i2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.q(parcel, 1, this.f13103f, false);
        SafeParcelWriter.i(parcel, 2, this.f13104g);
        SafeParcelWriter.b(parcel, a);
    }
}
