package com.facebook.login;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.FacebookException;
import com.facebook.internal.v;
import com.facebook.internal.x;
import com.facebook.login.LoginClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {
    /* JADX INFO: Access modifiers changed from: package-private */
    public NativeAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    private String n(Bundle bundle) {
        String string = bundle.getString("error");
        return string == null ? bundle.getString("error_type") : string;
    }

    private String p(Bundle bundle) {
        String string = bundle.getString("error_message");
        return string == null ? bundle.getString("error_description") : string;
    }

    private LoginClient.Result q(LoginClient.Request request, Intent intent) {
        Bundle extras = intent.getExtras();
        String n = n(extras);
        String obj = extras.get("error_code") != null ? extras.get("error_code").toString() : null;
        if ("CONNECTION_FAILURE".equals(obj)) {
            return LoginClient.Result.c(request, n, p(extras), obj);
        }
        return LoginClient.Result.a(request, n);
    }

    private LoginClient.Result r(LoginClient.Request request, Intent intent) {
        Bundle extras = intent.getExtras();
        String n = n(extras);
        String obj = extras.get("error_code") != null ? extras.get("error_code").toString() : null;
        String p = p(extras);
        String string = extras.getString("e2e");
        if (!x.Q(string)) {
            h(string);
        }
        if (n == null && obj == null && p == null) {
            try {
                return LoginClient.Result.d(request, LoginMethodHandler.d(request.h(), extras, com.facebook.c.FACEBOOK_APPLICATION_WEB, request.a()));
            } catch (FacebookException e2) {
                return LoginClient.Result.b(request, null, e2.getMessage());
            }
        }
        if (n.equals("logged_out")) {
            CustomTabLoginMethodHandler.f9275i = true;
            return null;
        }
        if (v.a.contains(n)) {
            return null;
        }
        if (v.f9225b.contains(n)) {
            return LoginClient.Result.a(request, null);
        }
        return LoginClient.Result.c(request, n, p, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    public boolean j(int i2, int i3, Intent intent) {
        LoginClient.Result r;
        LoginClient.Request r2 = this.f9330g.r();
        if (intent == null) {
            r = LoginClient.Result.a(r2, "Operation canceled");
        } else if (i3 == 0) {
            r = q(r2, intent);
        } else if (i3 != -1) {
            r = LoginClient.Result.b(r2, "Unexpected resultCode from authorization.", null);
        } else {
            r = r(r2, intent);
        }
        if (r != null) {
            this.f9330g.g(r);
            return true;
        }
        this.f9330g.D();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean s(Intent intent, int i2) {
        if (intent == null) {
            return false;
        }
        try {
            this.f9330g.l().startActivityForResult(intent, i2);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NativeAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
