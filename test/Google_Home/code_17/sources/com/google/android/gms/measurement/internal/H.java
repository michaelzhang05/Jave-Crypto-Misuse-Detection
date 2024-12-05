package com.google.android.gms.measurement.internal;

import android.content.Context;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkRequest;
import com.google.android.gms.internal.measurement.B8;
import com.google.android.gms.internal.measurement.C2094c8;
import com.google.android.gms.internal.measurement.C2104d8;
import com.google.android.gms.internal.measurement.C2113e7;
import com.google.android.gms.internal.measurement.C2123f7;
import com.google.android.gms.internal.measurement.C2154i8;
import com.google.android.gms.internal.measurement.C2164j8;
import com.google.android.gms.internal.measurement.C2173k7;
import com.google.android.gms.internal.measurement.C2182l7;
import com.google.android.gms.internal.measurement.C2227q7;
import com.google.android.gms.internal.measurement.C2235r7;
import com.google.android.gms.internal.measurement.C2289x7;
import com.google.android.gms.internal.measurement.C2298y7;
import com.google.android.gms.internal.measurement.D7;
import com.google.android.gms.internal.measurement.E7;
import com.google.android.gms.internal.measurement.J7;
import com.google.android.gms.internal.measurement.K7;
import com.google.android.gms.internal.measurement.M6;
import com.google.android.gms.internal.measurement.P7;
import com.google.android.gms.internal.measurement.Q7;
import com.google.android.gms.internal.measurement.R3;
import com.google.android.gms.internal.measurement.R6;
import com.google.android.gms.internal.measurement.S6;
import com.google.android.gms.internal.measurement.V7;
import com.google.android.gms.internal.measurement.W7;
import com.google.android.gms.internal.measurement.Y6;
import com.google.android.gms.internal.measurement.Z6;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.u8;
import com.google.android.gms.internal.measurement.v8;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class H {

    /* renamed from: A */
    public static final C2318b2 f17051A;

    /* renamed from: A0 */
    public static final C2318b2 f17052A0;

    /* renamed from: B */
    public static final C2318b2 f17053B;

    /* renamed from: B0 */
    public static final C2318b2 f17054B0;

    /* renamed from: C */
    public static final C2318b2 f17055C;

    /* renamed from: C0 */
    public static final C2318b2 f17056C0;

    /* renamed from: D */
    public static final C2318b2 f17057D;

    /* renamed from: D0 */
    public static final C2318b2 f17058D0;

    /* renamed from: E */
    public static final C2318b2 f17059E;

    /* renamed from: E0 */
    public static final C2318b2 f17060E0;

    /* renamed from: F */
    public static final C2318b2 f17061F;

    /* renamed from: F0 */
    public static final C2318b2 f17062F0;

    /* renamed from: G */
    public static final C2318b2 f17063G;

    /* renamed from: G0 */
    public static final C2318b2 f17064G0;

    /* renamed from: H */
    public static final C2318b2 f17065H;

    /* renamed from: H0 */
    public static final C2318b2 f17066H0;

    /* renamed from: I */
    public static final C2318b2 f17067I;

    /* renamed from: I0 */
    public static final C2318b2 f17068I0;

    /* renamed from: J */
    public static final C2318b2 f17069J;

    /* renamed from: J0 */
    public static final C2318b2 f17070J0;

    /* renamed from: K */
    public static final C2318b2 f17071K;

    /* renamed from: K0 */
    public static final C2318b2 f17072K0;

    /* renamed from: L */
    public static final C2318b2 f17073L;

    /* renamed from: L0 */
    public static final C2318b2 f17074L0;

    /* renamed from: M */
    public static final C2318b2 f17075M;

    /* renamed from: M0 */
    public static final C2318b2 f17076M0;

    /* renamed from: N */
    public static final C2318b2 f17077N;

    /* renamed from: N0 */
    public static final C2318b2 f17078N0;

    /* renamed from: O */
    public static final C2318b2 f17079O;

    /* renamed from: O0 */
    public static final C2318b2 f17080O0;

    /* renamed from: P */
    public static final C2318b2 f17081P;

    /* renamed from: P0 */
    public static final C2318b2 f17082P0;

    /* renamed from: Q */
    public static final C2318b2 f17083Q;

    /* renamed from: Q0 */
    public static final C2318b2 f17084Q0;

    /* renamed from: R */
    public static final C2318b2 f17085R;

    /* renamed from: R0 */
    public static final C2318b2 f17086R0;

    /* renamed from: S */
    public static final C2318b2 f17087S;

    /* renamed from: S0 */
    public static final C2318b2 f17088S0;

    /* renamed from: T */
    public static final C2318b2 f17089T;

    /* renamed from: T0 */
    public static final C2318b2 f17090T0;

    /* renamed from: U */
    public static final C2318b2 f17091U;

    /* renamed from: U0 */
    public static final C2318b2 f17092U0;

    /* renamed from: V */
    public static final C2318b2 f17093V;

    /* renamed from: V0 */
    public static final C2318b2 f17094V0;

    /* renamed from: W */
    public static final C2318b2 f17095W;

    /* renamed from: W0 */
    public static final C2318b2 f17096W0;

    /* renamed from: X */
    public static final C2318b2 f17097X;

    /* renamed from: X0 */
    public static final C2318b2 f17098X0;

    /* renamed from: Y */
    public static final C2318b2 f17099Y;

    /* renamed from: Y0 */
    public static final C2318b2 f17100Y0;

    /* renamed from: Z */
    public static final C2318b2 f17101Z;

    /* renamed from: Z0 */
    public static final C2318b2 f17102Z0;

    /* renamed from: a */
    private static final List f17103a = DesugarCollections.synchronizedList(new ArrayList());

    /* renamed from: a0 */
    public static final C2318b2 f17104a0;

    /* renamed from: a1 */
    public static final C2318b2 f17105a1;

    /* renamed from: b */
    public static final C2318b2 f17106b;

    /* renamed from: b0 */
    public static final C2318b2 f17107b0;

    /* renamed from: b1 */
    public static final C2318b2 f17108b1;

    /* renamed from: c */
    public static final C2318b2 f17109c;

    /* renamed from: c0 */
    public static final C2318b2 f17110c0;

    /* renamed from: c1 */
    public static final C2318b2 f17111c1;

    /* renamed from: d */
    public static final C2318b2 f17112d;

    /* renamed from: d0 */
    public static final C2318b2 f17113d0;

    /* renamed from: d1 */
    public static final C2318b2 f17114d1;

    /* renamed from: e */
    public static final C2318b2 f17115e;

    /* renamed from: e0 */
    public static final C2318b2 f17116e0;

    /* renamed from: e1 */
    public static final C2318b2 f17117e1;

    /* renamed from: f */
    public static final C2318b2 f17118f;

    /* renamed from: f0 */
    public static final C2318b2 f17119f0;

    /* renamed from: f1 */
    public static final C2318b2 f17120f1;

    /* renamed from: g */
    public static final C2318b2 f17121g;

    /* renamed from: g0 */
    public static final C2318b2 f17122g0;

    /* renamed from: g1 */
    public static final C2318b2 f17123g1;

    /* renamed from: h */
    public static final C2318b2 f17124h;

    /* renamed from: h0 */
    public static final C2318b2 f17125h0;

    /* renamed from: h1 */
    public static final C2318b2 f17126h1;

    /* renamed from: i */
    public static final C2318b2 f17127i;

    /* renamed from: i0 */
    public static final C2318b2 f17128i0;

    /* renamed from: i1 */
    public static final C2318b2 f17129i1;

    /* renamed from: j */
    public static final C2318b2 f17130j;

    /* renamed from: j0 */
    public static final C2318b2 f17131j0;

    /* renamed from: j1 */
    public static final C2318b2 f17132j1;

    /* renamed from: k */
    public static final C2318b2 f17133k;

    /* renamed from: k0 */
    public static final C2318b2 f17134k0;

    /* renamed from: k1 */
    public static final C2318b2 f17135k1;

    /* renamed from: l */
    public static final C2318b2 f17136l;

    /* renamed from: l0 */
    public static final C2318b2 f17137l0;

    /* renamed from: l1 */
    public static final C2318b2 f17138l1;

    /* renamed from: m */
    public static final C2318b2 f17139m;

    /* renamed from: m0 */
    public static final C2318b2 f17140m0;

    /* renamed from: m1 */
    public static final C2318b2 f17141m1;

    /* renamed from: n */
    public static final C2318b2 f17142n;

    /* renamed from: n0 */
    public static final C2318b2 f17143n0;

    /* renamed from: n1 */
    public static final C2318b2 f17144n1;

    /* renamed from: o */
    public static final C2318b2 f17145o;

    /* renamed from: o0 */
    public static final C2318b2 f17146o0;

    /* renamed from: o1 */
    public static final C2318b2 f17147o1;

    /* renamed from: p */
    public static final C2318b2 f17148p;

    /* renamed from: p0 */
    public static final C2318b2 f17149p0;

    /* renamed from: q */
    public static final C2318b2 f17150q;

    /* renamed from: q0 */
    public static final C2318b2 f17151q0;

    /* renamed from: r */
    public static final C2318b2 f17152r;

    /* renamed from: r0 */
    public static final C2318b2 f17153r0;

    /* renamed from: s */
    public static final C2318b2 f17154s;

    /* renamed from: s0 */
    public static final C2318b2 f17155s0;

    /* renamed from: t */
    public static final C2318b2 f17156t;

    /* renamed from: t0 */
    public static final C2318b2 f17157t0;

    /* renamed from: u */
    public static final C2318b2 f17158u;

    /* renamed from: u0 */
    public static final C2318b2 f17159u0;

    /* renamed from: v */
    public static final C2318b2 f17160v;

    /* renamed from: v0 */
    public static final C2318b2 f17161v0;

    /* renamed from: w */
    public static final C2318b2 f17162w;

    /* renamed from: w0 */
    public static final C2318b2 f17163w0;

    /* renamed from: x */
    public static final C2318b2 f17164x;

    /* renamed from: x0 */
    public static final C2318b2 f17165x0;

    /* renamed from: y */
    public static final C2318b2 f17166y;

    /* renamed from: y0 */
    public static final C2318b2 f17167y0;

    /* renamed from: z */
    public static final C2318b2 f17168z;

    /* renamed from: z0 */
    public static final C2318b2 f17169z0;

    static {
        DesugarCollections.synchronizedSet(new HashSet());
        Long valueOf = Long.valueOf(WorkRequest.MIN_BACKOFF_MILLIS);
        f17106b = F("measurement.ad_id_cache_time", valueOf, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.J
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(R6.a());
                return valueOf2;
            }
        });
        f17109c = F("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.u0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(R6.B());
                return valueOf2;
            }
        });
        f17112d = F("measurement.monitoring.sample_period_millis", 86400000L, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.H0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(R6.U());
                return valueOf2;
            }
        });
        f17115e = c("measurement.config.cache_time", 86400000L, 3600000L, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.W0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(R6.G());
                return valueOf2;
            }
        }, false);
        f17118f = F("measurement.config.url_scheme", "https", new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.j1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                String r8;
                r8 = R6.r();
                return r8;
            }
        });
        f17121g = F("measurement.config.url_authority", "app-measurement.com", new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.v1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                String q8;
                q8 = R6.q();
                return q8;
            }
        });
        f17124h = F("measurement.upload.max_bundles", 100, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.I1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) R6.e());
                return valueOf2;
            }
        });
        f17127i = F("measurement.upload.max_batch_size", 65536, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.U1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) R6.m());
                return valueOf2;
            }
        });
        f17130j = F("measurement.upload.max_bundle_size", 65536, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.O
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) R6.d());
                return valueOf2;
            }
        });
        f17133k = F("measurement.upload.max_events_per_bundle", 1000, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.c0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) R6.h());
                return valueOf2;
            }
        });
        f17136l = F("measurement.upload.max_events_per_day", 100000, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.f0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) R6.i());
                return valueOf2;
            }
        });
        f17139m = F("measurement.upload.max_error_events_per_day", 1000, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.k0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) R6.g());
                return valueOf2;
            }
        });
        f17142n = F("measurement.upload.max_public_events_per_day", Integer.valueOf(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS), new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.m0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) R6.j());
                return valueOf2;
            }
        });
        f17145o = F("measurement.upload.max_conversions_per_day", 10000, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.p0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) R6.f());
                return valueOf2;
            }
        });
        f17148p = F("measurement.upload.max_realtime_events_per_day", 10, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.o0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) R6.l());
                return valueOf2;
            }
        });
        f17150q = F("measurement.store.max_stored_events_per_app", 100000, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.r0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) R6.N());
                return valueOf2;
            }
        });
        f17152r = F("measurement.upload.url", "https://app-measurement.com/a", new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.q0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                String A8;
                A8 = R6.A();
                return A8;
            }
        });
        f17154s = F("measurement.sgtm.google_signal.url", "https://app-measurement.com/s", new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.t0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                String t8;
                t8 = R6.t();
                return t8;
            }
        });
        f17156t = F("measurement.upload.backoff_period", 43200000L, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.s0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(R6.c0());
                return valueOf2;
            }
        });
        f17158u = F("measurement.upload.window_interval", 3600000L, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.v0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(R6.p());
                return valueOf2;
            }
        });
        f17160v = F("measurement.upload.interval", 3600000L, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.x0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(R6.c());
                return valueOf2;
            }
        });
        f17162w = F("measurement.upload.realtime_upload_interval", valueOf, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.z0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(R6.V());
                return valueOf2;
            }
        });
        f17164x = F("measurement.upload.debug_upload_interval", 1000L, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.y0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(R6.H());
                return valueOf2;
            }
        });
        f17166y = F("measurement.upload.minimum_delay", 500L, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.C0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(R6.T());
                return valueOf2;
            }
        });
        f17168z = F("measurement.alarm_manager.minimum_interval", Long.valueOf(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS), new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.B0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(R6.S());
                return valueOf2;
            }
        });
        f17051A = F("measurement.upload.stale_data_deletion_interval", 86400000L, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.E0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(R6.Y());
                return valueOf2;
            }
        });
        f17053B = F("measurement.upload.refresh_blacklisted_config_interval", 604800000L, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.D0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(R6.W());
                return valueOf2;
            }
        });
        f17055C = F("measurement.upload.initial_upload_delay_time", 15000L, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.G0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(R6.b());
                return valueOf2;
            }
        });
        f17057D = F("measurement.upload.retry_time", 1800000L, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.F0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(R6.o());
                return valueOf2;
            }
        });
        f17059E = F("measurement.upload.retry_count", 6, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.I0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) R6.n());
                return valueOf2;
            }
        });
        f17061F = F("measurement.upload.max_queue_time", 2419200000L, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.J0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(R6.k());
                return valueOf2;
            }
        });
        f17063G = F("measurement.upload.google_sginal_max_queue_time", Long.valueOf(PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS), new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.M0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(R6.J());
                return valueOf2;
            }
        });
        f17065H = F("measurement.lifetimevalue.max_currency_tracked", 4, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.L0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) R6.K());
                return valueOf2;
            }
        });
        f17067I = F("measurement.audience.filter_result_max_count", 200, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.O0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) R6.P());
                return valueOf2;
            }
        });
        f17069J = a("measurement.upload.max_public_user_properties", 25);
        f17071K = a("measurement.upload.max_event_name_cardinality", 500);
        f17073L = a("measurement.upload.max_public_event_params", 25);
        f17075M = F("measurement.service_client.idle_disconnect_millis", 5000L, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.N0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(R6.X());
                return valueOf2;
            }
        });
        Boolean bool = Boolean.FALSE;
        f17077N = F("measurement.test.boolean_flag", bool, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.Q0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2104d8.f());
                return valueOf2;
            }
        });
        f17079O = F("measurement.test.string_flag", "---", new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.P0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                String e8;
                e8 = C2104d8.e();
                return e8;
            }
        });
        f17081P = F("measurement.test.long_flag", -1L, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.S0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(C2104d8.d());
                return valueOf2;
            }
        });
        b("measurement.test.cached_long_flag", -1L, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.R0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(C2104d8.b());
                return valueOf2;
            }
        });
        f17083Q = F("measurement.test.int_flag", -2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.U0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) C2104d8.c());
                return valueOf2;
            }
        });
        f17085R = F("measurement.test.double_flag", Double.valueOf(-3.0d), new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.V0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Double valueOf2;
                valueOf2 = Double.valueOf(C2104d8.a());
                return valueOf2;
            }
        });
        f17087S = F("measurement.experiment.max_ids", 50, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.Y0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) R6.O());
                return valueOf2;
            }
        });
        f17089T = F("measurement.upload.max_item_scoped_custom_parameters", 27, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.X0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) R6.Q());
                return valueOf2;
            }
        });
        f17091U = b("measurement.upload.max_event_parameter_value_length", 100, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.a1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) R6.M());
                return valueOf2;
            }
        });
        f17093V = F("measurement.max_bundles_per_iteration", 100, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.Z0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) R6.F());
                return valueOf2;
            }
        });
        f17095W = F("measurement.sdk.attribution.cache.ttl", 604800000L, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.d1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(R6.a0());
                return valueOf2;
            }
        });
        f17097X = F("measurement.redaction.app_instance_id.ttl", 7200000L, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.c1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(R6.b0());
                return valueOf2;
            }
        });
        f17099Y = F("measurement.rb.attribution.client.min_ad_services_version", 7, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.f1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) R6.R());
                return valueOf2;
            }
        });
        f17101Z = F("measurement.dma_consent.max_daily_dcu_realtime_events", 1, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.e1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) R6.L());
                return valueOf2;
            }
        });
        f17104a0 = F("measurement.rb.attribution.uri_scheme", "https", new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.g1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                String z8;
                z8 = R6.z();
                return z8;
            }
        });
        f17107b0 = F("measurement.rb.attribution.uri_authority", "google-analytics.com", new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.i1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                String w8;
                w8 = R6.w();
                return w8;
            }
        });
        f17110c0 = F("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion", new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.l1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                String x8;
                x8 = R6.x();
                return x8;
            }
        });
        f17113d0 = F("measurement.session.engagement_interval", 3600000L, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.k1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(R6.I());
                return valueOf2;
            }
        });
        f17116e0 = F("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,com.sofascore.results,games.spearmint.triplecrush,com.block.juggle,io.supercent.linkedcubic,com.cdtg.gunsound,com.corestudios.storemanagementidle,com.cdgames.fidget3d,io.supercent.burgeridle,io.supercent.pizzaidle,jp.ne.ibis.ibispaintx.app,com.dencreak.dlcalculator,com.ebay.kleinanzeigen,de.wetteronline.wetterapp,com.game.shape.shift,com.champion.cubes,bubbleshooter.orig,com.wolt.android,com.master.hotelmaster,com.games.bus.arrival,com.playstrom.dop2,com.huuuge.casino.slots,com.ig.spider.fighting,com.jura.coloring.page,com.rikkogame.ragdoll2,com.ludo.king,com.sigma.prank.sound.haircut,com.crazy.block.robo.monster.cliffs.craft,com.fugo.wow,com.maps.locator.gps.gpstracker.phone,com.gamovation.tileclub,com.pronetis.ironball2,com.meesho.supply,pdf.pdfreader.viewer.editor.free,com.dino.race.master,com.ig.moto.racing,ai.photo.enhancer.photoclear,com.duolingo,com.candle.magic_piano,com.free.vpn.super.hotspot.open,sg.bigo.live,com.cdg.tictactoe,com.zhiliaoapp.musically.go,com.wildspike.wormszone,com.mast.status.video.edit,com.vyroai.photoeditorone,com.pujiagames.deeeersimulator,com.superbinogo.jungleboyadventure,com.trustedapp.pdfreaderpdfviewer,com.artimind.aiart.artgenerator.artavatar,de.cellular.ottohybrid,com.zeptolab.cats.google,in.crossy.daily_crossword", new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.n1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                String u8;
                u8 = R6.u();
                return u8;
            }
        });
        f17119f0 = F("measurement.rb.attribution.user_properties", "_npa,npa", new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.m1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                String C8;
                C8 = R6.C();
                return C8;
            }
        });
        f17122g0 = F("measurement.rb.attribution.event_params", "value|currency", new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.p1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                String s8;
                s8 = R6.s();
                return s8;
            }
        });
        f17125h0 = F("measurement.rb.attribution.query_parameters_to_remove", "", new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.o1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                String y8;
                y8 = R6.y();
                return y8;
            }
        });
        f17128i0 = F("measurement.rb.attribution.max_queue_time", 1209600000L, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.r1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Long valueOf2;
                valueOf2 = Long.valueOf(R6.Z());
                return valueOf2;
            }
        });
        Boolean bool2 = Boolean.TRUE;
        f17131j0 = F("measurement.config.bundle_for_all_apps_on_backgrounded", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.t1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(R6.D());
                return valueOf2;
            }
        });
        f17134k0 = F("measurement.config.notify_trigger_uris_on_backgrounded", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.s1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(R6.E());
                return valueOf2;
            }
        });
        f17137l0 = F("measurement.collection.log_event_and_bundle_v2", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.u1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2154i8.a());
                return valueOf2;
            }
        });
        f17140m0 = a("measurement.quality.checksum", bool);
        f17143n0 = F("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.x1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2298y7.c());
                return valueOf2;
            }
        });
        f17146o0 = F("measurement.audience.refresh_event_count_filters_timestamp", bool, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.w1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2298y7.b());
                return valueOf2;
            }
        });
        f17149p0 = b("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.z1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2298y7.d());
                return valueOf2;
            }
        });
        f17151q0 = F("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.y1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2094c8.a());
                return valueOf2;
            }
        });
        f17153r0 = F("measurement.integration.disable_firebase_instance_id", bool, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.B1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(v8.b());
                return valueOf2;
            }
        });
        f17155s0 = F("measurement.collection.service.update_with_analytics_fix", bool, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.A1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(B8.a());
                return valueOf2;
            }
        });
        f17157t0 = F("measurement.service.storage_consent_support_version", 203600, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.D1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) Y6.a());
                return valueOf2;
            }
        });
        f17159u0 = F("measurement.service.store_null_safelist", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.G1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2235r7.b());
                return valueOf2;
            }
        });
        f17161v0 = F("measurement.service.store_safelist", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.F1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2235r7.c());
                return valueOf2;
            }
        });
        f17163w0 = F("measurement.session_stitching_token_enabled", bool, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.H1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(o8.b());
                return valueOf2;
            }
        });
        f17165x0 = b("measurement.sgtm.service", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.K1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(u8.d());
                return valueOf2;
            }
        });
        f17167y0 = b("measurement.sgtm.preview_mode_enabled", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.J1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(u8.c());
                return valueOf2;
            }
        });
        f17169z0 = b("measurement.sgtm.app_allowlist", "de.zalando.mobile.internal,de.zalando.mobile.internal.debug,de.zalando.lounge.dev,grit.storytel.app,com.rbc.mobile.android,com.rbc.mobile.android,com.dylvian.mango.activities,com.home24.android,com.home24.android.staging,se.lf.mobile.android,se.lf.mobile.android.beta,se.lf.mobile.android.rc,se.lf.mobile.android.test,se.lf.mobile.android.test.debug,com.boots.flagship.android,com.boots.flagshiproi.android,de.zalando.mobile,com.trivago,com.getyourguide.android,es.mobail.meliarewards,se.nansen.coop.debug,se.nansen.coop,se.coop.coop.qa,com.booking,com.google.firebaseengage,com.mse.mseapp.dev,com.mse.mseapp,pl.eobuwie.eobuwieapp,br.com.eventim.mobile.app.Android,ch.ticketcorner.mobile.app.Android,de.eventim.mobile.app.Android,dk.billetlugen.mobile.app.Android,nl.eventim.mobile.app.Android,com.asos.app,com.blueshieldca.prod,dk.magnetix.tivoliapp,matas.matas.internal,nl.omoda,com.thetrainline,com.simo.androidtest,de.aboutyou.mobile.app,com.hometogo,de.casamundo.casamundomobile,it.casevacanz,eu.coolblue.shop,com.stihl.app,com.indeed.android.jobsearch,com.homeretailgroup.argos.android,com.dylvian.mango.activities.pre,se.nansen.coop.qa", new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.M1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                String v8;
                v8 = R6.v();
                return v8;
            }
        });
        f17052A0 = F("measurement.sgtm.upload_queue", bool, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.L1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(u8.e());
                return valueOf2;
            }
        });
        f17054B0 = F("measurement.sgtm.google_signal.enable", bool, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.O1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(u8.b());
                return valueOf2;
            }
        });
        f17056C0 = F("measurement.gmscore_feature_tracking", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.Q1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(P7.b());
                return valueOf2;
            }
        });
        f17058D0 = F("measurement.gmscore_network_migration", bool, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.P1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(Q7.b());
                return valueOf2;
            }
        });
        f17060E0 = b("measurement.fix_health_monitor_stack_trace", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.S1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(E7.b());
                return valueOf2;
            }
        });
        f17062F0 = b("measurement.item_scoped_custom_parameters.client", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.R1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(W7.b());
                return valueOf2;
            }
        });
        f17064G0 = F("measurement.item_scoped_custom_parameters.service", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.T1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(W7.c());
                return valueOf2;
            }
        });
        f17066H0 = b("measurement.rb.attribution.service", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.W1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2164j8.h());
                return valueOf2;
            }
        });
        f17068I0 = b("measurement.rb.attribution.client2", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.V1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2164j8.e());
                return valueOf2;
            }
        });
        f17070J0 = F("measurement.rb.attribution.uuid_generation", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.Y1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2164j8.j());
                return valueOf2;
            }
        });
        f17072K0 = F("measurement.rb.attribution.enable_trigger_redaction", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.X1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2164j8.i());
                return valueOf2;
            }
        });
        F("measurement.rb.attribution.followup1.service", bool, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.L
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2164j8.f());
                return valueOf2;
            }
        });
        f17074L0 = F("measurement.rb.attribution.retry_disposition", bool, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.K
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2164j8.g());
                return valueOf2;
            }
        });
        f17076M0 = F("measurement.rb.attribution.ad_campaign_info", bool, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.N
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2164j8.b());
                return valueOf2;
            }
        });
        f17078N0 = b("measurement.rb.attribution.improved_retry", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.M
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2164j8.k());
                return valueOf2;
            }
        });
        f17080O0 = F("measurement.client.sessions.enable_fix_background_engagement", bool, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.P
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                return Boolean.valueOf(p8.a());
            }
        });
        f17082P0 = F("measurement.client.sessions.enable_pause_engagement_in_background", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.S
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                return Boolean.valueOf(p8.b());
            }
        });
        f17084Q0 = F("measurement.dma_consent.service_dcu_event2", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.Q
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2227q7.b());
                return valueOf2;
            }
        });
        f17086R0 = F("measurement.dma_consent.services_database_update_fix", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.U
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2227q7.a());
                return valueOf2;
            }
        });
        f17088S0 = b("measurement.service.deferred_first_open", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.T
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2173k7.b());
                return valueOf2;
            }
        });
        f17090T0 = b("measurement.gbraid_campaign.gbraid.client", bool, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.V
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(K7.b());
                return valueOf2;
            }
        });
        f17092U0 = b("measurement.gbraid_campaign.gbraid.service", bool, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.Y
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(K7.c());
                return valueOf2;
            }
        });
        f17094V0 = b("measurement.increase_param_lengths", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.X
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(V7.b());
                return valueOf2;
            }
        });
        f17096W0 = F("measurement.disable_npa_for_dasher_and_unicorn", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.b0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2182l7.b());
                return valueOf2;
            }
        });
        f17098X0 = b("measurement.consent_regional_defaults.service", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.a0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(S6.c());
                return valueOf2;
            }
        });
        f17100Y0 = b("measurement.consent_regional_defaults.client2", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.d0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(S6.b());
                return valueOf2;
            }
        });
        f17102Z0 = F("measurement.service.consent.pfo_on_fx", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.n0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2289x7.c());
                return valueOf2;
            }
        });
        f17105a1 = F("measurement.service.consent.params_on_fx", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.w0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2289x7.b());
                return valueOf2;
            }
        });
        f17108b1 = F("measurement.service.consent.app_start_fix", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.K0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2289x7.a());
                return valueOf2;
            }
        });
        f17111c1 = b("measurement.consent.stop_reset_on_storage_denied.client", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.T0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(Z6.b());
                return valueOf2;
            }
        });
        f17114d1 = b("measurement.consent.stop_reset_on_storage_denied.service", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.h1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(Z6.c());
                return valueOf2;
            }
        });
        f17117e1 = F("measurement.consent.scrub_audience_data_analytics_consent", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.q1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(Z6.d());
                return valueOf2;
            }
        });
        f17120f1 = F("measurement.consent.fix_first_open_count_from_snapshot", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.E1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(Z6.e());
                return valueOf2;
            }
        });
        f17123g1 = F("measurement.fix_engagement_on_reset_analytics_data", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.N1
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(D7.a());
                return valueOf2;
            }
        });
        f17126h1 = F("measurement.rb.attribution.service.bundle_on_backgrounded", bool, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.I
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2164j8.d());
                return valueOf2;
            }
        });
        f17129i1 = F("measurement.rb.attribution.client.bundle_on_backgrounded", bool, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.W
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2164j8.c());
                return valueOf2;
            }
        });
        f17132j1 = F("measurement.set_default_event_parameters_propagate_clear.service.dev", bool, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.e0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2123f7.b());
                return valueOf2;
            }
        });
        f17135k1 = F("measurement.set_default_event_parameters_propagate_clear.client.dev", bool, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.h0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2123f7.a());
                return valueOf2;
            }
        });
        f17138l1 = F("measurement.set_default_event_parameters_with_backfill.service", bool, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.g0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2113e7.c());
                return valueOf2;
            }
        });
        f17141m1 = F("measurement.set_default_event_parameters_with_backfill.client.dev", bool, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.j0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(C2113e7.b());
                return valueOf2;
            }
        });
        f17144n1 = F("measurement.fix_origin_in_upload_utils.service", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.i0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(J7.a());
                return valueOf2;
            }
        });
        f17147o1 = F("measurement.service.ad_impression.convert_value_to_double", bool2, new InterfaceC2311a2() { // from class: com.google.android.gms.measurement.internal.l0
            @Override // com.google.android.gms.measurement.internal.InterfaceC2311a2
            public final Object w() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(M6.a());
                return valueOf2;
            }
        });
    }

    private static C2318b2 F(String str, Object obj, InterfaceC2311a2 interfaceC2311a2) {
        return c(str, obj, obj, interfaceC2311a2, false);
    }

    private static C2318b2 a(String str, Object obj) {
        return c(str, obj, obj, null, false);
    }

    private static C2318b2 b(String str, Object obj, InterfaceC2311a2 interfaceC2311a2) {
        return c(str, obj, obj, interfaceC2311a2, true);
    }

    private static C2318b2 c(String str, Object obj, Object obj2, InterfaceC2311a2 interfaceC2311a2, boolean z8) {
        C2318b2 c2318b2 = new C2318b2(str, obj, obj2, interfaceC2311a2, z8);
        if (z8) {
            f17103a.add(c2318b2);
        }
        return c2318b2;
    }

    public static Map e(Context context) {
        com.google.android.gms.internal.measurement.D3 a8 = com.google.android.gms.internal.measurement.D3.a(context.getContentResolver(), com.google.android.gms.internal.measurement.O3.a("com.google.android.gms.measurement"), new Runnable() { // from class: l0.d
            @Override // java.lang.Runnable
            public final void run() {
                R3.m();
            }
        });
        if (a8 == null) {
            return Collections.emptyMap();
        }
        return a8.b();
    }
}
