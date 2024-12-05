package R;

import android.os.IBinder;
import android.os.IInterface;
import g0.AbstractBinderC2699b;

/* loaded from: classes3.dex */
public abstract class W extends AbstractBinderC2699b implements X {
    public static X j(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (queryLocalInterface instanceof X) {
            return (X) queryLocalInterface;
        }
        return new V(iBinder);
    }
}
