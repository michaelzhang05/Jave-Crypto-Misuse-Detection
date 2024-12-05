package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import io.sentry.android.core.internal.util.k;
import io.sentry.android.core.t0;
import io.sentry.protocol.e;
import io.sentry.s4;
import java.io.File;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: DeviceInfoUtil.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class w0 {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile w0 a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f18795b;

    /* renamed from: c, reason: collision with root package name */
    private final SentryAndroidOptions f18796c;

    /* renamed from: d, reason: collision with root package name */
    private final s0 f18797d;

    /* renamed from: e, reason: collision with root package name */
    private final Boolean f18798e;

    /* renamed from: f, reason: collision with root package name */
    private final t0.a f18799f;

    /* renamed from: g, reason: collision with root package name */
    private final io.sentry.protocol.k f18800g;

    /* renamed from: h, reason: collision with root package name */
    private final Long f18801h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeviceInfoUtil.java */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[k.a.values().length];
            a = iArr;
            try {
                iArr[k.a.NOT_CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[k.a.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public w0(Context context, SentryAndroidOptions sentryAndroidOptions) {
        this.f18795b = context;
        this.f18796c = sentryAndroidOptions;
        s0 s0Var = new s0(sentryAndroidOptions.getLogger());
        this.f18797d = s0Var;
        io.sentry.android.core.internal.util.m.a().c();
        this.f18800g = B();
        this.f18798e = s0Var.f();
        this.f18799f = t0.p(context, sentryAndroidOptions.getLogger(), s0Var);
        ActivityManager.MemoryInfo h2 = t0.h(context, sentryAndroidOptions.getLogger());
        if (h2 != null) {
            this.f18801h = q(h2);
        } else {
            this.f18801h = null;
        }
    }

    private boolean A() {
        String externalStorageState = Environment.getExternalStorageState();
        return ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) && !Environment.isExternalStorageEmulated();
    }

    private void C(io.sentry.protocol.e eVar, boolean z) {
        Boolean bool;
        Intent d2 = d();
        if (d2 != null) {
            eVar.N(e(d2));
            eVar.R(z(d2));
            eVar.O(f(d2));
        }
        int i2 = a.a[io.sentry.android.core.internal.util.k.b(this.f18795b, this.f18796c.getLogger()).ordinal()];
        if (i2 != 1) {
            bool = i2 != 2 ? null : Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        eVar.h0(bool);
        ActivityManager.MemoryInfo h2 = t0.h(this.f18795b, this.f18796c.getLogger());
        if (h2 != null && z) {
            eVar.W(Long.valueOf(h2.availMem));
            eVar.b0(Boolean.valueOf(h2.lowMemory));
        }
        File externalFilesDir = this.f18795b.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            StatFs statFs = new StatFs(externalFilesDir.getPath());
            eVar.q0(w(statFs));
            eVar.X(y(statFs));
        }
        StatFs o = o(externalFilesDir);
        if (o != null) {
            eVar.U(v(o));
            eVar.T(x(o));
        }
        if (eVar.I() == null) {
            eVar.S(io.sentry.android.core.internal.util.k.c(this.f18795b, this.f18796c.getLogger(), this.f18797d));
        }
    }

    private int b(StatFs statFs) {
        return statFs.getAvailableBlocks();
    }

    private long c(StatFs statFs) {
        if (this.f18797d.d() >= 18) {
            return statFs.getAvailableBlocksLong();
        }
        return b(statFs);
    }

    private Intent d() {
        return t0.o(this.f18795b, this.f18797d, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    private Float e(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th) {
            this.f18796c.getLogger().b(s4.ERROR, "Error getting device battery level.", th);
            return null;
        }
    }

    private Float f(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("temperature", -1);
            if (intExtra != -1) {
                return Float.valueOf(intExtra / 10.0f);
            }
            return null;
        } catch (Throwable th) {
            this.f18796c.getLogger().b(s4.ERROR, "Error getting battery temperature.", th);
            return null;
        }
    }

    private int g(StatFs statFs) {
        return statFs.getBlockCount();
    }

    private long h(StatFs statFs) {
        if (this.f18797d.d() >= 18) {
            return statFs.getBlockCountLong();
        }
        return g(statFs);
    }

    private int i(StatFs statFs) {
        return statFs.getBlockSize();
    }

    private long j(StatFs statFs) {
        if (this.f18797d.d() >= 18) {
            return statFs.getBlockSizeLong();
        }
        return i(statFs);
    }

    private Date k() {
        try {
            return io.sentry.a1.d(System.currentTimeMillis() - SystemClock.elapsedRealtime());
        } catch (IllegalArgumentException e2) {
            this.f18796c.getLogger().a(s4.ERROR, e2, "Error getting the device's boot time.", new Object[0]);
            return null;
        }
    }

    private String l() {
        try {
            return a1.a(this.f18795b);
        } catch (Throwable th) {
            this.f18796c.getLogger().b(s4.ERROR, "Error getting installationId.", th);
            return null;
        }
    }

    private File[] m() {
        if (this.f18797d.d() >= 19) {
            return this.f18795b.getExternalFilesDirs(null);
        }
        File externalFilesDir = this.f18795b.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            return new File[]{externalFilesDir};
        }
        return null;
    }

    private File n(File file) {
        File[] m = m();
        if (m != null) {
            String absolutePath = file != null ? file.getAbsolutePath() : null;
            for (File file2 : m) {
                if (file2 != null && (absolutePath == null || absolutePath.isEmpty() || !file2.getAbsolutePath().contains(absolutePath))) {
                    return file2;
                }
            }
        } else {
            this.f18796c.getLogger().c(s4.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
        }
        return null;
    }

    private StatFs o(File file) {
        if (!A()) {
            File n = n(file);
            if (n != null) {
                return new StatFs(n.getPath());
            }
            this.f18796c.getLogger().c(s4.INFO, "Not possible to read external files directory", new Object[0]);
            return null;
        }
        this.f18796c.getLogger().c(s4.INFO, "External storage is not mounted or emulated.", new Object[0]);
        return null;
    }

    public static w0 p(Context context, SentryAndroidOptions sentryAndroidOptions) {
        if (a == null) {
            synchronized (w0.class) {
                if (a == null) {
                    a = new w0(context.getApplicationContext(), sentryAndroidOptions);
                }
            }
        }
        return a;
    }

    private Long q(ActivityManager.MemoryInfo memoryInfo) {
        if (this.f18797d.d() >= 16) {
            return Long.valueOf(memoryInfo.totalMem);
        }
        return Long.valueOf(Runtime.getRuntime().totalMemory());
    }

    private e.b s() {
        e.b bVar;
        Throwable th;
        try {
            bVar = io.sentry.android.core.internal.util.o.a(this.f18795b.getResources().getConfiguration().orientation);
            if (bVar == null) {
                try {
                    this.f18796c.getLogger().c(s4.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    this.f18796c.getLogger().b(s4.ERROR, "Error getting device orientation.", th);
                    return bVar;
                }
            }
        } catch (Throwable th3) {
            bVar = null;
            th = th3;
        }
        return bVar;
    }

    private TimeZone u() {
        if (this.f18797d.d() >= 24) {
            LocaleList locales = this.f18795b.getResources().getConfiguration().getLocales();
            if (!locales.isEmpty()) {
                return Calendar.getInstance(locales.get(0)).getTimeZone();
            }
        }
        return Calendar.getInstance().getTimeZone();
    }

    private Long v(StatFs statFs) {
        try {
            return Long.valueOf(h(statFs) * j(statFs));
        } catch (Throwable th) {
            this.f18796c.getLogger().b(s4.ERROR, "Error getting total external storage amount.", th);
            return null;
        }
    }

    private Long w(StatFs statFs) {
        try {
            return Long.valueOf(h(statFs) * j(statFs));
        } catch (Throwable th) {
            this.f18796c.getLogger().b(s4.ERROR, "Error getting total internal storage amount.", th);
            return null;
        }
    }

    private Long x(StatFs statFs) {
        try {
            return Long.valueOf(c(statFs) * j(statFs));
        } catch (Throwable th) {
            this.f18796c.getLogger().b(s4.ERROR, "Error getting unused external storage amount.", th);
            return null;
        }
    }

    private Long y(StatFs statFs) {
        try {
            return Long.valueOf(c(statFs) * j(statFs));
        } catch (Throwable th) {
            this.f18796c.getLogger().b(s4.ERROR, "Error getting unused internal storage amount.", th);
            return null;
        }
    }

    private Boolean z(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z = true;
            if (intExtra != 1 && intExtra != 2) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            this.f18796c.getLogger().b(s4.ERROR, "Error getting device charging state.", th);
            return null;
        }
    }

    protected io.sentry.protocol.k B() {
        io.sentry.protocol.k kVar = new io.sentry.protocol.k();
        kVar.j("Android");
        kVar.m(Build.VERSION.RELEASE);
        kVar.h(Build.DISPLAY);
        String g2 = t0.g(this.f18796c.getLogger());
        if (g2 != null) {
            kVar.i(g2);
        }
        if (this.f18796c.isEnableRootCheck()) {
            kVar.k(Boolean.valueOf(new io.sentry.android.core.internal.util.r(this.f18795b, this.f18797d, this.f18796c.getLogger()).e()));
        }
        return kVar;
    }

    public io.sentry.protocol.e a(boolean z, boolean z2) {
        io.sentry.protocol.e eVar = new io.sentry.protocol.e();
        if (this.f18796c.isSendDefaultPii()) {
            eVar.g0(t0.d(this.f18795b, this.f18797d));
        }
        eVar.c0(Build.MANUFACTURER);
        eVar.Q(Build.BRAND);
        eVar.V(t0.f(this.f18796c.getLogger()));
        eVar.e0(Build.MODEL);
        eVar.f0(Build.ID);
        eVar.M(t0.c(this.f18797d));
        eVar.i0(s());
        Boolean bool = this.f18798e;
        if (bool != null) {
            eVar.p0(bool);
        }
        DisplayMetrics e2 = t0.e(this.f18795b, this.f18796c.getLogger());
        if (e2 != null) {
            eVar.o0(Integer.valueOf(e2.widthPixels));
            eVar.n0(Integer.valueOf(e2.heightPixels));
            eVar.l0(Float.valueOf(e2.density));
            eVar.m0(Integer.valueOf(e2.densityDpi));
        }
        eVar.P(k());
        eVar.r0(u());
        if (eVar.J() == null) {
            eVar.Y(l());
        }
        Locale locale = Locale.getDefault();
        if (eVar.K() == null) {
            eVar.Z(locale.getLanguage());
        }
        if (eVar.L() == null) {
            eVar.a0(locale.toString());
        }
        List<Integer> c2 = io.sentry.android.core.internal.util.m.a().c();
        if (!c2.isEmpty()) {
            eVar.k0(Double.valueOf(((Integer) Collections.max(c2)).doubleValue()));
            eVar.j0(Integer.valueOf(c2.size()));
        }
        eVar.d0(this.f18801h);
        if (z && this.f18796c.isCollectAdditionalContext()) {
            C(eVar, z2);
        }
        return eVar;
    }

    public io.sentry.protocol.k r() {
        return this.f18800g;
    }

    public t0.a t() {
        return this.f18799f;
    }
}
