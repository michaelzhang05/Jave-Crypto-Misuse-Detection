package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzdbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdbb> CREATOR = new zzdbc();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.VersionField
    private final int f14674f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f14675g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f14676h;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzdbb(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2) {
        this.f14674f = i2;
        this.f14675g = str;
        this.f14676h = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f14674f);
        SafeParcelWriter.q(parcel, 2, this.f14675g, false);
        SafeParcelWriter.q(parcel, 3, this.f14676h, false);
        SafeParcelWriter.b(parcel, a);
    }

    public zzdbb(String str, String str2) {
        this(1, str, str2);
    }
}
