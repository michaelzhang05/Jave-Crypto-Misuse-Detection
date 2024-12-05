package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public interface zzana extends IInterface {
    void A(IObjectWrapper iObjectWrapper) throws RemoteException;

    zzaea a() throws RemoteException;

    String b() throws RemoteException;

    String c() throws RemoteException;

    String d() throws RemoteException;

    IObjectWrapper e() throws RemoteException;

    void e0(IObjectWrapper iObjectWrapper) throws RemoteException;

    List f() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    String getStore() throws RemoteException;

    zzaar getVideoController() throws RemoteException;

    zzaei h() throws RemoteException;

    String i() throws RemoteException;

    double l() throws RemoteException;

    void o(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean q() throws RemoteException;

    void r(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException;

    void recordImpression() throws RemoteException;

    IObjectWrapper v() throws RemoteException;

    IObjectWrapper x() throws RemoteException;

    boolean z() throws RemoteException;
}
