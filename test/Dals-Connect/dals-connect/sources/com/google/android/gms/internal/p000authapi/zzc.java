package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public class zzc implements IInterface {

    /* renamed from: f, reason: collision with root package name */
    private final IBinder f15842f;

    /* renamed from: g, reason: collision with root package name */
    private final String f15843g;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzc(IBinder iBinder, String str) {
        this.f15842f = iBinder;
        this.f15843g = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void C(int i2, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f15842f.transact(i2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f15842f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel u() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f15843g);
        return obtain;
    }
}
