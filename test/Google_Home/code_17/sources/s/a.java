package S;

import Q.C1403t;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import d0.AbstractC2722a;
import d0.AbstractC2724c;

/* loaded from: classes3.dex */
public final class a extends AbstractC2722a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void s0(C1403t c1403t) {
        Parcel h8 = h();
        AbstractC2724c.c(h8, c1403t);
        k(1, h8);
    }
}
