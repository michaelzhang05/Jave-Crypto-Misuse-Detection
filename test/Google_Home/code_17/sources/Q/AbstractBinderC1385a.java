package Q;

import Q.InterfaceC1394j;
import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: Q.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC1385a extends InterfaceC1394j.a {
    public static Account k(InterfaceC1394j interfaceC1394j) {
        Account account = null;
        if (interfaceC1394j != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                try {
                    account = interfaceC1394j.x();
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
