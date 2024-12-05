package com.mbridge.msdk.video.signal.a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.al;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.scheme.applet.AppletsModel;
import com.mbridge.msdk.video.signal.a;
import com.mbridge.msdk.video.signal.a.a;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class k extends l {

    /* renamed from: p, reason: collision with root package name */
    private Activity f23667p;

    /* renamed from: q, reason: collision with root package name */
    private String f23668q;

    /* renamed from: r, reason: collision with root package name */
    private String f23669r;

    /* renamed from: s, reason: collision with root package name */
    private CampaignEx f23670s;

    /* renamed from: t, reason: collision with root package name */
    private List<CampaignEx> f23671t;

    /* renamed from: u, reason: collision with root package name */
    private int f23672u;

    /* renamed from: v, reason: collision with root package name */
    private String f23673v = "";

    /* renamed from: w, reason: collision with root package name */
    private String f23674w = "";

    /* renamed from: x, reason: collision with root package name */
    private boolean f23675x = false;

    /* renamed from: y, reason: collision with root package name */
    private boolean f23676y = false;

    public k(Activity activity, CampaignEx campaignEx) {
        this.f23667p = activity;
        this.f23670s = campaignEx;
    }

    private String p() {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f23655j);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("instanceId", this.f23673v);
            jSONObject2.put("rootViewInstanceId", this.f23674w);
            jSONObject2.put("isRootTemplateWebView", this.f23675x);
            jSONObject.put("sdk_info", "MAL_16.7.31,3.0.1");
            jSONObject2.put("playVideoMute", this.f23659n);
            jSONObject.put("sdkSetting", jSONObject2);
            a(jSONObject);
            JSONArray jSONArray = new JSONArray();
            List<CampaignEx> list = this.f23671t;
            if (list != null && list.size() > 0) {
                for (CampaignEx campaignEx : this.f23671t) {
                    jSONArray.put(CampaignEx.campaignToJsonObject(campaignEx, campaignEx.isReady(), b(campaignEx)));
                }
            } else {
                jSONArray.put(CampaignEx.campaignToJsonObject(this.f23670s));
            }
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", x());
            String g8 = com.mbridge.msdk.c.h.a().g(com.mbridge.msdk.foundation.controller.c.m().k());
            if (!TextUtils.isEmpty(g8)) {
                JSONObject jSONObject3 = new JSONObject(g8);
                b(jSONObject3);
                String c8 = com.mbridge.msdk.c.h.a().c(this.f23655j);
                if (!TextUtils.isEmpty(c8)) {
                    jSONObject3.put("ivreward", new JSONObject(c8));
                }
                jSONObject.put("appSetting", jSONObject3);
            }
            jSONObject.put("rewardSetting", y());
            if (!TextUtils.isEmpty(this.f23655j)) {
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f23655j);
            }
            if (this.f23676y) {
                obj = "1";
            } else {
                obj = MBridgeConstans.ENDCARD_URL_TYPE_PL;
            }
            jSONObject.put("rw_plus", obj);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }

    private JSONObject q() {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject);
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.f23659n);
            jSONObject.put("sdkSetting", jSONObject2);
            a(jSONObject);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(CampaignEx.campaignToJsonObject(this.f23670s));
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", x());
            String g8 = com.mbridge.msdk.c.h.a().g(com.mbridge.msdk.foundation.controller.c.m().k());
            if (!TextUtils.isEmpty(g8)) {
                JSONObject jSONObject3 = new JSONObject(g8);
                b(jSONObject3);
                String c8 = com.mbridge.msdk.c.h.a().c(this.f23655j);
                if (!TextUtils.isEmpty(c8)) {
                    jSONObject3.put("ivreward", c8);
                }
                jSONObject.put("appSetting", jSONObject3.toString());
            }
            jSONObject.put("rewardSetting", y());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject r() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_info", "MAL_16.7.31,3.0.1");
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject s() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f23655j)) {
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f23655j);
            }
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject t() {
        JSONObject jSONObject = new JSONObject();
        try {
            String g8 = com.mbridge.msdk.c.h.a().g(com.mbridge.msdk.foundation.controller.c.m().k());
            if (!TextUtils.isEmpty(g8)) {
                jSONObject.put("appSetting", new JSONObject(g8));
            }
        } catch (JSONException e8) {
            e8.printStackTrace();
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private JSONObject u() {
        JSONObject jSONObject = new JSONObject();
        try {
            com.mbridge.msdk.videocommon.d.c cVar = this.f23656k;
            if (cVar != null) {
                jSONObject.put("unitSetting", cVar.E());
            }
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject v() {
        JSONObject jSONObject = new JSONObject();
        try {
            a(jSONObject);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject w() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.f23659n);
            jSONObject2.put("instanceId", this.f23673v);
            jSONObject.put("sdkSetting", jSONObject2);
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject x() {
        JSONObject jSONObject = new JSONObject();
        com.mbridge.msdk.videocommon.d.c cVar = this.f23656k;
        if (cVar != null) {
            return cVar.E();
        }
        return jSONObject;
    }

    private JSONObject y() {
        JSONObject jSONObject = new JSONObject();
        com.mbridge.msdk.videocommon.d.a b8 = com.mbridge.msdk.videocommon.d.b.a().b();
        if (b8 != null) {
            return b8.k();
        }
        return jSONObject;
    }

    public final void c(boolean z8) {
        this.f23675x = z8;
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.e
    public final void click(int i8, String str) {
        AppletsModel appletsModel;
        List<CampaignEx> list;
        int i9;
        List<CampaignEx> list2;
        super.click(i8, str);
        CampaignEx campaignEx = this.f23670s;
        if (campaignEx != null) {
            if (campaignEx.getDynamicTempCode() == 5 && this.f23670s != null && (list2 = this.f23671t) != null && list2.size() != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("camp_position")) {
                        this.f23670s = this.f23671t.get(jSONObject.getInt("camp_position"));
                    }
                } catch (JSONException e8) {
                    e8.printStackTrace();
                }
            }
            CampaignEx campaignEx2 = this.f23670s;
            if (i8 == 3) {
                campaignEx2.setClickTempSource(2);
                if (campaignEx2.getTriggerClickSource() == 0) {
                    campaignEx2.setTriggerClickSource(2);
                }
            } else if (i8 == 1 && campaignEx2.getClickTempSource() != 2) {
                campaignEx2.setClickTempSource(1);
            }
        }
        try {
            if (i8 != 1) {
                if (i8 != 3) {
                    if (i8 == 4) {
                        this.f23658m.a(true);
                        return;
                    }
                    return;
                }
                CampaignEx campaignEx3 = this.f23670s;
                if (campaignEx3 != null && campaignEx3.getCbd() > -2) {
                    i9 = this.f23670s.getCbd();
                } else {
                    com.mbridge.msdk.videocommon.d.c cVar = this.f23656k;
                    if (cVar != null) {
                        i9 = cVar.p();
                    } else {
                        i9 = 1;
                    }
                }
                if (i9 == -1) {
                    a(new a.b(this, this.f23658m));
                }
                click(1, str);
                return;
            }
            if (this.f23670s == null && (list = this.f23671t) != null && list.size() > 0) {
                this.f23670s = this.f23671t.get(0);
            }
            CampaignEx campaignEx4 = this.f23670s;
            if (campaignEx4 == null) {
                return;
            }
            CampaignEx a8 = a(str, campaignEx4);
            if (a8 != null && (appletsModel = AppletModelManager.getInstance().get(a8)) != null) {
                appletsModel.setUserClick(true);
                AppletModelManager.getInstance().replace(appletsModel, a8);
            }
            a(a8, this.f23667p);
        } catch (Throwable th) {
            ad.a("DefaultJSCommon", th.getMessage(), th);
        }
    }

    public final void d(String str) {
        this.f23674w = str;
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.a
    public final void f() {
        super.f();
        a.InterfaceC0433a interfaceC0433a = this.f23658m;
        if (interfaceC0433a != null) {
            interfaceC0433a.b();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.a
    public final String g(int i8) {
        switch (i8) {
            case 1:
                return r().toString();
            case 2:
                return s().toString();
            case 3:
                return t().toString();
            case 4:
                return u().toString();
            case 5:
                return v().toString();
            case 6:
                return w().toString();
            default:
                return q().toString();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.e
    public final void handlerH5Exception(int i8, String str) {
        super.handlerH5Exception(i8, str);
        try {
            this.f23658m.a(i8, str);
        } catch (Throwable th) {
            ad.a("DefaultJSCommon", th.getMessage(), th);
        }
    }

    public final void i(int i8) {
        this.f23672u = i8;
    }

    public final void n() {
        this.f23668q = "";
    }

    public final int o() {
        return this.f23672u;
    }

    private void b(JSONObject jSONObject) {
        try {
            Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
            String obj = al.a(c8, "MBridge_ConfirmTitle" + this.f23655j, "").toString();
            String obj2 = al.a(c8, "MBridge_ConfirmContent" + this.f23655j, "").toString();
            String obj3 = al.a(c8, "MBridge_CancelText" + this.f23655j, "").toString();
            String obj4 = al.a(c8, "MBridge_ConfirmText" + this.f23655j, "").toString();
            if (!TextUtils.isEmpty(obj)) {
                jSONObject.put("confirm_title", obj);
            }
            if (!TextUtils.isEmpty(obj2)) {
                jSONObject.put("confirm_description", obj2);
            }
            if (!TextUtils.isEmpty(obj3)) {
                jSONObject.put("confirm_t", obj3);
            }
            if (!TextUtils.isEmpty(obj4)) {
                jSONObject.put("confirm_c_play", obj4);
            }
            if (TextUtils.isEmpty(obj4)) {
                return;
            }
            jSONObject.put("confirm_c_rv", obj4);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void a(CampaignEx campaignEx) {
        this.f23670s = campaignEx;
    }

    public final void c(String str) {
        this.f23673v = str;
    }

    public final void d(boolean z8) {
        this.f23676y = z8;
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.a
    public final String i() {
        ad.a("DefaultJSCommon", "getNotchArea");
        return this.f23669r;
    }

    public final void a(List<CampaignEx> list) {
        this.f23671t = list;
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.a
    public final String c() {
        this.f23658m.a();
        this.f23646a = true;
        if (TextUtils.isEmpty(this.f23668q)) {
            this.f23668q = p();
        } else {
            this.f23668q = ai.b(this.f23668q, "tun", z.q() + "");
        }
        return this.f23668q;
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.a
    public final void d() {
        super.d();
        try {
            Activity activity = this.f23667p;
            if (activity != null) {
                activity.finish();
            }
        } catch (Throwable th) {
            ad.a("DefaultJSCommon", th.getMessage(), th);
        }
    }

    private CampaignEx a(String str, CampaignEx campaignEx) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            return campaignEx;
        }
        if (TextUtils.isEmpty(str) && campaignEx == null) {
            return null;
        }
        if (!str.contains("notice")) {
            try {
                JSONObject campaignToJsonObject = CampaignEx.campaignToJsonObject(campaignEx);
                CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(campaignToJsonObject);
                if (parseCampaignWithBackData == null) {
                    parseCampaignWithBackData = campaignEx;
                }
                if (!TextUtils.isEmpty(str)) {
                    a(campaignToJsonObject, parseCampaignWithBackData);
                    JSONObject optJSONObject = new JSONObject(str).optJSONObject(com.mbridge.msdk.foundation.same.a.f20477j);
                    if (optJSONObject != null) {
                        str2 = String.valueOf(ai.a(this.f23667p, Integer.valueOf(optJSONObject.getString(com.mbridge.msdk.foundation.same.a.f20475h)).intValue()));
                        str3 = String.valueOf(ai.a(this.f23667p, Integer.valueOf(optJSONObject.getString(com.mbridge.msdk.foundation.same.a.f20476i)).intValue()));
                    } else {
                        str2 = "-999";
                        str3 = "-999";
                    }
                    parseCampaignWithBackData.setClickURL(com.mbridge.msdk.click.c.a(parseCampaignWithBackData.getClickURL(), str2, str3));
                    String noticeUrl = parseCampaignWithBackData.getNoticeUrl();
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        StringBuilder sb = new StringBuilder();
                        while (keys.hasNext()) {
                            sb.append("&");
                            String next = keys.next();
                            String optString = optJSONObject.optString(next);
                            if (com.mbridge.msdk.foundation.same.a.f20475h.equals(next) || com.mbridge.msdk.foundation.same.a.f20476i.equals(next)) {
                                optString = String.valueOf(ai.a(this.f23667p, Integer.valueOf(optString).intValue()));
                            }
                            sb.append(next);
                            sb.append("=");
                            sb.append(optString);
                        }
                        parseCampaignWithBackData.setNoticeUrl(noticeUrl + ((Object) sb));
                    }
                }
                return parseCampaignWithBackData;
            } catch (JSONException e8) {
                e8.printStackTrace();
                return campaignEx;
            } catch (Throwable th) {
                th.printStackTrace();
                return campaignEx;
            }
        }
        try {
            JSONObject campaignToJsonObject2 = CampaignEx.campaignToJsonObject(campaignEx);
            JSONObject jSONObject = new JSONObject(str);
            try {
                if (!jSONObject.has(CampaignEx.JSON_KEY_DEEP_LINK_URL)) {
                    campaignToJsonObject2.put(CampaignEx.JSON_KEY_DEEP_LINK_URL, "");
                }
            } catch (Exception unused) {
            }
            Iterator<String> keys2 = jSONObject.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                campaignToJsonObject2.put(next2, jSONObject.getString(next2));
            }
            CampaignEx parseCampaignWithBackData2 = CampaignEx.parseCampaignWithBackData(campaignToJsonObject2);
            a(campaignToJsonObject2, parseCampaignWithBackData2);
            return parseCampaignWithBackData2;
        } catch (JSONException e9) {
            e9.printStackTrace();
            return campaignEx;
        }
    }

    public k(Activity activity, CampaignEx campaignEx, List<CampaignEx> list) {
        this.f23667p = activity;
        this.f23670s = campaignEx;
        this.f23671t = list;
    }

    private boolean b(CampaignEx campaignEx) {
        com.mbridge.msdk.c.g b8;
        try {
            String k8 = com.mbridge.msdk.foundation.controller.c.m().k();
            long ac = (TextUtils.isEmpty(k8) || (b8 = com.mbridge.msdk.c.h.a().b(k8)) == null) ? 0L : b8.ac() * 1000;
            com.mbridge.msdk.videocommon.d.a b9 = com.mbridge.msdk.videocommon.d.b.a().b();
            long f8 = b9 != null ? b9.f() : 0L;
            if (campaignEx != null) {
                return campaignEx.isSpareOffer(f8, ac);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.a
    public final void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f23669r = str;
    }

    private void a(JSONObject jSONObject, CampaignEx campaignEx) {
        try {
            String optString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            campaignEx.setCampaignUnitId(optString);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.a
    public final void a(int i8, String str) {
        super.a(i8, str);
        if (i8 != 2) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            final String optString = jSONObject.optString(NotificationCompat.CATEGORY_EVENT, NotificationCompat.CATEGORY_EVENT);
            final String optString2 = jSONObject.optString("template", "-1");
            final String optString3 = jSONObject.optString(TtmlNode.TAG_LAYOUT, "-1");
            final String optString4 = jSONObject.optString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f23655j);
            final int l8 = z.l(this.f23667p.getApplication());
            Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.video.signal.a.k.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.mbridge.msdk.foundation.db.q.a(com.mbridge.msdk.foundation.db.h.a(k.this.f23667p.getApplication())).a(new com.mbridge.msdk.foundation.entity.n("2000039", optString, optString2, optString3, optString4, k.this.f23670s.getId(), l8, z.a(k.this.f23667p.getApplication(), l8)));
                }
            };
            com.mbridge.msdk.foundation.controller.d.a();
            com.mbridge.msdk.foundation.same.f.b.b().execute(runnable);
        } catch (Throwable th) {
            ad.a("DefaultJSCommon", th.getMessage(), th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.a, com.mbridge.msdk.video.signal.a
    public final void a(Activity activity) {
        this.f23667p = activity;
    }
}
