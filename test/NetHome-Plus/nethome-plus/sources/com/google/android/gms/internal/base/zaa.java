package com.google.android.gms.internal.base;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public class zaa implements IInterface {

    /* renamed from: f, reason: collision with root package name */
    private final IBinder f15872f;

    /* renamed from: g, reason: collision with root package name */
    private final String f15873g;

    /* JADX INFO: Access modifiers changed from: protected */
    public zaa(IBinder iBinder, String str) {
        this.f15872f = iBinder;
        this.f15873g = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel C(int i2, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f15872f.transact(i2, parcel, obtain, 0);
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
            this.f15872f.transact(i2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f15872f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i0(int i2, Parcel parcel) throws RemoteException {
        try {
            this.f15872f.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel u() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f15873g);
        return obtain;
    }
}
