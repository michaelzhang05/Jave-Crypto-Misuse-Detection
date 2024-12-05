package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzad extends AbstractSafeParcelable implements Result {

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final Status f15888g;

    /* renamed from: f, reason: collision with root package name */
    private static final zzad f15887f = new zzad(Status.f10556f);
    public static final Parcelable.Creator<zzad> CREATOR = new zzae();

    @SafeParcelable.Constructor
    public zzad(@SafeParcelable.Param(id = 1) Status status) {
        this.f15888g = status;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f15888g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.o(parcel, 1, getStatus(), i2, false);
        SafeParcelWriter.b(parcel, a);
    }
}
