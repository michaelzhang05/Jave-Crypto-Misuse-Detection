package com.mbridge.msdk.foundation.entity;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private String f20326a;

    /* renamed from: b, reason: collision with root package name */
    private String f20327b;

    /* renamed from: c, reason: collision with root package name */
    private String f20328c;

    /* renamed from: d, reason: collision with root package name */
    private int f20329d;

    /* renamed from: e, reason: collision with root package name */
    private int f20330e;

    /* renamed from: f, reason: collision with root package name */
    private String f20331f;

    /* renamed from: g, reason: collision with root package name */
    private String f20332g;

    /* renamed from: h, reason: collision with root package name */
    private String f20333h;

    /* renamed from: i, reason: collision with root package name */
    private int f20334i;

    /* renamed from: j, reason: collision with root package name */
    private String f20335j;

    /* renamed from: k, reason: collision with root package name */
    private int f20336k;

    /* renamed from: l, reason: collision with root package name */
    private int f20337l;

    /* renamed from: m, reason: collision with root package name */
    private String f20338m;

    /* renamed from: n, reason: collision with root package name */
    private int f20339n;

    /* renamed from: o, reason: collision with root package name */
    private String f20340o;

    /* renamed from: p, reason: collision with root package name */
    private String f20341p;

    /* renamed from: q, reason: collision with root package name */
    private int f20342q;

    /* renamed from: r, reason: collision with root package name */
    private String f20343r;

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
            String str = next.f20343r;
            if (!TextUtils.isEmpty(str)) {
                String str2 = com.mbridge.msdk.foundation.controller.a.f20108b.get(str);
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
                sb.append("rid=" + next.f20340o);
                sb.append("&rid_n=" + next.f20341p);
                sb.append("&network_type=" + next.f20339n);
                sb.append("&network_str=" + next.f20338m);
                sb.append("&cid=" + next.f20326a);
                sb.append("&click_type=" + next.f20329d);
                sb.append("&type=" + next.f20342q);
                sb.append("&click_duration=" + next.f20327b);
                sb.append("&key=2000013");
                sb.append("&unit_id=" + next.f20343r);
                sb.append("&last_url=" + next.f20335j);
                sb.append("&content=" + next.f20331f);
                sb.append("&code=" + next.f20330e);
                sb.append("&exception=" + next.f20332g);
                sb.append("&header=" + next.f20333h);
                sb.append("&landing_type=" + next.f20334i);
                sb.append("&link_type=" + next.f20336k);
                sb.append("&click_time=" + next.f20328c + "\n");
            } else {
                sb.append("rid=" + next.f20340o);
                sb.append("&rid_n=" + next.f20341p);
                sb.append("&cid=" + next.f20326a);
                sb.append("&click_type=" + next.f20329d);
                sb.append("&type=" + next.f20342q);
                sb.append("&click_duration=" + next.f20327b);
                sb.append("&key=2000013");
                sb.append("&unit_id=" + next.f20343r);
                sb.append("&last_url=" + next.f20335j);
                sb.append("&content=" + next.f20331f);
                sb.append("&code=" + next.f20330e);
                sb.append("&exception=" + next.f20332g);
                sb.append("&header=" + next.f20333h);
                sb.append("&landing_type=" + next.f20334i);
                sb.append("&link_type=" + next.f20336k);
                sb.append("&click_time=" + next.f20328c + "\n");
            }
            it = it2;
        }
        return sb.toString();
    }

    public final void b(String str) {
        this.f20340o = str;
    }

    public final void c(String str) {
        this.f20338m = str;
    }

    public final void d(String str) {
        this.f20332g = str;
    }

    public final void e(int i8) {
        this.f20336k = i8;
    }

    public final void f(String str) {
        this.f20333h = str;
    }

    public final void g(String str) {
        this.f20331f = str;
    }

    public final void h(String str) {
        this.f20335j = str;
    }

    public final void i(String str) {
        this.f20327b = str;
    }

    public final void j(String str) {
        this.f20326a = str;
    }

    public final void k(String str) {
        this.f20341p = str;
    }

    public final String toString() {
        return "ClickTime [campaignId=" + this.f20326a + ", click_duration=" + this.f20327b + ", lastUrl=" + this.f20335j + ", code=" + this.f20330e + ", excepiton=" + this.f20332g + ", header=" + this.f20333h + ", content=" + this.f20331f + ", type=" + this.f20342q + ", click_type=" + this.f20329d + "]";
    }

    public e(String str, String str2, String str3, String str4, String str5, int i8, String str6, String str7, String str8, int i9, int i10, String str9, int i11, int i12, String str10, int i13, int i14, String str11) {
        this.f20340o = str;
        this.f20341p = str2;
        this.f20326a = str3;
        this.f20327b = str4;
        this.f20335j = str5;
        this.f20330e = i8;
        this.f20332g = str6;
        this.f20333h = str7;
        this.f20331f = str8;
        this.f20342q = i9;
        this.f20329d = i10;
        this.f20343r = str9;
        this.f20334i = i11;
        this.f20336k = i12;
        this.f20328c = str10;
        this.f20339n = i13;
        this.f20338m = str11;
        this.f20337l = i14;
    }

    public final void b(int i8) {
        this.f20329d = i8;
    }

    public final void c(int i8) {
        this.f20342q = i8;
    }

    public final void d(int i8) {
        this.f20334i = i8;
    }

    public final void e(String str) {
        this.f20328c = str;
    }

    public final void f(int i8) {
        this.f20330e = i8;
    }

    public final void a(String str) {
        this.f20343r = str;
    }

    public final void a(int i8) {
        this.f20339n = i8;
    }

    public static String a(e eVar) {
        if (eVar == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String str = eVar.f20335j;
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            sb.append("rid=" + eVar.f20340o);
            sb.append("&rid_n=" + eVar.f20341p);
            sb.append("&network_type=" + eVar.f20339n);
            sb.append("&network_str=" + eVar.f20338m);
            sb.append("&click_type=" + eVar.f20329d);
            sb.append("&type=" + eVar.f20342q);
            sb.append("&cid=" + eVar.f20326a);
            sb.append("&click_duration=" + eVar.f20327b);
            sb.append("&key=2000012");
            sb.append("&unit_id=" + eVar.f20343r);
            sb.append("&last_url=" + str);
            sb.append("&code=" + eVar.f20330e);
            sb.append("&exception=" + eVar.f20332g);
            sb.append("&landing_type=" + eVar.f20334i);
            sb.append("&link_type=" + eVar.f20336k);
            sb.append("&click_time=" + eVar.f20328c + "\n");
        } else {
            sb.append("rid=" + eVar.f20340o);
            sb.append("&rid_n=" + eVar.f20341p);
            sb.append("&click_type=" + eVar.f20329d);
            sb.append("&type=" + eVar.f20342q);
            sb.append("&cid=" + eVar.f20326a);
            sb.append("&click_duration=" + eVar.f20327b);
            sb.append("&key=2000012");
            sb.append("&unit_id=" + eVar.f20343r);
            sb.append("&last_url=" + str);
            sb.append("&code=" + eVar.f20330e);
            sb.append("&exception=" + eVar.f20332g);
            sb.append("&landing_type=" + eVar.f20334i);
            sb.append("&link_type=" + eVar.f20336k);
            sb.append("&click_time=" + eVar.f20328c + "\n");
        }
        return sb.toString();
    }
}
