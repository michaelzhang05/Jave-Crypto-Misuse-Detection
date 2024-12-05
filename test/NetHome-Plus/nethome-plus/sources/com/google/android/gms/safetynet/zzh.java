package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new zzi();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    private final int f16309f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final boolean f16310g;

    @SafeParcelable.Constructor
    public zzh(@SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) boolean z) {
        this.f16309f = i2;
        this.f16310g = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 2, this.f16309f);
        SafeParcelWriter.c(parcel, 3, this.f16310g);
        SafeParcelWriter.b(parcel, a);
    }
}
