package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public interface zzatt extends IInterface {
    void A2(zzaue zzaueVar) throws RemoteException;

    void E7(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException;

    void L1(zzxz zzxzVar, zzaub zzaubVar) throws RemoteException;

    void V5(zzaao zzaaoVar) throws RemoteException;

    void c6(zzatw zzatwVar) throws RemoteException;

    void d2(zzaum zzaumVar) throws RemoteException;

    Bundle getAdMetadata() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    boolean isLoaded() throws RemoteException;

    zzatq n7() throws RemoteException;

    void q5(IObjectWrapper iObjectWrapper) throws RemoteException;
}
