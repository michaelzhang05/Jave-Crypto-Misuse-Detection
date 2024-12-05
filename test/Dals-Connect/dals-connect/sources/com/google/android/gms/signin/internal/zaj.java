package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaj> CREATOR = new zak();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.VersionField
    private final int f16328f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final ConnectionResult f16329g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private final ResolveAccountResponse f16330h;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zaj(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) ConnectionResult connectionResult, @SafeParcelable.Param(id = 3) ResolveAccountResponse resolveAccountResponse) {
        this.f16328f = i2;
        this.f16329g = connectionResult;
        this.f16330h = resolveAccountResponse;
    }

    public final ConnectionResult w() {
        return this.f16329g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f16328f);
        SafeParcelWriter.o(parcel, 2, this.f16329g, i2, false);
        SafeParcelWriter.o(parcel, 3, this.f16330h, i2, false);
        SafeParcelWriter.b(parcel, a);
    }

    public final ResolveAccountResponse z() {
        return this.f16330h;
    }

    public zaj(int i2) {
        this(new ConnectionResult(8, null), null);
    }

    private zaj(ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this(1, connectionResult, null);
    }
}
