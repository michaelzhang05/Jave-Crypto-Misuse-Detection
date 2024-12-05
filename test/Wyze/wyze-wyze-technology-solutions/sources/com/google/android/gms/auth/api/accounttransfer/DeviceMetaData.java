package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceMetaData> CREATOR = new zzv();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.VersionField
    private final int f10344f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private boolean f10345g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private long f10346h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private final boolean f10347i;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public DeviceMetaData(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) long j2, @SafeParcelable.Param(id = 4) boolean z2) {
        this.f10344f = i2;
        this.f10345g = z;
        this.f10346h = j2;
        this.f10347i = z2;
    }

    public boolean D() {
        return this.f10345g;
    }

    public long w() {
        return this.f10346h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f10344f);
        SafeParcelWriter.c(parcel, 2, D());
        SafeParcelWriter.l(parcel, 3, w());
        SafeParcelWriter.c(parcel, 4, z());
        SafeParcelWriter.b(parcel, a);
    }

    public boolean z() {
        return this.f10347i;
    }
}
