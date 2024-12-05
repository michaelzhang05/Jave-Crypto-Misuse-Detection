package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class HarmfulAppsData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<HarmfulAppsData> CREATOR = new zzc();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    public final String f16290f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    public final byte[] f16291g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    public final int f16292h;

    @SafeParcelable.Constructor
    public HarmfulAppsData(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) byte[] bArr, @SafeParcelable.Param(id = 4) int i2) {
        this.f16290f = str;
        this.f16291g = bArr;
        this.f16292h = i2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.q(parcel, 2, this.f16290f, false);
        SafeParcelWriter.e(parcel, 3, this.f16291g, false);
        SafeParcelWriter.i(parcel, 4, this.f16292h);
        SafeParcelWriter.b(parcel, a);
    }
}
