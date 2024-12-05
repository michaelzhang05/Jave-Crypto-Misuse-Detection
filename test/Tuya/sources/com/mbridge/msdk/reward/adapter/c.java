package com.mbridge.msdk.reward.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.foundation.b.a;
import com.mbridge.msdk.foundation.db.f;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.db.k;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.ResDownloadCheckManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.h.e;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.reward.adapter.b;
import com.mbridge.msdk.reward.player.MBRewardVideoActivity;
import com.mbridge.msdk.video.bt.module.b.h;
import com.mbridge.msdk.videocommon.a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: A, reason: collision with root package name */
    private boolean f21440A;

    /* renamed from: C, reason: collision with root package name */
    private String f21442C;

    /* renamed from: D, reason: collision with root package name */
    private int f21443D;

    /* renamed from: E, reason: collision with root package name */
    private int f21444E;

    /* renamed from: F, reason: collision with root package name */
    private int f21445F;

    /* renamed from: G, reason: collision with root package name */
    private CampaignUnit f21446G;

    /* renamed from: H, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f21447H;

    /* renamed from: K, reason: collision with root package name */
    private String f21450K;

    /* renamed from: L, reason: collision with root package name */
    private a f21451L;

    /* renamed from: S, reason: collision with root package name */
    private List<CampaignEx> f21458S;

    /* renamed from: T, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f21459T;

    /* renamed from: U, reason: collision with root package name */
    private List<CampaignEx> f21460U;

    /* renamed from: k, reason: collision with root package name */
    private Context f21471k;

    /* renamed from: l, reason: collision with root package name */
    private String f21472l;

    /* renamed from: m, reason: collision with root package name */
    private String f21473m;

    /* renamed from: n, reason: collision with root package name */
    private int f21474n;

    /* renamed from: o, reason: collision with root package name */
    private int f21475o;

    /* renamed from: p, reason: collision with root package name */
    private int f21476p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f21477q;

    /* renamed from: r, reason: collision with root package name */
    private String f21478r;

    /* renamed from: s, reason: collision with root package name */
    private h f21479s;

    /* renamed from: t, reason: collision with root package name */
    private volatile com.mbridge.msdk.reward.adapter.a f21480t;

    /* renamed from: u, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.d.c f21481u;

    /* renamed from: z, reason: collision with root package name */
    private boolean f21486z;

    /* renamed from: v, reason: collision with root package name */
    private boolean f21482v = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f21483w = false;

    /* renamed from: a, reason: collision with root package name */
    public Object f21461a = new Object();

    /* renamed from: x, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f21484x = new CopyOnWriteArrayList<>();

    /* renamed from: y, reason: collision with root package name */
    private int f21485y = 2;

    /* renamed from: B, reason: collision with root package name */
    private String f21441B = "";

    /* renamed from: I, reason: collision with root package name */
    private boolean f21448I = false;

    /* renamed from: J, reason: collision with root package name */
    private long f21449J = 0;

    /* renamed from: M, reason: collision with root package name */
    private boolean f21452M = false;

    /* renamed from: N, reason: collision with root package name */
    private boolean f21453N = false;

    /* renamed from: b, reason: collision with root package name */
    public String f21462b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f21463c = "";

    /* renamed from: d, reason: collision with root package name */
    public String f21464d = "";

    /* renamed from: O, reason: collision with root package name */
    private Handler f21454O = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.reward.adapter.c.1
        /* JADX WARN: Removed duplicated region for block: B:100:0x025b  */
        /* JADX WARN: Removed duplicated region for block: B:101:0x025d  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void handleMessage(android.os.Message r19) {
            /*
                Method dump skipped, instructions count: 1212
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.c.AnonymousClass1.handleMessage(android.os.Message):void");
        }
    };

    /* renamed from: P, reason: collision with root package name */
    private boolean f21455P = false;

    /* renamed from: Q, reason: collision with root package name */
    private long f21456Q = 0;

    /* renamed from: e, reason: collision with root package name */
    volatile boolean f21465e = false;

    /* renamed from: f, reason: collision with root package name */
    volatile boolean f21466f = false;

    /* renamed from: g, reason: collision with root package name */
    volatile boolean f21467g = false;

    /* renamed from: h, reason: collision with root package name */
    volatile boolean f21468h = false;

    /* renamed from: i, reason: collision with root package name */
    volatile boolean f21469i = false;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f21470j = false;

    /* renamed from: R, reason: collision with root package name */
    private String f21457R = "";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.reward.adapter.c$4, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass4 implements b.i {

        /* renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.d.b f21510a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f21511b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f21512c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f21513d;

        AnonymousClass4(CampaignEx campaignEx, boolean z8, int i8) {
            this.f21511b = campaignEx;
            this.f21512c = z8;
            this.f21513d = i8;
            this.f21510a = com.mbridge.msdk.foundation.same.report.d.c.a().b().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.i
        public final void a(String str, String str2, String str3, String str4) {
        }

        @Override // com.mbridge.msdk.reward.adapter.b.i
        public final void a(String str, final String str2, final com.mbridge.msdk.foundation.c.b bVar) {
            ad.a("RewardMVVideoAdapter", "template 下载失败： ");
            if (bVar != null) {
                bVar.a("errorCode: 3202 errorMessage: temp resource download failed");
            }
            if (!this.f21512c && c.this.f21480t != null && c.this.f21454O != null) {
                ad.a("RewardMVVideoAdapter", "播放模板下载失败，非大模板");
                if (this.f21511b.getRsIgnoreCheckRule() == null || this.f21511b.getRsIgnoreCheckRule().size() <= 0 || !this.f21511b.getRsIgnoreCheckRule().contains(1)) {
                    c.this.f21454O.post(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.c.4.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            c cVar = c.this;
                            c.a(cVar, cVar.f21472l, c.this.f21458S, c.this.f21440A, str2);
                            if (c.this.f21454O != null) {
                                c.this.f21454O.removeMessages(5);
                            }
                            if (!c.this.f21469i && c.this.f21480t != null) {
                                c.this.f21469i = true;
                                com.mbridge.msdk.foundation.c.b bVar2 = bVar;
                                if (bVar2 != null) {
                                    bVar2.a("errorCode: 3202 errorMessage: temp resource download failed");
                                }
                                AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                if (anonymousClass4.f21510a == null) {
                                    anonymousClass4.f21510a = new com.mbridge.msdk.foundation.same.report.d.b();
                                }
                                AnonymousClass4 anonymousClass42 = AnonymousClass4.this;
                                anonymousClass42.f21510a.b(c.this.f21447H);
                                AnonymousClass4.this.f21510a.a(bVar);
                                c.this.f21480t.a(c.this.f21458S, bVar, AnonymousClass4.this.f21510a);
                                ad.a("RewardMVVideoAdapter", "播放模板下载失败，非大模板 onVideoLoadFail");
                            }
                        }
                    });
                    return;
                } else {
                    ad.c("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                    return;
                }
            }
            if (this.f21513d == 1) {
                if (this.f21511b.getRsIgnoreCheckRule() != null && this.f21511b.getRsIgnoreCheckRule().size() > 0) {
                    if (this.f21511b.getRsIgnoreCheckRule().contains(3)) {
                        ad.c("RewardMVVideoAdapter", "tpl download fail but hit ignoreCheckRule");
                        return;
                    } else if (this.f21511b.getCMPTEntryUrl().equals(this.f21511b.getendcard_url()) && this.f21511b.getRsIgnoreCheckRule().contains(2)) {
                        ad.c("RewardMVVideoAdapter", "endcard download fail but hit ignoreCheckRule at 3203");
                        return;
                    }
                }
                if (c.this.f21480t == null || c.this.f21454O == null) {
                    return;
                }
                c.this.f21454O.post(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.c.4.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        c cVar = c.this;
                        c.a(cVar, cVar.f21472l, c.this.f21458S, c.this.f21440A, str2);
                        if (c.this.f21454O != null) {
                            c.this.f21454O.removeMessages(5);
                        }
                        if (!c.this.f21469i && c.this.f21480t != null) {
                            c.this.f21469i = true;
                            com.mbridge.msdk.foundation.c.b bVar2 = bVar;
                            if (bVar2 != null) {
                                bVar2.a("errorCode: 3203 errorMessage: tpl temp resource download failed");
                            }
                            AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                            if (anonymousClass4.f21510a == null) {
                                anonymousClass4.f21510a = new com.mbridge.msdk.foundation.same.report.d.b();
                            }
                            AnonymousClass4 anonymousClass42 = AnonymousClass4.this;
                            anonymousClass42.f21510a.b(c.this.f21447H);
                            AnonymousClass4.this.f21510a.a(bVar);
                            c.this.f21480t.a(c.this.f21458S, bVar, AnonymousClass4.this.f21510a);
                            ad.a("RewardMVVideoAdapter", "播放模板下载失败，大模板，nscpt 1 onVideoLoadFail");
                        }
                    }
                });
            }
        }
    }

    /* loaded from: classes4.dex */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private String f21535b;

        /* renamed from: c, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.report.d.b f21536c;

        public a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            this.f21535b = str;
            this.f21536c = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (!c.this.f21452M) {
                    c.this.f21453N = true;
                    if (c.this.f21454O != null) {
                        Message obtainMessage = c.this.f21454O.obtainMessage();
                        obtainMessage.obj = this.f21535b;
                        obtainMessage.what = 2;
                        if (this.f21536c != null) {
                            Bundle bundle = new Bundle();
                            bundle.putString("metrics_data_lrid", this.f21536c.f());
                            obtainMessage.setData(bundle);
                        }
                        c.this.f21454O.sendMessage(obtainMessage);
                    }
                }
            } catch (Exception e8) {
                ad.b("RewardMVVideoAdapter", e8.getMessage());
            }
        }
    }

    /* loaded from: classes4.dex */
    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private String f21538b;

        /* renamed from: c, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.report.d.b f21539c;

        public b(String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            this.f21538b = str;
            this.f21539c = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (com.mbridge.msdk.f.b.a()) {
                    c cVar = c.this;
                    String unused = cVar.f21472l;
                    Context unused2 = c.this.f21471k;
                    cVar.f21442C = "";
                }
                c cVar2 = c.this;
                cVar2.f21478r = ai.a(cVar2.f21471k, c.this.f21472l);
                if (c.this.f21453N) {
                    return;
                }
                if (c.this.f21451L != null && c.this.f21454O != null) {
                    c.this.f21454O.removeCallbacks(c.this.f21451L);
                }
                c.this.f21452M = true;
                if (c.this.f21454O != null) {
                    Message obtainMessage = c.this.f21454O.obtainMessage();
                    obtainMessage.obj = this.f21538b;
                    obtainMessage.what = 1;
                    if (this.f21539c != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", this.f21539c.f());
                        obtainMessage.setData(bundle);
                    }
                    c.this.f21454O.sendMessage(obtainMessage);
                }
                if (!TextUtils.isEmpty(c.this.f21478r)) {
                    ad.b("RewardMVVideoAdapter", "excludeId : " + c.this.f21478r);
                }
            } catch (Exception e8) {
                ad.b("RewardMVVideoAdapter", e8.getMessage());
            }
        }
    }

    public c(Context context, String str, String str2) {
        try {
            this.f21471k = context.getApplicationContext();
            this.f21472l = str2;
            this.f21473m = str;
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0078 A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:11:0x0027, B:13:0x002d, B:14:0x0072, B:16:0x0078, B:18:0x0080, B:24:0x0044, B:26:0x004a, B:27:0x004e, B:29:0x0054, B:32:0x005c, B:35:0x0066), top: B:8:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void g() {
        /*
            r4 = this;
            com.mbridge.msdk.foundation.controller.c r0 = com.mbridge.msdk.foundation.controller.c.m()
            android.content.Context r0 = r0.c()
            com.mbridge.msdk.foundation.db.b r0 = com.mbridge.msdk.foundation.db.b.a(r0)
            java.lang.String r1 = r4.f21472l
            java.lang.String r2 = r4.f21463c
            java.util.List r0 = r0.a(r1, r2)
            if (r0 == 0) goto La7
            int r1 = r0.size()
            java.lang.String r2 = r4.f21472l
            java.lang.String r2 = com.mbridge.msdk.foundation.same.a.d.b(r2)
            if (r1 != 0) goto L23
            return
        L23:
            r3 = 1
            if (r1 != r3) goto L44
            r1 = 0
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Exception -> L42
            if (r3 == 0) goto L6f
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Exception -> L42
            com.mbridge.msdk.foundation.entity.d r3 = (com.mbridge.msdk.foundation.entity.d) r3     // Catch: java.lang.Exception -> L42
            java.lang.String r3 = r3.d()     // Catch: java.lang.Exception -> L42
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L42
            com.mbridge.msdk.foundation.entity.d r0 = (com.mbridge.msdk.foundation.entity.d) r0     // Catch: java.lang.Exception -> L42
            java.lang.String r0 = r0.b()     // Catch: java.lang.Exception -> L42
            goto L72
        L42:
            r0 = move-exception
            goto L9e
        L44:
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L42
            if (r1 != 0) goto L6f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L42
        L4e:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L42
            if (r1 == 0) goto L6f
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L42
            com.mbridge.msdk.foundation.entity.d r1 = (com.mbridge.msdk.foundation.entity.d) r1     // Catch: java.lang.Exception -> L42
            if (r1 == 0) goto L4e
            java.lang.String r3 = r1.a()     // Catch: java.lang.Exception -> L42
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Exception -> L42
            if (r3 == 0) goto L4e
            java.lang.String r3 = r1.d()     // Catch: java.lang.Exception -> L42
            java.lang.String r0 = r1.b()     // Catch: java.lang.Exception -> L42
            goto L72
        L6f:
            java.lang.String r3 = ""
            r0 = r3
        L72:
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L42
            if (r1 != 0) goto La7
            java.lang.String r1 = r4.f21463c     // Catch: java.lang.Exception -> L42
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Exception -> L42
            if (r1 == 0) goto La7
            com.mbridge.msdk.foundation.controller.c r1 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Exception -> L42
            android.content.Context r1 = r1.c()     // Catch: java.lang.Exception -> L42
            com.mbridge.msdk.foundation.db.b r1 = com.mbridge.msdk.foundation.db.b.a(r1)     // Catch: java.lang.Exception -> L42
            java.lang.String r3 = r4.f21472l     // Catch: java.lang.Exception -> L42
            r1.b(r2, r3)     // Catch: java.lang.Exception -> L42
            java.lang.String r1 = r4.f21472l     // Catch: java.lang.Exception -> L42
            java.lang.String r2 = r4.f21463c     // Catch: java.lang.Exception -> L42
            com.mbridge.msdk.foundation.same.a.d.a(r1, r2, r0)     // Catch: java.lang.Exception -> L42
            java.lang.String r0 = r4.f21472l     // Catch: java.lang.Exception -> L42
            com.mbridge.msdk.foundation.same.a.d.c(r0)     // Catch: java.lang.Exception -> L42
            goto La7
        L9e:
            java.lang.String r1 = "RewardMVVideoAdapter"
            java.lang.String r0 = r0.getMessage()
            com.mbridge.msdk.foundation.tools.ad.a(r1, r0)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.c.g():void");
    }

    private String h() {
        int F8;
        g a8 = com.mbridge.msdk.c.h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
        if (TextUtils.isEmpty(this.f21450K)) {
            F8 = a8.ar();
        } else {
            F8 = a8.F();
        }
        return com.mbridge.msdk.foundation.same.net.g.d.f().a(this.f21450K, F8);
    }

    private void i() {
        if (com.mbridge.msdk.videocommon.a.a.a() != null) {
            try {
                g b8 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
                if (b8 == null) {
                    com.mbridge.msdk.c.h.a();
                    b8 = i.a();
                }
                com.mbridge.msdk.videocommon.a.a.a().a(b8.ac() * 1000, this.f21472l);
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    e8.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        try {
            if (an.b(this.f21472l)) {
                com.mbridge.msdk.reward.b.a.a(this.f21472l, 0);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    private String k() {
        try {
            if (!an.b(com.mbridge.msdk.reward.b.a.f21548d)) {
                return "";
            }
            return com.mbridge.msdk.reward.b.a.f21548d;
        } catch (Exception e8) {
            e8.printStackTrace();
            return "";
        }
    }

    private void l() {
        try {
            Map<String, Long> map = com.mbridge.msdk.foundation.same.a.d.f19455k;
            if (map == null || map.size() <= 0) {
                return;
            }
            com.mbridge.msdk.foundation.same.a.d.f19455k.clear();
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    private void m() {
        try {
            j.a(com.mbridge.msdk.foundation.db.h.a(this.f21471k)).a(this.f21472l);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public final void c(boolean z8) {
        this.f21440A = z8;
    }

    public final boolean d(boolean z8) {
        com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
        CopyOnWriteArrayList<CampaignEx> a8 = com.mbridge.msdk.videocommon.a.a.a().a(this.f21472l, 1, this.f21440A, this.f21441B);
        if (a8 != null && a8.size() > 0) {
            CampaignEx campaignEx = a8.get(0);
            int b8 = com.mbridge.msdk.videocommon.a.a.a().b(this.f21472l, 1, this.f21440A, this.f21441B);
            if (TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()) || campaignEx.getNscpt() != 1 || a8.size() >= b8) {
                return a(a8, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt(), z8);
            }
            if (z8) {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("event_name", "is_ready_cltr");
                dVar.a("reason", "nscpt error");
                a(bVar, dVar, a8);
            }
            return false;
        }
        ad.a("RewardVideoController", "database has not can use data");
        if (z8) {
            com.mbridge.msdk.foundation.same.report.d.d dVar2 = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar2.a("event_name", "is_ready_cse");
            dVar2.a("reason", "no effective campaign list");
        }
        return false;
    }

    public final void e(boolean z8) {
        this.f21455P = z8;
    }

    public final void f(boolean z8) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList;
        if (z8 || (copyOnWriteArrayList = this.f21447H) == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        com.mbridge.msdk.videocommon.a.a.a().a(this.f21472l, this.f21447H);
    }

    public final boolean c() {
        List<CampaignEx> c8 = com.mbridge.msdk.videocommon.a.a.a().c(this.f21472l, 1, this.f21440A, this.f21441B);
        if (c8 != null && c8.size() > 0) {
            CampaignEx campaignEx = c8.get(0);
            int b8 = com.mbridge.msdk.videocommon.a.a.a().b(this.f21472l, 1, this.f21440A, this.f21441B);
            if (TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()) || campaignEx.getNscpt() != 1 || c8.size() >= b8) {
                return a(c8, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt());
            }
            return false;
        }
        ad.a("test_isReay_db", "database has not can use data");
        return false;
    }

    public final CopyOnWriteArrayList<CampaignEx> e() {
        return this.f21459T;
    }

    public final void b(boolean z8) {
        this.f21486z = z8;
    }

    public final String f() {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f21447H;
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            return com.mbridge.msdk.foundation.same.c.a(this.f21447H);
        }
        return com.mbridge.msdk.foundation.same.c.a(this.f21460U);
    }

    public final boolean b() {
        return d(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062 A[Catch: Exception -> 0x0027, TRY_ENTER, TryCatch #0 {Exception -> 0x0027, blocks: (B:4:0x0004, B:6:0x000a, B:14:0x0021, B:15:0x002f, B:17:0x004d, B:19:0x0055, B:21:0x0059, B:24:0x0062, B:25:0x007b, B:26:0x0070, B:27:0x0091, B:31:0x002a), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:4:0x0004, B:6:0x000a, B:14:0x0021, B:15:0x002f, B:17:0x004d, B:19:0x0055, B:21:0x0059, B:24:0x0062, B:25:0x007b, B:26:0x0070, B:27:0x0091, B:31:0x002a), top: B:3:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void a(com.mbridge.msdk.reward.adapter.c r5, com.mbridge.msdk.foundation.same.report.d.b r6, int r7) {
        /*
            java.lang.String r0 = "2000126"
            if (r6 == 0) goto Lac
            boolean r1 = r6.r()     // Catch: java.lang.Exception -> L27
            if (r1 != 0) goto Lac
            com.mbridge.msdk.foundation.same.report.d.d r1 = new com.mbridge.msdk.foundation.same.report.d.d     // Catch: java.lang.Exception -> L27
            r1.<init>()     // Catch: java.lang.Exception -> L27
            r2 = 3
            java.lang.String r3 = "result"
            if (r7 == r2) goto L2a
            r2 = 880023(0xd6d97, float:1.233175E-39)
            if (r7 == r2) goto L2a
            r2 = 880041(0xd6da9, float:1.2332E-39)
            if (r7 == r2) goto L2a
            switch(r7) {
                case 10: goto L2a;
                case 11: goto L2a;
                case 12: goto L2a;
                default: goto L21;
            }
        L21:
            java.lang.String r7 = "1"
            r1.a(r3, r7)     // Catch: java.lang.Exception -> L27
            goto L2f
        L27:
            r5 = move-exception
            goto La5
        L2a:
            java.lang.String r7 = "2"
            r1.a(r3, r7)     // Catch: java.lang.Exception -> L27
        L2f:
            java.lang.String r7 = "timeout"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L27
            r2.<init>()     // Catch: java.lang.Exception -> L27
            int r3 = r5.f21476p     // Catch: java.lang.Exception -> L27
            r2.append(r3)     // Catch: java.lang.Exception -> L27
            java.lang.String r3 = ""
            r2.append(r3)     // Catch: java.lang.Exception -> L27
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L27
            r1.a(r7, r2)     // Catch: java.lang.Exception -> L27
            com.mbridge.msdk.foundation.c.b r7 = r6.o()     // Catch: java.lang.Exception -> L27
            if (r7 == 0) goto L91
            java.lang.String r2 = "campaign_request_error"
            java.lang.Object r2 = r7.a(r2)     // Catch: java.lang.Exception -> L27
            if (r2 == 0) goto L91
            boolean r3 = r2 instanceof com.mbridge.msdk.foundation.same.net.b.a     // Catch: java.lang.Exception -> L27
            if (r3 == 0) goto L91
            r3 = r2
            com.mbridge.msdk.foundation.same.net.b.a r3 = (com.mbridge.msdk.foundation.same.net.b.a) r3     // Catch: java.lang.Exception -> L27
            com.mbridge.msdk.foundation.same.net.f.c r3 = r3.f19603c     // Catch: java.lang.Exception -> L27
            java.lang.String r4 = "code"
            if (r3 == 0) goto L70
            com.mbridge.msdk.foundation.same.net.b.a r2 = (com.mbridge.msdk.foundation.same.net.b.a) r2     // Catch: java.lang.Exception -> L27
            com.mbridge.msdk.foundation.same.net.f.c r2 = r2.f19603c     // Catch: java.lang.Exception -> L27
            int r2 = r2.f19658d     // Catch: java.lang.Exception -> L27
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L27
            r1.a(r4, r2)     // Catch: java.lang.Exception -> L27
            goto L7b
        L70:
            int r2 = r7.a()     // Catch: java.lang.Exception -> L27
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L27
            r1.a(r4, r2)     // Catch: java.lang.Exception -> L27
        L7b:
            java.lang.String r2 = "reason"
            java.lang.String r3 = r7.b()     // Catch: java.lang.Exception -> L27
            r1.a(r2, r3)     // Catch: java.lang.Exception -> L27
            java.lang.String r2 = "err_desc"
            java.lang.String r7 = r7.l()     // Catch: java.lang.Exception -> L27
            r1.a(r2, r7)     // Catch: java.lang.Exception -> L27
            r7 = 0
            r6.a(r7)     // Catch: java.lang.Exception -> L27
        L91:
            java.lang.String r7 = "hst"
            java.lang.String r5 = r5.h()     // Catch: java.lang.Exception -> L27
            r1.a(r7, r5)     // Catch: java.lang.Exception -> L27
            r6.a(r0, r1)     // Catch: java.lang.Exception -> L27
            com.mbridge.msdk.reward.c.a.a r5 = com.mbridge.msdk.reward.c.a.a.a()     // Catch: java.lang.Exception -> L27
            r5.a(r0, r6)     // Catch: java.lang.Exception -> L27
            goto Lac
        La5:
            boolean r6 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r6 == 0) goto Lac
            r5.printStackTrace()
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.c.a(com.mbridge.msdk.reward.adapter.c, com.mbridge.msdk.foundation.same.report.d.b, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (this.f21454O != null) {
            if (TextUtils.isEmpty(str)) {
                str = "load fail exception";
            }
            Message obtain = Message.obtain();
            obtain.what = 4;
            obtain.obj = str;
            if (bVar != null) {
                bVar.c(true);
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", bVar.f());
                obtain.setData(bundle);
            }
            if (str.contains("exception")) {
                this.f21454O.sendMessageAtFrontOfQueue(obtain);
            } else {
                this.f21454O.sendMessage(obtain);
            }
        }
    }

    public final boolean h(boolean z8) {
        if (z8) {
            List<CampaignEx> list = this.f21460U;
            if (list == null || list.size() <= 0) {
                return false;
            }
            for (CampaignEx campaignEx : this.f21460U) {
                if (campaignEx != null) {
                    campaignEx.setLoadTimeoutState(1);
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e())) {
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f21472l + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().e(), true);
                    }
                }
            }
            com.mbridge.msdk.videocommon.a.a.a().a(this.f21472l, this.f21460U, "load_timeout", 1);
            return true;
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f21447H;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return false;
        }
        Iterator<CampaignEx> it = this.f21447H.iterator();
        while (it.hasNext()) {
            CampaignEx next = it.next();
            if (next != null) {
                next.setLoadTimeoutState(1);
                if (next.getRewardTemplateMode() != null && !TextUtils.isEmpty(next.getRewardTemplateMode().e())) {
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f21472l + "_" + next.getRequestId() + "_" + next.getRewardTemplateMode().e(), true);
                }
            }
        }
        com.mbridge.msdk.videocommon.a.a.a().a(this.f21472l, this.f21447H, "load_timeout", 1);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.reward.adapter.c$5, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass5 implements b.i {

        /* renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.d.b f21521a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f21522b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f21523c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f21524d;

        AnonymousClass5(CampaignEx campaignEx, boolean z8, int i8) {
            this.f21522b = campaignEx;
            this.f21523c = z8;
            this.f21524d = i8;
            this.f21521a = com.mbridge.msdk.foundation.same.report.d.c.a().b().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.i
        public final void a(final String str, final String str2, final String str3, String str4) {
            ad.a("RewardMVVideoAdapter", "大模板业务，大模板下载成功");
            c.this.f21466f = true;
            if (!c.this.f21465e || c.this.f21467g || c.this.f21454O == null) {
                return;
            }
            synchronized (c.this.f21461a) {
                try {
                    if (c.this.f21467g) {
                        return;
                    }
                    c.this.f21467g = true;
                    c.this.f21454O.post(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.c.5.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.mbridge.msdk.reward.adapter.b a8 = b.m.a();
                            boolean z8 = c.this.f21448I;
                            Handler handler = c.this.f21454O;
                            boolean z9 = c.this.f21486z;
                            boolean z10 = c.this.f21440A;
                            String str5 = str3;
                            String requestIdNotice = AnonymousClass5.this.f21522b.getRequestIdNotice();
                            String str6 = str;
                            String str7 = str2;
                            String cMPTEntryUrl = AnonymousClass5.this.f21522b.getCMPTEntryUrl();
                            int i8 = c.this.f21485y;
                            AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                            a8.a(z8, handler, z9, z10, str5, requestIdNotice, str6, str7, cMPTEntryUrl, i8, anonymousClass5.f21522b, c.this.f21447H, H5DownLoadManager.getInstance().getH5ResAddress(AnonymousClass5.this.f21522b.getCMPTEntryUrl()), str2, c.this.f21481u, new b.j() { // from class: com.mbridge.msdk.reward.adapter.c.5.1.1
                                @Override // com.mbridge.msdk.reward.adapter.b.j
                                public final void a(String str8, String str9, String str10, String str11, String str12, a.C0439a c0439a) {
                                    ad.a("HBOPTIMIZE", "模板加载成功 requestId " + str11);
                                    c cVar = c.this;
                                    CopyOnWriteArrayList copyOnWriteArrayList = cVar.f21447H;
                                    AnonymousClass5 anonymousClass52 = AnonymousClass5.this;
                                    if (cVar.a(copyOnWriteArrayList, anonymousClass52.f21523c, anonymousClass52.f21524d)) {
                                        c cVar2 = c.this;
                                        c.a(cVar2, cVar2.f21472l, c.this.f21458S, c.this.f21460U, c.this.f21440A);
                                        if (c.this.f21454O != null) {
                                            c.this.f21454O.removeMessages(5);
                                        }
                                        if (c.this.f21480t == null || c.this.f21468h) {
                                            return;
                                        }
                                        c.this.f21468h = true;
                                        AnonymousClass5 anonymousClass53 = AnonymousClass5.this;
                                        com.mbridge.msdk.foundation.same.report.d.b bVar = anonymousClass53.f21521a;
                                        if (bVar != null) {
                                            bVar.b(c.this.f21447H);
                                        }
                                        c.this.f21480t.a(c.this.f21447H, AnonymousClass5.this.f21521a);
                                        return;
                                    }
                                    c cVar3 = c.this;
                                    c.a(cVar3, str10, cVar3.f21458S, c.this.f21440A, str3);
                                    if (c.this.f21454O != null) {
                                        c.this.f21454O.removeMessages(5);
                                    }
                                    if (c.this.f21480t == null || c.this.f21469i) {
                                        return;
                                    }
                                    c.this.f21469i = true;
                                    com.mbridge.msdk.foundation.c.b b8 = com.mbridge.msdk.foundation.c.a.b(880008, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                                    AnonymousClass5 anonymousClass54 = AnonymousClass5.this;
                                    if (anonymousClass54.f21521a == null) {
                                        anonymousClass54.f21521a = new com.mbridge.msdk.foundation.same.report.d.b();
                                    }
                                    AnonymousClass5 anonymousClass55 = AnonymousClass5.this;
                                    anonymousClass55.f21521a.b(c.this.f21447H);
                                    AnonymousClass5.this.f21521a.a(b8);
                                    c.this.f21480t.a(c.this.f21458S, b8, AnonymousClass5.this.f21521a);
                                    ad.a("RewardMVVideoAdapter", "大模板业务，大模板预加载成功 isReady false  onVideoLoadFail");
                                }

                                @Override // com.mbridge.msdk.reward.adapter.b.j
                                public final void a(String str8, String str9, String str10, a.C0439a c0439a, com.mbridge.msdk.foundation.c.b bVar) {
                                    ad.a("RewardMVVideoAdapter", "大模板业务，大模板预加载失败");
                                    ad.b("HBOPTIMIZE", "模板加载失败 requestId " + str9);
                                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                    c cVar = c.this;
                                    c.a(cVar, str2, cVar.f21458S, c.this.f21440A, str9);
                                    if (c.this.f21454O != null) {
                                        c.this.f21454O.removeMessages(5);
                                    }
                                    if (c.this.f21480t == null || c.this.f21469i) {
                                        return;
                                    }
                                    c.this.f21469i = true;
                                    AnonymousClass5 anonymousClass52 = AnonymousClass5.this;
                                    if (anonymousClass52.f21521a == null) {
                                        anonymousClass52.f21521a = new com.mbridge.msdk.foundation.same.report.d.b();
                                    }
                                    AnonymousClass5 anonymousClass53 = AnonymousClass5.this;
                                    anonymousClass53.f21521a.b(c.this.f21447H);
                                    AnonymousClass5.this.f21521a.a(bVar);
                                    c.this.f21480t.a(c.this.f21458S, bVar, AnonymousClass5.this.f21521a);
                                    ad.a("RewardMVVideoAdapter", "大模板业务，大模板预加载失败 onVideoLoadFail");
                                }
                            }, false);
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.b.i
        public final void a(String str, String str2, com.mbridge.msdk.foundation.c.b bVar) {
            ad.a("RewardMVVideoAdapter", "大模板业务，大模板下载失败");
            if (this.f21522b.getRsIgnoreCheckRule() != null && this.f21522b.getRsIgnoreCheckRule().size() > 0) {
                if (this.f21522b.getRsIgnoreCheckRule().contains(3)) {
                    ad.c("RewardMVVideoAdapter", "tpl download fail but hit ignoreCheckRule");
                    return;
                } else if (this.f21522b.getCMPTEntryUrl().equals(this.f21522b.getendcard_url()) && this.f21522b.getRsIgnoreCheckRule().contains(2)) {
                    ad.c("RewardMVVideoAdapter", "endcard download fail but hit ignoreCheckRule at 3203");
                    return;
                }
            }
            c cVar = c.this;
            c.a(cVar, cVar.f21472l, c.this.f21458S, c.this.f21440A, str2);
            c.this.f21466f = false;
            if (c.this.f21454O != null) {
                c.this.f21454O.removeMessages(5);
            }
            if (c.this.f21480t == null || c.this.f21469i) {
                return;
            }
            c.this.f21469i = true;
            if (bVar != null) {
                bVar.a("errorCode: 3203 errorMessage: tpl temp resource download failed");
            }
            if (this.f21521a == null) {
                this.f21521a = new com.mbridge.msdk.foundation.same.report.d.b();
            }
            this.f21521a.b(c.this.f21447H);
            this.f21521a.a(bVar);
            c.this.f21480t.a(c.this.f21458S, bVar, this.f21521a);
            ad.a("RewardMVVideoAdapter", "大模板业务，大模板下载失败 onVideoLoadFail");
        }
    }

    private com.mbridge.msdk.foundation.same.report.d.b c(List<CampaignEx> list) {
        com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
        String str = "";
        if (list != null) {
            try {
                if (list.size() > 0) {
                    if (list.get(0) != null) {
                        str = list.get(0).getLocalRequestId();
                    }
                    bVar.c(str);
                    bVar.b(list);
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    e8.printStackTrace();
                }
            }
        }
        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
        dVar.a("cache", 1);
        dVar.a(CampaignEx.JSON_KEY_HB, 1);
        dVar.a("auto_load", 2);
        bVar.a("2000127", dVar);
        bVar.a("2000048", dVar);
        bVar.b(this.f21486z ? 287 : 94);
        bVar.i("1");
        bVar.b("2");
        if (!TextUtils.isEmpty(str) && !com.mbridge.msdk.foundation.same.report.d.c.a().b().containsKey(str)) {
            com.mbridge.msdk.foundation.same.report.d.c.a().b().put(str, bVar);
        }
        return bVar;
    }

    public final void g(boolean z8) {
        if (z8) {
            List<CampaignEx> list = this.f21460U;
            if (list == null || list.size() <= 0) {
                return;
            }
            for (CampaignEx campaignEx : this.f21460U) {
                if (campaignEx != null) {
                    campaignEx.setLoadTimeoutState(0);
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e())) {
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f21472l + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().e(), false);
                    }
                }
            }
            com.mbridge.msdk.videocommon.a.a.a().a(this.f21472l, this.f21460U, "load_timeout", 0);
            return;
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f21447H;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        Iterator<CampaignEx> it = this.f21447H.iterator();
        while (it.hasNext()) {
            CampaignEx next = it.next();
            if (next != null) {
                next.setLoadTimeoutState(0);
                if (next.getRewardTemplateMode() != null && !TextUtils.isEmpty(next.getRewardTemplateMode().e())) {
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f21472l + "_" + next.getRequestId() + "_" + next.getRewardTemplateMode().e(), false);
                }
            }
        }
        com.mbridge.msdk.videocommon.a.a.a().a(this.f21472l, this.f21447H, "load_timeout", 0);
    }

    private void b(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    this.f21474n += list.size();
                }
            } catch (Exception e8) {
                e8.printStackTrace();
                return;
            }
        }
        com.mbridge.msdk.videocommon.d.c cVar = this.f21481u;
        if (cVar == null || this.f21474n > cVar.v()) {
            this.f21474n = 0;
        }
        if (an.b(this.f21472l)) {
            com.mbridge.msdk.reward.b.a.a(this.f21472l, this.f21474n);
        }
    }

    public final CopyOnWriteArrayList<CampaignEx> d() {
        return this.f21447H;
    }

    private void b(String str) {
        if (an.b(str)) {
            com.mbridge.msdk.reward.b.a.f21548d = str;
        }
    }

    private boolean b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        try {
            return campaignEx.getPlayable_ads_without_video() == 2;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    public final String a(boolean z8) {
        CopyOnWriteArrayList<CampaignEx> a8;
        CampaignEx campaignEx;
        if (z8) {
            if (TextUtils.isEmpty(this.f21463c) && (a8 = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f21472l)) != null && a8.size() > 0 && (campaignEx = a8.get(0)) != null) {
                this.f21463c = campaignEx.getRequestId();
            }
            return this.f21463c;
        }
        return this.f21462b;
    }

    private void b(String str, boolean z8, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        com.mbridge.msdk.foundation.same.f.b.h().execute(new b(str, bVar));
        if (this.f21454O != null) {
            a aVar = new a(str, bVar);
            this.f21451L = aVar;
            this.f21454O.postDelayed(aVar, 90000L);
            return;
        }
        a(str, z8, bVar);
    }

    public final void a(String str) {
        this.f21441B = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.reward.adapter.c$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass3 implements b.c {

        /* renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.d.b f21490a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f21491b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f21492c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f21493d;

        AnonymousClass3(CampaignEx campaignEx, boolean z8, int i8) {
            this.f21491b = campaignEx;
            this.f21492c = z8;
            this.f21493d = i8;
            this.f21490a = com.mbridge.msdk.foundation.same.report.d.c.a().b().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.c
        public final void a(final String str, final String str2, final String str3, final CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            c.this.f21465e = true;
            if (!this.f21492c) {
                Iterator<CampaignEx> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    final CampaignEx next = it.next();
                    if (next != null && next.getRewardTemplateMode() != null && !TextUtils.isEmpty(next.getRewardTemplateMode().e()) && !next.getRewardTemplateMode().e().contains(CampaignEx.KEY_IS_CMPT_ENTRY) && c.this.f21454O != null) {
                        c.this.f21454O.post(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.c.3.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.mbridge.msdk.reward.adapter.b a8 = b.m.a();
                                boolean z8 = c.this.f21448I;
                                Handler handler = c.this.f21454O;
                                boolean z9 = c.this.f21486z;
                                boolean z10 = c.this.f21440A;
                                String e8 = next.getRewardTemplateMode().e();
                                int i8 = c.this.f21485y;
                                AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                a8.a(z8, handler, z9, z10, null, e8, i8, anonymousClass3.f21491b, c.this.f21447H, H5DownLoadManager.getInstance().getH5ResAddress(next.getRewardTemplateMode().e()), str, str2, str3, next.getRequestIdNotice(), c.this.f21481u, new b.j() { // from class: com.mbridge.msdk.reward.adapter.c.3.1.1
                                    @Override // com.mbridge.msdk.reward.adapter.b.j
                                    public final void a(String str4, String str5, String str6, String str7, String str8, a.C0439a c0439a) {
                                        c cVar = c.this;
                                        CopyOnWriteArrayList copyOnWriteArrayList2 = cVar.f21447H;
                                        AnonymousClass3 anonymousClass32 = AnonymousClass3.this;
                                        if (cVar.a(copyOnWriteArrayList2, anonymousClass32.f21492c, anonymousClass32.f21493d)) {
                                            c cVar2 = c.this;
                                            String str9 = cVar2.f21472l;
                                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                            c.a(cVar2, str9, copyOnWriteArrayList, c.this.f21460U, c.this.f21440A);
                                            if (c.this.f21454O != null) {
                                                c.this.f21454O.removeMessages(5);
                                            }
                                            if (c.this.f21480t == null || c.this.f21468h) {
                                                return;
                                            }
                                            c.this.f21468h = true;
                                            AnonymousClass3 anonymousClass33 = AnonymousClass3.this;
                                            com.mbridge.msdk.foundation.same.report.d.b bVar = anonymousClass33.f21490a;
                                            if (bVar != null) {
                                                bVar.b(c.this.f21447H);
                                            }
                                            c.this.f21480t.a(c.this.f21447H, AnonymousClass3.this.f21490a);
                                            return;
                                        }
                                        c cVar3 = c.this;
                                        c.a(cVar3, str6, cVar3.f21458S, c.this.f21440A, str7);
                                        if (c.this.f21454O != null) {
                                            c.this.f21454O.removeMessages(5);
                                        }
                                        if (c.this.f21480t == null || c.this.f21469i) {
                                            return;
                                        }
                                        c.this.f21469i = true;
                                        com.mbridge.msdk.foundation.c.b b8 = com.mbridge.msdk.foundation.c.a.b(880015, "errorCode: 3502 errorMessage: temp preload success but isReady false");
                                        AnonymousClass3 anonymousClass34 = AnonymousClass3.this;
                                        if (anonymousClass34.f21490a == null) {
                                            anonymousClass34.f21490a = new com.mbridge.msdk.foundation.same.report.d.b();
                                        }
                                        AnonymousClass3 anonymousClass35 = AnonymousClass3.this;
                                        anonymousClass35.f21490a.b(c.this.f21447H);
                                        AnonymousClass3.this.f21490a.a(b8);
                                        c.this.f21480t.a(c.this.f21447H, b8, AnonymousClass3.this.f21490a);
                                        ad.a("RewardMVVideoAdapter", "Campaign 下载成功： 非大模板，播放模板预加载成功,isReay false onVideoLoadFail");
                                    }

                                    @Override // com.mbridge.msdk.reward.adapter.b.j
                                    public final void a(String str4, String str5, String str6, a.C0439a c0439a, com.mbridge.msdk.foundation.c.b bVar) {
                                        if (bVar != null) {
                                            bVar.a("his_reason", "preload template failed is tpl :" + AnonymousClass3.this.f21492c);
                                        }
                                        if (AnonymousClass3.this.f21491b.getRsIgnoreCheckRule() != null && AnonymousClass3.this.f21491b.getRsIgnoreCheckRule().size() > 0 && AnonymousClass3.this.f21491b.getRsIgnoreCheckRule().contains(1)) {
                                            ad.c("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                                            return;
                                        }
                                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                        c cVar = c.this;
                                        c.a(cVar, str2, cVar.f21458S, c.this.f21440A, str5);
                                        if (c.this.f21454O != null) {
                                            c.this.f21454O.removeMessages(5);
                                        }
                                        if (c.this.f21480t == null || c.this.f21469i) {
                                            return;
                                        }
                                        c.this.f21469i = true;
                                        AnonymousClass3 anonymousClass32 = AnonymousClass3.this;
                                        if (anonymousClass32.f21490a == null) {
                                            anonymousClass32.f21490a = new com.mbridge.msdk.foundation.same.report.d.b();
                                        }
                                        AnonymousClass3 anonymousClass33 = AnonymousClass3.this;
                                        anonymousClass33.f21490a.b(c.this.f21447H);
                                        AnonymousClass3.this.f21490a.a(bVar);
                                        c.this.f21480t.a(c.this.f21458S, bVar, AnonymousClass3.this.f21490a);
                                        ad.a("RewardMVVideoAdapter", "Campaign 下载失败： 非大模板，播放模板预加载失败 onVideoLoadFail");
                                    }
                                });
                            }
                        });
                    } else {
                        c cVar = c.this;
                        if (cVar.a(cVar.f21447H, this.f21492c, this.f21493d)) {
                            c cVar2 = c.this;
                            c.a(cVar2, cVar2.f21472l, copyOnWriteArrayList, c.this.f21460U, c.this.f21440A);
                            if (c.this.f21454O != null) {
                                c.this.f21454O.removeMessages(5);
                            }
                            if (c.this.f21480t != null && !c.this.f21468h) {
                                c.this.f21468h = true;
                                com.mbridge.msdk.foundation.same.report.d.b bVar = this.f21490a;
                                if (bVar != null) {
                                    bVar.b(c.this.f21447H);
                                }
                                c.this.f21480t.a(c.this.f21447H, this.f21490a);
                            }
                        } else {
                            c cVar3 = c.this;
                            c.a(cVar3, str2, cVar3.f21458S, c.this.f21440A, str3);
                            if (c.this.f21454O != null) {
                                c.this.f21454O.removeMessages(5);
                            }
                            if (c.this.f21480t != null && !c.this.f21469i) {
                                c.this.f21469i = true;
                                com.mbridge.msdk.foundation.c.b b8 = com.mbridge.msdk.foundation.c.a.b(880015, "errorCode: 3503 errorMessage: have no temp but isReady false");
                                if (this.f21490a == null) {
                                    this.f21490a = new com.mbridge.msdk.foundation.same.report.d.b();
                                }
                                this.f21490a.b(c.this.f21447H);
                                this.f21490a.a(b8);
                                c.this.f21480t.a(c.this.f21447H, b8, this.f21490a);
                                ad.a("RewardMVVideoAdapter", "Campaign 下载成功： 非大模板，不存在播放模板,isReay false onVideoLoadFail");
                            }
                        }
                    }
                }
                return;
            }
            if (!c.this.f21466f || c.this.f21467g || c.this.f21454O == null) {
                return;
            }
            synchronized (c.this.f21461a) {
                try {
                    if (c.this.f21467g) {
                        return;
                    }
                    c.this.f21467g = true;
                    c.this.f21454O.post(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.c.3.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.mbridge.msdk.reward.adapter.b a8 = b.m.a();
                            boolean z8 = c.this.f21448I;
                            Handler handler = c.this.f21454O;
                            boolean z9 = c.this.f21486z;
                            boolean z10 = c.this.f21440A;
                            String str4 = str3;
                            String requestIdNotice = AnonymousClass3.this.f21491b.getRequestIdNotice();
                            String str5 = c.this.f21473m;
                            String str6 = str2;
                            String cMPTEntryUrl = AnonymousClass3.this.f21491b.getCMPTEntryUrl();
                            int i8 = c.this.f21485y;
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            a8.a(z8, handler, z9, z10, str4, requestIdNotice, str5, str6, cMPTEntryUrl, i8, anonymousClass3.f21491b, c.this.f21447H, H5DownLoadManager.getInstance().getH5ResAddress(AnonymousClass3.this.f21491b.getCMPTEntryUrl()), str2, c.this.f21481u, new b.j() { // from class: com.mbridge.msdk.reward.adapter.c.3.2.1
                                @Override // com.mbridge.msdk.reward.adapter.b.j
                                public final void a(String str7, String str8, String str9, String str10, String str11, a.C0439a c0439a) {
                                    c cVar4 = c.this;
                                    CopyOnWriteArrayList copyOnWriteArrayList2 = cVar4.f21447H;
                                    AnonymousClass3 anonymousClass32 = AnonymousClass3.this;
                                    if (cVar4.a(copyOnWriteArrayList2, anonymousClass32.f21492c, anonymousClass32.f21493d)) {
                                        c cVar5 = c.this;
                                        String str12 = cVar5.f21472l;
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        c.a(cVar5, str12, copyOnWriteArrayList, c.this.f21460U, c.this.f21440A);
                                        if (c.this.f21454O != null) {
                                            c.this.f21454O.removeMessages(5);
                                        }
                                        if (c.this.f21480t == null || c.this.f21468h) {
                                            return;
                                        }
                                        c.this.f21468h = true;
                                        AnonymousClass3 anonymousClass33 = AnonymousClass3.this;
                                        com.mbridge.msdk.foundation.same.report.d.b bVar2 = anonymousClass33.f21490a;
                                        if (bVar2 != null) {
                                            bVar2.b(c.this.f21447H);
                                        }
                                        c.this.f21480t.a(c.this.f21447H, AnonymousClass3.this.f21490a);
                                        return;
                                    }
                                    c cVar6 = c.this;
                                    c.a(cVar6, str9, cVar6.f21458S, c.this.f21440A, str10);
                                    if (c.this.f21454O != null) {
                                        c.this.f21454O.removeMessages(5);
                                    }
                                    if (c.this.f21480t == null || c.this.f21469i) {
                                        return;
                                    }
                                    c.this.f21469i = true;
                                    com.mbridge.msdk.foundation.c.b b9 = com.mbridge.msdk.foundation.c.a.b(880015, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                                    AnonymousClass3 anonymousClass34 = AnonymousClass3.this;
                                    if (anonymousClass34.f21490a == null) {
                                        anonymousClass34.f21490a = new com.mbridge.msdk.foundation.same.report.d.b();
                                    }
                                    AnonymousClass3 anonymousClass35 = AnonymousClass3.this;
                                    anonymousClass35.f21490a.b(c.this.f21447H);
                                    AnonymousClass3.this.f21490a.a(b9);
                                    c.this.f21480t.a(c.this.f21458S, b9, AnonymousClass3.this.f21490a);
                                    ad.a("RewardMVVideoAdapter", "Campaign 下载成功： 大模板预加载成功,isReady false onVideoLoadFail");
                                }

                                @Override // com.mbridge.msdk.reward.adapter.b.j
                                public final void a(String str7, String str8, String str9, a.C0439a c0439a, com.mbridge.msdk.foundation.c.b bVar2) {
                                    if (bVar2 != null) {
                                        bVar2.a("his_reason", "errorCode: 3303 errorMessage: tpl temp preload failed");
                                    }
                                    if (AnonymousClass3.this.f21491b.getRsIgnoreCheckRule() != null && AnonymousClass3.this.f21491b.getRsIgnoreCheckRule().size() > 0 && AnonymousClass3.this.f21491b.getRsIgnoreCheckRule().contains(3)) {
                                        ad.c("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                                        return;
                                    }
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    c cVar4 = c.this;
                                    c.a(cVar4, str2, cVar4.f21458S, c.this.f21440A, str8);
                                    if (c.this.f21454O != null) {
                                        c.this.f21454O.removeMessages(5);
                                    }
                                    if (c.this.f21480t == null || c.this.f21469i) {
                                        return;
                                    }
                                    c.this.f21469i = true;
                                    AnonymousClass3 anonymousClass32 = AnonymousClass3.this;
                                    if (anonymousClass32.f21490a == null) {
                                        anonymousClass32.f21490a = new com.mbridge.msdk.foundation.same.report.d.b();
                                    }
                                    AnonymousClass3 anonymousClass33 = AnonymousClass3.this;
                                    anonymousClass33.f21490a.b(c.this.f21447H);
                                    AnonymousClass3.this.f21490a.a(bVar2);
                                    c.this.f21480t.a(c.this.f21458S, bVar2, AnonymousClass3.this.f21490a);
                                    ad.a("RewardMVVideoAdapter", "Campaign 下载成功： 大模板预加载失败 onVideoLoadFail");
                                }
                            }, false);
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.b.c
        public final void a(final CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, final com.mbridge.msdk.foundation.c.b bVar) {
            c.this.f21465e = false;
            if (c.this.f21480t == null || c.this.f21454O == null) {
                return;
            }
            c.this.f21454O.post(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.c.3.3
                @Override // java.lang.Runnable
                public final void run() {
                    c cVar = c.this;
                    c.a(cVar, cVar.f21472l, copyOnWriteArrayList, c.this.f21440A, "");
                    if (c.this.f21454O != null) {
                        c.this.f21454O.removeMessages(5);
                    }
                    if (!c.this.f21469i && c.this.f21480t != null) {
                        c.this.f21469i = true;
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        if (anonymousClass3.f21490a == null) {
                            anonymousClass3.f21490a = new com.mbridge.msdk.foundation.same.report.d.b();
                        }
                        AnonymousClass3 anonymousClass32 = AnonymousClass3.this;
                        anonymousClass32.f21490a.b(c.this.f21447H);
                        com.mbridge.msdk.foundation.c.b bVar2 = bVar;
                        if (bVar2 != null) {
                            bVar2.a("errorCode: 3201 errorMessage: campaign resource download failed");
                        }
                        AnonymousClass3.this.f21490a.a(bVar);
                        c.this.f21480t.a(copyOnWriteArrayList, bVar, AnonymousClass3.this.f21490a);
                        ad.a("RewardMVVideoAdapter", "Campaign 下载失败：onVideoLoadFail");
                    }
                }
            });
        }
    }

    static /* synthetic */ void b(c cVar, CampaignUnit campaignUnit) {
        cVar.f21446G = campaignUnit;
        CopyOnWriteArrayList<CampaignEx> a8 = cVar.a(campaignUnit);
        new com.mbridge.msdk.reward.a.a(cVar.f21472l, cVar.f21486z).a(a8, cVar.f21450K, cVar, cVar.f21472l);
        cVar.a(a8, true, false);
    }

    public final void a(int i8) {
        this.f21485y = i8;
    }

    public final String a() {
        return this.f21472l;
    }

    public final boolean a(CampaignEx campaignEx, boolean z8, com.mbridge.msdk.foundation.c.b bVar, int i8, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
        com.mbridge.msdk.foundation.b.c cVar;
        com.mbridge.msdk.foundation.b.c cVar2 = new com.mbridge.msdk.foundation.b.c();
        com.mbridge.msdk.reward.a.a aVar = new com.mbridge.msdk.reward.a.a(this.f21472l, this.f21486z);
        boolean z9 = false;
        if (aVar.a(this.f21450K)) {
            return false;
        }
        if (!this.f21470j) {
            this.f21470j = true;
            cVar2 = aVar.a(this.f21450K, bVar2, campaignEx, bVar, i8, this);
            if (cVar2 != null && cVar2.g() > com.mbridge.msdk.foundation.b.c.f19021a) {
                if (cVar2.a() != null && cVar2.a().size() > 0) {
                    a(cVar2.a(), true, true);
                } else if (cVar2.g() == com.mbridge.msdk.foundation.b.c.f19023c && bVar != null) {
                    bVar.b(com.mbridge.msdk.foundation.c.a.b(880038));
                    bVar.b(cVar2.b());
                }
            }
            cVar = cVar2;
            aVar.a(bVar2, this.f21450K, cVar, (List<a.C0395a>) null, (JSONObject) null, 3);
            return z9;
        }
        cVar2.d("isCandidate:false");
        cVar2.a(com.mbridge.msdk.foundation.b.c.f19023c);
        cVar = cVar2;
        z9 = true;
        aVar.a(bVar2, this.f21450K, cVar, (List<a.C0395a>) null, (JSONObject) null, 3);
        return z9;
    }

    public final void a(com.mbridge.msdk.videocommon.d.c cVar) {
        try {
            this.f21481u = cVar;
            if (cVar == null || cVar.D() * 1000 == com.mbridge.msdk.foundation.same.a.f19400K) {
                return;
            }
            com.mbridge.msdk.foundation.same.a.f19400K = this.f21481u.D() * 1000;
        } catch (Throwable th) {
            ad.a("RewardMVVideoAdapter", th.getMessage(), th);
        }
    }

    private boolean a(List<CampaignEx> list, boolean z8, int i8, boolean z9) {
        return a(list, z8, i8, false, z9);
    }

    public final boolean a(List<CampaignEx> list, boolean z8, int i8) {
        return a(list, z8, i8, false, false);
    }

    public final boolean a(List<CampaignEx> list, boolean z8) {
        if (list == null || list.size() <= 0) {
            ad.a("RewardVideoController", "数据为空");
        } else {
            CampaignEx campaignEx = list.get(0);
            if (campaignEx == null) {
                return false;
            }
            com.mbridge.msdk.videocommon.download.b bVar = com.mbridge.msdk.videocommon.download.b.getInstance();
            String str = this.f21472l;
            com.mbridge.msdk.videocommon.download.j c8 = bVar.c(str);
            if (c8 == null) {
                c8 = bVar.createUnitCache(com.mbridge.msdk.foundation.controller.c.m().c(), str, (CopyOnWriteArrayList<CampaignEx>) list, 94, (com.mbridge.msdk.videocommon.listener.a) null);
            }
            if (c8 != null ? c8.a(list, str) : false) {
                if (z8) {
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                        if (campaignEx.getRsIgnoreCheckRule().contains(3)) {
                            ad.c("RewardMVVideoAdapter", "Is not check big template download status");
                            return true;
                        }
                        if (campaignEx.getCMPTEntryUrl().equals(campaignEx.getendcard_url()) && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                            ad.c("RewardMVVideoAdapter", "Is not check big template ENDCARD download status");
                            return true;
                        }
                    }
                    if (ResDownloadCheckManager.getInstance().checkPreLoadState(this.f21472l + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl())) {
                        ad.a("RewardVideoController", "大模板业务，开始检查大模板预加载情况，大模板预加载成功");
                        return true;
                    }
                } else {
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
                        ad.c("RewardMVVideoAdapter", "Is not check template download status");
                        return true;
                    }
                    if (campaignEx.getRewardTemplateMode() == null || TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e())) {
                        ad.a("RewardVideoController", "非大模板 没有 template");
                        return true;
                    }
                    if (ResDownloadCheckManager.getInstance().checkPreLoadState(this.f21472l + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().e())) {
                        ad.a("RewardVideoController", "非大模板业务，存在播放模板，播放模板预加载成功");
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean a(List<CampaignEx> list, boolean z8, int i8, boolean z9, boolean z10) {
        com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            boolean a8 = com.mbridge.msdk.videocommon.download.b.getInstance().a(94, this.f21472l, this.f21440A, list.size(), z8, i8, list, z9, dVar);
            dVar.a("event_name", "is_ready_crwtpl_" + a8);
            if (z10) {
                a(bVar, dVar, list);
            }
            if (a8) {
                if (z8) {
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                        if (campaignEx.getRsIgnoreCheckRule().contains(3)) {
                            ad.c("RewardMVVideoAdapter", "Is not check big template download status");
                            return true;
                        }
                        if (campaignEx.getCMPTEntryUrl().equals(campaignEx.getendcard_url()) && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                            ad.c("RewardMVVideoAdapter", "Is not check big template of ENDCARD download status");
                            return true;
                        }
                    }
                    if (ResDownloadCheckManager.getInstance().checkPreLoadState(this.f21472l + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl())) {
                        return true;
                    }
                    if (z10) {
                        dVar.a("event_name", "is_ready_crwtpl_" + a8);
                        dVar.a("reason", "h5 big template checkPreLoadState error");
                        a(bVar, dVar, list);
                    }
                } else {
                    if (campaignEx != null && campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
                        ad.c("RewardMVVideoAdapter", "Is not check template download status");
                        return true;
                    }
                    if (campaignEx == null || campaignEx.getRewardTemplateMode() == null || TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e())) {
                        return true;
                    }
                    String str = this.f21472l + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().e();
                    if (z10) {
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(str, true);
                    }
                    if (ResDownloadCheckManager.getInstance().checkPreLoadState(str)) {
                        return true;
                    }
                    if (z10) {
                        dVar.a("event_name", "is_ready_crwtpl_" + a8);
                        dVar.a("reason", "h5 template checkPreLoadState error");
                        a(bVar, dVar, list);
                    }
                }
            }
        } else {
            dVar.a("event_name", "is_ready_crwtpl_empty");
            dVar.a("reason", "campaign list is empty error");
        }
        a(bVar, dVar, list);
        return false;
    }

    public final void a(h hVar, String str, String str2, int i8, String str3, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        try {
            this.f21479s = hVar;
            if (this.f21471k != null && !an.a(this.f21472l)) {
                Intent intent = new Intent(this.f21471k, (Class<?>) MBRewardVideoActivity.class);
                intent.putExtra(MBRewardVideoActivity.INTENT_UNITID, this.f21472l);
                intent.putExtra(MBridgeConstans.PLACEMENT_ID, this.f21473m);
                intent.putExtra(MBRewardVideoActivity.INTENT_REWARD, str);
                intent.putExtra(MBRewardVideoActivity.INTENT_MUTE, i8);
                intent.putExtra(MBRewardVideoActivity.INTENT_ISIV, this.f21486z);
                intent.putExtra(MBRewardVideoActivity.INTENT_ISBID, this.f21440A);
                intent.putExtra(MBRewardVideoActivity.INTENT_EXTRADATA, str3);
                CopyOnWriteArrayList<CampaignEx> a8 = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f21472l);
                boolean z8 = false;
                if (a8 != null && a8.size() > 0) {
                    CampaignEx campaignEx = a8.get(0);
                    if (campaignEx != null) {
                        this.f21463c = campaignEx.getRequestId();
                    }
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                        z8 = true;
                    }
                    g();
                } else {
                    h hVar2 = this.f21479s;
                    if (hVar2 != null) {
                        hVar2.a(bVar, "load failed");
                        return;
                    }
                }
                intent.putExtra(MBRewardVideoActivity.INTENT_ISBIG_OFFER, z8);
                if (this.f21486z) {
                    intent.putExtra(MBRewardVideoActivity.INTENT_IVREWARD_MODETYPE, this.f21443D);
                    intent.putExtra(MBRewardVideoActivity.INTENT_IVREWARD_VALUETYPE, this.f21444E);
                    intent.putExtra(MBRewardVideoActivity.INTENT_IVREWARD_VALUE, this.f21445F);
                }
                if (!TextUtils.isEmpty(str2)) {
                    intent.putExtra(MBRewardVideoActivity.INTENT_USERID, str2);
                }
                RewardUnitCacheManager.getInstance().add(this.f21473m, this.f21472l, this.f21481u);
                try {
                    if (com.mbridge.msdk.foundation.controller.c.m() != null && com.mbridge.msdk.foundation.controller.c.m().e() != null) {
                        ((Activity) com.mbridge.msdk.foundation.controller.c.m().e()).startActivity(intent);
                        return;
                    }
                } catch (Throwable th) {
                    ad.b("RewardMVVideoAdapter", th.getMessage());
                }
                intent.addFlags(268435456);
                this.f21471k.startActivity(intent);
                return;
            }
            h hVar3 = this.f21479s;
            if (hVar3 != null) {
                hVar3.a(bVar, "context or unitid is null");
            }
        } catch (Exception e8) {
            e8.printStackTrace();
            h hVar4 = this.f21479s;
            if (hVar4 != null) {
                hVar4.a(bVar, "show failed, exception is " + e8.getMessage());
            }
        }
    }

    public final void a(int i8, int i9, boolean z8, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        a(i8, i9, z8, "", this.f21448I, bVar);
    }

    public final void a(int i8, int i9, boolean z8, String str, boolean z9, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        CampaignEx campaignEx;
        this.f21475o = i8;
        this.f21476p = i9;
        this.f21477q = z8;
        this.f21450K = str;
        this.f21448I = z9;
        boolean z10 = false;
        this.f21470j = false;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f21447H;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0 && (campaignEx = this.f21447H.get(0)) != null && TextUtils.isEmpty(campaignEx.getNLRid())) {
            this.f21447H.clear();
        }
        List<CampaignEx> list = this.f21458S;
        if (list != null) {
            list.clear();
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.f21459T;
        if (copyOnWriteArrayList2 != null) {
            copyOnWriteArrayList2.clear();
        }
        this.f21465e = false;
        this.f21466f = false;
        synchronized (this.f21461a) {
            try {
                if (this.f21467g) {
                    this.f21467g = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f21469i = false;
        this.f21468h = false;
        try {
            z10 = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.a(this.f21471k);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardMVVideoAdapter", e8.getMessage());
            }
        }
        if (!z10) {
            com.mbridge.msdk.foundation.c.b b8 = com.mbridge.msdk.foundation.c.a.b(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is WebView is not available");
            if (bVar != null) {
                bVar.a(b8);
            }
            b("errorCode: 3507 errorMessage: data load failed, errorMsg is WebView is not available", bVar);
            return;
        }
        if (this.f21471k == null) {
            com.mbridge.msdk.foundation.c.b b9 = com.mbridge.msdk.foundation.c.a.b(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null");
            if (bVar != null) {
                bVar.a(b9);
            }
            b("errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null", bVar);
            return;
        }
        if (an.a(this.f21472l)) {
            com.mbridge.msdk.foundation.c.b b10 = com.mbridge.msdk.foundation.c.a.b(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null");
            if (bVar != null) {
                bVar.a(b10);
            }
            b("errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null", bVar);
            return;
        }
        if (this.f21481u == null) {
            com.mbridge.msdk.foundation.c.b b11 = com.mbridge.msdk.foundation.c.a.b(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is RewardUnitSetting is null");
            if (bVar != null) {
                bVar.a(b11);
            }
            b("RewardUnitSetting is null", bVar);
            return;
        }
        l();
        m();
        ad.c("RewardMVVideoAdapter", "load 开始清除过期数据");
        i();
        b(str, z9, bVar);
    }

    private void a(String str, boolean z8, final com.mbridge.msdk.foundation.same.report.d.b bVar) {
        boolean z9;
        try {
            if (this.f21471k == null) {
                com.mbridge.msdk.foundation.c.b b8 = com.mbridge.msdk.foundation.c.a.b(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null");
                if (bVar != null) {
                    bVar.a(b8);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null", bVar);
                return;
            }
            if (an.a(this.f21472l)) {
                com.mbridge.msdk.foundation.c.b b9 = com.mbridge.msdk.foundation.c.a.b(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null");
                if (bVar != null) {
                    bVar.a(b9);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null", bVar);
                return;
            }
            if (this.f21481u == null) {
                com.mbridge.msdk.foundation.c.b b10 = com.mbridge.msdk.foundation.c.a.b(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is RewardUnitSetting is null");
                if (bVar != null) {
                    bVar.a(b10);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is RewardUnitSetting is null", bVar);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                if (System.currentTimeMillis() - this.f21449J < this.f21481u.a() * 1000) {
                    com.mbridge.msdk.foundation.c.b b11 = com.mbridge.msdk.foundation.c.a.b(880018, "errorCode: 3507 errorMessage: data load failed, errorMsg is EXCEPTION_RETURN_EMPTY");
                    if (bVar != null) {
                        bVar.a(b11);
                        bVar.c(true);
                    }
                    b("errorCode: 3507 errorMessage: data load failed, errorMsg is EXCEPTION_RETURN_EMPTY", bVar);
                    return;
                }
            }
            String str2 = "";
            if (bVar != null) {
                str2 = bVar.f();
            }
            e a8 = new d(this.f21473m, this.f21472l, this.f21486z, this.f21481u, str2).a(this.f21477q, this.f21478r, this.f21474n, k(), "", this.f21442C, str, z8, this.f21443D);
            if (a8 == null) {
                com.mbridge.msdk.foundation.c.b b12 = com.mbridge.msdk.foundation.c.a.b(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is Load param is null");
                if (bVar != null) {
                    bVar.a(b12);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is Load param is null", bVar);
                return;
            }
            this.f21456Q = System.currentTimeMillis();
            com.mbridge.msdk.reward.d.b bVar2 = new com.mbridge.msdk.reward.d.b(this.f21471k);
            com.mbridge.msdk.reward.d.a aVar = new com.mbridge.msdk.reward.d.a() { // from class: com.mbridge.msdk.reward.adapter.c.2
                @Override // com.mbridge.msdk.reward.d.a
                public final void a(CampaignUnit campaignUnit) {
                    CampaignEx campaignEx;
                    try {
                        c.a(c.this, campaignUnit);
                        c.b(c.this, campaignUnit);
                        if (campaignUnit != null) {
                            c.this.f21462b = campaignUnit.getRequestId();
                        }
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            e8.printStackTrace();
                        }
                        if (c.this.f21447H != null && c.this.f21447H.size() > 0 && (campaignEx = (CampaignEx) c.this.f21447H.get(0)) != null && TextUtils.isEmpty(campaignEx.getNLRid())) {
                            c.this.f21447H.clear();
                        }
                        if (c.this.f21458S != null) {
                            c.this.f21458S.clear();
                        }
                        c.this.f21465e = false;
                        c.this.f21466f = false;
                        synchronized (c.this.f21461a) {
                            try {
                                if (c.this.f21467g) {
                                    c.this.f21467g = false;
                                }
                                c.this.f21469i = false;
                                c.this.f21468h = false;
                                c.this.b("exception after load success", bVar);
                                c.this.j();
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }

                @Override // com.mbridge.msdk.reward.d.a
                public final void a(int i8, String str3, com.mbridge.msdk.foundation.same.report.d.b bVar3) {
                    CampaignEx campaignEx;
                    if (i8 == -1) {
                        c.this.f21449J = System.currentTimeMillis();
                    }
                    if (c.this.f21447H != null && c.this.f21447H.size() > 0 && (campaignEx = (CampaignEx) c.this.f21447H.get(0)) != null && TextUtils.isEmpty(campaignEx.getNLRid())) {
                        c.this.f21447H.clear();
                    }
                    if (c.this.f21458S != null) {
                        c.this.f21458S.clear();
                    }
                    c.this.f21465e = false;
                    c.this.f21466f = false;
                    synchronized (c.this.f21461a) {
                        try {
                            if (c.this.f21467g) {
                                c.this.f21467g = false;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c.a(c.this, bVar3, i8);
                    c.this.f21469i = false;
                    c.this.f21468h = false;
                    if (!c.this.f21455P) {
                        c.this.a(i8, str3, bVar3);
                    }
                    c.this.j();
                }
            };
            aVar.a(str);
            aVar.setUnitId(this.f21472l);
            aVar.setPlacementId(this.f21473m);
            aVar.setAdType(this.f21486z ? 287 : 94);
            aVar.a(bVar);
            try {
                z9 = com.mbridge.msdk.videocommon.download.h.a().b(this.f21486z ? 287 : 94);
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardMVVideoAdapter", "isRewardVideoRefactorForCampaignRequest exception " + e8.getMessage());
                }
                z9 = false;
            }
            try {
                if (com.mbridge.msdk.foundation.same.net.g.c.a().a(a8) == null) {
                    com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar.a("hst", h());
                    bVar.a("2000125", dVar);
                    com.mbridge.msdk.reward.c.a.a.a().a("2000125", bVar);
                }
            } catch (Exception e9) {
                if (MBridgeConstans.DEBUG) {
                    e9.printStackTrace();
                }
            }
            if (z9) {
                bVar2.getCampaign(1, str, a8, new com.mbridge.msdk.foundation.same.net.b(com.mbridge.msdk.videocommon.download.h.a().a("r_v_c_r_t_c", com.mbridge.msdk.foundation.same.a.f19428p), com.mbridge.msdk.videocommon.download.h.a().a("r_v_c_r_t_r", com.mbridge.msdk.foundation.same.a.f19429q), com.mbridge.msdk.videocommon.download.h.a().a("r_v_c_r_t_w", com.mbridge.msdk.foundation.same.a.f19429q), this.f21476p * 1000, com.mbridge.msdk.videocommon.download.h.a().a("r_v_c_r_r_c", com.mbridge.msdk.foundation.same.a.f19430r), 4), aVar);
                return;
            }
            int i8 = com.mbridge.msdk.foundation.same.a.f19429q;
            int i9 = com.mbridge.msdk.foundation.same.a.f19431s;
            int i10 = com.mbridge.msdk.foundation.same.a.f19427o;
            int i11 = com.mbridge.msdk.foundation.same.a.f19430r;
            try {
                g a9 = com.mbridge.msdk.c.h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
                if (a9 != null) {
                    i8 = a9.c();
                    i9 = a9.e();
                    i10 = a9.b();
                    i11 = a9.d();
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardMVVideoAdapter", e10.getMessage());
                }
            }
            bVar2.choiceV3OrV5BySetting(1, a8, aVar, str, new com.mbridge.msdk.foundation.same.net.b(i10, i8, i9, this.f21476p * 1000, i11, 4));
        } catch (Exception e11) {
            e11.printStackTrace();
            b("Load exception", bVar);
            j();
        }
    }

    private void a(com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (this.f21454O != null) {
            Message obtain = Message.obtain();
            obtain.what = 3;
            if (bVar != null) {
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", bVar.f());
                obtain.setData(bundle);
            }
            this.f21454O.sendMessage(obtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i8, String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (this.f21454O != null) {
            if (TextUtils.isEmpty(str)) {
                str = "load fail exception";
            }
            Message obtain = Message.obtain();
            obtain.what = 4;
            obtain.obj = str;
            obtain.arg1 = i8;
            if (bVar != null) {
                bVar.c(true);
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", bVar.f());
                obtain.setData(bundle);
            }
            if (str.contains("exception")) {
                this.f21454O.sendMessageAtFrontOfQueue(obtain);
            } else {
                this.f21454O.sendMessage(obtain);
            }
        }
    }

    private void a(k kVar, CampaignEx campaignEx) {
        if (kVar == null || kVar.b(campaignEx.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
        gVar.a(campaignEx.getId());
        gVar.b(campaignEx.getFca());
        gVar.c(campaignEx.getFcb());
        gVar.a(0);
        gVar.d(0);
        gVar.a(System.currentTimeMillis());
        kVar.a(gVar);
    }

    private void a(String str, String str2, List<CampaignEx> list) {
        if (com.mbridge.msdk.videocommon.a.a.a() != null) {
            com.mbridge.msdk.videocommon.a.a.a().a(str, str2, list);
        }
    }

    public final void a(com.mbridge.msdk.reward.adapter.a aVar) {
        this.f21480t = aVar;
    }

    public final void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, boolean z8, boolean z9) {
        com.mbridge.msdk.foundation.same.report.d.b bVar;
        try {
            if (z9) {
                this.f21458S = copyOnWriteArrayList;
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
                this.f21459T = copyOnWriteArrayList2;
                bVar = c(copyOnWriteArrayList2);
            } else {
                bVar = this.f21446G.getMetricsData();
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardMVVideoAdapter", e8.getMessage());
            }
            bVar = null;
        }
        a(this.f21446G, copyOnWriteArrayList);
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            ad.c("RewardMVVideoAdapter", "onload load fail, callback campaign have not video");
            if (TextUtils.isEmpty(this.f21457R)) {
                this.f21457R = "APP ALREADY INSTALLED";
            }
            a(this.f21457R.contains("INSTALL") ? 880021 : 880003, this.f21457R, bVar);
            return;
        }
        ad.c("RewardMVVideoAdapter", "onload load success size:" + copyOnWriteArrayList.size());
        if (z8) {
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            if (z9) {
                dVar.a("cache", 1);
            } else {
                dVar.a("cache", 2);
            }
            if (bVar != null) {
                bVar.a("2000127", dVar);
                bVar.a("2000048", dVar);
            }
            a(bVar);
        }
        CampaignUnit campaignUnit = this.f21446G;
        if (campaignUnit != null) {
            b(campaignUnit.getSessionId());
        }
        b(copyOnWriteArrayList);
        if (copyOnWriteArrayList.size() > 0) {
            ad.c("RewardMVVideoAdapter", "#######onload 把广告存在本地 size:" + copyOnWriteArrayList.size());
            a(this.f21473m, this.f21472l, copyOnWriteArrayList);
        }
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        this.f21447H = copyOnWriteArrayList;
        a(campaignEx);
    }

    private void a(CampaignEx campaignEx) {
        boolean z8 = !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl());
        int nscpt = campaignEx.getNscpt();
        this.f21465e = false;
        this.f21466f = false;
        synchronized (this.f21461a) {
            try {
                if (this.f21467g) {
                    this.f21467g = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f21469i = false;
        this.f21468h = false;
        if (this.f21440A) {
            com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(campaignEx.getBidToken(), campaignEx.getCampaignUnitId(), campaignEx.getEncryptPrice());
        }
        b.m.a().a(this.f21471k, z8, nscpt, this.f21440A, this.f21486z ? 287 : 94, this.f21473m, this.f21472l, campaignEx.getRequestId(), this.f21447H, new AnonymousClass3(campaignEx, z8, nscpt), new AnonymousClass4(campaignEx, z8, nscpt));
        if (z8) {
            b.m.a().a(this.f21471k, campaignEx, this.f21473m, this.f21472l, campaignEx.getRequestId(), new AnonymousClass5(campaignEx, z8, nscpt));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:50:0x0004, B:52:0x000a, B:54:0x0013, B:56:0x0029, B:4:0x0034, B:6:0x003a, B:7:0x0048, B:9:0x004e, B:11:0x0057, B:13:0x005d, B:14:0x0064, B:16:0x006a, B:19:0x0072, B:25:0x0090, B:27:0x0096, B:28:0x009a, B:30:0x00a0, B:33:0x00a8, B:38:0x00b4), top: B:49:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:50:0x0004, B:52:0x000a, B:54:0x0013, B:56:0x0029, B:4:0x0034, B:6:0x003a, B:7:0x0048, B:9:0x004e, B:11:0x0057, B:13:0x005d, B:14:0x0064, B:16:0x006a, B:19:0x0072, B:25:0x0090, B:27:0x0096, B:28:0x009a, B:30:0x00a0, B:33:0x00a8, B:38:0x00b4), top: B:49:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003a A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:50:0x0004, B:52:0x000a, B:54:0x0013, B:56:0x0029, B:4:0x0034, B:6:0x003a, B:7:0x0048, B:9:0x004e, B:11:0x0057, B:13:0x005d, B:14:0x0064, B:16:0x006a, B:19:0x0072, B:25:0x0090, B:27:0x0096, B:28:0x009a, B:30:0x00a0, B:33:0x00a8, B:38:0x00b4), top: B:49:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:50:0x0004, B:52:0x000a, B:54:0x0013, B:56:0x0029, B:4:0x0034, B:6:0x003a, B:7:0x0048, B:9:0x004e, B:11:0x0057, B:13:0x005d, B:14:0x0064, B:16:0x006a, B:19:0x0072, B:25:0x0090, B:27:0x0096, B:28:0x009a, B:30:0x00a0, B:33:0x00a8, B:38:0x00b4), top: B:49:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.lang.String r11, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r12, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r13) {
        /*
            r10 = this;
            java.lang.String r0 = ""
            if (r12 == 0) goto L31
            int r1 = r12.size()     // Catch: java.lang.Exception -> L2e
            if (r1 <= 0) goto L31
            r1 = 0
            java.lang.Object r1 = r12.get(r1)     // Catch: java.lang.Exception -> L2e
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = (com.mbridge.msdk.foundation.entity.CampaignEx) r1     // Catch: java.lang.Exception -> L2e
            if (r1 == 0) goto L31
            java.lang.String r2 = r1.getRequestId()     // Catch: java.lang.Exception -> L2e
            int r3 = r1.getVcn()     // Catch: java.lang.Exception -> L2e
            java.lang.String r4 = r1.getBidToken()     // Catch: java.lang.Exception -> L2e
            java.lang.String r5 = r1.getNLRid()     // Catch: java.lang.Exception -> L2e
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L2e
            if (r5 == 0) goto L34
            java.lang.String r0 = r1.getLocalRequestId()     // Catch: java.lang.Exception -> L2e
            goto L34
        L2e:
            r11 = move-exception
            goto Lc7
        L31:
            r3 = 1
            r2 = r0
            r4 = r2
        L34:
            com.mbridge.msdk.videocommon.a.a r1 = com.mbridge.msdk.videocommon.a.a.a()     // Catch: java.lang.Exception -> L2e
            if (r1 == 0) goto L48
            com.mbridge.msdk.videocommon.a.a r1 = com.mbridge.msdk.videocommon.a.a.a()     // Catch: java.lang.Exception -> L2e
            r1.b(r11, r0)     // Catch: java.lang.Exception -> L2e
            com.mbridge.msdk.videocommon.a.a r0 = com.mbridge.msdk.videocommon.a.a.a()     // Catch: java.lang.Exception -> L2e
            r0.b(r11)     // Catch: java.lang.Exception -> L2e
        L48:
            com.mbridge.msdk.videocommon.a.a r0 = com.mbridge.msdk.videocommon.a.a.a()     // Catch: java.lang.Exception -> L2e
            if (r0 == 0) goto L55
            com.mbridge.msdk.videocommon.a.a r0 = com.mbridge.msdk.videocommon.a.a.a()     // Catch: java.lang.Exception -> L2e
            r0.b(r11, r3)     // Catch: java.lang.Exception -> L2e
        L55:
            if (r12 == 0) goto L8e
            int r0 = r12.size()     // Catch: java.lang.Exception -> L2e
            if (r0 <= 0) goto L8e
            com.mbridge.msdk.reward.b.a.a(r2, r4)     // Catch: java.lang.Exception -> L2e
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Exception -> L2e
        L64:
            boolean r0 = r12.hasNext()     // Catch: java.lang.Exception -> L2e
            if (r0 == 0) goto L8e
            java.lang.Object r0 = r12.next()     // Catch: java.lang.Exception -> L2e
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0     // Catch: java.lang.Exception -> L2e
            if (r0 == 0) goto L64
            java.lang.String r1 = r0.getCampaignUnitId()     // Catch: java.lang.Exception -> L2e
            java.lang.String r2 = r0.getRequestId()     // Catch: java.lang.Exception -> L2e
            java.lang.String r3 = r0.getId()     // Catch: java.lang.Exception -> L2e
            long r4 = r0.getPlct()     // Catch: java.lang.Exception -> L2e
            long r6 = r0.getPlctb()     // Catch: java.lang.Exception -> L2e
            long r8 = r0.getTimestamp()     // Catch: java.lang.Exception -> L2e
            com.mbridge.msdk.foundation.same.a.d.a(r1, r2, r3, r4, r6, r8)     // Catch: java.lang.Exception -> L2e
            goto L64
        L8e:
            if (r13 == 0) goto Lb4
            int r12 = r13.size()     // Catch: java.lang.Exception -> L2e
            if (r12 <= 0) goto Lb4
            java.util.Iterator r12 = r13.iterator()     // Catch: java.lang.Exception -> L2e
        L9a:
            boolean r13 = r12.hasNext()     // Catch: java.lang.Exception -> L2e
            if (r13 == 0) goto Lb4
            java.lang.Object r13 = r12.next()     // Catch: java.lang.Exception -> L2e
            com.mbridge.msdk.foundation.entity.CampaignEx r13 = (com.mbridge.msdk.foundation.entity.CampaignEx) r13     // Catch: java.lang.Exception -> L2e
            if (r13 == 0) goto L9a
            java.lang.String r0 = r13.getCampaignUnitId()     // Catch: java.lang.Exception -> L2e
            java.lang.String r13 = r13.getRequestId()     // Catch: java.lang.Exception -> L2e
            com.mbridge.msdk.foundation.same.a.d.c(r0, r13)     // Catch: java.lang.Exception -> L2e
            goto L9a
        Lb4:
            com.mbridge.msdk.foundation.same.a.d.c(r11)     // Catch: java.lang.Exception -> L2e
            com.mbridge.msdk.foundation.controller.c r11 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Exception -> L2e
            android.content.Context r11 = r11.c()     // Catch: java.lang.Exception -> L2e
            com.mbridge.msdk.foundation.db.b r11 = com.mbridge.msdk.foundation.db.b.a(r11)     // Catch: java.lang.Exception -> L2e
            r11.a()     // Catch: java.lang.Exception -> L2e
            goto Lce
        Lc7:
            boolean r12 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r12 == 0) goto Lce
            r11.printStackTrace()
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.c.a(java.lang.String, java.util.List, java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x01a8, code lost:
    
        if (com.mbridge.msdk.foundation.tools.an.a(r13.getVideoUrlEncode()) != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0204, code lost:
    
        if (com.mbridge.msdk.MBridgeConstans.DEBUG == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x021a, code lost:
    
        if (com.mbridge.msdk.MBridgeConstans.DEBUG == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0206, code lost:
    
        com.mbridge.msdk.foundation.tools.ad.b("RewardMVVideoAdapter", r13.getMessage());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> a(com.mbridge.msdk.foundation.entity.CampaignUnit r13) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.c.a(com.mbridge.msdk.foundation.entity.CampaignUnit):java.util.concurrent.CopyOnWriteArrayList");
    }

    private void a(final CampaignUnit campaignUnit, List<CampaignEx> list) {
        com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.c.7
            @Override // java.lang.Runnable
            public final void run() {
                k.a(com.mbridge.msdk.foundation.db.h.a(c.this.f21471k)).a();
                CampaignUnit campaignUnit2 = campaignUnit;
                if (campaignUnit2 != null && campaignUnit2.getAds() != null && campaignUnit.getAds().size() > 0) {
                    c.a(c.this, campaignUnit.getAds());
                }
            }
        });
    }

    public final void a(List<CampaignEx> list) {
        this.f21460U = list;
    }

    public final void a(int i8, int i9, int i10) {
        this.f21443D = i8;
        this.f21444E = i9;
        this.f21445F = i10;
    }

    public final void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (this.f21481u != null && TextUtils.isEmpty(str)) {
            int b8 = this.f21481u.b() * 1000;
            List<CampaignEx> list = this.f21460U;
            if (list != null && list.size() > 0) {
                if (System.currentTimeMillis() - this.f21460U.get(0).getTimestamp() < b8) {
                    b("hit ltorwc", bVar);
                    return;
                }
            }
        }
        a(str, this.f21448I, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.foundation.same.report.d.b a(Message message) {
        com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
        if (message == null) {
            return bVar;
        }
        try {
            Bundle data = message.getData();
            return data != null ? com.mbridge.msdk.foundation.same.report.d.c.a().b(data.getString("metrics_data_lrid")) : bVar;
        } catch (Exception e8) {
            if (!MBridgeConstans.DEBUG) {
                return bVar;
            }
            e8.printStackTrace();
            return bVar;
        }
    }

    private void a(com.mbridge.msdk.foundation.same.report.d.b bVar, com.mbridge.msdk.foundation.same.report.d.d dVar, List<CampaignEx> list) {
        if (bVar != null) {
            if (list != null) {
                try {
                    if (list.size() > 0) {
                        bVar.b(list);
                        CampaignEx campaignEx = list.get(0);
                        if (campaignEx != null) {
                            bVar.c(campaignEx.getLocalRequestId());
                        }
                    }
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        e8.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            bVar.d(this.f21472l);
            bVar.b(this.f21486z ? 287 : 94);
            if (dVar != null) {
                bVar.a("m_temp_is_ready_check", dVar);
            }
            com.mbridge.msdk.reward.c.a.a.a().a("m_temp_is_ready_check", bVar);
        }
    }

    static /* synthetic */ void a(c cVar, String str, List list, List list2, boolean z8) {
        f.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c())).a(str, (List<CampaignEx>) list, (List<CampaignEx>) list2, z8);
        if (list2 != null && list2.size() > 0) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                CampaignEx campaignEx = (CampaignEx) it.next();
                if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e())) {
                    com.mbridge.msdk.videocommon.a.b(str + "_" + campaignEx.getId() + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().e());
                    com.mbridge.msdk.videocommon.a.b(campaignEx.getAdType(), campaignEx);
                }
            }
        }
        if (z8) {
            cVar.a(str, (List<CampaignEx>) list, (List<CampaignEx>) list2);
        }
        if (list == null || list.size() <= 0) {
            return;
        }
        try {
            CampaignEx campaignEx2 = (CampaignEx) list.get(0);
            com.mbridge.msdk.reward.a.a aVar = new com.mbridge.msdk.reward.a.a(str, cVar.f21486z);
            if (campaignEx2 == null || !TextUtils.isEmpty(campaignEx2.getNLRid())) {
                return;
            }
            aVar.a(campaignEx2.getLocalRequestId(), campaignEx2.getRequestId(), 1, campaignEx2.getEcppv());
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    static /* synthetic */ void a(c cVar, String str, List list, boolean z8, String str2) {
        CampaignEx campaignEx;
        if (!TextUtils.isEmpty(str) && list != null && list.size() > 0 && ((campaignEx = (CampaignEx) list.get(0)) == null || TextUtils.isEmpty(campaignEx.getEcppv()) || TextUtils.isEmpty(str2))) {
            f.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c())).a(str, (List<CampaignEx>) list, z8);
        } else {
            f.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c())).a(str, (CampaignEx) null, z8, str2);
        }
    }

    static /* synthetic */ void a(c cVar, CampaignUnit campaignUnit) {
        if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.d.b metricsData = campaignUnit.getMetricsData();
            if (metricsData != null) {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("result", 1);
                dVar.a("timeout", Integer.valueOf(cVar.f21476p));
                dVar.a("hst", cVar.h());
                metricsData.b(campaignUnit.getAds());
                metricsData.a("2000126", dVar);
                campaignUnit.setLocalRequestId(metricsData.f());
                com.mbridge.msdk.reward.c.a.a.a().a("2000126", metricsData);
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardMVVideoAdapter", e8.getMessage());
            }
        }
    }

    static /* synthetic */ void a(c cVar, List list) {
        if (cVar.f21471k == null || list == null || list.size() == 0) {
            return;
        }
        k a8 = k.a(com.mbridge.msdk.foundation.db.h.a(cVar.f21471k));
        for (int i8 = 0; i8 < list.size(); i8++) {
            CampaignEx campaignEx = (CampaignEx) list.get(i8);
            if (campaignEx != null) {
                if (com.mbridge.msdk.f.b.a()) {
                    if (!ai.c(cVar.f21471k, campaignEx.getPackageName())) {
                        cVar.a(a8, campaignEx);
                    }
                } else {
                    cVar.a(a8, campaignEx);
                }
            }
        }
    }
}
