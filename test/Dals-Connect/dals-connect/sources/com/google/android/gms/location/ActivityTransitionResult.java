package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class ActivityTransitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new zzg();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    private final List<ActivityTransitionEvent> f16218f;

    @SafeParcelable.Constructor
    public ActivityTransitionResult(@SafeParcelable.Param(id = 1) List<ActivityTransitionEvent> list) {
        Preconditions.k(list, "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i2 = 1; i2 < list.size(); i2++) {
                Preconditions.a(list.get(i2).z() >= list.get(i2 + (-1)).z());
            }
        }
        this.f16218f = Collections.unmodifiableList(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f16218f.equals(((ActivityTransitionResult) obj).f16218f);
    }

    public int hashCode() {
        return this.f16218f.hashCode();
    }

    public List<ActivityTransitionEvent> w() {
        return this.f16218f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.u(parcel, 1, w(), false);
        SafeParcelWriter.b(parcel, a);
    }
}
