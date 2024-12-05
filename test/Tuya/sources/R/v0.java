package R;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import g0.AbstractBinderC2699b;
import g0.AbstractC2700c;

/* loaded from: classes3.dex */
public abstract class v0 extends AbstractBinderC2699b implements S {
    public v0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static S j(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (queryLocalInterface instanceof S) {
            return (S) queryLocalInterface;
        }
        return new u0(iBinder);
    }

    @Override // g0.AbstractBinderC2699b
    protected final boolean i(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            if (i8 != 2) {
                return false;
            }
            int c8 = c();
            parcel2.writeNoException();
            parcel2.writeInt(c8);
        } else {
            Z.a d8 = d();
            parcel2.writeNoException();
            AbstractC2700c.d(parcel2, d8);
        }
        return true;
    }
}
