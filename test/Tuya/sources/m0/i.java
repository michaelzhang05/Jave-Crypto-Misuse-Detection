package m0;

import R.AbstractC1319p;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C2267u1;
import com.google.android.gms.measurement.internal.Y1;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final h f34871a;

    public i(h hVar) {
        AbstractC1319p.l(hVar);
        this.f34871a = hVar;
    }

    public final void a(Context context, Intent intent) {
        Y1 H8 = Y1.H(context, null, null);
        C2267u1 d8 = H8.d();
        if (intent == null) {
            d8.w().a("Receiver called with null intent");
            return;
        }
        H8.b();
        String action = intent.getAction();
        d8.v().b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            d8.v().a("Starting wakeful intent.");
            this.f34871a.a(context, className);
            return;
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            d8.w().a("Install Referrer Broadcasts are deprecated");
        }
    }
}
