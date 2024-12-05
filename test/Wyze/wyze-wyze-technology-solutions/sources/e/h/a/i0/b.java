package e.h.a.i0;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import e.h.a.i0.a;

/* compiled from: IFileDownloadIPCService.java */
/* loaded from: classes2.dex */
public interface b extends IInterface {

    /* compiled from: IFileDownloadIPCService.java */
    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements b {

        /* compiled from: IFileDownloadIPCService.java */
        /* renamed from: e.h.a.i0.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        private static class C0239a implements b {

            /* renamed from: f, reason: collision with root package name */
            private IBinder f17874f;

            C0239a(IBinder iBinder) {
                this.f17874f = iBinder;
            }

            @Override // e.h.a.i0.b
            public byte D(int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeInt(i2);
                    this.f17874f.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readByte();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.a.i0.b
            public void F(String str, String str2, boolean z, int i2, int i3, int i4, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    int i5 = 1;
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    obtain.writeInt(z2 ? 1 : 0);
                    if (fileDownloadHeader != null) {
                        obtain.writeInt(1);
                        fileDownloadHeader.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!z3) {
                        i5 = 0;
                    }
                    obtain.writeInt(i5);
                    this.f17874f.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.a.i0.b
            public boolean K(int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeInt(i2);
                    this.f17874f.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.a.i0.b
            public boolean T(int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeInt(i2);
                    this.f17874f.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.a.i0.b
            public void X(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f17874f.transact(13, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17874f;
            }

            @Override // e.h.a.i0.b
            public void d5(e.h.a.i0.a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f17874f.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // e.h.a.i0.b
            public void j1(e.h.a.i0.a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f17874f.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // e.h.a.i0.b
            public void z7() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    this.f17874f.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.liulishuo.filedownloader.i.IFileDownloadIPCService");
        }

        public static b i0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                return (b) queryLocalInterface;
            }
            return new C0239a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 != 1598968902) {
                switch (i2) {
                    case 1:
                        parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                        j1(a.AbstractBinderC0237a.u(parcel.readStrongBinder()));
                        return true;
                    case 2:
                        parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                        d5(a.AbstractBinderC0237a.u(parcel.readStrongBinder()));
                        return true;
                    case 3:
                        parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                        boolean w2 = w2(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(w2 ? 1 : 0);
                        return true;
                    case 4:
                        parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                        F(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0 ? FileDownloadHeader.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                        boolean K = K(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(K ? 1 : 0);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                        z7();
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                        boolean R2 = R2(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(R2 ? 1 : 0);
                        return true;
                    case 8:
                        parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                        long H5 = H5(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeLong(H5);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                        long s4 = s4(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeLong(s4);
                        return true;
                    case 10:
                        parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                        byte D = D(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeByte(D);
                        return true;
                    case 11:
                        parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                        boolean j5 = j5();
                        parcel2.writeNoException();
                        parcel2.writeInt(j5 ? 1 : 0);
                        return true;
                    case 12:
                        parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                        c7(parcel.readInt(), parcel.readInt() != 0 ? (Notification) Notification.CREATOR.createFromParcel(parcel) : null);
                        return true;
                    case 13:
                        parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                        X(parcel.readInt() != 0);
                        return true;
                    case 14:
                        parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                        boolean T = T(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(T ? 1 : 0);
                        return true;
                    case 15:
                        parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                        c2();
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i2, parcel, parcel2, i3);
                }
            }
            parcel2.writeString("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
            return true;
        }
    }

    byte D(int i2) throws RemoteException;

    void F(String str, String str2, boolean z, int i2, int i3, int i4, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3) throws RemoteException;

    long H5(int i2) throws RemoteException;

    boolean K(int i2) throws RemoteException;

    boolean R2(int i2) throws RemoteException;

    boolean T(int i2) throws RemoteException;

    void X(boolean z) throws RemoteException;

    void c2() throws RemoteException;

    void c7(int i2, Notification notification) throws RemoteException;

    void d5(e.h.a.i0.a aVar) throws RemoteException;

    void j1(e.h.a.i0.a aVar) throws RemoteException;

    boolean j5() throws RemoteException;

    long s4(int i2) throws RemoteException;

    boolean w2(String str, String str2) throws RemoteException;

    void z7() throws RemoteException;
}
