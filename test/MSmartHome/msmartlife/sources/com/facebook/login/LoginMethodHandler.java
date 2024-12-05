package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import cm.aptoide.pt.reviews.RateAndReviewsFragment;
import cm.aptoide.pt.timeline.view.follow.TimeLineFollowFragment;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.internal.x;
import com.facebook.login.LoginClient;
import com.facebook.t.m;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class LoginMethodHandler implements Parcelable {

    /* renamed from: f, reason: collision with root package name */
    Map<String, String> f9329f;

    /* renamed from: g, reason: collision with root package name */
    protected LoginClient f9330g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LoginMethodHandler(LoginClient loginClient) {
        this.f9330g = loginClient;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AccessToken c(Bundle bundle, com.facebook.c cVar, String str) {
        Date t = x.t(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
        ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date t2 = x.t(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
        if (x.Q(string)) {
            return null;
        }
        return new AccessToken(string, str, bundle.getString("com.facebook.platform.extra.USER_ID"), stringArrayList, null, null, cVar, t, new Date(), t2, bundle.getString("graph_domain"));
    }

    public static AccessToken d(Collection<String> collection, Bundle bundle, com.facebook.c cVar, String str) throws FacebookException {
        Date t = x.t(bundle, "expires_in", new Date());
        String string = bundle.getString("access_token");
        Date t2 = x.t(bundle, "data_access_expiration_time", new Date(0L));
        String string2 = bundle.getString("granted_scopes");
        Collection<String> arrayList = !x.Q(string2) ? new ArrayList(Arrays.asList(string2.split(","))) : collection;
        String string3 = bundle.getString("denied_scopes");
        ArrayList arrayList2 = !x.Q(string3) ? new ArrayList(Arrays.asList(string3.split(","))) : null;
        String string4 = bundle.getString("expired_scopes");
        ArrayList arrayList3 = !x.Q(string4) ? new ArrayList(Arrays.asList(string4.split(","))) : null;
        if (x.Q(string)) {
            return null;
        }
        return new AccessToken(string, str, g(bundle.getString("signed_request")), arrayList, arrayList2, arrayList3, cVar, t, new Date(), t2, bundle.getString("graph_domain"));
    }

    static String g(String str) throws FacebookException {
        if (str != null && !str.isEmpty()) {
            try {
                String[] split = str.split("\\.");
                if (split.length == 2) {
                    return new JSONObject(new String(Base64.decode(split[1], 0), "UTF-8")).getString(TimeLineFollowFragment.BundleKeys.USER_ID);
                }
            } catch (UnsupportedEncodingException | JSONException unused) {
            }
            throw new FacebookException("Failed to retrieve user_id from signed_request");
        }
        throw new FacebookException("Authorization response does not contain the signed_request");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str, Object obj) {
        if (this.f9329f == null) {
            this.f9329f = new HashMap();
        }
        this.f9329f.put(str, obj == null ? null : obj.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String e(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", f());
            k(jSONObject);
        } catch (JSONException e2) {
            Log.w("LoginMethodHandler", "Error creating client state json: " + e2.getMessage());
        }
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String f();

    /* JADX INFO: Access modifiers changed from: protected */
    public void h(String str) {
        String a = this.f9330g.r().a();
        m mVar = new m(this.f9330g.i(), a);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString(RateAndReviewsFragment.BundleCons.APP_ID, a);
        mVar.j("fb_dialogs_web_login_dialog_complete", null, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j(int i2, int i3, Intent intent) {
        return false;
    }

    void k(JSONObject jSONObject) throws JSONException {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(LoginClient loginClient) {
        if (this.f9330g == null) {
            this.f9330g = loginClient;
            return;
        }
        throw new FacebookException("Can't set LoginClient if it is already set.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean m(LoginClient.Request request);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        x.s0(parcel, this.f9329f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LoginMethodHandler(Parcel parcel) {
        this.f9329f = x.f0(parcel);
    }
}
