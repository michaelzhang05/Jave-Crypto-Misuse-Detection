package com.google.android.gms.common.internal;

import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public interface ICancelToken extends IInterface {

    /* loaded from: classes2.dex */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements ICancelToken {

        /* loaded from: classes2.dex */
        public static class zza extends com.google.android.gms.internal.common.zza implements ICancelToken {
            @Override // com.google.android.gms.common.internal.ICancelToken
            public final void cancel() throws RemoteException {
                R(2, u());
            }
        }

        public Stub() {
            super("com.google.android.gms.common.internal.ICancelToken");
        }
    }

    void cancel() throws RemoteException;
}
