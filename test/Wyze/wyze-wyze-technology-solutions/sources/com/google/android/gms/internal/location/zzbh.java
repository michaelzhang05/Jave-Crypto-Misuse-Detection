package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.Geofence;
import java.util.Locale;

@VisibleForTesting
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzbh extends AbstractSafeParcelable implements Geofence {
    public static final Parcelable.Creator<zzbh> CREATOR = new zzbi();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f15908f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final long f15909g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private final short f15910h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private final double f15911i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    private final double f15912j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.Field
    private final float f15913k;

    @SafeParcelable.Field
    private final int l;

    @SafeParcelable.Field
    private final int m;

    @SafeParcelable.Field
    private final int n;

    @SafeParcelable.Constructor
    public zzbh(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 7) int i2, @SafeParcelable.Param(id = 3) short s, @SafeParcelable.Param(id = 4) double d2, @SafeParcelable.Param(id = 5) double d3, @SafeParcelable.Param(id = 6) float f2, @SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 8) int i3, @SafeParcelable.Param(id = 9) int i4) {
        if (str == null || str.length() > 100) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "requestId is null or too long: ".concat(valueOf) : new String("requestId is null or too long: "));
        }
        if (f2 <= 0.0f) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("invalid radius: ");
            sb.append(f2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (d2 > 90.0d || d2 < -90.0d) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("invalid latitude: ");
            sb2.append(d2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (d3 > 180.0d || d3 < -180.0d) {
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append("invalid longitude: ");
            sb3.append(d3);
            throw new IllegalArgumentException(sb3.toString());
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            StringBuilder sb4 = new StringBuilder(46);
            sb4.append("No supported transition specified: ");
            sb4.append(i2);
            throw new IllegalArgumentException(sb4.toString());
        }
        this.f15910h = s;
        this.f15908f = str;
        this.f15911i = d2;
        this.f15912j = d3;
        this.f15913k = f2;
        this.f15909g = j2;
        this.l = i5;
        this.m = i3;
        this.n = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzbh)) {
            return false;
        }
        zzbh zzbhVar = (zzbh) obj;
        return this.f15913k == zzbhVar.f15913k && this.f15911i == zzbhVar.f15911i && this.f15912j == zzbhVar.f15912j && this.f15910h == zzbhVar.f15910h;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f15911i);
        int i2 = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.f15912j);
        return (((((((i2 * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f15913k)) * 31) + this.f15910h) * 31) + this.l;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        objArr[0] = this.f15910h != 1 ? null : "CIRCLE";
        objArr[1] = this.f15908f.replaceAll("\\p{C}", "?");
        objArr[2] = Integer.valueOf(this.l);
        objArr[3] = Double.valueOf(this.f15911i);
        objArr[4] = Double.valueOf(this.f15912j);
        objArr[5] = Float.valueOf(this.f15913k);
        objArr[6] = Integer.valueOf(this.m / 1000);
        objArr[7] = Integer.valueOf(this.n);
        objArr[8] = Long.valueOf(this.f15909g);
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", objArr);
    }

    public final String w() {
        return this.f15908f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.q(parcel, 1, w(), false);
        SafeParcelWriter.l(parcel, 2, this.f15909g);
        SafeParcelWriter.p(parcel, 3, this.f15910h);
        SafeParcelWriter.f(parcel, 4, this.f15911i);
        SafeParcelWriter.f(parcel, 5, this.f15912j);
        SafeParcelWriter.g(parcel, 6, this.f15913k);
        SafeParcelWriter.i(parcel, 7, this.l);
        SafeParcelWriter.i(parcel, 8, this.m);
        SafeParcelWriter.i(parcel, 9, this.n);
        SafeParcelWriter.b(parcel, a);
    }
}
