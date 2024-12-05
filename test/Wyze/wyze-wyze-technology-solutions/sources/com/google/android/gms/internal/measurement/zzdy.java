package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzdy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdy> CREATOR = new zzdz();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    public final long f16078f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    public final long f16079g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    public final boolean f16080h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    public final String f16081i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    public final String f16082j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.Field
    public final String f16083k;

    @SafeParcelable.Field
    public final Bundle l;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzdy(@SafeParcelable.Param(id = 1) long j2, @SafeParcelable.Param(id = 2) long j3, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) String str2, @SafeParcelable.Param(id = 6) String str3, @SafeParcelable.Param(id = 7) Bundle bundle) {
        this.f16078f = j2;
        this.f16079g = j3;
        this.f16080h = z;
        this.f16081i = str;
        this.f16082j = str2;
        this.f16083k = str3;
        this.l = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f16078f);
        SafeParcelWriter.l(parcel, 2, this.f16079g);
        SafeParcelWriter.c(parcel, 3, this.f16080h);
        SafeParcelWriter.q(parcel, 4, this.f16081i, false);
        SafeParcelWriter.q(parcel, 5, this.f16082j, false);
        SafeParcelWriter.q(parcel, 6, this.f16083k, false);
        SafeParcelWriter.d(parcel, 7, this.l, false);
        SafeParcelWriter.b(parcel, a);
    }
}
