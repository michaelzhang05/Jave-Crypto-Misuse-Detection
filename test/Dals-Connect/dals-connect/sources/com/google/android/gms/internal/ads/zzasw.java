package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public interface zzasw extends IInterface {
    void P(zzatb zzatbVar) throws RemoteException;

    void T1(IObjectWrapper iObjectWrapper) throws RemoteException;

    void b5(zzasu zzasuVar) throws RemoteException;

    void c0(zzzp zzzpVar) throws RemoteException;

    void destroy() throws RemoteException;

    Bundle getAdMetadata() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    void h4(zzath zzathVar) throws RemoteException;

    boolean isLoaded() throws RemoteException;

    void k6(IObjectWrapper iObjectWrapper) throws RemoteException;

    void l7(IObjectWrapper iObjectWrapper) throws RemoteException;

    void pause() throws RemoteException;

    void r5(String str) throws RemoteException;

    void resume() throws RemoteException;

    void setCustomData(String str) throws RemoteException;

    void setImmersiveMode(boolean z) throws RemoteException;

    void setUserId(String str) throws RemoteException;

    void show() throws RemoteException;

    void u4(IObjectWrapper iObjectWrapper) throws RemoteException;
}
