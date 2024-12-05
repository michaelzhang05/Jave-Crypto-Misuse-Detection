package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public class zzfm implements IInterface {

    /* renamed from: f, reason: collision with root package name */
    private final IBinder f15049f;

    /* renamed from: g, reason: collision with root package name */
    private final String f15050g;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzfm(IBinder iBinder, String str) {
        this.f15049f = iBinder;
        this.f15050g = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel C(int i2, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f15049f.transact(i2, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e2) {
                obtain.recycle();
                throw e2;
            }
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void R(int i2, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f15049f.transact(i2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f15049f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i0(int i2, Parcel parcel) throws RemoteException {
        try {
            this.f15049f.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel u() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f15050g);
        return obtain;
    }
}
