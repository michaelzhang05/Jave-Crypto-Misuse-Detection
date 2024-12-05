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
public final class zzarz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzarz> CREATOR = new zzasa();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    String f12934f;

    @SafeParcelable.Constructor
    public zzarz(@SafeParcelable.Param(id = 2) String str) {
        this.f12934f = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.q(parcel, 2, this.f12934f, false);
        SafeParcelWriter.b(parcel, a);
    }
}
