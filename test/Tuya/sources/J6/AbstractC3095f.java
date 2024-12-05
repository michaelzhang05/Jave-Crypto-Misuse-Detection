package j6;

import L5.s;
import L5.t;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: j6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3095f {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC3094e f33292a;
    private static volatile Choreographer choreographer;

    static {
        Object b8;
        Object obj = null;
        try {
            s.a aVar = s.f6511b;
            b8 = s.b(new C3093d(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            s.a aVar2 = s.f6511b;
            b8 = s.b(t.a(th));
        }
        if (!s.g(b8)) {
            obj = b8;
        }
        f33292a = (AbstractC3094e) obj;
    }

    public static final Handler a(Looper looper, boolean z8) {
        if (z8) {
            if (Build.VERSION.SDK_INT >= 28) {
                Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
                AbstractC3159y.g(invoke, "null cannot be cast to non-null type android.os.Handler");
                return (Handler) invoke;
            }
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    public static final AbstractC3094e b(Handler handler, String str) {
        return new C3093d(handler, str);
    }
}
