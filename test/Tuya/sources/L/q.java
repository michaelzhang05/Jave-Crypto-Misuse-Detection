package L;

import android.os.Parcel;
import d0.AbstractBinderC2530b;

/* loaded from: classes3.dex */
public abstract class q extends AbstractBinderC2530b implements r {
    public q() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // d0.AbstractBinderC2530b
    protected final boolean i(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            if (i8 != 2) {
                return false;
            }
            q();
        } else {
            A();
        }
        return true;
    }
}
