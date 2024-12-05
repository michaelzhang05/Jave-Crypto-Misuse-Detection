package com.google.android.gms.internal.measurement;

import androidx.work.WorkRequest;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* loaded from: classes3.dex */
public final class P5 implements O5 {

    /* renamed from: A, reason: collision with root package name */
    public static final X2 f15489A;

    /* renamed from: B, reason: collision with root package name */
    public static final X2 f15490B;

    /* renamed from: C, reason: collision with root package name */
    public static final X2 f15491C;

    /* renamed from: D, reason: collision with root package name */
    public static final X2 f15492D;

    /* renamed from: E, reason: collision with root package name */
    public static final X2 f15493E;

    /* renamed from: F, reason: collision with root package name */
    public static final X2 f15494F;

    /* renamed from: G, reason: collision with root package name */
    public static final X2 f15495G;

    /* renamed from: H, reason: collision with root package name */
    public static final X2 f15496H;

    /* renamed from: I, reason: collision with root package name */
    public static final X2 f15497I;

    /* renamed from: J, reason: collision with root package name */
    public static final X2 f15498J;

    /* renamed from: K, reason: collision with root package name */
    public static final X2 f15499K;

    /* renamed from: L, reason: collision with root package name */
    public static final X2 f15500L;

    /* renamed from: M, reason: collision with root package name */
    public static final X2 f15501M;

    /* renamed from: N, reason: collision with root package name */
    public static final X2 f15502N;

    /* renamed from: O, reason: collision with root package name */
    public static final X2 f15503O;

    /* renamed from: a, reason: collision with root package name */
    public static final X2 f15504a;

    /* renamed from: b, reason: collision with root package name */
    public static final X2 f15505b;

    /* renamed from: c, reason: collision with root package name */
    public static final X2 f15506c;

    /* renamed from: d, reason: collision with root package name */
    public static final X2 f15507d;

    /* renamed from: e, reason: collision with root package name */
    public static final X2 f15508e;

    /* renamed from: f, reason: collision with root package name */
    public static final X2 f15509f;

    /* renamed from: g, reason: collision with root package name */
    public static final X2 f15510g;

    /* renamed from: h, reason: collision with root package name */
    public static final X2 f15511h;

    /* renamed from: i, reason: collision with root package name */
    public static final X2 f15512i;

    /* renamed from: j, reason: collision with root package name */
    public static final X2 f15513j;

    /* renamed from: k, reason: collision with root package name */
    public static final X2 f15514k;

    /* renamed from: l, reason: collision with root package name */
    public static final X2 f15515l;

    /* renamed from: m, reason: collision with root package name */
    public static final X2 f15516m;

    /* renamed from: n, reason: collision with root package name */
    public static final X2 f15517n;

    /* renamed from: o, reason: collision with root package name */
    public static final X2 f15518o;

    /* renamed from: p, reason: collision with root package name */
    public static final X2 f15519p;

    /* renamed from: q, reason: collision with root package name */
    public static final X2 f15520q;

    /* renamed from: r, reason: collision with root package name */
    public static final X2 f15521r;

    /* renamed from: s, reason: collision with root package name */
    public static final X2 f15522s;

    /* renamed from: t, reason: collision with root package name */
    public static final X2 f15523t;

    /* renamed from: u, reason: collision with root package name */
    public static final X2 f15524u;

    /* renamed from: v, reason: collision with root package name */
    public static final X2 f15525v;

    /* renamed from: w, reason: collision with root package name */
    public static final X2 f15526w;

    /* renamed from: x, reason: collision with root package name */
    public static final X2 f15527x;

    /* renamed from: y, reason: collision with root package name */
    public static final X2 f15528y;

    /* renamed from: z, reason: collision with root package name */
    public static final X2 f15529z;

