package v1;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class k1 extends f2.b implements l1 {
    public k1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // f2.b
    protected final boolean a(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 == 1) {
            c2.a k6 = k();
            parcel2.writeNoException();
            f2.c.c(parcel2, k6);
        } else {
            if (i6 != 2) {
                return false;
            }
            int v5 = v();
            parcel2.writeNoException();
            parcel2.writeInt(v5);
        }
        return true;
    }
}
