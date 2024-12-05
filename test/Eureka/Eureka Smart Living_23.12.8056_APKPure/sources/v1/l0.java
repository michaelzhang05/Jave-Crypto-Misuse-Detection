package v1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class l0 extends f2.b implements j {
    public l0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // f2.b
    protected final boolean a(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) f2.c.a(parcel, Bundle.CREATOR);
            f2.c.b(parcel);
            x(readInt, readStrongBinder, bundle);
        } else if (i6 == 2) {
            int readInt2 = parcel.readInt();
            Bundle bundle2 = (Bundle) f2.c.a(parcel, Bundle.CREATOR);
            f2.c.b(parcel);
            f(readInt2, bundle2);
        } else {
            if (i6 != 3) {
                return false;
            }
            int readInt3 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            w0 w0Var = (w0) f2.c.a(parcel, w0.CREATOR);
            f2.c.b(parcel);
            y(readInt3, readStrongBinder2, w0Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
