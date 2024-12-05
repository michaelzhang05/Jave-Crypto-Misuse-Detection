package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import cm.aptoide.pt.account.view.LoginActivity;
import com.facebook.FacebookException;
import com.facebook.internal.x;
import com.facebook.internal.z;
import com.facebook.login.LoginClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class WebViewLoginMethodHandler extends WebLoginMethodHandler {
    public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new b();

    /* renamed from: i, reason: collision with root package name */
    private z f9332i;

    /* renamed from: j, reason: collision with root package name */
    private String f9333j;

    /* loaded from: classes.dex */
    class a implements z.g {
        final /* synthetic */ LoginClient.Request a;

        a(LoginClient.Request request) {
            this.a = request;
        }

        @Override // com.facebook.internal.z.g
        public void a(Bundle bundle, FacebookException facebookException) {
            WebViewLoginMethodHandler.this.w(this.a, bundle, facebookException);
        }
    }

    /* loaded from: classes.dex */
    static class b implements Parcelable.Creator<WebViewLoginMethodHandler> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WebViewLoginMethodHandler createFromParcel(Parcel parcel) {
            return new WebViewLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public WebViewLoginMethodHandler[] newArray(int i2) {
            return new WebViewLoginMethodHandler[i2];
        }
    }

    /* loaded from: classes.dex */
    static class c extends z.e {

        /* renamed from: h, reason: collision with root package name */
        private String f9335h;

        /* renamed from: i, reason: collision with root package name */
        private String f9336i;

        /* renamed from: j, reason: collision with root package name */
        private String f9337j;

        /* renamed from: k, reason: collision with root package name */
        private d f9338k;

        public c(Context context, String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
            this.f9337j = "fbconnect://success";
            this.f9338k = d.NATIVE_WITH_FALLBACK;
        }

        @Override // com.facebook.internal.z.e
        public z a() {
            Bundle f2 = f();
            f2.putString("redirect_uri", this.f9337j);
            f2.putString("client_id", c());
            f2.putString("e2e", this.f9335h);
            f2.putString("response_type", "token,signed_request,graph_domain");
            f2.putString("return_scopes", "true");
            f2.putString(LoginActivity.AUTH_TYPE, this.f9336i);
            f2.putString("login_behavior", this.f9338k.name());
            return z.q(d(), "oauth", f2, g(), e());
        }

        public c i(String str) {
            this.f9336i = str;
            return this;
        }

        public c j(String str) {
            this.f9335h = str;
            return this;
        }

        public c k(boolean z) {
            this.f9337j = z ? "fbconnect://chrome_os_success" : "fbconnect://success";
            return this;
        }

        public c l(d dVar) {
            this.f9338k = dVar;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    public void b() {
        z zVar = this.f9332i;
        if (zVar != null) {
            zVar.cancel();
            this.f9332i = null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    public String f() {
        return "web_view";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    public boolean i() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    public boolean m(LoginClient.Request request) {
        Bundle p = p(request);
        a aVar = new a(request);
        String k2 = LoginClient.k();
        this.f9333j = k2;
        a("e2e", k2);
        androidx.fragment.app.c i2 = this.f9330g.i();
        this.f9332i = new c(i2, request.a(), p).j(this.f9333j).k(x.L(i2)).i(request.c()).l(request.g()).h(aVar).a();
        com.facebook.internal.g gVar = new com.facebook.internal.g();
        gVar.setRetainInstance(true);
        gVar.h(this.f9332i);
        gVar.show(i2.getSupportFragmentManager(), "FacebookDialogFragment");
        return true;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    com.facebook.c s() {
        return com.facebook.c.WEB_VIEW;
    }

    void w(LoginClient.Request request, Bundle bundle, FacebookException facebookException) {
        super.u(request, bundle, facebookException);
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.f9333j);
    }

    WebViewLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f9333j = parcel.readString();
    }
}
