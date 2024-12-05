package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import io.sentry.android.core.s0;
import io.sentry.s4;
import io.sentry.w1;
import java.io.File;
import java.nio.charset.Charset;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: RootChecker.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class r {
    private static final Charset a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    private final Context f18723b;

    /* renamed from: c, reason: collision with root package name */
    private final s0 f18724c;

    /* renamed from: d, reason: collision with root package name */
    private final w1 f18725d;

    /* renamed from: e, reason: collision with root package name */
    private final String[] f18726e;

    /* renamed from: f, reason: collision with root package name */
    private final String[] f18727f;

    /* renamed from: g, reason: collision with root package name */
    private final Runtime f18728g;

    public r(Context context, s0 s0Var, w1 w1Var) {
        this(context, s0Var, w1Var, new String[]{"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"}, new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"}, Runtime.getRuntime());
    }

    private boolean a() {
        for (String str : this.f18726e) {
            try {
            } catch (RuntimeException e2) {
                this.f18725d.a(s4.ERROR, e2, "Error when trying to check if root file %s exists.", str);
            }
            if (new File(str).exists()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    private boolean b(w1 w1Var) {
        s0 s0Var = new s0(w1Var);
        PackageManager packageManager = this.f18723b.getPackageManager();
        if (packageManager != null) {
            for (String str : this.f18727f) {
                try {
                    if (s0Var.d() >= 33) {
                        packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
                        return true;
                    }
                    packageManager.getPackageInfo(str, 0);
                    return true;
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean c() {
        /*
            r7 = this;
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "/system/xbin/which"
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "su"
            r3 = 1
            r0[r3] = r1
            r1 = 0
            java.lang.Runtime r4 = r7.f18728g     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L48
            java.lang.Process r1 = r4.exec(r0)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L48
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L48
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L48
            java.io.InputStream r5 = r1.getInputStream()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L48
            java.nio.charset.Charset r6 = io.sentry.android.core.internal.util.r.a     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L48
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L48
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L48
            java.lang.String r4 = r0.readLine()     // Catch: java.lang.Throwable -> L33
            if (r4 == 0) goto L2b
            goto L2c
        L2b:
            r3 = 0
        L2c:
            r0.close()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L48
            r1.destroy()
            return r3
        L33:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L37
        L37:
            throw r3     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L48
        L38:
            r0 = move-exception
            io.sentry.w1 r3 = r7.f18725d     // Catch: java.lang.Throwable -> L57
            io.sentry.s4 r4 = io.sentry.s4.DEBUG     // Catch: java.lang.Throwable -> L57
            java.lang.String r5 = "Error when trying to check if SU exists."
            r3.b(r4, r5, r0)     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L56
        L44:
            r1.destroy()
            goto L56
        L48:
            io.sentry.w1 r0 = r7.f18725d     // Catch: java.lang.Throwable -> L57
            io.sentry.s4 r3 = io.sentry.s4.DEBUG     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = "SU isn't found on this Device."
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L57
            r0.c(r3, r4, r5)     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L56
            goto L44
        L56:
            return r2
        L57:
            r0 = move-exception
            if (r1 == 0) goto L5d
            r1.destroy()
        L5d:
            goto L5f
        L5e:
            throw r0
        L5f:
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.internal.util.r.c():boolean");
    }

    private boolean d() {
        String a2 = this.f18724c.a();
        return a2 != null && a2.contains("test-keys");
    }

    public boolean e() {
        return d() || a() || c() || b(this.f18725d);
    }

    r(Context context, s0 s0Var, w1 w1Var, String[] strArr, String[] strArr2, Runtime runtime) {
        this.f18723b = (Context) io.sentry.util.q.c(context, "The application context is required.");
        this.f18724c = (s0) io.sentry.util.q.c(s0Var, "The BuildInfoProvider is required.");
        this.f18725d = (w1) io.sentry.util.q.c(w1Var, "The Logger is required.");
        this.f18726e = (String[]) io.sentry.util.q.c(strArr, "The root Files are required.");
        this.f18727f = (String[]) io.sentry.util.q.c(strArr2, "The root packages are required.");
        this.f18728g = (Runtime) io.sentry.util.q.c(runtime, "The Runtime is required.");
    }
}
