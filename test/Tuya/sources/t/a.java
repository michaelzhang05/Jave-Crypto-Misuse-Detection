package T;

import R.C1322t;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e0.AbstractC2569a;
import e0.AbstractC2571c;

/* loaded from: classes3.dex */
public final class a extends AbstractC2569a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void m0(C1322t c1322t) {
        Parcel i8 = i();
        AbstractC2571c.c(i8, c1322t);
        l(1, i8);
    }
}
