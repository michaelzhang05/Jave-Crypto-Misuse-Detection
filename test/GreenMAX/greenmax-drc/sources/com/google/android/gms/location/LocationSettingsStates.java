package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new zzai();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    private final boolean f16262f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final boolean f16263g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private final boolean f16264h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private final boolean f16265i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    private final boolean f16266j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.Field
    private final boolean f16267k;

    @SafeParcelable.Constructor
    public LocationSettingsStates(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) boolean z2, @SafeParcelable.Param(id = 3) boolean z3, @SafeParcelable.Param(id = 4) boolean z4, @SafeParcelable.Param(id = 5) boolean z5, @SafeParcelable.Param(id = 6) boolean z6) {
        this.f16262f = z;
        this.f16263g = z2;
        this.f16264h = z3;
        this.f16265i = z4;
        this.f16266j = z5;
        this.f16267k = z6;
    }

    public final boolean D() {
        return this.f16265i;
    }

    public final boolean J() {
        return this.f16262f;
    }

    public final boolean L() {
        return this.f16266j;
    }

    public final boolean P() {
        return this.f16263g;
    }

    public final boolean w() {
        return this.f16267k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.c(parcel, 1, J());
        SafeParcelWriter.c(parcel, 2, P());
        SafeParcelWriter.c(parcel, 3, z());
        SafeParcelWriter.c(parcel, 4, D());
        SafeParcelWriter.c(parcel, 5, L());
        SafeParcelWriter.c(parcel, 6, w());
        SafeParcelWriter.b(parcel, a);
    }

    public final boolean z() {
        return this.f16264h;
    }
}
