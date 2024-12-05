package com.uptodown.workers;

import E4.j;
import N4.d;
import N4.q;
import X4.C1505o;
import X4.O;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import g6.n;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3307A;
import l5.C3323k;
import l5.C3330r;

/* loaded from: classes5.dex */
public class DownloadWorker extends Worker {

    /* renamed from: c */
    public static final a f30020c = new a(null);

    /* renamed from: d */
    private static boolean f30021d;

    /* renamed from: e */
    private static boolean f30022e;

    /* renamed from: f */
    private static boolean f30023f;

    /* renamed from: g */
    private static boolean f30024g;

    /* renamed from: h */
    private static boolean f30025h;

    /* renamed from: a */
    private Context f30026a;

    /* renamed from: b */
    private C3330r f30027b;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final boolean a() {
            return DownloadWorker.f30021d;
        }

        public final boolean b() {
            return DownloadWorker.f30023f;
        }

        public final boolean c() {
            return DownloadWorker.f30022e;
        }

        public final boolean d() {
            return DownloadWorker.f30024g;
        }

        public final boolean e() {
            return DownloadWorker.f30025h;
        }

        public final void f() {
            l(true);
        }

        public final void g() {
            m(true);
        }

        public final void h() {
            l(false);
        }

        public final void i() {
            m(false);
        }

        public final void j(boolean z8) {
            DownloadWorker.f30021d = z8;
        }

        public final void k(boolean z8) {
            DownloadWorker.f30023f = z8;
        }

        public final void l(boolean z8) {
            DownloadWorker.f30022e = z8;
        }

        public final void m(boolean z8) {
            DownloadWorker.f30024g = z8;
        }

