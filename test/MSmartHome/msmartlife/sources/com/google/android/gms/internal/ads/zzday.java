package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzday extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzday> CREATOR = new zzdaz();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.VersionField
    private final int f14672f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final byte[] f14673g;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzday(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) byte[] bArr) {
        this.f14672f = i2;
        this.f14673g = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f14672f);
        SafeParcelWriter.e(parcel, 2, this.f14673g, false);
        SafeParcelWriter.b(parcel, a);
    }

    public zzday(byte[] bArr) {
        this(1, bArr);
    }
}
