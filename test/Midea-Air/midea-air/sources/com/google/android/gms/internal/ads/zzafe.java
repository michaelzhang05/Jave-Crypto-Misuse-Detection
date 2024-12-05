package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public interface zzafe extends IInterface {
    zzaei B1(String str) throws RemoteException;

    boolean D3(IObjectWrapper iObjectWrapper) throws RemoteException;

    String E0(String str) throws RemoteException;

    IObjectWrapper c5() throws RemoteException;

    void destroy() throws RemoteException;

    List<String> getAvailableAssetNames() throws RemoteException;

    String getCustomTemplateId() throws RemoteException;

    zzaar getVideoController() throws RemoteException;

    IObjectWrapper k() throws RemoteException;

    void performClick(String str) throws RemoteException;

    void recordImpression() throws RemoteException;
}
