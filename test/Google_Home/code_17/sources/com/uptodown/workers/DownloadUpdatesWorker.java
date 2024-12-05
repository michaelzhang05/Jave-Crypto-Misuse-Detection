package com.uptodown.workers;

import Q4.h;
import a5.C1635b;
import a5.C1639f;
import a5.C1645l;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.uptodown.UptodownApp;
import com.uptodown.activities.Updates;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.workers.DownloadWorker;
import j6.n;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.S;
import o5.C3655A;
import o5.C3661a;
import o5.C3671k;
import o5.C3674n;
import o5.C3677q;
import o5.C3678r;
import o5.C3679s;
import o5.C3680t;
import o5.C3683w;

/* loaded from: classes5.dex */
public final class DownloadUpdatesWorker extends DownloadWorker {

    /* renamed from: k, reason: collision with root package name */
    public static final a f31042k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    private static String f31043l;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f31044i;

    /* renamed from: j, reason: collision with root package name */
    private final int f31045j;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final void a(String packagename) {
            AbstractC3255y.i(packagename, "packagename");
            DownloadUpdatesWorker.f31043l = packagename;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements DownloadWorker.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ O f31046a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ S f31047b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ S f31048c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ DownloadUpdatesWorker f31049d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ a5.O f31050e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f31051f;

        b(O o8, S s8, S s9, DownloadUpdatesWorker downloadUpdatesWorker, a5.O o9, String str) {
            this.f31046a = o8;
            this.f31047b = s8;
            this.f31048c = s9;
            this.f31049d = downloadUpdatesWorker;
            this.f31050e = o9;
            this.f31051f = str;
        }

        @Override // com.uptodown.workers.DownloadWorker.b
        public void a(int i8, long j8) {
            this.f31050e.X(i8);
            C3674n.a aVar = C3674n.f36505t;
            Context applicationContext = this.f31049d.getApplicationContext();
            AbstractC3255y.h(applicationContext, "applicationContext");
            C3674n a8 = aVar.a(applicationContext);
            a8.a();
            a8.r1(this.f31050e);
            a8.l();
            if (i8 > 0) {
                Bundle bundle = new Bundle();
                bundle.putString("packagename", this.f31050e.s());
                C3655A.f36474a.g().send(101, bundle);
            }
        }

        @Override // com.uptodown.workers.DownloadWorker.b
        public void b(long j8) {
            this.f31047b.f34161a = j8;
        }

        @Override // com.uptodown.workers.DownloadWorker.b
        public void c() {
            this.f31046a.f34158a = true;
        }

        @Override // com.uptodown.workers.DownloadWorker.b
        public void d(long j8) {
            this.f31048c.f34161a = j8;
            Bundle bundle = new Bundle();
            bundle.putString("type", "first_data");
            this.f31049d.A(this.f31050e, bundle, this.f31051f);
        }

        @Override // com.uptodown.workers.DownloadWorker.b
        public void e() {
            Bundle bundle = new Bundle();
            bundle.putString("type", "reconnected");
            this.f31049d.A(this.f31050e, bundle, this.f31051f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadUpdatesWorker(Context c8, WorkerParameters params) {
        super(c8, params);
        AbstractC3255y.i(c8, "c");
        AbstractC3255y.i(params, "params");
        this.f31044i = params.getInputData().getBoolean("downloadAnyway", false);
        this.f31045j = params.getInputData().getInt("downloadAutostartedInBackground", 0);
        DownloadWorker.a aVar = DownloadWorker.f31052c;
        aVar.k(false);
        aVar.m(false);
        aVar.n(false);
        w();
    }

    private final Bundle M(Bundle bundle, a5.O o8, String str) {
        if (str != null) {
            bundle.putString("host", str);
        }
        if (o8 != null) {
            if (o8.b() != null) {
                String b8 = o8.b();
                AbstractC3255y.f(b8);
                bundle.putString("fileId", b8);
            }
            if (o8.v() > 0) {
                bundle.putString("size", C3679s.f36530a.d(o8.v()));
            }
            UptodownApp.a aVar = UptodownApp.f29058B;
            if (aVar.p() != null) {
                C1645l p8 = aVar.p();
                AbstractC3255y.f(p8);
                if (AbstractC3255y.d(p8.d(), o8.s())) {
                    bundle.putInt("deeplink", 1);
                }
            }
            bundle.putInt("deeplink", 0);
        }
        Bundle a8 = C3679s.f36530a.a(bundle);
        a8.putInt("update", 1);
        a8.putInt("notification_fcm", 0);
        return a8;
    }

    private final void N(String str, a5.O o8) {
        File file;
        String str2;
        O o9 = new O();
        long currentTimeMillis = System.currentTimeMillis();
        Bundle bundle = new Bundle();
        bundle.putString("packagename", o8.s());
        C3655A c3655a = C3655A.f36474a;
        c3655a.g().send(109, bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putString("type", "start");
        A(o8, bundle2, new URL(str).getHost());
        HttpsURLConnection I8 = DownloadWorker.I(this, str, currentTimeMillis, o8, null, 8, null);
        if (I8 == null) {
            return;
        }
        String host = I8.getURL().getHost();
        String url = I8.getURL().toString();
        AbstractC3255y.h(url, "urlConnection.url.toString()");
        String t8 = t(url);
        StringBuilder sb = new StringBuilder();
        sb.append(o8.s());
        sb.append('_');
        String b8 = o8.b();
        AbstractC3255y.f(b8);
        sb.append(b8);
        sb.append('.');
        sb.append(t8);
        o8.U(sb.toString());
        C3677q c3677q = new C3677q();
        Context applicationContext = getApplicationContext();
        AbstractC3255y.h(applicationContext, "applicationContext");
        File g8 = c3677q.g(applicationContext);
        if (!g8.exists() && !g8.mkdirs()) {
            Bundle bundle3 = new Bundle();
            bundle3.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "cant_mkdir");
            B(o8, bundle3, host, currentTimeMillis);
            return;
        }
        String l8 = o8.l();
        AbstractC3255y.f(l8);
        File file2 = new File(g8, l8);
        long length = file2.exists() ? file2.length() : 0L;
        if (D(I8, o8, currentTimeMillis)) {
            if (new C3661a().c(new C3677q().k(s(), g8), o8.v() - length)) {
                S s8 = new S();
                S s9 = new S();
                b bVar = new b(o9, s8, s9, this, o8, host);
                AbstractC3255y.h(host, "host");
                long q8 = q(I8, file2, o8, host, currentTimeMillis, bVar);
                if (q8 < 0) {
                    return;
                }
                File l9 = l(file2, s());
                if (l9 != null) {
                    o8.U(l9.getName());
                    C3674n a8 = C3674n.f36505t.a(s());
                    a8.a();
                    a8.r1(o8);
                    a8.l();
                    file = l9;
                } else {
                    file = file2;
                }
                if (!o9.f34158a) {
                    DownloadWorker.a aVar = DownloadWorker.f31052c;
                    if (!aVar.b()) {
                        long v8 = o8.v();
                        String g9 = o8.g();
                        AbstractC3255y.f(g9);
                        File file3 = file;
                        Bundle k8 = k(length, q8, file, v8, g9);
                        if (k8 != null) {
                            C3661a c3661a = new C3661a();
                            Context applicationContext2 = getApplicationContext();
                            AbstractC3255y.h(applicationContext2, "applicationContext");
                            c3661a.b(applicationContext2, o8.l());
                            if (o8.u() > 0) {
                                o8.X(0);
                                C3674n.a aVar2 = C3674n.f36505t;
                                Context applicationContext3 = getApplicationContext();
                                AbstractC3255y.h(applicationContext3, "applicationContext");
                                C3674n a9 = aVar2.a(applicationContext3);
                                a9.a();
                                a9.r1(o8);
                                a9.l();
                            }
                            Bundle bundle4 = new Bundle();
                            str2 = "packagename";
                            bundle4.putString(str2, o8.s());
                            c3655a.g().send(102, bundle4);
                            B(o8, k8, host, currentTimeMillis);
                        } else {
                            str2 = "packagename";
                            Bundle bundle5 = new Bundle();
                            bundle5.putString(str2, o8.s());
                            c3655a.g().send(100, bundle5);
                        }
                        if (n.s(o8.s(), s().getPackageName(), true)) {
                            UptodownApp.a aVar3 = UptodownApp.f29058B;
                            if (aVar3.Q() && c3655a.d().size() > 0 && this.f31045j == 1) {
                                Object obj = c3655a.d().get(c3655a.d().size() - 1);
                                AbstractC3255y.h(obj, "StaticResources.activity….activity_stack.size - 1]");
                                if (((Activity) obj) instanceof Updates) {
                                    aVar.k(true);
                                }
                            }
                            if (Build.VERSION.SDK_INT >= 31 && !aVar3.Q()) {
                                h.u(new h(s(), null), file3, false, 2, null);
                                aVar.k(true);
                            } else {
                                try {
                                    C3683w.f36547a.v(s(), new C3671k().t(file3, s()));
                                } catch (Exception e8) {
                                    e8.printStackTrace();
                                }
                            }
                        } else {
                            InstallUpdatesWorker.f31075b.b(s());
                        }
                        Bundle bundle6 = new Bundle();
                        bundle6.putString(str2, o8.s());
                        C3655A.f36474a.g().send(108, bundle6);
                        Bundle bundle7 = new Bundle();
                        if (s8.f34161a == 0) {
                            long currentTimeMillis2 = (System.currentTimeMillis() - s9.f34161a) / 1000;
                            if (currentTimeMillis2 > 0) {
                                s8.f34161a = q8 / currentTimeMillis2;
                            }
                        }
                        bundle7.putLong("speed", s8.f34161a);
                        bundle7.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - currentTimeMillis) / 1000);
                        bundle7.putString("type", "completed");
                        A(o8, bundle7, host);
                        if (UptodownApp.f29058B.Q()) {
                            return;
                        }
                        C1635b c1635b = new C1635b();
                        C3674n.a aVar4 = C3674n.f36505t;
                        Context applicationContext4 = getApplicationContext();
                        AbstractC3255y.h(applicationContext4, "applicationContext");
                        C3674n a10 = aVar4.a(applicationContext4);
                        a10.a();
                        C1639f S8 = a10.S(o8.s());
                        if (S8 != null) {
                            c1635b.j(S8, o8, a10);
                        }
                        a10.l();
                        return;
                    }
                }
                if (DownloadWorker.f31052c.e()) {
                    return;
                }
                C3661a c3661a2 = new C3661a();
                Context applicationContext5 = getApplicationContext();
                AbstractC3255y.h(applicationContext5, "applicationContext");
                c3661a2.b(applicationContext5, o8.l());
                if (o8.u() > 0) {
                    o8.X(0);
                    C3674n.a aVar5 = C3674n.f36505t;
                    Context applicationContext6 = getApplicationContext();
                    AbstractC3255y.h(applicationContext6, "applicationContext");
                    C3674n a11 = aVar5.a(applicationContext6);
                    a11.a();
                    a11.r1(o8);
                    a11.l();
                }
                Bundle bundle8 = new Bundle();
                bundle8.putString("packagename", o8.s());
                c3655a.g().send(106, bundle8);
                P(o8, host, currentTimeMillis);
                return;
            }
            I8.disconnect();
            C3661a c3661a3 = new C3661a();
            Context applicationContext7 = getApplicationContext();
            AbstractC3255y.h(applicationContext7, "applicationContext");
            c3661a3.b(applicationContext7, o8.l());
            C3677q c3677q2 = new C3677q();
            Context applicationContext8 = getApplicationContext();
            AbstractC3255y.h(applicationContext8, "applicationContext");
            c3677q2.c(applicationContext8);
            o8.X(0);
            c3655a.g().send(104, null);
            Bundle bundle9 = new Bundle();
            bundle9.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "no_enough_space");
            B(o8, bundle9, host, currentTimeMillis);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void O() {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.DownloadUpdatesWorker.O():void");
    }

    private final void P(a5.O o8, String str, long j8) {
        f31043l = null;
        Bundle bundle = new Bundle();
        bundle.putString("type", "cancelled");
        if (j8 > 0) {
            bundle.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - j8) / 1000);
        }
        A(o8, bundle, str);
    }

