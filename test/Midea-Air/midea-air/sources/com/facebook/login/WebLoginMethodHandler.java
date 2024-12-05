package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import cm.aptoide.pt.account.view.LoginActivity;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.internal.x;
import com.facebook.login.LoginClient;
import java.util.Locale;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class WebLoginMethodHandler extends LoginMethodHandler {

    /* renamed from: h, reason: collision with root package name */
    private String f9331h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    private String t() {
        return this.f9330g.i().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    private void v(String str) {
        this.f9330g.i().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str).apply();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Bundle n(Bundle bundle, LoginClient.Request request) {
        bundle.putString("redirect_uri", q());
        bundle.putString("client_id", request.a());
        bundle.putString("e2e", LoginClient.k());
        bundle.putString("response_type", "token,signed_request,graph_domain");
        bundle.putString("return_scopes", "true");
        bundle.putString(LoginActivity.AUTH_TYPE, request.c());
        bundle.putString("login_behavior", request.g().name());
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", com.facebook.f.t()));
        if (r() != null) {
            bundle.putString("sso", r());
        }
        bundle.putString("cct_prefetching", com.facebook.f.q ? "1" : "0");
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Bundle p(LoginClient.Request request) {
        Bundle bundle = new Bundle();
        if (!x.R(request.h())) {
            String join = TextUtils.join(",", request.h());
            bundle.putString("scope", join);
            a("scope", join);
        }
        bundle.putString("default_audience", request.d().d());
        bundle.putString("state", e(request.b()));
        AccessToken g2 = AccessToken.g();
        String r = g2 != null ? g2.r() : null;
        if (r != null && r.equals(t())) {
            bundle.putString("access_token", r);
            a("access_token", "1");
        } else {
            x.g(this.f9330g.i());
            a("access_token", "0");
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        bundle.putString("ies", com.facebook.f.i() ? "1" : "0");
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String q() {
        return "fb" + com.facebook.f.f() + "://authorize";
    }

    protected String r() {
        return null;
    }

    abstract com.facebook.c s();

    /* JADX INFO: Access modifiers changed from: protected */
    public void u(LoginClient.Request request, Bundle bundle, FacebookException facebookException) {
        String str;
        LoginClient.Result c2;
        this.f9331h = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f9331h = bundle.getString("e2e");
            }
            try {
                AccessToken d2 = LoginMethodHandler.d(request.h(), bundle, s(), request.a());
                c2 = LoginClient.Result.d(this.f9330g.r(), d2);
                CookieSyncManager.createInstance(this.f9330g.i()).sync();
                v(d2.r());
            } catch (FacebookException e2) {
                c2 = LoginClient.Result.b(this.f9330g.r(), null, e2.getMessage());
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            c2 = LoginClient.Result.a(this.f9330g.r(), "User canceled log in.");
        } else {
            this.f9331h = null;
            String message = facebookException.getMessage();
            if (facebookException instanceof FacebookServiceException) {
                FacebookRequestError a = ((FacebookServiceException) facebookException).a();
                str = String.format(Locale.ROOT, "%d", Integer.valueOf(a.c()));
                message = a.toString();
            } else {
                str = null;
            }
            c2 = LoginClient.Result.c(this.f9330g.r(), null, message, str);
        }
        if (!x.Q(this.f9331h)) {
            h(this.f9331h);
        }
        this.f9330g.g(c2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
