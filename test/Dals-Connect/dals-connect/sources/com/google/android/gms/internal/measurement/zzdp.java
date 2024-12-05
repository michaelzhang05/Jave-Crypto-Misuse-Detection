package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzdp extends zzq implements zzdn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzdn
    public final void A6(IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        Parcel u = u();
        zzs.c(u, iObjectWrapper);
        u.writeLong(j2);
        C(25, u);
    }

    @Override // com.google.android.gms.internal.measurement.zzdn
    public final void B6(String str, long j2) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        u.writeLong(j2);
        C(24, u);
    }

    @Override // com.google.android.gms.internal.measurement.zzdn
    public final void C0(IObjectWrapper iObjectWrapper, String str, String str2, long j2) throws RemoteException {
        Parcel u = u();
        zzs.c(u, iObjectWrapper);
        u.writeString(str);
        u.writeString(str2);
        u.writeLong(j2);
        C(15, u);
    }

    @Override // com.google.android.gms.internal.measurement.zzdn
    public final void I1(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        u.writeString(str2);
        zzs.d(u, bundle);
        zzs.a(u, z);
        zzs.a(u, z2);
        u.writeLong(j2);
        C(2, u);
    }

    @Override // com.google.android.gms.internal.measurement.zzdn
    public final void I6(IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        Parcel u = u();
        zzs.c(u, iObjectWrapper);
        u.writeLong(j2);
        C(29, u);
    }

    @Override // com.google.android.gms.internal.measurement.zzdn
    public final void J1(IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        Parcel u = u();
        zzs.c(u, iObjectWrapper);
        u.writeLong(j2);
        C(30, u);
    }

    @Override // com.google.android.gms.internal.measurement.zzdn
    public final void M1(String str, zzdq zzdqVar) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        zzs.c(u, zzdqVar);
        C(6, u);
    }

    @Override // com.google.android.gms.internal.measurement.zzdn
    public final void N5(zzdq zzdqVar) throws RemoteException {
        Parcel u = u();
        zzs.c(u, zzdqVar);
        C(19, u);
    }

    @Override // com.google.android.gms.internal.measurement.zzdn
    public final void R0(IObjectWrapper iObjectWrapper, zzdq zzdqVar, long j2) throws RemoteException {
        Parcel u = u();
        zzs.c(u, iObjectWrapper);
        zzs.c(u, zzdqVar);
        u.writeLong(j2);
        C(31, u);
    }

    @Override // com.google.android.gms.internal.measurement.zzdn
    public final void S5(IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        Parcel u = u();
        zzs.c(u, iObjectWrapper);
        u.writeLong(j2);
        C(28, u);
    }

    @Override // com.google.android.gms.internal.measurement.zzdn
    public final void T0(Bundle bundle, zzdq zzdqVar, long j2) throws RemoteException {
        Parcel u = u();
        zzs.d(u, bundle);
        zzs.c(u, zzdqVar);
        u.writeLong(j2);
        C(32, u);
    }

    @Override // com.google.android.gms.internal.measurement.zzdn
    public final void W0(int i2, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel u = u();
        u.writeInt(i2);
        u.writeString(str);
        zzs.c(u, iObjectWrapper);
        zzs.c(u, iObjectWrapper2);
        zzs.c(u, iObjectWrapper3);
        C(33, u);
    }

    @Override // com.google.android.gms.internal.measurement.zzdn
    public final void W2(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j2) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        u.writeString(str2);
        zzs.c(u, iObjectWrapper);
        zzs.a(u, z);
        u.writeLong(j2);
        C(4, u);
    }

    @Override // com.google.android.gms.internal.measurement.zzdn
    public final void X6(zzdq zzdqVar) throws RemoteException {
        Parcel u = u();
        zzs.c(u, zzdqVar);
        C(16, u);
    }

    @Override // com.google.android.gms.internal.measurement.zzdn
    public final void Z(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        u.writeString(str2);
        zzs.d(u, bundle);
        C(9, u);
    }

    @Override // com.google.android.gms.internal.measurement.zzdn
    public final void b4(String str, long j2) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        u.writeLong(j2);
        C(23, u);
    }

    @Override // com.google.android.gms.internal.measurement.zzdn
    public final void c1(zzdq zzdqVar) throws RemoteException {
        Parcel u = u();
        zzs.c(u, zzdqVar);
        C(22, u);
    }

    @Override // com.google.android.gms.internal.measurement.zzdn
    public final void f4(zzdq zzdqVar) throws RemoteException {
        Parcel u = u();
        zzs.c(u, zzdqVar);
        C(17, u);
    }

    @Override // com.google.android.gms.internal.measurement.zzdn
    public final void g7(String str, String str2, zzdq zzdqVar) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        u.writeString(str2);
        zzs.c(u, zzdqVar);
        C(10, u);
    }

    @Override // com.google.android.gms.internal.measurement.zzdn
    public final void i3(IObjectWrapper iObjectWrapper, zzdy zzdyVar, long j2) throws RemoteException {
        Parcel u = u();
        zzs.c(u, iObjectWrapper);
        zzs.d(u, zzdyVar);
        u.writeLong(j2);
        C(1, u);
    }

    @Override // com.google.android.gms.internal.measurement.zzdn
    public final void j4(String str, String str2, boolean z, zzdq zzdqVar) throws RemoteException {
        Parcel u = u();
        u.writeString(str);
        u.writeString(str2);
        zzs.a(u, z);
        zzs.c(u, zzdqVar);
        C(5, u);
    }

    @Override // com.google.android.gms.internal.measurement.zzdn
    public final void m6(IObjectWrapper iObjectWrapper, Bundle bundle, long j2) throws RemoteException {
        Parcel u = u();
        zzs.c(u, iObjectWrapper);
        zzs.d(u, bundle);
        u.writeLong(j2);
        C(27, u);
    }

    @Override // com.google.android.gms.internal.measurement.zzdn
    public final void v0(Bundle bundle, long j2) throws RemoteException {
        Parcel u = u();
        zzs.d(u, bundle);
        u.writeLong(j2);
        C(8, u);
    }

    @Override // com.google.android.gms.internal.measurement.zzdn
    public final void x2(IObjectWrapper iObjectWrapper, long j2) throws RemoteException {
        Parcel u = u();
        zzs.c(u, iObjectWrapper);
        u.writeLong(j2);
        C(26, u);
    }

    @Override // com.google.android.gms.internal.measurement.zzdn
    public final void x4(zzdq zzdqVar) throws RemoteException {
        Parcel u = u();
        zzs.c(u, zzdqVar);
        C(21, u);
    }
}
