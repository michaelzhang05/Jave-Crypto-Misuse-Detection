package com.uptodown.activities.preferences;

import C4.g;
import N4.r;
import X4.C1500j;
import X4.C1504n;
import X4.C1510u;
import X4.M;
import X4.P;
import X4.x;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.ActionBar;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.PointerIconCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceScreen;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.GdprPrivacySettings;
import com.uptodown.activities.LanguageSettingsActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.tv.preferences.TvPrivacyPreferences;
import g6.n;
import java.io.File;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3323k;
import l5.C3335w;

/* loaded from: classes4.dex */
public final class SettingsPreferences extends g {

    /* renamed from: b, reason: collision with root package name */
    public static final a f29323b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private M f29324a;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        private final String E(Context context, String str) {
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
                if (!sharedPreferences.contains(str)) {
                    return null;
                }
                return sharedPreferences.getString(str, null);
            } catch (Exception e8) {
                e8.printStackTrace();
                return null;
            }
        }

        private final String F(Context context, String str, String str2) {
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
                if (sharedPreferences.contains(str)) {
                    String string = sharedPreferences.getString(str, str2);
                    AbstractC3159y.f(string);
                    return string;
                }
                return str2;
            } catch (Exception unused) {
                return str2;
            }
        }

        private final void R0(Context context, String str, long j8) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("SettingsPreferences", 0).edit();
                edit.putLong(str, j8);
                edit.apply();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }

        private final void d1(Context context, String str, String str2) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("SettingsPreferences", 0).edit();
                edit.putString(str, str2);
                edit.apply();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }

        private final boolean f0(Context context, String str) {
            try {
                return context.getSharedPreferences("SettingsPreferences", 0).contains(str);
            } catch (Exception unused) {
                return false;
            }
        }

        public static /* synthetic */ boolean i(a aVar, Context context, String str, boolean z8, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                z8 = true;
            }
            return aVar.h(context, str, z8);
        }

        public static /* synthetic */ long y(a aVar, Context context, String str, long j8, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                j8 = -1;
            }
            return aVar.x(context, str, j8);
        }

        public final x A(Context context) {
            AbstractC3159y.i(context, "context");
            x xVar = new x();
            xVar.j(y(this, context, "fcm_app_id", 0L, 4, null));
            xVar.m(E(context, "fcm_packagename"));
            xVar.k(o(context, "fcm_download_id"));
            xVar.o(y(this, context, "fcm_received_timestamp", 0L, 4, null));
            xVar.q(y(this, context, "fcm_shown_timestamp", 0L, 4, null));
            if (xVar.b() > -1 && xVar.d() != null) {
                return xVar;
            }
            return null;
        }

        public final void A0(Context context, boolean z8) {
            AbstractC3159y.i(context, "context");
            z0(context, "gdpr_crashlytics_allowed", z8);
        }

        public final int B(Context context) {
            AbstractC3159y.i(context, "context");
            return o(context, "notification_permission_request_api33");
        }

        public final void B0(Context context, String str) {
            AbstractC3159y.i(context, "context");
            d1(context, "dark_mode", str);
        }

        public final long C(Context context) {
            AbstractC3159y.i(context, "context");
            return x(context, "last_notification_permission_request_timestamp", 0L);
        }

        public final void C0(Context context) {
            AbstractC3159y.i(context, "context");
            R0(context, "dark_mode_logged", System.currentTimeMillis());
        }

        public final long D(Context context) {
            AbstractC3159y.i(context, "context");
            return x(context, "last_sign_in_request_timestamp", 0L);
        }

        public final void D0(Context context, String str) {
            AbstractC3159y.i(context, "context");
            d1(context, "device_status", str);
        }

        public final void E0(Context context, boolean z8) {
            AbstractC3159y.i(context, "context");
            z0(context, "is_device_tracking_registered", z8);
        }

        public final void F0(Context context, boolean z8) {
            AbstractC3159y.i(context, "context");
            z0(context, "app_detail_inflate_view_failed", z8);
        }

        public final P G(Context context) {
            AbstractC3159y.i(context, "context");
            return new P(x(context, "bytes_uploaded", 0L), x(context, "timestamp_uploaded", 0L));
        }

        public final void G0(Context context, boolean z8) {
            AbstractC3159y.i(context, "context");
            z0(context, "gdpr_requested", z8);
        }

        public final long H(Context context) {
            AbstractC3159y.i(context, "context");
            return x(context, "uptodown_turbo_register_popup_shown", 0L);
        }

        public final void H0(Context context, boolean z8) {
            AbstractC3159y.i(context, "context");
            z0(context, "is_in_eea", z8);
        }

        public final String I(Context context) {
            AbstractC3159y.i(context, "context");
            return E(context, "url_526");
        }

        public final void I0(Context context, boolean z8) {
            AbstractC3159y.i(context, "context");
            z0(context, "is_in_eea_checked", z8);
        }

        public final String J(Context context) {
            AbstractC3159y.i(context, "context");
            return E(context, "UTOKEN");
        }

        public final void J0(Context context, String key, int i8) {
            AbstractC3159y.i(context, "context");
            AbstractC3159y.i(key, "key");
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("SettingsPreferences", 0).edit();
                edit.putInt(key, i8);
                edit.apply();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }

        public final int K(Context context) {
            AbstractC3159y.i(context, "context");
            return o(context, "versioncode_526");
        }

        public final void K0(Context context, String language) {
            AbstractC3159y.i(context, "context");
            AbstractC3159y.i(language, "language");
            d1(context, "Language", language);
            new G4.a(context).C(language);
        }

        public final boolean L(Context context) {
            AbstractC3159y.i(context, "context");
            return h(context, "app_detail_inflate_view_failed", false);
        }

        public final void L0(Context context, long j8) {
            AbstractC3159y.i(context, "context");
            R0(context, "last_analysis_timestamp", j8);
        }

        public final boolean M(Context context) {
            AbstractC3159y.i(context, "context");
            return h(context, "gdpr_analytics_allowed", false);
        }

        public final void M0(Context context, String timestamp) {
            AbstractC3159y.i(context, "context");
            AbstractC3159y.i(timestamp, "timestamp");
            d1(context, "last_notification_timestamp", timestamp);
        }

        public final boolean N(Context context) {
            AbstractC3159y.i(context, "context");
            if (UptodownApp.f28003B.S()) {
                return false;
            }
            return i(this, context, "animations", false, 4, null);
        }

        public final void N0(Context context, String text) {
            AbstractC3159y.i(context, "context");
            AbstractC3159y.i(text, "text");
            d1(context, "last_review_text", text);
        }

        public final boolean O(Context context) {
            AbstractC3159y.i(context, "context");
            return h(context, "auto_update_apps", false);
        }

        public final void O0(Context context, String timestamp) {
            AbstractC3159y.i(context, "context");
            AbstractC3159y.i(timestamp, "timestamp");
            d1(context, "last_review_timestamp", timestamp);
        }

        public final boolean P(Context context) {
            AbstractC3159y.i(context, "context");
            return f0(context, "auto_update_apps");
        }

        public final void P0(Context context, long j8) {
            AbstractC3159y.i(context, "context");
            R0(context, "last_events_timestamp", j8);
        }

        public final boolean Q(Context context) {
            AbstractC3159y.i(context, "context");
            return h(context, "gdpr_crashlytics_allowed", false);
        }

        public final void Q0(Context context, long j8) {
            AbstractC3159y.i(context, "context");
            R0(context, "mintegral_interstitial_last_shown", j8);
        }

        public final boolean R(Context context) {
            AbstractC3159y.i(context, "context");
            return i(this, context, "delete_apk", false, 4, null);
        }

        public final boolean S(Context context) {
            AbstractC3159y.i(context, "context");
            return h(context, "is_device_tracking_registered", false);
        }

        public final void S0(Context context, boolean z8) {
            AbstractC3159y.i(context, "context");
            z0(context, "new_terms_popup_shown", z8);
        }

        public final boolean T(Context context) {
            AbstractC3159y.i(context, "context");
            return h(context, "download_notification", true);
        }

        public final void T0(Context context, int i8) {
            AbstractC3159y.i(context, "context");
            J0(context, "notification_permission_request_api33", i8);
        }

        public final boolean U(Context context) {
            AbstractC3159y.i(context, "context");
            if (UptodownApp.f28003B.S()) {
                return false;
            }
            return h(context, "floating_download_queue_active", true);
        }

        public final void U0(Context context, boolean z8) {
            AbstractC3159y.i(context, "context");
            z0(context, "recibir_notificaciones", z8);
        }

        public final boolean V(Context context) {
            AbstractC3159y.i(context, "context");
            return h(context, "gdpr_requested", false);
        }

        public final void V0(Context context, long j8) {
            AbstractC3159y.i(context, "context");
            R0(context, "last_notification_permission_request_timestamp", j8);
        }

        public final boolean W(Context context) {
            AbstractC3159y.i(context, "context");
            return h(context, "is_in_eea", true);
        }

        public final void W0(Context context, boolean z8) {
            AbstractC3159y.i(context, "context");
            z0(context, "storage_sdcard", z8);
        }

        public final boolean X(Context context) {
            AbstractC3159y.i(context, "context");
            return h(context, "is_in_eea_checked", false);
        }

        public final void X0(Context context, boolean z8) {
            AbstractC3159y.i(context, "context");
            z0(context, "settings_utd_sended", z8);
        }

        public final boolean Y(Context context) {
            AbstractC3159y.i(context, "context");
            return h(context, "install_apk_rooted", false);
        }

        public final void Y0(Context context, boolean z8) {
            AbstractC3159y.i(context, "context");
            z0(context, "show_system_apps", z8);
        }

        public final boolean Z(Context context) {
            AbstractC3159y.i(context, "context");
            return h(context, "installation_notification", true);
        }

        public final void Z0(Context context, boolean z8) {
            AbstractC3159y.i(context, "context");
            z0(context, "show_system_services", z8);
        }

        public final void a(Context context) {
            AbstractC3159y.i(context, "context");
            SharedPreferences.Editor edit = context.getSharedPreferences("SettingsPreferences", 0).edit();
            edit.remove("banner_app_id");
            edit.remove("banner_packagename");
            edit.remove(CampaignEx.JSON_KEY_BANNER_URL);
            edit.remove("banner_last_time_shown");
            edit.remove("banner_download_id");
            edit.remove("banner_last_time_clicked");
            edit.remove("banner_counter_impressions");
            edit.remove("banner_last_time_requested");
            edit.apply();
        }

        public final boolean a0(Context context) {
            AbstractC3159y.i(context, "context");
            return h(context, "new_terms_popup_shown", false);
        }

        public final void a1(Context context, boolean z8) {
            AbstractC3159y.i(context, "context");
            z0(context, "show_warning_download_incompatible", z8);
        }

        public final void b(Context context) {
            AbstractC3159y.i(context, "context");
            SharedPreferences.Editor edit = context.getSharedPreferences("SettingsPreferences", 0).edit();
            edit.remove("interstitial_app_id");
            edit.remove("interstitial_packagename");
            edit.remove("interstitial_url");
            edit.remove("interstitial_last_time_shown");
            edit.remove("interstitial_download_id");
            edit.remove("interstitial_last_time_clicked");
            edit.remove("interstitial_counter_impressions");
            edit.remove("interstitial_last_time_requested");
            edit.apply();
        }

        public final boolean b0(Context context) {
            AbstractC3159y.i(context, "context");
            return i(this, context, "recibir_notificaciones", false, 4, null);
        }

        public final void b1(Context context, long j8) {
            AbstractC3159y.i(context, "context");
            R0(context, "last_sign_in_request_timestamp", j8);
        }

        public final void c(Context context) {
            AbstractC3159y.i(context, "context");
            SharedPreferences.Editor edit = context.getSharedPreferences("SettingsPreferences", 0).edit();
            edit.remove("fcm_app_id");
            edit.remove("fcm_packagename");
            edit.remove("fcm_download_id");
            edit.remove("fcm_received_timestamp");
            edit.remove("fcm_shown_timestamp");
            edit.apply();
        }

        public final boolean c0(Context context) {
            AbstractC3159y.i(context, "context");
            return i(this, context, "only_wifi", false, 4, null);
        }

        public final void c1(Context context, boolean z8) {
            AbstractC3159y.i(context, "context");
            z0(context, "is_status_code_526", z8);
        }

        public final String d(Context context) {
            AbstractC3159y.i(context, "context");
            return E(context, "apk_to_rollback");
        }

        public final boolean d0(Context context) {
            AbstractC3159y.i(context, "context");
            return h(context, "storage_sdcard", false);
        }

        public final String e(Context context) {
            AbstractC3159y.i(context, "context");
            return E(context, "app_id_after_kill");
        }

        public final boolean e0(Context context) {
            AbstractC3159y.i(context, "context");
            return f0(context, "storage_sdcard");
        }

        public final void e1(Context context, boolean z8) {
            AbstractC3159y.i(context, "context");
            z0(context, "gdpr_tracking_allowed", z8);
        }

        public final int f(Context context) {
            AbstractC3159y.i(context, "context");
            return Integer.parseInt(F(context, "autoplay_video", MBridgeConstans.ENDCARD_URL_TYPE_PL));
        }

        public final void f1(Context context, long j8) {
            AbstractC3159y.i(context, "context");
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("SharedPreferencesTracking", 0).edit();
                edit.putLong("maintenance_time", System.currentTimeMillis() + (j8 * 1000));
                edit.apply();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }

        public final C1500j g(Context context) {
            AbstractC3159y.i(context, "context");
            long y8 = y(this, context, "banner_app_id", 0L, 4, null);
            String E8 = E(context, "banner_packagename");
            String E9 = E(context, CampaignEx.JSON_KEY_BANNER_URL);
            if (y8 > -1 && E8 != null && E9 != null) {
                C1500j c1500j = new C1500j(y8, E8, E9);
                c1500j.z(y(this, context, "banner_last_time_shown", 0L, 4, null));
                c1500j.v(o(context, "banner_download_id"));
                c1500j.x(y(this, context, "banner_last_time_clicked", 0L, 4, null));
                c1500j.u(o(context, "banner_counter_impressions"));
                c1500j.y(y(this, context, "banner_last_time_requested", 0L, 4, null));
                return c1500j;
            }
            return null;
        }

        public final boolean g0(Context context) {
            AbstractC3159y.i(context, "context");
            return h(context, "settings_utd_sended", false);
        }

        public final void g1(Context context, boolean z8) {
            AbstractC3159y.i(context, "context");
            z0(context, "check_upcoming_releases_bug", z8);
        }

        public final boolean h(Context context, String key, boolean z8) {
            AbstractC3159y.i(context, "context");
            AbstractC3159y.i(key, "key");
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
                if (sharedPreferences.contains(key)) {
                    return sharedPreferences.getBoolean(key, z8);
                }
                return z8;
            } catch (Exception unused) {
                return z8;
            }
        }

        public final boolean h0(Context context) {
            AbstractC3159y.i(context, "context");
            return h(context, "show_system_apps", false);
        }

        public final void h1(Context context, long j8) {
            AbstractC3159y.i(context, "context");
            R0(context, "uptodown_turbo_register_popup_shown", j8);
        }

        public final boolean i0(Context context) {
            AbstractC3159y.i(context, "context");
            return h(context, "show_system_services", false);
        }

        public final void i1(Context context, String str) {
            AbstractC3159y.i(context, "context");
            d1(context, "url_526", str);
        }

        public final String j(Context context) {
            AbstractC3159y.i(context, "context");
            return F(context, "dark_mode", "system");
        }

        public final boolean j0(Context context) {
            AbstractC3159y.i(context, "context");
            return h(context, "is_status_code_526", false);
        }

        public final void j1(Context context, String str) {
            AbstractC3159y.i(context, "context");
            d1(context, "UTOKEN", str);
        }

        public final long k(Context context) {
            AbstractC3159y.i(context, "context");
            return x(context, "dark_mode_logged", -1L);
        }

        public final boolean k0(Context context) {
            AbstractC3159y.i(context, "context");
            return h(context, "gdpr_tracking_allowed", false);
        }

        public final void k1(Context context, int i8) {
            AbstractC3159y.i(context, "context");
            J0(context, "versioncode_526", i8);
        }

        public final int l(Context context) {
            AbstractC3159y.i(context, "context");
            return Integer.parseInt(F(context, "data_saver_options", "1"));
        }

        public final boolean l0(Context context) {
            AbstractC3159y.i(context, "context");
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("SharedPreferencesTracking", 0);
                if (!sharedPreferences.contains("maintenance_time")) {
                    return false;
                }
                if (System.currentTimeMillis() >= sharedPreferences.getLong("maintenance_time", 0L)) {
                    return false;
                }
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        public final void l1(Context context, boolean z8) {
            AbstractC3159y.i(context, "context");
            z0(context, "welcome_popup_shown", z8);
        }

        public final String m(Context context) {
            AbstractC3159y.i(context, "context");
            return E(context, "device_status");
        }

        public final boolean m0(Context context) {
            AbstractC3159y.i(context, "context");
            return h(context, "check_upcoming_releases_bug", false);
        }

        public final void m1(Context context, boolean z8) {
            AbstractC3159y.i(context, "context");
            z0(context, "wizard_completed", z8);
        }

        public final String n(Context context) {
            AbstractC3159y.i(context, "context");
            return F(context, "download_updates_options", "1");
        }

        public final boolean n0(Context context) {
            AbstractC3159y.i(context, "context");
            return h(context, "welcome_popup_shown", false);
        }

        public final void n1(Context context, int i8) {
            AbstractC3159y.i(context, "context");
            z0(context, "wizard_step_" + i8 + "_shown", true);
        }

        public final int o(Context context, String key) {
            AbstractC3159y.i(context, "context");
            AbstractC3159y.i(key, "key");
            return context.getSharedPreferences("SettingsPreferences", 0).getInt(key, -1);
        }

        public final boolean o0(Context context) {
            AbstractC3159y.i(context, "context");
            return h(context, "wizard_completed", false);
        }

        public final boolean o1(Context context) {
            AbstractC3159y.i(context, "context");
            return h(context, "show_warning_download_incompatible", true);
        }

        public final C1510u p(Context context) {
            AbstractC3159y.i(context, "context");
            long y8 = y(this, context, "interstitial_app_id", 0L, 4, null);
            String E8 = E(context, "interstitial_packagename");
            String E9 = E(context, "interstitial_url");
            if (y8 > -1 && E8 != null && E9 != null) {
                C1510u c1510u = new C1510u(y8, E8, E9);
                c1510u.z(y(this, context, "interstitial_last_time_shown", 0L, 4, null));
                c1510u.v(o(context, "interstitial_download_id"));
                c1510u.x(y(this, context, "interstitial_last_time_clicked", 0L, 4, null));
                c1510u.u(o(context, "interstitial_counter_impressions"));
                c1510u.y(y(this, context, "interstitial_last_time_requested", 0L, 4, null));
                return c1510u;
            }
            return null;
        }

        public final boolean p0(int i8, Context context) {
            AbstractC3159y.i(context, "context");
            return h(context, "wizard_step_" + i8 + "_shown", false);
        }

        public final String q(Context context) {
            AbstractC3159y.i(context, "context");
            return E(context, "Language");
        }

        public final void q0(Context context, C1500j bannerInfo) {
            AbstractC3159y.i(context, "context");
            AbstractC3159y.i(bannerInfo, "bannerInfo");
            R0(context, "banner_app_id", bannerInfo.k());
            d1(context, "banner_packagename", bannerInfo.r());
            d1(context, CampaignEx.JSON_KEY_BANNER_URL, bannerInfo.n());
            R0(context, "banner_last_time_shown", bannerInfo.q());
            J0(context, "banner_download_id", bannerInfo.m());
            R0(context, "banner_last_time_clicked", bannerInfo.o());
            J0(context, "banner_counter_impressions", bannerInfo.l());
            R0(context, "banner_last_time_requested", bannerInfo.p());
        }

        public final long r(Context context) {
            AbstractC3159y.i(context, "context");
            return x(context, "last_analysis_timestamp", 0L);
        }

        public final void r0(Context context, C1510u interstitialInfo) {
            AbstractC3159y.i(context, "context");
            AbstractC3159y.i(interstitialInfo, "interstitialInfo");
            R0(context, "interstitial_app_id", interstitialInfo.k());
            d1(context, "interstitial_packagename", interstitialInfo.r());
            d1(context, "interstitial_url", interstitialInfo.n());
            R0(context, "interstitial_last_time_shown", interstitialInfo.q());
            J0(context, "interstitial_download_id", interstitialInfo.m());
            R0(context, "interstitial_last_time_clicked", interstitialInfo.o());
            J0(context, "interstitial_counter_impressions", interstitialInfo.l());
            R0(context, "interstitial_last_time_requested", interstitialInfo.p());
        }

        public final String s(Context context) {
            AbstractC3159y.i(context, "context");
            return E(context, "last_notification_timestamp");
        }

        public final void s0(Context context, x notificationFCM) {
            AbstractC3159y.i(context, "context");
            AbstractC3159y.i(notificationFCM, "notificationFCM");
            R0(context, "fcm_app_id", notificationFCM.b());
            d1(context, "fcm_packagename", notificationFCM.d());
            J0(context, "fcm_download_id", notificationFCM.c());
            R0(context, "fcm_received_timestamp", notificationFCM.e());
            R0(context, "fcm_shown_timestamp", notificationFCM.f());
        }

        public final String t(Context context) {
            AbstractC3159y.i(context, "context");
            return E(context, "last_review_text");
        }

        public final void t0(Context context, P uploadInfo) {
            AbstractC3159y.i(context, "context");
            AbstractC3159y.i(uploadInfo, "uploadInfo");
            R0(context, "bytes_uploaded", uploadInfo.b());
            R0(context, "timestamp_uploaded", uploadInfo.c());
        }

        public final String u(Context context) {
            AbstractC3159y.i(context, "context");
            return E(context, "last_review_timestamp");
        }

        public final void u0(Context context, boolean z8) {
            AbstractC3159y.i(context, "context");
            z0(context, "gdpr_analytics_allowed", z8);
        }

        public final long v(Context context) {
            AbstractC3159y.i(context, "context");
            return x(context, "last_events_timestamp", 0L);
        }

        public final void v0(Context context, boolean z8) {
            AbstractC3159y.i(context, "context");
            z0(context, "animations", z8);
        }

        public final long w(Context context) {
            AbstractC3159y.i(context, "context");
            return x(context, "mintegral_interstitial_last_shown", 0L);
        }

        public final void w0(Context context, String str) {
            AbstractC3159y.i(context, "context");
            d1(context, "apk_to_rollback", str);
        }

        public final long x(Context context, String key, long j8) {
            AbstractC3159y.i(context, "context");
            AbstractC3159y.i(key, "key");
            SharedPreferences sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
            try {
                return sharedPreferences.getLong(key, j8);
            } catch (ClassCastException unused) {
                try {
                    long j9 = sharedPreferences.getInt(key, -1);
                    R0(context, key, j9);
                    return j9;
                } catch (ClassCastException unused2) {
                    return j8;
                }
            }
        }

        public final void x0(Context context, String str) {
            AbstractC3159y.i(context, "context");
            d1(context, "app_id_after_kill", str);
        }

        public final void y0(Context context, boolean z8) {
            AbstractC3159y.i(context, "context");
            z0(context, "auto_update_apps", z8);
        }

        public final String z(Context context) {
            AbstractC3159y.i(context, "context");
            String F8 = F(context, "notifications_frecuency", "1");
            if (n.s(F8, MBridgeConstans.ENDCARD_URL_TYPE_PL, false)) {
                d1(context, "notifications_frecuency", "1");
                return "1";
            }
            return F8;
        }

        public final void z0(Context context, String key, boolean z8) {
            AbstractC3159y.i(context, "context");
            AbstractC3159y.i(key, "key");
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("SettingsPreferences", 0).edit();
                edit.putBoolean(key, z8);
                edit.apply();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends PreferenceFragmentCompat {

        /* renamed from: a, reason: collision with root package name */
        private String[] f29325a;

        /* renamed from: b, reason: collision with root package name */
        private String[] f29326b;

        /* renamed from: c, reason: collision with root package name */
        private final ActivityResultLauncher f29327c;

        public b() {
            ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: C4.n
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj) {
                    SettingsPreferences.b.w(SettingsPreferences.b.this, (ActivityResult) obj);
                }
            });
            AbstractC3159y.h(registerForActivityResult, "registerForActivityResul…}\n            }\n        }");
            this.f29327c = registerForActivityResult;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean A(b this$0, Preference it) {
            ActivityOptionsCompat activityOptionsCompat;
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(it, "it");
            Intent intent = new Intent(this$0.getActivity(), (Class<?>) LanguageSettingsActivity.class);
            ActivityResultLauncher activityResultLauncher = this$0.f29327c;
            FragmentActivity activity = this$0.getActivity();
            if (activity != null) {
                activityOptionsCompat = UptodownApp.f28003B.b(activity);
            } else {
                activityOptionsCompat = null;
            }
            activityResultLauncher.launch(intent, activityOptionsCompat);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean B(b this$0, Preference preference, Object obj) {
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(preference, "preference");
            a aVar = SettingsPreferences.f29323b;
            Context requireContext = this$0.requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            aVar.W0(requireContext, !obj.equals(MBridgeConstans.ENDCARD_URL_TYPE_PL));
            if (obj.equals(MBridgeConstans.ENDCARD_URL_TYPE_PL)) {
                preference.setSummary(this$0.getString(R.string.internal_storage));
            } else {
                preference.setSummary(this$0.getString(R.string.sd_card));
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean C(b this$0, Preference it) {
            Bundle bundle;
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(it, "it");
            Intent intent = new Intent(this$0.getActivity(), (Class<?>) TosPreferences.class);
            FragmentActivity activity = this$0.getActivity();
            if (activity != null) {
                bundle = UptodownApp.f28003B.a(activity);
            } else {
                bundle = null;
            }
            this$0.startActivity(intent, bundle);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean D(b this$0, Preference it) {
            Bundle bundle;
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(it, "it");
            Intent intent = new Intent(this$0.getActivity(), (Class<?>) FeedbackPreferences.class);
            FragmentActivity activity = this$0.getActivity();
            if (activity != null) {
                bundle = UptodownApp.f28003B.a(activity);
            } else {
                bundle = null;
            }
            this$0.startActivity(intent, bundle);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean E(b this$0, Preference it) {
            Bundle bundle;
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(it, "it");
            Intent intent = new Intent(this$0.getActivity(), (Class<?>) AboutPreferences.class);
            FragmentActivity activity = this$0.getActivity();
            if (activity != null) {
                bundle = UptodownApp.f28003B.a(activity);
            } else {
                bundle = null;
            }
            this$0.startActivity(intent, bundle);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean F(b this$0, Preference it) {
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(it, "it");
            String string = this$0.getString(R.string.privacy_policy_title);
            AbstractC3159y.h(string, "getString(R.string.privacy_policy_title)");
            String string2 = this$0.getString(R.string.url_advertising);
            AbstractC3159y.h(string2, "getString(R.string.url_advertising)");
            C3323k c3323k = new C3323k();
            FragmentActivity requireActivity = this$0.requireActivity();
            AbstractC3159y.h(requireActivity, "requireActivity()");
            c3323k.q(requireActivity, string2, string);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean G(b this$0, Preference it) {
            Bundle bundle;
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(it, "it");
            Intent intent = new Intent(this$0.getActivity(), (Class<?>) AdvancedPreferences.class);
            FragmentActivity activity = this$0.getActivity();
            if (activity != null) {
                bundle = UptodownApp.f28003B.a(activity);
            } else {
                bundle = null;
            }
            this$0.startActivity(intent, bundle);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean H(b this$0, Preference pref, Object obj) {
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(pref, "pref");
            if (obj instanceof String) {
                this$0.v((String) obj, pref);
                return true;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean I(b this$0, Preference it) {
            Bundle bundle;
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(it, "it");
            Intent intent = new Intent(this$0.getActivity(), (Class<?>) NotificationsPreferences.class);
            FragmentActivity activity = this$0.getActivity();
            if (activity != null) {
                bundle = UptodownApp.f28003B.a(activity);
            } else {
                bundle = null;
            }
            this$0.startActivity(intent, bundle);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean J(b this$0, Preference it) {
            Bundle bundle;
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(it, "it");
            UptodownApp.a aVar = UptodownApp.f28003B;
            Context requireContext = this$0.requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            if (aVar.U(requireContext)) {
                this$0.startActivity(new Intent(this$0.getActivity(), (Class<?>) TvPrivacyPreferences.class));
                return true;
            }
            Intent intent = new Intent(this$0.getActivity(), (Class<?>) GdprPrivacySettings.class);
            FragmentActivity activity = this$0.getActivity();
            if (activity != null) {
                bundle = aVar.a(activity);
            } else {
                bundle = null;
            }
            this$0.startActivity(intent, bundle);
            return true;
        }

        private final void v(String str, Preference preference) {
            String str2;
            if (!AbstractC3159y.d(str, MBridgeConstans.ENDCARD_URL_TYPE_PL)) {
                Long l8 = null;
                if (AbstractC3159y.d(str, "1")) {
                    str2 = getString(R.string.download_updates_option_1);
                } else if (AbstractC3159y.d(str, "2")) {
                    str2 = getString(R.string.download_updates_option_2);
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    File externalFilesDir = requireContext().getExternalFilesDir(null);
                    if (externalFilesDir != null) {
                        l8 = Long.valueOf(externalFilesDir.getUsableSpace());
                    }
                    if (l8 == null) {
                        preference.setSummary(str2 + "\n⚠ " + getString(R.string.error_cant_create_dir));
                        return;
                    }
                    if (l8.longValue() < 262144000) {
                        preference.setSummary(str2 + "\n⚠ " + getString(R.string.error_not_enough_space));
                        return;
                    }
                    preference.setSummary(str2);
                    return;
                }
                return;
            }
            preference.setSummary(getString(R.string.download_updates_option_0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void w(b this$0, ActivityResult activityResult) {
            Intent intent;
            AbstractC3159y.i(this$0, "this$0");
            if (activityResult.getResultCode() == 1003) {
                FragmentActivity activity = this$0.getActivity();
                if (activity != null) {
                    activity.setResult(PointerIconCompat.TYPE_HELP);
                }
                FragmentActivity activity2 = this$0.getActivity();
                if (activity2 != null) {
                    activity2.finish();
                }
                FragmentActivity activity3 = this$0.getActivity();
                if (activity3 != null && (intent = activity3.getIntent()) != null) {
                    this$0.startActivity(intent);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean x(b this$0, Preference it) {
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(it, "it");
            FragmentActivity activity = this$0.getActivity();
            if (activity != null) {
                activity.setResult(PointerIconCompat.TYPE_WAIT);
                return true;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean y(Preference preference, Object obj) {
            AbstractC3159y.i(preference, "<anonymous parameter 0>");
            if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                try {
                    r.f7237a.d();
                    return true;
                } catch (Exception e8) {
                    e8.printStackTrace();
                    return true;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean z(G4.a coreSettings, Preference preference, Object obj) {
            AbstractC3159y.i(coreSettings, "$coreSettings");
            AbstractC3159y.i(preference, "<anonymous parameter 0>");
            if (obj instanceof Boolean) {
                Boolean bool = (Boolean) obj;
                coreSettings.B(bool.booleanValue());
                if (bool.booleanValue()) {
                    coreSettings.M(true);
                }
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x024d, code lost:
        
            if (r0.x(r2) == false) goto L40;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0112 A[LOOP:1: B:18:0x010c->B:20:0x0112, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x015e  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x02d8  */
        /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
        @Override // androidx.preference.PreferenceFragmentCompat
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onCreatePreferences(android.os.Bundle r13, java.lang.String r14) {
            /*
                Method dump skipped, instructions count: 753
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.preferences.SettingsPreferences.b.onCreatePreferences(android.os.Bundle, java.lang.String):void");
        }

        @Override // androidx.fragment.app.Fragment
        public void onResume() {
            String string;
            super.onResume();
            Preference findPreference = findPreference("notifications");
            AbstractC3159y.f(findPreference);
            findPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: C4.s
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    boolean I8;
                    I8 = SettingsPreferences.b.I(SettingsPreferences.b.this, preference);
                    return I8;
                }
            });
            C3335w c3335w = C3335w.f34546a;
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            if (c3335w.a(requireContext)) {
                string = getString(R.string.enabled);
                AbstractC3159y.h(string, "getString(R.string.enabled)");
            } else {
                string = getString(R.string.disabled);
                AbstractC3159y.h(string, "getString(R.string.disabled)");
            }
            findPreference.setSummary(string);
            Preference findPreference2 = findPreference("gdpr");
            a aVar = SettingsPreferences.f29323b;
            Context requireContext2 = requireContext();
            AbstractC3159y.h(requireContext2, "requireContext()");
            if (!aVar.W(requireContext2)) {
                PreferenceScreen preferenceScreen = getPreferenceScreen();
                AbstractC3159y.f(findPreference2);
                preferenceScreen.removePreference(findPreference2);
            } else {
                AbstractC3159y.f(findPreference2);
                findPreference2.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: C4.t
                    @Override // androidx.preference.Preference.OnPreferenceClickListener
                    public final boolean onPreferenceClick(Preference preference) {
                        boolean J8;
                        J8 = SettingsPreferences.b.J(SettingsPreferences.b.this, preference);
                        return J8;
                    }
                });
            }
        }
    }

    @Override // C4.g, android.app.Activity
    public void finish() {
        M m8 = new M(this);
        if (!m8.b(this.f29324a)) {
            C1504n c1504n = new C1504n();
            c1504n.h(this);
            m8.k(this, c1504n);
        }
        super.finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f29324a = new M(this);
        setTitle(getString(R.string.settings));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        getSupportFragmentManager().beginTransaction().replace(android.R.id.content, new b()).commit();
    }
}
