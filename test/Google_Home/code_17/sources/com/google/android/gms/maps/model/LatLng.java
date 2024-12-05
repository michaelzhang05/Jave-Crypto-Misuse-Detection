package com.google.android.gms.maps.model;

import R.a;
import R.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j0.C3174a;

/* loaded from: classes3.dex */
public final class LatLng extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LatLng> CREATOR = new C3174a();

    /* renamed from: a, reason: collision with root package name */
    public final double f16922a;

    /* renamed from: b, reason: collision with root package name */
    public final double f16923b;

    public LatLng(double d8, double d9) {
        if (d9 >= -180.0d && d9 < 180.0d) {
            this.f16923b = d9;
        } else {
            this.f16923b = ((((d9 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        }
        this.f16922a = Math.max(-90.0d, Math.min(90.0d, d8));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        if (Double.doubleToLongBits(this.f16922a) == Double.doubleToLongBits(latLng.f16922a) && Double.doubleToLongBits(this.f16923b) == Double.doubleToLongBits(latLng.f16923b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f16922a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f16923b);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        double d8 = this.f16922a;
        double d9 = this.f16923b;
        StringBuilder sb = new StringBuilder(60);
        sb.append("lat/lng: (");
        sb.append(d8);
        sb.append(",");
        sb.append(d9);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = c.a(parcel);
        c.g(parcel, 2, this.f16922a);
        c.g(parcel, 3, this.f16923b);
        c.b(parcel, a8);
    }
}
