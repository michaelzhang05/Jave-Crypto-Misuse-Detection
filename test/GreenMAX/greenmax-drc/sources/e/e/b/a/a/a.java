package e.e.b.a.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IGetInstallReferrerService.java */
/* loaded from: classes2.dex */
public interface a extends IInterface {

    /* compiled from: IGetInstallReferrerService.java */
    /* renamed from: e.e.b.a.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC0217a extends Binder implements a {

        /* compiled from: IGetInstallReferrerService.java */
        /* renamed from: e.e.b.a.a.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        private static class C0218a implements a {

            /* renamed from: f, reason: collision with root package name */
            private IBinder f17417f;

            C0218a(IBinder iBinder) {
                this.f17417f = iBinder;
            }

            @Override // e.e.b.a.a.a
            public Bundle Y2(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17417f.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17417f;
            }
        }

        public static a u(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0218a(iBinder);
        }
    }

    Bundle Y2(Bundle bundle) throws RemoteException;
}
