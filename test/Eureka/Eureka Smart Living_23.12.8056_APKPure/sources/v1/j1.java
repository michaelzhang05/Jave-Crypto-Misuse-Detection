package v1;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class j1 extends f2.a implements i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public j1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // v1.i
    public final Account j() {
        Parcel a6 = a(2, b());
        Account account = (Account) f2.c.a(a6, Account.CREATOR);
        a6.recycle();
        return account;
    }
}
