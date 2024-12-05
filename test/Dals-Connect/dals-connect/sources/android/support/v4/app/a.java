package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: INotificationSideChannel.java */
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* compiled from: INotificationSideChannel.java */
    /* renamed from: android.support.v4.app.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0000a extends Binder implements a {

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: INotificationSideChannel.java */
        /* renamed from: android.support.v4.app.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0001a implements a {

            /* renamed from: f, reason: collision with root package name */
            public static a f0f;

            /* renamed from: g, reason: collision with root package name */
            private IBinder f1g;

            C0001a(IBinder iBinder) {
                this.f1g = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1g;
            }

            @Override // android.support.v4.app.a
            public void d7(String str, int i2, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f1g.transact(1, obtain, null, 1) || AbstractBinderC0000a.C() == null) {
                        return;
                    }
                    AbstractBinderC0000a.C().d7(str, i2, str2, notification);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static a C() {
            return C0001a.f0f;
        }

        public static a u(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0001a(iBinder);
        }
    }

    void d7(String str, int i2, String str2, Notification notification) throws RemoteException;
}
