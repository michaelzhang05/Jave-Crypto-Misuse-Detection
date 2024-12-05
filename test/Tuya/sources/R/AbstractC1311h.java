package R;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: R.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1311h {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f8564a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static q0 f8565b = null;

    /* renamed from: c, reason: collision with root package name */
    static HandlerThread f8566c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Executor f8567d = null;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f8568e = false;

    public static AbstractC1311h a(Context context) {
        Looper mainLooper;
        synchronized (f8564a) {
            try {
                if (f8565b == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f8568e) {
                        mainLooper = b().getLooper();
                    } else {
                        mainLooper = context.getMainLooper();
                    }
                    f8565b = new q0(applicationContext, mainLooper, f8567d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f8565b;
    }

    public static HandlerThread b() {
        synchronized (f8564a) {
            try {
                HandlerThread handlerThread = f8566c;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f8566c = handlerThread2;
                handlerThread2.start();
                return f8566c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected abstract void c(l0 l0Var, ServiceConnection serviceConnection, String str);

    public final void d(String str, String str2, int i8, ServiceConnection serviceConnection, String str3, boolean z8) {
        c(new l0(str, str2, 4225, z8), serviceConnection, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean e(l0 l0Var, ServiceConnection serviceConnection, String str, Executor executor);
}
