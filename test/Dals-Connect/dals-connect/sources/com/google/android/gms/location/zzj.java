package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    private boolean f16282f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private long f16283g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private float f16284h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private long f16285i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    private int f16286j;

    public zzj() {
        this(true, 50L, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzj(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 3) float f2, @SafeParcelable.Param(id = 4) long j3, @SafeParcelable.Param(id = 5) int i2) {
        this.f16282f = z;
        this.f16283g = j2;
        this.f16284h = f2;
        this.f16285i = j3;
        this.f16286j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        return this.f16282f == zzjVar.f16282f && this.f16283g == zzjVar.f16283g && Float.compare(this.f16284h, zzjVar.f16284h) == 0 && this.f16285i == zzjVar.f16285i && this.f16286j == zzjVar.f16286j;
    }

    public final int hashCode() {
        return Objects.b(Boolean.valueOf(this.f16282f), Long.valueOf(this.f16283g), Float.valueOf(this.f16284h), Long.valueOf(this.f16285i), Integer.valueOf(this.f16286j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.f16282f);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.f16283g);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.f16284h);
        long j2 = this.f16285i;
        if (j2 != Long.MAX_VALUE) {
            long elapsedRealtime = j2 - SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(elapsedRealtime);
            sb.append("ms");
        }
        if (this.f16286j != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f16286j);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.c(parcel, 1, this.f16282f);
        SafeParcelWriter.l(parcel, 2, this.f16283g);
        SafeParcelWriter.g(parcel, 3, this.f16284h);
        SafeParcelWriter.l(parcel, 4, this.f16285i);
        SafeParcelWriter.i(parcel, 5, this.f16286j);
        SafeParcelWriter.b(parcel, a);
    }
}
