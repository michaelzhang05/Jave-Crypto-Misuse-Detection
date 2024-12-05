package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes2.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new zzb();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f10500f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    @Deprecated
    private final int f10501g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private final long f10502h;

    @SafeParcelable.Constructor
    public Feature(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) long j2) {
        this.f10500f = str;
        this.f10501g = i2;
        this.f10502h = j2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((w() != null && w().equals(feature.w())) || (w() == null && feature.w() == null)) && z() == feature.z()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.b(w(), Long.valueOf(z()));
    }

    public String toString() {
        return Objects.c(this).a("name", w()).a("version", Long.valueOf(z())).toString();
    }

    @KeepForSdk
    public String w() {
        return this.f10500f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.q(parcel, 1, w(), false);
        SafeParcelWriter.i(parcel, 2, this.f10501g);
        SafeParcelWriter.l(parcel, 3, z());
        SafeParcelWriter.b(parcel, a);
    }

    @KeepForSdk
    public long z() {
        long j2 = this.f10502h;
        return j2 == -1 ? this.f10501g : j2;
    }
}
