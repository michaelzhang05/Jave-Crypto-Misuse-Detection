package Q;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import f0.AbstractC2809a;
import f0.AbstractC2811c;

/* loaded from: classes3.dex */
public final class t0 extends AbstractC2809a implements InterfaceC1394j {
    /* JADX INFO: Access modifiers changed from: package-private */
    public t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // Q.InterfaceC1394j
    public final Account x() {
        Parcel h8 = h(2, i());
        Account account = (Account) AbstractC2811c.a(h8, Account.CREATOR);
        h8.recycle();
        return account;
    }
}
