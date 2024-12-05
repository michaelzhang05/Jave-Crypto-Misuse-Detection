package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* loaded from: classes2.dex */
public final class zzv extends com.google.android.gms.internal.p000authapi.zzc implements zzu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzu
    public final void e3(zzs zzsVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel u = u();
        com.google.android.gms.internal.p000authapi.zze.b(u, zzsVar);
        com.google.android.gms.internal.p000authapi.zze.c(u, googleSignInOptions);
        C(102, u);
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzu
    public final void y3(zzs zzsVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel u = u();
        com.google.android.gms.internal.p000authapi.zze.b(u, zzsVar);
        com.google.android.gms.internal.p000authapi.zze.c(u, googleSignInOptions);
        C(103, u);
    }
}
