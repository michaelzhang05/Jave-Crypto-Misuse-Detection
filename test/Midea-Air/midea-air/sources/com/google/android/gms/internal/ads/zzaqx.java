package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import cm.aptoide.pt.DeepLinkIntentReceiver;
import cm.aptoide.pt.dataprovider.BuildConfig;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@zzard
/* loaded from: classes2.dex */
public final class zzaqx implements zzarb {
    private static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    private static zzarb f12901b;

    /* renamed from: c, reason: collision with root package name */
    @VisibleForTesting
    private static zzarb f12902c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f12903d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f12904e;

    /* renamed from: f, reason: collision with root package name */
    private final WeakHashMap<Thread, Boolean> f12905f;

    /* renamed from: g, reason: collision with root package name */
    private final ExecutorService f12906g;

    /* renamed from: h, reason: collision with root package name */
    private final zzbai f12907h;

    private zzaqx(Context context) {
        this(context, zzbai.w());
    }

    @VisibleForTesting
    private final Uri.Builder c(String str, String str2, String str3, int i2) {
        boolean z;
        String str4;
        try {
            z = Wrappers.a(this.f12904e).f();
        } catch (Throwable th) {
            zzbad.c("Error fetching instant app info", th);
            z = false;
        }
        try {
            str4 = this.f12904e.getPackageName();
        } catch (Throwable unused) {
            zzbad.i("Cannot obtain package name, proceeding.");
            str4 = "unknown";
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme(BuildConfig.APTOIDE_WEB_SERVICES_SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter(DeepLinkIntentReceiver.DeepLinksKeys.ID, "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
        String str5 = Build.MANUFACTURER;
        String str6 = Build.MODEL;
        if (!str6.startsWith(str5)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 1 + str6.length());
            sb.append(str5);
            sb.append(" ");
            sb.append(str6);
            str6 = sb.toString();
        }
        return appendQueryParameter.appendQueryParameter("device", str6).appendQueryParameter("js", this.f12907h.f13150f).appendQueryParameter("appid", str4).appendQueryParameter("exceptiontype", str).appendQueryParameter("stacktrace", str2).appendQueryParameter("eids", TextUtils.join(",", zzacu.c())).appendQueryParameter("exceptionkey", str3).appendQueryParameter("cl", "248613007").appendQueryParameter("rc", "dev").appendQueryParameter("session_id", zzyt.f()).appendQueryParameter("sampling_rate", Integer.toString(i2)).appendQueryParameter("pb_tm", String.valueOf(zzyt.e().c(zzacu.M4)));
    }

    public static zzarb e(Context context, zzbai zzbaiVar) {
        synchronized (a) {
            if (f12902c == null) {
                if (((Boolean) zzyt.e().c(zzacu.l)).booleanValue()) {
                    zzaqx zzaqxVar = new zzaqx(context, zzbaiVar);
                    Thread thread = Looper.getMainLooper().getThread();
                    if (thread != null) {
                        synchronized (zzaqxVar.f12903d) {
                            zzaqxVar.f12905f.put(thread, Boolean.TRUE);
                        }
                        thread.setUncaughtExceptionHandler(new p3(zzaqxVar, thread.getUncaughtExceptionHandler()));
                    }
                    Thread.setDefaultUncaughtExceptionHandler(new o3(zzaqxVar, Thread.getDefaultUncaughtExceptionHandler()));
                    f12902c = zzaqxVar;
                } else {
                    f12902c = new zzarc();
                }
            }
        }
        return f12902c;
    }

    public static zzarb f(Context context) {
        synchronized (a) {
            if (f12901b == null) {
                if (((Boolean) zzyt.e().c(zzacu.l)).booleanValue()) {
                    f12901b = new zzaqx(context);
                } else {
                    f12901b = new zzarc();
                }
            }
        }
        return f12901b;
    }

    @Override // com.google.android.gms.internal.ads.zzarb
    public final void a(Throwable th, String str) {
        b(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzarb
    public final void b(Throwable th, String str, float f2) {
        if (zzazt.r(th) == null) {
            return;
        }
        String name = th.getClass().getName();
        StringWriter stringWriter = new StringWriter();
        zzdmb.a(th, new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        int i2 = 0;
        boolean z = Math.random() < ((double) f2);
        int i3 = f2 > 0.0f ? (int) (1.0f / f2) : 1;
        if (z) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(c(name, stringWriter2, str, i3).toString());
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                this.f12906g.submit(new q3(this, new zzbah(), (String) obj));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r3 == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.Thread r10, java.lang.Throwable r11) {
        /*
            r9 = this;
            r10 = 1
            r0 = 0
            if (r11 == 0) goto L3c
            r1 = r11
            r2 = 0
            r3 = 0
        L7:
            if (r1 == 0) goto L37
            java.lang.StackTraceElement[] r4 = r1.getStackTrace()
            int r5 = r4.length
            r6 = 0
        Lf:
            if (r6 >= r5) goto L32
            r7 = r4[r6]
            java.lang.String r8 = r7.getClassName()
            boolean r8 = com.google.android.gms.internal.ads.zzazt.u(r8)
            if (r8 == 0) goto L1e
            r2 = 1
        L1e:
            java.lang.Class<com.google.android.gms.internal.ads.zzaqx> r8 = com.google.android.gms.internal.ads.zzaqx.class
            java.lang.String r8 = r8.getName()
            java.lang.String r7 = r7.getClassName()
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L2f
            r3 = 1
        L2f:
            int r6 = r6 + 1
            goto Lf
        L32:
            java.lang.Throwable r1 = r1.getCause()
            goto L7
        L37:
            if (r2 == 0) goto L3c
            if (r3 != 0) goto L3c
            goto L3d
        L3c:
            r10 = 0
        L3d:
            if (r10 == 0) goto L46
            r10 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r0 = ""
            r9.b(r11, r0, r10)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqx.d(java.lang.Thread, java.lang.Throwable):void");
    }

    private zzaqx(Context context, zzbai zzbaiVar) {
        this.f12903d = new Object();
        this.f12905f = new WeakHashMap<>();
        this.f12906g = Executors.newCachedThreadPool();
        this.f12904e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f12907h = zzbaiVar;
    }
}
