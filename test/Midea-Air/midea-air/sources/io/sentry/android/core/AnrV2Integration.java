package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import io.sentry.Integration;
import io.sentry.i2;
import io.sentry.l4;
import io.sentry.n1;
import io.sentry.s4;
import io.sentry.v1;
import io.sentry.w1;
import io.sentry.x4;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.ApiStatus;

@SuppressLint({"NewApi"})
/* loaded from: classes2.dex */
public class AnrV2Integration implements Integration, Closeable {

    /* renamed from: f, reason: collision with root package name */
    static final long f18542f = TimeUnit.DAYS.toMillis(91);

    /* renamed from: g, reason: collision with root package name */
    private final Context f18543g;

    /* renamed from: h, reason: collision with root package name */
    private final io.sentry.transport.q f18544h;

    /* renamed from: i, reason: collision with root package name */
    private SentryAndroidOptions f18545i;

    /* loaded from: classes2.dex */
    static class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        private final Context f18546f;

        /* renamed from: g, reason: collision with root package name */
        private final v1 f18547g;

        /* renamed from: h, reason: collision with root package name */
        private final SentryAndroidOptions f18548h;

        /* renamed from: i, reason: collision with root package name */
        private final long f18549i;

        a(Context context, v1 v1Var, SentryAndroidOptions sentryAndroidOptions, io.sentry.transport.q qVar) {
            this.f18546f = context;
            this.f18547g = v1Var;
            this.f18548h = sentryAndroidOptions;
            this.f18549i = qVar.a() - AnrV2Integration.f18542f;
        }

