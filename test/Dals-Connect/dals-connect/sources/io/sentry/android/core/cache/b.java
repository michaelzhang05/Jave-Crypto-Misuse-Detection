package io.sentry.android.core.cache;

import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.android.core.AnrV2Integration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.g;
import io.sentry.android.core.q0;
import io.sentry.cache.q;
import io.sentry.h4;
import io.sentry.n1;
import io.sentry.s4;
import io.sentry.util.l;
import io.sentry.util.m;
import io.sentry.x4;
import java.io.File;
import java.io.FileOutputStream;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: AndroidEnvelopeCache.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class b extends q {
    private final io.sentry.transport.q m;

    public b(SentryAndroidOptions sentryAndroidOptions) {
        this(sentryAndroidOptions, g.b());
    }

    public static boolean b0(x4 x4Var) {
        String outboxPath = x4Var.getOutboxPath();
        if (outboxPath == null) {
            x4Var.getLogger().c(s4.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
            return false;
        }
        File file = new File(outboxPath, "startup_crash");
        try {
            boolean exists = file.exists();
            if (exists && !file.delete()) {
                x4Var.getLogger().c(s4.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
            }
            return exists;
        } catch (Throwable th) {
            x4Var.getLogger().b(s4.ERROR, "Error reading/deleting the startup crash marker file on the disk", th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void d0(SentryAndroidOptions sentryAndroidOptions, AnrV2Integration.b bVar) {
        Long c2 = bVar.c();
        sentryAndroidOptions.getLogger().c(s4.DEBUG, "Writing last reported ANR marker with timestamp %d", c2);
        f0(c2);
    }

    public static Long e0(x4 x4Var) {
        File file = new File((String) io.sentry.util.q.c(x4Var.getCacheDirPath(), "Cache dir path should be set for getting ANRs reported"), "last_anr_report");
        try {
        } catch (Throwable th) {
            x4Var.getLogger().b(s4.ERROR, "Error reading last ANR marker", th);
        }
        if (file.exists() && file.canRead()) {
            String c2 = l.c(file);
            if (c2.equals("null")) {
                return null;
            }
            return Long.valueOf(Long.parseLong(c2.trim()));
        }
        x4Var.getLogger().c(s4.DEBUG, "Last ANR marker does not exist. %s.", file.getAbsolutePath());
        return null;
    }

    private void f0(Long l) {
        String cacheDirPath = this.f18878g.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f18878g.getLogger().c(s4.DEBUG, "Cache dir path is null, the ANR marker will not be written", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, "last_anr_report"));
            try {
                fileOutputStream.write(String.valueOf(l).getBytes(f18877f));
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            this.f18878g.getLogger().b(s4.ERROR, "Error writing the ANR marker to the disk", th2);
        }
    }

    private void g0() {
        String outboxPath = this.f18878g.getOutboxPath();
        if (outboxPath == null) {
            this.f18878g.getLogger().c(s4.DEBUG, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
            return;
        }
        try {
            new File(outboxPath, "startup_crash").createNewFile();
        } catch (Throwable th) {
            this.f18878g.getLogger().b(s4.ERROR, "Error writing the startup crash marker file to the disk", th);
        }
    }

    @Override // io.sentry.cache.q, io.sentry.cache.r
    public void q(h4 h4Var, n1 n1Var) {
        super.q(h4Var, n1Var);
        final SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f18878g;
        Long c2 = q0.e().c();
        if (m.d(n1Var, UncaughtExceptionHandlerIntegration.a.class) && c2 != null) {
            long a = this.m.a() - c2.longValue();
            if (a <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                sentryAndroidOptions.getLogger().c(s4.DEBUG, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(a));
                g0();
            }
        }
        m.k(n1Var, AnrV2Integration.b.class, new m.a() { // from class: io.sentry.android.core.cache.a
            @Override // io.sentry.util.m.a
            public final void a(Object obj) {
                b.this.d0(sentryAndroidOptions, (AnrV2Integration.b) obj);
            }
        });
    }

    b(SentryAndroidOptions sentryAndroidOptions, io.sentry.transport.q qVar) {
        super(sentryAndroidOptions, (String) io.sentry.util.q.c(sentryAndroidOptions.getCacheDirPath(), "cacheDirPath must not be null"), sentryAndroidOptions.getMaxCacheItems());
        this.m = qVar;
    }
}
