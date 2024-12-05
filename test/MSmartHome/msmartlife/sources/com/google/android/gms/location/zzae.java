package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new zzaf();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f16272f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f16273g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f16274h;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzae(@SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 1) String str2, @SafeParcelable.Param(id = 2) String str3) {
        this.f16274h = str;
        this.f16272f = str2;
        this.f16273g = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.q(parcel, 1, this.f16272f, false);
        SafeParcelWriter.q(parcel, 2, this.f16273g, false);
        SafeParcelWriter.q(parcel, 5, this.f16274h, false);
        SafeParcelWriter.b(parcel, a);
    }
}
