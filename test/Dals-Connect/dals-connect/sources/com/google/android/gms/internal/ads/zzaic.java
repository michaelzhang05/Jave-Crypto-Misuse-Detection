package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzard
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzaic extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaic> CREATOR = new zzaid();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    public final boolean f12732f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    public final String f12733g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    public final int f12734h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    public final byte[] f12735i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    public final String[] f12736j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.Field
    public final String[] f12737k;

    @SafeParcelable.Field
    public final boolean l;

    @SafeParcelable.Field
    public final long m;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzaic(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) byte[] bArr, @SafeParcelable.Param(id = 5) String[] strArr, @SafeParcelable.Param(id = 6) String[] strArr2, @SafeParcelable.Param(id = 7) boolean z2, @SafeParcelable.Param(id = 8) long j2) {
        this.f12732f = z;
        this.f12733g = str;
        this.f12734h = i2;
        this.f12735i = bArr;
        this.f12736j = strArr;
        this.f12737k = strArr2;
        this.l = z2;
        this.m = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.c(parcel, 1, this.f12732f);
        SafeParcelWriter.q(parcel, 2, this.f12733g, false);
        SafeParcelWriter.i(parcel, 3, this.f12734h);
        SafeParcelWriter.e(parcel, 4, this.f12735i, false);
        SafeParcelWriter.r(parcel, 5, this.f12736j, false);
        SafeParcelWriter.r(parcel, 6, this.f12737k, false);
        SafeParcelWriter.c(parcel, 7, this.l);
        SafeParcelWriter.l(parcel, 8, this.m);
        SafeParcelWriter.b(parcel, a);
    }
}
