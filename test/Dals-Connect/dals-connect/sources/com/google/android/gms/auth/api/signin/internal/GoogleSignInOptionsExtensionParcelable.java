package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new zaa();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.VersionField
    private final int f10445f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private int f10446g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private Bundle f10447h;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public GoogleSignInOptionsExtensionParcelable(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) Bundle bundle) {
        this.f10445f = i2;
        this.f10446g = i3;
        this.f10447h = bundle;
    }

    @KeepForSdk
    public int w() {
        return this.f10446g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f10445f);
        SafeParcelWriter.i(parcel, 2, w());
        SafeParcelWriter.d(parcel, 3, this.f10447h, false);
        SafeParcelWriter.b(parcel, a);
    }
}
