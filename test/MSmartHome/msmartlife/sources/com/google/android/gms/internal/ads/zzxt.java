package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzard
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzxt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxt> CREATOR = new zzxu();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    public final String f15787f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    public final String f15788g;

    @SafeParcelable.Constructor
    public zzxt(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2) {
        this.f15787f = str;
        this.f15788g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.q(parcel, 1, this.f15787f, false);
        SafeParcelWriter.q(parcel, 2, this.f15788g, false);
        SafeParcelWriter.b(parcel, a);
    }
}
