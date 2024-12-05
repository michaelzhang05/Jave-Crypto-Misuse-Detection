package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new zzl();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f11017f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final b f11018g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private final boolean f11019h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private final boolean f11020i;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzk(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) boolean z2) {
        this.f11017f = str;
        this.f11018g = w(iBinder);
        this.f11019h = z;
        this.f11020i = z2;
    }

    private static b w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        try {
            IObjectWrapper l0 = zzj.C(iBinder).l0();
            byte[] bArr = l0 == null ? null : (byte[]) ObjectWrapper.R(l0);
            if (bArr != null) {
                return new c(bArr);
            }
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
            return null;
        } catch (RemoteException e2) {
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e2);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        IBinder asBinder;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.q(parcel, 1, this.f11017f, false);
        b bVar = this.f11018g;
        if (bVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            asBinder = null;
        } else {
            asBinder = bVar.asBinder();
        }
        SafeParcelWriter.h(parcel, 2, asBinder, false);
        SafeParcelWriter.c(parcel, 3, this.f11019h);
        SafeParcelWriter.c(parcel, 4, this.f11020i);
        SafeParcelWriter.b(parcel, a);
    }
}
