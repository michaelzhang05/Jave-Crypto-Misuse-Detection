package b.a.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IPackageInstallObserver.java */
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* compiled from: IPackageInstallObserver.java */
    /* renamed from: b.a.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0044a extends Binder implements a {
        public AbstractBinderC0044a() {
            throw new RuntimeException("Stub!");
        }

        public static a asInterface(IBinder iBinder) {
            throw new RuntimeException("Stub!");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            throw new RuntimeException("Stub!");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            throw new RuntimeException("Stub!");
        }

        public abstract void packageInstalled(String str, int i2) throws RemoteException;
    }
}
