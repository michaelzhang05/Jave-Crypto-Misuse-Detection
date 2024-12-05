package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import cm.aptoide.pt.store.view.StoreTabGridRecyclerFragment;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public class PlaceReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<PlaceReport> CREATOR = new zza();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.VersionField
    private final int f16268f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f16269g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f16270h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f16271i;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public PlaceReport(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3) {
        this.f16268f = i2;
        this.f16269g = str;
        this.f16270h = str2;
        this.f16271i = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlaceReport)) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj;
        return Objects.a(this.f16269g, placeReport.f16269g) && Objects.a(this.f16270h, placeReport.f16270h) && Objects.a(this.f16271i, placeReport.f16271i);
    }

    public int hashCode() {
        return Objects.b(this.f16269g, this.f16270h, this.f16271i);
    }

    public String toString() {
        Objects.ToStringHelper c2 = Objects.c(this);
        c2.a("placeId", this.f16269g);
        c2.a(StoreTabGridRecyclerFragment.BundleCons.TAG, this.f16270h);
        if (!"unknown".equals(this.f16271i)) {
            c2.a("source", this.f16271i);
        }
        return c2.toString();
    }

    public String w() {
        return this.f16269g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f16268f);
        SafeParcelWriter.q(parcel, 2, w(), false);
        SafeParcelWriter.q(parcel, 3, z(), false);
        SafeParcelWriter.q(parcel, 4, this.f16271i, false);
        SafeParcelWriter.b(parcel, a);
    }

    public String z() {
        return this.f16270h;
    }
}
