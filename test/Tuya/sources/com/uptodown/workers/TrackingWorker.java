package com.uptodown.workers;

import E4.j;
import X4.C1492b;
import X4.C1496f;
import X4.I;
import X4.O;
import X4.y;
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
import g6.n;
import i6.C2812b0;
import i6.N;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3308B;
import l5.C3323k;
import l5.C3326n;
import l5.C3329q;
import l5.C3330r;
import l5.C3335w;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class TrackingWorker extends Worker {

    /* renamed from: f, reason: collision with root package name */
    public static final a f30073f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private Context f30074a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f30075b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30076c;

    /* renamed from: d, reason: collision with root package name */
    private String f30077d;

    /* renamed from: e, reason: collision with root package name */
    private final C3330r f30078e;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(params, "params");
        this.f30074a = context;
        this.f30075b = params.getInputData().getBoolean("isCompressed", true);
        this.f30078e = new C3330r(this.f30074a);
        this.f30074a = j.f2274g.a(this.f30074a);
        for (String tag : getTags()) {
            if (tag.equals("TrackingWorkerPeriodic") || tag.equals("TrackingWorkerSingle")) {
                AbstractC3159y.h(tag, "tag");
                this.f30077d = tag;
            }
        }
    }

    private final void a(O o8, C1496f c1496f, Context context) {
        C3326n a8 = C3326n.f34504t.a(context);
        a8.a();
        if (c1496f.Q() != null && n.s(c1496f.Q(), o8.n(), true)) {
            O u02 = a8.u0(o8.n());
            if (u02 != null) {
                if (!AbstractC3159y.d(u02.c(), o8.c())) {
                    a8.r1(o8);
                    new C1492b().l(c1496f, o8, a8);
                }
            } else {
                a8.K0(o8);
                new C1492b().l(c1496f, o8, a8);
            }
        }
        a8.g();
    }

    private final void b(I i8) {
        if (i8.e() == 401) {
            this.f30076c = true;
        } else if (i8.e() == 0) {
            this.f30076c = true;
        }
    }

    private final void c() {
        if (!UptodownApp.f28003B.W("GenerateQueueWorker", this.f30074a)) {
            Data build = new Data.Builder().putInt("downloadAutostartedInBackground", 1).putBoolean("downloadAnyway", true).putBoolean("downloadUptodown", true).putString("packagename", this.f30074a.getPackageName()).build();
            AbstractC3159y.h(build, "Builder()\n              …\n                .build()");
            WorkManager.getInstance(this.f30074a).enqueue(new OneTimeWorkRequest.Builder(GenerateQueueWorker.class).addTag("GenerateQueueWorker").setInputData(build).build());
        }
    }

    private final void d() {
        if (!UptodownApp.f28003B.W("GenerateQueueWorker", this.f30074a)) {
            Data build = new Data.Builder().putInt("downloadAutostartedInBackground", 1).build();
            AbstractC3159y.h(build, "Builder()\n              …\n                .build()");
            WorkManager.getInstance(this.f30074a).enqueue(new OneTimeWorkRequest.Builder(GenerateQueueWorker.class).addTag("GenerateQueueWorker").setInputData(build).build());
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
        C3326n a8 = C3326n.f34504t.a(this.f30074a);
        a8.a();
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        boolean z8 = false;
        for (int i8 = 0; i8 < length; i8++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i8);
            if (!jSONObject.isNull("packagename")) {
                String packagename = jSONObject.getString("packagename");
                AbstractC3159y.h(packagename, "packagename");
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
                    o8.G(jSONObject.getString("fileID"));
                }
                C1496f S7 = a8.S(o8.n());
                if (S7 != null) {
                    S7.J0(C1496f.c.OUTDATED);
                    if (n.s(this.f30074a.getPackageName(), o8.n(), true)) {
                        z8 = true;
                    }
                    a(o8, S7, this.f30074a);
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
                    if (n.s(o9.n(), ((O) it2.next()).n(), true)) {
                        break;
                    }
                } else {
                    a8.M(o9.n());
                    break;
                }
            }
        }
        a8.g();
        SettingsPreferences.a aVar = SettingsPreferences.f29323b;
        if (aVar.j0(this.f30074a)) {
            if (z8) {
                c();
                return;
            }
            return;
        }
        if (!aVar.Y(this.f30074a) && AbstractC3159y.d(aVar.n(this.f30074a), MBridgeConstans.ENDCARD_URL_TYPE_PL)) {
            UploadFileWorker.f30079c.a(this.f30074a);
        } else {
            d();
        }
        if (z8) {
            a8.a();
            String packageName = this.f30074a.getPackageName();
            AbstractC3159y.h(packageName, "context.packageName");
            O u02 = a8.u0(packageName);
            a8.g();
            if (u02 != null) {
                str = u02.j();
            } else {
                str = null;
            }
            if (str != null && u02.o() == 100) {
                y a9 = y.f12733g.a(this.f30074a);
                if (a9 != null) {
                    str2 = a9.e();
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    File g8 = new C3329q().g(this.f30074a);
                    String j8 = u02.j();
                    AbstractC3159y.f(j8);
                    File file = new File(g8, j8);
                    if (file.exists()) {
                        String e8 = a9.e();
                        AbstractC3159y.f(e8);
                        if (System.currentTimeMillis() - Long.parseLong(e8) > 604800000) {
                            C3335w.f34546a.v(this.f30074a, new C3323k().t(file, this.f30074a));
                        }
                    }
                }
            } else {
                UptodownApp.f28003B.E().send(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR, null);
            }
        }
        new S4.a(this.f30074a, null, N.a(C2812b0.b()));
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
            this.f30078e.a("tracking_doWork_attempts_exceeded");
            ListenableWorker.Result failure = ListenableWorker.Result.failure();
            AbstractC3159y.h(failure, "failure()");
            return failure;
        }
        String str = this.f30077d;
        if (str == null) {
            AbstractC3159y.y("currentTag");
            str = null;
        }
        if (n.s(str, "TrackingWorkerPeriodic", true)) {
            UptodownApp.a aVar = UptodownApp.f28003B;
            if (aVar.V("TrackingWorkerSingle", this.f30074a) || aVar.V("GenerateQueueWorker", this.f30074a) || aVar.V("DownloadUpdatesWorker", this.f30074a)) {
                if (aVar.M()) {
                    this.f30078e.d("tracking_periodic_ignored", null, "tracking");
                }
                ListenableWorker.Result success = ListenableWorker.Result.success();
                AbstractC3159y.h(success, "success()");
                return success;
            }
        } else {
            String str2 = this.f30077d;
            if (str2 == null) {
                AbstractC3159y.y("currentTag");
                str2 = null;
            }
            if (n.s(str2, "TrackingWorkerSingle", true)) {
                UptodownApp.a aVar2 = UptodownApp.f28003B;
                if (aVar2.V("TrackingWorkerPeriodic", this.f30074a) || aVar2.V("GenerateQueueWorker", this.f30074a) || aVar2.V("DownloadUpdatesWorker", this.f30074a)) {
                    if (aVar2.M()) {
                        this.f30078e.d("tracking_onetime_ignored", null, "tracking");
                    }
                    ListenableWorker.Result success2 = ListenableWorker.Result.success();
                    AbstractC3159y.h(success2, "success()");
                    return success2;
                }
            }
        }
        if (new C3308B(this.f30074a).b()) {
            UptodownApp.a aVar3 = UptodownApp.f28003B;
            aVar3.E().send(TypedValues.MotionType.TYPE_QUANTIZE_MOTION_PHASE, null);
            if (!aVar3.M()) {
                ListenableWorker.Result failure2 = ListenableWorker.Result.failure();
                AbstractC3159y.h(failure2, "failure()");
                return failure2;
            }
        }
        j.f2274g.b();
        SettingsPreferences.a aVar4 = SettingsPreferences.f29323b;
        if (!aVar4.l0(this.f30074a) && aVar4.k0(this.f30074a)) {
            g();
            if (this.f30076c) {
                ListenableWorker.Result retry = ListenableWorker.Result.retry();
                AbstractC3159y.h(retry, "retry()");
                return retry;
            }
        }
        if (UptodownApp.f28003B.M()) {
            C3330r c3330r = this.f30078e;
            StringBuilder sb = new StringBuilder();
            sb.append("tracking_");
            String str3 = this.f30077d;
            if (str3 == null) {
                AbstractC3159y.y("currentTag");
                str3 = null;
            }
            sb.append(str3);
            sb.append("_success");
            c3330r.d(sb.toString(), null, "tracking");
        }
        ListenableWorker.Result success3 = ListenableWorker.Result.success();
        AbstractC3159y.h(success3, "success()");
        return success3;
    }
}
