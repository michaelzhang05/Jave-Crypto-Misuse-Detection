package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class ActivityTransition extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransition> CREATOR = new zzc();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    private final int f16208f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final int f16209g;

    /* loaded from: classes2.dex */
    public static class Builder {
        private int a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f16210b = -1;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface SupportedActivityTransition {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public ActivityTransition(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3) {
        this.f16208f = i2;
        this.f16209g = i3;
    }

    public static void D(int i2) {
        boolean z = i2 >= 0 && i2 <= 1;
        StringBuilder sb = new StringBuilder(41);
        sb.append("Transition type ");
        sb.append(i2);
        sb.append(" is not valid.");
        Preconditions.b(z, sb.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        return this.f16208f == activityTransition.f16208f && this.f16209g == activityTransition.f16209g;
    }

    public int hashCode() {
        return Objects.b(Integer.valueOf(this.f16208f), Integer.valueOf(this.f16209g));
    }

    public String toString() {
        int i2 = this.f16208f;
        int i3 = this.f16209g;
        StringBuilder sb = new StringBuilder(75);
        sb.append("ActivityTransition [mActivityType=");
        sb.append(i2);
        sb.append(", mTransitionType=");
        sb.append(i3);
        sb.append(']');
        return sb.toString();
    }

    public int w() {
        return this.f16208f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, w());
        SafeParcelWriter.i(parcel, 2, z());
        SafeParcelWriter.b(parcel, a);
    }

    public int z() {
        return this.f16209g;
    }
}
