package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new zze();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    public final long f16304f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    public final HarmfulAppsData[] f16305g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    public final int f16306h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private final boolean f16307i;

    @SafeParcelable.Constructor
    public zzd(@SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 3) HarmfulAppsData[] harmfulAppsDataArr, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) boolean z) {
        this.f16304f = j2;
        this.f16305g = harmfulAppsDataArr;
        this.f16307i = z;
        if (z) {
            this.f16306h = i2;
        } else {
            this.f16306h = -1;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 2, this.f16304f);
        SafeParcelWriter.t(parcel, 3, this.f16305g, i2, false);
        SafeParcelWriter.i(parcel, 4, this.f16306h);
        SafeParcelWriter.c(parcel, 5, this.f16307i);
        SafeParcelWriter.b(parcel, a);
    }
}
