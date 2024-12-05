package M;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import e0.AbstractC2768e;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class D {

    /* renamed from: e */
    private static D f6332e;

    /* renamed from: a */
    private final Context f6333a;

    /* renamed from: b */
    private final ScheduledExecutorService f6334b;

    /* renamed from: c */
    private x f6335c = new x(this, null);

    /* renamed from: d */
    private int f6336d = 1;

    D(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f6334b = scheduledExecutorService;
        this.f6333a = context.getApplicationContext();
    }

    public static /* bridge */ /* synthetic */ Context a(D d8) {
        return d8.f6333a;
    }

    public static synchronized D b(Context context) {
        D d8;
        synchronized (D.class) {
            try {
                if (f6332e == null) {
                    AbstractC2768e.a();
                    f6332e = new D(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new W.a("MessengerIpcClient"))));
                }
                d8 = f6332e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return d8;
    }

    public static /* bridge */ /* synthetic */ ScheduledExecutorService e(D d8) {
        return d8.f6334b;
    }

    private final synchronized int f() {
        int i8;
        i8 = this.f6336d;
        this.f6336d = i8 + 1;
        return i8;
    }

    private final synchronized Task g(A a8) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(a8.toString()));
            }
            if (!this.f6335c.g(a8)) {
                x xVar = new x(this, null);
                this.f6335c = xVar;
                xVar.g(a8);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a8.f6329b.a();
    }

    public final Task c(int i8, Bundle bundle) {
        return g(new z(f(), i8, bundle));
    }

    public final Task d(int i8, Bundle bundle) {
        return g(new C(f(), i8, bundle));
    }
}
