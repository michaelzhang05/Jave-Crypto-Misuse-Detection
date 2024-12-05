package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new zzaa();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    @Deprecated
    private int f16235f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    @Deprecated
    private int f16236g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private long f16237h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private int f16238i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    private zzaj[] f16239j;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public LocationAvailability(@SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 1) int i3, @SafeParcelable.Param(id = 2) int i4, @SafeParcelable.Param(id = 3) long j2, @SafeParcelable.Param(id = 5) zzaj[] zzajVarArr) {
        this.f16238i = i2;
        this.f16235f = i3;
        this.f16236g = i4;
        this.f16237h = j2;
        this.f16239j = zzajVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LocationAvailability.class == obj.getClass()) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f16235f == locationAvailability.f16235f && this.f16236g == locationAvailability.f16236g && this.f16237h == locationAvailability.f16237h && this.f16238i == locationAvailability.f16238i && Arrays.equals(this.f16239j, locationAvailability.f16239j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(this.f16238i), Integer.valueOf(this.f16235f), Integer.valueOf(this.f16236g), Long.valueOf(this.f16237h), this.f16239j);
    }

    public final String toString() {
        boolean w = w();
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(w);
        sb.append("]");
        return sb.toString();
    }

    public final boolean w() {
        return this.f16238i < 1000;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f16235f);
        SafeParcelWriter.i(parcel, 2, this.f16236g);
        SafeParcelWriter.l(parcel, 3, this.f16237h);
        SafeParcelWriter.i(parcel, 4, this.f16238i);
        SafeParcelWriter.t(parcel, 5, this.f16239j, i2, false);
        SafeParcelWriter.b(parcel, a);
    }
}
