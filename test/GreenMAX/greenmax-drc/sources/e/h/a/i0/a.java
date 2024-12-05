package e.h.a.i0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.liulishuo.filedownloader.message.MessageSnapshot;

/* compiled from: IFileDownloadIPCCallback.java */
/* loaded from: classes2.dex */
public interface a extends IInterface {

    /* compiled from: IFileDownloadIPCCallback.java */
    /* renamed from: e.h.a.i0.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC0237a extends Binder implements a {

        /* compiled from: IFileDownloadIPCCallback.java */
        /* renamed from: e.h.a.i0.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        private static class C0238a implements a {

            /* renamed from: f, reason: collision with root package name */
            private IBinder f17873f;

            C0238a(IBinder iBinder) {
                this.f17873f = iBinder;
            }

            @Override // e.h.a.i0.a
            public void J4(MessageSnapshot messageSnapshot) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
                    if (messageSnapshot != null) {
                        obtain.writeInt(1);
                        messageSnapshot.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17873f.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17873f;
            }
        }

        public AbstractBinderC0237a() {
            attachInterface(this, "com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
        }

        public static a u(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0238a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 1) {
                parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
                J4(parcel.readInt() != 0 ? MessageSnapshot.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            parcel2.writeString("com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
            return true;
        }
    }

    void J4(MessageSnapshot messageSnapshot) throws RemoteException;
}
