package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public interface zzadl extends IInterface {
    String d6() throws RemoteException;

    String getContent() throws RemoteException;

    void o1(IObjectWrapper iObjectWrapper) throws RemoteException;

    void recordClick() throws RemoteException;

    void recordImpression() throws RemoteException;
}
