package Q;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
final class U implements InterfaceC1396l {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f8938a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public U(IBinder iBinder) {
        this.f8938a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8938a;
    }

    @Override // Q.InterfaceC1396l
    public final void e0(InterfaceC1395k interfaceC1395k, C1390f c1390f) {
        IBinder iBinder;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (interfaceC1395k != null) {
                iBinder = interfaceC1395k.asBinder();
            } else {
                iBinder = null;
            }
            obtain.writeStrongBinder(iBinder);
            if (c1390f != null) {
                obtain.writeInt(1);
                k0.a(c1390f, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f8938a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }
}
