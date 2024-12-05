package com.getcapacitor.plugin;

import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.getcapacitor.a1;
import com.getcapacitor.j0;
import com.getcapacitor.u0;
import com.getcapacitor.v0;
import java.io.UnsupportedEncodingException;
import java.net.CookieHandler;
import java.net.CookiePolicy;
import java.net.HttpCookie;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

@v0.b
/* loaded from: classes.dex */
public class CapacitorCookies extends u0 {
    a cookieManager;

    private boolean isAllowingInsecureCookies() {
        return getBridge().n().l("CapacitorCookies").c("androidCustomSchemeAllowInsecureAccess", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getCookies$0(v0 v0Var, String str) {
        String[] split = str.substring(1, str.length() - 1).split(";");
        j0 j0Var = new j0();
        for (String str2 : split) {
            if (str2.length() > 0) {
                String[] split2 = str2.split("=", 2);
                if (split2.length == 2) {
                    String trim = split2[0].trim();
                    String trim2 = split2[1].trim();
                    try {
                        trim = URLDecoder.decode(split2[0].trim(), StandardCharsets.UTF_8.name());
                        trim2 = URLDecoder.decode(split2[1].trim(), StandardCharsets.UTF_8.name());
                    } catch (UnsupportedEncodingException unused) {
                    }
                    j0Var.m(trim, trim2);
                }
            }
        }
        v0Var.x(j0Var);
    }

    @a1
    public void clearAllCookies(v0 v0Var) {
        this.cookieManager.f();
        v0Var.w();
    }

    @a1
    public void clearCookies(v0 v0Var) {
        String n6 = v0Var.n("url");
        for (HttpCookie httpCookie : this.cookieManager.c(n6)) {
            this.cookieManager.h(n6, httpCookie.getName() + "=; Expires=Wed, 31 Dec 2000 23:59:59 GMT");
        }
        v0Var.w();
    }

    @a1
    public void deleteCookie(v0 v0Var) {
        String n6 = v0Var.n("key");
        if (n6 == null) {
            v0Var.r("Must provide key");
        }
        String n7 = v0Var.n("url");
        this.cookieManager.h(n7, n6 + "=; Expires=Wed, 31 Dec 2000 23:59:59 GMT");
        v0Var.w();
    }

    @a1
    public void getCookies(final v0 v0Var) {
        if (!isAllowingInsecureCookies()) {
            this.bridge.g("document.cookie", new ValueCallback() { // from class: com.getcapacitor.plugin.b
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    CapacitorCookies.lambda$getCookies$0(v0.this, (String) obj);
                }
            });
            return;
        }
        String n6 = v0Var.n("url");
        j0 j0Var = new j0();
        for (HttpCookie httpCookie : this.cookieManager.c(n6)) {
            j0Var.m(httpCookie.getName(), httpCookie.getValue());
        }
        v0Var.x(j0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.getcapacitor.u0
    public void handleOnDestroy() {
        super.handleOnDestroy();
        this.cookieManager.g();
    }

    @JavascriptInterface
    public boolean isEnabled() {
        return getBridge().n().l("CapacitorCookies").c("enabled", false);
    }

    @Override // com.getcapacitor.u0
    public void load() {
        this.bridge.G().addJavascriptInterface(this, "CapacitorCookiesAndroidInterface");
        a aVar = new a(null, CookiePolicy.ACCEPT_ALL, this.bridge);
        this.cookieManager = aVar;
        aVar.g();
        CookieHandler.setDefault(this.cookieManager);
        super.load();
    }

    @a1
    public void setCookie(v0 v0Var) {
        String n6 = v0Var.n("key");
        if (n6 == null) {
            v0Var.r("Must provide key");
        }
        String n7 = v0Var.n("value");
        if (n7 == null) {
            v0Var.r("Must provide value");
        }
        this.cookieManager.i(v0Var.n("url"), n6, n7, v0Var.o("expires", ""), v0Var.o("path", "/"));
        v0Var.w();
    }

    @JavascriptInterface
    public void setCookie(String str, String str2) {
        this.cookieManager.h(str, str2);
    }
}
