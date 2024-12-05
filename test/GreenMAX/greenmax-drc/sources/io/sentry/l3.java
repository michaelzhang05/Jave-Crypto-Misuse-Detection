package io.sentry;

import io.sentry.d5;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PreviousSessionFinalizer.java */
/* loaded from: classes2.dex */
public final class l3 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private static final Charset f19015f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    private final x4 f19016g;

    /* renamed from: h, reason: collision with root package name */
    private final v1 f19017h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l3(x4 x4Var, v1 v1Var) {
        this.f19016g = x4Var;
        this.f19017h = v1Var;
    }

    private Date a(File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f19015f));
            try {
                String readLine = bufferedReader.readLine();
                this.f19016g.getLogger().c(s4.DEBUG, "Crash marker file has %s timestamp.", readLine);
                Date e2 = a1.e(readLine);
                bufferedReader.close();
                return e2;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IOException e3) {
            this.f19016g.getLogger().b(s4.ERROR, "Error reading the crash marker file.", e3);
            return null;
        } catch (IllegalArgumentException e4) {
            this.f19016g.getLogger().a(s4.ERROR, e4, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String cacheDirPath = this.f19016g.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f19016g.getLogger().c(s4.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
            return;
        }
        if (!this.f19016g.isEnableAutoSessionTracking()) {
            this.f19016g.getLogger().c(s4.DEBUG, "Session tracking is disabled, bailing from previous session finalizer.", new Object[0]);
            return;
        }
        io.sentry.cache.r envelopeDiskCache = this.f19016g.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.q) && !((io.sentry.cache.q) envelopeDiskCache).X()) {
            this.f19016g.getLogger().c(s4.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
            return;
        }
        File T = io.sentry.cache.q.T(cacheDirPath);
        c2 serializer = this.f19016g.getSerializer();
        if (T.exists()) {
            this.f19016g.getLogger().c(s4.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(T), f19015f));
                try {
                    d5 d5Var = (d5) serializer.c(bufferedReader, d5.class);
                    if (d5Var == null) {
                        this.f19016g.getLogger().c(s4.ERROR, "Stream from path %s resulted in a null envelope.", T.getAbsolutePath());
                    } else {
                        File file = new File(this.f19016g.getCacheDirPath(), ".sentry-native/last_crash");
                        Date date = null;
                        if (file.exists()) {
                            this.f19016g.getLogger().c(s4.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                            Date a = a(file);
                            if (!file.delete()) {
                                this.f19016g.getLogger().c(s4.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                            }
                            d5Var.p(d5.b.Crashed, null, true);
                            date = a;
                        }
                        if (d5Var.f() == null) {
                            d5Var.d(date);
                        }
                        this.f19017h.n(h4.a(serializer, d5Var, this.f19016g.getSdkVersion()));
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
                this.f19016g.getLogger().b(s4.ERROR, "Error processing previous session.", th2);
            }
            if (T.delete()) {
                return;
            }
            this.f19016g.getLogger().c(s4.WARNING, "Failed to delete the previous session file.", new Object[0]);
        }
    }
}
