package m6;

import S5.g;
import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import l6.J;

/* renamed from: m6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3445b extends S5.a implements J {
    private volatile Object _preHandler;

    public C3445b() {
        super(J.f34566m0);
        this._preHandler = this;
    }

    private final Method E() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    method = declaredMethod;
                }
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // l6.J
    public void handleException(g gVar, Throwable th) {
        Object obj;
        int i8 = Build.VERSION.SDK_INT;
        if (26 <= i8 && i8 < 28) {
            Method E8 = E();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            if (E8 != null) {
                obj = E8.invoke(null, null);
            } else {
                obj = null;
            }
            if (obj instanceof Thread.UncaughtExceptionHandler) {
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) obj;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}