    static {
        T2 a8 = new T2(L2.a("com.google.android.gms.measurement")).a();
        f15504a = a8.d("measurement.ad_id_cache_time", WorkRequest.MIN_BACKOFF_MILLIS);
        f15505b = a8.d("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L);
        f15506c = a8.d("measurement.max_bundles_per_iteration", 100L);
        f15507d = a8.d("measurement.config.cache_time", 86400000L);
        f15508e = a8.e("measurement.log_tag", "FA");
        f15509f = a8.e("measurement.config.url_authority", "app-measurement.com");
        f15510g = a8.e("measurement.config.url_scheme", "https");
        f15511h = a8.d("measurement.upload.debug_upload_interval", 1000L);
        f15512i = a8.d("measurement.lifetimevalue.max_currency_tracked", 4L);
        f15513j = a8.d("measurement.store.max_stored_events_per_app", 100000L);
        f15514k = a8.d("measurement.experiment.max_ids", 50L);
        f15515l = a8.d("measurement.audience.filter_result_max_count", 200L);
        f15516m = a8.d("measurement.upload.max_item_scoped_custom_parameters", 27L);
        f15517n = a8.d("measurement.alarm_manager.minimum_interval", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        f15518o = a8.d("measurement.upload.minimum_delay", 500L);
        f15519p = a8.d("measurement.monitoring.sample_period_millis", 86400000L);
        f15520q = a8.d("measurement.upload.realtime_upload_interval", WorkRequest.MIN_BACKOFF_MILLIS);
        f15521r = a8.d("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        f15522s = a8.d("measurement.config.cache_time.service", 3600000L);
        f15523t = a8.d("measurement.service_client.idle_disconnect_millis", 5000L);
        f15524u = a8.e("measurement.log_tag.service", "FA-SVC");
        f15525v = a8.d("measurement.upload.stale_data_deletion_interval", 86400000L);
        f15526w = a8.d("measurement.sdk.attribution.cache.ttl", 604800000L);
        f15527x = a8.d("measurement.redaction.app_instance_id.ttl", 7200000L);
        f15528y = a8.d("measurement.upload.backoff_period", 43200000L);
        f15529z = a8.d("measurement.upload.initial_upload_delay_time", 15000L);
        f15489A = a8.d("measurement.upload.interval", 3600000L);
        f15490B = a8.d("measurement.upload.max_bundle_size", 65536L);
        f15491C = a8.d("measurement.upload.max_bundles", 100L);
        f15492D = a8.d("measurement.upload.max_conversions_per_day", 500L);
        f15493E = a8.d("measurement.upload.max_error_events_per_day", 1000L);
        f15494F = a8.d("measurement.upload.max_events_per_bundle", 1000L);
        f15495G = a8.d("measurement.upload.max_events_per_day", 100000L);
        f15496H = a8.d("measurement.upload.max_public_events_per_day", 50000L);
        f15497I = a8.d("measurement.upload.max_queue_time", 2419200000L);
        f15498J = a8.d("measurement.upload.max_realtime_events_per_day", 10L);
        f15499K = a8.d("measurement.upload.max_batch_size", 65536L);
        f15500L = a8.d("measurement.upload.retry_count", 6L);
        f15501M = a8.d("measurement.upload.retry_time", 1800000L);
        f15502N = a8.e("measurement.upload.url", "https://app-measurement.com/a");
        f15503O = a8.d("measurement.upload.window_interval", 3600000L);
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final String A() {
        return (String) f15509f.b();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long B() {
        return ((Long) f15495G.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long C() {
        return ((Long) f15529z.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long D() {
        return ((Long) f15519p.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final String E() {
        return (String) f15510g.b();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long F() {
        return ((Long) f15489A.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long G() {
        return ((Long) f15496H.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long H() {
        return ((Long) f15501M.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long I() {
        return ((Long) f15527x.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long J() {
        return ((Long) f15503O.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long K() {
        return ((Long) f15494F.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long L() {
        return ((Long) f15528y.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long a() {
        return ((Long) f15504a.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long b() {
        return ((Long) f15505b.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long c() {
        return ((Long) f15506c.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long d() {
        return ((Long) f15507d.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long e() {
        return ((Long) f15511h.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long f() {
        return ((Long) f15514k.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long g() {
        return ((Long) f15515l.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long h() {
        return ((Long) f15513j.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long i() {
        return ((Long) f15518o.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long j() {
        return ((Long) f15516m.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long k() {
        return ((Long) f15517n.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long l() {
        return ((Long) f15523t.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long m() {
        return ((Long) f15499K.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long n() {
        return ((Long) f15492D.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long o() {
        return ((Long) f15525v.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long p() {
        return ((Long) f15493E.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long q() {
        return ((Long) f15500L.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long r() {
        return ((Long) f15526w.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long s() {
        return ((Long) f15520q.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final String t() {
        return (String) f15502N.b();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long u() {
        return ((Long) f15490B.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long v() {
        return ((Long) f15512i.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long w() {
        return ((Long) f15497I.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long x() {
        return ((Long) f15521r.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long y() {
        return ((Long) f15498J.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final long z() {
        return ((Long) f15491C.b()).longValue();
    }
}
