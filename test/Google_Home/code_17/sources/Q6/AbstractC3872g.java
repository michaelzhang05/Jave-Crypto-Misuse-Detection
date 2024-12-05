package q6;

import i6.AbstractC3001j;
import java.util.Collection;
import java.util.ServiceLoader;

/* renamed from: q6.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3872g {

    /* renamed from: a, reason: collision with root package name */
    private static final Collection f38391a = AbstractC3001j.D(AbstractC3001j.c(ServiceLoader.load(l6.J.class, l6.J.class.getClassLoader()).iterator()));

    public static final Collection a() {
        return f38391a;
    }

    public static final void b(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
