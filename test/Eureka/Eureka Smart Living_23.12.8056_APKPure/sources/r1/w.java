package r1;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: e */
    private static w f9101e;

    /* renamed from: a */
    private final Context f9102a;

    /* renamed from: b */
    private final ScheduledExecutorService f9103b;

    /* renamed from: c */
    private q f9104c = new q(this, null);

    /* renamed from: d */
    private int f9105d = 1;

    w(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f9103b = scheduledExecutorService;
        this.f9102a = context.getApplicationContext();
    }

    public static /* bridge */ /* synthetic */ Context a(w wVar) {
        return wVar.f9102a;
    }

    public static synchronized w b(Context context) {
        w wVar;
        synchronized (w.class) {
            if (f9101e == null) {
                e2.e.a();
                f9101e = new w(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new a2.a("MessengerIpcClient"))));
            }
            wVar = f9101e;
        }
        return wVar;
    }

    public static /* bridge */ /* synthetic */ ScheduledExecutorService e(w wVar) {
        return wVar.f9103b;
    }

    private final synchronized int f() {
        int i6;
        i6 = this.f9105d;
        this.f9105d = i6 + 1;
        return i6;
    }

    private final synchronized l2.i g(t tVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(tVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f9104c.g(tVar)) {
            q qVar = new q(this, null);
            this.f9104c = qVar;
            qVar.g(tVar);
        }
        return tVar.f9098b.a();
    }

    public final l2.i c(int i6, Bundle bundle) {
        return g(new s(f(), 2, bundle));
    }

    public final l2.i d(int i6, Bundle bundle) {
        return g(new v(f(), 1, bundle));
    }
}
