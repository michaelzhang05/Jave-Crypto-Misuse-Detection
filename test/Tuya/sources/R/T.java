package R;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import g0.AbstractBinderC2699b;
import g0.AbstractC2700c;

/* loaded from: classes3.dex */
public abstract class T extends AbstractBinderC2699b implements InterfaceC1314k {
    public T() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // g0.AbstractBinderC2699b
    protected final boolean i(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    return false;
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                h0 h0Var = (h0) AbstractC2700c.a(parcel, h0.CREATOR);
                AbstractC2700c.b(parcel);
                d0(readInt, readStrongBinder, h0Var);
            } else {
                int readInt2 = parcel.readInt();
                Bundle bundle = (Bundle) AbstractC2700c.a(parcel, Bundle.CREATOR);
                AbstractC2700c.b(parcel);
                E(readInt2, bundle);
            }
        } else {
            int readInt3 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            Bundle bundle2 = (Bundle) AbstractC2700c.a(parcel, Bundle.CREATOR);
            AbstractC2700c.b(parcel);
            Q(readInt3, readStrongBinder2, bundle2);
        }
        parcel2.writeNoException();
        return true;
    }
}
