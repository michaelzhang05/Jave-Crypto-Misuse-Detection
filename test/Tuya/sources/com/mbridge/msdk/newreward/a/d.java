package com.mbridge.msdk.newreward.a;

import android.os.SystemClock;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.newreward.function.common.MBridgeDailyPlayModel;
import com.mbridge.msdk.newreward.function.common.MBridgeSharedPreferenceModel;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;

/* loaded from: classes4.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private Deque<e> f20804a;

    /* renamed from: c, reason: collision with root package name */
    private RewardVideoListener f20806c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.f.e f20807d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.c.c f20808e;

    /* renamed from: f, reason: collision with root package name */
    private MBridgeIds f20809f;

    /* renamed from: g, reason: collision with root package name */
    private Map f20810g;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.newreward.b.b f20811h;

    /* renamed from: b, reason: collision with root package name */
    private final Object f20805b = new Object();

    /* renamed from: i, reason: collision with root package name */
    private int f20812i = 1;

    /* renamed from: j, reason: collision with root package name */
    private int f20813j = 1;

    public d() {
        if (this.f20804a == null) {
            this.f20804a = new ConcurrentLinkedDeque();
        }
    }

    @Override // com.mbridge.msdk.newreward.a.c
    public final boolean d() {
        Iterator<e> it = this.f20804a.iterator();
        while (it.hasNext()) {
            if (it.next().x().c()) {
                return true;
            }
        }
        return false;
    }

    public final void b(Object obj) {
        for (com.mbridge.msdk.newreward.function.d.a.b bVar : (List) obj) {
            e eVar = new e(false, ((Integer) this.f20810g.get("mb_ad_type")).intValue(), bVar.f(), bVar.c(), bVar.g());
            com.mbridge.msdk.newreward.function.f.a aVar = new com.mbridge.msdk.newreward.function.f.a();
            aVar.a(bVar);
            eVar.a(aVar);
            eVar.a(this.f20807d);
            eVar.b(2);
            eVar.f20829a = new f(this.f20808e);
            eVar.a(this.f20806c);
            this.f20804a.add(eVar);
        }
    }

    @Override // com.mbridge.msdk.newreward.a.c
    public final void c() {
        e peek;
        synchronized (this.f20805b) {
            try {
                if (this.f20804a.size() == 0) {
                    this.f20811h.a(com.mbridge.msdk.newreward.function.h.b.a(""));
                    this.f20808e.a(this.f20811h, com.mbridge.msdk.newreward.function.c.e.REPORT_SHOW_START, (Object) null);
                    this.f20806c.onShowFail(this.f20809f, "no adapter_model");
                    a("no adapter_model");
                    return;
                }
                while (a(2) > this.f20812i) {
                    this.f20804a.pollFirst();
                }
                ConcurrentLinkedDeque concurrentLinkedDeque = new ConcurrentLinkedDeque();
                while (true) {
                    if (this.f20804a.size() == 0) {
                        break;
                    }
                    try {
                        peek = this.f20804a.peek();
                    } catch (Exception e8) {
                        if (this.f20804a.size() == 1) {
                            this.f20811h.a(com.mbridge.msdk.newreward.function.h.b.a(""));
                            this.f20806c.onShowFail(this.f20809f, e8.getMessage());
                            a(e8.getMessage());
                            break;
                        }
                    }
                    if (peek.x().c()) {
                        b(peek);
                        peek.f20829a.b(peek);
                        this.f20811h.a(peek);
                        this.f20804a.poll();
                        break;
                    }
                    if (peek.s() == 2 && !peek.x().c()) {
                        if (this.f20804a.size() == 1) {
                            this.f20811h.a(peek);
                            this.f20806c.onShowFail(this.f20809f, "no isReadyCampaign");
                            a("no isReadyCampaign");
                        }
                        this.f20804a.poll();
                    } else {
                        if (this.f20804a.size() == 1) {
                            this.f20811h.a(peek);
                            this.f20806c.onShowFail(this.f20809f, "all campaign is loading");
                            a("all campaign is loading");
                        }
                        concurrentLinkedDeque.push(this.f20804a.poll());
                    }
                }
                while (concurrentLinkedDeque.size() != 0) {
                    this.f20804a.push((e) concurrentLinkedDeque.poll());
                }
                com.mbridge.msdk.newreward.b.b bVar = this.f20811h;
                if (bVar != null) {
                    if (bVar.a() != null) {
                        this.f20808e.a(this.f20811h.a(), com.mbridge.msdk.newreward.function.c.e.REPORT_SHOW_START, (Object) null);
                    } else {
                        this.f20808e.a(this.f20811h, com.mbridge.msdk.newreward.function.c.e.REPORT_SHOW_START, (Object) null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.a.c
    public final void a(Object obj) {
        this.f20806c = (RewardVideoListener) obj;
    }

    @Override // com.mbridge.msdk.newreward.a.c
    public final void a(Object... objArr) {
        com.mbridge.msdk.newreward.function.c.c cVar = (com.mbridge.msdk.newreward.function.c.c) objArr[0];
        this.f20808e = cVar;
        com.mbridge.msdk.newreward.b.b bVar = (com.mbridge.msdk.newreward.b.b) objArr[1];
        this.f20811h = bVar;
        final Map a8 = cVar.a("mb_ad_type", Integer.valueOf(bVar.e()), "mb_ad_is_header_bidding", Boolean.valueOf(this.f20811h.f()), "mb_ad_pid", this.f20811h.d(), "mb_ad_unit_id", this.f20811h.c());
        this.f20809f = (MBridgeIds) this.f20808e.a(a8, com.mbridge.msdk.newreward.function.c.e.CREATE_BIDS);
        com.mbridge.msdk.newreward.function.c.c cVar2 = this.f20808e;
        cVar2.c(cVar2.a("mb_ad_unit_id", this.f20811h.c(), "command_type", com.mbridge.msdk.newreward.function.c.e.UNIT_INIT), new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.a.d.1
            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(com.mbridge.msdk.foundation.c.b bVar2) {
            }

            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(Object obj) {
            }
        });
        com.mbridge.msdk.newreward.function.e.c.a().b().a(this.f20811h.e(), this.f20811h.d(), this.f20811h.c());
        this.f20808e.a((Object) a8, com.mbridge.msdk.newreward.function.c.e.REQ_SETTING, new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.a.d.2
            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(com.mbridge.msdk.foundation.c.b bVar2) {
            }

            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(Object obj) {
                d.this.f20807d = (com.mbridge.msdk.newreward.function.f.e) obj;
                d.this.f20810g = a8;
                if (d.this.f20811h != null) {
                    d.this.f20811h.a(d.this.f20807d);
                }
                ((MBridgeDailyPlayModel) d.this.f20808e.a(a8, com.mbridge.msdk.newreward.function.c.e.CREATE_DAILY)).setMaxPlayCount(d.this.f20807d.b() == null ? 0 : d.this.f20807d.b().d());
            }
        });
        Map map = this.f20810g;
        map.put("command_type", com.mbridge.msdk.newreward.function.c.e.RESTORE_DB);
        this.f20808e.c(map, new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.a.d.3
            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(com.mbridge.msdk.foundation.c.b bVar2) {
            }

            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(Object obj) {
                d.this.b(obj);
            }
        });
        com.mbridge.msdk.newreward.function.c.c cVar3 = this.f20808e;
        cVar3.e(cVar3.a("controller_model", this.f20811h, "command_manager", cVar3, "adapter_manager", this));
        int a9 = af.a().a(MBridgeCommon.SharedPreference.KEY_LOADING_CAPACITY, 1);
        this.f20813j = a9;
        if (a9 <= 0) {
            this.f20813j = 1;
        }
    }

    private void b(e eVar) {
        e eVar2;
        if (eVar == null || TextUtils.isEmpty(eVar.b())) {
            return;
        }
        try {
            Deque<e> deque = this.f20804a;
            if (deque != null) {
                Iterator<e> it = deque.iterator();
                while (it.hasNext()) {
                    eVar2 = it.next();
                    if (eVar2 != null && eVar2.a() && (eVar2.x() == null || !eVar2.x().c())) {
                        if (eVar.b().equals(eVar2.z())) {
                            break;
                        }
                    }
                }
            }
            eVar2 = null;
            if (eVar2 != null) {
                com.mbridge.msdk.newreward.function.c.c cVar = this.f20808e;
                cVar.c(cVar.a("adapter_model", eVar, "queue_first_adapter_model", eVar2), com.mbridge.msdk.newreward.function.c.e.UPDATE_CAM_TOKEN_RULE);
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.a.c
    public final void a(e eVar, b bVar) {
        e peek;
        if (eVar == null || bVar == null) {
            return;
        }
        eVar.a(this.f20807d);
        eVar.a(this.f20806c);
        com.mbridge.msdk.newreward.function.c.c cVar = this.f20808e;
        if (cVar != null) {
            cVar.a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_START, (Object) null);
        }
        int integer = MBridgeSharedPreferenceModel.getInstance().getInteger(String.format(MBridgeCommon.SharedPreference.KEY_VCN, this.f20811h.c()), 1);
        this.f20812i = integer;
        if (integer <= 0) {
            this.f20812i = 1;
        }
        if (a(1) < this.f20813j) {
            try {
                synchronized (this.f20805b) {
                    try {
                        if (c(eVar)) {
                            return;
                        }
                        if (d() && !eVar.l()) {
                            if (!TextUtils.isEmpty(eVar.C()) && com.mbridge.msdk.newreward.function.h.a.c(eVar.C())) {
                                com.mbridge.msdk.newreward.function.c.c cVar2 = this.f20808e;
                                if (((Boolean) cVar2.b(cVar2.a("adapter_model", eVar, "command_manager", cVar2, "candidate_type", 1, "reason", new com.mbridge.msdk.foundation.c.b(880038)))).booleanValue()) {
                                    eVar.g(true);
                                    com.mbridge.msdk.newreward.function.c.c cVar3 = this.f20808e;
                                    com.mbridge.msdk.newreward.function.a.b bVar2 = (com.mbridge.msdk.newreward.function.a.b) cVar3.b(cVar3.a("adapter_model", eVar, "command_manager", cVar3, "candidate_type", 2, "reason", new com.mbridge.msdk.foundation.c.b(880038)));
                                    if (bVar2 != null && bVar2.h() == com.mbridge.msdk.newreward.function.a.b.f20890d) {
                                        eVar.x().a(bVar2.a());
                                        a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_CAMPAIGN_SUCCESS);
                                        this.f20806c.onLoadSuccess(this.f20809f);
                                        eVar.c(true);
                                        a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_VIDEO_CAMPAIGN_SUCCESS);
                                        this.f20806c.onVideoLoadSuccess(this.f20809f);
                                        eVar.d(true);
                                        break;
                                    }
                                }
                            }
                            int integer2 = MBridgeSharedPreferenceModel.getInstance().getInteger(String.format(MBridgeCommon.SharedPreference.KEY_VCN, eVar.A()), 1);
                            if (this.f20804a.size() != 0 && this.f20804a.size() >= integer2) {
                                if (TextUtils.isEmpty(eVar.C()) && (peek = this.f20804a.peek()) != null && peek.x() != null && peek.x().b() != null) {
                                    eVar.x().a(peek.x().b());
                                } else {
                                    for (e eVar2 : this.f20804a) {
                                        com.mbridge.msdk.newreward.function.d.a.b b8 = eVar2.x().b();
                                        if (b8 != null && b8.E() == 1) {
                                            eVar2.a(eVar.z());
                                            eVar.a(true);
                                        }
                                    }
                                }
                                a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_CAMPAIGN_SUCCESS);
                                this.f20806c.onLoadSuccess(this.f20809f);
                                eVar.c(true);
                                a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_VIDEO_CAMPAIGN_SUCCESS);
                                this.f20806c.onVideoLoadSuccess(this.f20809f);
                                eVar.d(true);
                                break;
                            }
                        }
                        for (e eVar3 : this.f20804a) {
                            if (!eVar3.x().c() && eVar3.s() == 2) {
                                this.f20804a.remove(eVar3);
                                com.mbridge.msdk.foundation.same.report.d.c.a().c(eVar3.z());
                            }
                        }
                        try {
                            List<String> e8 = com.mbridge.msdk.newreward.function.e.c.a().b().e(eVar.p(), eVar.w(), eVar.A());
                            if (e8 != null && e8.size() > 0) {
                                Iterator<String> it = e8.iterator();
                                while (it.hasNext()) {
                                    com.mbridge.msdk.foundation.same.report.d.c.a().c(it.next());
                                }
                            }
                        } catch (Exception e9) {
                            if (MBridgeConstans.DEBUG) {
                                e9.printStackTrace();
                            }
                        }
                        while (a(2) > this.f20812i) {
                            this.f20804a.pollFirst();
                        }
                        this.f20804a.add(eVar);
                        eVar.f20829a = bVar;
                        eVar.a(SystemClock.elapsedRealtime());
                        bVar.a(eVar);
                        return;
                    } finally {
                    }
                }
            } catch (Exception e10) {
                this.f20806c.onVideoLoadFail(new MBridgeIds(), e10.getMessage());
                a(eVar, com.mbridge.msdk.foundation.c.a.b(880020, "errorCode: 3501 errorMessage: " + e10.getMessage()));
                com.mbridge.msdk.newreward.function.e.c.a().b().a(eVar.p(), eVar.w(), eVar.A(), eVar.z(), MBridgeCommon.CampaignState.STATE_LOAD_FAILED_EXCEPTION);
                return;
            }
        }
        this.f20806c.onVideoLoadFail(new MBridgeIds(), "current unit is loading");
        a(eVar, com.mbridge.msdk.foundation.c.a.b(880016, "errorCode: 3501 errorMessage: current unit is loading"));
    }

    @Override // com.mbridge.msdk.newreward.a.c
    public final e b() {
        e peek;
        Deque<e> deque = this.f20804a;
        if (deque == null || deque.size() == 0 || (peek = this.f20804a.peek()) == null) {
            return null;
        }
        return peek;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0062 A[Catch: Exception -> 0x0037, TRY_LEAVE, TryCatch #1 {Exception -> 0x0037, blocks: (B:3:0x0006, B:5:0x000a, B:7:0x0010, B:9:0x0022, B:11:0x002a, B:12:0x003d, B:14:0x0062), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac A[Catch: Exception -> 0x008f, TRY_LEAVE, TryCatch #0 {Exception -> 0x008f, blocks: (B:17:0x0068, B:19:0x0084, B:23:0x009b, B:25:0x00ac), top: B:16:0x0068 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean c(com.mbridge.msdk.newreward.a.e r10) {
        /*
            r9 = this;
            r0 = 1
            r1 = 0
            java.lang.String r2 = "error_code"
            java.lang.String r3 = "msg"
            java.util.Deque<com.mbridge.msdk.newreward.a.e> r4 = r9.f20804a     // Catch: java.lang.Exception -> L37
            if (r4 == 0) goto L3b
            java.lang.Object r4 = r4.peek()     // Catch: java.lang.Exception -> L37
            if (r4 == 0) goto L3b
            java.util.Deque<com.mbridge.msdk.newreward.a.e> r4 = r9.f20804a     // Catch: java.lang.Exception -> L37
            java.lang.Object r4 = r4.peek()     // Catch: java.lang.Exception -> L37
            com.mbridge.msdk.newreward.a.e r4 = (com.mbridge.msdk.newreward.a.e) r4     // Catch: java.lang.Exception -> L37
            java.lang.String r4 = r4.q()     // Catch: java.lang.Exception -> L37
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L37
            if (r5 != 0) goto L3b
            java.lang.String r5 = "-1"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Exception -> L37
            if (r4 == 0) goto L3b
            java.util.Deque<com.mbridge.msdk.newreward.a.e> r4 = r9.f20804a     // Catch: java.lang.Exception -> L37
            java.lang.Object r4 = r4.peek()     // Catch: java.lang.Exception -> L37
            com.mbridge.msdk.newreward.a.e r4 = (com.mbridge.msdk.newreward.a.e) r4     // Catch: java.lang.Exception -> L37
            long r4 = r4.o()     // Catch: java.lang.Exception -> L37
            goto L3d
        L37:
            r10 = move-exception
            r0 = 0
            goto Lb8
        L3b:
            r4 = 0
        L3d:
            com.mbridge.msdk.newreward.function.c.c r6 = r9.f20808e     // Catch: java.lang.Exception -> L37
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Exception -> L37
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L37
            java.lang.String r7 = "adapter_model"
            r5[r1] = r7     // Catch: java.lang.Exception -> L37
            r5[r0] = r10     // Catch: java.lang.Exception -> L37
            java.lang.String r7 = "last_response_empty_time"
            r8 = 2
            r5[r8] = r7     // Catch: java.lang.Exception -> L37
            r7 = 3
            r5[r7] = r4     // Catch: java.lang.Exception -> L37
            java.util.Map r4 = r6.a(r5)     // Catch: java.lang.Exception -> L37
            com.mbridge.msdk.newreward.function.c.e r5 = com.mbridge.msdk.newreward.function.c.e.CHECK_IS_REQUEST_CONTROL     // Catch: java.lang.Exception -> L37
            java.lang.Object r4 = r6.b(r4, r5)     // Catch: java.lang.Exception -> L37
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Exception -> L37
            if (r4 == 0) goto La9
            int r5 = r4.size()     // Catch: java.lang.Exception -> L37
            if (r5 <= 0) goto La9
            com.mbridge.msdk.newout.RewardVideoListener r5 = r9.f20806c     // Catch: java.lang.Exception -> L8f
            com.mbridge.msdk.out.MBridgeIds r6 = new com.mbridge.msdk.out.MBridgeIds     // Catch: java.lang.Exception -> L8f
            r6.<init>()     // Catch: java.lang.Exception -> L8f
            java.lang.Object r7 = r4.get(r3)     // Catch: java.lang.Exception -> L8f
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L8f
            r5.onVideoLoadFail(r6, r7)     // Catch: java.lang.Exception -> L8f
            java.lang.Object r5 = r4.get(r2)     // Catch: java.lang.Exception -> L8f
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch: java.lang.Exception -> L8f
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L8f
            if (r5 != 0) goto L91
            java.lang.Object r1 = r4.get(r2)     // Catch: java.lang.Exception -> L8f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L8f
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L8f
            goto L91
        L8f:
            r10 = move-exception
            goto Lb8
        L91:
            r2 = -1
            if (r1 != r2) goto L98
            r2 = 880018(0xd6d92, float:1.233168E-39)
            goto L9b
        L98:
            r2 = 880002(0xd6d82, float:1.233145E-39)
        L9b:
            java.lang.Object r3 = r4.get(r3)     // Catch: java.lang.Exception -> L8f
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L8f
            com.mbridge.msdk.foundation.c.b r1 = com.mbridge.msdk.foundation.c.a.a(r1, r2, r3)     // Catch: java.lang.Exception -> L8f
            r9.a(r10, r1)     // Catch: java.lang.Exception -> L8f
            goto Laa
        La9:
            r0 = 0
        Laa:
            if (r0 == 0) goto Lbf
            com.mbridge.msdk.foundation.same.report.d.c r1 = com.mbridge.msdk.foundation.same.report.d.c.a()     // Catch: java.lang.Exception -> L8f
            java.lang.String r10 = r10.z()     // Catch: java.lang.Exception -> L8f
            r1.c(r10)     // Catch: java.lang.Exception -> L8f
            goto Lbf
        Lb8:
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r1 == 0) goto Lbf
            r10.printStackTrace()
        Lbf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.a.d.c(com.mbridge.msdk.newreward.a.e):boolean");
    }

    private void a(e eVar, com.mbridge.msdk.newreward.function.c.e eVar2) {
        if (eVar == null) {
            return;
        }
        List<CampaignEx> a8 = eVar.x() != null ? eVar.x().a() : null;
        try {
            com.mbridge.msdk.newreward.function.c.c cVar = this.f20808e;
            cVar.a(eVar, eVar2, cVar.a("metrics_data", a8, "auto_load", Integer.valueOf(eVar.B() ? 2 : 1), "cache", 1));
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    private void a(e eVar, com.mbridge.msdk.foundation.c.b bVar) {
        eVar.b(2);
        eVar.d(true);
        com.mbridge.msdk.newreward.function.c.c cVar = this.f20808e;
        cVar.a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_FAILED, cVar.a("metrics_data", bVar));
    }

    private int a(int i8) {
        int i9 = 0;
        if (this.f20804a.size() == 0) {
            return 0;
        }
        for (e eVar : this.f20804a) {
            if (i8 != 1) {
                if (i8 == 2 && eVar.x().c()) {
                    i9++;
                }
            } else if (eVar.s() == 1) {
                i9++;
            }
        }
        return i9;
    }

    private void a(String str) {
        com.mbridge.msdk.newreward.b.b bVar = this.f20811h;
        if (bVar == null) {
            return;
        }
        com.mbridge.msdk.newreward.function.c.c cVar = this.f20808e;
        cVar.a(bVar, com.mbridge.msdk.newreward.function.c.e.REPORT_SHOW_FAIL, cVar.a("reason", str));
    }

    @Override // com.mbridge.msdk.newreward.a.c
    public final List<e> a() {
        ArrayList arrayList = new ArrayList();
        Deque<e> deque = this.f20804a;
        if (deque != null && deque.size() != 0) {
            Iterator<e> it = this.f20804a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList;
    }

    public final void a(e eVar) {
        Deque<e> deque;
        if (eVar == null || (deque = this.f20804a) == null) {
            return;
        }
        deque.addLast(eVar);
    }
}
