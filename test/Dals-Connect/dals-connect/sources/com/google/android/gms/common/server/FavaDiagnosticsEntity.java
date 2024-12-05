package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes2.dex */
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {

    @KeepForSdk
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new zaa();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.VersionField
    private final int f10926f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f10927g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private final int f10928h;

    @SafeParcelable.Constructor
    public FavaDiagnosticsEntity(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i3) {
        this.f10926f = i2;
        this.f10927g = str;
        this.f10928h = i3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f10926f);
        SafeParcelWriter.q(parcel, 2, this.f10927g, false);
        SafeParcelWriter.i(parcel, 3, this.f10928h);
        SafeParcelWriter.b(parcel, a);
    }
}
