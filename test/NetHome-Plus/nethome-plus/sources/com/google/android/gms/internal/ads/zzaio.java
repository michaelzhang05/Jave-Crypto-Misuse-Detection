package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzard
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzaio extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaio> CREATOR = new zzaip();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f12739f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    public final boolean f12740g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    public final int f12741h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    public final String f12742i;

    @SafeParcelable.Constructor
    public zzaio(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) String str2) {
        this.f12739f = str;
        this.f12740g = z;
        this.f12741h = i2;
        this.f12742i = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.q(parcel, 1, this.f12739f, false);
        SafeParcelWriter.c(parcel, 2, this.f12740g);
        SafeParcelWriter.i(parcel, 3, this.f12741h);
        SafeParcelWriter.q(parcel, 4, this.f12742i, false);
        SafeParcelWriter.b(parcel, a);
    }
}
