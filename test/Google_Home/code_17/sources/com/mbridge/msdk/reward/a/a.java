package com.mbridge.msdk.reward.a;

import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import com.mbridge.msdk.foundation.b.a;
import com.mbridge.msdk.foundation.b.d;
import com.mbridge.msdk.foundation.controller.b;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static String f22325a = "RewardCandidateController";

    /* renamed from: b, reason: collision with root package name */
    private d f22326b;

    public a(String str, boolean z8) {
        try {
            this.f22326b = b.a().a(str, com.mbridge.msdk.videocommon.d.b.a().a(c.m().k(), str, z8).G());
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void a(List<CampaignEx> list, String str, com.mbridge.msdk.reward.adapter.c cVar, String str2) {
        try {
            if (this.f22326b == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f22326b.a(com.mbridge.msdk.foundation.b.a.f20057b, 2, list, this.f22326b.a(list, str) > 0, "", "", -1, str2);
            d dVar = this.f22326b;
            JSONObject a8 = dVar.a(dVar.b(str));
            if (a8 == null || this.f22326b.d(str) <= 0.0d) {
                return;
            }
            a(this.f22326b.a(a8.optInt("max_usage_limit", 10), 0L), a8, a8.optInt("max_cache_num", 20), -1.0d, cVar, new com.mbridge.msdk.foundation.same.report.d.b(), str, false, 0);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final com.mbridge.msdk.foundation.b.c a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar, CampaignEx campaignEx, com.mbridge.msdk.foundation.c.b bVar2, int i8, com.mbridge.msdk.reward.adapter.c cVar) {
        String requestId;
        String str2;
        int i9;
        com.mbridge.msdk.foundation.b.c a8;
        com.mbridge.msdk.foundation.b.c cVar2 = new com.mbridge.msdk.foundation.b.c();
        String str3 = "";
        if (campaignEx == null) {
            requestId = "";
        } else {
            try {
                try {
                    requestId = campaignEx.getRequestId();
                } catch (Exception unused) {
                    cVar2.d("getRewardCandidateCampaignList result exception");
                    cVar2.a(com.mbridge.msdk.foundation.b.c.f20078c);
                    return cVar2;
                }
            } catch (Exception unused2) {
                cVar2.d("getCandidateCampaignList result exception");
                cVar2.a(com.mbridge.msdk.foundation.b.c.f20078c);
                return cVar2;
            }
        }
        if (bVar2 != null) {
            i9 = bVar2.f();
            str2 = bVar2.b();
        } else {
            str2 = null;
            i9 = 0;
        }
        d dVar = this.f22326b;
        if (dVar == null) {
            a8 = new com.mbridge.msdk.foundation.b.c();
            a8.d("can not get manager");
            a8.a(com.mbridge.msdk.foundation.b.c.f20078c);
        } else {
            com.mbridge.msdk.foundation.b.c c8 = dVar.c(str);
            if (c8.g() > com.mbridge.msdk.foundation.b.c.f20077b) {
                return c8;
            }
            String[] split = x.a(str.split("_")[3]).split("\\|");
            double parseDouble = Double.parseDouble(split[0]);
            if (split.length > 1) {
                str3 = split[1];
            }
            a8 = a(parseDouble, str3, cVar, bVar, str, i8);
            this.f22326b.a(a8.a(), bVar, requestId, i9, str2, i8, parseDouble);
        }
        return a8;
    }

    private com.mbridge.msdk.foundation.b.c a(double d8, String str, com.mbridge.msdk.reward.adapter.c cVar, com.mbridge.msdk.foundation.same.report.d.b bVar, String str2, int i8) {
        com.mbridge.msdk.foundation.b.c a8 = this.f22326b.a();
        try {
        } catch (Exception unused) {
            a8.d("getHighestCampaigns exception");
            a8.a(com.mbridge.msdk.foundation.b.c.f20078c);
        }
        if (a8.g() > 0) {
            return a8;
        }
        JSONObject a9 = this.f22326b.a(str);
        if (a9 != null) {
            int optInt = a9.optInt("max_usage_limit", 10);
            int optInt2 = a9.optInt("max_cache_num", 20);
            if (optInt2 > 0) {
                long j8 = 8640000;
                long optLong = a9.optLong("show_interval_time", 8640000L);
                if (optLong != 0) {
                    j8 = optLong;
                }
                List<com.mbridge.msdk.foundation.b.b> a10 = this.f22326b.a(optInt, System.currentTimeMillis() - (j8 * 1000));
                if (a10 != null && a10.size() > 0) {
                    return a(a10, a9, optInt2, d8, cVar, bVar, str2, true, i8);
                }
                a8.d("no cache");
                a8.a(com.mbridge.msdk.foundation.b.c.f20078c);
                a(bVar, str2, a8, (List<a.C0391a>) null, a9, 2);
            } else {
                a8.d("max cache num error");
                a8.a(com.mbridge.msdk.foundation.b.c.f20078c);
            }
        } else {
            a8.d("setting config not mapping");
            a8.a(com.mbridge.msdk.foundation.b.c.f20078c);
        }
        return a8;
    }

    private com.mbridge.msdk.foundation.b.c a(List<com.mbridge.msdk.foundation.b.b> list, JSONObject jSONObject, int i8, double d8, com.mbridge.msdk.reward.adapter.c cVar, com.mbridge.msdk.foundation.same.report.d.b bVar, String str, boolean z8, int i9) {
        ArrayList arrayList;
        int i10;
        com.mbridge.msdk.foundation.b.c cVar2;
        a aVar = this;
        List<com.mbridge.msdk.foundation.b.b> list2 = list;
        com.mbridge.msdk.foundation.b.c cVar3 = new com.mbridge.msdk.foundation.b.c();
        if (jSONObject == null) {
            cVar3.d("config is null");
            cVar3.a(com.mbridge.msdk.foundation.b.c.f20078c);
            return cVar3;
        }
        if (list2 != null && list.size() != 0) {
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                com.mbridge.msdk.foundation.b.b bVar2 = list2.get(i12);
                if (bVar2 != null) {
                    cVar3.a(bVar2.e());
                }
            }
            if (list.size() > 0 && ((list2 = aVar.a(list2, cVar3)) == null || list2.size() == 0)) {
                cVar3.d("existed");
                cVar3.a(com.mbridge.msdk.foundation.b.c.f20078c);
            }
            if (list2.size() > 0 && ((list2 = aVar.a(list2, cVar, cVar3)) == null || list2.size() == 0)) {
                cVar3.d("not ready");
                cVar3.a(com.mbridge.msdk.foundation.b.c.f20078c);
            }
            com.mbridge.msdk.foundation.b.b bVar3 = null;
            if (list2 == null || list2.size() <= 0) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                double optDouble = jSONObject.optDouble("t_disc", 0.8d);
                double optDouble2 = jSONObject.optDouble("u_disc", 0.95d);
                double d9 = 0.0d;
                double optDouble3 = jSONObject.optDouble("max_ecppv_diff", 0.0d);
                int optInt = jSONObject.optInt("time_interval", 1800);
                int size = list2.size();
                while (i11 < size) {
                    List<com.mbridge.msdk.foundation.b.b> list3 = list2;
                    com.mbridge.msdk.foundation.b.b bVar4 = list2.get(i11);
                    if (bVar4 != null) {
                        i10 = size;
                        cVar2 = cVar3;
                        double pow = Math.pow(optDouble2, bVar4.f()) * bVar4.c() * Math.pow(optDouble, (System.currentTimeMillis() - bVar4.h()) / (optInt * 1000.0d));
                        arrayList2.add(new a.C0391a(pow, bVar4));
                        if (pow >= d8 - optDouble3 && pow > d9) {
                            bVar3 = bVar4;
                            d9 = pow;
                        }
                    } else {
                        i10 = size;
                        cVar2 = cVar3;
                    }
                    i11++;
                    aVar = this;
                    list2 = list3;
                    size = i10;
                    cVar3 = cVar2;
                }
                com.mbridge.msdk.foundation.b.c cVar4 = cVar3;
                d dVar = aVar.f22326b;
                if (dVar != null) {
                    dVar.a(arrayList2, i8);
                }
                if (bVar3 != null) {
                    cVar3 = cVar4;
                    cVar3.a(bVar3.b());
                    cVar3.a(com.mbridge.msdk.foundation.b.c.f20079d);
                } else {
                    cVar3 = cVar4;
                    cVar3.d("no match campaign");
                    cVar3.a(com.mbridge.msdk.foundation.b.c.f20078c);
                }
                arrayList = arrayList2;
            }
            if (z8) {
                a(bVar, str, cVar3, arrayList, jSONObject, 2);
            }
            return cVar3;
        }
        cVar3.d("candidate is null");
        cVar3.a(com.mbridge.msdk.foundation.b.c.f20078c);
        return cVar3;
    }

    private List<com.mbridge.msdk.foundation.b.b> a(List<com.mbridge.msdk.foundation.b.b> list, com.mbridge.msdk.foundation.b.c cVar) {
        CopyOnWriteArrayList<CampaignEx> b8;
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            com.mbridge.msdk.foundation.b.b bVar = list.get(i8);
            if (bVar != null && (b8 = bVar.b()) != null && b8.size() != 0) {
                int i9 = 0;
                boolean z8 = false;
                while (true) {
                    if (i9 >= b8.size()) {
                        break;
                    }
                    CampaignEx campaignEx = b8.get(i9);
                    boolean c8 = ai.c(c.m().c(), campaignEx.getPackageName());
                    if (c8) {
                        cVar.c(bVar.e());
                        d dVar = this.f22326b;
                        if (dVar != null) {
                            dVar.a(bVar.d(), bVar.e(), 2, campaignEx.getEcppv());
                        }
                        z8 = c8;
                    } else {
                        i9++;
                        z8 = c8;
                    }
                }
                if (!z8) {
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    private List<com.mbridge.msdk.foundation.b.b> a(List<com.mbridge.msdk.foundation.b.b> list, com.mbridge.msdk.reward.adapter.c cVar, com.mbridge.msdk.foundation.b.c cVar2) {
        CopyOnWriteArrayList<CampaignEx> b8;
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            com.mbridge.msdk.foundation.b.b bVar = list.get(i8);
            if (bVar != null && (b8 = bVar.b()) != null && b8.size() != 0) {
                int i9 = 0;
                boolean z8 = false;
                while (true) {
                    if (i9 >= b8.size()) {
                        break;
                    }
                    CampaignEx campaignEx = b8.get(i9);
                    if (cVar == null || (z8 = cVar.a(b8, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())))) {
                        i9++;
                    } else {
                        cVar2.b(bVar.e());
                        d dVar = this.f22326b;
                        if (dVar != null) {
                            dVar.a(bVar.d(), bVar.e(), 2, campaignEx.getEcppv());
                        }
                    }
                }
                if (z8) {
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    public final boolean a(String str) {
        JSONObject a8;
        try {
            d dVar = this.f22326b;
            if (dVar != null && (a8 = dVar.a(dVar.b(str))) != null) {
                return a8.optInt("c_cb", 0) == 1;
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return false;
    }

    public final void a(String str, String str2, int i8, String str3) {
        d dVar = this.f22326b;
        if (dVar != null) {
            dVar.a(str, str2, i8, str3);
        }
    }

    public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, String str, com.mbridge.msdk.foundation.b.c cVar, List<a.C0391a> list, JSONObject jSONObject, int i8) {
        String str2;
        try {
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            if (i8 == 1) {
                str2 = "cb";
            } else if (i8 == 2) {
                str2 = "candidate";
            } else if (i8 != 3) {
                str2 = EnvironmentCompat.MEDIA_UNKNOWN;
            } else {
                str2 = "track";
            }
            dVar.a("scene", str2);
            d dVar2 = this.f22326b;
            if (dVar2 != null) {
                double d8 = dVar2.d(str);
                if (d8 >= 0.0d) {
                    dVar.a("bp", x.b(d8 + ""));
                }
                dVar.a("cb_state", a(str) ? "open" : CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
                try {
                    d dVar3 = this.f22326b;
                    JSONObject a8 = dVar3.a(dVar3.b(str));
                    if (a8 != null) {
                        dVar.a("config", a8.toString());
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
            if (cVar != null) {
                if (cVar.g() == com.mbridge.msdk.foundation.b.c.f20079d) {
                    dVar.a("result", 1);
                } else {
                    dVar.a("result", 2);
                    dVar.a("reason", cVar.b());
                }
                dVar.a("acr", cVar.c());
                dVar.a("her", cVar.e());
                dVar.a("nrr", cVar.d());
                dVar.a("cer", cVar.f());
            } else {
                dVar.a("result", 2);
                dVar.a("reason", "candidate result is null");
            }
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i9 = 0; i9 < list.size(); i9++) {
                    com.mbridge.msdk.foundation.b.b a9 = list.get(i9).a();
                    if (a9 != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("ecppv", x.b(a9.c() + ""));
                        jSONObject2.put("showCount", a9.f());
                        jSONObject2.put("intervalTime", System.currentTimeMillis() - a9.h());
                        jSONArray.put(jSONObject2);
                    }
                }
                dVar.a(DataSchemeDataSource.SCHEME_DATA, jSONArray.toString());
            }
            if (bVar != null) {
                bVar.a("m_candidate_data");
                bVar.k("m_candidate_data");
                bVar.a("m_candidate_data", dVar);
                if (cVar != null && cVar.a() != null) {
                    bVar.b(cVar.a());
                }
            }
            com.mbridge.msdk.foundation.same.report.d.c.a().a("m_candidate_data", bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }
}
