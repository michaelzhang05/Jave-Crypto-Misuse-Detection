package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public interface zzbjf extends IInterface {
    void F4(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException;

    int G3(String str) throws RemoteException;

    void K0(Bundle bundle) throws RemoteException;

    List T4(String str, String str2) throws RemoteException;

    String W4() throws RemoteException;

    String Y1() throws RemoteException;

    void Y4(Bundle bundle) throws RemoteException;

    void Z(String str, String str2, Bundle bundle) throws RemoteException;

    Map a4(String str, String str2, boolean z) throws RemoteException;

    void e6(String str, String str2, IObjectWrapper iObjectWrapper) throws RemoteException;

    void f6(String str) throws RemoteException;

    Bundle i2(Bundle bundle) throws RemoteException;

    String l4() throws RemoteException;

    String p4() throws RemoteException;

    long r2() throws RemoteException;

    void w3(String str, String str2, Bundle bundle) throws RemoteException;

    void w7(String str) throws RemoteException;

    String z2() throws RemoteException;
}
