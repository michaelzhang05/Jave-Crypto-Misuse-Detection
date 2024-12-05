package com.google.android.gms.dynamite;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public interface zzi extends IInterface {
    int O6() throws RemoteException;

    int Q3(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException;

    int S4(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException;

    IObjectWrapper i5(IObjectWrapper iObjectWrapper, String str, int i2) throws RemoteException;

    IObjectWrapper o2(IObjectWrapper iObjectWrapper, String str, int i2) throws RemoteException;
}