        private byte[] a(InputStream inputStream) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr, 0, 1024);
                    if (read != -1) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        return byteArray;
                    }
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }

        private c b(ApplicationExitInfo applicationExitInfo, boolean z) {
            try {
                InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                try {
                    if (traceInputStream == null) {
                        c cVar = new c(c.a.NO_DUMP);
                        if (traceInputStream != null) {
                            traceInputStream.close();
                        }
                        return cVar;
                    }
                    byte[] a = a(traceInputStream);
                    traceInputStream.close();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(a)));
                        try {
                            List<io.sentry.protocol.w> f2 = new io.sentry.android.core.internal.threaddump.c(this.f18548h, z).f(io.sentry.android.core.internal.threaddump.b.c(bufferedReader));
                            if (f2.isEmpty()) {
                                c cVar2 = new c(c.a.ERROR, a);
                                bufferedReader.close();
                                return cVar2;
                            }
                            c cVar3 = new c(c.a.DUMP, a, f2);
                            bufferedReader.close();
                            return cVar3;
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable unused) {
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        this.f18548h.getLogger().b(s4.WARNING, "Failed to parse ANR thread dump", th2);
                        return new c(c.a.ERROR, a);
                    }
                } catch (Throwable th3) {
                    if (traceInputStream != null) {
                        try {
                            traceInputStream.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                this.f18548h.getLogger().b(s4.WARNING, "Failed to read ANR thread dump", th4);
                return new c(c.a.NO_DUMP);
            }
        }

        private void c(ApplicationExitInfo applicationExitInfo, boolean z) {
            byte[] bArr;
            long timestamp = applicationExitInfo.getTimestamp();
            boolean z2 = applicationExitInfo.getImportance() != 100;
            c b2 = b(applicationExitInfo, z2);
            if (b2.a == c.a.NO_DUMP) {
                this.f18548h.getLogger().c(s4.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
                return;
            }
            b bVar = new b(this.f18548h.getFlushTimeoutMillis(), this.f18548h.getLogger(), timestamp, z, z2);
            n1 a = io.sentry.util.m.a(bVar);
            l4 l4Var = new l4();
            c.a aVar = b2.a;
            if (aVar == c.a.ERROR) {
                io.sentry.protocol.j jVar = new io.sentry.protocol.j();
                jVar.d("Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.");
                l4Var.A0(jVar);
            } else if (aVar == c.a.DUMP) {
                l4Var.C0(b2.f18554c);
            }
            l4Var.z0(s4.FATAL);
            l4Var.D0(io.sentry.a1.d(timestamp));
            if (this.f18548h.isAttachAnrThreadDump() && (bArr = b2.f18553b) != null) {
                a.l(io.sentry.s0.b(bArr));
            }
            if (this.f18547g.o(l4Var, a).equals(io.sentry.protocol.q.f19172f) || bVar.e()) {
                return;
            }
            this.f18548h.getLogger().c(s4.WARNING, "Timed out waiting to flush ANR event to disk. Event: %s", l4Var.G());
        }

        private void d(List<ApplicationExitInfo> list, Long l) {
            Collections.reverse(list);
            for (ApplicationExitInfo applicationExitInfo : list) {
                if (applicationExitInfo.getReason() == 6) {
                    if (applicationExitInfo.getTimestamp() < this.f18549i) {
                        this.f18548h.getLogger().c(s4.DEBUG, "ANR happened too long ago %s.", applicationExitInfo);
                    } else if (l != null && applicationExitInfo.getTimestamp() <= l.longValue()) {
                        this.f18548h.getLogger().c(s4.DEBUG, "ANR has already been reported %s.", applicationExitInfo);
                    } else {
                        c(applicationExitInfo, false);
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        @SuppressLint({"NewApi"})
        public void run() {
            ApplicationExitInfo applicationExitInfo = null;
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f18546f.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() == 0) {
                this.f18548h.getLogger().c(s4.DEBUG, "No records in historical exit reasons.", new Object[0]);
                return;
            }
            io.sentry.cache.r envelopeDiskCache = this.f18548h.getEnvelopeDiskCache();
            if ((envelopeDiskCache instanceof io.sentry.cache.q) && this.f18548h.isEnableAutoSessionTracking()) {
                io.sentry.cache.q qVar = (io.sentry.cache.q) envelopeDiskCache;
                if (!qVar.X()) {
                    this.f18548h.getLogger().c(s4.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
                    qVar.Q();
                }
            }
            ArrayList arrayList = new ArrayList(historicalProcessExitReasons);
            Long e0 = io.sentry.android.core.cache.b.e0(this.f18548h);
            Iterator<ApplicationExitInfo> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ApplicationExitInfo next = it.next();
                if (next.getReason() == 6) {
                    arrayList.remove(next);
                    applicationExitInfo = next;
                    break;
                }
            }
            if (applicationExitInfo == null) {
                this.f18548h.getLogger().c(s4.DEBUG, "No ANRs have been found in the historical exit reasons list.", new Object[0]);
                return;
            }
            if (applicationExitInfo.getTimestamp() < this.f18549i) {
                this.f18548h.getLogger().c(s4.DEBUG, "Latest ANR happened too long ago, returning early.", new Object[0]);
                return;
            }
            if (e0 != null && applicationExitInfo.getTimestamp() <= e0.longValue()) {
                this.f18548h.getLogger().c(s4.DEBUG, "Latest ANR has already been reported, returning early.", new Object[0]);
                return;
            }
            if (this.f18548h.isReportHistoricalAnrs()) {
                d(arrayList, e0);
            }
            c(applicationExitInfo, true);
        }
    }

    @ApiStatus.Internal
    /* loaded from: classes2.dex */
    public static final class b extends io.sentry.hints.e implements io.sentry.hints.d, io.sentry.hints.b {

        /* renamed from: d, reason: collision with root package name */
        private final long f18550d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f18551e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f18552f;

        public b(long j2, w1 w1Var, long j3, boolean z, boolean z2) {
            super(j2, w1Var);
            this.f18550d = j3;
            this.f18551e = z;
            this.f18552f = z2;
        }

        @Override // io.sentry.hints.d
        public boolean a() {
            return this.f18551e;
        }

        @Override // io.sentry.hints.b
        public Long c() {
            return Long.valueOf(this.f18550d);
        }

        @Override // io.sentry.hints.b
        public /* synthetic */ boolean d() {
            return io.sentry.hints.a.a(this);
        }

        @Override // io.sentry.hints.b
        public String f() {
            return this.f18552f ? "anr_background" : "anr_foreground";
        }
    }

    public AnrV2Integration(Context context) {
        this(context, io.sentry.transport.o.b());
    }

    @Override // io.sentry.j2
    public /* synthetic */ void a() {
        i2.a(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        SentryAndroidOptions sentryAndroidOptions = this.f18545i;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(s4.DEBUG, "AnrV2Integration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.Integration
    @SuppressLint({"NewApi"})
    public void f(v1 v1Var, x4 x4Var) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.q.c(x4Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) x4Var : null, "SentryAndroidOptions is required");
        this.f18545i = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().c(s4.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(this.f18545i.isAnrEnabled()));
        if (this.f18545i.getCacheDirPath() == null) {
            this.f18545i.getLogger().c(s4.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
            return;
        }
        if (this.f18545i.isAnrEnabled()) {
            try {
                x4Var.getExecutorService().submit(new a(this.f18543g, v1Var, this.f18545i, this.f18544h));
            } catch (Throwable th) {
                x4Var.getLogger().b(s4.DEBUG, "Failed to start AnrProcessor.", th);
            }
            x4Var.getLogger().c(s4.DEBUG, "AnrV2Integration installed.", new Object[0]);
            a();
        }
    }

    @Override // io.sentry.j2
    public /* synthetic */ String o() {
        return i2.b(this);
    }

    AnrV2Integration(Context context, io.sentry.transport.q qVar) {
        this.f18543g = context;
        this.f18544h = qVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c {
        final a a;

        /* renamed from: b, reason: collision with root package name */
        final byte[] f18553b;

        /* renamed from: c, reason: collision with root package name */
        final List<io.sentry.protocol.w> f18554c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public enum a {
            DUMP,
            NO_DUMP,
            ERROR
        }

        c(a aVar) {
            this.a = aVar;
            this.f18553b = null;
            this.f18554c = null;
        }

        c(a aVar, byte[] bArr) {
            this.a = aVar;
            this.f18553b = bArr;
            this.f18554c = null;
        }

        c(a aVar, byte[] bArr, List<io.sentry.protocol.w> list) {
            this.a = aVar;
            this.f18553b = bArr;
            this.f18554c = list;
        }
    }
}
