package com.uptodown.workers;

import E4.j;
import N4.d;
import N4.q;
import X4.C1496f;
import X4.C1504n;
import X4.I;
import X4.P;
import X4.r;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.UptodownApp;
import g6.n;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3312F;
import l5.C3326n;
import l5.C3328p;
import l5.C3330r;
import l5.C3331s;
import l5.C3332t;
import m5.C3439d;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class UploadFileWorker extends Worker {

    /* renamed from: c, reason: collision with root package name */
    public static final a f30079c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private Context f30080a;

    /* renamed from: b, reason: collision with root package name */
    private final C3330r f30081b;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final void a(Context context) {
            AbstractC3159y.i(context, "context");
            UptodownApp.a aVar = UptodownApp.f28003B;
            boolean W7 = aVar.W("UploadFileWorker", context);
            boolean V7 = aVar.V("DownloadUpdatesWorker", context);
            String str = "downloadApkWorker";
            boolean V8 = aVar.V("downloadApkWorker", context);
            if (!W7 && !V7 && !V8) {
                WorkManager.getInstance(context).enqueue(new OneTimeWorkRequest.Builder(UploadFileWorker.class).addTag("UploadFileWorker").build());
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("type", "notLaunch");
            if (W7) {
                str = "uploadFileWorker";
            } else if (V7) {
                str = "downloadUpdatesWorker";
            }
            bundle.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, str);
            new C3330r(context).b("upload_file", bundle);
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadFileWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(params, "params");
        this.f30080a = context;
        this.f30081b = new C3330r(context);
        this.f30080a = j.f2274g.a(this.f30080a);
    }

    private final String a(String str, ArrayList arrayList) {
        PackageManager pm = this.f30080a.getPackageManager();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1496f appAux = (C1496f) it.next();
            if (appAux.u() != null && n.s(appAux.u(), str, true)) {
                AbstractC3159y.h(pm, "pm");
                String Q8 = appAux.Q();
                AbstractC3159y.f(Q8);
                ApplicationInfo a8 = q.a(pm, Q8, 128);
                d dVar = d.f7201a;
                String str2 = a8.sourceDir;
                AbstractC3159y.h(str2, "aPackage.sourceDir");
                String h8 = dVar.h(str2);
                if (n.s(str, h8, true)) {
                    return a8.sourceDir;
                }
                Bundle bundle = new Bundle();
                bundle.putString("type", "ignored");
                bundle.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "hashNotMatch");
                bundle.putString("filehash", str);
                bundle.putString("packagename", a8.packageName);
                bundle.putString("filehashCalculated", h8);
                this.f30081b.b("upload", C3331s.f34529a.a(bundle));
                C3326n a9 = C3326n.f34504t.a(this.f30080a);
                a9.a();
                appAux.A0(h8);
                AbstractC3159y.h(appAux, "appAux");
                a9.m1(appAux);
                a9.g();
                return null;
            }
            C3326n a10 = C3326n.f34504t.a(this.f30080a);
            a10.a();
            AbstractC3159y.h(appAux, "appAux");
            ArrayList U7 = a10.U(appAux);
            a10.g();
            if (U7 != null) {
                Iterator it2 = U7.iterator();
                while (it2.hasNext()) {
                    r rVar = (r) it2.next();
                    PackageManager packageManager = pm;
                    if (n.s(str, rVar.b(), true) && rVar.a() != null) {
                        d dVar2 = d.f7201a;
                        String a11 = rVar.a();
                        AbstractC3159y.f(a11);
                        String h9 = dVar2.h(a11);
                        if (n.s(str, h9, true)) {
                            return rVar.a();
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("type", "ignored");
                        bundle2.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "hashNotMatch");
                        bundle2.putString("filehash", str);
                        bundle2.putString("packagename", appAux.Q());
                        bundle2.putString("filehashCalculated", h9);
                        this.f30081b.b("upload", C3331s.f34529a.a(bundle2));
                        return null;
                    }
                    pm = packageManager;
                }
            }
        }
        Bundle bundle3 = new Bundle();
        bundle3.putString("type", "ignored");
        bundle3.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "hashNotFound");
        bundle3.putString("filehash", str);
        this.f30081b.b("upload", C3331s.f34529a.a(bundle3));
        return null;
    }

    private final String b() {
        Y4.d a8 = Y4.d.f13230a.a();
        if (new C3328p().c(this.f30080a) && c()) {
            C1504n c1504n = new C1504n();
            c1504n.h(this.f30080a);
            C3312F c3312f = new C3312F(this.f30080a, a8);
            String d8 = c1504n.d();
            AbstractC3159y.f(d8);
            I u8 = c3312f.u(d8);
            this.f30081b.e("getFileToUpload", null, u8, null);
            if (c3312f.g(u8) && u8.d() != null) {
                String d9 = u8.d();
                AbstractC3159y.f(d9);
                JSONObject jSONObject = new JSONObject(d9);
                if (!jSONObject.isNull("success") && jSONObject.getInt("success") == 1) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                    if (!jSONObject2.isNull("md5")) {
                        return jSONObject2.getString("md5");
                    }
                }
            } else if (u8.e() == 404 && a8 != null) {
                Bundle bundle = new Bundle();
                bundle.putString(NotificationCompat.CATEGORY_MESSAGE, "getFileToUpload 404: No file to upload available");
                a8.send(137, bundle);
            }
        }
        return null;
    }

    private final boolean c() {
        UptodownApp.a aVar = UptodownApp.f28003B;
        if (!aVar.V("DownloadUpdatesWorker", this.f30080a) && !aVar.V("downloadApkWorker", this.f30080a)) {
            return true;
        }
        return false;
    }

    private final boolean d(String str, String str2, Y4.d dVar) {
        boolean c8 = new C3328p().c(this.f30080a);
        if (c8 && c()) {
            File file = new File(str);
            if (file.exists()) {
                long length = file.length();
                C3332t c3332t = C3332t.f34530a;
                if (c3332t.f()) {
                    return C3439d.b(new C3439d(), this.f30080a, file, str2, dVar, false, 16, null);
                }
                if (c3332t.e()) {
                    P a8 = P.f12434c.a(this.f30080a);
                    if (length > 0 && length < a8.a(this.f30080a)) {
                        return new C3439d().a(this.f30080a, file, str2, dVar, true);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("type", "ignored");
                    bundle.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "size");
                    C3331s c3331s = C3331s.f34529a;
                    bundle.putString("size", c3331s.d(length));
                    this.f30081b.b("upload", c3331s.a(bundle));
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("type", "ignored");
                    bundle2.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "connection");
                    C3331s c3331s2 = C3331s.f34529a;
                    bundle2.putString("size", c3331s2.d(length));
                    this.f30081b.b("upload", c3331s2.a(bundle2));
                }
            } else {
                Bundle bundle3 = new Bundle();
                bundle3.putString("type", "ignored");
                bundle3.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "fileNotFound");
                this.f30081b.b("upload", C3331s.f34529a.a(bundle3));
            }
        } else {
            Bundle bundle4 = new Bundle();
            bundle4.putString("type", "ignored");
            if (!c8) {
                bundle4.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "battery");
            } else {
                bundle4.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "notIdle");
            }
            this.f30081b.b("upload", C3331s.f34529a.a(bundle4));
        }
        return false;
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        String b8 = b();
        if (b8 != null) {
            C3326n a8 = C3326n.f34504t.a(this.f30080a);
            a8.a();
            ArrayList V7 = a8.V();
            a8.g();
            String a9 = a(b8, V7);
            if (a9 != null && d(a9, b8, Y4.d.f13230a.a())) {
                UptodownApp.a.N0(UptodownApp.f28003B, this.f30080a, false, 2, null);
            }
        }
        ListenableWorker.Result success = ListenableWorker.Result.success();
        AbstractC3159y.h(success, "success()");
        return success;
    }
}
