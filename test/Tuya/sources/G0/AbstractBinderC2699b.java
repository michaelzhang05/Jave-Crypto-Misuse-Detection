package g0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: g0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC2699b extends Binder implements IInterface {
    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractBinderC2699b(String str) {
        attachInterface(this, str);
    }

    protected boolean i(int i8, Parcel parcel, Parcel parcel2, int i9) {
        return false;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 > 16777215) {
            if (super.onTransact(i8, parcel, parcel2, i9)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return i(i8, parcel, parcel2, i9);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
