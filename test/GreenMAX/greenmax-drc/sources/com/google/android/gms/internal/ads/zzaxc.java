package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzaxc implements zzaxb {

    /* renamed from: b, reason: collision with root package name */
    private boolean f13066b;

    /* renamed from: d, reason: collision with root package name */
    private zzbbh<?> f13068d;

    /* renamed from: f, reason: collision with root package name */
    private SharedPreferences f13070f;

    /* renamed from: g, reason: collision with root package name */
    private SharedPreferences.Editor f13071g;

    /* renamed from: j, reason: collision with root package name */
    private String f13074j;

    /* renamed from: k, reason: collision with root package name */
    private String f13075k;
    private final Object a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final List<Runnable> f13067c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private zzuu f13069e = null;

    /* renamed from: h, reason: collision with root package name */
    private boolean f13072h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f13073i = true;
    private boolean l = false;
    private String m = HttpUrl.FRAGMENT_ENCODE_SET;
    private long n = 0;
    private long o = 0;
    private long p = 0;
    private int q = -1;
    private int r = 0;
    private Set<String> s = Collections.emptySet();
    private JSONObject t = new JSONObject();
    private boolean u = true;
    private boolean v = true;
    private String w = null;

    private final void b(Bundle bundle) {
        zzaxg.a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.c5

            /* renamed from: f, reason: collision with root package name */
            private final zzaxc f11214f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11214f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11214f.x();
            }
        });
    }

    private final void d() {
        zzbbh<?> zzbbhVar = this.f13068d;
        if (zzbbhVar == null || zzbbhVar.isDone()) {
            return;
        }
        try {
            this.f13068d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            zzbad.d("Interrupted while waiting for preferences loaded.", e2);
        } catch (CancellationException e3) {
            e = e3;
            zzbad.c("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e4) {
            e = e4;
            zzbad.c("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e5) {
            e = e5;
            zzbad.c("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    private final Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("listener_registration_bundle", true);
        synchronized (this.a) {
            bundle.putBoolean("use_https", this.f13073i);
            bundle.putBoolean("content_url_opted_out", this.u);
            bundle.putBoolean("content_vertical_opted_out", this.v);
            bundle.putBoolean("auto_collect_location", this.l);
            bundle.putInt("version_code", this.r);
            bundle.putStringArray("never_pool_slots", (String[]) this.s.toArray(new String[0]));
            bundle.putString("app_settings_json", this.m);
            bundle.putLong("app_settings_last_update_ms", this.n);
            bundle.putLong("app_last_background_time_ms", this.o);
            bundle.putInt("request_in_session_count", this.q);
            bundle.putLong("first_ad_req_time_ms", this.p);
            bundle.putString("native_advanced_settings", this.t.toString());
            bundle.putString("display_cutout", this.w);
            String str = this.f13074j;
            if (str != null) {
                bundle.putString("content_url_hashes", str);
            }
            String str2 = this.f13075k;
            if (str2 != null) {
                bundle.putString("content_vertical_hashes", str2);
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final void A(boolean z) {
        d();
        synchronized (this.a) {
            if (this.u == z) {
                return;
            }
            this.u = z;
            SharedPreferences.Editor editor = this.f13071g;
            if (editor != null) {
                editor.putBoolean("content_url_opted_out", z);
                this.f13071g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("content_url_opted_out", this.u);
            bundle.putBoolean("content_vertical_opted_out", this.v);
            b(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final int B() {
        int i2;
        d();
        synchronized (this.a) {
            i2 = this.r;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final void C(Runnable runnable) {
        this.f13067c.add(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final void D(int i2) {
        d();
        synchronized (this.a) {
            if (this.q == i2) {
                return;
            }
            this.q = i2;
            SharedPreferences.Editor editor = this.f13071g;
            if (editor != null) {
                editor.putInt("request_in_session_count", i2);
                this.f13071g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putInt("request_in_session_count", i2);
            b(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final boolean E() {
        boolean z;
        d();
        synchronized (this.a) {
            z = this.l;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final void F(long j2) {
        d();
        synchronized (this.a) {
            if (this.p == j2) {
                return;
            }
            this.p = j2;
            SharedPreferences.Editor editor = this.f13071g;
            if (editor != null) {
                editor.putLong("first_ad_req_time_ms", j2);
                this.f13071g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putLong("first_ad_req_time_ms", j2);
            b(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final void G() {
        d();
        synchronized (this.a) {
            this.t = new JSONObject();
            SharedPreferences.Editor editor = this.f13071g;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.f13071g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", "{}");
            b(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final void H(String str, String str2, boolean z) {
        d();
        synchronized (this.a) {
            JSONArray optJSONArray = this.t.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                if (optJSONObject == null) {
                    return;
                }
                if (str2.equals(optJSONObject.optString("template_id"))) {
                    if (z && optJSONObject.optBoolean("uses_media_view", false)) {
                        return;
                    } else {
                        length = i2;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", zzk.zzln().a());
                optJSONArray.put(length, jSONObject);
                this.t.put(str, optJSONArray);
            } catch (JSONException e2) {
                zzbad.d("Could not update native advanced settings", e2);
            }
            SharedPreferences.Editor editor = this.f13071g;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.t.toString());
                this.f13071g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", this.t.toString());
            b(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final String I() {
        String str;
        d();
        synchronized (this.a) {
            str = this.f13075k;
        }
        return str;
    }

    public final void a(final Context context, String str, boolean z) {
        final String concat;
        if (str == null) {
            concat = "admob";
        } else {
            concat = str.length() != 0 ? "admob__".concat(str) : new String("admob__");
        }
        this.f13068d = zzaxg.b(new Runnable(this, context, concat) { // from class: com.google.android.gms.internal.ads.b5

            /* renamed from: f, reason: collision with root package name */
            private final zzaxc f11119f;

            /* renamed from: g, reason: collision with root package name */
            private final Context f11120g;

            /* renamed from: h, reason: collision with root package name */
            private final String f11121h;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11119f = this;
                this.f11120g = context;
                this.f11121h = concat;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11119f.c(this.f11120g, this.f11121h);
            }
        });
        this.f13066b = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void c(Context context, String str) {
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.a) {
            this.f13070f = sharedPreferences;
            this.f13071g = edit;
            if (PlatformVersion.i() && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                z = true;
            }
            this.f13072h = z;
            this.f13073i = this.f13070f.getBoolean("use_https", this.f13073i);
            this.u = this.f13070f.getBoolean("content_url_opted_out", this.u);
            this.f13074j = this.f13070f.getString("content_url_hashes", this.f13074j);
            this.l = this.f13070f.getBoolean("auto_collect_location", this.l);
            this.v = this.f13070f.getBoolean("content_vertical_opted_out", this.v);
            this.f13075k = this.f13070f.getString("content_vertical_hashes", this.f13075k);
            this.r = this.f13070f.getInt("version_code", this.r);
            this.m = this.f13070f.getString("app_settings_json", this.m);
            this.n = this.f13070f.getLong("app_settings_last_update_ms", this.n);
            this.o = this.f13070f.getLong("app_last_background_time_ms", this.o);
            this.q = this.f13070f.getInt("request_in_session_count", this.q);
            this.p = this.f13070f.getLong("first_ad_req_time_ms", this.p);
            this.s = this.f13070f.getStringSet("never_pool_slots", this.s);
            this.w = this.f13070f.getString("display_cutout", this.w);
            try {
                this.t = new JSONObject(this.f13070f.getString("native_advanced_settings", "{}"));
            } catch (JSONException e2) {
                zzbad.d("Could not convert native advanced settings to json object", e2);
            }
            b(e());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final String i() {
        String str;
        d();
        synchronized (this.a) {
            str = this.f13074j;
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final String j() {
        String str;
        d();
        synchronized (this.a) {
            str = this.w;
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final JSONObject k() {
        JSONObject jSONObject;
        d();
        synchronized (this.a) {
            jSONObject = this.t;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final boolean l() {
        boolean z;
        d();
        synchronized (this.a) {
            z = this.v;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final void m(String str) {
        d();
        synchronized (this.a) {
            long a = zzk.zzln().a();
            this.n = a;
            if (str != null && !str.equals(this.m)) {
                this.m = str;
                SharedPreferences.Editor editor = this.f13071g;
                if (editor != null) {
                    editor.putString("app_settings_json", str);
                    this.f13071g.putLong("app_settings_last_update_ms", a);
                    this.f13071g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putString("app_settings_json", str);
                bundle.putLong("app_settings_last_update_ms", a);
                b(bundle);
                Iterator<Runnable> it = this.f13067c.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final long n() {
        long j2;
        d();
        synchronized (this.a) {
            j2 = this.p;
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final void o(int i2) {
        d();
        synchronized (this.a) {
            if (this.r == i2) {
                return;
            }
            this.r = i2;
            SharedPreferences.Editor editor = this.f13071g;
            if (editor != null) {
                editor.putInt("version_code", i2);
                this.f13071g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putInt("version_code", i2);
            b(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final void p(String str) {
        d();
        synchronized (this.a) {
            if (TextUtils.equals(this.w, str)) {
                return;
            }
            this.w = str;
            SharedPreferences.Editor editor = this.f13071g;
            if (editor != null) {
                editor.putString("display_cutout", str);
                this.f13071g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("display_cutout", str);
            b(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final void q(long j2) {
        d();
        synchronized (this.a) {
            if (this.o == j2) {
                return;
            }
            this.o = j2;
            SharedPreferences.Editor editor = this.f13071g;
            if (editor != null) {
                editor.putLong("app_last_background_time_ms", j2);
                this.f13071g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putLong("app_last_background_time_ms", j2);
            b(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final int r() {
        int i2;
        d();
        synchronized (this.a) {
            i2 = this.q;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final void s(boolean z) {
        d();
        synchronized (this.a) {
            if (this.v == z) {
                return;
            }
            this.v = z;
            SharedPreferences.Editor editor = this.f13071g;
            if (editor != null) {
                editor.putBoolean("content_vertical_opted_out", z);
                this.f13071g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("content_url_opted_out", this.u);
            bundle.putBoolean("content_vertical_opted_out", this.v);
            b(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final boolean t() {
        boolean z;
        d();
        synchronized (this.a) {
            z = this.u;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final void u(String str) {
        d();
        synchronized (this.a) {
            if (str != null) {
                if (!str.equals(this.f13074j)) {
                    this.f13074j = str;
                    SharedPreferences.Editor editor = this.f13071g;
                    if (editor != null) {
                        editor.putString("content_url_hashes", str);
                        this.f13071g.apply();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("content_url_hashes", str);
                    b(bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final long v() {
        long j2;
        d();
        synchronized (this.a) {
            j2 = this.o;
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final void w(boolean z) {
        d();
        synchronized (this.a) {
            if (this.l == z) {
                return;
            }
            this.l = z;
            SharedPreferences.Editor editor = this.f13071g;
            if (editor != null) {
                editor.putBoolean("auto_collect_location", z);
                this.f13071g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("auto_collect_location", z);
            b(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final zzuu x() {
        if (!this.f13066b || !PlatformVersion.a()) {
            return null;
        }
        if (t() && l()) {
            return null;
        }
        if (!((Boolean) zzyt.e().c(zzacu.h0)).booleanValue()) {
            return null;
        }
        synchronized (this.a) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.f13069e == null) {
                this.f13069e = new zzuu();
            }
            this.f13069e.e();
            zzbad.h("start fetching content...");
            return this.f13069e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final void y(String str) {
        d();
        synchronized (this.a) {
            if (str != null) {
                if (!str.equals(this.f13075k)) {
                    this.f13075k = str;
                    SharedPreferences.Editor editor = this.f13071g;
                    if (editor != null) {
                        editor.putString("content_vertical_hashes", str);
                        this.f13071g.apply();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("content_vertical_hashes", str);
                    b(bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final zzawl z() {
        zzawl zzawlVar;
        d();
        synchronized (this.a) {
            zzawlVar = new zzawl(this.m, this.n);
        }
        return zzawlVar;
    }
}
