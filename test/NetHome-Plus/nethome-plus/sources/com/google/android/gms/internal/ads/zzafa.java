package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public interface zzafa extends IInterface {
    zzaea a() throws RemoteException;

    String b() throws RemoteException;

    String c() throws RemoteException;

    String d() throws RemoteException;

    void destroy() throws RemoteException;

    IObjectWrapper e() throws RemoteException;

    List f() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    zzaar getVideoController() throws RemoteException;

    zzaei h0() throws RemoteException;

    IObjectWrapper k() throws RemoteException;

    String m() throws RemoteException;

    void n(Bundle bundle) throws RemoteException;

    boolean s(Bundle bundle) throws RemoteException;

    void y(Bundle bundle) throws RemoteException;
}
