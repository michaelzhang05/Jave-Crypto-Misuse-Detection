package com.mbridge.msdk.newreward.function.f;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.db.k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.g;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.newreward.function.common.MBridgeSharedPreferenceModel;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.d.a.b f22262a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.newreward.a.e f22263b;

    private boolean a(com.mbridge.msdk.newreward.function.d.a.a aVar) {
        CampaignEx g8;
        if (aVar != null && (g8 = aVar.g()) != null) {
            try {
                if (g8.getPlayable_ads_without_video() == 2) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public final com.mbridge.msdk.newreward.function.d.a.b b() {
        return this.f22262a;
    }

    public final boolean c() {
        com.mbridge.msdk.newreward.function.d.a.b bVar = this.f22262a;
        return bVar != null && bVar.y();
    }

    public final void b(com.mbridge.msdk.newreward.function.d.a.b bVar) throws MBridgeError {
        boolean z8;
        if (bVar != null && bVar.s() != null) {
            for (com.mbridge.msdk.newreward.function.d.a.a aVar : bVar.s()) {
                CampaignEx g8 = aVar.g();
                if (g8 != null && g8.getOfferType() != 99) {
                    if (a(aVar)) {
                        z8 = (an.a(g8.getendcard_url()) && TextUtils.isEmpty(g8.getMraid())) ? false : true;
                        if (aVar.f() == null && aVar.e() == null) {
                            throw new MBridgeError(880003, "playable offer endcard or mraid is null");
                        }
                    } else {
                        z8 = !an.a(g8.getVideoUrlEncode());
                        if (aVar.d() == null) {
                            throw new MBridgeError(880003, "No video campaign");
                        }
                    }
                    if (z8) {
                        Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
                        if (com.mbridge.msdk.f.b.a() && ai.c(g8)) {
                            g8.setRtinsType(ai.c(c8, g8.getPackageName()) ? 1 : 2);
                        }
                        try {
                            com.mbridge.msdk.foundation.same.report.d.b b8 = com.mbridge.msdk.foundation.same.report.d.c.a().b(g8.getLocalRequestId());
                            if (b8 == null) {
                                b8 = new com.mbridge.msdk.foundation.same.report.d.b();
                                b8.c(g8.getLocalRequestId());
                                b8.b(g8.getAdType());
                                b8.d(g8.getCampaignUnitId());
                                b8.i(g8.isBidCampaign() ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
                            }
                            b8.a(g8);
                            com.mbridge.msdk.newreward.a.e eVar = this.f22263b;
                            if (eVar != null && eVar.r() != null) {
                                com.mbridge.msdk.videocommon.d.a a8 = this.f22263b.r().a();
                                if (a8 != null) {
                                    b8.h(a8.b());
                                    b8.f(a8.c());
                                }
                                com.mbridge.msdk.videocommon.d.c b9 = this.f22263b.r().b();
                                if (b9 != null) {
                                    b8.g(b9.l());
                                    b8.n(b9.k());
                                }
                            }
                            com.mbridge.msdk.foundation.same.c.a(g8, com.mbridge.msdk.foundation.controller.c.m().c(), b8, new c.a() { // from class: com.mbridge.msdk.newreward.function.f.a.1
                                @Override // com.mbridge.msdk.foundation.same.c.a
                                public final void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
                                    com.mbridge.msdk.foundation.same.report.d.c.a().a(str, bVar2);
                                }
                            });
                        } catch (Exception e8) {
                            if (MBridgeConstans.DEBUG) {
                                e8.printStackTrace();
                            }
                        }
                        if (!com.mbridge.msdk.foundation.same.c.a(c8, g8)) {
                            ai.a(bVar.c(), g8, com.mbridge.msdk.foundation.same.a.f20491x);
                            throw new MBridgeError(880021, "APP ALREADY INSTALLED");
                        }
                    } else {
                        continue;
                    }
                }
            }
            return;
        }
        throw new MBridgeError(880003, "Need show campaign list is NULL!");
    }

    public final void c(com.mbridge.msdk.newreward.function.d.a.b bVar) {
        if (bVar == null || bVar.s() == null) {
            return;
        }
        Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
        k a8 = k.a(h.a(c8));
        Iterator<com.mbridge.msdk.newreward.function.d.a.a> it = bVar.s().iterator();
        while (it.hasNext()) {
            CampaignEx g8 = it.next().g();
            if (g8 != null) {
                if (com.mbridge.msdk.f.b.a()) {
                    if (!ai.c(c8, g8.getPackageName())) {
                        a(a8, g8);
                    }
                } else {
                    a(a8, g8);
                }
            }
        }
    }

    public final List<CampaignEx> a() {
        com.mbridge.msdk.newreward.function.d.a.b bVar = this.f22262a;
        if (bVar == null) {
            return null;
        }
        return bVar.C();
    }

    public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar) {
        this.f22262a = bVar;
    }

    public final void a(com.mbridge.msdk.newreward.a.e eVar, com.mbridge.msdk.newreward.function.g.a aVar, com.mbridge.msdk.newreward.a.b.b bVar) {
        this.f22263b = eVar;
        try {
            new com.mbridge.msdk.newreward.a.b.c(eVar).a(aVar, new C0414a(eVar, this, bVar));
        } catch (IOException e8) {
            if (bVar != null) {
                bVar.a(new com.mbridge.msdk.foundation.c.b(880020, e8.getMessage()));
            }
        }
    }

    private void a(k kVar, CampaignEx campaignEx) {
        if (kVar == null || kVar.b(campaignEx.getId())) {
            return;
        }
        g gVar = new g();
        gVar.a(campaignEx.getId());
        gVar.b(campaignEx.getFca());
        gVar.c(campaignEx.getFcb());
        gVar.a(0);
        gVar.d(0);
        gVar.a(System.currentTimeMillis());
        kVar.a(gVar);
    }

    /* renamed from: com.mbridge.msdk.newreward.function.f.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0414a implements com.mbridge.msdk.newreward.a.b.b {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.newreward.a.e f22265a;

        /* renamed from: b, reason: collision with root package name */
        private a f22266b;

        /* renamed from: c, reason: collision with root package name */
        private com.mbridge.msdk.newreward.a.b.b f22267c;

        public C0414a(com.mbridge.msdk.newreward.a.e eVar, a aVar, com.mbridge.msdk.newreward.a.b.b bVar) {
            this.f22265a = eVar;
            this.f22266b = aVar;
            this.f22267c = bVar;
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(Object obj) {
            try {
                com.mbridge.msdk.newreward.function.d.a.b bVar = (com.mbridge.msdk.newreward.function.d.a.b) obj;
                bVar.b(this.f22265a.z());
                int J8 = (int) (this.f22265a.J() * 1.2d);
                bVar.d(J8);
                bVar.e(J8);
                bVar.b(Math.max(this.f22265a.L(), bVar.n()));
                this.f22266b.a(bVar);
                if (!TextUtils.isEmpty(bVar.i())) {
                    MBridgeGlobalCommon.SESSION_ID = bVar.i();
                }
                MBridgeSharedPreferenceModel.getInstance().putInteger(String.format(MBridgeCommon.SharedPreference.KEY_VCN, bVar.c()), bVar.D());
                com.mbridge.msdk.newreward.function.e.c.a().b().a(bVar);
                com.mbridge.msdk.newreward.a.b.b bVar2 = this.f22267c;
                if (bVar2 == null) {
                    return;
                }
                bVar2.a(obj);
            } catch (Exception e8) {
                ad.a("CampaignModel", "reqSuccessful: ", e8);
                com.mbridge.msdk.newreward.a.b.b bVar3 = this.f22267c;
                if (bVar3 != null) {
                    bVar3.a(new com.mbridge.msdk.foundation.c.b(880020, e8.getMessage()));
                }
            }
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(com.mbridge.msdk.foundation.c.b bVar) {
            com.mbridge.msdk.newreward.a.b.b bVar2 = this.f22267c;
            if (bVar2 == null) {
                return;
            }
            try {
                bVar2.a(bVar);
            } catch (Exception e8) {
                ad.a("CampaignModel", "reqFailed: ", e8);
            }
        }
    }
}
