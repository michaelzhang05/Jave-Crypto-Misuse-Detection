package o5;

import a5.C1649p;
import a5.I;
import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: o5.r, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3678r {

    /* renamed from: a, reason: collision with root package name */
    private final Context f36528a;

    /* renamed from: b, reason: collision with root package name */
    private FirebaseAnalytics f36529b;

    public C3678r(Context context) {
        this.f36528a = context;
        if (context != null && SettingsPreferences.f30353b.M(context)) {
            this.f36529b = FirebaseAnalytics.getInstance(context);
        } else {
            this.f36529b = null;
        }
    }

    public final void a(String event) {
        AbstractC3255y.i(event, "event");
        FirebaseAnalytics firebaseAnalytics = this.f36529b;
        if (firebaseAnalytics != null) {
            firebaseAnalytics.a(event, null);
        }
    }

    public final void b(String event, Bundle params) {
        AbstractC3255y.i(event, "event");
        AbstractC3255y.i(params, "params");
        FirebaseAnalytics firebaseAnalytics = this.f36529b;
        if (firebaseAnalytics != null) {
            firebaseAnalytics.a(event, params);
        }
        C1649p.f14319d.g(event, params, this.f36528a);
    }

    public final void c(String eventName, I responseJson) {
        AbstractC3255y.i(eventName, "eventName");
        AbstractC3255y.i(responseJson, "responseJson");
        Bundle bundle = new Bundle();
        if (responseJson.e() > 0) {
            bundle.putString("responseCode", String.valueOf(responseJson.e()));
        }
        if (responseJson.c() != null) {
            bundle.putString("exception", responseJson.c());
        }
        b(eventName, bundle);
    }

    public final void d(String event, Bundle bundle, String str) {
        AbstractC3255y.i(event, "event");
    }

    public final void e(String type, Bundle bundle, I i8, String str) {
        AbstractC3255y.i(type, "type");
        Bundle bundle2 = new Bundle();
        if (bundle == null) {
            bundle = bundle2;
        }
        if (i8 != null) {
            if (i8.e() > 0) {
                bundle.putString("responseCode", String.valueOf(i8.e()));
            }
            if (i8.c() != null) {
                bundle.putString("exception", i8.c());
            }
        }
        if (str != null) {
            bundle.putString("workRequest", str);
        }
        bundle.putString("type", type);
        b("tracking", bundle);
    }

    public final void f() {
        if (this.f36528a != null) {
            com.google.firebase.crashlytics.a.a().c(SettingsPreferences.f30353b.Q(this.f36528a));
        }
    }
}
