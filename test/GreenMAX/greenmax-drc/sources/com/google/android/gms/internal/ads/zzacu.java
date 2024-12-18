package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import cm.aptoide.pt.file.CacheHelper;
import cm.aptoide.pt.notification.sync.LocalNotificationSyncManager;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzacu {
    private static final zzacj<String> A;
    public static final zzacj<String> A0;
    private static final zzacj<Integer> A1;
    private static final zzacj<Boolean> A2;
    public static final zzacj<Long> A3;
    public static final zzacj<Boolean> A4;
    public static final zzacj<Integer> B;
    public static final zzacj<String> B0;
    private static final zzacj<String> B1;
    private static final zzacj<String> B2;
    public static final zzacj<Long> B3;
    public static final zzacj<Boolean> B4;
    public static final zzacj<Integer> C;
    public static final zzacj<Boolean> C0;
    private static final zzacj<Integer> C1;
    public static final zzacj<String> C2;
    public static final zzacj<Boolean> C3;
    public static final zzacj<Boolean> C4;
    public static final zzacj<Integer> D;
    public static final zzacj<String> D0;
    private static final zzacj<Integer> D1;
    public static final zzacj<Long> D2;
    public static final zzacj<String> D3;
    public static final zzacj<Boolean> D4;
    public static final zzacj<Long> E;
    public static final zzacj<Long> E0;
    private static final zzacj<Long> E1;
    public static final zzacj<Boolean> E2;
    public static final zzacj<Integer> E3;
    public static final zzacj<Boolean> E4;
    public static final zzacj<Long> F;
    public static final zzacj<Integer> F0;
    private static final zzacj<Long> F1;
    private static final zzacj<Boolean> F2;
    public static final zzacj<Boolean> F3;
    private static final zzacj<Boolean> F4;
    public static final zzacj<Integer> G;
    public static final zzacj<Boolean> G0;
    private static final zzacj<Float> G1;
    private static final zzacj<Boolean> G2;
    public static final zzacj<Boolean> G3;
    public static final zzacj<Boolean> G4;
    public static final zzacj<Boolean> H;
    public static final zzacj<Boolean> H0;
    private static final zzacj<Float> H1;
    public static final zzacj<String> H2;
    public static final zzacj<Long> H3;
    private static final zzacj<Boolean> H4;
    public static final zzacj<String> I;
    public static final zzacj<Boolean> I0;
    public static final zzacj<Boolean> I1;
    private static final zzacj<String> I2;
    public static final zzacj<String> I3;
    public static final zzacj<Boolean> I4;
    public static final zzacj<Long> J;
    public static final zzacj<Boolean> J0;
    public static final zzacj<Boolean> J1;
    private static final zzacj<String> J2;
    public static final zzacj<String> J3;
    public static final zzacj<Boolean> J4;
    public static final zzacj<Boolean> K;
    public static final zzacj<Boolean> K0;
    private static final zzacj<Integer> K1;
    public static final zzacj<String> K2;
    public static final zzacj<String> K3;
    public static final zzacj<Boolean> K4;
    public static final zzacj<Long> L;
    public static final zzacj<Boolean> L0;
    public static final zzacj<String> L1;
    public static final zzacj<Integer> L2;
    public static final zzacj<String> L3;
    public static final zzacj<Long> L4;
    public static final zzacj<Boolean> M;
    public static final zzacj<Boolean> M0;
    public static final zzacj<String> M1;
    private static final zzacj<Integer> M2;
    public static final zzacj<Integer> M3;
    public static final zzacj<String> M4;
    public static final zzacj<Integer> N;
    private static final zzacj<Integer> N0;
    public static final zzacj<Boolean> N1;
    public static final zzacj<Boolean> N2;
    public static final zzacj<Integer> N3;
    public static final zzacj<Integer> N4;
    public static final zzacj<Long> O;
    private static final zzacj<String> O0;
    public static final zzacj<Boolean> O1;
    public static final zzacj<String> O2;
    public static final zzacj<Boolean> O3;
    public static final zzacj<Integer> O4;
    public static final zzacj<Boolean> P;
    public static final zzacj<Boolean> P0;
    public static final zzacj<Long> P1;
    private static final zzacj<Boolean> P2;
    public static final zzacj<Boolean> P3;
    public static final zzacj<Integer> P4;
    public static final zzacj<Boolean> Q;
    public static final zzacj<Boolean> Q0;
    public static final zzacj<Long> Q1;
    public static final zzacj<Boolean> Q2;
    public static final zzacj<Boolean> Q3;
    public static final zzacj<Integer> Q4;
    public static final zzacj<String> R;
    public static final zzacj<Boolean> R0;
    public static final zzacj<Boolean> R1;
    public static final zzacj<Boolean> R2;
    public static final zzacj<Integer> R3;
    private static final zzacj<Boolean> R4;
    public static final zzacj<Integer> S;
    public static final zzacj<Boolean> S0;
    public static final zzacj<Boolean> S1;
    public static final zzacj<Boolean> S2;
    public static final zzacj<Boolean> S3;
    private static final zzacj<Boolean> S4;
    private static final zzacj<Float> T;
    public static final zzacj<Boolean> T0;
    public static final zzacj<Long> T1;
    private static final zzacj<Boolean> T2;
    public static final zzacj<Boolean> T3;
    public static final zzacj<Boolean> T4;
    private static final zzacj<String> U;
    private static final zzacj<Boolean> U0;
    private static final zzacj<Boolean> U1;
    public static final zzacj<Boolean> U2;
    private static final zzacj<Boolean> U3;
    public static final zzacj<Boolean> U4;
    private static final zzacj<Boolean> V;
    public static final zzacj<Boolean> V0;
    public static final zzacj<Boolean> V1;
    private static final zzacj<Boolean> V2;
    public static final zzacj<Boolean> V3;
    public static final zzacj<Boolean> V4;
    private static final zzacj<Float> W;
    private static final zzacj<Boolean> W0;
    private static final zzacj<Boolean> W1;
    private static final zzacj<String> W2;
    public static final zzacj<String> W3;
    public static final zzacj<Integer> W4;
    private static final zzacj<Boolean> X;
    public static final zzacj<Boolean> X0;
    private static final zzacj<Boolean> X1;
    public static final zzacj<Long> X2;
    public static final zzacj<String> X3;
    public static final zzacj<Boolean> X4;
    private static final zzacj<Boolean> Y;
    private static final zzacj<String> Y0;
    private static final zzacj<Boolean> Y1;
    private static final zzacj<String> Y2;
    public static final zzacj<Boolean> Y3;
    public static final zzacj<Integer> Y4;
    public static final zzacj<String> Z;
    private static final zzacj<Boolean> Z0;
    public static final zzacj<Long> Z1;
    private static final zzacj<Long> Z2;
    private static final zzacj<String> Z3;
    private static final zzacj<Boolean> Z4;
    public static final zzacj<String> a0;
    public static final zzacj<Boolean> a1;
    public static final zzacj<Boolean> a2;
    private static final zzacj<String> a3;
    public static final zzacj<Integer> a4;
    public static final zzacj<Boolean> a5;
    public static final zzacj<String> b0;
    private static final zzacj<Long> b1;
    public static final zzacj<Boolean> b2;
    private static final zzacj<Boolean> b3;
    public static final zzacj<Boolean> b4;
    public static final zzacj<Integer> b5;
    public static final zzacj<String> c0;
    public static final zzacj<Boolean> c1;
    private static final zzacj<Long> c2;
    public static final zzacj<Boolean> c3;
    public static final zzacj<Integer> c4;
    public static final zzacj<Boolean> c5;
    public static final zzacj<Boolean> d0;
    public static final zzacj<Boolean> d1;
    private static final zzacj<Long> d2;
    private static final zzacj<String> d3;
    public static final zzacj<Boolean> d4;
    public static final zzacj<Boolean> d5;
    public static final zzacj<Boolean> e0;
    public static final zzacj<Long> e1;
    public static final zzacj<Long> e2;
    public static final zzacj<Boolean> e3;
    private static final zzacj<Boolean> e4;
    public static final zzacj<Boolean> e5;

    /* renamed from: f, reason: collision with root package name */
    private static final zzacj<Boolean> f12626f;
    public static final zzacj<String> f0;
    public static final zzacj<Long> f1;
    public static final zzacj<Boolean> f2;
    public static final zzacj<Long> f3;
    private static final zzacj<String> f4;
    private static byte[] f5;

    /* renamed from: g, reason: collision with root package name */
    private static final zzacj<String> f12627g;
    public static final zzacj<Boolean> g0;
    public static final zzacj<Boolean> g1;
    public static final zzacj<Long> g2;
    private static final zzacj<String> g3;
    private static final zzacj<Boolean> g4;

    /* renamed from: h, reason: collision with root package name */
    private static final zzacj<String> f12628h;
    public static final zzacj<Boolean> h0;
    public static final zzacj<Long> h1;
    public static final zzacj<Long> h2;
    private static final zzacj<String> h3;
    private static final zzacj<String> h4;

    /* renamed from: i, reason: collision with root package name */
    public static final zzacj<Boolean> f12629i;
    public static final zzacj<Integer> i0;
    public static final zzacj<Boolean> i1;
    public static final zzacj<Boolean> i2;
    private static final zzacj<String> i3;
    private static final zzacj<Boolean> i4;

    /* renamed from: j, reason: collision with root package name */
    private static final zzacj<Boolean> f12630j;
    public static final zzacj<Integer> j0;
    private static final zzacj<Boolean> j1;
    public static final zzacj<Boolean> j2;
    private static final zzacj<String> j3;
    public static final zzacj<Boolean> j4;

    /* renamed from: k, reason: collision with root package name */
    private static final zzacj<String> f12631k;
    public static final zzacj<Integer> k0;
    public static final zzacj<Long> k1;
    public static final zzacj<Long> k2;
    private static final zzacj<String> k3;
    public static final zzacj<String> k4;
    public static final zzacj<Boolean> l;
    public static final zzacj<Integer> l0;
    public static final zzacj<Boolean> l1;
    public static final zzacj<Boolean> l2;
    private static final zzacj<String> l3;
    private static final zzacj<Boolean> l4;
    public static final zzacj<Boolean> m;
    public static final zzacj<Integer> m0;
    public static final zzacj<Boolean> m1;
    public static final zzacj<Boolean> m2;
    private static final zzacj<Long> m3;
    private static final zzacj<String> m4;
    public static final zzacj<Boolean> n;
    public static final zzacj<Integer> n0;
    public static final zzacj<Boolean> n1;
    public static final zzacj<Boolean> n2;
    public static final zzacj<Long> n3;
    public static final zzacj<Boolean> n4;
    public static final zzacj<String> o;
    public static final zzacj<Integer> o0;
    public static final zzacj<Boolean> o1;
    public static final zzacj<Boolean> o2;
    private static final zzacj<String> o3;
    public static final zzacj<Boolean> o4;
    public static final zzacj<Float> p;
    public static final zzacj<Integer> p0;
    private static final zzacj<Boolean> p1;
    public static final zzacj<Boolean> p2;
    private static final zzacj<Long> p3;
    private static final zzacj<Boolean> p4;
    private static final zzacj<String> q;
    public static final zzacj<String> q0;
    private static final zzacj<String> q1;
    public static final zzacj<Boolean> q2;
    public static final zzacj<Boolean> q3;
    public static final zzacj<Boolean> q4;
    private static final zzacj<String> r;
    public static final zzacj<String> r0;
    private static final zzacj<Integer> r1;
    public static final zzacj<Boolean> r2;
    private static final zzacj<Integer> r3;
    public static final zzacj<Boolean> r4;
    private static final zzacj<Integer> s;
    public static final zzacj<Boolean> s0;
    private static final zzacj<Integer> s1;
    public static final zzacj<String> s2;
    private static final zzacj<Integer> s3;
    private static final zzacj<Boolean> s4;
    public static final zzacj<String> t;
    private static final zzacj<Boolean> t0;
    public static final zzacj<Boolean> t1;
    public static final zzacj<Boolean> t2;
    private static final zzacj<Long> t3;
    public static final zzacj<Boolean> t4;
    public static final zzacj<Integer> u;
    private static final zzacj<Long> u0;
    private static final zzacj<Boolean> u1;
    public static final zzacj<Boolean> u2;
    public static final zzacj<Boolean> u3;
    public static final zzacj<Integer> u4;
    public static final zzacj<Integer> v;
    private static final zzacj<String> v0;
    private static final zzacj<Boolean> v1;
    public static final zzacj<Boolean> v2;
    public static final zzacj<Boolean> v3;
    public static final zzacj<Boolean> v4;
    public static final zzacj<Integer> w;
    public static final zzacj<Boolean> w0;
    private static final zzacj<String> w1;
    public static final zzacj<Boolean> w2;
    public static final zzacj<Boolean> w3;
    public static final zzacj<Boolean> w4;
    public static final zzacj<Integer> x;
    public static final zzacj<Boolean> x0;
    private static final zzacj<String> x1;
    public static final zzacj<Boolean> x2;
    public static final zzacj<Long> x3;
    public static final zzacj<Boolean> x4;
    public static final zzacj<Integer> y;
    public static final zzacj<Boolean> y0;
    private static final zzacj<Integer> y1;
    public static final zzacj<Boolean> y2;
    public static final zzacj<Boolean> y3;
    private static final zzacj<Boolean> y4;
    public static final zzacj<Integer> z;
    public static final zzacj<Boolean> z0;
    private static final zzacj<Integer> z1;
    private static final zzacj<Boolean> z2;
    public static final zzacj<Boolean> z3;
    public static final zzacj<Boolean> z4;
    private static final zzacj<String> a = zzacj.l(0, "gads:sdk_core_experiment_id");

    /* renamed from: b, reason: collision with root package name */
    public static final zzacj<String> f12622b = zzacj.g(0, "gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40-loader.html");

    /* renamed from: c, reason: collision with root package name */
    public static final zzacj<String> f12623c = zzacj.g(1, "gads:sdk_core_location:client:html", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.html");

    /* renamed from: d, reason: collision with root package name */
    public static final zzacj<String> f12624d = zzacj.g(1, "gads:active_view_location:html", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.html");

    /* renamed from: e, reason: collision with root package name */
    private static final zzacj<String> f12625e = zzacj.g(0, "gads:sdk_core_js_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.js");

    static {
        Boolean bool = Boolean.FALSE;
        f12626f = zzacj.f(0, "gads:request_builder:singleton_webview", bool);
        f12627g = zzacj.l(0, "gads:request_builder:singleton_webview_experiment_id");
        f12628h = zzacj.l(0, "gads:request_builder:refresh_if_destroyed:experiment_id");
        Boolean bool2 = Boolean.TRUE;
        f12629i = zzacj.f(0, "gads:request_builder:refresh_if_destroyed:enable", bool2);
        f12630j = zzacj.f(0, "gads:sdk_use_dynamic_module", bool2);
        f12631k = zzacj.l(0, "gads:sdk_use_dynamic_module_experiment_id");
        l = zzacj.f(0, "gads:sdk_crash_report_enabled", bool);
        m = zzacj.f(0, "gads:report_dynamite_crash_in_background_thread", bool);
        n = zzacj.f(0, "gads:sdk_crash_report_full_stacktrace", bool);
        o = zzacj.g(0, "gads:sdk_crash_report_class_prefix", "com.google.");
        p = zzacj.c(1, "gads:trapped_exception_sample_rate", 0.01f);
        q = zzacj.l(0, "gads:block_autoclicks_experiment_id");
        r = zzacj.l(0, "gads:spam_app_context:experiment_id");
        s = zzacj.d(1, "gads:http_url_connection_factory:timeout_millis", 10000);
        t = zzacj.g(1, "gads:video_exo_player:version", "3");
        u = zzacj.d(1, "gads:video_exo_player:connect_timeout", 8000);
        v = zzacj.d(1, "gads:video_exo_player:read_timeout", 8000);
        w = zzacj.d(1, "gads:video_exo_player:loading_check_interval", CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES);
        x = zzacj.d(1, "gads:video_exo_player:exo_player_precache_limit", Integer.MAX_VALUE);
        y = zzacj.d(1, "gads:video_exo_player:byte_buffer_precache_limit", Integer.MAX_VALUE);
        z = zzacj.d(1, "gads:video_exo_player_socket_receive_buffer_size", 0);
        A = zzacj.l(0, "gads:video_stream_cache:experiment_id");
        B = zzacj.d(1, "gads:video_stream_cache:limit_count", 5);
        C = zzacj.d(1, "gads:video_stream_cache:limit_space", 8388608);
        D = zzacj.d(1, "gads:video_stream_exo_cache:buffer_size", 8388608);
        E = zzacj.e(1, "gads:video_stream_cache:limit_time_sec", 300L);
        F = zzacj.e(1, "gads:video_stream_cache:notify_interval_millis", 125L);
        G = zzacj.d(1, "gads:video_stream_cache:connect_timeout_millis", 10000);
        H = zzacj.f(0, "gads:video:metric_reporting_enabled", bool);
        I = zzacj.g(1, "gads:video:metric_frame_hash_times", HttpUrl.FRAGMENT_ENCODE_SET);
        J = zzacj.e(1, "gads:video:metric_frame_hash_time_leniency", 500L);
        K = zzacj.f(1, "gads:video:force_watermark", bool);
        L = zzacj.e(1, "gads:video:surface_update_min_spacing_ms", 1000L);
        M = zzacj.f(1, "gads:video:spinner:enabled", bool);
        N = zzacj.d(1, "gads:video:spinner:scale", 4);
        O = zzacj.e(1, "gads:video:spinner:jank_threshold_ms", 50L);
        P = zzacj.f(1, "gads:video:aggressive_media_codec_release", bool);
        Q = zzacj.f(1, "gads:memory_bundle:debug_info", bool);
        R = zzacj.g(1, "gads:video:codec_query_mime_types", HttpUrl.FRAGMENT_ENCODE_SET);
        S = zzacj.d(1, "gads:video:codec_query_minimum_version", 16);
        T = zzacj.c(0, "gads:ad_id_app_context:ping_ratio", 0.0f);
        U = zzacj.l(0, "gads:ad_id_use_shared_preference:experiment_id");
        V = zzacj.f(0, "gads:ad_id_use_shared_preference:enabled", bool);
        W = zzacj.c(0, "gads:ad_id_use_shared_preference:ping_ratio", 0.0f);
        X = zzacj.f(0, "gads:ad_id_use_persistent_service:enabled", bool);
        Y = zzacj.f(0, "gads:ad_id:use_ipc:enabled", bool);
        Z = zzacj.g(1, "gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");
        a0 = zzacj.g(1, "gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");
        b0 = zzacj.g(1, "gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");
        c0 = zzacj.g(1, "gad:mraid:version", "2.0");
        Boolean bool3 = Boolean.FALSE;
        d0 = zzacj.f(1, "gads:mraid:unload", bool3);
        e0 = zzacj.f(0, "gads:enabled_sdk_csi", bool3);
        f0 = zzacj.g(0, "gads:sdk_csi_server", "https://csi.gstatic.com/csi");
        g0 = zzacj.f(0, "gads:sdk_csi_write_to_file", bool3);
        Boolean bool4 = Boolean.TRUE;
        h0 = zzacj.f(0, "gads:enable_content_fetching", bool4);
        i0 = zzacj.d(0, "gads:content_length_weight", 1);
        j0 = zzacj.d(0, "gads:content_age_weight", 1);
        k0 = zzacj.d(0, "gads:min_content_len", 11);
        l0 = zzacj.d(0, "gads:fingerprint_number", 10);
        m0 = zzacj.d(0, "gads:sleep_sec", 10);
        n0 = zzacj.d(1, "gads:content_vertical_fingerprint_number", 100);
        o0 = zzacj.d(1, "gads:content_vertical_fingerprint_bits", 23);
        p0 = zzacj.d(1, "gads:content_vertical_fingerprint_ngram", 3);
        q0 = zzacj.g(1, "gads:content_fetch_view_tag_id", "googlebot");
        r0 = zzacj.g(1, "gads:content_fetch_exclude_view_tag", "none");
        s0 = zzacj.f(1, "gads:content_fetch_disable_get_title_from_webview", bool3);
        t0 = zzacj.f(0, "gads:app_index:without_content_info_present:enabled", bool4);
        u0 = zzacj.e(0, "gads:app_index:timeout_ms", 1000L);
        v0 = zzacj.l(0, "gads:app_index:experiment_id");
        w0 = zzacj.f(1, "gads:content_fetch_enable_new_content_score", bool3);
        x0 = zzacj.f(1, "gads:content_fetch_enable_serve_once", bool3);
        y0 = zzacj.f(0, "gads:ad_key_enabled", bool3);
        z0 = zzacj.f(1, "gads:sai:enabled", bool4);
        A0 = zzacj.g(1, "gads:sai:click_ping_schema_v2", "^[^?]*(/aclk\\?|/pcs/click\\?).*");
        B0 = zzacj.g(1, "gads:sai:impression_ping_schema_v2", "^[^?]*/adview.*");
        C0 = zzacj.f(1, "gads:sai:using_macro:enabled", bool3);
        D0 = zzacj.g(1, "gads:sai:ad_event_id_macro_name", "[gw_fbsaeid]");
        E0 = zzacj.e(1, "gads:sai:timeout_ms", -1L);
        F0 = zzacj.d(1, "gads:sai:scion_thread_pool_size", 5);
        G0 = zzacj.f(1, "gads:sai:app_measurement_enabled2", bool3);
        H0 = zzacj.f(2, "app_measurement_enabled", bool3);
        I0 = zzacj.f(1, "gads:sai:force_through_reflection", bool4);
        J0 = zzacj.f(1, "gads:sai:gmscore_availability_check_disabled", bool3);
        K0 = zzacj.f(1, "gads:sai:logging_disabled_for_drx", bool3);
        L0 = zzacj.f(1, "gads:interstitial:app_must_be_foreground:enabled", bool3);
        M0 = zzacj.f(1, "gads:interstitial:foreground_report:enabled", bool3);
        N0 = zzacj.d(0, "gads:webview_cache_version", 0);
        O0 = zzacj.l(0, "gads:corewebview:experiment_id");
        P0 = zzacj.f(0, "gads:corewebview:adwebview_factory:enable", bool3);
        Q0 = zzacj.f(0, "gads:corewebview:javascript_engine", bool3);
        R0 = zzacj.f(1, "gad:webview:inject_scripts", bool3);
        S0 = zzacj.f(0, "gads:webview:permission:disabled", bool3);
        T0 = zzacj.f(1, "gads:webview:error_web_response:enabled", bool3);
        U0 = zzacj.f(1, "gads:rsku:webviewgone:kill_process:enabled", bool3);
        V0 = zzacj.f(1, "gads:webviewgone:kill_process:enabled", bool3);
        W0 = zzacj.f(1, "gads:rsku:webviewgone:new_onshow:enabled", bool4);
        X0 = zzacj.f(1, "gads:webviewgone:new_onshow:enabled", bool3);
        Y0 = zzacj.m(0, "gads:pan:experiment_id");
        Z0 = zzacj.f(1, "gads:new_rewarded_ad:enabled", bool4);
        Boolean bool5 = Boolean.FALSE;
        a1 = zzacj.f(1, "gads:rewarded:adapter_initialization_enabled", bool5);
        b1 = zzacj.e(1, "gads:rewarded:adapter_timeout_ms", 20000L);
        c1 = zzacj.f(1, "gads:rewarded:ad_metadata_enabled", bool5);
        d1 = zzacj.f(1, "gads:rewarded:ssv_custom_data_enabled", bool4);
        e1 = zzacj.e(1, "gads:app_activity_tracker:notify_background_listeners_delay_ms", 500L);
        f1 = zzacj.e(1, "gads:app_activity_tracker:app_session_timeout_ms", TimeUnit.MINUTES.toMillis(5L));
        g1 = zzacj.f(1, "gads:adid_values_in_adrequest:enabled", bool5);
        h1 = zzacj.e(1, "gads:adid_values_in_adrequest:timeout", 2000L);
        i1 = zzacj.f(1, "gads:disable_adid_values_in_ms", bool5);
        Boolean bool6 = Boolean.TRUE;
        j1 = zzacj.f(0, "gads:ad_serving:enabled", bool6);
        k1 = zzacj.e(1, "gads:ad_overlay:delay_page_close_timeout_ms", 5000L);
        l1 = zzacj.f(1, "gads:custom_close_blocking:enabled", bool5);
        m1 = zzacj.f(1, "gads:disabling_closable_area:enabled", bool5);
        n1 = zzacj.f(1, "gads:use_system_ui_for_fullscreen:enabled", bool5);
        o1 = zzacj.f(1, "gads:ad_overlay:collect_cutout_info:enabled", bool5);
        p1 = zzacj.f(1, "gads:impression_optimization_enabled", bool5);
        q1 = zzacj.g(1, "gads:banner_ad_pool:schema", "customTargeting");
        r1 = zzacj.d(1, "gads:banner_ad_pool:max_queues", 3);
        s1 = zzacj.d(1, "gads:banner_ad_pool:max_pools", 3);
        t1 = zzacj.f(1, "gads:delay_banner_renderer:enabled", bool6);
        u1 = zzacj.f(1, "gads:interstitial_ad_pool:enabled", bool5);
        v1 = zzacj.f(1, "gads:interstitial_ad_pool:enabled_for_rewarded", bool5);
        w1 = zzacj.g(1, "gads:interstitial_ad_pool:schema", "customTargeting");
        x1 = zzacj.g(1, "gads:interstitial_ad_pool:request_exclusions", "com.google.ads.mediation.admob.AdMobAdapter/_ad");
        y1 = zzacj.d(1, "gads:interstitial_ad_pool:max_pools", 3);
        z1 = zzacj.d(1, "gads:interstitial_ad_pool:max_pool_depth", 2);
        A1 = zzacj.d(1, "gads:interstitial_ad_pool:time_limit_sec", 1200);
        B1 = zzacj.g(1, "gads:interstitial_ad_pool:ad_unit_exclusions", "(?!)");
        C1 = zzacj.d(1, "gads:interstitial_ad_pool:top_off_latency_min_millis", 0);
        D1 = zzacj.d(1, "gads:interstitial_ad_pool:top_off_latency_range_millis", 0);
        E1 = zzacj.e(1, "gads:interstitial_ad_pool:discard_thresholds", 0L);
        F1 = zzacj.e(1, "gads:interstitial_ad_pool:miss_thresholds", 0L);
        G1 = zzacj.c(1, "gads:interstitial_ad_pool:discard_asymptote", 0.0f);
        H1 = zzacj.c(1, "gads:interstitial_ad_pool:miss_asymptote", 0.0f);
        I1 = zzacj.f(0, "gads:debug_logging_feature:enable", bool5);
        J1 = zzacj.f(0, "gads:debug_logging_feature:intercept_web_view", bool5);
        K1 = zzacj.d(1, "gads:heap_wastage:bytes", 0);
        L1 = zzacj.g(1, "gads:spherical_video:vertex_shader", HttpUrl.FRAGMENT_ENCODE_SET);
        M1 = zzacj.g(1, "gads:spherical_video:fragment_shader", HttpUrl.FRAGMENT_ENCODE_SET);
        N1 = zzacj.f(0, "gads:log:verbose_enabled", bool5);
        O1 = zzacj.f(1, "gads:include_local_global_rectangles", bool5);
        P1 = zzacj.e(1, "gads:position_watcher:throttle_ms", 200L);
        Q1 = zzacj.e(1, "gads:position_watcher:scroll_aware_throttle_ms", 33L);
        R1 = zzacj.f(1, "gads:position_watcher:enable_scroll_aware_ads", bool5);
        S1 = zzacj.f(1, "gads:position_watcher:send_scroll_data", bool5);
        T1 = zzacj.e(0, "gads:device_info_caching_expiry_ms:expiry", LocalNotificationSyncManager.FIVE_MINUTES);
        U1 = zzacj.f(1, "gads:gen204_signals:enabled", bool5);
        V1 = zzacj.f(0, "gads:webview:error_reporting_enabled", bool5);
        Boolean bool7 = Boolean.FALSE;
        W1 = zzacj.f(0, "gads:adid_reporting:enabled", bool7);
        X1 = zzacj.f(0, "gads:ad_settings_page_reporting:enabled", bool7);
        Y1 = zzacj.f(0, "gads:adid_info_gmscore_upgrade_reporting:enabled", bool7);
        Z1 = zzacj.e(1, "gads:rtb_signal_timeout_ms", 1000L);
        a2 = zzacj.f(2, "rtb_enabled", bool7);
        b2 = zzacj.f(1, "gads:rtb_cld:enabled", bool7);
        c2 = zzacj.e(0, "gads:resolve_future:default_timeout_ms", 30000L);
        d2 = zzacj.e(0, "gads:ad_loader:timeout_ms", 60000L);
        e2 = zzacj.e(0, "gads:rendering:timeout_ms", 60000L);
        f2 = zzacj.f(1, "gads:adapter_initialization:enabled", bool7);
        g2 = zzacj.e(1, "gads:adapter_initialization:timeout", 30L);
        h2 = zzacj.e(1, "gads:adapter_initialization:cld_timeout", 10L);
        i2 = zzacj.f(0, "gads:adshield:enable_adshield_instrumentation", bool7);
        j2 = zzacj.f(1, "gads:gestures:errorlogging:enabled", bool7);
        k2 = zzacj.e(1, "gads:gestures:task_timeout", 2000L);
        l2 = zzacj.f(1, "gads:gestures:asig:enabled", bool7);
        m2 = zzacj.f(1, "gads:gestures:ans:enabled", bool7);
        n2 = zzacj.f(1, "gads:gestures:tos:enabled", bool7);
        Boolean bool8 = Boolean.TRUE;
        o2 = zzacj.f(1, "gads:gestures:brt:enabled", bool8);
        p2 = zzacj.f(1, "gads:signal:app_permissions:disabled", bool7);
        q2 = zzacj.f(1, "gads:gestures:inthex:enabled", bool7);
        r2 = zzacj.f(1, "gads:gestures:hpk:enabled", bool8);
        s2 = zzacj.g(1, "gads:gestures:pk", HttpUrl.FRAGMENT_ENCODE_SET);
        t2 = zzacj.f(1, "gads:gestures:bs:enabled", bool8);
        u2 = zzacj.f(1, "gads:gestures:check_initialization_thread:enabled", bool7);
        v2 = zzacj.f(1, "gads:gestures:get_query_in_non_ui_thread:enabled", bool8);
        w2 = zzacj.f(1, "gads:gestures:pds:enabled", bool7);
        x2 = zzacj.f(1, "gads:gestures:ns:enabled", bool7);
        y2 = zzacj.f(1, "gads:gestures:vdd:enabled", bool7);
        z2 = zzacj.f(0, "gads:adid_notification:first_party_check:enabled", bool8);
        A2 = zzacj.f(0, "gads:adid_track_reset_count:enabled", bool8);
        B2 = zzacj.l(1, "gads:sdk_core_constants:experiment_id");
        C2 = zzacj.g(1, "gads:sdk_core_constants:caps", HttpUrl.FRAGMENT_ENCODE_SET);
        D2 = zzacj.e(0, "gads:js_flags:update_interval", TimeUnit.HOURS.toMillis(12L));
        E2 = zzacj.f(0, "gads:js_flags:mf", bool7);
        F2 = zzacj.f(1, "gads:js_flags:disable_phenotype", bool7);
        G2 = zzacj.f(0, "gads:custom_render:ping_on_ad_rendered", bool7);
        H2 = zzacj.g(1, "gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
        I2 = zzacj.g(0, "gads:native:engine_js_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/native_ads.js");
        J2 = zzacj.g(1, "gads:native:video_url", "//imasdk.googleapis.com/admob/sdkloader/native_video.html");
        K2 = zzacj.g(1, "gads:native:video_url_with_protocol", "https://imasdk.googleapis.com/admob/sdkloader/native_video.html");
        L2 = zzacj.d(1, "gads:native_video_load_timeout", 10);
        M2 = zzacj.d(1, "gads:omid:native_webview_load_timeout", 2000);
        N2 = zzacj.f(1, "gads:enable_native_media_aspect_ratio", bool8);
        O2 = zzacj.g(1, "gads:ad_choices_content_description", "Ad Choices Icon");
        P2 = zzacj.f(1, "gads:enable_store_active_view_state", bool7);
        Q2 = zzacj.f(1, "gads:enable_singleton_broadcast_receiver", bool7);
        R2 = zzacj.f(1, "gads:native:media_view_match_parent:enabled", bool7);
        Boolean bool9 = Boolean.FALSE;
        S2 = zzacj.f(1, "gads:native:count_impression_for_assets", bool9);
        T2 = zzacj.f(1, "gads:instream_ad:enabled", bool8);
        U2 = zzacj.f(1, "gads:fluid_ad:use_wrap_content_height", bool9);
        V2 = zzacj.f(1, "gads:auto_location_for_coarse_permission", bool9);
        W2 = zzacj.m(1, "gads:auto_location_for_coarse_permission:experiment_id");
        X2 = zzacj.e(1, "gads:auto_location_timeout", 2000L);
        Y2 = zzacj.m(1, "gads:auto_location_timeout:experiment_id");
        Z2 = zzacj.e(1, "gads:auto_location_interval", -1L);
        a3 = zzacj.m(1, "gads:auto_location_interval:experiment_id");
        b3 = zzacj.f(0, "gads:auto_location_interval:without_thread", bool8);
        c3 = zzacj.f(1, "gads:fetch_app_settings_using_cld:enabled", bool9);
        d3 = zzacj.l(1, "gads:fetch_app_settings_using_cld:enabled:experiment_id");
        e3 = zzacj.f(1, "gads:use_manifest_appid_cld:enabled", bool9);
        f3 = zzacj.e(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms", 7200000L);
        g3 = zzacj.l(0, "gads:afs:csa:experiment_id");
        h3 = zzacj.g(0, "gads:afs:csa_webview_gmsg_ad_failed", "gmsg://noAdLoaded");
        i3 = zzacj.g(0, "gads:afs:csa_webview_gmsg_script_load_failed", "gmsg://scriptLoadFailed");
        j3 = zzacj.g(0, "gads:afs:csa_webview_gmsg_ad_loaded", "gmsg://adResized");
        k3 = zzacj.g(0, "gads:afs:csa_webview_static_file_path", "/afs/ads/i/webview.html");
        l3 = zzacj.g(0, "gads:afs:csa_webview_custom_domain_param_key", "csa_customDomain");
        m3 = zzacj.e(0, "gads:afs:csa_webview_adshield_timeout_ms", 1000L);
        n3 = zzacj.e(1, "gads:parental_controls:timeout", 2000L);
        o3 = zzacj.g(0, "gads:safe_browsing:api_key", "AIzaSyDRKQ9d6kfsoZT2lUnZcZnBYvH69HExNPE");
        p3 = zzacj.e(0, "gads:safe_browsing:safety_net:delay_ms", 2000L);
        q3 = zzacj.f(0, "gads:safe_browsing:debug", bool9);
        r3 = zzacj.d(1, "gads:cache:ad_request_timeout_millis", 250);
        s3 = zzacj.d(1, "gads:cache:max_concurrent_downloads", 10);
        t3 = zzacj.e(1, "gads:cache:javascript_timeout_millis", 5000L);
        u3 = zzacj.f(1, "gads:cache:bind_on_foreground", bool9);
        v3 = zzacj.f(1, "gads:cache:bind_on_init", bool9);
        w3 = zzacj.f(1, "gads:cache:bind_on_request", bool9);
        x3 = zzacj.e(1, "gads:cache:bind_on_request_keep_alive", TimeUnit.SECONDS.toMillis(30L));
        y3 = zzacj.f(1, "gads:cache:use_cache_data_source", bool9);
        z3 = zzacj.f(1, "gads:cache:connection_per_read", bool9);
        A3 = zzacj.e(1, "gads:cache:connection_timeout", 5000L);
        B3 = zzacj.e(1, "gads:cache:read_only_connection_timeout", 5000L);
        C3 = zzacj.f(1, "gads:http_assets_cache:enabled", bool9);
        D3 = zzacj.g(1, "gads:http_assets_cache:regex", "(?i)https:\\/\\/(tpc\\.googlesyndication\\.com\\/(.*)|lh\\d+\\.googleusercontent\\.com\\/(.*))");
        E3 = zzacj.d(1, "gads:http_assets_cache:time_out", 100);
        F3 = zzacj.f(1, "gads:chrome_custom_tabs_browser:enabled", bool9);
        G3 = zzacj.f(1, "gads:chrome_custom_tabs:disabled", bool9);
        H3 = zzacj.e(1, "gads:debug_hold_gesture:time_millis", 2000L);
        I3 = zzacj.g(1, "gads:drx_debug:debug_device_linking_url", "https://www.google.com/dfp/linkDevice");
        J3 = zzacj.g(1, "gads:drx_debug:in_app_preview_status_url", "https://www.google.com/dfp/inAppPreview");
        K3 = zzacj.g(1, "gads:drx_debug:debug_signal_status_url", "https://www.google.com/dfp/debugSignals");
        L3 = zzacj.g(1, "gads:drx_debug:send_debug_data_url", "https://www.google.com/dfp/sendDebugData");
        M3 = zzacj.d(1, "gads:drx_debug:timeout_ms", 5000);
        N3 = zzacj.d(1, "gad:pixel_dp_comparision_multiplier", 1);
        O3 = zzacj.f(1, "gad:interstitial_for_multi_window", bool9);
        Boolean bool10 = Boolean.FALSE;
        P3 = zzacj.f(1, "gad:interstitial_ad_stay_active_in_multi_window", bool10);
        Q3 = zzacj.f(1, "gad:interstitial_multi_window_method", bool10);
        R3 = zzacj.d(1, "gad:interstitial:close_button_padding_dip", 0);
        S3 = zzacj.f(1, "gads:clearcut_logging:enabled", bool10);
        T3 = zzacj.f(1, "gads:clearcut_logging:write_to_file", bool10);
        U3 = zzacj.f(0, "gad:force_local_ad_request_service:enabled", bool10);
        Boolean bool11 = Boolean.TRUE;
        V3 = zzacj.f(1, "gad:publisher_testing:force_local_request:enabled", bool11);
        W3 = zzacj.g(1, "gad:publisher_testing:force_local_request:enabled_list", HttpUrl.FRAGMENT_ENCODE_SET);
        X3 = zzacj.g(1, "gad:publisher_testing:force_local_request:disabled_list", HttpUrl.FRAGMENT_ENCODE_SET);
        Y3 = zzacj.f(0, "gad:force_dynamite_loading_enabled", bool10);
        Z3 = zzacj.l(0, "gad:dynamite_module:experiment_id");
        a4 = zzacj.d(1, "gad:http_redirect_max_count:times", 8);
        b4 = zzacj.f(1, "gads:omid:enabled", bool10);
        c4 = zzacj.d(1, "gads:omid:destroy_webview_delay", 1000);
        d4 = zzacj.f(0, "gads:nonagon:red_button", bool10);
        e4 = zzacj.f(1, "gads:nonagon:banner:enabled", bool10);
        f4 = zzacj.g(1, "gads:nonagon:banner:ad_unit_exclusions", "(?!)");
        g4 = zzacj.f(1, "gads:nonagon:interstitial:enabled", bool10);
        h4 = zzacj.g(1, "gads:nonagon:interstitial:ad_unit_exclusions", "(?!)");
        i4 = zzacj.f(1, "gads:nonagon:rewardedvideo:enabled", bool10);
        j4 = zzacj.f(1, "gads:nonagon:mobile_ads_setting_manager:enabled", bool10);
        k4 = zzacj.g(1, "gads:nonagon:rewardedvideo:ad_unit_exclusions", "(?!)");
        l4 = zzacj.f(1, "gads:nonagon:nativead:enabled", bool10);
        m4 = zzacj.g(1, "gads:nonagon:nativead:app_name", "(?!)");
        n4 = zzacj.f(1, "gads:nonagon:banner:check_dp_size", bool11);
        o4 = zzacj.f(1, "gads:nonagon:rewarded:load_multiple_ads", bool11);
        p4 = zzacj.f(1, "gads:nonagon:return_last_error_code", bool10);
        q4 = zzacj.f(1, "gads:nonagon:return_no_fill_error_code", bool10);
        r4 = zzacj.f(1, "gads:nonagon:continue_on_no_fill", bool10);
        s4 = zzacj.f(1, "gads:nonagon:open_not_loaded_interstitial", bool11);
        t4 = zzacj.f(1, "gads:nonagon:separate_timeout:enabled", bool11);
        u4 = zzacj.d(1, "gads:nonagon:request_timeout:seconds", 60);
        v4 = zzacj.f(0, "gads:nonagon:limit_ad_request_connection", bool11);
        w4 = zzacj.f(1, "gads:nonagon:javascript_ad_request:enabled", bool10);
        x4 = zzacj.f(1, "gads:nonagon:banner_recursive_renderer", bool10);
        y4 = zzacj.f(1, "gads:nonagon:service:enabled", bool11);
        z4 = zzacj.f(1, "gads:nonagon:active_view_gmsg_background_thread:enabled", bool11);
        A4 = zzacj.f(1, "gads:signals:ad_id_info:enabled", bool10);
        B4 = zzacj.f(1, "gads:signals:app_index:enabled", bool10);
        C4 = zzacj.f(1, "gads:signals:cache:enabled", bool10);
        D4 = zzacj.f(1, "gads:signals:doritos:enabled", bool10);
        E4 = zzacj.f(1, "gads:signals:doritos:v1:enabled", bool10);
        F4 = zzacj.f(1, "gads:signals:doritos:v2:immediate:enabled", bool10);
        G4 = zzacj.f(1, "gads:signals:location:enabled", bool10);
        H4 = zzacj.f(1, "gads:signals:network_prediction:enabled", bool10);
        I4 = zzacj.f(1, "gads:signals:parental_control:enabled", bool10);
        J4 = zzacj.f(1, "gads:signals:video_decoder:enabled", bool10);
        K4 = zzacj.f(1, "gads:signals:signals_on_service:enabled", bool10);
        L4 = zzacj.e(1, "gads:mobius_linking:sdk_side_cooldown_time_threshold:ms", 3600000L);
        M4 = zzacj.g(0, "gads:public_beta:traffic_multiplier", "1.0");
        N4 = zzacj.d(1, "gads:adoverlay:b68684796:targeting_sdk:lower_bound", 27);
        O4 = zzacj.d(1, "gads:adoverlay:b68684796:targeting_sdk:upper_bound", androidx.room.j.MAX_BIND_PARAMETER_CNT);
        P4 = zzacj.d(1, "gads:adoverlay:b68684796:sdk_int:lower_bound", 26);
        Q4 = zzacj.d(1, "gads:adoverlay:b68684796:sdk_int:upper_bound", 27);
        R4 = zzacj.f(0, "gads:rewarded_sku:enabled", bool11);
        Boolean bool12 = Boolean.FALSE;
        S4 = zzacj.f(0, "gads:rewarded_sku:override_test:enabled", bool12);
        Boolean bool13 = Boolean.TRUE;
        T4 = zzacj.f(1, "gads:consent:shared_preference_reading:enabled", bool13);
        U4 = zzacj.f(1, "gads:consent:iab_consent_info:enabled", bool13);
        V4 = zzacj.f(1, "gads:nativeads:image:sample:enabled", bool13);
        W4 = zzacj.d(1, "gads:nativeads:image:sample:pixels", CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES);
        X4 = zzacj.f(1, "gads:nativeads:overlay_webview:onclick", bool12);
        Y4 = zzacj.d(0, "gads:dynamite_load:fail:sample_rate", 10000);
        Z4 = zzacj.f(0, "gads:service:webview:enable_directory_suffix", bool13);
        a5 = zzacj.f(1, "gads:offline_signaling:enabled", bool12);
        b5 = zzacj.d(1, "gads:offline_signaling:log_maximum", 100);
        c5 = zzacj.f(0, "gads:uri_query_to_map_rewrite:enabled", bool12);
        d5 = zzacj.f(1, "gads:nativeads:template_signal:enabled", bool13);
        e5 = zzacj.f(1, "gads:nativeads:media_content_aspect_ratio:enabled", bool13);
    }

    public static void a(Context context) {
        zzazl.a(context, new s(context));
        int intValue = ((Integer) zzyt.e().c(K1)).intValue();
        if (intValue <= 0 || f5 != null) {
            return;
        }
        f5 = new byte[intValue];
    }

    public static void b(Context context, int i5, JSONObject jSONObject) {
        zzyt.c();
        SharedPreferences.Editor edit = context.getSharedPreferences("google_ads_flags", 0).edit();
        zzyt.d().a(edit, 1, jSONObject);
        zzyt.c();
        edit.commit();
    }

    public static List<String> c() {
        return zzyt.d().e();
    }

    public static List<String> d() {
        return zzyt.d().f();
    }
}
