package com.google.android.gms.internal.auth;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzl;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public interface zzx extends IInterface {
    void J2(DeviceMetaData deviceMetaData) throws RemoteException;

    void N4() throws RemoteException;

    void S0(Status status, zzl zzlVar) throws RemoteException;

    void Z5(Status status) throws RemoteException;

    void i6(Status status) throws RemoteException;

    void t0(Status status, com.google.android.gms.auth.api.accounttransfer.zzt zztVar) throws RemoteException;

    void y2(byte[] bArr) throws RemoteException;
}
