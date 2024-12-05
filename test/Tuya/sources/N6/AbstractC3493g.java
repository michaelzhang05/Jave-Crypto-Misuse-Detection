package n6;

import f6.AbstractC2683j;
import java.util.Collection;
import java.util.ServiceLoader;

/* renamed from: n6.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3493g {

    /* renamed from: a, reason: collision with root package name */
    private static final Collection f36263a = AbstractC2683j.D(AbstractC2683j.c(ServiceLoader.load(i6.J.class, i6.J.class.getClassLoader()).iterator()));

    public static final Collection a() {
        return f36263a;
    }

    public static final void b(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
