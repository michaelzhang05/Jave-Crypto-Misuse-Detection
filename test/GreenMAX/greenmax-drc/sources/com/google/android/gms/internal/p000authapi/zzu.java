package com.google.android.gms.internal.p000authapi;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public interface zzu extends IInterface {
    void J3(Status status, Credential credential) throws RemoteException;

    void j7(Status status) throws RemoteException;

    void o7(Status status, String str) throws RemoteException;
}
