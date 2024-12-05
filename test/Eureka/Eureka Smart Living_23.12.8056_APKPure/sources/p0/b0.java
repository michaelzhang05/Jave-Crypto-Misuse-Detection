package p0;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes.dex */
public class b0 implements a0 {

    /* renamed from: a, reason: collision with root package name */
    final WebViewProviderFactoryBoundaryInterface f8741a;

    public b0(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f8741a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // p0.a0
    public String[] a() {
        return this.f8741a.getSupportedFeatures();
    }

    @Override // p0.a0
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) q5.a.a(WebViewProviderBoundaryInterface.class, this.f8741a.createWebView(webView));
    }
}
