package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public class zza implements IInterface {

    /* renamed from: f, reason: collision with root package name */
    private final IBinder f15838f;

    /* renamed from: g, reason: collision with root package name */
    private final String f15839g;

    /* JADX INFO: Access modifiers changed from: protected */
    public zza(IBinder iBinder, String str) {
        this.f15838f = iBinder;
        this.f15839g = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel C(int i2, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f15838f.transact(i2, parcel, obtain, 0);
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

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f15838f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel u() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f15839g);
        return obtain;
    }
}
