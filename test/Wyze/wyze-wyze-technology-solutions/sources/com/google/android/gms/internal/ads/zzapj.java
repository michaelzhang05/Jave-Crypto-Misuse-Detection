package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.mediation.VersionInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzard
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzapj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzapj> CREATOR = new zzapk();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    private final int f12855f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final int f12856g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private final int f12857h;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzapj(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) int i4) {
        this.f12855f = i2;
        this.f12856g = i3;
        this.f12857h = i4;
    }

    public static zzapj w(VersionInfo versionInfo) {
        return new zzapj(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }

    public final String toString() {
        int i2 = this.f12855f;
        int i3 = this.f12856g;
        int i4 = this.f12857h;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        sb.append(".");
        sb.append(i4);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f12855f);
        SafeParcelWriter.i(parcel, 2, this.f12856g);
        SafeParcelWriter.i(parcel, 3, this.f12857h);
        SafeParcelWriter.b(parcel, a);
    }
}
