package R;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import g0.AbstractBinderC2699b;

/* renamed from: R.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1313j extends IInterface {

    /* renamed from: R.j$a */
    /* loaded from: classes3.dex */
    public static abstract class a extends AbstractBinderC2699b implements InterfaceC1313j {
        public static InterfaceC1313j j(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof InterfaceC1313j) {
                return (InterfaceC1313j) queryLocalInterface;
            }
            return new t0(iBinder);
        }
    }

    Account b();
}
