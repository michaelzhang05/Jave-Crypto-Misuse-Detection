package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.IAccountAccessor;

/* loaded from: classes2.dex */
public final class zag extends com.google.android.gms.internal.base.zaa implements zaf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zag(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.signin.internal.zaf
    public final void M2(IAccountAccessor iAccountAccessor, int i2, boolean z) throws RemoteException {
        Parcel u = u();
        com.google.android.gms.internal.base.zac.c(u, iAccountAccessor);
        u.writeInt(i2);
        com.google.android.gms.internal.base.zac.a(u, z);
        R(9, u);
    }

    @Override // com.google.android.gms.signin.internal.zaf
    public final void j3(zah zahVar, zad zadVar) throws RemoteException {
        Parcel u = u();
        com.google.android.gms.internal.base.zac.d(u, zahVar);
        com.google.android.gms.internal.base.zac.c(u, zadVar);
        R(12, u);
    }

    @Override // com.google.android.gms.signin.internal.zaf
    public final void q1(int i2) throws RemoteException {
        Parcel u = u();
        u.writeInt(i2);
        R(7, u);
    }
}
