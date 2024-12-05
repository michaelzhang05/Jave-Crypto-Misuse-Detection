package com.uptodown.workers;

import H4.j;
import a5.C1635b;
import a5.C1639f;
import a5.I;
import a5.O;
import a5.y;
import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.mbridge.msdk.MBridgeConstans;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import j6.n;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.C3347b0;
import l6.N;
import o5.C3656B;
import o5.C3671k;
import o5.C3674n;
import o5.C3677q;
import o5.C3678r;
import o5.C3683w;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class TrackingWorker extends Worker {

    /* renamed from: f, reason: collision with root package name */
    public static final a f31105f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private Context f31106a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f31107b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f31108c;

    /* renamed from: d, reason: collision with root package name */
    private String f31109d;

    /* renamed from: e, reason: collision with root package name */
    private final C3678r f31110e;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(params, "params");
        this.f31106a = context;
        this.f31107b = params.getInputData().getBoolean("isCompressed", true);
        this.f31110e = new C3678r(this.f31106a);
        this.f31106a = j.f3824g.a(this.f31106a);
        for (String tag : getTags()) {
            if (tag.equals("TrackingWorkerPeriodic") || tag.equals("TrackingWorkerSingle")) {
                AbstractC3255y.h(tag, "tag");
                this.f31109d = tag;
            }
        }
    }

    private final void a(O o8, C1639f c1639f, Context context) {
        C3674n a8 = C3674n.f36505t.a(context);
        a8.a();
        if (c1639f.J() != null && n.s(c1639f.J(), o8.s(), true)) {
            O u02 = a8.u0(o8.s());
            if (u02 != null) {
                if (!AbstractC3255y.d(u02.b(), o8.b())) {
                    a8.r1(o8);
                    new C1635b().l(c1639f, o8, a8);
                }
            } else {
                a8.K0(o8);
                new C1635b().l(c1639f, o8, a8);
            }
        }
        a8.l();
    }

    private final void b(I i8) {
        if (i8.e() == 401) {
            this.f31108c = true;
        } else if (i8.e() == 0) {
            this.f31108c = true;
        }
    }

    private final void c() {
        if (!UptodownApp.f29058B.W("GenerateQueueWorker", this.f31106a)) {
            Data build = new Data.Builder().putInt("downloadAutostartedInBackground", 1).putBoolean("downloadAnyway", true).putBoolean("downloadUptodown", true).putString("packagename", this.f31106a.getPackageName()).build();
            AbstractC3255y.h(build, "Builder()\n              …\n                .build()");
            WorkManager.getInstance(this.f31106a).enqueue(new OneTimeWorkRequest.Builder(GenerateQueueWorker.class).addTag("GenerateQueueWorker").setInputData(build).build());
        }
    }

    private final void d() {
        if (!UptodownApp.f29058B.W("GenerateQueueWorker", this.f31106a)) {
            Data build = new Data.Builder().putInt("downloadAutostartedInBackground", 1).build();
            AbstractC3255y.h(build, "Builder()\n              …\n                .build()");
            WorkManager.getInstance(this.f31106a).enqueue(new OneTimeWorkRequest.Builder(GenerateQueueWorker.class).addTag("GenerateQueueWorker").setInputData(build).build());
        }
    }

    private final String e(String str) {
        if (n.s(str, "TrackingWorkerPeriodic", true)) {
            return "periodic";
        }
        return "oneTime";
    }

    private final void f(JSONArray jSONArray) {
        String str;
        String str2;
        C3674n a8 = C3674n.f36505t.a(this.f31106a);
        a8.a();
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        boolean z8 = false;
        for (int i8 = 0; i8 < length; i8++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i8);
            if (!jSONObject.isNull("packagename")) {
                String packagename = jSONObject.getString("packagename");
                AbstractC3255y.h(packagename, "packagename");
                O o8 = new O(packagename);
                if (!jSONObject.isNull("versionName")) {
                    o8.a0(jSONObject.getString("versionName"));
                }
                if (!jSONObject.isNull("versionCode")) {
                    o8.Z(jSONObject.getLong("versionCode"));
                }
                if (!jSONObject.isNull("size")) {
                    o8.Y(jSONObject.getLong("size"));
                }
                if (!jSONObject.isNull("fileID")) {
                    o8.y(jSONObject.getString("fileID"));
                }
                C1639f S8 = a8.S(o8.s());
                if (S8 != null) {
                    S8.J0(C1639f.c.OUTDATED);
                    if (n.s(this.f31106a.getPackageName(), o8.s(), true)) {
                        z8 = true;
                    }
                    a(o8, S8, this.f31106a);
                }
                arrayList.add(o8);
            }
        }
        Iterator it = a8.v0().iterator();
        while (it.hasNext()) {
            O o9 = (O) it.next();
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (n.s(o9.s(), ((O) it2.next()).s(), true)) {
                        break;
                    }
                } else {
                    a8.M(o9.s());
                    break;
                }
            }
        }
        a8.l();
        SettingsPreferences.a aVar = SettingsPreferences.f30353b;
        if (aVar.j0(this.f31106a)) {
            if (z8) {
                c();
                return;
            }
            return;
        }
        if (!aVar.Y(this.f31106a) && AbstractC3255y.d(aVar.n(this.f31106a), MBridgeConstans.ENDCARD_URL_TYPE_PL)) {
            UploadFileWorker.f31111c.a(this.f31106a);
        } else {
            d();
        }
        if (z8) {
            a8.a();
            String packageName = this.f31106a.getPackageName();
            AbstractC3255y.h(packageName, "context.packageName");
            O u02 = a8.u0(packageName);
            a8.l();
            if (u02 != null) {
                str = u02.l();
            } else {
                str = null;
            }
            if (str != null && u02.u() == 100) {
                y a9 = y.f14354g.a(this.f31106a);
                if (a9 != null) {
                    str2 = a9.e();
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    File g8 = new C3677q().g(this.f31106a);
                    String l8 = u02.l();
                    AbstractC3255y.f(l8);
                    File file = new File(g8, l8);
                    if (file.exists()) {
                        String e8 = a9.e();
                        AbstractC3255y.f(e8);
                        if (System.currentTimeMillis() - Long.parseLong(e8) > 604800000) {
                            C3683w.f36547a.v(this.f31106a, new C3671k().t(file, this.f31106a));
                        }
                    }
                }
            } else {
                UptodownApp.f29058B.E().send(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR, null);
            }
        }
        new V4.a(this.f31106a, null, N.a(C3347b0.b()));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g() {
        /*
            Method dump skipped, instructions count: 921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.TrackingWorker.g():void");
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        if (getRunAttemptCount() > 3) {
            this.f31110e.a("tracking_doWork_attempts_exceeded");
            ListenableWorker.Result failure = ListenableWorker.Result.failure();
            AbstractC3255y.h(failure, "failure()");
            return failure;
        }
        String str = this.f31109d;
        if (str == null) {
            AbstractC3255y.y("currentTag");
            str = null;
        }
        if (n.s(str, "TrackingWorkerPeriodic", true)) {
            UptodownApp.a aVar = UptodownApp.f29058B;
            if (aVar.V("TrackingWorkerSingle", this.f31106a) || aVar.V("GenerateQueueWorker", this.f31106a) || aVar.V("DownloadUpdatesWorker", this.f31106a)) {
                if (aVar.M()) {
                    this.f31110e.d("tracking_periodic_ignored", null, "tracking");
                }
                ListenableWorker.Result success = ListenableWorker.Result.success();
                AbstractC3255y.h(success, "success()");
                return success;
            }
        } else {
            String str2 = this.f31109d;
            if (str2 == null) {
                AbstractC3255y.y("currentTag");
                str2 = null;
            }
            if (n.s(str2, "TrackingWorkerSingle", true)) {
                UptodownApp.a aVar2 = UptodownApp.f29058B;
                if (aVar2.V("TrackingWorkerPeriodic", this.f31106a) || aVar2.V("GenerateQueueWorker", this.f31106a) || aVar2.V("DownloadUpdatesWorker", this.f31106a)) {
                    if (aVar2.M()) {
                        this.f31110e.d("tracking_onetime_ignored", null, "tracking");
                    }
                    ListenableWorker.Result success2 = ListenableWorker.Result.success();
                    AbstractC3255y.h(success2, "success()");
                    return success2;
                }
            }
        }
        if (new C3656B(this.f31106a).b()) {
            UptodownApp.a aVar3 = UptodownApp.f29058B;
            aVar3.E().send(TypedValues.MotionType.TYPE_QUANTIZE_MOTION_PHASE, null);
            if (!aVar3.M()) {
                ListenableWorker.Result failure2 = ListenableWorker.Result.failure();
                AbstractC3255y.h(failure2, "failure()");
                return failure2;
            }
        }
        j.f3824g.b();
        SettingsPreferences.a aVar4 = SettingsPreferences.f30353b;
        if (!aVar4.l0(this.f31106a) && aVar4.k0(this.f31106a)) {
            g();
            if (this.f31108c) {
                ListenableWorker.Result retry = ListenableWorker.Result.retry();
                AbstractC3255y.h(retry, "retry()");
                return retry;
            }
        }
        if (UptodownApp.f29058B.M()) {
            C3678r c3678r = this.f31110e;
            StringBuilder sb = new StringBuilder();
            sb.append("tracking_");
            String str3 = this.f31109d;
            if (str3 == null) {
                AbstractC3255y.y("currentTag");
                str3 = null;
            }
            sb.append(str3);
            sb.append("_success");
            c3678r.d(sb.toString(), null, "tracking");
        }
        ListenableWorker.Result success3 = ListenableWorker.Result.success();
        AbstractC3255y.h(success3, "success()");
        return success3;
    }
}
