package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new zzf();

    /* renamed from: f, reason: collision with root package name */
    public static final Comparator<ActivityTransition> f16214f = new c();

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final List<ActivityTransition> f16215g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f16216h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private final List<ClientIdentity> f16217i;

    @SafeParcelable.Constructor
    public ActivityTransitionRequest(@SafeParcelable.Param(id = 1) List<ActivityTransition> list, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) List<ClientIdentity> list2) {
        Preconditions.k(list, "transitions can't be null");
        Preconditions.b(list.size() > 0, "transitions can't be empty.");
        TreeSet treeSet = new TreeSet(f16214f);
        for (ActivityTransition activityTransition : list) {
            Preconditions.b(treeSet.add(activityTransition), String.format("Found duplicated transition: %s.", activityTransition));
        }
        this.f16215g = Collections.unmodifiableList(list);
        this.f16216h = str;
        this.f16217i = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            if (Objects.a(this.f16215g, activityTransitionRequest.f16215g) && Objects.a(this.f16216h, activityTransitionRequest.f16216h) && Objects.a(this.f16217i, activityTransitionRequest.f16217i)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f16215g.hashCode() * 31;
        String str = this.f16216h;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<ClientIdentity> list = this.f16217i;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f16215g);
        String str = this.f16216h;
        String valueOf2 = String.valueOf(this.f16217i);
        StringBuilder sb = new StringBuilder(valueOf.length() + 61 + String.valueOf(str).length() + valueOf2.length());
        sb.append("ActivityTransitionRequest [mTransitions=");
        sb.append(valueOf);
        sb.append(", mTag='");
        sb.append(str);
        sb.append('\'');
        sb.append(", mClients=");
        sb.append(valueOf2);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.u(parcel, 1, this.f16215g, false);
        SafeParcelWriter.q(parcel, 2, this.f16216h, false);
        SafeParcelWriter.u(parcel, 3, this.f16217i, false);
        SafeParcelWriter.b(parcel, a);
    }
}
