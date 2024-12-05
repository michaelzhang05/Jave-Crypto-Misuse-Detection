package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public class zzq implements IInterface {

    /* renamed from: f, reason: collision with root package name */
    private final IBinder f16101f;

    /* renamed from: g, reason: collision with root package name */
    private final String f16102g;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzq(IBinder iBinder, String str) {
        this.f16101f = iBinder;
        this.f16102g = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void C(int i2, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f16101f.transact(i2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f16101f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel u() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f16102g);
        return obtain;
    }
}
