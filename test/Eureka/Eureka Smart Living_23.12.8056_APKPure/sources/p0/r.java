package p0;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes.dex */
public class r implements a0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f8742a = new String[0];

    @Override // p0.a0
    public String[] a() {
        return f8742a;
    }

    @Override // p0.a0
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
}
