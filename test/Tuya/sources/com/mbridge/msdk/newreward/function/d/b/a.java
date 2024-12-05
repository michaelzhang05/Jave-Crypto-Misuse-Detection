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
    protected com.mbridge.msdk.newreward.function.d.a.b f21069a;

    /* renamed from: b, reason: collision with root package name */
    protected Context f21070b;

    /* renamed from: c, reason: collision with root package name */
    protected int f21071c;

    /* renamed from: d, reason: collision with root package name */
    protected String f21072d;

    /* renamed from: e, reason: collision with root package name */
    protected String f21073e;

    /* renamed from: f, reason: collision with root package name */
    protected String f21074f;

    /* renamed from: g, reason: collision with root package name */
    private Map<String, String> f21075g;

    /* renamed from: h, reason: collision with root package name */
    private c f21076h;

    /* renamed from: i, reason: collision with root package name */
    private v f21077i;

    /* renamed from: j, reason: collision with root package name */
    private long f21078j;

    /* renamed from: k, reason: collision with root package name */
    private long f21079k;

    /* renamed from: l, reason: collision with root package name */
    private String f21080l;

    /* renamed from: m, reason: collision with root package name */
    private String f21081m;

    /* renamed from: n, reason: collision with root package name */
    private String f21082n;

    /* renamed from: o, reason: collision with root package name */
    private String f21083o;

    /* renamed from: p, reason: collision with root package name */
    private Map<String, String> f21084p;

    /* renamed from: com.mbridge.msdk.newreward.function.d.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0417a implements a.InterfaceC0413a {

        /* renamed from: a, reason: collision with root package name */
        private final a f21085a;

        /* renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.function.d.a.b f21086b;

        public C0417a(a aVar, com.mbridge.msdk.newreward.function.d.a.b bVar) {
            this.f21085a = aVar;
            this.f21086b = bVar;
        }

        @Override // com.mbridge.msdk.newreward.a.c.a.InterfaceC0413a
        public final void a(String str, long j8) {
            ad.a("BaseCampaignRequest", "onTimeout taskID = " + str + ", timeout = " + j8);
            f.a();
            a aVar = this.f21085a;
            if (aVar != null && !aVar.m()) {
                aVar.c();
            }
            a.a(this.f21085a, this.f21086b, j8);
        }
    }

    public a(int i8, String str, String str2, String str3, long j8, String str4) {
        super(0, str4);
        this.f21070b = com.mbridge.msdk.foundation.controller.c.m().c();
        this.f21071c = i8;
        this.f21072d = str;
        this.f21073e = str2;
        this.f21074f = str3;
        this.f21080l = UUID.randomUUID().toString();
        this.f21078j = SystemClock.elapsedRealtime();
        this.f21083o = str4;
        this.f21069a = new com.mbridge.msdk.newreward.function.d.a.b(this.f21071c, this.f21072d, this.f21073e, this.f21074f);
        a((r.a) this);
        c(true);
        b(true);
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f21080l, j8 <= 0 ? WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS : j8, new C0417a(this, this.f21069a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.e.a.p
    public final /* synthetic */ void a(JSONObject jSONObject) {
        c cVar;
        JSONObject jSONObject2 = jSONObject;
        if (MBridgeConstans.DEBUG) {
            ad.a("BaseCampaignRequest", "deliverResponse: " + jSONObject2);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f21080l);
        int optInt = jSONObject2.optInt(NotificationCompat.CATEGORY_STATUS);
        if (optInt == 1) {
            JSONObject optJSONObject = jSONObject2.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject != null) {
                CampaignUnit parseCampaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(optJSONObject, this.f21081m);
                this.f21069a.a(optJSONObject);
                this.f21069a.f(optJSONObject.optString("c"));
                this.f21069a.e(optJSONObject.optString(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B));
                this.f21069a.d(optJSONObject.optString("a"));
                this.f21069a.b(optJSONObject.optInt("template"));
                this.f21069a.a(System.currentTimeMillis());
                this.f21069a.c(this.f21081m);
                this.f21069a.g(optJSONObject.optString(com.mbridge.msdk.foundation.same.a.f19408S));
                this.f21069a.a(1);
                this.f21069a.c(0);
                this.f21069a.a(parseCampaignUnit.getRequestId());
                this.f21069a.a(parseCampaignUnit.getEcppv());
                this.f21069a.i(this.f21083o);
                ArrayList arrayList = new ArrayList();
                ArrayList<CampaignEx> ads = parseCampaignUnit.getAds();
                for (CampaignEx campaignEx : ads) {
                    campaignEx.setRequestId(this.f21069a.d());
                    campaignEx.setLocalRequestId(this.f21082n);
                    com.mbridge.msdk.newreward.function.d.a.a aVar = new com.mbridge.msdk.newreward.function.d.a.a(this.f21069a);
                    aVar.c(campaignEx.getRequestIdNotice());
                    aVar.b(campaignEx.getAppName());
                    aVar.a(campaignEx.getId());
                    aVar.a(campaignEx);
                    arrayList.add(aVar);
                    this.f21069a.h(campaignEx.getCMPTEntryUrl());
                    this.f21069a.f(campaignEx.getMof_tplid());
                    long candidateCacheTime = campaignEx.getCandidateCacheTime();
                    if (candidateCacheTime > 0) {
                        this.f21069a.b((candidateCacheTime * 1000) + System.currentTimeMillis());
                    }
                    this.f21069a.h(campaignEx.getVcn());
                    this.f21069a.i(campaignEx.getTokenRule());
                    CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
                    if (rewardTemplateMode != null) {
                        this.f21069a.g(rewardTemplateMode.b());
                    }
                }
                this.f21069a.b(ads);
                this.f21069a.a(arrayList);
                com.mbridge.msdk.newreward.function.d.a.b bVar = this.f21069a;
                if (bVar != null && (cVar = this.f21076h) != null) {
                    try {
                        cVar.a(bVar, this);
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.a("BaseCampaignRequest", "handlerOnSuccessEvent Exception: ", e8);
                        }
                    }
                }
            } else {
                a(this, this.f21069a, new b(7, "data is null"));
            }
        } else {
            b bVar2 = new b(9);
            bVar2.a(jSONObject2.optString(NotificationCompat.CATEGORY_MESSAGE, ""));
            bVar2.a(optInt);
            bVar2.c(jSONObject2.toString());
            a(this, this.f21069a, bVar2);
        }
        this.f21079k = SystemClock.elapsedRealtime();
    }

    public final void b(String str) {
        this.f21082n = str;
    }

    @Override // com.mbridge.msdk.e.a.p
    public final void c() {
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f21080l);
        super.c();
    }

    @Override // com.mbridge.msdk.e.a.p
    public final Map<String, String> d() {
        if (this.f21084p == null) {
            this.f21084p = new HashMap();
        }
        return this.f21084p;
    }

    @Override // com.mbridge.msdk.e.a.p
    public final v b() {
        if (this.f21077i == null) {
            this.f21077i = new com.mbridge.msdk.e.a.f(30000, 5, 1.0f);
        }
        return this.f21077i;
    }

    public final void b(String str, String str2) {
        if (this.f21084p == null) {
            this.f21084p = new HashMap();
        }
        this.f21084p.put(str, str2);
    }

    public final void a(c cVar) {
        this.f21076h = cVar;
    }

    public final void a(String str, String str2) {
        if (this.f21075g == null) {
            this.f21075g = new HashMap();
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Map<String, String> map = this.f21075g;
        if (str2 == null) {
            str2 = "";
        }
        map.put(str, str2);
    }

    public final void a(String str) {
        this.f21081m = str;
    }

    public final void a(Map<String, String> map) {
        if (this.f21075g == null) {
            this.f21075g = new HashMap();
        }
        if (map == null || map.size() == 0) {
            return;
        }
        this.f21075g.putAll(map);
    }

    @Override // com.mbridge.msdk.e.a.p
    protected final Map<String, String> a() {
        if (this.f21075g == null) {
            this.f21075g = new HashMap();
        }
        return this.f21075g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.e.a.p
    public final r<JSONObject> a(m mVar) {
        if (mVar != null) {
            try {
                byte[] bArr = mVar.f18814b;
                if (bArr != null && bArr.length != 0) {
                    return r.a(new JSONObject(new String(bArr, com.mbridge.msdk.e.a.a.e.a(mVar.f18815c))), com.mbridge.msdk.e.a.a.e.a(mVar));
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
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f21080l);
        if (MBridgeConstans.DEBUG) {
            ad.b("BaseCampaignRequest", "onErrorResponse: " + zVar.getMessage());
        }
        com.mbridge.msdk.newreward.function.d.a.b bVar = this.f21069a;
        if (bVar == null || (cVar = this.f21076h) == null) {
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
        if (aVar == null || bVar == null || (cVar = aVar.f21076h) == null) {
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
        if (aVar == null || bVar == null || (cVar = aVar.f21076h) == null) {
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
