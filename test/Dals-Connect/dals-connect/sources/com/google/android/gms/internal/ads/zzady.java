package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzard
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzady extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzady> CREATOR = new zzadz();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    public final int f12669f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    public final boolean f12670g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    public final int f12671h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    public final boolean f12672i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    public final int f12673j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.Field
    public final zzacd f12674k;

    @SafeParcelable.Field
    public final boolean l;

    @SafeParcelable.Field
    public final int m;

    public zzady(NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzacd(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zzkr(), 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f12669f);
        SafeParcelWriter.c(parcel, 2, this.f12670g);
        SafeParcelWriter.i(parcel, 3, this.f12671h);
        SafeParcelWriter.c(parcel, 4, this.f12672i);
        SafeParcelWriter.i(parcel, 5, this.f12673j);
        SafeParcelWriter.o(parcel, 6, this.f12674k, i2, false);
        SafeParcelWriter.c(parcel, 7, this.l);
        SafeParcelWriter.i(parcel, 8, this.m);
        SafeParcelWriter.b(parcel, a);
    }

    @SafeParcelable.Constructor
    public zzady(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) boolean z2, @SafeParcelable.Param(id = 5) int i4, @SafeParcelable.Param(id = 6) zzacd zzacdVar, @SafeParcelable.Param(id = 7) boolean z3, @SafeParcelable.Param(id = 8) int i5) {
        this.f12669f = i2;
        this.f12670g = z;
        this.f12671h = i3;
        this.f12672i = z2;
        this.f12673j = i4;
        this.f12674k = zzacdVar;
        this.l = z3;
        this.m = i5;
    }
}
