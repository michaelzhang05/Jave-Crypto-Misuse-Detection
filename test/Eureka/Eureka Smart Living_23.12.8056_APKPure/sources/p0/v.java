package p0;

import android.net.Uri;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import o0.f;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

/* loaded from: classes.dex */
public class v implements WebMessageListenerBoundaryInterface {

    /* renamed from: a, reason: collision with root package name */
    private f.a f8749a;

    public v(f.a aVar) {
        this.f8749a = aVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z5, InvocationHandler invocationHandler2) {
        o0.c b6 = u.b((WebMessageBoundaryInterface) q5.a.a(WebMessageBoundaryInterface.class, invocationHandler));
        if (b6 != null) {
            this.f8749a.a(webView, b6, uri, z5, s.b(invocationHandler2));
        }
    }
}
