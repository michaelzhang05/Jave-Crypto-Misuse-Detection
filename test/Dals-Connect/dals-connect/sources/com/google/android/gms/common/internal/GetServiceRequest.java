package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new zzd();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.VersionField
    private final int f10845f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final int f10846g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private int f10847h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    String f10848i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    IBinder f10849j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.Field
    Scope[] f10850k;

    @SafeParcelable.Field
    Bundle l;

    @SafeParcelable.Field
    Account m;

    @SafeParcelable.Field
    Feature[] n;

    @SafeParcelable.Field
    Feature[] o;

    @SafeParcelable.Field
    private boolean p;

    public GetServiceRequest(int i2) {
        this.f10845f = 4;
        this.f10847h = GoogleApiAvailabilityLight.a;
        this.f10846g = i2;
        this.p = true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f10845f);
        SafeParcelWriter.i(parcel, 2, this.f10846g);
        SafeParcelWriter.i(parcel, 3, this.f10847h);
        SafeParcelWriter.q(parcel, 4, this.f10848i, false);
        SafeParcelWriter.h(parcel, 5, this.f10849j, false);
        SafeParcelWriter.t(parcel, 6, this.f10850k, i2, false);
        SafeParcelWriter.d(parcel, 7, this.l, false);
        SafeParcelWriter.o(parcel, 8, this.m, i2, false);
        SafeParcelWriter.t(parcel, 10, this.n, i2, false);
        SafeParcelWriter.t(parcel, 11, this.o, i2, false);
        SafeParcelWriter.c(parcel, 12, this.p);
        SafeParcelWriter.b(parcel, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public GetServiceRequest(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) int i4, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) IBinder iBinder, @SafeParcelable.Param(id = 6) Scope[] scopeArr, @SafeParcelable.Param(id = 7) Bundle bundle, @SafeParcelable.Param(id = 8) Account account, @SafeParcelable.Param(id = 10) Feature[] featureArr, @SafeParcelable.Param(id = 11) Feature[] featureArr2, @SafeParcelable.Param(id = 12) boolean z) {
        this.f10845f = i2;
        this.f10846g = i3;
        this.f10847h = i4;
        if ("com.google.android.gms".equals(str)) {
            this.f10848i = "com.google.android.gms";
        } else {
            this.f10848i = str;
        }
        if (i2 < 2) {
            this.m = iBinder != null ? AccountAccessor.R(IAccountAccessor.Stub.C(iBinder)) : null;
        } else {
            this.f10849j = iBinder;
            this.m = account;
        }
        this.f10850k = scopeArr;
        this.l = bundle;
        this.n = featureArr;
        this.o = featureArr2;
        this.p = z;
    }
}
