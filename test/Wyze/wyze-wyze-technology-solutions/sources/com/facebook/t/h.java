package com.facebook.t;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.internal.o;
import com.facebook.internal.r;
import com.facebook.internal.x;
import com.facebook.internal.y;
import com.facebook.t.g;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppEventsLoggerImpl.java */
/* loaded from: classes.dex */
public class h {
    private static final String a = "com.facebook.t.h";

    /* renamed from: b, reason: collision with root package name */
    private static ScheduledThreadPoolExecutor f9463b;

    /* renamed from: c, reason: collision with root package name */
    private static g.a f9464c = g.a.AUTO;

    /* renamed from: d, reason: collision with root package name */
    private static final Object f9465d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static String f9466e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f9467f;

    /* renamed from: g, reason: collision with root package name */
    private static String f9468g;

    /* renamed from: h, reason: collision with root package name */
    private final String f9469h;

    /* renamed from: i, reason: collision with root package name */
    private final com.facebook.t.a f9470i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppEventsLoggerImpl.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f9471f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ h f9472g;

        a(Context context, h hVar) {
            this.f9471f = context;
            this.f9472g = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                Bundle bundle = new Bundle();
                String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
                String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
                int i2 = 0;
                for (int i3 = 0; i3 < 11; i3++) {
                    String str = strArr[i3];
                    String str2 = strArr2[i3];
                    try {
                        Class.forName(str);
                        bundle.putInt(str2, 1);
                        i2 |= 1 << i3;
                    } catch (ClassNotFoundException unused) {
                    }
                }
                SharedPreferences sharedPreferences = this.f9471f.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                if (sharedPreferences.getInt("kitsBitmask", 0) != i2) {
                    sharedPreferences.edit().putInt("kitsBitmask", i2).apply();
                    this.f9472g.q("fb_sdk_initialize", null, bundle);
                }
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* compiled from: AppEventsLoggerImpl.java */
    /* loaded from: classes.dex */
    static class b implements o.b {
        b() {
        }

        @Override // com.facebook.internal.o.b
        public void a(String str) {
            h.w(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppEventsLoggerImpl.java */
    /* loaded from: classes.dex */
    public static class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                HashSet hashSet = new HashSet();
                Iterator<com.facebook.t.a> it = e.l().iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next().b());
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    com.facebook.internal.n.o((String) it2.next(), true);
                }
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(Context context, String str, AccessToken accessToken) {
        this(x.q(context), str, accessToken);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Application application, String str) {
        if (com.facebook.internal.a0.f.a.c(h.class)) {
            return;
        }
        try {
            if (com.facebook.f.w()) {
                com.facebook.t.b.g();
                p.g();
                if (str == null) {
                    str = com.facebook.f.f();
                }
                com.facebook.f.B(application, str);
                com.facebook.t.u.a.x(application, str);
                return;
            }
            throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, h.class);
        }
    }

    static void b() {
        if (com.facebook.internal.a0.f.a.c(h.class)) {
            return;
        }
        try {
            if (f() != g.a.EXPLICIT_ONLY) {
                e.j(j.EAGER_FLUSHING_EVENT);
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, h.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor d() {
        if (com.facebook.internal.a0.f.a.c(h.class)) {
            return null;
        }
        try {
            if (f9463b == null) {
                j();
            }
            return f9463b;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, h.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(Context context) {
        if (com.facebook.internal.a0.f.a.c(h.class)) {
            return null;
        }
        try {
            if (f9466e == null) {
                synchronized (f9465d) {
                    if (f9466e == null) {
                        String string = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                        f9466e = string;
                        if (string == null) {
                            f9466e = "XZ" + UUID.randomUUID().toString();
                            context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", f9466e).apply();
                        }
                    }
                }
            }
            return f9466e;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, h.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g.a f() {
        g.a aVar;
        if (com.facebook.internal.a0.f.a.c(h.class)) {
            return null;
        }
        try {
            synchronized (f9465d) {
                aVar = f9464c;
            }
            return aVar;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, h.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g() {
        if (com.facebook.internal.a0.f.a.c(h.class)) {
            return null;
        }
        try {
            com.facebook.internal.o.d(new b());
            return com.facebook.f.e().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, h.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String h() {
        String str;
        if (com.facebook.internal.a0.f.a.c(h.class)) {
            return null;
        }
        try {
            synchronized (f9465d) {
                str = f9468g;
            }
            return str;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, h.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(Context context, String str) {
        if (com.facebook.internal.a0.f.a.c(h.class)) {
            return;
        }
        try {
            if (com.facebook.f.i()) {
                f9463b.execute(new a(context, new h(context, str, (AccessToken) null)));
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, h.class);
        }
    }

    private static void j() {
        if (com.facebook.internal.a0.f.a.c(h.class)) {
            return;
        }
        try {
            synchronized (f9465d) {
                if (f9463b != null) {
                    return;
                }
                f9463b = new ScheduledThreadPoolExecutor(1);
                f9463b.scheduleAtFixedRate(new c(), 0L, 86400L, TimeUnit.SECONDS);
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, h.class);
        }
    }

    private static void k(com.facebook.t.c cVar, com.facebook.t.a aVar) {
        if (com.facebook.internal.a0.f.a.c(h.class)) {
            return;
        }
        try {
            e.h(aVar, cVar);
            if (cVar.b() || f9467f) {
                return;
            }
            if (cVar.e().equals("fb_mobile_activate_app")) {
                f9467f = true;
            } else {
                r.g(com.facebook.l.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, h.class);
        }
    }

    private static void u(String str) {
        if (com.facebook.internal.a0.f.a.c(h.class)) {
            return;
        }
        try {
            r.g(com.facebook.l.DEVELOPER_ERRORS, "AppEvents", str);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, h.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void v() {
        if (com.facebook.internal.a0.f.a.c(h.class)) {
            return;
        }
        try {
            e.n();
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, h.class);
        }
    }

    static void w(String str) {
        if (com.facebook.internal.a0.f.a.c(h.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = com.facebook.f.e().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (str != null) {
                sharedPreferences.edit().putString("install_referrer", str).apply();
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, h.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            e.j(j.EXPLICIT);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(String str) {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            n(str, null);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(String str, double d2, Bundle bundle) {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            o(str, Double.valueOf(d2), bundle, false, com.facebook.t.u.a.q());
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(String str, Bundle bundle) {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            o(str, null, bundle, false, com.facebook.t.u.a.q());
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    void o(String str, Double d2, Bundle bundle, boolean z, UUID uuid) {
        if (com.facebook.internal.a0.f.a.c(this) || str == null) {
            return;
        }
        try {
            if (str.isEmpty()) {
                return;
            }
            if (com.facebook.internal.l.g("app_events_killswitch", com.facebook.f.f(), false)) {
                r.h(com.facebook.l.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                return;
            }
            try {
                k(new com.facebook.t.c(this.f9469h, str, d2, bundle, z, com.facebook.t.u.a.s(), uuid), this.f9470i);
            } catch (FacebookException e2) {
                r.h(com.facebook.l.APP_EVENTS, "AppEvents", "Invalid app event: %s", e2.toString());
            } catch (JSONException e3) {
                r.h(com.facebook.l.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e3.toString());
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(String str, String str2) {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("_is_suggested_event", "1");
            bundle.putString("_button_text", str2);
            n(str, bundle);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(String str, Double d2, Bundle bundle) {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            o(str, d2, bundle, true, com.facebook.t.u.a.q());
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            if (bigDecimal != null && currency != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Bundle bundle2 = bundle;
                bundle2.putString("fb_currency", currency.getCurrencyCode());
                o(str, Double.valueOf(bigDecimal.doubleValue()), bundle2, true, com.facebook.t.u.a.q());
                return;
            }
            x.V(a, "purchaseAmount and currency cannot be null");
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    void s(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z) {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            if (bigDecimal == null) {
                u("purchaseAmount cannot be null");
                return;
            }
            if (currency == null) {
                u("currency cannot be null");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            o("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, z, com.facebook.t.u.a.q());
            b();
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            s(bigDecimal, currency, bundle, true);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(String str, String str2, AccessToken accessToken) {
        y.k();
        this.f9469h = str;
        accessToken = accessToken == null ? AccessToken.g() : accessToken;
        if (accessToken != null && !accessToken.u() && (str2 == null || str2.equals(accessToken.f()))) {
            this.f9470i = new com.facebook.t.a(accessToken);
        } else {
            this.f9470i = new com.facebook.t.a(null, str2 == null ? x.z(com.facebook.f.e()) : str2);
        }
        j();
    }
}
