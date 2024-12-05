package com.uptodown.workers;

import X4.C1505o;
import X4.O;
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
import g6.n;
import java.io.File;
import java.net.URL;
import java.util.Iterator;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.S;
import kotlin.jvm.internal.T;
import l5.C3307A;
import l5.C3313a;
import l5.C3323k;
import l5.C3326n;
import l5.C3329q;
import l5.C3330r;
import l5.C3332t;
import l5.C3335w;

/* loaded from: classes5.dex */
public final class DownloadApkWorker extends DownloadWorker {

    /* renamed from: k, reason: collision with root package name */
    public static final a f30002k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    private static C1505o f30003l;

    /* renamed from: i, reason: collision with root package name */
    private String f30004i;

    /* renamed from: j, reason: collision with root package name */
    private String f30005j;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final void a(long j8) {
            DownloadWorker.f30020c.j(c(j8));
        }

        public final C1505o b() {
            return DownloadApkWorker.f30003l;
        }

        public final boolean c(long j8) {
            if (DownloadApkWorker.f30003l != null) {
                C1505o c1505o = DownloadApkWorker.f30003l;
                AbstractC3159y.f(c1505o);
                if (c1505o.f() == j8) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(long j8, long j9) {
            if (DownloadApkWorker.f30003l != null) {
                C1505o c1505o = DownloadApkWorker.f30003l;
                AbstractC3159y.f(c1505o);
                if (c1505o.f() == j8) {
                    C1505o c1505o2 = DownloadApkWorker.f30003l;
                    AbstractC3159y.f(c1505o2);
                    if (c1505o2.e0() == j9) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final boolean e(C1505o d8) {
            AbstractC3159y.i(d8, "d");
            if (DownloadApkWorker.f30003l != null) {
                C1505o c1505o = DownloadApkWorker.f30003l;
                AbstractC3159y.f(c1505o);
                if (c1505o.u() != null) {
                    C1505o c1505o2 = DownloadApkWorker.f30003l;
                    AbstractC3159y.f(c1505o2);
                    if (n.s(c1505o2.u(), d8.u(), true)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final boolean f(Context context, int i8) {
            AbstractC3159y.i(context, "context");
            if (!UptodownApp.f28003B.W("downloadApkWorker", context)) {
                Data.Builder putInt = new Data.Builder().putInt("downloadId", i8);
                AbstractC3159y.h(putInt, "Builder()\n              …_DOWNLOAD_ID, downloadId)");
                OneTimeWorkRequest.Builder addTag = new OneTimeWorkRequest.Builder(DownloadApkWorker.class).addTag("downloadApkWorker");
                Data build = putInt.build();
                AbstractC3159y.h(build, "builder.build()");
                WorkManager.getInstance(context).enqueue(addTag.setInputData(build).build());
                return true;
            }
            return false;
        }

        public final boolean g(Context context, String url) {
            AbstractC3159y.i(context, "context");
            AbstractC3159y.i(url, "url");
            if (!UptodownApp.f28003B.W("downloadApkWorker", context)) {
                Data.Builder putString = new Data.Builder().putString("url", url);
                AbstractC3159y.h(putString, "Builder()\n              …ring(INPUT_DATA_URL, url)");
                OneTimeWorkRequest.Builder addTag = new OneTimeWorkRequest.Builder(DownloadApkWorker.class).addTag("downloadApkWorker");
                Data build = putString.build();
                AbstractC3159y.h(build, "builder.build()");
                WorkManager.getInstance(context).enqueue(addTag.setInputData(build).build());
                return true;
            }
            return false;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements DownloadWorker.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ S f30006a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ S f30007b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ DownloadApkWorker f30008c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f30009d;

        b(S s8, S s9, DownloadApkWorker downloadApkWorker, T t8) {
            this.f30006a = s8;
            this.f30007b = s9;
            this.f30008c = downloadApkWorker;
            this.f30009d = t8;
        }

        @Override // com.uptodown.workers.DownloadWorker.b
        public void a(int i8, long j8) {
            if (DownloadApkWorker.f30003l != null) {
                Data.Builder builder = new Data.Builder();
                builder.putInt("downloadProgress", i8);
                this.f30008c.setProgressAsync(builder.build());
                C1505o c1505o = DownloadApkWorker.f30003l;
                AbstractC3159y.f(c1505o);
                c1505o.F0(i8);
                C1505o c1505o2 = DownloadApkWorker.f30003l;
                AbstractC3159y.f(c1505o2);
                c1505o2.v0(j8);
                C3326n a8 = C3326n.f34504t.a(this.f30008c.s());
                a8.a();
                C1505o c1505o3 = DownloadApkWorker.f30003l;
                AbstractC3159y.f(c1505o3);
                a8.s1(c1505o3);
                a8.g();
                C3335w.f34546a.i(this.f30008c.s());
                if (!((File) this.f30009d.f33761a).exists()) {
                    DownloadWorker.f30020c.j(true);
                }
                DownloadApkWorker downloadApkWorker = this.f30008c;
                C1505o c1505o4 = DownloadApkWorker.f30003l;
                AbstractC3159y.f(c1505o4);
                downloadApkWorker.J(c1505o4, ComposerKt.providerKey);
            }
        }

        @Override // com.uptodown.workers.DownloadWorker.b
        public void b(long j8) {
            this.f30006a.f33760a = j8;
        }

        @Override // com.uptodown.workers.DownloadWorker.b
        public void c() {
            DownloadWorker.f30020c.j(true);
        }

        @Override // com.uptodown.workers.DownloadWorker.b
        public void d(long j8) {
            this.f30007b.f33760a = j8;
            Bundle bundle = new Bundle();
            bundle.putString("type", "first_data");
            DownloadApkWorker downloadApkWorker = this.f30008c;
            downloadApkWorker.z(bundle, downloadApkWorker.f30005j);
        }

        @Override // com.uptodown.workers.DownloadWorker.b
        public void e() {
            Bundle bundle = new Bundle();
            bundle.putString("type", "reconnected");
            DownloadApkWorker downloadApkWorker = this.f30008c;
            downloadApkWorker.z(bundle, downloadApkWorker.f30005j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadApkWorker(Context c8, WorkerParameters params) {
        super(c8, params);
        AbstractC3159y.i(c8, "c");
        AbstractC3159y.i(params, "params");
        w();
        DownloadWorker.a aVar = DownloadWorker.f30020c;
        aVar.j(false);
        aVar.l(false);
        int i8 = params.getInputData().getInt("downloadId", -1);
        if (i8 >= 0) {
            C3326n a8 = C3326n.f34504t.a(s());
            a8.a();
            f30003l = a8.g1(i8);
            a8.g();
        }
        this.f30004i = params.getInputData().getString("url");
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
            com.uptodown.UptodownApp$a r0 = com.uptodown.UptodownApp.f28003B
            X4.l r1 = r0.p()
            r2 = 1
            java.lang.String r3 = "deeplink"
            r4 = 0
            if (r1 == 0) goto L2a
            X4.o r1 = com.uptodown.workers.DownloadApkWorker.f30003l
            if (r1 == 0) goto L2a
            X4.l r0 = r0.p()
            kotlin.jvm.internal.AbstractC3159y.f(r0)
            int r0 = r0.b()
            X4.o r1 = com.uptodown.workers.DownloadApkWorker.f30003l
            kotlin.jvm.internal.AbstractC3159y.f(r1)
            int r1 = r1.G()
            if (r0 != r1) goto L2a
            r7.putInt(r3, r2)
            goto L2d
        L2a:
            r7.putInt(r3, r4)
        L2d:
            X4.x$a r0 = X4.x.f12727f
            android.content.Context r1 = r6.s()
            X4.x r0 = r0.b(r1)
            if (r0 == 0) goto L55
            X4.o r1 = com.uptodown.workers.DownloadApkWorker.f30003l
            java.lang.String r3 = "notification_fcm"
            if (r1 == 0) goto L52
            int r0 = r0.c()
            X4.o r1 = com.uptodown.workers.DownloadApkWorker.f30003l
            kotlin.jvm.internal.AbstractC3159y.f(r1)
            int r1 = r1.G()
            if (r0 != r1) goto L52
            r7.putInt(r3, r2)
            goto L55
        L52:
            r7.putInt(r3, r4)
        L55:
            X4.j$a r0 = X4.C1500j.f12630n
            android.content.Context r1 = r6.s()
            X4.j r0 = r0.d(r1)
            java.lang.String r1 = "adView"
            if (r0 == 0) goto L79
            X4.o r2 = com.uptodown.workers.DownloadApkWorker.f30003l
            if (r2 == 0) goto L79
            int r3 = r0.m()
            int r2 = r2.G()
            if (r3 != r2) goto L79
            java.lang.String r0 = r0.s()
            r7.putString(r1, r0)
            goto L9a
        L79:
            X4.u$a r0 = X4.C1510u.f12716n
            android.content.Context r2 = r6.s()
            X4.u r0 = r0.d(r2)
            if (r0 == 0) goto L9a
            X4.o r2 = com.uptodown.workers.DownloadApkWorker.f30003l
            if (r2 == 0) goto L9a
            int r3 = r0.m()
            int r2 = r2.G()
            if (r3 != r2) goto L9a
            java.lang.String r0 = r0.s()
            r7.putString(r1, r0)
        L9a:
            java.lang.String r0 = r6.f30005j
            if (r0 == 0) goto La3
            java.lang.String r1 = "host"
            r7.putString(r1, r0)
        La3:
            X4.o r0 = com.uptodown.workers.DownloadApkWorker.f30003l
            if (r0 == 0) goto Le4
            kotlin.jvm.internal.AbstractC3159y.f(r0)
            java.lang.String r0 = r0.u()
            if (r0 == 0) goto Lc1
            X4.o r0 = com.uptodown.workers.DownloadApkWorker.f30003l
            kotlin.jvm.internal.AbstractC3159y.f(r0)
            java.lang.String r0 = r0.u()
            kotlin.jvm.internal.AbstractC3159y.f(r0)
            java.lang.String r1 = "fileId"
            r7.putString(r1, r0)
        Lc1:
            X4.o r0 = com.uptodown.workers.DownloadApkWorker.f30003l
            kotlin.jvm.internal.AbstractC3159y.f(r0)
            long r0 = r0.a0()
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto Le4
            l5.s r0 = l5.C3331s.f34529a
            X4.o r1 = com.uptodown.workers.DownloadApkWorker.f30003l
            kotlin.jvm.internal.AbstractC3159y.f(r1)
            long r1 = r1.a0()
            java.lang.String r0 = r0.d(r1)
            java.lang.String r1 = "size"
            r7.putString(r1, r0)
        Le4:
            java.lang.String r0 = "update"
            r7.putInt(r0, r4)
            l5.s r0 = l5.C3331s.f34529a
            android.os.Bundle r7 = r0.a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.DownloadApkWorker.N(android.os.Bundle):android.os.Bundle");
    }

    private final void O() {
        C1505o c1505o;
        if (!C3332t.f34530a.d()) {
            C3307A.f34473a.f().send(209, null);
            return;
        }
        Iterator it = new C3323k().k(s()).iterator();
        while (true) {
            if (it.hasNext()) {
                c1505o = (C1505o) it.next();
                if (!c1505o.c(s()) && (SettingsPreferences.f29323b.c0(s()) || C3332t.f34530a.f() || c1505o.n() == 1)) {
                    break;
                }
            } else {
                c1505o = null;
                break;
            }
        }
        f30003l = null;
        if (c1505o != null) {
            DownloadWorker.a aVar = DownloadWorker.f30020c;
            aVar.j(false);
            aVar.h();
            f30003l = c1505o;
            AbstractC3159y.f(c1505o);
            if (c1505o.u() != null) {
                C1505o c1505o2 = f30003l;
                AbstractC3159y.f(c1505o2);
                String R8 = R(c1505o2);
                if (R8 != null) {
                    Q(R8);
                    O();
                }
            }
        }
    }

    private final void P(long j8) {
        if (f30003l != null) {
            C3326n a8 = C3326n.f34504t.a(s());
            a8.a();
            a8.x(f30003l);
            a8.g();
        }
        C3335w.f34546a.d(s());
        Bundle bundle = new Bundle();
        bundle.putString("type", "cancelled");
        if (j8 > 0) {
            bundle.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - j8) / 1000);
        }
        z(bundle, this.f30005j);
        U(f30003l);
    }

    private final void Q(String str) {
        long j8;
        this.f30005j = null;
        DownloadWorker.a aVar = DownloadWorker.f30020c;
        aVar.h();
        if (!C3332t.f34530a.d()) {
            C3307A.f34473a.f().send(209, null);
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
        this.f30005j = I8.getURL().getHost();
        String url = I8.getURL().toString();
        AbstractC3159y.h(url, "urlConnection.url.toString()");
        String u8 = u(url);
        if (n.S(u8, ".", 0, false, 6, null) < 0) {
            String url2 = I8.getURL().toString();
            AbstractC3159y.h(url2, "urlConnection.url.toString()");
            u8 = u8 + t(url2);
        }
        C1505o c1505o = f30003l;
        if (c1505o == null) {
            C1505o c1505o2 = new C1505o();
            f30003l = c1505o2;
            AbstractC3159y.f(c1505o2);
            c1505o2.D0(u8);
            C1505o c1505o3 = f30003l;
            AbstractC3159y.f(c1505o3);
            c1505o3.m0(s());
        } else {
            AbstractC3159y.f(c1505o);
            c1505o.D0(u8);
        }
        File f8 = new C3329q().f(s());
        if (!f8.exists() && !f8.mkdirs()) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("type", "fail");
            bundle2.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "cant_mkdir");
            p(" (106)", "download", bundle2, currentTimeMillis);
            return;
        }
        T t8 = new T();
        C1505o c1505o4 = f30003l;
        AbstractC3159y.f(c1505o4);
        String X7 = c1505o4.X();
        AbstractC3159y.f(X7);
        File file = new File(f8, X7);
        t8.f33761a = file;
        if (file.exists()) {
            j8 = ((File) t8.f33761a).length();
        } else {
            j8 = 0;
        }
        if (aVar.a()) {
            P(currentTimeMillis);
            return;
        }
        if (C(I8, currentTimeMillis)) {
            C1505o c1505o5 = f30003l;
            AbstractC3159y.f(c1505o5);
            if (new C3313a().c(new C3329q().k(s(), f8), c1505o5.a0() - ((File) t8.f33761a).length())) {
                C1505o c1505o6 = f30003l;
                AbstractC3159y.f(c1505o6);
                J(c1505o6, 200);
                C1505o c1505o7 = f30003l;
                AbstractC3159y.f(c1505o7);
                if (c1505o7.Y() != null) {
                    C3326n a8 = C3326n.f34504t.a(s());
                    a8.a();
                    C1505o c1505o8 = f30003l;
                    AbstractC3159y.f(c1505o8);
                    String Y7 = c1505o8.Y();
                    AbstractC3159y.f(Y7);
                    O u02 = a8.u0(Y7);
                    if (u02 != null) {
                        C1505o c1505o9 = f30003l;
                        AbstractC3159y.f(c1505o9);
                        u02.T(c1505o9.X());
                        a8.r1(u02);
                    }
                    a8.g();
                }
                S s8 = new S();
                S s9 = new S();
                b bVar = new b(s8, s9, this, t8);
                File file2 = (File) t8.f33761a;
                C1505o c1505o10 = f30003l;
                AbstractC3159y.f(c1505o10);
                String str2 = this.f30005j;
                AbstractC3159y.f(str2);
                long n8 = n(I8, file2, c1505o10, str2, currentTimeMillis, bVar);
                if (n8 < 0) {
                    return;
                }
                C3326n a9 = C3326n.f34504t.a(s());
                a9.a();
                File l8 = l((File) t8.f33761a, s());
                if (l8 != null) {
                    C1505o c1505o11 = f30003l;
                    AbstractC3159y.f(c1505o11);
                    c1505o11.D0(l8.getName());
                    C1505o c1505o12 = f30003l;
                    AbstractC3159y.f(c1505o12);
                    c1505o12.o0(l8.getAbsolutePath());
                    C1505o c1505o13 = f30003l;
                    AbstractC3159y.f(c1505o13);
                    a9.s1(c1505o13);
                    t8.f33761a = l8;
                }
                a9.g();
                if (aVar.a()) {
                    P(currentTimeMillis);
                    return;
                }
                C1505o c1505o14 = f30003l;
                AbstractC3159y.f(c1505o14);
                J(c1505o14, 205);
                File file3 = (File) t8.f33761a;
                C1505o c1505o15 = f30003l;
                AbstractC3159y.f(c1505o15);
                long a02 = c1505o15.a0();
                C1505o c1505o16 = f30003l;
                AbstractC3159y.f(c1505o16);
                String z8 = c1505o16.z();
                AbstractC3159y.f(z8);
                Bundle k8 = k(j8, n8, file3, a02, z8);
                if (k8 != null) {
                    C3313a c3313a = new C3313a();
                    Context s10 = s();
                    C1505o c1505o17 = f30003l;
                    AbstractC3159y.f(c1505o17);
                    c3313a.a(s10, c1505o17.X());
                    p(" (111)", "download", k8, currentTimeMillis);
                    return;
                }
                C1505o c1505o18 = f30003l;
                AbstractC3159y.f(c1505o18);
                J(c1505o18, ComposerKt.referenceKey);
                Bundle bundle3 = new Bundle();
                bundle3.putString("type", "completed");
                if (s8.f33760a == 0) {
                    long currentTimeMillis2 = (System.currentTimeMillis() - s9.f33760a) / 1000;
                    if (currentTimeMillis2 > 0) {
                        s8.f33760a = n8 / currentTimeMillis2;
                    }
                }
                bundle3.putLong("speed", s8.f33760a);
                bundle3.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - currentTimeMillis) / 1000);
                z(bundle3, this.f30005j);
                if (new G4.a(s()).m()) {
                    UptodownApp.a.Z(UptodownApp.f28003B, (File) t8.f33761a, s(), null, 4, null);
                }
                C1505o c1505o19 = f30003l;
                AbstractC3159y.f(c1505o19);
                J(c1505o19, ComposerKt.compositionLocalMapKey);
                C3335w.f34546a.d(s());
                return;
            }
            I8.disconnect();
            C3313a c3313a2 = new C3313a();
            Context s11 = s();
            C1505o c1505o20 = f30003l;
            AbstractC3159y.f(c1505o20);
            c3313a2.a(s11, c1505o20.X());
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
    private final java.lang.String R(X4.C1505o r10) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.DownloadApkWorker.R(X4.o):java.lang.String");
    }

    private final void S(String str, Bundle bundle) {
        p(str, "getUrlByFileId", bundle, 0L);
    }

    private final void T(C1505o c1505o, String str) {
        if (c1505o != null) {
            C3326n a8 = C3326n.f34504t.a(s());
            a8.a();
            c1505o.r0(c1505o.j() + 1);
            a8.x(c1505o);
            if (c1505o.j() >= 4) {
                new C3313a().a(s(), c1505o.X());
            } else {
                a8.F0(c1505o);
            }
            a8.g();
            V(c1505o);
        }
        C3335w.f34546a.t(s(), c1505o, str);
    }

    private final void U(C1505o c1505o) {
        Bundle bundle = new Bundle();
        if (c1505o != null) {
            bundle.putParcelable("download", c1505o);
        }
        C3307A.f34473a.f().send(ComposerKt.reuseKey, bundle);
    }

    private final void V(C1505o c1505o) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("download", c1505o);
        C3307A.f34473a.f().send(ComposerKt.providerValuesKey, bundle);
    }

    @Override // com.uptodown.workers.DownloadWorker
    public void G(String errorCode, String event, Bundle bundle, long j8, O o8, String str) {
        AbstractC3159y.i(errorCode, "errorCode");
        AbstractC3159y.i(event, "event");
        AbstractC3159y.i(bundle, "bundle");
        if (str != null) {
            this.f30005j = str;
        }
        T(f30003l, errorCode);
        if (j8 > 0) {
            bundle.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - j8) / 1000);
        }
        Bundle N8 = N(bundle);
        C3330r v8 = v();
        if (v8 != null) {
            v8.b(event, N8);
        }
    }

    @Override // com.uptodown.workers.DownloadWorker
    public void J(C1505o download, int i8) {
        AbstractC3159y.i(download, "download");
        Bundle bundle = new Bundle();
        bundle.putParcelable("download", download);
        C3307A.f34473a.f().send(i8, bundle);
    }

    @Override // com.uptodown.workers.DownloadWorker, androidx.work.Worker
    public ListenableWorker.Result doWork() {
        String str = this.f30004i;
        if (str != null) {
            AbstractC3159y.f(str);
            Q(str);
            O();
        } else {
            C1505o c1505o = f30003l;
            if (c1505o == null) {
                T(null, " (100)");
                C3330r v8 = v();
                if (v8 != null) {
                    v8.a("downloadworker_download_null");
                }
            } else {
                AbstractC3159y.f(c1505o);
                if (c1505o.u() == null) {
                    T(f30003l, " (103)");
                    Bundle bundle = new Bundle();
                    bundle.putString("type", "fileId_null");
                    C1505o c1505o2 = f30003l;
                    AbstractC3159y.f(c1505o2);
                    bundle.putString("packagename", c1505o2.Y());
                    C3330r v9 = v();
                    if (v9 != null) {
                        v9.b("getUrlByFileId", bundle);
                    }
                } else {
                    C1505o c1505o3 = f30003l;
                    AbstractC3159y.f(c1505o3);
                    String R8 = R(c1505o3);
                    if (R8 != null) {
                        Q(R8);
                        O();
                    }
                }
            }
        }
        C3307A.f34473a.f().send(210, null);
        ListenableWorker.Result success = ListenableWorker.Result.success();
        AbstractC3159y.h(success, "success()");
        return success;
    }

    @Override // com.uptodown.workers.DownloadWorker
    public void o() {
        P(0L);
    }

    @Override // com.uptodown.workers.DownloadWorker
    public void p(String errorCode, String event, Bundle bundle, long j8) {
        AbstractC3159y.i(errorCode, "errorCode");
        AbstractC3159y.i(event, "event");
        AbstractC3159y.i(bundle, "bundle");
        T(f30003l, errorCode);
        if (j8 > 0) {
            bundle.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - j8) / 1000);
        }
        Bundle N8 = N(bundle);
        C3330r v8 = v();
        if (v8 != null) {
            v8.b(event, N8);
        }
    }

    @Override // com.uptodown.workers.DownloadWorker
    public boolean x() {
        return DownloadWorker.f30020c.a();
    }

    @Override // com.uptodown.workers.DownloadWorker
    public void z(Bundle bundle, String str) {
        AbstractC3159y.i(bundle, "bundle");
        this.f30005j = str;
        Bundle N8 = N(bundle);
        C3330r v8 = v();
        if (v8 != null) {
            v8.b("download", N8);
        }
    }
}
