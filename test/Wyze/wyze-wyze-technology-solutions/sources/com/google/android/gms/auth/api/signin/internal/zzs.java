package com.google.android.gms.auth.api.signin.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public interface zzs extends IInterface {
    void E1(Status status) throws RemoteException;

    void N0(Status status) throws RemoteException;

    void u2(GoogleSignInAccount googleSignInAccount, Status status) throws RemoteException;
}
