package v1;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static int f9594a = 4225;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f9595b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static f1 f9596c = null;

    /* renamed from: d, reason: collision with root package name */
    static HandlerThread f9597d = null;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f9598e = false;

    public static int a() {
        return f9594a;
    }

    public static h b(Context context) {
        synchronized (f9595b) {
            if (f9596c == null) {
                f9596c = new f1(context.getApplicationContext(), f9598e ? c().getLooper() : context.getMainLooper());
            }
        }
        return f9596c;
    }

    public static HandlerThread c() {
        synchronized (f9595b) {
            HandlerThread handlerThread = f9597d;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f9597d = handlerThread2;
            handlerThread2.start();
            return f9597d;
        }
    }

    protected abstract void d(a1 a1Var, ServiceConnection serviceConnection, String str);

    public final void e(String str, String str2, int i6, ServiceConnection serviceConnection, String str3, boolean z5) {
        d(new a1(str, str2, i6, z5), serviceConnection, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean f(a1 a1Var, ServiceConnection serviceConnection, String str, Executor executor);
}
