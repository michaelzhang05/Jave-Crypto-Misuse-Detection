package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.base.zac;

/* loaded from: classes2.dex */
public final class zah extends com.google.android.gms.internal.base.zaa implements ISignInButtonCreator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zah(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    @Override // com.google.android.gms.common.internal.ISignInButtonCreator
    public final IObjectWrapper g3(IObjectWrapper iObjectWrapper, SignInButtonConfig signInButtonConfig) throws RemoteException {
        Parcel u = u();
        zac.c(u, iObjectWrapper);
        zac.d(u, signInButtonConfig);
        Parcel C = C(2, u);
        IObjectWrapper C2 = IObjectWrapper.Stub.C(C.readStrongBinder());
        C.recycle();
        return C2;
    }
}