        public final void n(boolean z8) {
            DownloadWorker.f30025h = z8;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public interface b {
        void a(int i8, long j8);

        void b(long j8);

        void c();

        void d(long j8);

        void e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(params, "params");
        this.f30026a = context;
    }

    private final void E(O o8, String str, String str2, long j8) {
        if (o8 != null) {
            Bundle bundle = new Bundle();
            bundle.putString("packagename", o8.n());
            C3307A.f34473a.g().send(102, bundle);
            Bundle bundle2 = new Bundle();
            bundle2.putString("exception", str);
            B(o8, bundle2, str2, j8);
            return;
        }
        F(str, j8);
    }

    private final void F(String str, long j8) {
        Bundle bundle = new Bundle();
        bundle.putString("exception", str);
        bundle.putString("type", "fail");
        p(" (109)", "download", bundle, j8);
    }

    public static /* synthetic */ HttpsURLConnection I(DownloadWorker downloadWorker, String str, long j8, O o8, String str2, int i8, Object obj) {
        O o9;
        String str3;
        if (obj == null) {
            if ((i8 & 4) != 0) {
                o9 = null;
            } else {
                o9 = o8;
            }
            if ((i8 & 8) != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            return downloadWorker.H(str, j8, o9, str3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolveRedirect");
    }

    private final void m(InputStream inputStream, OutputStream outputStream, HttpsURLConnection httpsURLConnection) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e8) {
                e8.printStackTrace();
            }
        }
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e9) {
                e9.printStackTrace();
            }
        }
        httpsURLConnection.disconnect();
    }

    private final long r(HttpsURLConnection httpsURLConnection) {
        long contentLengthLong;
        if (Build.VERSION.SDK_INT >= 24) {
            contentLengthLong = httpsURLConnection.getContentLengthLong();
            return contentLengthLong;
        }
        return httpsURLConnection.getContentLength();
    }

    public void A(O update, Bundle bundle, String str) {
        AbstractC3159y.i(update, "update");
        AbstractC3159y.i(bundle, "bundle");
    }

    public void B(O update, Bundle bundleParamsFail, String str, long j8) {
        AbstractC3159y.i(update, "update");
        AbstractC3159y.i(bundleParamsFail, "bundleParamsFail");
    }

    public final boolean C(HttpsURLConnection urlConnection, long j8) {
        AbstractC3159y.i(urlConnection, "urlConnection");
        urlConnection.connect();
        int responseCode = urlConnection.getResponseCode();
        if (responseCode >= 200 && responseCode < 300) {
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "fail");
        bundle.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, NotificationCompat.CATEGORY_STATUS);
        bundle.putString("responseCode", String.valueOf(responseCode));
        p(" (105)", "download", bundle, j8);
        return false;
    }

    public final boolean D(HttpsURLConnection urlConnection, O update, long j8) {
        AbstractC3159y.i(urlConnection, "urlConnection");
        AbstractC3159y.i(update, "update");
        urlConnection.connect();
        int responseCode = urlConnection.getResponseCode();
        if (responseCode >= 200 && responseCode < 300) {
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putString("packagename", update.n());
        C3307A.f34473a.g().send(102, bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, NotificationCompat.CATEGORY_STATUS);
        bundle2.putString("responseCode", String.valueOf(responseCode));
        B(update, bundle2, urlConnection.getURL().getHost(), j8);
        return false;
    }

    public void G(String errorCode, String event, Bundle bundle, long j8, O o8, String str) {
        AbstractC3159y.i(errorCode, "errorCode");
        AbstractC3159y.i(event, "event");
        AbstractC3159y.i(bundle, "bundle");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017f  */
    /* JADX WARN: Type inference failed for: r0v44, types: [l5.A] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.net.HttpURLConnection, javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.net.HttpURLConnection, javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r8v0, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r8v5, types: [l5.A] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final javax.net.ssl.HttpsURLConnection H(java.lang.String r24, long r25, X4.O r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.DownloadWorker.H(java.lang.String, long, X4.O, java.lang.String):javax.net.ssl.HttpsURLConnection");
    }

    public void J(C1505o download, int i8) {
        AbstractC3159y.i(download, "download");
    }

    public void K(O update, int i8) {
        AbstractC3159y.i(update, "update");
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        ListenableWorker.Result failure = ListenableWorker.Result.failure();
        AbstractC3159y.h(failure, "failure()");
        return failure;
    }

    public final Bundle k(long j8, long j9, File file, long j10, String filehashExpected) {
        AbstractC3159y.i(file, "file");
        AbstractC3159y.i(filehashExpected, "filehashExpected");
        if (file.length() > 0) {
            long j11 = j8 + j9;
            if (j10 != 0 && (j11 != j10 || file.length() != j11)) {
                Bundle bundle = new Bundle();
                bundle.putString("type", "fail");
                bundle.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "size_not_match");
                return bundle;
            }
            boolean z8 = false;
            String str = null;
            int i8 = 0;
            while (!z8 && i8 < 3) {
                i8++;
                if (file.length() == j11 && (str = d.f7201a.e(file.getAbsolutePath())) != null && n.s(str, filehashExpected, true)) {
                    z8 = true;
                }
            }
            if (str == null) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("type", "fail");
                bundle2.putString("filehash", filehashExpected);
                bundle2.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "filehash_calculated_null");
                return bundle2;
            }
            if (z8) {
                return null;
            }
            Bundle bundle3 = new Bundle();
            bundle3.putString("type", "fail");
            bundle3.putString("filehash", filehashExpected);
            bundle3.putString("filehashCalculated", str);
            bundle3.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "filehash_not_match");
            return bundle3;
        }
        Bundle bundle4 = new Bundle();
        bundle4.putString("type", "fail");
        bundle4.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "size_zero");
        return bundle4;
    }

    public final File l(File file, Context context) {
        PackageInfo packageInfo;
        AbstractC3159y.i(file, "file");
        AbstractC3159y.i(context, "context");
        String name = file.getName();
        AbstractC3159y.h(name, "file.name");
        if (n.r(name, ".apk", false, 2, null)) {
            try {
                PackageManager pm = context.getPackageManager();
                AbstractC3159y.h(pm, "pm");
                String absolutePath = file.getAbsolutePath();
                AbstractC3159y.h(absolutePath, "file.absolutePath");
                packageInfo = q.c(pm, absolutePath, 1);
            } catch (Exception unused) {
                packageInfo = null;
            }
            if (packageInfo != null) {
                return null;
            }
            return new C3323k().f(file, context);
        }
        String name2 = file.getName();
        AbstractC3159y.h(name2, "file.name");
        if (!n.r(name2, ".xapk", false, 2, null)) {
            return null;
        }
        return new C3323k().e(file, context);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 5 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 7 */
    public final long n(javax.net.ssl.HttpsURLConnection r42, java.io.File r43, X4.C1505o r44, java.lang.String r45, long r46, com.uptodown.workers.DownloadWorker.b r48) {
        /*
            Method dump skipped, instructions count: 2974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.DownloadWorker.n(javax.net.ssl.HttpsURLConnection, java.io.File, X4.o, java.lang.String, long, com.uptodown.workers.DownloadWorker$b):long");
    }

    public void o() {
    }

    public void p(String errorCode, String event, Bundle bundle, long j8) {
        AbstractC3159y.i(errorCode, "errorCode");
        AbstractC3159y.i(event, "event");
        AbstractC3159y.i(bundle, "bundle");
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 7 */
    public final long q(javax.net.ssl.HttpsURLConnection r46, java.io.File r47, X4.O r48, java.lang.String r49, long r50, com.uptodown.workers.DownloadWorker.b r52) {
        /*
            Method dump skipped, instructions count: 2017
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.DownloadWorker.q(javax.net.ssl.HttpsURLConnection, java.io.File, X4.O, java.lang.String, long, com.uptodown.workers.DownloadWorker$b):long");
    }

    public final Context s() {
        return this.f30026a;
    }

    public final String t(String url) {
        AbstractC3159y.i(url, "url");
        if (n.X(url, ".", 0, false, 6, null) == -1) {
            return "apk";
        }
        String substring = url.substring(n.X(url, ".", 0, false, 6, null) + 1);
        AbstractC3159y.h(substring, "substring(...)");
        if (substring.length() == 0) {
            return "apk";
        }
        return substring;
    }

    public final String u(String url) {
        AbstractC3159y.i(url, "url");
        String substring = url.substring(n.X(url, "/", 0, false, 6, null) + 1);
        AbstractC3159y.h(substring, "substring(...)");
        return substring;
    }

    public final C3330r v() {
        return this.f30027b;
    }

    public final void w() {
        Context a8 = j.f2274g.a(this.f30026a);
        this.f30026a = a8;
        this.f30027b = new C3330r(a8);
    }

    public boolean x() {
        return false;
    }

    public boolean y(O update) {
        AbstractC3159y.i(update, "update");
        return false;
    }

    public void z(Bundle bundle, String str) {
        AbstractC3159y.i(bundle, "bundle");
    }
}
