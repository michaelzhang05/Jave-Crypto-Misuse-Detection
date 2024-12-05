package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzard
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzaiw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaiw> CREATOR = new zzaix();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    public final String f12743f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    public final Bundle f12744g;

    @SafeParcelable.Constructor
    public zzaiw(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) Bundle bundle) {
        this.f12743f = str;
        this.f12744g = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.q(parcel, 1, this.f12743f, false);
        SafeParcelWriter.d(parcel, 2, this.f12744g, false);
        SafeParcelWriter.b(parcel, a);
    }
}
