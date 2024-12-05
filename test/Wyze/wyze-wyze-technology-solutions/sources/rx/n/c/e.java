package rx.n.c;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GenericScheduledExecutorServiceFactory.java */
/* loaded from: classes3.dex */
public enum e {
    ;


    /* renamed from: f, reason: collision with root package name */
    static final rx.n.e.i f23031f = new rx.n.e.i("RxScheduledExecutorPool-");

    public static ScheduledExecutorService d() {
        rx.m.d<? extends ScheduledExecutorService> a = rx.q.c.a();
        if (a == null) {
            return f();
        }
        return a.call();
    }

    static ScheduledExecutorService f() {
        return Executors.newScheduledThreadPool(1, i());
    }

    static ThreadFactory i() {
        return f23031f;
    }
}
