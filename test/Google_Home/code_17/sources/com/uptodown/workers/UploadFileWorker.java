package com.uptodown.workers;

import H4.j;
import Q4.d;
import Q4.q;
import a5.C1639f;
import a5.C1647n;
import a5.I;
import a5.P;
import a5.r;
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
import b5.ResultReceiverC1979d;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.UptodownApp;
import j6.n;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3660F;
import o5.C3674n;
import o5.C3676p;
import o5.C3678r;
import o5.C3679s;
import o5.C3680t;
import org.json.JSONObject;
import p5.C3782d;

/* loaded from: classes5.dex */
public final class UploadFileWorker extends Worker {

    /* renamed from: c, reason: collision with root package name */
    public static final a f31111c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private Context f31112a;

    /* renamed from: b, reason: collision with root package name */
    private final C3678r f31113b;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final void a(Context context) {
            AbstractC3255y.i(context, "context");
            UptodownApp.a aVar = UptodownApp.f29058B;
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
            new C3678r(context).b("upload_file", bundle);
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadFileWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(params, "params");
        this.f31112a = context;
        this.f31113b = new C3678r(context);
        this.f31112a = j.f3824g.a(this.f31112a);
    }

    private final String a(String str, ArrayList arrayList) {
        PackageManager pm = this.f31112a.getPackageManager();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1639f appAux = (C1639f) it.next();
            if (appAux.w() != null && n.s(appAux.w(), str, true)) {
                AbstractC3255y.h(pm, "pm");
                String J8 = appAux.J();
                AbstractC3255y.f(J8);
                ApplicationInfo a8 = q.a(pm, J8, 128);
                d dVar = d.f9161a;
                String str2 = a8.sourceDir;
                AbstractC3255y.h(str2, "aPackage.sourceDir");
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
                this.f31113b.b("upload", C3679s.f36530a.a(bundle));
                C3674n a9 = C3674n.f36505t.a(this.f31112a);
                a9.a();
                appAux.A0(h8);
                AbstractC3255y.h(appAux, "appAux");
                a9.m1(appAux);
                a9.l();
                return null;
            }
            C3674n a10 = C3674n.f36505t.a(this.f31112a);
            a10.a();
            AbstractC3255y.h(appAux, "appAux");
            ArrayList U8 = a10.U(appAux);
            a10.l();
            if (U8 != null) {
                Iterator it2 = U8.iterator();
                while (it2.hasNext()) {
                    r rVar = (r) it2.next();
                    PackageManager packageManager = pm;
                    if (n.s(str, rVar.b(), true) && rVar.a() != null) {
                        d dVar2 = d.f9161a;
                        String a11 = rVar.a();
                        AbstractC3255y.f(a11);
                        String h9 = dVar2.h(a11);
                        if (n.s(str, h9, true)) {
                            return rVar.a();
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("type", "ignored");
                        bundle2.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "hashNotMatch");
                        bundle2.putString("filehash", str);
                        bundle2.putString("packagename", appAux.J());
                        bundle2.putString("filehashCalculated", h9);
                        this.f31113b.b("upload", C3679s.f36530a.a(bundle2));
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
        this.f31113b.b("upload", C3679s.f36530a.a(bundle3));
        return null;
    }

    private final String b() {
        ResultReceiverC1979d a8 = ResultReceiverC1979d.f15515a.a();
        if (new C3676p().c(this.f31112a) && c()) {
            C1647n c1647n = new C1647n();
            c1647n.h(this.f31112a);
            C3660F c3660f = new C3660F(this.f31112a, a8);
            String d8 = c1647n.d();
            AbstractC3255y.f(d8);
            I u8 = c3660f.u(d8);
            this.f31113b.e("getFileToUpload", null, u8, null);
            if (c3660f.g(u8) && u8.d() != null) {
                String d9 = u8.d();
                AbstractC3255y.f(d9);
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
        UptodownApp.a aVar = UptodownApp.f29058B;
        if (!aVar.V("DownloadUpdatesWorker", this.f31112a) && !aVar.V("downloadApkWorker", this.f31112a)) {
            return true;
        }
        return false;
    }

    private final boolean d(String str, String str2, ResultReceiverC1979d resultReceiverC1979d) {
        boolean c8 = new C3676p().c(this.f31112a);
        if (c8 && c()) {
            File file = new File(str);
            if (file.exists()) {
                long length = file.length();
                C3680t c3680t = C3680t.f36531a;
                if (c3680t.f()) {
                    return C3782d.b(new C3782d(), this.f31112a, file, str2, resultReceiverC1979d, false, 16, null);
                }
                if (c3680t.e()) {
                    P a8 = P.f14055c.a(this.f31112a);
                    if (length > 0 && length < a8.a(this.f31112a)) {
                        return new C3782d().a(this.f31112a, file, str2, resultReceiverC1979d, true);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("type", "ignored");
                    bundle.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "size");
                    C3679s c3679s = C3679s.f36530a;
                    bundle.putString("size", c3679s.d(length));
                    this.f31113b.b("upload", c3679s.a(bundle));
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("type", "ignored");
                    bundle2.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "connection");
                    C3679s c3679s2 = C3679s.f36530a;
                    bundle2.putString("size", c3679s2.d(length));
                    this.f31113b.b("upload", c3679s2.a(bundle2));
                }
            } else {
                Bundle bundle3 = new Bundle();
                bundle3.putString("type", "ignored");
                bundle3.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "fileNotFound");
                this.f31113b.b("upload", C3679s.f36530a.a(bundle3));
            }
        } else {
            Bundle bundle4 = new Bundle();
            bundle4.putString("type", "ignored");
            if (!c8) {
                bundle4.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "battery");
            } else {
                bundle4.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "notIdle");
            }
            this.f31113b.b("upload", C3679s.f36530a.a(bundle4));
        }
        return false;
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        String b8 = b();
        if (b8 != null) {
            C3674n a8 = C3674n.f36505t.a(this.f31112a);
            a8.a();
            ArrayList V7 = a8.V();
            a8.l();
            String a9 = a(b8, V7);
            if (a9 != null && d(a9, b8, ResultReceiverC1979d.f15515a.a())) {
                UptodownApp.a.N0(UptodownApp.f29058B, this.f31112a, false, 2, null);
            }
        }
        ListenableWorker.Result success = ListenableWorker.Result.success();
        AbstractC3255y.h(success, "success()");
        return success;
    }
}
