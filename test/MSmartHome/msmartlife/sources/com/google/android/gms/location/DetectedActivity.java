package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Comparator;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class DetectedActivity extends AbstractSafeParcelable {

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    private int f16223j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.Field
    private int f16224k;

    /* renamed from: f, reason: collision with root package name */
    private static final Comparator<DetectedActivity> f16219f = new d();

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f16220g = {9, 10};

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f16221h = {0, 1, 2, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 16, 17, 18, 19};

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f16222i = {0, 1, 2, 3, 7, 8, 16, 17};
    public static final Parcelable.Creator<DetectedActivity> CREATOR = new zzi();

    @SafeParcelable.Constructor
    public DetectedActivity(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3) {
        this.f16223j = i2;
        this.f16224k = i3;
    }

    public static void D(int i2) {
        boolean z = false;
        for (int i3 : f16222i) {
            if (i3 == i2) {
                z = true;
            }
        }
        if (z) {
            return;
        }
        StringBuilder sb = new StringBuilder(81);
        sb.append(i2);
        sb.append(" is not a valid DetectedActivity supported by Activity Transition API.");
        Log.w("DetectedActivity", sb.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            if (this.f16223j == detectedActivity.f16223j && this.f16224k == detectedActivity.f16224k) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.b(Integer.valueOf(this.f16223j), Integer.valueOf(this.f16224k));
    }

    public String toString() {
        String str;
        int z = z();
        if (z == 0) {
            str = "IN_VEHICLE";
        } else if (z == 1) {
            str = "ON_BICYCLE";
        } else if (z == 2) {
            str = "ON_FOOT";
        } else if (z == 3) {
            str = "STILL";
        } else if (z == 4) {
            str = "UNKNOWN";
        } else if (z == 5) {
            str = "TILTING";
        } else if (z == 7) {
            str = "WALKING";
        } else if (z != 8) {
            switch (z) {
                case 16:
                    str = "IN_ROAD_VEHICLE";
                    break;
                case 17:
                    str = "IN_RAIL_VEHICLE";
                    break;
                case 18:
                    str = "IN_TWO_WHEELER_VEHICLE";
                    break;
                case 19:
                    str = "IN_FOUR_WHEELER_VEHICLE";
                    break;
                default:
                    str = Integer.toString(z);
                    break;
            }
        } else {
            str = "RUNNING";
        }
        int i2 = this.f16224k;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48);
        sb.append("DetectedActivity [type=");
        sb.append(str);
        sb.append(", confidence=");
        sb.append(i2);
        sb.append("]");
        return sb.toString();
    }

    public int w() {
        return this.f16224k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f16223j);
        SafeParcelWriter.i(parcel, 2, this.f16224k);
        SafeParcelWriter.b(parcel, a);
    }

    public int z() {
        int i2 = this.f16223j;
        if (i2 > 19 || i2 < 0) {
            return 4;
        }
        return i2;
    }
}
