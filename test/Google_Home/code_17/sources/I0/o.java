package i0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import r0.C3897e;
import r0.C3902j;

/* loaded from: classes3.dex */
public final class o extends AbstractC2971a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wallet.internal.IOwService");
    }

    public final void s0(C3897e c3897e, Bundle bundle, q qVar) {
        Parcel h8 = h();
        d.c(h8, c3897e);
        d.c(h8, bundle);
        d.d(h8, qVar);
        k(14, h8);
    }

    public final void t0(C3902j c3902j, Bundle bundle, q qVar) {
        Parcel h8 = h();
        d.c(h8, c3902j);
        d.c(h8, bundle);
        d.d(h8, qVar);
        k(19, h8);
    }
}
