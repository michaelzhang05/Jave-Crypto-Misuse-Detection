package q6;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: q6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3868c {

    /* renamed from: a, reason: collision with root package name */
    private static final Method f38386a;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f38386a = method;
    }

    public static final boolean a(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor == null || (method = f38386a) == null) {
                return false;
            }
            method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}