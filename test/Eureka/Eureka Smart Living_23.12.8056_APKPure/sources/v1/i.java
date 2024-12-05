package v1;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public interface i extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends f2.b implements i {
        public static i b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof i ? (i) queryLocalInterface : new j1(iBinder);
        }
    }

    Account j();
}
