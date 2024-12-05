package R;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import g0.AbstractC2698a;
import g0.AbstractC2700c;

/* loaded from: classes3.dex */
public final class t0 extends AbstractC2698a implements InterfaceC1313j {
    /* JADX INFO: Access modifiers changed from: package-private */
    public t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // R.InterfaceC1313j
    public final Account b() {
        Parcel i8 = i(2, j());
        Account account = (Account) AbstractC2700c.a(i8, Account.CREATOR);
        i8.recycle();
        return account;
    }
}
