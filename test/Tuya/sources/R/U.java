package R;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
final class U implements InterfaceC1315l {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f8476a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public U(IBinder iBinder) {
        this.f8476a = iBinder;
    }

    @Override // R.InterfaceC1315l
    public final void K(InterfaceC1314k interfaceC1314k, C1309f c1309f) {
        IBinder iBinder;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (interfaceC1314k != null) {
                iBinder = interfaceC1314k.asBinder();
            } else {
                iBinder = null;
            }
            obtain.writeStrongBinder(iBinder);
            if (c1309f != null) {
                obtain.writeInt(1);
                k0.a(c1309f, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f8476a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8476a;
    }
}
