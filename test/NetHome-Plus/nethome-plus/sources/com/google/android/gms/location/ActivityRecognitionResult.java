package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new zzb();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    private List<DetectedActivity> f16203f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private long f16204g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private long f16205h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private int f16206i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    private Bundle f16207j;

    @SafeParcelable.Constructor
    public ActivityRecognitionResult(@SafeParcelable.Param(id = 1) List<DetectedActivity> list, @SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 3) long j3, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) Bundle bundle) {
        Preconditions.b(list != null && list.size() > 0, "Must have at least 1 detected activity");
        Preconditions.b(j2 > 0 && j3 > 0, "Must set times");
        this.f16203f = list;
        this.f16204g = j2;
        this.f16205h = j3;
        this.f16206i = i2;
        this.f16207j = bundle;
    }

    private static boolean w(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return true;
        }
        if ((bundle == null && bundle2 != null) || ((bundle != null && bundle2 == null) || bundle.size() != bundle2.size())) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            if (bundle.get(str) == null) {
                if (bundle2.get(str) != null) {
                    return false;
                }
            } else if (bundle.get(str) instanceof Bundle) {
                if (!w(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else if (!bundle.get(str).equals(bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            if (this.f16204g == activityRecognitionResult.f16204g && this.f16205h == activityRecognitionResult.f16205h && this.f16206i == activityRecognitionResult.f16206i && Objects.a(this.f16203f, activityRecognitionResult.f16203f) && w(this.f16207j, activityRecognitionResult.f16207j)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.b(Long.valueOf(this.f16204g), Long.valueOf(this.f16205h), Integer.valueOf(this.f16206i), this.f16203f, this.f16207j);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f16203f);
        long j2 = this.f16204g;
        long j3 = this.f16205h;
        StringBuilder sb = new StringBuilder(valueOf.length() + 124);
        sb.append("ActivityRecognitionResult [probableActivities=");
        sb.append(valueOf);
        sb.append(", timeMillis=");
        sb.append(j2);
        sb.append(", elapsedRealtimeMillis=");
        sb.append(j3);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.u(parcel, 1, this.f16203f, false);
        SafeParcelWriter.l(parcel, 2, this.f16204g);
        SafeParcelWriter.l(parcel, 3, this.f16205h);
        SafeParcelWriter.i(parcel, 4, this.f16206i);
        SafeParcelWriter.d(parcel, 5, this.f16207j, false);
        SafeParcelWriter.b(parcel, a);
    }
}
