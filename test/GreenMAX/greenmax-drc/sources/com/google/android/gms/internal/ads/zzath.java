package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzard
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzath extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzath> CREATOR = new zzati();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    public final zzxz f12974f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    public final String f12975g;

    @SafeParcelable.Constructor
    public zzath(@SafeParcelable.Param(id = 2) zzxz zzxzVar, @SafeParcelable.Param(id = 3) String str) {
        this.f12974f = zzxzVar;
        this.f12975g = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.o(parcel, 2, this.f12974f, i2, false);
        SafeParcelWriter.q(parcel, 3, this.f12975g, false);
        SafeParcelWriter.b(parcel, a);
    }
}
