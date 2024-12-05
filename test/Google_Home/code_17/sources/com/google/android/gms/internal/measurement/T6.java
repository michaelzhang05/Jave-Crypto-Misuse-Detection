package com.google.android.gms.internal.measurement;

import androidx.work.WorkRequest;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* loaded from: classes3.dex */
public final class T6 implements Q6 {

    /* renamed from: A, reason: collision with root package name */
    private static final R3 f16288A;

    /* renamed from: B, reason: collision with root package name */
    private static final R3 f16289B;

    /* renamed from: C, reason: collision with root package name */
    private static final R3 f16290C;

    /* renamed from: D, reason: collision with root package name */
    private static final R3 f16291D;

    /* renamed from: E, reason: collision with root package name */
    private static final R3 f16292E;

    /* renamed from: F, reason: collision with root package name */
    private static final R3 f16293F;

    /* renamed from: G, reason: collision with root package name */
    private static final R3 f16294G;

    /* renamed from: H, reason: collision with root package name */
    private static final R3 f16295H;

    /* renamed from: I, reason: collision with root package name */
    private static final R3 f16296I;

    /* renamed from: J, reason: collision with root package name */
    private static final R3 f16297J;

    /* renamed from: K, reason: collision with root package name */
    private static final R3 f16298K;

    /* renamed from: L, reason: collision with root package name */
    private static final R3 f16299L;

    /* renamed from: M, reason: collision with root package name */
    private static final R3 f16300M;

    /* renamed from: N, reason: collision with root package name */
    private static final R3 f16301N;

    /* renamed from: O, reason: collision with root package name */
    private static final R3 f16302O;

    /* renamed from: P, reason: collision with root package name */
    private static final R3 f16303P;

    /* renamed from: Q, reason: collision with root package name */
    private static final R3 f16304Q;

    /* renamed from: R, reason: collision with root package name */
    private static final R3 f16305R;

    /* renamed from: S, reason: collision with root package name */
    private static final R3 f16306S;

    /* renamed from: T, reason: collision with root package name */
    private static final R3 f16307T;

    /* renamed from: U, reason: collision with root package name */
    private static final R3 f16308U;

    /* renamed from: V, reason: collision with root package name */
    private static final R3 f16309V;

    /* renamed from: W, reason: collision with root package name */
    private static final R3 f16310W;

    /* renamed from: X, reason: collision with root package name */
    private static final R3 f16311X;

    /* renamed from: Y, reason: collision with root package name */
    private static final R3 f16312Y;

    /* renamed from: Z, reason: collision with root package name */
    private static final R3 f16313Z;

    /* renamed from: a, reason: collision with root package name */
    private static final R3 f16314a;

    /* renamed from: a0, reason: collision with root package name */
    private static final R3 f16315a0;

    /* renamed from: b, reason: collision with root package name */
    private static final R3 f16316b;

    /* renamed from: b0, reason: collision with root package name */
    private static final R3 f16317b0;

    /* renamed from: c, reason: collision with root package name */
    private static final R3 f16318c;

    /* renamed from: c0, reason: collision with root package name */
    private static final R3 f16319c0;

    /* renamed from: d, reason: collision with root package name */
    private static final R3 f16320d;

    /* renamed from: e, reason: collision with root package name */
    private static final R3 f16321e;

    /* renamed from: f, reason: collision with root package name */
    private static final R3 f16322f;

    /* renamed from: g, reason: collision with root package name */
    private static final R3 f16323g;

    /* renamed from: h, reason: collision with root package name */
    private static final R3 f16324h;

    /* renamed from: i, reason: collision with root package name */
    private static final R3 f16325i;

    /* renamed from: j, reason: collision with root package name */
    private static final R3 f16326j;

    /* renamed from: k, reason: collision with root package name */
    private static final R3 f16327k;

    /* renamed from: l, reason: collision with root package name */
    private static final R3 f16328l;

    /* renamed from: m, reason: collision with root package name */
    private static final R3 f16329m;

