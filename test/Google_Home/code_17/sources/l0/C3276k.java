package l0;

import Q.AbstractC1400p;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C2367i2;
import com.google.android.gms.measurement.internal.R2;

/* renamed from: l0.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3276k {

    /* renamed from: a, reason: collision with root package name */
    private final a f34200a;

    /* renamed from: l0.k$a */
    /* loaded from: classes3.dex */
    public interface a {
        void a(Context context, Intent intent);
    }

    public C3276k(a aVar) {
        AbstractC1400p.l(aVar);
        this.f34200a = aVar;
    }

    public final void a(Context context, Intent intent) {
        C2367i2 c8 = R2.a(context, null, null).c();
        if (intent == null) {
            c8.L().a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        c8.K().b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            c8.K().a("Starting wakeful intent.");
            this.f34200a.a(context, className);
            return;
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            c8.L().a("Install Referrer Broadcasts are deprecated");
        }
    }
}
