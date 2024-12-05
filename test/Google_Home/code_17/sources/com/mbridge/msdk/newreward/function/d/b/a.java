package com.mbridge.msdk.newreward.function.d.b;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.work.WorkRequest;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.e.a.m;
import com.mbridge.msdk.e.a.o;
import com.mbridge.msdk.e.a.p;
import com.mbridge.msdk.e.a.r;
import com.mbridge.msdk.e.a.u;
import com.mbridge.msdk.e.a.v;
import com.mbridge.msdk.e.a.y;
import com.mbridge.msdk.e.a.z;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.a.c.a;
import com.mbridge.msdk.newreward.function.common.VolleyErrorUtils;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a extends p<JSONObject> implements r.a {

    /* renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.newreward.function.d.a.b f22124a;

    /* renamed from: b, reason: collision with root package name */
    protected Context f22125b;

    /* renamed from: c, reason: collision with root package name */
    protected int f22126c;

    /* renamed from: d, reason: collision with root package name */
    protected String f22127d;

    /* renamed from: e, reason: collision with root package name */
    protected String f22128e;

    /* renamed from: f, reason: collision with root package name */
    protected String f22129f;

    /* renamed from: g, reason: collision with root package name */
    private Map<String, String> f22130g;

    /* renamed from: h, reason: collision with root package name */
    private c f22131h;

    /* renamed from: i, reason: collision with root package name */
    private v f22132i;

    /* renamed from: j, reason: collision with root package name */
    private long f22133j;

    /* renamed from: k, reason: collision with root package name */
    private long f22134k;

    /* renamed from: l, reason: collision with root package name */
    private String f22135l;

    /* renamed from: m, reason: collision with root package name */
    private String f22136m;

    /* renamed from: n, reason: collision with root package name */
    private String f22137n;

    /* renamed from: o, reason: collision with root package name */
    private String f22138o;

    /* renamed from: p, reason: collision with root package name */
    private Map<String, String> f22139p;

    /* renamed from: com.mbridge.msdk.newreward.function.d.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0413a implements a.InterfaceC0409a {

        /* renamed from: a, reason: collision with root package name */
        private final a f22140a;

        /* renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.function.d.a.b f22141b;

        public C0413a(a aVar, com.mbridge.msdk.newreward.function.d.a.b bVar) {
            this.f22140a = aVar;
            this.f22141b = bVar;
        }

        @Override // com.mbridge.msdk.newreward.a.c.a.InterfaceC0409a
        public final void a(String str, long j8) {
            ad.a("BaseCampaignRequest", "onTimeout taskID = " + str + ", timeout = " + j8);
            f.a();
            a aVar = this.f22140a;
            if (aVar != null && !aVar.m()) {
                aVar.c();
            }
            a.a(this.f22140a, this.f22141b, j8);
        }
    }

    public a(int i8, String str, String str2, String str3, long j8, String str4) {
        super(0, str4);
        this.f22125b = com.mbridge.msdk.foundation.controller.c.m().c();
        this.f22126c = i8;
        this.f22127d = str;
        this.f22128e = str2;
        this.f22129f = str3;
        this.f22135l = UUID.randomUUID().toString();
        this.f22133j = SystemClock.elapsedRealtime();
        this.f22138o = str4;
        this.f22124a = new com.mbridge.msdk.newreward.function.d.a.b(this.f22126c, this.f22127d, this.f22128e, this.f22129f);
        a((r.a) this);
        c(true);
        b(true);
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f22135l, j8 <= 0 ? WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS : j8, new C0413a(this, this.f22124a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.e.a.p
    public final /* synthetic */ void a(JSONObject jSONObject) {
        c cVar;
        JSONObject jSONObject2 = jSONObject;
        if (MBridgeConstans.DEBUG) {
            ad.a("BaseCampaignRequest", "deliverResponse: " + jSONObject2);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f22135l);
        int optInt = jSONObject2.optInt(NotificationCompat.CATEGORY_STATUS);
        if (optInt == 1) {
            JSONObject optJSONObject = jSONObject2.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject != null) {
                CampaignUnit parseCampaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(optJSONObject, this.f22136m);
                this.f22124a.a(optJSONObject);
                this.f22124a.f(optJSONObject.optString("c"));
                this.f22124a.e(optJSONObject.optString(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B));
                this.f22124a.d(optJSONObject.optString("a"));
                this.f22124a.b(optJSONObject.optInt("template"));
                this.f22124a.a(System.currentTimeMillis());
                this.f22124a.c(this.f22136m);
                this.f22124a.g(optJSONObject.optString(com.mbridge.msdk.foundation.same.a.f20463S));
                this.f22124a.a(1);
                this.f22124a.c(0);
                this.f22124a.a(parseCampaignUnit.getRequestId());
                this.f22124a.a(parseCampaignUnit.getEcppv());
                this.f22124a.i(this.f22138o);
                ArrayList arrayList = new ArrayList();
                ArrayList<CampaignEx> ads = parseCampaignUnit.getAds();
                for (CampaignEx campaignEx : ads) {
                    campaignEx.setRequestId(this.f22124a.d());
                    campaignEx.setLocalRequestId(this.f22137n);
                    com.mbridge.msdk.newreward.function.d.a.a aVar = new com.mbridge.msdk.newreward.function.d.a.a(this.f22124a);
                    aVar.c(campaignEx.getRequestIdNotice());
                    aVar.b(campaignEx.getAppName());
                    aVar.a(campaignEx.getId());
                    aVar.a(campaignEx);
                    arrayList.add(aVar);
                    this.f22124a.h(campaignEx.getCMPTEntryUrl());
                    this.f22124a.f(campaignEx.getMof_tplid());
                    long candidateCacheTime = campaignEx.getCandidateCacheTime();
                    if (candidateCacheTime > 0) {
                        this.f22124a.b((candidateCacheTime * 1000) + System.currentTimeMillis());
                    }
                    this.f22124a.h(campaignEx.getVcn());
                    this.f22124a.i(campaignEx.getTokenRule());
                    CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
                    if (rewardTemplateMode != null) {
                        this.f22124a.g(rewardTemplateMode.b());
                    }
                }
                this.f22124a.b(ads);
                this.f22124a.a(arrayList);
                com.mbridge.msdk.newreward.function.d.a.b bVar = this.f22124a;
                if (bVar != null && (cVar = this.f22131h) != null) {
                    try {
                        cVar.a(bVar, this);
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.a("BaseCampaignRequest", "handlerOnSuccessEvent Exception: ", e8);
                        }
                    }
                }
            } else {
                a(this, this.f22124a, new b(7, "data is null"));
            }
        } else {
            b bVar2 = new b(9);
            bVar2.a(jSONObject2.optString(NotificationCompat.CATEGORY_MESSAGE, ""));
            bVar2.a(optInt);
            bVar2.c(jSONObject2.toString());
            a(this, this.f22124a, bVar2);
        }
        this.f22134k = SystemClock.elapsedRealtime();
    }

    public final void b(String str) {
        this.f22137n = str;
    }

    @Override // com.mbridge.msdk.e.a.p
    public final void c() {
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f22135l);
        super.c();
    }

    @Override // com.mbridge.msdk.e.a.p
    public final Map<String, String> d() {
        if (this.f22139p == null) {
            this.f22139p = new HashMap();
        }
        return this.f22139p;
    }

    @Override // com.mbridge.msdk.e.a.p
    public final v b() {
        if (this.f22132i == null) {
            this.f22132i = new com.mbridge.msdk.e.a.f(30000, 5, 1.0f);
        }
        return this.f22132i;
    }

    public final void b(String str, String str2) {
        if (this.f22139p == null) {
            this.f22139p = new HashMap();
        }
        this.f22139p.put(str, str2);
    }

    public final void a(c cVar) {
        this.f22131h = cVar;
    }

    public final void a(String str, String str2) {
        if (this.f22130g == null) {
            this.f22130g = new HashMap();
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Map<String, String> map = this.f22130g;
        if (str2 == null) {
            str2 = "";
        }
        map.put(str, str2);
    }

    public final void a(String str) {
        this.f22136m = str;
    }

    public final void a(Map<String, String> map) {
        if (this.f22130g == null) {
            this.f22130g = new HashMap();
        }
        if (map == null || map.size() == 0) {
            return;
        }
        this.f22130g.putAll(map);
    }

    @Override // com.mbridge.msdk.e.a.p
    protected final Map<String, String> a() {
        if (this.f22130g == null) {
            this.f22130g = new HashMap();
        }
        return this.f22130g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.e.a.p
    public final r<JSONObject> a(m mVar) {
        if (mVar != null) {
            try {
                byte[] bArr = mVar.f19869b;
                if (bArr != null && bArr.length != 0) {
                    return r.a(new JSONObject(new String(bArr, com.mbridge.msdk.e.a.a.e.a(mVar.f19870c))), com.mbridge.msdk.e.a.a.e.a(mVar));
                }
            } catch (UnsupportedEncodingException e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("BaseCampaignRequest", "parseNetworkResponse UnsupportedEncodingException: ", e8);
                }
                return r.a(new com.mbridge.msdk.e.a.g(e8));
            } catch (JSONException e9) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("BaseCampaignRequest", "parseNetworkResponse JSONException: ", e9);
                }
                return r.a(new o(e9));
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("BaseCampaignRequest", "parseNetworkResponse Exception: ", e10);
                }
                return r.a(new y(e10));
            }
        }
        return r.a(new u());
    }

    @Override // com.mbridge.msdk.e.a.r.a
    public final void a(z zVar) {
        c cVar;
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f22135l);
        if (MBridgeConstans.DEBUG) {
            ad.b("BaseCampaignRequest", "onErrorResponse: " + zVar.getMessage());
        }
        com.mbridge.msdk.newreward.function.d.a.b bVar = this.f22124a;
        if (bVar == null || (cVar = this.f22131h) == null) {
            return;
        }
        try {
            cVar.b(bVar, this, VolleyErrorUtils.parseVolleyError(zVar));
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.a("BaseCampaignRequest", "onError Exception: ", e8);
            }
        }
    }

    private static void a(a aVar, com.mbridge.msdk.newreward.function.d.a.b bVar, b bVar2) {
        c cVar;
        if (aVar == null || bVar == null || (cVar = aVar.f22131h) == null) {
            return;
        }
        try {
            cVar.a(bVar, aVar, bVar2);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.a("BaseCampaignRequest", "handlerOnFailedEvent Exception: ", e8);
            }
        }
    }

    static /* synthetic */ void a(a aVar, com.mbridge.msdk.newreward.function.d.a.b bVar, long j8) {
        c cVar;
        if (aVar == null || bVar == null || (cVar = aVar.f22131h) == null) {
            return;
        }
        try {
            cVar.a(bVar, aVar, j8, new b(10, "v3 is timeout"));
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.a("BaseCampaignRequest", "onTimeout Exception: ", e8);
            }
        }
    }
}