    /* renamed from: n, reason: collision with root package name */
    private static final R3 f16330n;

    /* renamed from: o, reason: collision with root package name */
    private static final R3 f16331o;

    /* renamed from: p, reason: collision with root package name */
    private static final R3 f16332p;

    /* renamed from: q, reason: collision with root package name */
    private static final R3 f16333q;

    /* renamed from: r, reason: collision with root package name */
    private static final R3 f16334r;

    /* renamed from: s, reason: collision with root package name */
    private static final R3 f16335s;

    /* renamed from: t, reason: collision with root package name */
    private static final R3 f16336t;

    /* renamed from: u, reason: collision with root package name */
    private static final R3 f16337u;

    /* renamed from: v, reason: collision with root package name */
    private static final R3 f16338v;

    /* renamed from: w, reason: collision with root package name */
    private static final R3 f16339w;

    /* renamed from: x, reason: collision with root package name */
    private static final R3 f16340x;

    /* renamed from: y, reason: collision with root package name */
    private static final R3 f16341y;

    /* renamed from: z, reason: collision with root package name */
    private static final R3 f16342z;

    static {
        Z3 e8 = new Z3(O3.a("com.google.android.gms.measurement")).f().e();
        f16314a = e8.b("measurement.ad_id_cache_time", WorkRequest.MIN_BACKOFF_MILLIS);
        f16316b = e8.b("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L);
        f16318c = e8.d("measurement.config.bundle_for_all_apps_on_backgrounded", true);
        f16320d = e8.b("measurement.max_bundles_per_iteration", 100L);
        f16321e = e8.b("measurement.config.cache_time", 86400000L);
        e8.c("measurement.log_tag", "FA");
        e8.b("measurement.id.config.experiment_id", 0L);
        f16322f = e8.c("measurement.config.url_authority", "app-measurement.com");
        f16323g = e8.c("measurement.config.url_scheme", "https");
        f16324h = e8.b("measurement.upload.debug_upload_interval", 1000L);
        f16325i = e8.b("measurement.session.engagement_interval", 3600000L);
        f16326j = e8.c("measurement.rb.attribution.event_params", "value|currency");
        e8.b("measurement.id.rb.attribution.app_allowlist", 0L);
        f16327k = e8.b("measurement.upload.google_signal_max_queue_time", 605000L);
        f16328l = e8.c("measurement.sgtm.google_signal.url", "https://app-measurement.com/s");
        f16329m = e8.b("measurement.lifetimevalue.max_currency_tracked", 4L);
        f16330n = e8.b("measurement.dma_consent.max_daily_dcu_realtime_events", 1L);
        f16331o = e8.b("measurement.upload.max_event_parameter_value_length", 100L);
        f16332p = e8.b("measurement.store.max_stored_events_per_app", 100000L);
        f16333q = e8.b("measurement.experiment.max_ids", 50L);
        f16334r = e8.b("measurement.audience.filter_result_max_count", 200L);
        f16335s = e8.b("measurement.upload.max_item_scoped_custom_parameters", 27L);
        f16336t = e8.b("measurement.rb.attribution.client.min_ad_services_version", 7L);
        f16337u = e8.b("measurement.alarm_manager.minimum_interval", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        f16338v = e8.b("measurement.upload.minimum_delay", 500L);
        f16339w = e8.b("measurement.monitoring.sample_period_millis", 86400000L);
        f16340x = e8.d("measurement.config.notify_trigger_uris_on_backgrounded", true);
        f16341y = e8.c("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,com.sofascore.results,games.spearmint.triplecrush,com.block.juggle,io.supercent.linkedcubic,com.cdtg.gunsound,com.corestudios.storemanagementidle,com.cdgames.fidget3d,io.supercent.burgeridle,io.supercent.pizzaidle,jp.ne.ibis.ibispaintx.app,com.dencreak.dlcalculator,com.ebay.kleinanzeigen,de.wetteronline.wetterapp,com.game.shape.shift,com.champion.cubes,bubbleshooter.orig,com.wolt.android,com.master.hotelmaster,com.games.bus.arrival,com.playstrom.dop2,com.huuuge.casino.slots,com.ig.spider.fighting,com.jura.coloring.page,com.rikkogame.ragdoll2,com.ludo.king,com.sigma.prank.sound.haircut,com.crazy.block.robo.monster.cliffs.craft,com.fugo.wow,com.maps.locator.gps.gpstracker.phone,com.gamovation.tileclub,com.pronetis.ironball2,com.meesho.supply,pdf.pdfreader.viewer.editor.free,com.dino.race.master,com.ig.moto.racing,ai.photo.enhancer.photoclear,com.duolingo,com.candle.magic_piano,com.free.vpn.super.hotspot.open,sg.bigo.live,com.cdg.tictactoe,com.zhiliaoapp.musically.go,com.wildspike.wormszone,com.mast.status.video.edit,com.vyroai.photoeditorone,com.pujiagames.deeeersimulator,com.superbinogo.jungleboyadventure,com.trustedapp.pdfreaderpdfviewer,com.artimind.aiart.artgenerator.artavatar,de.cellular.ottohybrid,com.zeptolab.cats.google,in.crossy.daily_crossword");
        f16342z = e8.b("measurement.upload.realtime_upload_interval", WorkRequest.MIN_BACKOFF_MILLIS);
        f16288A = e8.b("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        e8.b("measurement.config.cache_time.service", 3600000L);
        f16289B = e8.b("measurement.service_client.idle_disconnect_millis", 5000L);
        e8.c("measurement.log_tag.service", "FA-SVC");
        f16290C = e8.c("measurement.sgtm.app_allowlist", "de.zalando.mobile.internal,de.zalando.mobile.internal.debug,de.zalando.lounge.dev,grit.storytel.app,com.rbc.mobile.android,com.rbc.mobile.android,com.dylvian.mango.activities,com.home24.android,com.home24.android.staging,se.lf.mobile.android,se.lf.mobile.android.beta,se.lf.mobile.android.rc,se.lf.mobile.android.test,se.lf.mobile.android.test.debug,com.boots.flagship.android,com.boots.flagshiproi.android,de.zalando.mobile,com.trivago,com.getyourguide.android,es.mobail.meliarewards,se.nansen.coop.debug,se.nansen.coop,se.coop.coop.qa,com.booking,com.google.firebaseengage,com.mse.mseapp.dev,com.mse.mseapp,pl.eobuwie.eobuwieapp,br.com.eventim.mobile.app.Android,ch.ticketcorner.mobile.app.Android,de.eventim.mobile.app.Android,dk.billetlugen.mobile.app.Android,nl.eventim.mobile.app.Android,com.asos.app,com.blueshieldca.prod,dk.magnetix.tivoliapp,matas.matas.internal,nl.omoda,com.thetrainline,com.simo.androidtest,de.aboutyou.mobile.app,com.hometogo,de.casamundo.casamundomobile,it.casevacanz,eu.coolblue.shop,com.stihl.app,com.indeed.android.jobsearch,com.homeretailgroup.argos.android,com.dylvian.mango.activities.pre,se.nansen.coop.qa");
        f16291D = e8.b("measurement.upload.stale_data_deletion_interval", 86400000L);
        f16292E = e8.c("measurement.rb.attribution.uri_authority", "google-analytics.com");
        f16293F = e8.b("measurement.rb.attribution.max_queue_time", 1209600000L);
        f16294G = e8.c("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion");
        f16295H = e8.c("measurement.rb.attribution.query_parameters_to_remove", "");
        f16296I = e8.c("measurement.rb.attribution.uri_scheme", "https");
        f16297J = e8.b("measurement.sdk.attribution.cache.ttl", 604800000L);
        f16298K = e8.b("measurement.redaction.app_instance_id.ttl", 7200000L);
        f16299L = e8.b("measurement.upload.backoff_period", 43200000L);
        f16300M = e8.b("measurement.upload.initial_upload_delay_time", 15000L);
        f16301N = e8.b("measurement.upload.interval", 3600000L);
        f16302O = e8.b("measurement.upload.max_bundle_size", 65536L);
        f16303P = e8.b("measurement.upload.max_bundles", 100L);
        f16304Q = e8.b("measurement.upload.max_conversions_per_day", 500L);
        f16305R = e8.b("measurement.upload.max_error_events_per_day", 1000L);
        f16306S = e8.b("measurement.upload.max_events_per_bundle", 1000L);
        f16307T = e8.b("measurement.upload.max_events_per_day", 100000L);
        f16308U = e8.b("measurement.upload.max_public_events_per_day", 50000L);
        f16309V = e8.b("measurement.upload.max_queue_time", 2419200000L);
        f16310W = e8.b("measurement.upload.max_realtime_events_per_day", 10L);
        f16311X = e8.b("measurement.upload.max_batch_size", 65536L);
        f16312Y = e8.b("measurement.upload.retry_count", 6L);
        f16313Z = e8.b("measurement.upload.retry_time", 1800000L);
        f16315a0 = e8.c("measurement.upload.url", "https://app-measurement.com/a");
        f16317b0 = e8.b("measurement.upload.window_interval", 3600000L);
        f16319c0 = e8.c("measurement.rb.attribution.user_properties", "_npa,npa");
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long A() {
        return ((Long) f16325i.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long B() {
        return ((Long) f16329m.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long C() {
        return ((Long) f16313Z.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long D() {
        return ((Long) f16293F.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long E() {
        return ((Long) f16304Q.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final String F() {
        return (String) f16292E.e();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long G() {
        return ((Long) f16336t.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long H() {
        return ((Long) f16317b0.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final String I() {
        return (String) f16319c0.e();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long J() {
        return ((Long) f16297J.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long K() {
        return ((Long) f16305R.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final String L() {
        return (String) f16294G.e();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long M() {
        return ((Long) f16311X.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long N() {
        return ((Long) f16302O.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final String O() {
        return (String) f16341y.e();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long P() {
        return ((Long) f16289B.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long Q() {
        return ((Long) f16312Y.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long R() {
        return ((Long) f16334r.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long S() {
        return ((Long) f16291D.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long T() {
        return ((Long) f16303P.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final String U() {
        return (String) f16290C.e();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long V() {
        return ((Long) f16300M.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final String W() {
        return (String) f16326j.e();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long X() {
        return ((Long) f16342z.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long Y() {
        return ((Long) f16308U.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long Z() {
        return ((Long) f16310W.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long a() {
        return ((Long) f16327k.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long a0() {
        return ((Long) f16301N.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long b() {
        return ((Long) f16320d.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final String b0() {
        return (String) f16328l.e();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long c() {
        return ((Long) f16331o.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long c0() {
        return ((Long) f16288A.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long d() {
        return ((Long) f16330n.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long e() {
        return ((Long) f16333q.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long f() {
        return ((Long) f16332p.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long g() {
        return ((Long) f16337u.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final String h() {
        return (String) f16322f.e();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final boolean i() {
        return ((Boolean) f16318c.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long j() {
        return ((Long) f16298K.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long k() {
        return ((Long) f16306S.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final String l() {
        return (String) f16295H.e();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final String m() {
        return (String) f16315a0.e();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long n() {
        return ((Long) f16338v.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long o() {
        return ((Long) f16299L.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final String p() {
        return (String) f16323g.e();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final boolean q() {
        return ((Boolean) f16340x.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long r() {
        return ((Long) f16339w.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long s() {
        return ((Long) f16307T.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final String t() {
        return (String) f16296I.e();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long u() {
        return ((Long) f16309V.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long v() {
        return ((Long) f16335s.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long w() {
        return ((Long) f16314a.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long x() {
        return ((Long) f16316b.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long y() {
        return ((Long) f16321e.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.Q6
    public final long z() {
        return ((Long) f16324h.e()).longValue();
    }
}
