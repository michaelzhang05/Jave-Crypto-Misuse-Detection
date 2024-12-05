package io.sentry.cache;

import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.a1;
import io.sentry.d5;
import io.sentry.e4;
import io.sentry.h4;
import io.sentry.j4;
import io.sentry.n1;
import io.sentry.r4;
import io.sentry.s4;
import io.sentry.w1;
import io.sentry.x4;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: EnvelopeCache.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public class q extends o implements r {

    /* renamed from: k, reason: collision with root package name */
    private final CountDownLatch f18882k;
    private final Map<h4, String> l;

    public q(x4 x4Var, String str, int i2) {
        super(x4Var, str, i2);
        this.l = new WeakHashMap();
        this.f18882k = new CountDownLatch(1);
    }

    private File[] O() {
        File[] listFiles;
        return (!f() || (listFiles = this.f18880i.listFiles(new FilenameFilter() { // from class: io.sentry.cache.b
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean endsWith;
                endsWith = str.endsWith(".envelope");
                return endsWith;
            }
        })) == null) ? new File[0] : listFiles;
    }

    public static r P(x4 x4Var) {
        String cacheDirPath = x4Var.getCacheDirPath();
        int maxCacheItems = x4Var.getMaxCacheItems();
        if (cacheDirPath == null) {
            x4Var.getLogger().c(s4.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
            return io.sentry.transport.t.a();
        }
        return new q(x4Var, cacheDirPath, maxCacheItems);
    }

    public static File R(String str) {
        return new File(str, "session.json");
    }

    private synchronized File S(h4 h4Var) {
        String uuid;
        String str;
        if (this.l.containsKey(h4Var)) {
            str = this.l.get(h4Var);
        } else {
            if (h4Var.b().a() != null) {
                uuid = h4Var.b().a().toString();
            } else {
                uuid = UUID.randomUUID().toString();
            }
            String str2 = uuid + ".envelope";
            this.l.put(h4Var, str2);
            str = str2;
        }
        return new File(this.f18880i.getAbsolutePath(), str);
    }

    public static File T(String str) {
        return new File(str, "previous_session.json");
    }

    private void V(n1 n1Var) {
        Date date;
        Object c2 = io.sentry.util.m.c(n1Var);
        if (c2 instanceof io.sentry.hints.b) {
            File T = T(this.f18880i.getAbsolutePath());
            if (T.exists()) {
                w1 logger = this.f18878g.getLogger();
                s4 s4Var = s4.WARNING;
                logger.c(s4Var, "Previous session is not ended, we'd need to end it.", new Object[0]);
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(T), o.f18877f));
                    try {
                        d5 d5Var = (d5) this.f18879h.c(bufferedReader, d5.class);
                        if (d5Var != null) {
                            io.sentry.hints.b bVar = (io.sentry.hints.b) c2;
                            Long c3 = bVar.c();
                            if (c3 != null) {
                                date = a1.d(c3.longValue());
                                Date k2 = d5Var.k();
                                if (k2 == null || date.before(k2)) {
                                    this.f18878g.getLogger().c(s4Var, "Abnormal exit happened before previous session start, not ending the session.", new Object[0]);
                                    bufferedReader.close();
                                    return;
                                }
                            } else {
                                date = null;
                            }
                            d5Var.q(d5.b.Abnormal, null, true, bVar.f());
                            d5Var.d(date);
                            a0(T, d5Var);
                        }
                        bufferedReader.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused) {
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.f18878g.getLogger().b(s4.ERROR, "Error processing previous session.", th2);
                    return;
                }
            }
            this.f18878g.getLogger().c(s4.DEBUG, "No previous session file to end.", new Object[0]);
        }
    }

    private void W(File file, h4 h4Var) {
        Iterable<j4> c2 = h4Var.c();
        if (c2.iterator().hasNext()) {
            j4 next = c2.iterator().next();
            if (r4.Session.equals(next.i().b())) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(next.h()), o.f18877f));
                    try {
                        d5 d5Var = (d5) this.f18879h.c(bufferedReader, d5.class);
                        if (d5Var == null) {
                            this.f18878g.getLogger().c(s4.ERROR, "Item of type %s returned null by the parser.", next.i().b());
                        } else {
                            a0(file, d5Var);
                        }
                        bufferedReader.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused) {
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.f18878g.getLogger().b(s4.ERROR, "Item failed to process.", th2);
                    return;
                }
            }
            this.f18878g.getLogger().c(s4.INFO, "Current envelope has a different envelope type %s", next.i().b());
            return;
        }
        this.f18878g.getLogger().c(s4.INFO, "Current envelope %s is empty", file.getAbsolutePath());
    }

    private void Y() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f18878g.getCacheDirPath(), "last_crash"));
            try {
                fileOutputStream.write(a1.g(a1.c()).getBytes(o.f18877f));
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
            this.f18878g.getLogger().b(s4.ERROR, "Error writing the crash marker file to the disk", th2);
        }
    }

    private void Z(File file, h4 h4Var) {
        if (file.exists()) {
            this.f18878g.getLogger().c(s4.DEBUG, "Overwriting envelope to offline storage: %s", file.getAbsolutePath());
            if (!file.delete()) {
                this.f18878g.getLogger().c(s4.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                this.f18879h.b(h4Var, fileOutputStream);
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            this.f18878g.getLogger().a(s4.ERROR, th2, "Error writing Envelope %s to offline storage", file.getAbsolutePath());
        }
    }

    private void a0(File file, d5 d5Var) {
        if (file.exists()) {
            this.f18878g.getLogger().c(s4.DEBUG, "Overwriting session to offline storage: %s", d5Var.j());
            if (!file.delete()) {
                this.f18878g.getLogger().c(s4.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, o.f18877f));
                try {
                    this.f18879h.a(d5Var, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused2) {
                }
                throw th2;
            }
        } catch (Throwable th3) {
            this.f18878g.getLogger().a(s4.ERROR, th3, "Error writing Session to offline storage: %s", d5Var.j());
        }
    }

    public void Q() {
        this.f18882k.countDown();
    }

    public boolean X() {
        try {
            return this.f18882k.await(this.f18878g.getFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.f18878g.getLogger().c(s4.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
            return false;
        }
    }

    @Override // io.sentry.cache.r
    public void d(h4 h4Var) {
        io.sentry.util.q.c(h4Var, "Envelope is required.");
        File S = S(h4Var);
        if (S.exists()) {
            this.f18878g.getLogger().c(s4.DEBUG, "Discarding envelope from cache: %s", S.getAbsolutePath());
            if (S.delete()) {
                return;
            }
            this.f18878g.getLogger().c(s4.ERROR, "Failed to delete envelope: %s", S.getAbsolutePath());
            return;
        }
        this.f18878g.getLogger().c(s4.DEBUG, "Envelope was not cached: %s", S.getAbsolutePath());
    }

    @Override // java.lang.Iterable
    public Iterator<h4> iterator() {
        File[] O = O();
        ArrayList arrayList = new ArrayList(O.length);
        for (File file : O) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    arrayList.add(this.f18879h.d(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                    break;
                }
            } catch (FileNotFoundException unused2) {
                this.f18878g.getLogger().c(s4.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e2) {
                this.f18878g.getLogger().b(s4.ERROR, String.format("Error while reading cached envelope from file %s", file.getAbsolutePath()), e2);
            }
        }
        return arrayList.iterator();
    }

    public void q(h4 h4Var, n1 n1Var) {
        io.sentry.util.q.c(h4Var, "Envelope is required.");
        L(O());
        File R = R(this.f18880i.getAbsolutePath());
        File T = T(this.f18880i.getAbsolutePath());
        if (io.sentry.util.m.d(n1Var, io.sentry.hints.l.class) && !R.delete()) {
            this.f18878g.getLogger().c(s4.WARNING, "Current envelope doesn't exist.", new Object[0]);
        }
        if (io.sentry.util.m.d(n1Var, io.sentry.hints.b.class)) {
            V(n1Var);
        }
        if (io.sentry.util.m.d(n1Var, io.sentry.hints.n.class)) {
            if (R.exists()) {
                this.f18878g.getLogger().c(s4.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(R), o.f18877f));
                    try {
                        d5 d5Var = (d5) this.f18879h.c(bufferedReader, d5.class);
                        if (d5Var != null) {
                            a0(T, d5Var);
                        }
                        bufferedReader.close();
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused) {
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.f18878g.getLogger().b(s4.ERROR, "Error processing session.", th2);
                }
            }
            W(R, h4Var);
            boolean exists = new File(this.f18878g.getCacheDirPath(), ".sentry-native/last_crash").exists();
            if (!exists) {
                File file = new File(this.f18878g.getCacheDirPath(), "last_crash");
                if (file.exists()) {
                    this.f18878g.getLogger().c(s4.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
                    if (!file.delete()) {
                        this.f18878g.getLogger().c(s4.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                    }
                    exists = true;
                }
            }
            e4.a().b(exists);
            Q();
        }
        File S = S(h4Var);
        if (S.exists()) {
            this.f18878g.getLogger().c(s4.WARNING, "Not adding Envelope to offline storage because it already exists: %s", S.getAbsolutePath());
            return;
        }
        this.f18878g.getLogger().c(s4.DEBUG, "Adding Envelope to offline storage: %s", S.getAbsolutePath());
        Z(S, h4Var);
        if (io.sentry.util.m.d(n1Var, UncaughtExceptionHandlerIntegration.a.class)) {
            Y();
        }
    }
}
