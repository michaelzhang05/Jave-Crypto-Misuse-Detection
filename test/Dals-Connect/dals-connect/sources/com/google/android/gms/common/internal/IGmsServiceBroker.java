package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;

/* loaded from: classes2.dex */
public interface IGmsServiceBroker extends IInterface {

    /* loaded from: classes2.dex */
    public static abstract class Stub extends Binder implements IGmsServiceBroker {

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes2.dex */
        public static class a implements IGmsServiceBroker {

            /* renamed from: f, reason: collision with root package name */
            private final IBinder f10866f;

            /* JADX INFO: Access modifiers changed from: package-private */
            public a(IBinder iBinder) {
                this.f10866f = iBinder;
            }

            @Override // com.google.android.gms.common.internal.IGmsServiceBroker
            public final void H1(IGmsCallbacks iGmsCallbacks, GetServiceRequest getServiceRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(iGmsCallbacks != null ? iGmsCallbacks.asBinder() : null);
                    if (getServiceRequest != null) {
                        obtain.writeInt(1);
                        getServiceRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f10866f.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f10866f;
            }
        }

        public Stub() {
            attachInterface(this, "com.google.android.gms.common.internal.IGmsServiceBroker");
        }

        @Override // android.os.IInterface
        @KeepForSdk
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            IGmsCallbacks zzlVar;
            if (i2 > 16777215) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzlVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
                if (queryLocalInterface instanceof IGmsCallbacks) {
                    zzlVar = (IGmsCallbacks) queryLocalInterface;
                } else {
                    zzlVar = new zzl(readStrongBinder);
                }
            }
            if (i2 == 46) {
                H1(zzlVar, parcel.readInt() != 0 ? GetServiceRequest.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i2 == 47) {
                if (parcel.readInt() != 0) {
                    zzr.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            }
            parcel.readInt();
            if (i2 != 4) {
                parcel.readString();
            }
            if (i2 != 1) {
                if (i2 != 2 && i2 != 23 && i2 != 25 && i2 != 27) {
                    if (i2 != 30) {
                        if (i2 == 34) {
                            parcel.readString();
                        } else if (i2 != 41 && i2 != 43 && i2 != 37 && i2 != 38) {
                            switch (i2) {
                                case 9:
                                    parcel.readString();
                                    parcel.createStringArray();
                                    parcel.readString();
                                    parcel.readStrongBinder();
                                    parcel.readString();
                                    if (parcel.readInt() != 0) {
                                        Bundle.CREATOR.createFromParcel(parcel);
                                        break;
                                    }
                                    break;
                                case 10:
                                    parcel.readString();
                                    parcel.createStringArray();
                                    break;
                                case 19:
                                    parcel.readStrongBinder();
                                    if (parcel.readInt() != 0) {
                                        Bundle.CREATOR.createFromParcel(parcel);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }
                    parcel.createStringArray();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle.CREATOR.createFromParcel(parcel);
                    }
                }
                if (parcel.readInt() != 0) {
                    Bundle.CREATOR.createFromParcel(parcel);
                }
            } else {
                parcel.readString();
                parcel.createStringArray();
                parcel.readString();
                if (parcel.readInt() != 0) {
                    Bundle.CREATOR.createFromParcel(parcel);
                }
            }
            throw new UnsupportedOperationException();
        }
    }

    @KeepForSdk
    void H1(IGmsCallbacks iGmsCallbacks, GetServiceRequest getServiceRequest) throws RemoteException;
}
