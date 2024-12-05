package l5;

import X4.C1506p;
import X4.I;
import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: l5.r, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3330r {

    /* renamed from: a, reason: collision with root package name */
    private final Context f34527a;

    /* renamed from: b, reason: collision with root package name */
    private FirebaseAnalytics f34528b;

    public C3330r(Context context) {
        this.f34527a = context;
        if (context != null && SettingsPreferences.f29323b.M(context)) {
            this.f34528b = FirebaseAnalytics.getInstance(context);
        } else {
            this.f34528b = null;
        }
    }

    public final void a(String event) {
        AbstractC3159y.i(event, "event");
        FirebaseAnalytics firebaseAnalytics = this.f34528b;
        if (firebaseAnalytics != null) {
            firebaseAnalytics.a(event, null);
        }
    }

    public final void b(String event, Bundle params) {
        AbstractC3159y.i(event, "event");
        AbstractC3159y.i(params, "params");
        FirebaseAnalytics firebaseAnalytics = this.f34528b;
        if (firebaseAnalytics != null) {
            firebaseAnalytics.a(event, params);
        }
        C1506p.f12698d.g(event, params, this.f34527a);
    }

    public final void c(String eventName, I responseJson) {
        AbstractC3159y.i(eventName, "eventName");
        AbstractC3159y.i(responseJson, "responseJson");
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
        AbstractC3159y.i(event, "event");
    }

    public final void e(String type, Bundle bundle, I i8, String str) {
        AbstractC3159y.i(type, "type");
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
        if (this.f34527a != null) {
            com.google.firebase.crashlytics.a.a().c(SettingsPreferences.f29323b.Q(this.f34527a));
        }
    }
}
