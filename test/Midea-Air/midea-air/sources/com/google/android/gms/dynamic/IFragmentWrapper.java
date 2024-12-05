package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes2.dex */
public interface IFragmentWrapper extends IInterface {

    /* loaded from: classes2.dex */
    public static abstract class Stub extends zzb implements IFragmentWrapper {

        /* loaded from: classes2.dex */
        public static class zza extends com.google.android.gms.internal.common.zza implements IFragmentWrapper {
        }

        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        @Override // com.google.android.gms.internal.common.zzb
        protected final boolean u(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            switch (i2) {
                case 2:
                    IObjectWrapper H2 = H2();
                    parcel2.writeNoException();
                    zzc.c(parcel2, H2);
                    return true;
                case 3:
                    Bundle w = w();
                    parcel2.writeNoException();
                    zzc.e(parcel2, w);
                    return true;
                case 4:
                    int id = getId();
                    parcel2.writeNoException();
                    parcel2.writeInt(id);
                    return true;
                case 5:
                    IFragmentWrapper B3 = B3();
                    parcel2.writeNoException();
                    zzc.c(parcel2, B3);
                    return true;
                case 6:
                    IObjectWrapper h1 = h1();
                    parcel2.writeNoException();
                    zzc.c(parcel2, h1);
                    return true;
                case 7:
                    boolean N1 = N1();
                    parcel2.writeNoException();
                    zzc.a(parcel2, N1);
                    return true;
                case 8:
                    String tag = getTag();
                    parcel2.writeNoException();
                    parcel2.writeString(tag);
                    return true;
                case 9:
                    IFragmentWrapper V1 = V1();
                    parcel2.writeNoException();
                    zzc.c(parcel2, V1);
                    return true;
                case 10:
                    int X5 = X5();
                    parcel2.writeNoException();
                    parcel2.writeInt(X5);
                    return true;
                case 11:
                    boolean L0 = L0();
                    parcel2.writeNoException();
                    zzc.a(parcel2, L0);
                    return true;
                case 12:
                    IObjectWrapper G6 = G6();
                    parcel2.writeNoException();
                    zzc.c(parcel2, G6);
                    return true;
                case 13:
                    boolean v4 = v4();
                    parcel2.writeNoException();
                    zzc.a(parcel2, v4);
                    return true;
                case 14:
                    boolean w1 = w1();
                    parcel2.writeNoException();
                    zzc.a(parcel2, w1);
                    return true;
                case 15:
                    boolean o0 = o0();
                    parcel2.writeNoException();
                    zzc.a(parcel2, o0);
                    return true;
                case 16:
                    boolean v3 = v3();
                    parcel2.writeNoException();
                    zzc.a(parcel2, v3);
                    return true;
                case 17:
                    boolean q4 = q4();
                    parcel2.writeNoException();
                    zzc.a(parcel2, q4);
                    return true;
                case 18:
                    boolean r4 = r4();
                    parcel2.writeNoException();
                    zzc.a(parcel2, r4);
                    return true;
                case 19:
                    boolean isVisible = isVisible();
                    parcel2.writeNoException();
                    zzc.a(parcel2, isVisible);
                    return true;
                case 20:
                    y5(IObjectWrapper.Stub.C(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 21:
                    z0(zzc.d(parcel));
                    parcel2.writeNoException();
                    return true;
                case 22:
                    g1(zzc.d(parcel));
                    parcel2.writeNoException();
                    return true;
                case 23:
                    r7(zzc.d(parcel));
                    parcel2.writeNoException();
                    return true;
                case 24:
                    O0(zzc.d(parcel));
                    parcel2.writeNoException();
                    return true;
                case 25:
                    f1((Intent) zzc.b(parcel, Intent.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    startActivityForResult((Intent) zzc.b(parcel, Intent.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 27:
                    S3(IObjectWrapper.Stub.C(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    IFragmentWrapper B3() throws RemoteException;

    IObjectWrapper G6() throws RemoteException;

    IObjectWrapper H2() throws RemoteException;

    boolean L0() throws RemoteException;

    boolean N1() throws RemoteException;

    void O0(boolean z) throws RemoteException;

    void S3(IObjectWrapper iObjectWrapper) throws RemoteException;

    IFragmentWrapper V1() throws RemoteException;

    int X5() throws RemoteException;

    void f1(Intent intent) throws RemoteException;

    void g1(boolean z) throws RemoteException;

    int getId() throws RemoteException;

    String getTag() throws RemoteException;

    IObjectWrapper h1() throws RemoteException;

    boolean isVisible() throws RemoteException;

    boolean o0() throws RemoteException;

    boolean q4() throws RemoteException;

    boolean r4() throws RemoteException;

    void r7(boolean z) throws RemoteException;

    void startActivityForResult(Intent intent, int i2) throws RemoteException;

    boolean v3() throws RemoteException;

    boolean v4() throws RemoteException;

    Bundle w() throws RemoteException;

    boolean w1() throws RemoteException;

    void y5(IObjectWrapper iObjectWrapper) throws RemoteException;

    void z0(boolean z) throws RemoteException;
}
