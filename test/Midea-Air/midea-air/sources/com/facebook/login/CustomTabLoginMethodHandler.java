package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.internal.x;
import com.facebook.internal.y;
import com.facebook.login.LoginClient;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class CustomTabLoginMethodHandler extends WebLoginMethodHandler {
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new a();

    /* renamed from: i, reason: collision with root package name */
    public static boolean f9275i = false;

    /* renamed from: j, reason: collision with root package name */
    private String f9276j;

    /* renamed from: k, reason: collision with root package name */
    private String f9277k;
    private String l;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CustomTabLoginMethodHandler createFromParcel(Parcel parcel) {
            return new CustomTabLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CustomTabLoginMethodHandler[] newArray(int i2) {
            return new CustomTabLoginMethodHandler[i2];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.l = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f9277k = x.p(20);
        f9275i = false;
        if (y.d(com.facebook.f.e(), x())) {
            this.l = x();
        } else if (y.d(com.facebook.f.e(), com.facebook.internal.f.b())) {
            this.l = com.facebook.internal.f.b();
        }
    }

    private boolean A(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return new JSONObject(string).getString("7_challenge").equals(this.f9277k);
        } catch (JSONException unused) {
            return false;
        }
    }

    private String w() {
        String str = this.f9276j;
        if (str != null) {
            return str;
        }
        String a2 = com.facebook.internal.f.a();
        this.f9276j = a2;
        return a2;
    }

    private String x() {
        return super.q();
    }

    private boolean y() {
        return (w() == null || q().isEmpty()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void z(java.lang.String r7, com.facebook.login.LoginClient.Request r8) {
        /*
            r6 = this;
            if (r7 == 0) goto Lbb
            java.lang.String r0 = "fbconnect://cct."
            boolean r0 = r7.startsWith(r0)
            if (r0 != 0) goto L14
            java.lang.String r0 = super.q()
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto Lbb
        L14:
            android.net.Uri r7 = android.net.Uri.parse(r7)
            java.lang.String r0 = r7.getQuery()
            android.os.Bundle r0 = com.facebook.internal.x.a0(r0)
            java.lang.String r7 = r7.getFragment()
            android.os.Bundle r7 = com.facebook.internal.x.a0(r7)
            r0.putAll(r7)
            boolean r7 = r6.A(r0)
            r1 = 0
            if (r7 != 0) goto L3d
            com.facebook.FacebookException r7 = new com.facebook.FacebookException
            java.lang.String r0 = "Invalid state parameter"
            r7.<init>(r0)
            super.u(r8, r1, r7)
            return
        L3d:
            java.lang.String r7 = "error"
            java.lang.String r7 = r0.getString(r7)
            if (r7 != 0) goto L4b
            java.lang.String r7 = "error_type"
            java.lang.String r7 = r0.getString(r7)
        L4b:
            java.lang.String r2 = "error_msg"
            java.lang.String r2 = r0.getString(r2)
            if (r2 != 0) goto L59
            java.lang.String r2 = "error_message"
            java.lang.String r2 = r0.getString(r2)
        L59:
            if (r2 != 0) goto L61
            java.lang.String r2 = "error_description"
            java.lang.String r2 = r0.getString(r2)
        L61:
            java.lang.String r3 = "error_code"
            java.lang.String r3 = r0.getString(r3)
            boolean r4 = com.facebook.internal.x.Q(r3)
            r5 = -1
            if (r4 != 0) goto L73
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L73
            goto L74
        L73:
            r3 = -1
        L74:
            boolean r4 = com.facebook.internal.x.Q(r7)
            if (r4 == 0) goto L86
            boolean r4 = com.facebook.internal.x.Q(r2)
            if (r4 == 0) goto L86
            if (r3 != r5) goto L86
            super.u(r8, r0, r1)
            goto Lbb
        L86:
            if (r7 == 0) goto La1
            java.lang.String r0 = "access_denied"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L98
            java.lang.String r0 = "OAuthAccessDeniedException"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto La1
        L98:
            com.facebook.FacebookOperationCanceledException r7 = new com.facebook.FacebookOperationCanceledException
            r7.<init>()
            super.u(r8, r1, r7)
            goto Lbb
        La1:
            r0 = 4201(0x1069, float:5.887E-42)
            if (r3 != r0) goto Lae
            com.facebook.FacebookOperationCanceledException r7 = new com.facebook.FacebookOperationCanceledException
            r7.<init>()
            super.u(r8, r1, r7)
            goto Lbb
        Lae:
            com.facebook.FacebookRequestError r0 = new com.facebook.FacebookRequestError
            r0.<init>(r3, r7, r2)
            com.facebook.FacebookServiceException r7 = new com.facebook.FacebookServiceException
            r7.<init>(r0, r2)
            super.u(r8, r1, r7)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.CustomTabLoginMethodHandler.z(java.lang.String, com.facebook.login.LoginClient$Request):void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    String f() {
        return "custom_tab";
    }

    @Override // com.facebook.login.LoginMethodHandler
    boolean j(int i2, int i3, Intent intent) {
        if (i2 != 1) {
            return super.j(i2, i3, intent);
        }
        LoginClient.Request r = this.f9330g.r();
        if (i3 == -1) {
            z(intent.getStringExtra(CustomTabMainActivity.f8978i), r);
            return true;
        }
        super.u(r, null, new FacebookOperationCanceledException());
        return false;
    }

    @Override // com.facebook.login.LoginMethodHandler
    protected void k(JSONObject jSONObject) throws JSONException {
        jSONObject.put("7_challenge", this.f9277k);
    }

    @Override // com.facebook.login.LoginMethodHandler
    boolean m(LoginClient.Request request) {
        if (!y()) {
            return false;
        }
        Bundle n = n(p(request), request);
        if (f9275i) {
            n.putString("cct_over_app_switch", "1");
        }
        if (com.facebook.f.q) {
            com.facebook.login.a.c(com.facebook.internal.e.a("oauth", n));
        }
        Intent intent = new Intent(this.f9330g.i(), (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f8975f, "oauth");
        intent.putExtra(CustomTabMainActivity.f8976g, n);
        intent.putExtra(CustomTabMainActivity.f8977h, w());
        this.f9330g.l().startActivityForResult(intent, 1);
        return true;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    protected String q() {
        return this.l;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    protected String r() {
        return "chrome_custom_tab";
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    com.facebook.c s() {
        return com.facebook.c.CHROME_CUSTOM_TAB;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.f9277k);
    }

    CustomTabLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.l = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f9277k = parcel.readString();
    }
}
