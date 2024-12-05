package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public interface zzaov extends IInterface {
    boolean B2(IObjectWrapper iObjectWrapper) throws RemoteException;

    void R4(String str, String str2, zzxz zzxzVar, IObjectWrapper iObjectWrapper, zzaoj zzaojVar, zzamv zzamvVar, zzyd zzydVar) throws RemoteException;

    void T6(String str, String str2, zzxz zzxzVar, IObjectWrapper iObjectWrapper, zzaom zzaomVar, zzamv zzamvVar) throws RemoteException;

    void e4(String str, String str2, zzxz zzxzVar, IObjectWrapper iObjectWrapper, zzaop zzaopVar, zzamv zzamvVar) throws RemoteException;

    zzaar getVideoController() throws RemoteException;

    void k3(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean l2(IObjectWrapper iObjectWrapper) throws RemoteException;

    void p3(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzyd zzydVar, zzaoy zzaoyVar) throws RemoteException;

    void s5(String str, String str2, zzxz zzxzVar, IObjectWrapper iObjectWrapper, zzaos zzaosVar, zzamv zzamvVar) throws RemoteException;

    zzapj s6() throws RemoteException;

    zzapj t5() throws RemoteException;

    void u5(String[] strArr, Bundle[] bundleArr) throws RemoteException;
}
