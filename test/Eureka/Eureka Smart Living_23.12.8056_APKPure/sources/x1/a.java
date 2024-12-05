package x1;

import android.os.IBinder;
import android.os.Parcel;
import v1.r;

/* loaded from: classes.dex */
public final class a extends d2.a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void z(r rVar) {
        Parcel a6 = a();
        d2.c.b(a6, rVar);
        c(1, a6);
    }
}
