package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzab();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    private int f16240f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private long f16241g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private long f16242h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private boolean f16243i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    private long f16244j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.Field
    private int f16245k;

    @SafeParcelable.Field
    private float l;

    @SafeParcelable.Field
    private long m;

    public LocationRequest() {
        this.f16240f = 102;
        this.f16241g = 3600000L;
        this.f16242h = 600000L;
        this.f16243i = false;
        this.f16244j = Long.MAX_VALUE;
        this.f16245k = Integer.MAX_VALUE;
        this.l = 0.0f;
        this.m = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public LocationRequest(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 3) long j3, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) long j4, @SafeParcelable.Param(id = 6) int i3, @SafeParcelable.Param(id = 7) float f2, @SafeParcelable.Param(id = 8) long j5) {
        this.f16240f = i2;
        this.f16241g = j2;
        this.f16242h = j3;
        this.f16243i = z;
        this.f16244j = j4;
        this.f16245k = i3;
        this.l = f2;
        this.m = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        return this.f16240f == locationRequest.f16240f && this.f16241g == locationRequest.f16241g && this.f16242h == locationRequest.f16242h && this.f16243i == locationRequest.f16243i && this.f16244j == locationRequest.f16244j && this.f16245k == locationRequest.f16245k && this.l == locationRequest.l && w() == locationRequest.w();
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(this.f16240f), Long.valueOf(this.f16241g), Float.valueOf(this.l), Long.valueOf(this.m));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        int i2 = this.f16240f;
        sb.append(i2 != 100 ? i2 != 102 ? i2 != 104 ? i2 != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.f16240f != 105) {
            sb.append(" requested=");
            sb.append(this.f16241g);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.f16242h);
        sb.append("ms");
        if (this.m > this.f16241g) {
            sb.append(" maxWait=");
            sb.append(this.m);
            sb.append("ms");
        }
        if (this.l > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.l);
            sb.append("m");
        }
        long j2 = this.f16244j;
        if (j2 != Long.MAX_VALUE) {
            long elapsedRealtime = j2 - SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(elapsedRealtime);
            sb.append("ms");
        }
        if (this.f16245k != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f16245k);
        }
        sb.append(']');
        return sb.toString();
    }

    public final long w() {
        long j2 = this.m;
        long j3 = this.f16241g;
        return j2 < j3 ? j3 : j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f16240f);
        SafeParcelWriter.l(parcel, 2, this.f16241g);
        SafeParcelWriter.l(parcel, 3, this.f16242h);
        SafeParcelWriter.c(parcel, 4, this.f16243i);
        SafeParcelWriter.l(parcel, 5, this.f16244j);
        SafeParcelWriter.i(parcel, 6, this.f16245k);
        SafeParcelWriter.g(parcel, 7, this.l);
        SafeParcelWriter.l(parcel, 8, this.m);
        SafeParcelWriter.b(parcel, a);
    }
}
