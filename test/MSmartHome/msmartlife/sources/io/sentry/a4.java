package io.sentry;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: Sentry.java */
/* loaded from: classes.dex */
public final class a4 {
    private static final ThreadLocal<v1> a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    private static volatile v1 f18529b = y2.a();

    /* renamed from: c, reason: collision with root package name */
    private static volatile boolean f18530c = false;

    /* compiled from: Sentry.java */
    /* loaded from: classes.dex */
    public interface a<T extends x4> {
        void a(T t);
    }

    public static void a(v0 v0Var, n1 n1Var) {
        i().i(v0Var, n1Var);
    }

    private static <T extends x4> void b(a<T> aVar, T t) {
        try {
            aVar.a(t);
        } catch (Throwable th) {
            t.getLogger().b(s4.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th);
        }
    }

    public static io.sentry.protocol.q c(l4 l4Var, n1 n1Var) {
        return i().o(l4Var, n1Var);
    }

    public static synchronized void d() {
        synchronized (a4.class) {
            v1 i2 = i();
            f18529b = y2.a();
            a.remove();
            i2.close();
        }
    }

    public static void e(t3 t3Var) {
        i().j(t3Var);
    }

    public static void f() {
        i().endSession();
    }

    private static void g(x4 x4Var, v1 v1Var) {
        try {
            x4Var.getExecutorService().submit(new l3(x4Var, v1Var));
        } catch (Throwable th) {
            x4Var.getLogger().b(s4.DEBUG, "Failed to finalize previous session.", th);
        }
    }

    public static void h(long j2) {
        i().d(j2);
    }

    @ApiStatus.Internal
    public static v1 i() {
        if (f18530c) {
            return f18529b;
        }
        ThreadLocal<v1> threadLocal = a;
        v1 v1Var = threadLocal.get();
        if (v1Var != null && !(v1Var instanceof y2)) {
            return v1Var;
        }
        v1 m368clone = f18529b.m368clone();
        threadLocal.set(m368clone);
        return m368clone;
    }

    public static <T extends x4> void j(i3<T> i3Var, a<T> aVar, boolean z) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        T b2 = i3Var.b();
        b(aVar, b2);
        m(b2, z);
    }

    public static void k(a<x4> aVar) {
        l(aVar, false);
    }

    public static void l(a<x4> aVar, boolean z) {
        x4 x4Var = new x4();
        b(aVar, x4Var);
        m(x4Var, z);
    }

    private static synchronized void m(x4 x4Var, boolean z) {
        synchronized (a4.class) {
            if (o()) {
                x4Var.getLogger().c(s4.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
            }
            if (n(x4Var)) {
                x4Var.getLogger().c(s4.INFO, "GlobalHubMode: '%s'", String.valueOf(z));
                f18530c = z;
                v1 i2 = i();
                f18529b = new p1(x4Var);
                a.set(f18529b);
                i2.close();
                if (x4Var.getExecutorService().isClosed()) {
                    x4Var.setExecutorService(new n4());
                }
                Iterator<Integration> it = x4Var.getIntegrations().iterator();
                while (it.hasNext()) {
                    it.next().f(q1.a(), x4Var);
                }
                r(x4Var);
                g(x4Var, q1.a());
            }
        }
    }

    private static boolean n(x4 x4Var) {
        if (x4Var.isEnableExternalConfiguration()) {
            x4Var.merge(l1.g(io.sentry.config.h.a(), x4Var.getLogger()));
        }
        String dsn = x4Var.getDsn();
        if (!x4Var.isEnabled() || (dsn != null && dsn.isEmpty())) {
            d();
            return false;
        }
        if (dsn != null) {
            new f1(dsn);
            w1 logger = x4Var.getLogger();
            if (x4Var.isDebug() && (logger instanceof z2)) {
                x4Var.setLogger(new n5());
                logger = x4Var.getLogger();
            }
            s4 s4Var = s4.INFO;
            logger.c(s4Var, "Initializing SDK with DSN: '%s'", x4Var.getDsn());
            String outboxPath = x4Var.getOutboxPath();
            if (outboxPath != null) {
                new File(outboxPath).mkdirs();
            } else {
                logger.c(s4Var, "No outbox dir path is defined in options.", new Object[0]);
            }
            String cacheDirPath = x4Var.getCacheDirPath();
            if (cacheDirPath != null) {
                new File(cacheDirPath).mkdirs();
                if (x4Var.getEnvelopeDiskCache() instanceof io.sentry.transport.t) {
                    x4Var.setEnvelopeDiskCache(io.sentry.cache.q.P(x4Var));
                }
            }
            String profilingTracesDirPath = x4Var.getProfilingTracesDirPath();
            if (x4Var.isProfilingEnabled() && profilingTracesDirPath != null) {
                File file = new File(profilingTracesDirPath);
                file.mkdirs();
                final File[] listFiles = file.listFiles();
                try {
                    x4Var.getExecutorService().submit(new Runnable() { // from class: io.sentry.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            a4.p(listFiles);
                        }
                    });
                } catch (RejectedExecutionException e2) {
                    x4Var.getLogger().b(s4.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e2);
                }
            }
            io.sentry.internal.modules.b modulesLoader = x4Var.getModulesLoader();
            if (!x4Var.isSendModules()) {
                x4Var.setModulesLoader(io.sentry.internal.modules.e.b());
            } else if (modulesLoader instanceof io.sentry.internal.modules.e) {
                x4Var.setModulesLoader(new io.sentry.internal.modules.a(Arrays.asList(new io.sentry.internal.modules.c(x4Var.getLogger()), new io.sentry.internal.modules.f(x4Var.getLogger())), x4Var.getLogger()));
            }
            if (x4Var.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
                x4Var.setDebugMetaLoader(new io.sentry.internal.debugmeta.c(x4Var.getLogger()));
            }
            io.sentry.util.j.c(x4Var, x4Var.getDebugMetaLoader().a());
            if (x4Var.getMainThreadChecker() instanceof io.sentry.util.thread.d) {
                x4Var.setMainThreadChecker(io.sentry.util.thread.c.e());
            }
            if (x4Var.getCollectors().isEmpty()) {
                x4Var.addCollector(new k2());
            }
            return true;
        }
        throw new IllegalArgumentException("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.");
    }

    public static boolean o() {
        return i().isEnabled();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void p(File[] fileArr) {
        if (fileArr == null) {
            return;
        }
        for (File file : fileArr) {
            io.sentry.util.l.a(file);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void q(x4 x4Var) {
        for (x1 x1Var : x4Var.getOptionsObservers()) {
            x1Var.f(x4Var.getRelease());
            x1Var.e(x4Var.getProguardUuid());
            x1Var.b(x4Var.getSdkVersion());
            x1Var.c(x4Var.getDist());
            x1Var.d(x4Var.getEnvironment());
            x1Var.a(x4Var.getTags());
        }
    }

    private static void r(final x4 x4Var) {
        try {
            x4Var.getExecutorService().submit(new Runnable() { // from class: io.sentry.u
                @Override // java.lang.Runnable
                public final void run() {
                    a4.q(x4.this);
                }
            });
        } catch (Throwable th) {
            x4Var.getLogger().b(s4.DEBUG, "Failed to notify options observers.", th);
        }
    }

    public static void s() {
        i().startSession();
    }

    public static e2 t(r5 r5Var, t5 t5Var) {
        return i().g(r5Var, t5Var);
    }
}
