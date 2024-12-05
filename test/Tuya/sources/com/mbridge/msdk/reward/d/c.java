package com.mbridge.msdk.reward.d;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.f;
import com.mbridge.msdk.foundation.same.net.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class c extends f<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f21669a = "c";

    /* renamed from: b, reason: collision with root package name */
    private int f21670b;

    /* renamed from: c, reason: collision with root package name */
    private String f21671c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.d.b f21672d;

    public abstract void a(List<Frame> list);

    public abstract void a(List<com.mbridge.msdk.foundation.same.net.d.b> list, CampaignUnit campaignUnit);

    public abstract void b(int i8, String str, com.mbridge.msdk.foundation.same.report.d.b bVar);

    @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
    public void onError(com.mbridge.msdk.foundation.same.net.b.a aVar) {
        ad.b(f21669a, "errorCode = " + aVar.f19601a);
        com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(aVar.f19601a, com.mbridge.msdk.foundation.same.net.g.a.a(aVar));
        bVar.a("campaign_request_error", aVar);
        bVar.e(aVar.f19602b);
        this.f21672d.a(bVar);
        b(aVar.f19601a, com.mbridge.msdk.foundation.same.net.g.a.a(aVar), this.f21672d);
    }

    @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
    public void onPreExecute() {
        super.onPreExecute();
    }

    @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
    public void onSuccess(k<JSONObject> kVar) {
        com.mbridge.msdk.foundation.same.net.f.c cVar;
        CampaignUnit parseCampaignUnit;
        String str;
        super.onSuccess(kVar);
        if (kVar != null && (cVar = kVar.f19760b) != null) {
            int i8 = this.f21670b;
            if (i8 == 0) {
                final List<com.mbridge.msdk.foundation.same.net.d.b> list = cVar.f19656b;
                final JSONObject jSONObject = kVar.f19761c;
                final int optInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS);
                if (1 == optInt) {
                    calcRequestTime(System.currentTimeMillis());
                    final String optString = jSONObject.optString("version");
                    com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.reward.d.c.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            final CampaignUnit parseCampaignUnit2;
                            if ("v5".equals(optString)) {
                                parseCampaignUnit2 = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA), c.this.f21671c);
                            } else {
                                parseCampaignUnit2 = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA), c.this.f21671c);
                            }
                            com.mbridge.msdk.foundation.same.f.b.e().post(new Runnable() { // from class: com.mbridge.msdk.reward.d.c.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    String str2;
                                    CampaignUnit campaignUnit = parseCampaignUnit2;
                                    if (campaignUnit != null && campaignUnit.getAds() != null && parseCampaignUnit2.getAds().size() > 0) {
                                        parseCampaignUnit2.setMetricsData(c.this.f21672d);
                                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                        c.this.a(list, parseCampaignUnit2);
                                        c.this.saveRequestTime(parseCampaignUnit2.getAds().size());
                                        return;
                                    }
                                    CampaignUnit campaignUnit2 = parseCampaignUnit2;
                                    if (campaignUnit2 != null) {
                                        str2 = campaignUnit2.getMsg();
                                    } else {
                                        str2 = null;
                                    }
                                    if (TextUtils.isEmpty(str2)) {
                                        str2 = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
                                    }
                                    AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                                    c cVar2 = c.this;
                                    cVar2.b(optInt, str2, cVar2.f21672d);
                                }
                            });
                        }
                    });
                    return;
                }
                a(list, jSONObject, optInt, this.f21672d);
                return;
            }
            if (i8 == 1) {
                List<com.mbridge.msdk.foundation.same.net.d.b> list2 = cVar.f19656b;
                JSONObject jSONObject2 = kVar.f19761c;
                int optInt2 = jSONObject2.optInt(NotificationCompat.CATEGORY_STATUS);
                if (1 == optInt2) {
                    calcRequestTime(System.currentTimeMillis());
                    if ("v5".equals(jSONObject2.optString("version"))) {
                        parseCampaignUnit = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject2.optJSONObject(DataSchemeDataSource.SCHEME_DATA), this.f21671c);
                    } else {
                        parseCampaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject2.optJSONObject(DataSchemeDataSource.SCHEME_DATA), this.f21671c);
                    }
                    if (parseCampaignUnit != null && parseCampaignUnit.getListFrames() != null && parseCampaignUnit.getListFrames().size() > 0) {
                        List<Frame> listFrames = parseCampaignUnit.getListFrames();
                        a(listFrames);
                        saveRequestTime(listFrames.size());
                        return;
                    } else {
                        if (parseCampaignUnit != null) {
                            str = parseCampaignUnit.getMsg();
                        } else {
                            str = null;
                        }
                        if (TextUtils.isEmpty(str)) {
                            str = jSONObject2.optString(NotificationCompat.CATEGORY_MESSAGE);
                        }
                        b(optInt2, str, this.f21672d);
                        return;
                    }
                }
                a(list2, jSONObject2, optInt2, this.f21672d);
            }
        }
    }

    public final void a(String str) {
        this.f21671c = str;
    }

    public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar) {
        this.f21672d = bVar;
    }

    private void a(List<com.mbridge.msdk.foundation.same.net.d.b> list, JSONObject jSONObject, int i8, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        com.mbridge.msdk.foundation.c.b b8;
        String str = "";
        if (list != null && list.size() > 0) {
            for (com.mbridge.msdk.foundation.same.net.d.b bVar2 : list) {
                if (bVar2 != null) {
                    String a8 = bVar2.a();
                    if (!TextUtils.isEmpty(a8) && a8.equals("data_res_type")) {
                        str = bVar2.b();
                    }
                }
            }
        }
        String str2 = "errorCode: 3507 errorMessage: data load failed, errorMsg is " + jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
        if (!TextUtils.isEmpty(str) && str.equals("1")) {
            com.mbridge.msdk.foundation.c.b b9 = com.mbridge.msdk.foundation.c.a.b(880018, str2);
            if (bVar != null) {
                bVar.a(b9);
                bVar.b(true);
                if (TextUtils.isEmpty(str2)) {
                    str2 = b9.b();
                }
            }
            b(i8, str2, bVar);
            return;
        }
        if (i8 == -1) {
            b8 = com.mbridge.msdk.foundation.c.a.b(880017, str2);
        } else {
            b8 = com.mbridge.msdk.foundation.c.a.b(880003, str2);
        }
        if (bVar != null) {
            bVar.a(b8);
            bVar.b(false);
            if (TextUtils.isEmpty(str2)) {
                str2 = b8.b();
            }
        }
        b(i8, str2, bVar);
    }
}
