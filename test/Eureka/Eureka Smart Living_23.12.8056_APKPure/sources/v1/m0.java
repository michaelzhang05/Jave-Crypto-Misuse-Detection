package v1;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class m0 implements k {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f9624a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m0(IBinder iBinder) {
        this.f9624a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f9624a;
    }

    @Override // v1.k
    public final void t(j jVar, f fVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
            if (fVar != null) {
                obtain.writeInt(1);
                z0.a(fVar, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f9624a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
