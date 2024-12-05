package com.mbridge.msdk.foundation.entity;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private String f19271a;

    /* renamed from: b, reason: collision with root package name */
    private String f19272b;

    /* renamed from: c, reason: collision with root package name */
    private String f19273c;

    /* renamed from: d, reason: collision with root package name */
    private int f19274d;

    /* renamed from: e, reason: collision with root package name */
    private int f19275e;

    /* renamed from: f, reason: collision with root package name */
    private String f19276f;

    /* renamed from: g, reason: collision with root package name */
    private String f19277g;

    /* renamed from: h, reason: collision with root package name */
    private String f19278h;

    /* renamed from: i, reason: collision with root package name */
    private int f19279i;

    /* renamed from: j, reason: collision with root package name */
    private String f19280j;

    /* renamed from: k, reason: collision with root package name */
    private int f19281k;

    /* renamed from: l, reason: collision with root package name */
    private int f19282l;

    /* renamed from: m, reason: collision with root package name */
    private String f19283m;

    /* renamed from: n, reason: collision with root package name */
    private int f19284n;

    /* renamed from: o, reason: collision with root package name */
    private String f19285o;

    /* renamed from: p, reason: collision with root package name */
    private String f19286p;

    /* renamed from: q, reason: collision with root package name */
    private int f19287q;

    /* renamed from: r, reason: collision with root package name */
    private String f19288r;

    public e() {
    }

    public static String a(List<e> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<e> it = list.iterator();
        while (it.hasNext()) {
            e next = it.next();
            String str = next.f19288r;
            if (!TextUtils.isEmpty(str)) {
                String str2 = com.mbridge.msdk.foundation.controller.a.f19053b.get(str);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("u_stid=");
                if (str2 == null) {
                    str2 = "";
                }
                sb2.append(str2);
                sb2.append("&");
                sb.append(sb2.toString());
            }
            Iterator<e> it2 = it;
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                sb.append("rid=" + next.f19285o);
                sb.append("&rid_n=" + next.f19286p);
                sb.append("&network_type=" + next.f19284n);
                sb.append("&network_str=" + next.f19283m);
                sb.append("&cid=" + next.f19271a);
                sb.append("&click_type=" + next.f19274d);
                sb.append("&type=" + next.f19287q);
                sb.append("&click_duration=" + next.f19272b);
                sb.append("&key=2000013");
                sb.append("&unit_id=" + next.f19288r);
                sb.append("&last_url=" + next.f19280j);
                sb.append("&content=" + next.f19276f);
                sb.append("&code=" + next.f19275e);
                sb.append("&exception=" + next.f19277g);
                sb.append("&header=" + next.f19278h);
                sb.append("&landing_type=" + next.f19279i);
                sb.append("&link_type=" + next.f19281k);
                sb.append("&click_time=" + next.f19273c + "\n");
            } else {
                sb.append("rid=" + next.f19285o);
                sb.append("&rid_n=" + next.f19286p);
                sb.append("&cid=" + next.f19271a);
                sb.append("&click_type=" + next.f19274d);
                sb.append("&type=" + next.f19287q);
                sb.append("&click_duration=" + next.f19272b);
                sb.append("&key=2000013");
                sb.append("&unit_id=" + next.f19288r);
                sb.append("&last_url=" + next.f19280j);
                sb.append("&content=" + next.f19276f);
                sb.append("&code=" + next.f19275e);
                sb.append("&exception=" + next.f19277g);
                sb.append("&header=" + next.f19278h);
                sb.append("&landing_type=" + next.f19279i);
                sb.append("&link_type=" + next.f19281k);
                sb.append("&click_time=" + next.f19273c + "\n");
            }
            it = it2;
        }
        return sb.toString();
    }

    public final void b(String str) {
        this.f19285o = str;
    }

    public final void c(String str) {
        this.f19283m = str;
    }

    public final void d(String str) {
        this.f19277g = str;
    }

    public final void e(int i8) {
        this.f19281k = i8;
    }

    public final void f(String str) {
        this.f19278h = str;
    }

    public final void g(String str) {
        this.f19276f = str;
    }

    public final void h(String str) {
        this.f19280j = str;
    }

    public final void i(String str) {
        this.f19272b = str;
    }

    public final void j(String str) {
        this.f19271a = str;
    }

    public final void k(String str) {
        this.f19286p = str;
    }

    public final String toString() {
        return "ClickTime [campaignId=" + this.f19271a + ", click_duration=" + this.f19272b + ", lastUrl=" + this.f19280j + ", code=" + this.f19275e + ", excepiton=" + this.f19277g + ", header=" + this.f19278h + ", content=" + this.f19276f + ", type=" + this.f19287q + ", click_type=" + this.f19274d + "]";
    }

    public e(String str, String str2, String str3, String str4, String str5, int i8, String str6, String str7, String str8, int i9, int i10, String str9, int i11, int i12, String str10, int i13, int i14, String str11) {
        this.f19285o = str;
        this.f19286p = str2;
        this.f19271a = str3;
        this.f19272b = str4;
        this.f19280j = str5;
        this.f19275e = i8;
        this.f19277g = str6;
        this.f19278h = str7;
        this.f19276f = str8;
        this.f19287q = i9;
        this.f19274d = i10;
        this.f19288r = str9;
        this.f19279i = i11;
        this.f19281k = i12;
        this.f19273c = str10;
        this.f19284n = i13;
        this.f19283m = str11;
        this.f19282l = i14;
    }

    public final void b(int i8) {
        this.f19274d = i8;
    }

    public final void c(int i8) {
        this.f19287q = i8;
    }

    public final void d(int i8) {
        this.f19279i = i8;
    }

    public final void e(String str) {
        this.f19273c = str;
    }

    public final void f(int i8) {
        this.f19275e = i8;
    }

    public final void a(String str) {
        this.f19288r = str;
    }

    public final void a(int i8) {
        this.f19284n = i8;
    }

    public static String a(e eVar) {
        if (eVar == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String str = eVar.f19280j;
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            sb.append("rid=" + eVar.f19285o);
            sb.append("&rid_n=" + eVar.f19286p);
            sb.append("&network_type=" + eVar.f19284n);
            sb.append("&network_str=" + eVar.f19283m);
            sb.append("&click_type=" + eVar.f19274d);
            sb.append("&type=" + eVar.f19287q);
            sb.append("&cid=" + eVar.f19271a);
            sb.append("&click_duration=" + eVar.f19272b);
            sb.append("&key=2000012");
            sb.append("&unit_id=" + eVar.f19288r);
            sb.append("&last_url=" + str);
            sb.append("&code=" + eVar.f19275e);
            sb.append("&exception=" + eVar.f19277g);
            sb.append("&landing_type=" + eVar.f19279i);
            sb.append("&link_type=" + eVar.f19281k);
            sb.append("&click_time=" + eVar.f19273c + "\n");
        } else {
            sb.append("rid=" + eVar.f19285o);
            sb.append("&rid_n=" + eVar.f19286p);
            sb.append("&click_type=" + eVar.f19274d);
            sb.append("&type=" + eVar.f19287q);
            sb.append("&cid=" + eVar.f19271a);
            sb.append("&click_duration=" + eVar.f19272b);
            sb.append("&key=2000012");
            sb.append("&unit_id=" + eVar.f19288r);
            sb.append("&last_url=" + str);
            sb.append("&code=" + eVar.f19275e);
            sb.append("&exception=" + eVar.f19277g);
            sb.append("&landing_type=" + eVar.f19279i);
            sb.append("&link_type=" + eVar.f19281k);
            sb.append("&click_time=" + eVar.f19273c + "\n");
        }
        return sb.toString();
    }
}
