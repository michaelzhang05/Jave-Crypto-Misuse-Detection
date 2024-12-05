package com.google.android.gms.internal.safetynet;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafeBrowsingData;
import com.google.android.gms.safetynet.zzd;
import com.google.android.gms.safetynet.zzf;

/* loaded from: classes2.dex */
public interface zzg extends IInterface {
    void E5(Status status, zzd zzdVar) throws RemoteException;

    void P3(Status status, zzf zzfVar) throws RemoteException;

    void T5(Status status, boolean z) throws RemoteException;

    void V6(Status status, boolean z) throws RemoteException;

    void W5(Status status, com.google.android.gms.safetynet.zzh zzhVar) throws RemoteException;

    void b0(Status status) throws RemoteException;

    void e1(Status status, com.google.android.gms.safetynet.zza zzaVar) throws RemoteException;

    void g0(String str) throws RemoteException;

    void v2(Status status, SafeBrowsingData safeBrowsingData) throws RemoteException;
}
