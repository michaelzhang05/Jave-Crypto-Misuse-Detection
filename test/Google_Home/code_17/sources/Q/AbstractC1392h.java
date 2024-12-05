package Q;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: Q.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1392h {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f9026a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static q0 f9027b = null;

    /* renamed from: c, reason: collision with root package name */
    static HandlerThread f9028c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Executor f9029d = null;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f9030e = false;

    public static AbstractC1392h a(Context context) {
        Looper mainLooper;
        synchronized (f9026a) {
            try {
                if (f9027b == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f9030e) {
                        mainLooper = b().getLooper();
                    } else {
                        mainLooper = context.getMainLooper();
                    }
                    f9027b = new q0(applicationContext, mainLooper, f9029d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f9027b;
    }

    public static HandlerThread b() {
        synchronized (f9026a) {
            try {
                HandlerThread handlerThread = f9028c;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f9028c = handlerThread2;
                handlerThread2.start();
                return f9028c;
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
