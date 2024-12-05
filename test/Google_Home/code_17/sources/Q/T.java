package Q;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import f0.AbstractBinderC2810b;
import f0.AbstractC2811c;

/* loaded from: classes3.dex */
public abstract class T extends AbstractBinderC2810b implements InterfaceC1395k {
    public T() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // f0.AbstractBinderC2810b
    protected final boolean h(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    return false;
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                h0 h0Var = (h0) AbstractC2811c.a(parcel, h0.CREATOR);
                AbstractC2811c.b(parcel);
                R(readInt, readStrongBinder, h0Var);
            } else {
                int readInt2 = parcel.readInt();
                Bundle bundle = (Bundle) AbstractC2811c.a(parcel, Bundle.CREATOR);
                AbstractC2811c.b(parcel);
                H(readInt2, bundle);
            }
        } else {
            int readInt3 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            Bundle bundle2 = (Bundle) AbstractC2811c.a(parcel, Bundle.CREATOR);
            AbstractC2811c.b(parcel);
            Y(readInt3, readStrongBinder2, bundle2);
        }
        parcel2.writeNoException();
        return true;
    }
}
