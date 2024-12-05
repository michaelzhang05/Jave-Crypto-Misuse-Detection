package com.uptodown.workers;

import a5.C1648o;
import a5.O;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.workers.DownloadWorker;
import j6.n;
import java.io.File;
import java.net.URL;
import java.util.Iterator;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.S;
import kotlin.jvm.internal.T;
import o5.C3655A;
import o5.C3661a;
import o5.C3671k;
import o5.C3674n;
import o5.C3677q;
import o5.C3678r;
import o5.C3680t;
import o5.C3683w;

/* loaded from: classes5.dex */
public final class DownloadApkWorker extends DownloadWorker {

    /* renamed from: k, reason: collision with root package name */
    public static final a f31034k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    private static C1648o f31035l;

    /* renamed from: i, reason: collision with root package name */
    private String f31036i;

    /* renamed from: j, reason: collision with root package name */
    private String f31037j;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final void a(long j8) {
            DownloadWorker.f31052c.j(c(j8));
        }

        public final C1648o b() {
            return DownloadApkWorker.f31035l;
        }

        public final boolean c(long j8) {
            if (DownloadApkWorker.f31035l != null) {
                C1648o c1648o = DownloadApkWorker.f31035l;
                AbstractC3255y.f(c1648o);
                if (c1648o.h() == j8) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(long j8, long j9) {
            if (DownloadApkWorker.f31035l != null) {
                C1648o c1648o = DownloadApkWorker.f31035l;
                AbstractC3255y.f(c1648o);
                if (c1648o.h() == j8) {
                    C1648o c1648o2 = DownloadApkWorker.f31035l;
                    AbstractC3255y.f(c1648o2);
                    if (c1648o2.e0() == j9) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final boolean e(C1648o d8) {
            AbstractC3255y.i(d8, "d");
            if (DownloadApkWorker.f31035l != null) {
                C1648o c1648o = DownloadApkWorker.f31035l;
                AbstractC3255y.f(c1648o);
                if (c1648o.w() != null) {
                    C1648o c1648o2 = DownloadApkWorker.f31035l;
                    AbstractC3255y.f(c1648o2);
                    if (n.s(c1648o2.w(), d8.w(), true)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final boolean f(Context context, int i8) {
            AbstractC3255y.i(context, "context");
            if (!UptodownApp.f29058B.W("downloadApkWorker", context)) {
                Data.Builder putInt = new Data.Builder().putInt("downloadId", i8);
                AbstractC3255y.h(putInt, "Builder()\n              …_DOWNLOAD_ID, downloadId)");
                OneTimeWorkRequest.Builder addTag = new OneTimeWorkRequest.Builder(DownloadApkWorker.class).addTag("downloadApkWorker");
                Data build = putInt.build();
                AbstractC3255y.h(build, "builder.build()");
                WorkManager.getInstance(context).enqueue(addTag.setInputData(build).build());
                return true;
            }
            return false;
        }

        public final boolean g(Context context, String url) {
            AbstractC3255y.i(context, "context");
            AbstractC3255y.i(url, "url");
            if (!UptodownApp.f29058B.W("downloadApkWorker", context)) {
                Data.Builder putString = new Data.Builder().putString("url", url);
                AbstractC3255y.h(putString, "Builder()\n              …ring(INPUT_DATA_URL, url)");
                OneTimeWorkRequest.Builder addTag = new OneTimeWorkRequest.Builder(DownloadApkWorker.class).addTag("downloadApkWorker");
                Data build = putString.build();
                AbstractC3255y.h(build, "builder.build()");
                WorkManager.getInstance(context).enqueue(addTag.setInputData(build).build());
                return true;
            }
            return false;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements DownloadWorker.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ S f31038a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ S f31039b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ DownloadApkWorker f31040c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f31041d;

        b(S s8, S s9, DownloadApkWorker downloadApkWorker, T t8) {
            this.f31038a = s8;
            this.f31039b = s9;
            this.f31040c = downloadApkWorker;
            this.f31041d = t8;
        }

        @Override // com.uptodown.workers.DownloadWorker.b
        public void a(int i8, long j8) {
            if (DownloadApkWorker.f31035l != null) {
                Data.Builder builder = new Data.Builder();
                builder.putInt("downloadProgress", i8);
                this.f31040c.setProgressAsync(builder.build());
                C1648o c1648o = DownloadApkWorker.f31035l;
                AbstractC3255y.f(c1648o);
                c1648o.F0(i8);
                C1648o c1648o2 = DownloadApkWorker.f31035l;
                AbstractC3255y.f(c1648o2);
                c1648o2.v0(j8);
                C3674n a8 = C3674n.f36505t.a(this.f31040c.s());
                a8.a();
                C1648o c1648o3 = DownloadApkWorker.f31035l;
                AbstractC3255y.f(c1648o3);
                a8.s1(c1648o3);
                a8.l();
                C3683w.f36547a.i(this.f31040c.s());
                if (!((File) this.f31041d.f34162a).exists()) {
                    DownloadWorker.f31052c.j(true);
                }
                DownloadApkWorker downloadApkWorker = this.f31040c;
                C1648o c1648o4 = DownloadApkWorker.f31035l;
                AbstractC3255y.f(c1648o4);
                downloadApkWorker.J(c1648o4, ComposerKt.providerKey);
            }
        }

        @Override // com.uptodown.workers.DownloadWorker.b
        public void b(long j8) {
            this.f31038a.f34161a = j8;
        }

        @Override // com.uptodown.workers.DownloadWorker.b
        public void c() {
            DownloadWorker.f31052c.j(true);
        }

        @Override // com.uptodown.workers.DownloadWorker.b
        public void d(long j8) {
            this.f31039b.f34161a = j8;
            Bundle bundle = new Bundle();
            bundle.putString("type", "first_data");
            DownloadApkWorker downloadApkWorker = this.f31040c;
            downloadApkWorker.z(bundle, downloadApkWorker.f31037j);
        }

        @Override // com.uptodown.workers.DownloadWorker.b
        public void e() {
            Bundle bundle = new Bundle();
            bundle.putString("type", "reconnected");
            DownloadApkWorker downloadApkWorker = this.f31040c;
            downloadApkWorker.z(bundle, downloadApkWorker.f31037j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadApkWorker(Context c8, WorkerParameters params) {
        super(c8, params);
        AbstractC3255y.i(c8, "c");
        AbstractC3255y.i(params, "params");
        w();
        DownloadWorker.a aVar = DownloadWorker.f31052c;
        aVar.j(false);
        aVar.l(false);
        int i8 = params.getInputData().getInt("downloadId", -1);
        if (i8 >= 0) {
            C3674n a8 = C3674n.f36505t.a(s());
            a8.a();
            f31035l = a8.g1(i8);
            a8.l();
        }
        this.f31036i = params.getInputData().getString("url");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.os.Bundle N(android.os.Bundle r7) {
        /*
            r6 = this;
            com.uptodown.UptodownApp$a r0 = com.uptodown.UptodownApp.f29058B
            a5.l r1 = r0.p()
            r2 = 1
            java.lang.String r3 = "deeplink"
            r4 = 0
            if (r1 == 0) goto L2a
            a5.o r1 = com.uptodown.workers.DownloadApkWorker.f31035l
            if (r1 == 0) goto L2a
            a5.l r0 = r0.p()
            kotlin.jvm.internal.AbstractC3255y.f(r0)
            int r0 = r0.b()
            a5.o r1 = com.uptodown.workers.DownloadApkWorker.f31035l
            kotlin.jvm.internal.AbstractC3255y.f(r1)
            int r1 = r1.y()
            if (r0 != r1) goto L2a
            r7.putInt(r3, r2)
            goto L2d
        L2a:
            r7.putInt(r3, r4)
        L2d:
            a5.x$a r0 = a5.x.f14348f
            android.content.Context r1 = r6.s()
            a5.x r0 = r0.b(r1)
            if (r0 == 0) goto L55
            a5.o r1 = com.uptodown.workers.DownloadApkWorker.f31035l
            java.lang.String r3 = "notification_fcm"
            if (r1 == 0) goto L52
            int r0 = r0.c()
            a5.o r1 = com.uptodown.workers.DownloadApkWorker.f31035l
            kotlin.jvm.internal.AbstractC3255y.f(r1)
            int r1 = r1.y()
            if (r0 != r1) goto L52
            r7.putInt(r3, r2)
            goto L55
        L52:
            r7.putInt(r3, r4)
        L55:
            a5.j$a r0 = a5.C1643j.f14251n
            android.content.Context r1 = r6.s()
            a5.j r0 = r0.d(r1)
            java.lang.String r1 = "adView"
            if (r0 == 0) goto L79
            a5.o r2 = com.uptodown.workers.DownloadApkWorker.f31035l
            if (r2 == 0) goto L79
            int r3 = r0.m()
            int r2 = r2.y()
            if (r3 != r2) goto L79
            java.lang.String r0 = r0.s()
            r7.putString(r1, r0)
            goto L9a
        L79:
            a5.u$a r0 = a5.C1653u.f14337n
            android.content.Context r2 = r6.s()
            a5.u r0 = r0.d(r2)
            if (r0 == 0) goto L9a
            a5.o r2 = com.uptodown.workers.DownloadApkWorker.f31035l
            if (r2 == 0) goto L9a
            int r3 = r0.m()
            int r2 = r2.y()
            if (r3 != r2) goto L9a
            java.lang.String r0 = r0.s()
            r7.putString(r1, r0)
        L9a:
            java.lang.String r0 = r6.f31037j
            if (r0 == 0) goto La3
            java.lang.String r1 = "host"
            r7.putString(r1, r0)
        La3:
            a5.o r0 = com.uptodown.workers.DownloadApkWorker.f31035l
            if (r0 == 0) goto Le4
            kotlin.jvm.internal.AbstractC3255y.f(r0)
            java.lang.String r0 = r0.w()
            if (r0 == 0) goto Lc1
            a5.o r0 = com.uptodown.workers.DownloadApkWorker.f31035l
            kotlin.jvm.internal.AbstractC3255y.f(r0)
            java.lang.String r0 = r0.w()
            kotlin.jvm.internal.AbstractC3255y.f(r0)
            java.lang.String r1 = "fileId"
            r7.putString(r1, r0)
        Lc1:
            a5.o r0 = com.uptodown.workers.DownloadApkWorker.f31035l
            kotlin.jvm.internal.AbstractC3255y.f(r0)
            long r0 = r0.a0()
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto Le4
            o5.s r0 = o5.C3679s.f36530a
            a5.o r1 = com.uptodown.workers.DownloadApkWorker.f31035l
            kotlin.jvm.internal.AbstractC3255y.f(r1)
            long r1 = r1.a0()
            java.lang.String r0 = r0.d(r1)
            java.lang.String r1 = "size"
            r7.putString(r1, r0)
        Le4:
            java.lang.String r0 = "update"
            r7.putInt(r0, r4)
            o5.s r0 = o5.C3679s.f36530a
            android.os.Bundle r7 = r0.a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.DownloadApkWorker.N(android.os.Bundle):android.os.Bundle");
    }

    private final void O() {
        C1648o c1648o;
        if (!C3680t.f36531a.d()) {
            C3655A.f36474a.f().send(209, null);
            return;
        }
        Iterator it = new C3671k().k(s()).iterator();
        while (true) {
            if (it.hasNext()) {
                c1648o = (C1648o) it.next();
                if (!c1648o.b(s()) && (SettingsPreferences.f30353b.c0(s()) || C3680t.f36531a.f() || c1648o.s() == 1)) {
                    break;
                }
            } else {
                c1648o = null;
                break;
            }
        }
        f31035l = null;
        if (c1648o != null) {
            DownloadWorker.a aVar = DownloadWorker.f31052c;
            aVar.j(false);
            aVar.h();
            f31035l = c1648o;
            AbstractC3255y.f(c1648o);
            if (c1648o.w() != null) {
                C1648o c1648o2 = f31035l;
                AbstractC3255y.f(c1648o2);
                String R8 = R(c1648o2);
                if (R8 != null) {
                    Q(R8);
                    O();
                }
            }
        }
    }

    private final void P(long j8) {
        if (f31035l != null) {
            C3674n a8 = C3674n.f36505t.a(s());
            a8.a();
            a8.A(f31035l);
            a8.l();
        }
        C3683w.f36547a.d(s());
        Bundle bundle = new Bundle();
        bundle.putString("type", "cancelled");
        if (j8 > 0) {
            bundle.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - j8) / 1000);
        }
        z(bundle, this.f31037j);
        U(f31035l);
    }

    private final void Q(String str) {
        long j8;
        this.f31037j = null;
        DownloadWorker.a aVar = DownloadWorker.f31052c;
        aVar.h();
        if (!C3680t.f36531a.d()) {
            C3655A.f36474a.f().send(209, null);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Bundle bundle = new Bundle();
        bundle.putString("type", "start");
        z(bundle, new URL(str).getHost());
        HttpsURLConnection I8 = DownloadWorker.I(this, str, currentTimeMillis, null, null, 12, null);
        if (I8 == null) {
            return;
        }
        this.f31037j = I8.getURL().getHost();
        String url = I8.getURL().toString();
        AbstractC3255y.h(url, "urlConnection.url.toString()");
        String u8 = u(url);
        if (n.S(u8, ".", 0, false, 6, null) < 0) {
            String url2 = I8.getURL().toString();
            AbstractC3255y.h(url2, "urlConnection.url.toString()");
            u8 = u8 + t(url2);
        }
        C1648o c1648o = f31035l;
        if (c1648o == null) {
            C1648o c1648o2 = new C1648o();
            f31035l = c1648o2;
            AbstractC3255y.f(c1648o2);
            c1648o2.D0(u8);
            C1648o c1648o3 = f31035l;
            AbstractC3255y.f(c1648o3);
            c1648o3.m0(s());
        } else {
            AbstractC3255y.f(c1648o);
            c1648o.D0(u8);
        }
        File f8 = new C3677q().f(s());
        if (!f8.exists() && !f8.mkdirs()) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("type", "fail");
            bundle2.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "cant_mkdir");
            p(" (106)", "download", bundle2, currentTimeMillis);
            return;
        }
        T t8 = new T();
        C1648o c1648o4 = f31035l;
        AbstractC3255y.f(c1648o4);
        String X7 = c1648o4.X();
        AbstractC3255y.f(X7);
        File file = new File(f8, X7);
        t8.f34162a = file;
        if (file.exists()) {
            j8 = ((File) t8.f34162a).length();
        } else {
            j8 = 0;
        }
        if (aVar.a()) {
            P(currentTimeMillis);
            return;
        }
        if (C(I8, currentTimeMillis)) {
            C1648o c1648o5 = f31035l;
            AbstractC3255y.f(c1648o5);
            if (new C3661a().c(new C3677q().k(s(), f8), c1648o5.a0() - ((File) t8.f34162a).length())) {
                C1648o c1648o6 = f31035l;
                AbstractC3255y.f(c1648o6);
                J(c1648o6, 200);
                C1648o c1648o7 = f31035l;
                AbstractC3255y.f(c1648o7);
                if (c1648o7.Y() != null) {
                    C3674n a8 = C3674n.f36505t.a(s());
                    a8.a();
                    C1648o c1648o8 = f31035l;
                    AbstractC3255y.f(c1648o8);
                    String Y7 = c1648o8.Y();
                    AbstractC3255y.f(Y7);
                    O u02 = a8.u0(Y7);
                    if (u02 != null) {
                        C1648o c1648o9 = f31035l;
                        AbstractC3255y.f(c1648o9);
                        u02.U(c1648o9.X());
                        a8.r1(u02);
                    }
                    a8.l();
                }
                S s8 = new S();
                S s9 = new S();
                b bVar = new b(s8, s9, this, t8);
                File file2 = (File) t8.f34162a;
                C1648o c1648o10 = f31035l;
                AbstractC3255y.f(c1648o10);
                String str2 = this.f31037j;
                AbstractC3255y.f(str2);
                long n8 = n(I8, file2, c1648o10, str2, currentTimeMillis, bVar);
                if (n8 < 0) {
                    return;
                }
                C3674n a9 = C3674n.f36505t.a(s());
                a9.a();
                File l8 = l((File) t8.f34162a, s());
                if (l8 != null) {
                    C1648o c1648o11 = f31035l;
                    AbstractC3255y.f(c1648o11);
                    c1648o11.D0(l8.getName());
                    C1648o c1648o12 = f31035l;
                    AbstractC3255y.f(c1648o12);
                    c1648o12.o0(l8.getAbsolutePath());
                    C1648o c1648o13 = f31035l;
                    AbstractC3255y.f(c1648o13);
                    a9.s1(c1648o13);
                    t8.f34162a = l8;
                }
                a9.l();
                if (aVar.a()) {
                    P(currentTimeMillis);
                    return;
                }
                C1648o c1648o14 = f31035l;
                AbstractC3255y.f(c1648o14);
                J(c1648o14, 205);
                File file3 = (File) t8.f34162a;
                C1648o c1648o15 = f31035l;
                AbstractC3255y.f(c1648o15);
                long a02 = c1648o15.a0();
                C1648o c1648o16 = f31035l;
                AbstractC3255y.f(c1648o16);
                String x8 = c1648o16.x();
                AbstractC3255y.f(x8);
                Bundle k8 = k(j8, n8, file3, a02, x8);
                if (k8 != null) {
                    C3661a c3661a = new C3661a();
                    Context s10 = s();
                    C1648o c1648o17 = f31035l;
                    AbstractC3255y.f(c1648o17);
                    c3661a.a(s10, c1648o17.X());
                    p(" (111)", "download", k8, currentTimeMillis);
                    return;
                }
                C1648o c1648o18 = f31035l;
                AbstractC3255y.f(c1648o18);
                J(c1648o18, ComposerKt.referenceKey);
                Bundle bundle3 = new Bundle();
                bundle3.putString("type", "completed");
                if (s8.f34161a == 0) {
                    long currentTimeMillis2 = (System.currentTimeMillis() - s9.f34161a) / 1000;
                    if (currentTimeMillis2 > 0) {
                        s8.f34161a = n8 / currentTimeMillis2;
                    }
                }
                bundle3.putLong("speed", s8.f34161a);
                bundle3.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - currentTimeMillis) / 1000);
                z(bundle3, this.f31037j);
                if (new J4.a(s()).m()) {
                    UptodownApp.a.Z(UptodownApp.f29058B, (File) t8.f34162a, s(), null, 4, null);
                }
                C1648o c1648o19 = f31035l;
                AbstractC3255y.f(c1648o19);
                J(c1648o19, ComposerKt.compositionLocalMapKey);
                C3683w.f36547a.d(s());
                return;
            }
            I8.disconnect();
            C3661a c3661a2 = new C3661a();
            Context s11 = s();
            C1648o c1648o20 = f31035l;
            AbstractC3255y.f(c1648o20);
            c3661a2.a(s11, c1648o20.X());
            Bundle bundle4 = new Bundle();
            bundle4.putString("type", "fail");
            bundle4.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "no_enough_space");
            p(" (112)", "download", bundle4, currentTimeMillis);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String R(a5.C1648o r10) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.DownloadApkWorker.R(a5.o):java.lang.String");
    }

    private final void S(String str, Bundle bundle) {
        p(str, "getUrlByFileId", bundle, 0L);
    }

    private final void T(C1648o c1648o, String str) {
        if (c1648o != null) {
            C3674n a8 = C3674n.f36505t.a(s());
            a8.a();
            c1648o.r0(c1648o.l() + 1);
            a8.A(c1648o);
            if (c1648o.l() >= 4) {
                new C3661a().a(s(), c1648o.X());
            } else {
                a8.F0(c1648o);
            }
            a8.l();
            V(c1648o);
        }
        C3683w.f36547a.t(s(), c1648o, str);
    }

    private final void U(C1648o c1648o) {
        Bundle bundle = new Bundle();
        if (c1648o != null) {
            bundle.putParcelable("download", c1648o);
        }
        C3655A.f36474a.f().send(ComposerKt.reuseKey, bundle);
    }

    private final void V(C1648o c1648o) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("download", c1648o);
        C3655A.f36474a.f().send(ComposerKt.providerValuesKey, bundle);
    }

    @Override // com.uptodown.workers.DownloadWorker
    public void G(String errorCode, String event, Bundle bundle, long j8, O o8, String str) {
        AbstractC3255y.i(errorCode, "errorCode");
        AbstractC3255y.i(event, "event");
        AbstractC3255y.i(bundle, "bundle");
        if (str != null) {
            this.f31037j = str;
        }
        T(f31035l, errorCode);
        if (j8 > 0) {
            bundle.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - j8) / 1000);
        }
        Bundle N8 = N(bundle);
        C3678r v8 = v();
        if (v8 != null) {
            v8.b(event, N8);
        }
    }

    @Override // com.uptodown.workers.DownloadWorker
    public void J(C1648o download, int i8) {
        AbstractC3255y.i(download, "download");
        Bundle bundle = new Bundle();
        bundle.putParcelable("download", download);
        C3655A.f36474a.f().send(i8, bundle);
    }

    @Override // com.uptodown.workers.DownloadWorker, androidx.work.Worker
    public ListenableWorker.Result doWork() {
        String str = this.f31036i;
        if (str != null) {
            AbstractC3255y.f(str);
            Q(str);
            O();
        } else {
            C1648o c1648o = f31035l;
            if (c1648o == null) {
                T(null, " (100)");
                C3678r v8 = v();
                if (v8 != null) {
                    v8.a("downloadworker_download_null");
                }
            } else {
                AbstractC3255y.f(c1648o);
                if (c1648o.w() == null) {
                    T(f31035l, " (103)");
                    Bundle bundle = new Bundle();
                    bundle.putString("type", "fileId_null");
                    C1648o c1648o2 = f31035l;
                    AbstractC3255y.f(c1648o2);
                    bundle.putString("packagename", c1648o2.Y());
                    C3678r v9 = v();
                    if (v9 != null) {
                        v9.b("getUrlByFileId", bundle);
                    }
                } else {
                    C1648o c1648o3 = f31035l;
                    AbstractC3255y.f(c1648o3);
                    String R8 = R(c1648o3);
                    if (R8 != null) {
                        Q(R8);
                        O();
                    }
                }
            }
        }
        C3655A.f36474a.f().send(210, null);
        ListenableWorker.Result success = ListenableWorker.Result.success();
        AbstractC3255y.h(success, "success()");
        return success;
    }

    @Override // com.uptodown.workers.DownloadWorker
    public void o() {
        P(0L);
    }

    @Override // com.uptodown.workers.DownloadWorker
    public void p(String errorCode, String event, Bundle bundle, long j8) {
        AbstractC3255y.i(errorCode, "errorCode");
        AbstractC3255y.i(event, "event");
        AbstractC3255y.i(bundle, "bundle");
        T(f31035l, errorCode);
        if (j8 > 0) {
            bundle.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - j8) / 1000);
        }
        Bundle N8 = N(bundle);
        C3678r v8 = v();
        if (v8 != null) {
            v8.b(event, N8);
        }
    }

    @Override // com.uptodown.workers.DownloadWorker
    public boolean x() {
        return DownloadWorker.f31052c.a();
    }

    @Override // com.uptodown.workers.DownloadWorker
    public void z(Bundle bundle, String str) {
        AbstractC3255y.i(bundle, "bundle");
        this.f31037j = str;
        Bundle N8 = N(bundle);
        C3678r v8 = v();
        if (v8 != null) {
            v8.b("download", N8);
        }
    }
}
