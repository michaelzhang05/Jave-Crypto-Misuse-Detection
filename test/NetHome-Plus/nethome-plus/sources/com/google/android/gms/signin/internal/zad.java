package com.google.android.gms.signin.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public interface zad extends IInterface {
    void B0(Status status, GoogleSignInAccount googleSignInAccount) throws RemoteException;

    void I3(Status status) throws RemoteException;

    void V3(Status status) throws RemoteException;

    void f5(ConnectionResult connectionResult, zaa zaaVar) throws RemoteException;

    void k1(zaj zajVar) throws RemoteException;
}
