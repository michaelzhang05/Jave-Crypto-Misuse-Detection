package o5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import androidx.core.content.ContextCompat;
import b5.ResultReceiverC1980e;
import b5.ResultReceiverC1981f;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import j$.util.DesugarTimeZone;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: o5.A, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3655A {

    /* renamed from: a, reason: collision with root package name */
    public static final C3655A f36474a = new C3655A();

    /* renamed from: b, reason: collision with root package name */
    private static ArrayList f36475b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private static ResultReceiverC1981f f36476c = new ResultReceiverC1981f(null);

    /* renamed from: d, reason: collision with root package name */
    private static ResultReceiverC1980e f36477d = new ResultReceiverC1980e(null);

    /* renamed from: e, reason: collision with root package name */
    private static ConcurrentHashMap f36478e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private static ArrayList f36479f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private static ArrayList f36480g = new ArrayList();

    private C3655A() {
    }

    public final void a(long j8) {
        f36480g.add(Long.valueOf(j8));
    }

    public final void b(long j8) {
        f36479f.add(Long.valueOf(j8));
    }

    public final Spanned c(String str) {
        Spanned fromHtml;
        if (Build.VERSION.SDK_INT >= 24) {
            fromHtml = Html.fromHtml(str, 0);
            AbstractC3255y.h(fromHtml, "fromHtml(html, HtmlCompat.FROM_HTML_MODE_LEGACY)");
            return fromHtml;
        }
        Spanned fromHtml2 = Html.fromHtml(str);
        AbstractC3255y.h(fromHtml2, "fromHtml(html)");
        return fromHtml2;
    }

    public final ArrayList d() {
        return f36475b;
    }

    public final String e() {
        DateFormat timeInstance = DateFormat.getTimeInstance();
        timeInstance.setTimeZone(DesugarTimeZone.getTimeZone("gmt"));
        timeInstance.format(new Date(System.currentTimeMillis()));
        long timeInMillis = (timeInstance.getCalendar().getTimeInMillis() - (((r0.get(12) * MBridgeCommon.DEFAULT_LOAD_TIMEOUT) + (r0.get(13) * 1000)) + r0.get(14))) / 1000;
        return Q4.d.f9161a.c("$(=a%·!45J&S" + timeInMillis);
    }

    public final ResultReceiverC1980e f() {
        return f36477d;
    }

    public final ResultReceiverC1981f g() {
        return f36476c;
    }

    public final boolean h(long j8) {
        return f36480g.contains(Long.valueOf(j8));
    }

    public final boolean i(long j8) {
        return f36479f.contains(Long.valueOf(j8));
    }

    public final Drawable j(Context context, String str) {
        AbstractC3255y.i(context, "context");
        return k(context, str, -1);
    }

    public final Drawable k(Context context, String str, int i8) {
        AbstractC3255y.i(context, "context");
        if (str != null) {
            Drawable drawable = (Drawable) f36478e.get(str);
            if (drawable == null) {
                try {
                    PackageManager packageManager = context.getPackageManager();
                    AbstractC3255y.h(packageManager, "context.packageManager");
                    drawable = Q4.q.d(packageManager, str, 0).applicationInfo.loadIcon(context.getPackageManager());
                } catch (Exception unused) {
                    if (i8 != -1) {
                        drawable = ContextCompat.getDrawable(context, i8);
                    }
                }
                if (drawable != null) {
                    f36478e.put(str, drawable);
                    return drawable;
                }
                return drawable;
            }
            return drawable;
        }
        return null;
    }

    public final Drawable l(Context context, String pathFile, int i8) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(pathFile, "pathFile");
        Drawable drawable = (Drawable) f36478e.get(pathFile);
        if (drawable == null) {
            PackageManager pm = context.getPackageManager();
            try {
                AbstractC3255y.h(pm, "pm");
                PackageInfo c8 = Q4.q.c(pm, pathFile, 128);
                if (c8 != null) {
                    ApplicationInfo applicationInfo = c8.applicationInfo;
                    applicationInfo.sourceDir = pathFile;
                    applicationInfo.publicSourceDir = pathFile;
                    drawable = applicationInfo.loadIcon(pm);
                } else {
                    drawable = ContextCompat.getDrawable(context, i8);
                }
            } catch (Exception unused) {
                if (i8 != -1) {
                    drawable = ContextCompat.getDrawable(context, i8);
                }
            }
            if (drawable != null) {
                f36478e.put(pathFile, drawable);
            }
        }
        return drawable;
    }

    public final void m(long j8) {
        f36479f.remove(Long.valueOf(j8));
    }

    public final void n(HttpsURLConnection mHttpsURLConnection) {
        AbstractC3255y.i(mHttpsURLConnection, "mHttpsURLConnection");
        mHttpsURLConnection.setRequestProperty("Identificador", "Uptodown_Android");
        mHttpsURLConnection.setRequestProperty("Identificador-Version", "628");
        mHttpsURLConnection.setRequestProperty("APIKEY", e());
        mHttpsURLConnection.setConnectTimeout(MBridgeCommon.DEFAULT_LOAD_TIMEOUT);
        mHttpsURLConnection.setReadTimeout(90000);
    }
}
