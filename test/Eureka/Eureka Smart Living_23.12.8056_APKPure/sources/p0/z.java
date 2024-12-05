package p0;

import o0.f;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    WebViewProviderBoundaryInterface f8780a;

    public z(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.f8780a = webViewProviderBoundaryInterface;
    }

    public void a(String str, String[] strArr, f.a aVar) {
        this.f8780a.addWebMessageListener(str, strArr, q5.a.c(new v(aVar)));
    }
}
