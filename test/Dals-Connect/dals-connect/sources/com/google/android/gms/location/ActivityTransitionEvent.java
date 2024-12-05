package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class ActivityTransitionEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = new zzd();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    private final int f16211f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final int f16212g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private final long f16213h;

    @SafeParcelable.Constructor
    public ActivityTransitionEvent(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) long j2) {
        DetectedActivity.D(i2);
        ActivityTransition.D(i3);
        this.f16211f = i2;
        this.f16212g = i3;
        this.f16213h = j2;
    }

    public int D() {
        return this.f16212g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        return this.f16211f == activityTransitionEvent.f16211f && this.f16212g == activityTransitionEvent.f16212g && this.f16213h == activityTransitionEvent.f16213h;
    }

    public int hashCode() {
        return Objects.b(Integer.valueOf(this.f16211f), Integer.valueOf(this.f16212g), Long.valueOf(this.f16213h));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i2 = this.f16211f;
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("ActivityType ");
        sb2.append(i2);
        sb.append(sb2.toString());
        sb.append(" ");
        int i3 = this.f16212g;
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append("TransitionType ");
        sb3.append(i3);
        sb.append(sb3.toString());
        sb.append(" ");
        long j2 = this.f16213h;
        StringBuilder sb4 = new StringBuilder(41);
        sb4.append("ElapsedRealTimeNanos ");
        sb4.append(j2);
        sb.append(sb4.toString());
        return sb.toString();
    }

    public int w() {
        return this.f16211f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, w());
        SafeParcelWriter.i(parcel, 2, D());
        SafeParcelWriter.l(parcel, 3, z());
        SafeParcelWriter.b(parcel, a);
    }

    public long z() {
        return this.f16213h;
    }
}
