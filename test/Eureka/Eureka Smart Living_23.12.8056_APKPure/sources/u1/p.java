package u1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class p extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    Context f9390a;

    /* renamed from: b, reason: collision with root package name */
    private final o f9391b;

    public p(o oVar) {
        this.f9391b = oVar;
    }

    public final void a(Context context) {
        this.f9390a = context;
    }

    public final synchronized void b() {
        Context context = this.f9390a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f9390a = null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f9391b.a();
            b();
        }
    }
}
