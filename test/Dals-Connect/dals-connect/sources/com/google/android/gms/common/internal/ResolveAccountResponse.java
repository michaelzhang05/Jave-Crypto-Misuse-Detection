package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public class ResolveAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResolveAccountResponse> CREATOR = new zan();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.VersionField
    private final int f10875f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private IBinder f10876g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private ConnectionResult f10877h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private boolean f10878i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    private boolean f10879j;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public ResolveAccountResponse(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) ConnectionResult connectionResult, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) boolean z2) {
        this.f10875f = i2;
        this.f10876g = iBinder;
        this.f10877h = connectionResult;
        this.f10878i = z;
        this.f10879j = z2;
    }

    public boolean D() {
        return this.f10878i;
    }

    public boolean J() {
        return this.f10879j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveAccountResponse)) {
            return false;
        }
        ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse) obj;
        return this.f10877h.equals(resolveAccountResponse.f10877h) && w().equals(resolveAccountResponse.w());
    }

    public IAccountAccessor w() {
        return IAccountAccessor.Stub.C(this.f10876g);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f10875f);
        SafeParcelWriter.h(parcel, 2, this.f10876g, false);
        SafeParcelWriter.o(parcel, 3, z(), i2, false);
        SafeParcelWriter.c(parcel, 4, D());
        SafeParcelWriter.c(parcel, 5, J());
        SafeParcelWriter.b(parcel, a);
    }

    public ConnectionResult z() {
        return this.f10877h;
    }
}
