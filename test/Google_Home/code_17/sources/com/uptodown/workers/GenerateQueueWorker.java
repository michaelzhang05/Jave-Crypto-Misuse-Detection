package com.uptodown.workers;

import H4.j;
import a5.C1639f;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import j6.n;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3655A;
import o5.C3667g;
import o5.C3680t;

/* loaded from: classes5.dex */
public final class GenerateQueueWorker extends Worker {

    /* renamed from: f, reason: collision with root package name */
    public static final a f31060f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private Context f31061a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f31062b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f31063c;

    /* renamed from: d, reason: collision with root package name */
    private final int f31064d;

    /* renamed from: e, reason: collision with root package name */
    private String f31065e;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateQueueWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(params, "params");
        this.f31061a = context;
        this.f31062b = params.getInputData().getBoolean("downloadAnyway", false);
        this.f31063c = params.getInputData().getBoolean("downloadUptodown", false);
        this.f31064d = params.getInputData().getInt("downloadAutostartedInBackground", 0);
        this.f31065e = params.getInputData().getString("packagename");
        this.f31061a = j.f3824g.a(this.f31061a);
    }

    private final void b(ArrayList arrayList) {
        if (!UptodownApp.f29058B.O(this.f31061a)) {
            Data build = new Data.Builder().putInt("downloadAutostartedInBackground", this.f31064d).putBoolean("downloadAnyway", this.f31062b).build();
            AbstractC3255y.h(build, "Builder()\n              …\n                .build()");
            WorkManager.getInstance(this.f31061a).enqueue(new OneTimeWorkRequest.Builder(DownloadUpdatesWorker.class).addTag("DownloadUpdatesWorker").setInputData(build).build());
            if (arrayList.size() > 1) {
                WorkManager.getInstance(this.f31061a).enqueue(new OneTimeWorkRequest.Builder(DownloadUpdatesWorker.class).addTag("DownloadUpdatesWorker").setInputData(build).build());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void c(java.lang.String r18, boolean r19, android.content.Context r20) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.GenerateQueueWorker.c(java.lang.String, boolean, android.content.Context):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(C1639f app1, C1639f app2) {
        AbstractC3255y.i(app1, "app1");
        AbstractC3255y.i(app2, "app2");
        if (app1.z() == null) {
            return 1;
        }
        if (app2.z() == null) {
            return -1;
        }
        String z8 = app1.z();
        AbstractC3255y.f(z8);
        String z9 = app2.z();
        AbstractC3255y.f(z9);
        return n.m(z8, z9, true);
    }

    private final boolean e(C1639f c1639f, String str) {
        String str2;
        if (AbstractC3255y.d(str, "1")) {
            if (c1639f.J() != null) {
                C3667g c3667g = new C3667g();
                Context context = this.f31061a;
                String J8 = c1639f.J();
                AbstractC3255y.f(J8);
                str2 = c3667g.h(context, J8);
            } else {
                str2 = null;
            }
            if (str2 != null && n.s(str2, this.f31061a.getPackageName(), true)) {
                return true;
            }
            return false;
        }
        return AbstractC3255y.d(str, "2");
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        UptodownApp.a aVar = UptodownApp.f29058B;
        if (!aVar.O(this.f31061a)) {
            c(this.f31065e, this.f31063c, this.f31061a);
            ArrayList<? extends Parcelable> G8 = aVar.G();
            if (G8 != null && G8.size() > 0) {
                if (SettingsPreferences.f30353b.c0(this.f31061a)) {
                    if (!C3680t.f36531a.f() && !this.f31062b) {
                        Bundle bundle = new Bundle();
                        bundle.putParcelableArrayList("apps_parcelable", G8);
                        C3655A.f36474a.g().send(105, bundle);
                    } else {
                        b(G8);
                    }
                } else {
                    b(G8);
                }
            } else {
                InstallUpdatesWorker.f31075b.b(this.f31061a);
            }
        }
        ListenableWorker.Result success = ListenableWorker.Result.success();
        AbstractC3255y.h(success, "success()");
        return success;
    }
}
