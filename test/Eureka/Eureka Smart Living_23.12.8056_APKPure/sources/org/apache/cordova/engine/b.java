package org.apache.cordova.engine;

import android.webkit.JavascriptInterface;
import m5.f;

/* loaded from: classes.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private final f f8412a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(f fVar) {
        this.f8412a = fVar;
    }

    @JavascriptInterface
    public String exec(int i6, String str, String str2, String str3, String str4) {
        return this.f8412a.c(i6, str, str2, str3, str4);
    }

    @JavascriptInterface
    public String retrieveJsMessages(int i6, boolean z5) {
        return this.f8412a.d(i6, z5);
    }

    @JavascriptInterface
    public void setNativeToJsBridgeMode(int i6, int i7) {
        this.f8412a.e(i6, i7);
    }
}
