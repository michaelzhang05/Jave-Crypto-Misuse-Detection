package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@zzard
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzarx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzarx> CREATOR = new zzary();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    public final Bundle f12928f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    public final zzbai f12929g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    public final ApplicationInfo f12930h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    public final String f12931i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    public final List<String> f12932j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.Field
    public final PackageInfo f12933k;

    @SafeParcelable.Field
    public final String l;

    @SafeParcelable.Field
    public final boolean m;

    @SafeParcelable.Field
    public final String n;

    @SafeParcelable.Constructor
    public zzarx(@SafeParcelable.Param(id = 1) Bundle bundle, @SafeParcelable.Param(id = 2) zzbai zzbaiVar, @SafeParcelable.Param(id = 3) ApplicationInfo applicationInfo, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) List<String> list, @SafeParcelable.Param(id = 6) PackageInfo packageInfo, @SafeParcelable.Param(id = 7) String str2, @SafeParcelable.Param(id = 8) boolean z, @SafeParcelable.Param(id = 9) String str3) {
        this.f12928f = bundle;
        this.f12929g = zzbaiVar;
        this.f12931i = str;
        this.f12930h = applicationInfo;
        this.f12932j = list;
        this.f12933k = packageInfo;
        this.l = str2;
        this.m = z;
        this.n = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.d(parcel, 1, this.f12928f, false);
        SafeParcelWriter.o(parcel, 2, this.f12929g, i2, false);
        SafeParcelWriter.o(parcel, 3, this.f12930h, i2, false);
        SafeParcelWriter.q(parcel, 4, this.f12931i, false);
        SafeParcelWriter.s(parcel, 5, this.f12932j, false);
        SafeParcelWriter.o(parcel, 6, this.f12933k, i2, false);
        SafeParcelWriter.q(parcel, 7, this.l, false);
        SafeParcelWriter.c(parcel, 8, this.m);
        SafeParcelWriter.q(parcel, 9, this.n, false);
        SafeParcelWriter.b(parcel, a);
    }
}
