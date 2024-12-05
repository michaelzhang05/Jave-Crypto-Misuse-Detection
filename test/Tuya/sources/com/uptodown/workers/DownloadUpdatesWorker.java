package com.uptodown.workers;

import N4.h;
import X4.C1492b;
import X4.C1496f;
import X4.C1502l;
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
import g6.n;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.S;
import l5.C3307A;
import l5.C3313a;
import l5.C3323k;
import l5.C3326n;
import l5.C3329q;
import l5.C3330r;
import l5.C3331s;
import l5.C3332t;
import l5.C3335w;

/* loaded from: classes5.dex */
public final class DownloadUpdatesWorker extends DownloadWorker {

    /* renamed from: k, reason: collision with root package name */
    public static final a f30010k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    private static String f30011l;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f30012i;

    /* renamed from: j, reason: collision with root package name */
    private final int f30013j;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final void a(String packagename) {
            AbstractC3159y.i(packagename, "packagename");
            DownloadUpdatesWorker.f30011l = packagename;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements DownloadWorker.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ O f30014a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ S f30015b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ S f30016c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ DownloadUpdatesWorker f30017d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ X4.O f30018e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f30019f;

        b(O o8, S s8, S s9, DownloadUpdatesWorker downloadUpdatesWorker, X4.O o9, String str) {
            this.f30014a = o8;
            this.f30015b = s8;
            this.f30016c = s9;
            this.f30017d = downloadUpdatesWorker;
            this.f30018e = o9;
            this.f30019f = str;
        }

        @Override // com.uptodown.workers.DownloadWorker.b
        public void a(int i8, long j8) {
            this.f30018e.X(i8);
            C3326n.a aVar = C3326n.f34504t;
            Context applicationContext = this.f30017d.getApplicationContext();
            AbstractC3159y.h(applicationContext, "applicationContext");
            C3326n a8 = aVar.a(applicationContext);
            a8.a();
            a8.r1(this.f30018e);
            a8.g();
            if (i8 > 0) {
                Bundle bundle = new Bundle();
                bundle.putString("packagename", this.f30018e.n());
                C3307A.f34473a.g().send(101, bundle);
            }
        }

        @Override // com.uptodown.workers.DownloadWorker.b
        public void b(long j8) {
            this.f30015b.f33760a = j8;
        }

        @Override // com.uptodown.workers.DownloadWorker.b
        public void c() {
            this.f30014a.f33757a = true;
        }

        @Override // com.uptodown.workers.DownloadWorker.b
        public void d(long j8) {
            this.f30016c.f33760a = j8;
            Bundle bundle = new Bundle();
            bundle.putString("type", "first_data");
            this.f30017d.A(this.f30018e, bundle, this.f30019f);
        }

        @Override // com.uptodown.workers.DownloadWorker.b
        public void e() {
            Bundle bundle = new Bundle();
            bundle.putString("type", "reconnected");
            this.f30017d.A(this.f30018e, bundle, this.f30019f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadUpdatesWorker(Context c8, WorkerParameters params) {
        super(c8, params);
        AbstractC3159y.i(c8, "c");
        AbstractC3159y.i(params, "params");
        this.f30012i = params.getInputData().getBoolean("downloadAnyway", false);
        this.f30013j = params.getInputData().getInt("downloadAutostartedInBackground", 0);
        DownloadWorker.a aVar = DownloadWorker.f30020c;
        aVar.k(false);
        aVar.m(false);
        aVar.n(false);
        w();
    }

    private final Bundle M(Bundle bundle, X4.O o8, String str) {
        if (str != null) {
            bundle.putString("host", str);
        }
        if (o8 != null) {
            if (o8.c() != null) {
                String c8 = o8.c();
                AbstractC3159y.f(c8);
                bundle.putString("fileId", c8);
            }
            if (o8.s() > 0) {
                bundle.putString("size", C3331s.f34529a.d(o8.s()));
            }
            UptodownApp.a aVar = UptodownApp.f28003B;
            if (aVar.p() != null) {
                C1502l p8 = aVar.p();
                AbstractC3159y.f(p8);
                if (AbstractC3159y.d(p8.d(), o8.n())) {
                    bundle.putInt("deeplink", 1);
                }
            }
            bundle.putInt("deeplink", 0);
        }
        Bundle a8 = C3331s.f34529a.a(bundle);
        a8.putInt("update", 1);
        a8.putInt("notification_fcm", 0);
        return a8;
    }

    private final void N(String str, X4.O o8) {
        File file;
        String str2;
        O o9 = new O();
        long currentTimeMillis = System.currentTimeMillis();
        Bundle bundle = new Bundle();
        bundle.putString("packagename", o8.n());
        C3307A c3307a = C3307A.f34473a;
        c3307a.g().send(109, bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putString("type", "start");
        A(o8, bundle2, new URL(str).getHost());
        HttpsURLConnection I8 = DownloadWorker.I(this, str, currentTimeMillis, o8, null, 8, null);
        if (I8 == null) {
            return;
        }
        String host = I8.getURL().getHost();
        String url = I8.getURL().toString();
        AbstractC3159y.h(url, "urlConnection.url.toString()");
        String t8 = t(url);
        StringBuilder sb = new StringBuilder();
        sb.append(o8.n());
        sb.append('_');
        String c8 = o8.c();
        AbstractC3159y.f(c8);
        sb.append(c8);
        sb.append('.');
        sb.append(t8);
        o8.T(sb.toString());
        C3329q c3329q = new C3329q();
        Context applicationContext = getApplicationContext();
        AbstractC3159y.h(applicationContext, "applicationContext");
        File g8 = c3329q.g(applicationContext);
        if (!g8.exists() && !g8.mkdirs()) {
            Bundle bundle3 = new Bundle();
            bundle3.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "cant_mkdir");
            B(o8, bundle3, host, currentTimeMillis);
            return;
        }
        String j8 = o8.j();
        AbstractC3159y.f(j8);
        File file2 = new File(g8, j8);
        long length = file2.exists() ? file2.length() : 0L;
        if (D(I8, o8, currentTimeMillis)) {
            if (new C3313a().c(new C3329q().k(s(), g8), o8.s() - length)) {
                S s8 = new S();
                S s9 = new S();
                b bVar = new b(o9, s8, s9, this, o8, host);
                AbstractC3159y.h(host, "host");
                long q8 = q(I8, file2, o8, host, currentTimeMillis, bVar);
                if (q8 < 0) {
                    return;
                }
                File l8 = l(file2, s());
                if (l8 != null) {
                    o8.T(l8.getName());
                    C3326n a8 = C3326n.f34504t.a(s());
                    a8.a();
                    a8.r1(o8);
                    a8.g();
                    file = l8;
                } else {
                    file = file2;
                }
                if (!o9.f33757a) {
                    DownloadWorker.a aVar = DownloadWorker.f30020c;
                    if (!aVar.b()) {
                        long s10 = o8.s();
                        String e8 = o8.e();
                        AbstractC3159y.f(e8);
                        File file3 = file;
                        Bundle k8 = k(length, q8, file, s10, e8);
                        if (k8 != null) {
                            C3313a c3313a = new C3313a();
                            Context applicationContext2 = getApplicationContext();
                            AbstractC3159y.h(applicationContext2, "applicationContext");
                            c3313a.b(applicationContext2, o8.j());
                            if (o8.o() > 0) {
                                o8.X(0);
                                C3326n.a aVar2 = C3326n.f34504t;
                                Context applicationContext3 = getApplicationContext();
                                AbstractC3159y.h(applicationContext3, "applicationContext");
                                C3326n a9 = aVar2.a(applicationContext3);
                                a9.a();
                                a9.r1(o8);
                                a9.g();
                            }
                            Bundle bundle4 = new Bundle();
                            str2 = "packagename";
                            bundle4.putString(str2, o8.n());
                            c3307a.g().send(102, bundle4);
                            B(o8, k8, host, currentTimeMillis);
                        } else {
                            str2 = "packagename";
                            Bundle bundle5 = new Bundle();
                            bundle5.putString(str2, o8.n());
                            c3307a.g().send(100, bundle5);
                        }
                        if (n.s(o8.n(), s().getPackageName(), true)) {
                            UptodownApp.a aVar3 = UptodownApp.f28003B;
                            if (aVar3.Q() && c3307a.d().size() > 0 && this.f30013j == 1) {
                                Object obj = c3307a.d().get(c3307a.d().size() - 1);
                                AbstractC3159y.h(obj, "StaticResources.activity….activity_stack.size - 1]");
                                if (((Activity) obj) instanceof Updates) {
                                    aVar.k(true);
                                }
                            }
                            if (Build.VERSION.SDK_INT >= 31 && !aVar3.Q()) {
                                h.u(new h(s(), null), file3, false, 2, null);
                                aVar.k(true);
                            } else {
                                try {
                                    C3335w.f34546a.v(s(), new C3323k().t(file3, s()));
                                } catch (Exception e9) {
                                    e9.printStackTrace();
                                }
                            }
                        } else {
                            InstallUpdatesWorker.f30043b.b(s());
                        }
                        Bundle bundle6 = new Bundle();
                        bundle6.putString(str2, o8.n());
                        C3307A.f34473a.g().send(108, bundle6);
                        Bundle bundle7 = new Bundle();
                        if (s8.f33760a == 0) {
                            long currentTimeMillis2 = (System.currentTimeMillis() - s9.f33760a) / 1000;
                            if (currentTimeMillis2 > 0) {
                                s8.f33760a = q8 / currentTimeMillis2;
                            }
                        }
                        bundle7.putLong("speed", s8.f33760a);
                        bundle7.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - currentTimeMillis) / 1000);
                        bundle7.putString("type", "completed");
                        A(o8, bundle7, host);
                        if (UptodownApp.f28003B.Q()) {
                            return;
                        }
                        C1492b c1492b = new C1492b();
                        C3326n.a aVar4 = C3326n.f34504t;
                        Context applicationContext4 = getApplicationContext();
                        AbstractC3159y.h(applicationContext4, "applicationContext");
                        C3326n a10 = aVar4.a(applicationContext4);
                        a10.a();
                        C1496f S7 = a10.S(o8.n());
                        if (S7 != null) {
                            c1492b.j(S7, o8, a10);
                        }
                        a10.g();
                        return;
                    }
                }
                if (DownloadWorker.f30020c.e()) {
                    return;
                }
                C3313a c3313a2 = new C3313a();
                Context applicationContext5 = getApplicationContext();
                AbstractC3159y.h(applicationContext5, "applicationContext");
                c3313a2.b(applicationContext5, o8.j());
                if (o8.o() > 0) {
                    o8.X(0);
                    C3326n.a aVar5 = C3326n.f34504t;
                    Context applicationContext6 = getApplicationContext();
                    AbstractC3159y.h(applicationContext6, "applicationContext");
                    C3326n a11 = aVar5.a(applicationContext6);
                    a11.a();
                    a11.r1(o8);
                    a11.g();
                }
                Bundle bundle8 = new Bundle();
                bundle8.putString("packagename", o8.n());
                c3307a.g().send(106, bundle8);
                P(o8, host, currentTimeMillis);
                return;
            }
            I8.disconnect();
            C3313a c3313a3 = new C3313a();
            Context applicationContext7 = getApplicationContext();
            AbstractC3159y.h(applicationContext7, "applicationContext");
            c3313a3.b(applicationContext7, o8.j());
            C3329q c3329q2 = new C3329q();
            Context applicationContext8 = getApplicationContext();
            AbstractC3159y.h(applicationContext8, "applicationContext");
            c3329q2.c(applicationContext8);
            o8.X(0);
            c3307a.g().send(104, null);
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

    private final void P(X4.O o8, String str, long j8) {
        f30011l = null;
        Bundle bundle = new Bundle();
        bundle.putString("type", "cancelled");
        if (j8 > 0) {
            bundle.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - j8) / 1000);
        }
        A(o8, bundle, str);
    }

    @Override // com.uptodown.workers.DownloadWorker
    public void A(X4.O update, Bundle bundle, String str) {
        AbstractC3159y.i(update, "update");
        AbstractC3159y.i(bundle, "bundle");
        Bundle M8 = M(bundle, update, str);
        C3330r v8 = v();
        if (v8 != null) {
            v8.b("download", M8);
        }
    }

    @Override // com.uptodown.workers.DownloadWorker
    public void B(X4.O update, Bundle bundleParamsFail, String str, long j8) {
        AbstractC3159y.i(update, "update");
        AbstractC3159y.i(bundleParamsFail, "bundleParamsFail");
        bundleParamsFail.putString("type", "fail");
        if (j8 > 0) {
            bundleParamsFail.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - j8) / 1000);
        }
        A(update, bundleParamsFail, str);
    }

    @Override // com.uptodown.workers.DownloadWorker
    public void G(String errorCode, String event, Bundle bundle, long j8, X4.O o8, String str) {
        AbstractC3159y.i(errorCode, "errorCode");
        AbstractC3159y.i(event, "event");
        AbstractC3159y.i(bundle, "bundle");
        if (j8 > 0) {
            bundle.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - j8) / 1000);
        }
        Bundle M8 = M(bundle, o8, str);
        C3330r v8 = v();
        if (v8 != null) {
            v8.b(event, M8);
        }
    }

    @Override // com.uptodown.workers.DownloadWorker
    public void K(X4.O update, int i8) {
        AbstractC3159y.i(update, "update");
        Bundle bundle = new Bundle();
        bundle.putParcelable("update", update);
        C3307A.f34473a.g().send(i8, bundle);
    }

    @Override // com.uptodown.workers.DownloadWorker, androidx.work.Worker
    public ListenableWorker.Result doWork() {
        C3307A c3307a = C3307A.f34473a;
        c3307a.g().send(107, null);
        C3332t c3332t = C3332t.f34530a;
        if (c3332t.d()) {
            C3329q c3329q = new C3329q();
            Context applicationContext = getApplicationContext();
            AbstractC3159y.h(applicationContext, "applicationContext");
            c3329q.c(applicationContext);
            ArrayList G8 = UptodownApp.f28003B.G();
            if (G8 != null && G8.size() > 0) {
                if (SettingsPreferences.f29323b.c0(s())) {
                    if (!c3332t.f() && !this.f30012i) {
                        Bundle bundle = new Bundle();
                        bundle.putParcelableArrayList("apps_parcelable", G8);
                        c3307a.g().send(105, bundle);
                    } else {
                        O();
                    }
                } else {
                    O();
                }
            }
        } else {
            c3307a.g().send(110, null);
        }
        UptodownApp.f28003B.t0(false);
        InstallUpdatesWorker.f30043b.b(s());
        c3307a.g().send(103, null);
        ListenableWorker.Result success = ListenableWorker.Result.success();
        AbstractC3159y.h(success, "success()");
        return success;
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        DownloadWorker.f30020c.k(true);
        super.onStopped();
    }

    @Override // com.uptodown.workers.DownloadWorker
    public boolean y(X4.O update) {
        AbstractC3159y.i(update, "update");
        if (n.s(update.n(), f30011l, true) || DownloadWorker.f30020c.b()) {
            return true;
        }
        return false;
    }
}
