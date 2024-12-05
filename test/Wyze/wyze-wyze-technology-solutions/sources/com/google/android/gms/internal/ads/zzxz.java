package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@zzard
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzxz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxz> CREATOR = new zzyb();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    public final int f15791f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    @Deprecated
    public final long f15792g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    public final Bundle f15793h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    @Deprecated
    public final int f15794i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    public final List<String> f15795j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.Field
    public final boolean f15796k;

    @SafeParcelable.Field
    public final int l;

    @SafeParcelable.Field
    public final boolean m;

    @SafeParcelable.Field
    public final String n;

    @SafeParcelable.Field
    public final zzaca o;

    @SafeParcelable.Field
    public final Location p;

    @SafeParcelable.Field
    public final String q;

    @SafeParcelable.Field
    public final Bundle r;

    @SafeParcelable.Field
    public final Bundle s;

    @SafeParcelable.Field
    public final List<String> t;

    @SafeParcelable.Field
    public final String u;

    @SafeParcelable.Field
    public final String v;

    @SafeParcelable.Field
    @Deprecated
    public final boolean w;

    @SafeParcelable.Field
    public final zzxt x;

    @SafeParcelable.Field
    public final int y;

    @SafeParcelable.Field
    public final String z;

    @SafeParcelable.Constructor
    public zzxz(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 3) Bundle bundle, @SafeParcelable.Param(id = 4) int i3, @SafeParcelable.Param(id = 5) List<String> list, @SafeParcelable.Param(id = 6) boolean z, @SafeParcelable.Param(id = 7) int i4, @SafeParcelable.Param(id = 8) boolean z2, @SafeParcelable.Param(id = 9) String str, @SafeParcelable.Param(id = 10) zzaca zzacaVar, @SafeParcelable.Param(id = 11) Location location, @SafeParcelable.Param(id = 12) String str2, @SafeParcelable.Param(id = 13) Bundle bundle2, @SafeParcelable.Param(id = 14) Bundle bundle3, @SafeParcelable.Param(id = 15) List<String> list2, @SafeParcelable.Param(id = 16) String str3, @SafeParcelable.Param(id = 17) String str4, @SafeParcelable.Param(id = 18) boolean z3, @SafeParcelable.Param(id = 19) zzxt zzxtVar, @SafeParcelable.Param(id = 20) int i5, @SafeParcelable.Param(id = 21) String str5) {
        this.f15791f = i2;
        this.f15792g = j2;
        this.f15793h = bundle == null ? new Bundle() : bundle;
        this.f15794i = i3;
        this.f15795j = list;
        this.f15796k = z;
        this.l = i4;
        this.m = z2;
        this.n = str;
        this.o = zzacaVar;
        this.p = location;
        this.q = str2;
        this.r = bundle2 == null ? new Bundle() : bundle2;
        this.s = bundle3;
        this.t = list2;
        this.u = str3;
        this.v = str4;
        this.w = z3;
        this.x = zzxtVar;
        this.y = i5;
        this.z = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzxz)) {
            return false;
        }
        zzxz zzxzVar = (zzxz) obj;
        return this.f15791f == zzxzVar.f15791f && this.f15792g == zzxzVar.f15792g && Objects.a(this.f15793h, zzxzVar.f15793h) && this.f15794i == zzxzVar.f15794i && Objects.a(this.f15795j, zzxzVar.f15795j) && this.f15796k == zzxzVar.f15796k && this.l == zzxzVar.l && this.m == zzxzVar.m && Objects.a(this.n, zzxzVar.n) && Objects.a(this.o, zzxzVar.o) && Objects.a(this.p, zzxzVar.p) && Objects.a(this.q, zzxzVar.q) && Objects.a(this.r, zzxzVar.r) && Objects.a(this.s, zzxzVar.s) && Objects.a(this.t, zzxzVar.t) && Objects.a(this.u, zzxzVar.u) && Objects.a(this.v, zzxzVar.v) && this.w == zzxzVar.w && this.y == zzxzVar.y && Objects.a(this.z, zzxzVar.z);
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(this.f15791f), Long.valueOf(this.f15792g), this.f15793h, Integer.valueOf(this.f15794i), this.f15795j, Boolean.valueOf(this.f15796k), Integer.valueOf(this.l), Boolean.valueOf(this.m), this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, Boolean.valueOf(this.w), Integer.valueOf(this.y), this.z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f15791f);
        SafeParcelWriter.l(parcel, 2, this.f15792g);
        SafeParcelWriter.d(parcel, 3, this.f15793h, false);
        SafeParcelWriter.i(parcel, 4, this.f15794i);
        SafeParcelWriter.s(parcel, 5, this.f15795j, false);
        SafeParcelWriter.c(parcel, 6, this.f15796k);
        SafeParcelWriter.i(parcel, 7, this.l);
        SafeParcelWriter.c(parcel, 8, this.m);
        SafeParcelWriter.q(parcel, 9, this.n, false);
        SafeParcelWriter.o(parcel, 10, this.o, i2, false);
        SafeParcelWriter.o(parcel, 11, this.p, i2, false);
        SafeParcelWriter.q(parcel, 12, this.q, false);
        SafeParcelWriter.d(parcel, 13, this.r, false);
        SafeParcelWriter.d(parcel, 14, this.s, false);
        SafeParcelWriter.s(parcel, 15, this.t, false);
        SafeParcelWriter.q(parcel, 16, this.u, false);
        SafeParcelWriter.q(parcel, 17, this.v, false);
        SafeParcelWriter.c(parcel, 18, this.w);
        SafeParcelWriter.o(parcel, 19, this.x, i2, false);
        SafeParcelWriter.i(parcel, 20, this.y);
        SafeParcelWriter.q(parcel, 21, this.z, false);
        SafeParcelWriter.b(parcel, a);
    }
}
