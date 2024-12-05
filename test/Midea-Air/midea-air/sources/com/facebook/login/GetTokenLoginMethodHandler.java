package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import cm.aptoide.pt.DeepLinkIntentReceiver;
import com.facebook.FacebookException;
import com.facebook.internal.t;
import com.facebook.internal.x;
import com.facebook.login.LoginClient;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class GetTokenLoginMethodHandler extends LoginMethodHandler {
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new c();

    /* renamed from: h, reason: collision with root package name */
    private com.facebook.login.c f9302h;

    /* loaded from: classes.dex */
    class a implements t.b {
        final /* synthetic */ LoginClient.Request a;

        a(LoginClient.Request request) {
            this.a = request;
        }

        @Override // com.facebook.internal.t.b
        public void a(Bundle bundle) {
            GetTokenLoginMethodHandler.this.p(this.a, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements x.c {
        final /* synthetic */ Bundle a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LoginClient.Request f9304b;

        b(Bundle bundle, LoginClient.Request request) {
            this.a = bundle;
            this.f9304b = request;
        }

        @Override // com.facebook.internal.x.c
        public void a(JSONObject jSONObject) {
            try {
                this.a.putString("com.facebook.platform.extra.USER_ID", jSONObject.getString(DeepLinkIntentReceiver.DeepLinksKeys.ID));
                GetTokenLoginMethodHandler.this.q(this.f9304b, this.a);
            } catch (JSONException e2) {
                LoginClient loginClient = GetTokenLoginMethodHandler.this.f9330g;
                loginClient.f(LoginClient.Result.b(loginClient.r(), "Caught exception", e2.getMessage()));
            }
        }

        @Override // com.facebook.internal.x.c
        public void b(FacebookException facebookException) {
            LoginClient loginClient = GetTokenLoginMethodHandler.this.f9330g;
            loginClient.f(LoginClient.Result.b(loginClient.r(), "Caught exception", facebookException.getMessage()));
        }
    }

    /* loaded from: classes.dex */
    static class c implements Parcelable.Creator {
        c() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetTokenLoginMethodHandler createFromParcel(Parcel parcel) {
            return new GetTokenLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetTokenLoginMethodHandler[] newArray(int i2) {
            return new GetTokenLoginMethodHandler[i2];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    @Override // com.facebook.login.LoginMethodHandler
    void b() {
        com.facebook.login.c cVar = this.f9302h;
        if (cVar != null) {
            cVar.b();
            this.f9302h.f(null);
            this.f9302h = null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    String f() {
        return "get_token";
    }

    @Override // com.facebook.login.LoginMethodHandler
    boolean m(LoginClient.Request request) {
        com.facebook.login.c cVar = new com.facebook.login.c(this.f9330g.i(), request.a());
        this.f9302h = cVar;
        if (!cVar.g()) {
            return false;
        }
        this.f9330g.u();
        this.f9302h.f(new a(request));
        return true;
    }

    void n(LoginClient.Request request, Bundle bundle) {
        String string = bundle.getString("com.facebook.platform.extra.USER_ID");
        if (string != null && !string.isEmpty()) {
            q(request, bundle);
        } else {
            this.f9330g.u();
            x.y(bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), new b(bundle, request));
        }
    }

    void p(LoginClient.Request request, Bundle bundle) {
        com.facebook.login.c cVar = this.f9302h;
        if (cVar != null) {
            cVar.f(null);
        }
        this.f9302h = null;
        this.f9330g.v();
        if (bundle != null) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            Set<String> h2 = request.h();
            if (stringArrayList != null && (h2 == null || stringArrayList.containsAll(h2))) {
                n(request, bundle);
                return;
            }
            HashSet hashSet = new HashSet();
            for (String str : h2) {
                if (!stringArrayList.contains(str)) {
                    hashSet.add(str);
                }
            }
            if (!hashSet.isEmpty()) {
                a("new_permissions", TextUtils.join(",", hashSet));
            }
            request.k(hashSet);
        }
        this.f9330g.D();
    }

    void q(LoginClient.Request request, Bundle bundle) {
        this.f9330g.g(LoginClient.Result.d(this.f9330g.r(), LoginMethodHandler.c(bundle, com.facebook.c.FACEBOOK_APPLICATION_SERVICE, request.a())));
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
    }

    GetTokenLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
