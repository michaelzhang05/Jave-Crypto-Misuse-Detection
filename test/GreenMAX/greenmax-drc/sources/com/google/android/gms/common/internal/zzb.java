package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new zzc();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    Bundle f10913f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    Feature[] f10914g;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzb(@SafeParcelable.Param(id = 1) Bundle bundle, @SafeParcelable.Param(id = 2) Feature[] featureArr) {
        this.f10913f = bundle;
        this.f10914g = featureArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.d(parcel, 1, this.f10913f, false);
        SafeParcelWriter.t(parcel, 2, this.f10914g, i2, false);
        SafeParcelWriter.b(parcel, a);
    }

    public zzb() {
    }
}
