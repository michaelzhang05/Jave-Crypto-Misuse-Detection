package o0;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import p0.a0;
import p0.x;
import p0.y;
import p0.z;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final Uri f8213a = Uri.parse("*");

    /* renamed from: b, reason: collision with root package name */
    private static final Uri f8214b = Uri.parse("");

    /* loaded from: classes.dex */
    public interface a {
        void a(WebView webView, c cVar, Uri uri, boolean z5, o0.a aVar);
    }

    public static void a(WebView webView, String str, Set set, a aVar) {
        if (!x.U.d()) {
            throw x.a();
        }
        f(webView).a(str, (String[]) set.toArray(new String[0]), aVar);
    }

    private static WebViewProviderBoundaryInterface b(WebView webView) {
        return d().createWebView(webView);
    }

    public static PackageInfo c() {
        if (Build.VERSION.SDK_INT >= 26) {
            return p0.g.a();
        }
        try {
            return e();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    private static a0 d() {
        return y.c();
    }

    private static PackageInfo e() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }

    private static z f(WebView webView) {
        return new z(b(webView));
    }
}
