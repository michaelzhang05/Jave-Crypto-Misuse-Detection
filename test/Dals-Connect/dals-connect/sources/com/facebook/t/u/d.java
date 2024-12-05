package com.facebook.t.u;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.internal.n;
import com.facebook.internal.y;
import com.facebook.t.m;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AutomaticAnalyticsLogger.java */
/* loaded from: classes.dex */
public class d {
    private static final String a = "com.facebook.t.u.d";

    /* renamed from: b, reason: collision with root package name */
    private static final m f9620b = new m(com.facebook.f.e());

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AutomaticAnalyticsLogger.java */
    /* loaded from: classes.dex */
    public static class a {
        BigDecimal a;

        /* renamed from: b, reason: collision with root package name */
        Currency f9621b;

        /* renamed from: c, reason: collision with root package name */
        Bundle f9622c;

        a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
            this.a = bigDecimal;
            this.f9621b = currency;
            this.f9622c = bundle;
        }
    }

    private static a a(String str, String str2) {
        return b(str, str2, new HashMap());
    }

    private static a b(String str, String str2, Map<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
            bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
            bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
            bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
            bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString("title"));
            bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString("description"));
            String optString = jSONObject2.optString("type");
            bundle.putCharSequence("fb_iap_product_type", optString);
            if (optString.equals("subs")) {
                bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                String optString2 = jSONObject2.optString("introductoryPriceCycles");
                if (!optString2.isEmpty()) {
                    bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence("fb_intro_price_cycles", optString2);
                }
            }
            for (String str3 : map.keySet()) {
                bundle.putCharSequence(str3, map.get(str3));
            }
            double d2 = jSONObject2.getLong("price_amount_micros");
            Double.isNaN(d2);
            return new a(new BigDecimal(d2 / 1000000.0d), Currency.getInstance(jSONObject2.getString("price_currency_code")), bundle);
        } catch (JSONException e2) {
            Log.e(a, "Error parsing in-app subscription data.", e2);
            return null;
        }
    }

    public static boolean c() {
        com.facebook.internal.m j2 = n.j(com.facebook.f.f());
        return j2 != null && com.facebook.f.i() && j2.e();
    }

    public static void d() {
        Context e2 = com.facebook.f.e();
        String f2 = com.facebook.f.f();
        boolean i2 = com.facebook.f.i();
        y.i(e2, "context");
        if (i2) {
            if (e2 instanceof Application) {
                com.facebook.t.g.b((Application) e2, f2);
            } else {
                Log.w(a, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
            }
        }
    }

    public static void e(String str, long j2) {
        Context e2 = com.facebook.f.e();
        String f2 = com.facebook.f.f();
        y.i(e2, "context");
        com.facebook.internal.m o = n.o(f2, false);
        if (o == null || !o.a() || j2 <= 0) {
            return;
        }
        m mVar = new m(e2);
        Bundle bundle = new Bundle(1);
        bundle.putCharSequence("fb_aa_time_spent_view_name", str);
        mVar.e("fb_aa_time_spent_on_view", j2, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(String str, String str2, boolean z) {
        a a2;
        if (c() && (a2 = a(str, str2)) != null) {
            boolean z2 = false;
            if (z && com.facebook.internal.l.g("app_events_if_auto_log_subs", com.facebook.f.f(), false)) {
                z2 = true;
            }
            if (z2) {
                f9620b.k(i.m(str2) ? "StartTrial" : "Subscribe", a2.a, a2.f9621b, a2.f9622c);
            } else {
                f9620b.l(a2.a, a2.f9621b, a2.f9622c);
            }
        }
    }
}
