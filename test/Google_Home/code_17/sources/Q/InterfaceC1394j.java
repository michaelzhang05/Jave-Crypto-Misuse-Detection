package Q;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import f0.AbstractBinderC2810b;

/* renamed from: Q.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1394j extends IInterface {

    /* renamed from: Q.j$a */
    /* loaded from: classes3.dex */
    public static abstract class a extends AbstractBinderC2810b implements InterfaceC1394j {
        public static InterfaceC1394j i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof InterfaceC1394j) {
                return (InterfaceC1394j) queryLocalInterface;
            }
            return new t0(iBinder);
        }
    }

    Account x();
}
