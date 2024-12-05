package com.mbridge.msdk.newreward.function.c.b.a;

import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.newreward.a.c.a;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.newreward.function.common.MBridgeOffsetManager;
import com.mbridge.msdk.newreward.function.d.c.n;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class d implements a.InterfaceC0409a, com.mbridge.msdk.newreward.function.c.b.a {

    /* renamed from: a, reason: collision with root package name */
    com.mbridge.msdk.newreward.function.c.a.a f21965a;

    /* renamed from: b, reason: collision with root package name */
    com.mbridge.msdk.newreward.a.b.b f21966b;

    /* renamed from: c, reason: collision with root package name */
    com.mbridge.msdk.newreward.function.c.c f21967c;

    /* renamed from: d, reason: collision with root package name */
    com.mbridge.msdk.newreward.a.e f21968d;

    /* renamed from: e, reason: collision with root package name */
    com.mbridge.msdk.newreward.function.c.b.b.c f21969e;

    /* renamed from: i, reason: collision with root package name */
    private Map f21973i;

    /* renamed from: f, reason: collision with root package name */
    private String f21970f = UUID.randomUUID().toString();

    /* renamed from: g, reason: collision with root package name */
    private String f21971g = UUID.randomUUID().toString();

    /* renamed from: h, reason: collision with root package name */
    private long f21972h = WorkRequest.MIN_BACKOFF_MILLIS;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f21974j = false;

    /* loaded from: classes4.dex */
    private class b implements com.mbridge.msdk.newreward.a.b.b {
        private b() {
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(Object obj) {
            com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f21970f);
            d dVar = d.this;
            dVar.f21966b.a(dVar.f21967c.a("type", 2, "object", obj));
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(com.mbridge.msdk.foundation.c.b bVar) {
            d dVar = d.this;
            com.mbridge.msdk.newreward.function.c.b.b.e eVar = new com.mbridge.msdk.newreward.function.c.b.b.e(bVar, dVar.f21968d, dVar.f21967c, 2);
            com.mbridge.msdk.newreward.function.c.b.b.c cVar = d.this.f21969e;
            if (cVar == null || !cVar.a(eVar)) {
                com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f21970f);
                com.mbridge.msdk.newreward.function.e.c.a().b().a(d.this.f21968d.p(), d.this.f21968d.w(), d.this.f21968d.A(), d.this.f21968d.z(), MBridgeCommon.CampaignState.STATE_LOAD_FAILED_RESOURCE_DOWNLOAD_ERROR);
                d.this.f21966b.a(bVar);
                return;
            }
            d.this.f21969e.a(eVar, this);
        }
    }

    private int b() {
        com.mbridge.msdk.newreward.function.f.e r8;
        com.mbridge.msdk.videocommon.d.c b8;
        try {
            com.mbridge.msdk.newreward.a.e eVar = this.f21968d;
            return (eVar == null || (r8 = eVar.r()) == null || (b8 = r8.b()) == null) ? MBridgeCommon.DEFAULT_LOAD_TIMEOUT : b8.F() * 1000;
        } catch (Exception unused) {
            return MBridgeCommon.DEFAULT_LOAD_TIMEOUT;
        }
    }

    public final void a(com.mbridge.msdk.newreward.function.c.a.a aVar) {
        this.f21965a = aVar;
        this.f21969e = new com.mbridge.msdk.newreward.function.c.b.b.c(aVar);
    }

    @Override // com.mbridge.msdk.newreward.function.c.b.a
    public final void a(com.mbridge.msdk.newreward.function.c.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
        try {
            this.f21966b = bVar2;
            int b8 = b();
            com.mbridge.msdk.newreward.a.c.a.a().a(this.f21970f, b8, this);
            bVar.a(com.mbridge.msdk.newreward.function.c.e.REQ_CAMPAIGN);
            Map map = (Map) bVar.b();
            this.f21973i = map;
            this.f21967c = (com.mbridge.msdk.newreward.function.c.c) map.get("command_manager");
            com.mbridge.msdk.newreward.a.e eVar = (com.mbridge.msdk.newreward.a.e) this.f21973i.get("adapter_model");
            this.f21968d = eVar;
            eVar.f(b8);
            com.mbridge.msdk.newreward.function.c.c cVar = this.f21967c;
            com.mbridge.msdk.newreward.a.e eVar2 = this.f21968d;
            cVar.a(eVar2, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_START, cVar.a("auto_load", Integer.valueOf(eVar2.B() ? 2 : 1), "hst", com.mbridge.msdk.foundation.same.net.g.d.f().a(this.f21968d.C())));
            this.f21965a.a(bVar, new a(bVar, this.f21973i));
            long a8 = af.a().a(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_RETRY_STRATEGY, MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_RETRY_STRATEGY_CAMPAIGN_RETRY_TIMEOUT, 0);
            this.f21972h = a8;
            if (a8 > 0) {
                com.mbridge.msdk.newreward.a.c.a.a().a(this.f21971g, this.f21972h, this);
            }
            com.mbridge.msdk.newreward.function.e.c.a().b().a(this.f21968d.p(), this.f21968d.w(), this.f21968d.A(), this.f21968d.z(), !TextUtils.isEmpty(this.f21968d.C()), this.f21968d.C(), this.f21968d.L());
        } catch (Exception e8) {
            ad.a("LoadControllerReceiver", "action", e8);
            if (this.f21968d != null) {
                com.mbridge.msdk.newreward.function.e.c.a().b().a(this.f21968d.p(), this.f21968d.w(), this.f21968d.A(), this.f21968d.z(), 8);
            }
            com.mbridge.msdk.newreward.a.c.a.a().a(this.f21971g);
            com.mbridge.msdk.newreward.a.c.a.a().a(this.f21970f);
            if (bVar2 != null) {
                bVar2.a(new com.mbridge.msdk.foundation.c.b(880020, e8.getMessage()));
            }
        }
    }

    /* loaded from: classes4.dex */
    private final class a implements com.mbridge.msdk.newreward.a.b.b {

        /* renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.function.c.b f21976b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f21977c;

        public a(com.mbridge.msdk.newreward.function.c.b bVar, Map map) {
            this.f21976b = bVar;
            this.f21977c = map;
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(Object obj) {
            com.mbridge.msdk.foundation.c.b a8;
            com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f21971g);
            if (d.this.f21974j) {
                return;
            }
            d.this.f21974j = true;
            com.mbridge.msdk.newreward.function.d.a.b bVar = (com.mbridge.msdk.newreward.function.d.a.b) obj;
            d dVar = d.this;
            com.mbridge.msdk.newreward.function.c.c cVar = dVar.f21967c;
            com.mbridge.msdk.newreward.a.e eVar = dVar.f21968d;
            cVar.a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_RES_SUCCESS, cVar.a("metrics_data", bVar, "auto_load", Integer.valueOf(eVar.B() ? 2 : 1), "result", 1, "cache", 2, "timeout", Integer.valueOf(d.this.f21968d.I()), "hst", bVar != null ? bVar.H() : ""));
            d dVar2 = d.this;
            dVar2.f21966b.a(dVar2.f21967c.a("type", 1, "object", bVar));
            ((MBridgeOffsetManager) d.this.f21967c.a((Object) null, com.mbridge.msdk.newreward.function.c.e.CREATE_OFFSET)).increaseOffset(bVar.s().size());
            d dVar3 = d.this;
            com.mbridge.msdk.newreward.function.c.c cVar2 = dVar3.f21967c;
            cVar2.d(cVar2.a("adapter_model", dVar3.f21968d, "campaign", bVar));
            try {
                d dVar4 = d.this;
                com.mbridge.msdk.newreward.function.c.c cVar3 = dVar4.f21967c;
                cVar3.c(cVar3.a("adapter_model", dVar4.f21968d, "campaign", bVar));
                this.f21976b.a(com.mbridge.msdk.newreward.function.c.e.REQ_DOWN_CAMPAIGN);
                this.f21977c.put("campaign", bVar);
                this.f21976b.a(this.f21977c);
                d dVar5 = d.this;
                dVar5.f21965a.a(this.f21976b, new b());
            } catch (MBridgeError e8) {
                com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f21970f);
                com.mbridge.msdk.newreward.function.e.c.a().b().a(bVar.a(), bVar.b(), bVar.c(), bVar.e(), 403);
                if (e8.getErrorMessage().contains("APP ALREADY INSTALLED")) {
                    a8 = com.mbridge.msdk.foundation.c.a.a(e8.getErrorCode(), 880021, "errorCode: 3507 errorMessage: data load failed, errorMsg is " + e8.getErrorMessage());
                } else {
                    a8 = com.mbridge.msdk.foundation.c.a.a(e8.getErrorCode(), 880003, "errorCode: 3507 errorMessage: data load failed, errorMsg is " + e8.getErrorMessage());
                }
                d.this.f21966b.a(a8);
            }
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(com.mbridge.msdk.foundation.c.b bVar) {
            d dVar = d.this;
            com.mbridge.msdk.newreward.function.c.b.b.e eVar = new com.mbridge.msdk.newreward.function.c.b.b.e(bVar, dVar.f21968d, dVar.f21967c, 1);
            if (!d.this.f21969e.a(eVar)) {
                com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f21971g);
                com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f21970f);
                if (d.this.f21974j) {
                    return;
                }
                d.this.f21974j = true;
                try {
                    d dVar2 = d.this;
                    com.mbridge.msdk.newreward.function.c.c cVar = dVar2.f21967c;
                    com.mbridge.msdk.newreward.a.e eVar2 = dVar2.f21968d;
                    cVar.a(eVar2, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_RES_FAIL, cVar.a("auto_load", Integer.valueOf(eVar2.B() ? 2 : 1), "result", Integer.valueOf(bVar.m() ? 1 : 2), "code", Integer.valueOf(bVar.i()), "reason", bVar.b(), "timeout", Integer.valueOf(d.this.f21968d.I()), "hst", bVar.j(), "err_desc", bVar.l()));
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                ((MBridgeOffsetManager) d.this.f21967c.a((Object) null, com.mbridge.msdk.newreward.function.c.e.CREATE_OFFSET)).resetOffset();
                if (bVar != null) {
                    try {
                        if (bVar.a("campaign_request_error_type") != null) {
                            com.mbridge.msdk.newreward.function.e.c.a().b().a(d.this.f21968d.p(), d.this.f21968d.w(), d.this.f21968d.A(), d.this.f21968d.z(), ((Integer) bVar.a("campaign_request_error_type")).intValue());
                        }
                    } catch (Exception unused) {
                    }
                }
                d.this.f21966b.a(bVar);
                return;
            }
            d.this.f21969e.a(eVar, this);
        }
    }

    @Override // com.mbridge.msdk.newreward.a.c.a.InterfaceC0409a
    public final void a(String str, long j8) {
        if (TextUtils.equals(str, this.f21970f)) {
            com.mbridge.msdk.newreward.function.e.c.a().b().a(this.f21968d.p(), this.f21968d.w(), this.f21968d.A(), this.f21968d.z(), MBridgeCommon.CampaignState.STATE_LOAD_FAILED_TIMEOUT);
            String a8 = a();
            this.f21966b.a(new com.mbridge.msdk.foundation.c.b(880010, "errorCode: 3401 errorMessage: " + a8));
            return;
        }
        if (!TextUtils.equals(str, this.f21971g) || this.f21969e == null) {
            return;
        }
        com.mbridge.msdk.newreward.function.c.b.b.e eVar = new com.mbridge.msdk.newreward.function.c.b.b.e(null, this.f21968d, this.f21967c, 3);
        com.mbridge.msdk.newreward.function.c.b bVar = new com.mbridge.msdk.newreward.function.c.b();
        bVar.a(com.mbridge.msdk.newreward.function.c.e.REQ_CAMPAIGN);
        com.mbridge.msdk.newreward.function.c.c cVar = this.f21967c;
        bVar.a(cVar.a("adapter_model", this.f21968d, "command_manager", cVar));
        this.f21969e.a(eVar, new a(bVar, this.f21973i));
    }

    private String a() {
        StringBuilder sb = new StringBuilder();
        try {
            com.mbridge.msdk.newreward.a.e eVar = this.f21968d;
            if (eVar != null && eVar.x() != null) {
                com.mbridge.msdk.newreward.function.d.a.b b8 = this.f21968d.x().b();
                if (b8 != null && b8.s() != null && b8.s().size() > 0) {
                    for (com.mbridge.msdk.newreward.function.d.a.a aVar : b8.s()) {
                        if (aVar != null) {
                            n d8 = aVar.d();
                            if (d8 != null && !d8.c()) {
                                sb.append(" video timeout ");
                            }
                            com.mbridge.msdk.newreward.function.d.c.d<?> c8 = aVar.c();
                            if (c8 != null && !c8.c()) {
                                sb.append(" video_template timeout ");
                            }
                            com.mbridge.msdk.newreward.function.d.c.d<?> f8 = aVar.f();
                            if (f8 != null && !f8.c()) {
                                sb.append(" ec_template timeout ");
                            }
                        }
                    }
                } else {
                    sb.append(" load timeout ");
                }
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
        return sb.toString();
    }
}
