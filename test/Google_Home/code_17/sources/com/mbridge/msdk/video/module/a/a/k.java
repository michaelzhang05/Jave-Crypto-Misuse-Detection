package com.mbridge.msdk.video.module.a.a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.foundation.tools.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class k extends f {

    /* renamed from: a, reason: collision with root package name */
    protected boolean f23596a;

    /* renamed from: b, reason: collision with root package name */
    protected CampaignEx f23597b;

    /* renamed from: c, reason: collision with root package name */
    protected List<CampaignEx> f23598c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f23599d;

    /* renamed from: e, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.download.a f23600e;

    /* renamed from: f, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.b.c f23601f;

    /* renamed from: g, reason: collision with root package name */
    protected String f23602g;

    /* renamed from: h, reason: collision with root package name */
    protected String f23603h;

    /* renamed from: i, reason: collision with root package name */
    protected com.mbridge.msdk.video.module.a.a f23604i;

    /* renamed from: j, reason: collision with root package name */
    protected int f23605j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f23606k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f23607l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f23608m = false;

    public k(CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar, com.mbridge.msdk.videocommon.b.c cVar, String str, String str2, com.mbridge.msdk.video.module.a.a aVar2, int i8, boolean z8) {
        this.f23599d = false;
        this.f23604i = new f();
        this.f23605j = 1;
        if (!z8 && campaignEx != null && an.b(str2) && aVar != null && aVar2 != null) {
            this.f23597b = campaignEx;
            this.f23603h = str;
            this.f23602g = str2;
            this.f23600e = aVar;
            this.f23601f = cVar;
            this.f23604i = aVar2;
            this.f23596a = true;
            this.f23605j = i8;
            this.f23599d = false;
            return;
        }
        if (z8 && campaignEx != null && an.b(str2) && aVar2 != null) {
            this.f23597b = campaignEx;
            this.f23603h = str;
            this.f23602g = str2;
            this.f23600e = aVar;
            this.f23601f = cVar;
            this.f23604i = aVar2;
            this.f23596a = true;
            this.f23605j = i8;
            this.f23599d = true;
        }
    }

    public final void a(CampaignEx campaignEx) {
        this.f23597b = campaignEx;
    }

    public final void b(int i8) {
        CampaignEx campaignEx = this.f23597b;
        if (campaignEx != null) {
            String noticeUrl = campaignEx.getNoticeUrl();
            if (TextUtils.isEmpty(noticeUrl)) {
                return;
            }
            if (i8 == 1 || i8 == 2) {
                if (!noticeUrl.contains("endscreen_type")) {
                    StringBuilder sb = new StringBuilder(noticeUrl);
                    if (noticeUrl.contains("?")) {
                        sb.append("&endscreen_type=");
                        sb.append(i8);
                    } else {
                        sb.append("?endscreen_type=");
                        sb.append(i8);
                    }
                    noticeUrl = sb.toString();
                } else if (i8 == 2) {
                    if (noticeUrl.contains("endscreen_type=1")) {
                        noticeUrl = noticeUrl.replace("endscreen_type=1", "endscreen_type=2");
                    }
                } else if (noticeUrl.contains("endscreen_type=2")) {
                    noticeUrl = noticeUrl.replace("endscreen_type=2", "endscreen_type=1");
                }
                this.f23597b.setNoticeUrl(noticeUrl);
            }
        }
    }

    public final void c() {
        try {
            Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.video.module.a.a.k.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        k kVar = k.this;
                        if (kVar.f23596a && kVar.f23597b != null && an.b(kVar.f23602g)) {
                            com.mbridge.msdk.videocommon.a.a a8 = com.mbridge.msdk.videocommon.a.a.a();
                            k kVar2 = k.this;
                            a8.a(kVar2.f23597b, kVar2.f23602g);
                        }
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            e8.printStackTrace();
                        }
                    }
                    try {
                        com.mbridge.msdk.videocommon.a.a a9 = com.mbridge.msdk.videocommon.a.a.a();
                        k kVar3 = k.this;
                        a9.c(kVar3.f23603h, kVar3.f23597b.getAdType());
                    } catch (Exception e9) {
                        if (MBridgeConstans.DEBUG) {
                            e9.printStackTrace();
                        }
                    } catch (Throwable th) {
                        ad.a("NotifyListener", th.getMessage());
                    }
                }
            };
            com.mbridge.msdk.foundation.controller.d.a();
            com.mbridge.msdk.foundation.same.f.b.b().execute(runnable);
        } catch (Throwable th) {
            ad.a("NotifyListener", th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d() {
        com.mbridge.msdk.videocommon.download.a aVar = this.f23600e;
        if (aVar != null) {
            aVar.f(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e() {
        CampaignEx campaignEx;
        Map<String, Long> map;
        String str;
        try {
            CampaignEx campaignEx2 = this.f23597b;
            if (campaignEx2 != null && campaignEx2.isDynamicView() && this.f23599d && !this.f23597b.isCampaignIsFiltered()) {
                this.f23607l = true;
                return;
            }
            if (this.f23596a && (campaignEx = this.f23597b) != null && !TextUtils.isEmpty(campaignEx.getOnlyImpressionURL()) && (map = com.mbridge.msdk.foundation.same.a.d.f20510k) != null && !map.containsKey(this.f23597b.getOnlyImpressionURL()) && !this.f23607l) {
                com.mbridge.msdk.foundation.same.a.d.f20510k.put(this.f23597b.getOnlyImpressionURL(), Long.valueOf(System.currentTimeMillis()));
                String onlyImpressionURL = this.f23597b.getOnlyImpressionURL();
                if (this.f23597b.getSpareOfferFlag() == 1) {
                    str = onlyImpressionURL + "&to=1&cbt=" + this.f23597b.getCbt() + "&tmorl=" + this.f23605j;
                } else {
                    str = onlyImpressionURL + "&to=0&cbt=" + this.f23597b.getCbt() + "&tmorl=" + this.f23605j;
                }
                String str2 = str;
                if (!this.f23599d || this.f23597b.isCampaignIsFiltered()) {
                    com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f23597b, this.f23602g, str2, false, true, com.mbridge.msdk.click.a.a.f19128h);
                    c();
                }
                this.f23607l = true;
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f() {
        String str;
        try {
            if (this.f23596a && !this.f23606k && !TextUtils.isEmpty(this.f23597b.getImpressionURL())) {
                this.f23606k = true;
                if (this.f23597b.isBidCampaign() && this.f23597b != null) {
                    try {
                        HashMap hashMap = new HashMap();
                        List<com.mbridge.msdk.foundation.entity.d> a8 = com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(this.f23597b.getCampaignUnitId(), this.f23597b.getRequestId());
                        if (a8 != null && a8.size() > 0 && a8.get(0) != null) {
                            if (a8.get(0).c() == 1) {
                                hashMap.put("encrypt_p=", "encrypt_p=" + a8.get(0).b());
                                hashMap.put("irlfa=", "irlfa=1");
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    String str2 = (String) entry.getKey();
                                    String str3 = (String) entry.getValue();
                                    CampaignEx campaignEx = this.f23597b;
                                    campaignEx.setImpressionURL(campaignEx.getImpressionURL().replaceAll(str2, str3));
                                    CampaignEx campaignEx2 = this.f23597b;
                                    campaignEx2.setOnlyImpressionURL(campaignEx2.getOnlyImpressionURL().replaceAll(str2, str3));
                                }
                            }
                            ad.a("BidReplaceCampignDao", "removeReplace count " + com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(this.f23597b.getRequestId()));
                        }
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                }
                String impressionURL = this.f23597b.getImpressionURL();
                if (this.f23597b.getSpareOfferFlag() == 1) {
                    str = impressionURL + "&to=1&cbt=" + this.f23597b.getCbt() + "&tmorl=" + this.f23605j;
                } else {
                    str = impressionURL + "&to=0&cbt=" + this.f23597b.getCbt() + "&tmorl=" + this.f23605j;
                }
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f23597b, this.f23602g, str, false, true, com.mbridge.msdk.click.a.a.f19127g);
                com.mbridge.msdk.video.module.b.b.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f23597b);
                new Thread(new Runnable() { // from class: com.mbridge.msdk.video.module.a.a.k.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            com.mbridge.msdk.foundation.db.k.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c())).a(k.this.f23597b.getId());
                        } catch (Throwable th) {
                            ad.a("NotifyListener", th.getMessage(), th);
                        }
                    }
                }).start();
                if (this.f23596a && com.mbridge.msdk.foundation.same.a.d.f20509j != null && !TextUtils.isEmpty(this.f23597b.getId())) {
                    com.mbridge.msdk.foundation.same.a.d.a(this.f23602g, this.f23597b, "reward");
                }
            }
        } catch (Throwable th) {
            ad.a("NotifyListener", th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g() {
        CampaignEx campaignEx;
        List<String> pv_urls;
        try {
            if (this.f23596a && !this.f23608m && (campaignEx = this.f23597b) != null) {
                this.f23608m = true;
                if ((!campaignEx.isDynamicView() || !this.f23599d || this.f23597b.isCampaignIsFiltered()) && (pv_urls = this.f23597b.getPv_urls()) != null && pv_urls.size() > 0) {
                    Iterator<String> it = pv_urls.iterator();
                    while (it.hasNext()) {
                        com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f23597b, this.f23602g, it.next(), false, true);
                    }
                }
            }
        } catch (Throwable th) {
            ad.b("NotifyListener", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h() {
        CampaignEx campaignEx = this.f23597b;
        if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getCampaignUnitId()) && this.f23597b.getNativeVideoTracking() != null && this.f23597b.getNativeVideoTracking().o() != null) {
            Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
            CampaignEx campaignEx2 = this.f23597b;
            com.mbridge.msdk.click.a.a(c8, campaignEx2, campaignEx2.getCampaignUnitId(), this.f23597b.getNativeVideoTracking().o(), false, false);
        }
    }

    public final void a(List<CampaignEx> list) {
        this.f23598c = list;
    }

    @Override // com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public void a(int i8, Object obj) {
        super.a(i8, obj);
        this.f23604i.a(i8, obj);
    }

    public final void a(int i8) {
        if (this.f23597b != null) {
            if (i8 == 1 || i8 == 2) {
                com.mbridge.msdk.video.module.b.b.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f23597b, i8, this.f23605j);
            }
        }
    }

    public final void a() {
        if (!this.f23596a || this.f23597b == null) {
            return;
        }
        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000061", this.f23597b.getId(), this.f23597b.getRequestId(), this.f23597b.getRequestIdNotice(), this.f23602g, z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
        nVar.d(this.f23597b.isMraid() ? com.mbridge.msdk.foundation.entity.n.f20403a : com.mbridge.msdk.foundation.entity.n.f20404b);
        com.mbridge.msdk.foundation.same.report.h.b(nVar, com.mbridge.msdk.foundation.controller.c.m().c(), this.f23602g);
    }

    public final void a(int i8, String str) {
        if (this.f23597b != null) {
            com.mbridge.msdk.foundation.same.report.h.c(new com.mbridge.msdk.foundation.entity.n("2000062", this.f23597b.getId(), this.f23597b.getRequestId(), this.f23597b.getRequestIdNotice(), this.f23602g, z.l(com.mbridge.msdk.foundation.controller.c.m().c()), i8, str), com.mbridge.msdk.foundation.controller.c.m().c(), this.f23602g);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(String str) {
        try {
            if (this.f23597b != null) {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("url", this.f23597b.getVideoUrlEncode());
                dVar.a("reason", str);
                String noticeUrl = this.f23597b.getNoticeUrl();
                String clickURL = this.f23597b.getClickURL();
                if (TextUtils.isEmpty(noticeUrl)) {
                    if (!TextUtils.isEmpty(clickURL)) {
                        dVar.a("offer_url", clickURL);
                    }
                } else {
                    dVar.a("offer_url", noticeUrl);
                }
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000021", this.f23597b, dVar);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void b() {
        Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.video.module.a.a.k.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    k kVar = k.this;
                    if (kVar.f23596a && kVar.f23597b != null && an.b(kVar.f23602g) && com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                        com.mbridge.msdk.foundation.db.j a8 = com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                        com.mbridge.msdk.foundation.entity.f fVar = new com.mbridge.msdk.foundation.entity.f();
                        fVar.a(System.currentTimeMillis());
                        fVar.b(k.this.f23602g);
                        fVar.a(k.this.f23597b.getId());
                        a8.a(fVar);
                    }
                } catch (Throwable th) {
                    ad.a("NotifyListener", th.getMessage(), th);
                }
            }
        };
        com.mbridge.msdk.foundation.controller.d.a();
        com.mbridge.msdk.foundation.same.f.b.b().execute(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(String str) {
        List<CampaignEx> list;
        if (this.f23597b == null || (list = this.f23598c) == null || list.size() == 0 || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("camp_position")) {
                this.f23597b = this.f23598c.get(jSONObject.getInt("camp_position"));
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("NotifyListener", e8.getMessage());
            }
        }
    }
}
