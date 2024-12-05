package f2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class b extends Binder implements IInterface {
    /* JADX INFO: Access modifiers changed from: protected */
    public b(String str) {
        attachInterface(this, str);
    }

    protected boolean a(int i6, Parcel parcel, Parcel parcel2, int i7) {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i6, parcel, parcel2, i7)) {
            return true;
        }
        return a(i6, parcel, parcel2, i7);
    }
}
