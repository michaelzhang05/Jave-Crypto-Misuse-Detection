package Z;

import android.os.IBinder;
import android.os.IInterface;
import g0.AbstractBinderC2699b;

/* loaded from: classes3.dex */
public interface a extends IInterface {

    /* renamed from: Z.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static abstract class AbstractBinderC0256a extends AbstractBinderC2699b implements a {
        public AbstractBinderC0256a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static a j(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof a) {
                return (a) queryLocalInterface;
            }
            return new c(iBinder);
        }
    }
}
