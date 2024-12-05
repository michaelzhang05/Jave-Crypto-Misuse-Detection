package R;

import R.InterfaceC1313j;
import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: R.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC1304a extends InterfaceC1313j.a {
    public static Account l(InterfaceC1313j interfaceC1313j) {
        Account account = null;
        if (interfaceC1313j != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                try {
                    account = interfaceC1313j.b();
                } catch (RemoteException unused) {
                    Log.w("AccountAccessor", "Remote account accessor probably died");
                }
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return account;
    }
}
