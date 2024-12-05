package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new zzag();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    private final List<LocationRequest> f16253f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final boolean f16254g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private final boolean f16255h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private zzae f16256i;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private final ArrayList<LocationRequest> a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        private boolean f16257b = false;

        /* renamed from: c, reason: collision with root package name */
        private boolean f16258c = false;

        /* renamed from: d, reason: collision with root package name */
        private zzae f16259d = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public LocationSettingsRequest(@SafeParcelable.Param(id = 1) List<LocationRequest> list, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2, @SafeParcelable.Param(id = 5) zzae zzaeVar) {
        this.f16253f = list;
        this.f16254g = z;
        this.f16255h = z2;
        this.f16256i = zzaeVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.u(parcel, 1, Collections.unmodifiableList(this.f16253f), false);
        SafeParcelWriter.c(parcel, 2, this.f16254g);
        SafeParcelWriter.c(parcel, 3, this.f16255h);
        SafeParcelWriter.o(parcel, 5, this.f16256i, i2, false);
        SafeParcelWriter.b(parcel, a);
    }
}