    @Override // com.uptodown.workers.DownloadWorker
    public void A(a5.O update, Bundle bundle, String str) {
        AbstractC3255y.i(update, "update");
        AbstractC3255y.i(bundle, "bundle");
        Bundle M8 = M(bundle, update, str);
        C3678r v8 = v();
        if (v8 != null) {
            v8.b("download", M8);
        }
    }

    @Override // com.uptodown.workers.DownloadWorker
    public void B(a5.O update, Bundle bundleParamsFail, String str, long j8) {
        AbstractC3255y.i(update, "update");
        AbstractC3255y.i(bundleParamsFail, "bundleParamsFail");
        bundleParamsFail.putString("type", "fail");
        if (j8 > 0) {
            bundleParamsFail.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - j8) / 1000);
        }
        A(update, bundleParamsFail, str);
    }

    @Override // com.uptodown.workers.DownloadWorker
    public void G(String errorCode, String event, Bundle bundle, long j8, a5.O o8, String str) {
        AbstractC3255y.i(errorCode, "errorCode");
        AbstractC3255y.i(event, "event");
        AbstractC3255y.i(bundle, "bundle");
        if (j8 > 0) {
            bundle.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - j8) / 1000);
        }
        Bundle M8 = M(bundle, o8, str);
        C3678r v8 = v();
        if (v8 != null) {
            v8.b(event, M8);
        }
    }

    @Override // com.uptodown.workers.DownloadWorker
    public void K(a5.O update, int i8) {
        AbstractC3255y.i(update, "update");
        Bundle bundle = new Bundle();
        bundle.putParcelable("update", update);
        C3655A.f36474a.g().send(i8, bundle);
    }

    @Override // com.uptodown.workers.DownloadWorker, androidx.work.Worker
    public ListenableWorker.Result doWork() {
        C3655A c3655a = C3655A.f36474a;
        c3655a.g().send(107, null);
        C3680t c3680t = C3680t.f36531a;
        if (c3680t.d()) {
            C3677q c3677q = new C3677q();
            Context applicationContext = getApplicationContext();
            AbstractC3255y.h(applicationContext, "applicationContext");
            c3677q.c(applicationContext);
            ArrayList G8 = UptodownApp.f29058B.G();
            if (G8 != null && G8.size() > 0) {
                if (SettingsPreferences.f30353b.c0(s())) {
                    if (!c3680t.f() && !this.f31044i) {
                        Bundle bundle = new Bundle();
                        bundle.putParcelableArrayList("apps_parcelable", G8);
                        c3655a.g().send(105, bundle);
                    } else {
                        O();
                    }
                } else {
                    O();
                }
            }
        } else {
            c3655a.g().send(110, null);
        }
        UptodownApp.f29058B.t0(false);
        InstallUpdatesWorker.f31075b.b(s());
        c3655a.g().send(103, null);
        ListenableWorker.Result success = ListenableWorker.Result.success();
        AbstractC3255y.h(success, "success()");
        return success;
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        DownloadWorker.f31052c.k(true);
        super.onStopped();
    }

    @Override // com.uptodown.workers.DownloadWorker
    public boolean y(a5.O update) {
        AbstractC3255y.i(update, "update");
        if (n.s(update.s(), f31043l, true) || DownloadWorker.f31052c.b()) {
            return true;
        }
        return false;
    }
}
