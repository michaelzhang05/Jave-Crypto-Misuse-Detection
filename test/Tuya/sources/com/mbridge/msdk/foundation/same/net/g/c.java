package com.mbridge.msdk.foundation.same.net.g;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.foundation.same.net.h.e;
import com.mbridge.msdk.foundation.same.net.k;
import com.mbridge.msdk.foundation.tools.ad;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f19660a;

    /* renamed from: b, reason: collision with root package name */
    private int f19661b;

    /* renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, a> f19662c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList<Integer> f19663d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f19664a;

        /* renamed from: b, reason: collision with root package name */
        public String f19665b;

        /* renamed from: c, reason: collision with root package name */
        public long f19666c;

        public a(long j8, int i8, String str) {
            this.f19666c = j8;
            this.f19664a = i8;
            this.f19665b = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final c f19667a = new c();
    }

    public static c a() {
        return b.f19667a;
    }

    private k b(String str, String str2, String str3, String str4, String str5) {
        int parseInt;
        String str6 = str + "_" + str3 + "_" + str2 + "_" + str5;
        a a8 = a(str6);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.mbridge.msdk.foundation.same.net.d.b("data_res_type", "1"));
        if (a8 != null && !TextUtils.isEmpty(a8.f19665b)) {
            try {
                if (a8.f19664a != -1) {
                    return k.a(new JSONObject(a8.f19665b), new com.mbridge.msdk.foundation.same.net.f.c(200, a8.f19665b.getBytes(), arrayList));
                }
                if (!TextUtils.isEmpty(str4)) {
                    return null;
                }
                if (str5 != null && !TextUtils.isEmpty(str5) && (parseInt = Integer.parseInt(str5)) != 287 && parseInt != 94) {
                    if (System.currentTimeMillis() < (h.a().a(str, str2).n() * 1000) + a8.f19666c) {
                        return k.a(new JSONObject(a8.f19665b), new com.mbridge.msdk.foundation.same.net.f.c(200, a8.f19665b.getBytes(), arrayList));
                    }
                    this.f19662c.remove(str6);
                    return null;
                }
            } catch (Exception e8) {
                ad.b("IDErrorUtil", e8.getMessage());
            }
        }
        ad.b("IDErrorUtil", "getErrorInfo RETURN NULL");
        return null;
    }

    private c() {
        this.f19660a = "IDErrorUtil";
        this.f19662c = new ConcurrentHashMap<>();
        this.f19663d = new ArrayList<>();
        g b8 = h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        if (b8 == null) {
            h.a();
            b8 = i.a();
        }
        this.f19661b = b8.x() * 1000;
        if (b8.B() == null || b8.B().size() <= 0) {
            ad.b("IDErrorUtil", "Setting ercd is EMPTY and use default code list.");
            this.f19663d.addAll(Arrays.asList(-1, -10, -1201, -1202, -1203, -1205, -1206, -1208, -1301, -1302, -1305, -1306, -1307, -1915, 10602, 10603, 10604, 10609, 10610, 10616));
        } else {
            ad.b("IDErrorUtil", "Setting ercd not EMPTY will use setting.");
            this.f19663d.addAll(b8.B());
        }
    }

    public final synchronized void a(String str, int i8, String str2, long j8) {
        if (this.f19662c.containsKey(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.f19663d.contains(Integer.valueOf(i8))) {
            ad.b("IDErrorUtil", "addErrorInfo : " + str + " " + str2);
            this.f19662c.put(str, new a(j8, i8, str2));
        }
    }

    public final k a(String str, String str2, String str3, String str4, String str5) {
        return b(str, str2, str3, str4, str5);
    }

    public final k a(e eVar) {
        String str = eVar.a().get(MBridgeConstans.APP_ID);
        String str2 = eVar.a().get("placement_id");
        String str3 = TextUtils.isEmpty(str2) ? "" : str2;
        String str4 = eVar.a().get(MBridgeConstans.PROPERTIES_UNIT_ID);
        if (TextUtils.isEmpty(str4)) {
            str4 = eVar.a().get("unit_ids");
            if (!TextUtils.isEmpty(str4)) {
                str4 = str4.replace("[", "").replace("]", "");
            }
        }
        String str5 = str4;
        String str6 = eVar.a().get("ad_type");
        if (TextUtils.isEmpty(str6)) {
            str6 = MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        return b(str, str5, str3, eVar.a().get("token"), str6);
    }

    private synchronized a a(String str) {
        a aVar;
        ad.b("IDErrorUtil", "getErrorInfo : " + str);
        if (!this.f19662c.containsKey(str) || (aVar = this.f19662c.get(str)) == null) {
            return null;
        }
        if (aVar.f19664a == -1) {
            return aVar;
        }
        if (System.currentTimeMillis() > aVar.f19666c + this.f19661b) {
            this.f19662c.remove(str);
            if (this.f19662c.size() > 0) {
                for (Map.Entry<String, a> entry : this.f19662c.entrySet()) {
                    ad.b("IDErrorUtil", "getErrorInfo : delete timeout entry");
                    if (System.currentTimeMillis() - entry.getValue().f19666c > this.f19661b) {
                        this.f19662c.remove(entry.getKey());
                    }
                }
            }
            return null;
        }
        ad.b("IDErrorUtil", "getErrorInfo : " + aVar.f19665b);
        return aVar;
    }
}
