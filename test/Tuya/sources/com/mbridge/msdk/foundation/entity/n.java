package com.mbridge.msdk.foundation.entity;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.z;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static int f19348a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static int f19349b;

    /* renamed from: A, reason: collision with root package name */
    private String f19350A;

    /* renamed from: B, reason: collision with root package name */
    private String f19351B;

    /* renamed from: C, reason: collision with root package name */
    private String f19352C;

    /* renamed from: D, reason: collision with root package name */
    private String f19353D;

    /* renamed from: E, reason: collision with root package name */
    private int f19354E;

    /* renamed from: F, reason: collision with root package name */
    private String f19355F;

    /* renamed from: G, reason: collision with root package name */
    private String f19356G;

    /* renamed from: I, reason: collision with root package name */
    private String f19358I;

    /* renamed from: J, reason: collision with root package name */
    private String f19359J;

    /* renamed from: K, reason: collision with root package name */
    private String f19360K;

    /* renamed from: L, reason: collision with root package name */
    private int f19361L;

    /* renamed from: M, reason: collision with root package name */
    private long f19362M;

    /* renamed from: N, reason: collision with root package name */
    private String f19363N;

    /* renamed from: O, reason: collision with root package name */
    private int f19364O;

    /* renamed from: d, reason: collision with root package name */
    private String f19366d;

    /* renamed from: e, reason: collision with root package name */
    private int f19367e;

    /* renamed from: g, reason: collision with root package name */
    private int f19369g;

    /* renamed from: h, reason: collision with root package name */
    private String f19370h;

    /* renamed from: i, reason: collision with root package name */
    private String f19371i;

    /* renamed from: j, reason: collision with root package name */
    private String f19372j;

    /* renamed from: k, reason: collision with root package name */
    private String f19373k;

    /* renamed from: l, reason: collision with root package name */
    private String f19374l;

    /* renamed from: m, reason: collision with root package name */
    private String f19375m;

    /* renamed from: n, reason: collision with root package name */
    private String f19376n;

    /* renamed from: o, reason: collision with root package name */
    private String f19377o;

    /* renamed from: p, reason: collision with root package name */
    private String f19378p;

    /* renamed from: q, reason: collision with root package name */
    private String f19379q;

    /* renamed from: r, reason: collision with root package name */
    private int f19380r;

    /* renamed from: s, reason: collision with root package name */
    private String f19381s;

    /* renamed from: t, reason: collision with root package name */
    private String f19382t;

    /* renamed from: u, reason: collision with root package name */
    private String f19383u;

    /* renamed from: w, reason: collision with root package name */
    private int f19385w;

    /* renamed from: x, reason: collision with root package name */
    private String f19386x;

    /* renamed from: y, reason: collision with root package name */
    private String f19387y;

    /* renamed from: z, reason: collision with root package name */
    private String f19388z;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f19365c = null;

    /* renamed from: f, reason: collision with root package name */
    private int f19368f = 0;

    /* renamed from: v, reason: collision with root package name */
    private int f19384v = 0;

    /* renamed from: H, reason: collision with root package name */
    private int f19357H = 0;

    public n(String str, int i8, int i9, int i10, int i11, String str2, String str3, int i12, String str4, int i13, String str5) {
        this.f19381s = str;
        this.f19385w = i8;
        this.f19386x = str5;
        this.f19380r = i9;
        this.f19364O = i10;
        this.f19361L = i11;
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.f19387y = URLEncoder.encode(str2, "utf-8");
            }
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
        }
        this.f19388z = str3;
        this.f19354E = i12;
        this.f19373k = str4;
        this.f19362M = i13;
    }

    public static String a(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<n> it = list.iterator();
        while (it.hasNext()) {
            n next = it.next();
            if (next.f19352C != null) {
                stringBuffer.append("resource_type=" + next.f19352C + "&");
            }
            if (next.f19371i != null) {
                stringBuffer.append("creative=" + next.f19371i + "&");
            }
            Iterator<n> it2 = it;
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + next.f19381s + "&");
                stringBuffer.append("network_type=" + next.f19385w + "&");
                stringBuffer.append("network_str=" + next.f19386x + "&");
                stringBuffer.append("result=" + next.f19354E + "&");
                stringBuffer.append("duration=" + next.f19373k + "&");
                stringBuffer.append("video_size=" + next.f19362M + "&");
                stringBuffer.append("video_length=" + next.f19361L + "&");
                stringBuffer.append("reason=" + next.h() + "&");
                stringBuffer.append("cid=" + next.f19370h + "&");
                stringBuffer.append("video_url=" + next.f19363N + "&");
                stringBuffer.append("rid=" + next.f19350A + "&");
                stringBuffer.append("rid_n=" + next.f19351B + "&");
                stringBuffer.append("unit_id=" + next.f19360K + "&");
                StringBuilder sb = new StringBuilder();
                sb.append("offer_url=");
                sb.append(next.f19387y);
                stringBuffer.append(sb.toString());
                stringBuffer.append("\n");
            } else {
                stringBuffer.append("key=" + next.f19381s + "&");
                stringBuffer.append("result=" + next.f19354E + "&");
                stringBuffer.append("duration=" + next.f19373k + "&");
                stringBuffer.append("video_size=" + next.f19362M + "&");
                stringBuffer.append("video_length=" + next.f19361L + "&");
                stringBuffer.append("reason=" + next.h() + "&");
                stringBuffer.append("cid=" + next.f19370h + "&");
                stringBuffer.append("video_url=" + next.f19363N + "&");
                stringBuffer.append("rid=" + next.f19350A + "&");
                stringBuffer.append("rid_n=" + next.f19351B + "&");
                stringBuffer.append("unit_id=" + next.f19360K + "&");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("offer_url=");
                sb2.append(next.f19387y);
                stringBuffer.append(sb2.toString());
                stringBuffer.append("\n");
            }
            it = it2;
        }
        return stringBuffer.toString();
    }

    public static String b(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (n nVar : list) {
            stringBuffer.append("key=" + nVar.f19381s + "&");
            stringBuffer.append("result=" + nVar.f19354E + "&");
            stringBuffer.append("duration=" + nVar.f19373k + "&");
            stringBuffer.append("endcard_url=" + nVar.f19375m + "&");
            stringBuffer.append("cid=" + nVar.f19370h + "&");
            stringBuffer.append("unit_id=" + nVar.f19360K + "&");
            stringBuffer.append("reason=" + nVar.h() + "&");
            stringBuffer.append("ad_type=" + nVar.f19366d + "&");
            stringBuffer.append("rid=" + nVar.f19350A + "&");
            stringBuffer.append("rid_n=" + nVar.f19351B + "&");
            stringBuffer.append("type=" + nVar.f19374l + "&");
            StringBuilder sb = new StringBuilder();
            sb.append("adspace_t=");
            sb.append(nVar.f19367e);
            stringBuffer.append(sb.toString());
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    public static String c(List<n> list) {
        if (list == null) {
            return null;
        }
        try {
            if (list.size() <= 0) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<n> it = list.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next().f19378p);
                stringBuffer.append("\n");
            }
            return stringBuffer.toString();
        } catch (Throwable th) {
            ad.a("VideoReportData", th.getMessage(), th);
            return null;
        }
    }

    public static String d(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (n nVar : list) {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + nVar.f19381s + "&");
                stringBuffer.append("network_type=" + nVar.f19385w + "&");
                stringBuffer.append("cid=" + nVar.f19370h + "&");
                stringBuffer.append("image_url=" + nVar.f19379q + "&");
                stringBuffer.append("reason=" + nVar.h() + "&");
                stringBuffer.append("rid=" + nVar.f19350A + "&");
                stringBuffer.append("rid_n=" + nVar.f19351B + "&");
                stringBuffer.append("unit_id=" + nVar.f19360K + "&");
                stringBuffer.append("\n");
            } else {
                stringBuffer.append("key=" + nVar.f19381s + "&");
                stringBuffer.append("cid=" + nVar.f19370h + "&");
                stringBuffer.append("image_url=" + nVar.f19379q + "&");
                stringBuffer.append("reason=" + nVar.h() + "&");
                stringBuffer.append("rid=" + nVar.f19350A + "&");
                stringBuffer.append("rid_n=" + nVar.f19351B + "&");
                stringBuffer.append("unit_id=" + nVar.f19360K + "&");
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    public static String e(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (n nVar : list) {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + nVar.f19381s + "&");
                stringBuffer.append("network_type=" + nVar.f19385w + "&");
                stringBuffer.append("network_str=" + nVar.f19386x + "&");
                stringBuffer.append("reason=" + nVar.h() + "&");
                stringBuffer.append("cid=" + nVar.f19370h + "&");
                stringBuffer.append("video_url=" + nVar.f19363N + "&");
                stringBuffer.append("rid=" + nVar.f19350A + "&");
                stringBuffer.append("rid_n=" + nVar.f19351B + "&");
                stringBuffer.append("unit_id=" + nVar.f19360K + "&");
                StringBuilder sb = new StringBuilder();
                sb.append("offer_url=");
                sb.append(nVar.f19387y);
                stringBuffer.append(sb.toString());
                stringBuffer.append("\n");
            } else {
                stringBuffer.append("key=" + nVar.f19381s + "&");
                stringBuffer.append("reason=" + nVar.h() + "&");
                stringBuffer.append("cid=" + nVar.f19370h + "&");
                stringBuffer.append("video_url=" + nVar.f19363N + "&");
                stringBuffer.append("rid=" + nVar.f19350A + "&");
                stringBuffer.append("rid_n=" + nVar.f19351B + "&");
                stringBuffer.append("unit_id=" + nVar.f19360K + "&");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("offer_url=");
                sb2.append(nVar.f19387y);
                stringBuffer.append(sb2.toString());
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    public static String f(n nVar) {
        if (nVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + nVar.f19381s + "&");
        stringBuffer.append("cid=" + nVar.f19370h + "&");
        stringBuffer.append("unit_id=" + nVar.f19360K + "&");
        stringBuffer.append("network_type=" + nVar.f19385w + "&");
        stringBuffer.append("mraid_type=" + nVar.f19384v + "&");
        stringBuffer.append("rid_n=" + nVar.f19351B + "&");
        StringBuilder sb = new StringBuilder();
        sb.append("rid=");
        sb.append(nVar.f19350A);
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }

    public static String g(n nVar) {
        if (nVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + nVar.f19381s + "&");
        stringBuffer.append("result=" + nVar.f19354E + "&");
        stringBuffer.append("duration=" + nVar.f19373k + "&");
        stringBuffer.append("cid=" + nVar.f19370h + "&");
        stringBuffer.append("reason=" + nVar.h() + "&");
        stringBuffer.append("ad_type=" + nVar.f19366d + "&");
        stringBuffer.append("unit_id=" + nVar.f19360K + "&");
        stringBuffer.append("devid=" + nVar.f19372j + "&");
        stringBuffer.append("mraid_type=" + nVar.f19384v + "&");
        stringBuffer.append("network_type=" + nVar.f19385w + "&");
        if (!TextUtils.isEmpty(nVar.f19375m)) {
            stringBuffer.append("endcard_url=" + nVar.f19375m + "&");
        }
        if (!TextUtils.isEmpty(nVar.f19374l)) {
            stringBuffer.append("type=" + nVar.f19374l + "&");
        }
        if (nVar.f19352C != null) {
            stringBuffer.append("resource_type=" + nVar.f19352C + "&");
        }
        stringBuffer.append("rid_n=" + nVar.f19351B + "&");
        StringBuilder sb = new StringBuilder();
        sb.append("rid=");
        sb.append(nVar.f19350A);
        stringBuffer.append(sb.toString());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    public static String h(n nVar) {
        if (nVar == null) {
            return null;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + nVar.f19381s + "&");
                stringBuffer.append("error=" + ai.a(nVar.f19376n) + "&");
                stringBuffer.append("template_url=" + ai.a(nVar.f19358I) + "&");
                stringBuffer.append("unit_id=" + ai.a(nVar.f19360K) + "&");
                stringBuffer.append("cid=" + ai.a(nVar.f19370h) + "&");
                stringBuffer.append("network_str=" + nVar.f19386x + "&");
                StringBuilder sb = new StringBuilder();
                sb.append("network_type=");
                sb.append(nVar.f19385w);
                stringBuffer.append(sb.toString());
            } else {
                stringBuffer.append("key=" + nVar.f19381s + "&");
                stringBuffer.append("error=" + ai.a(nVar.f19376n) + "&");
                stringBuffer.append("template_url=" + ai.a(nVar.f19358I) + "&");
                stringBuffer.append("unit_id=" + ai.a(nVar.f19360K) + "&");
                stringBuffer.append("cid=" + ai.a(nVar.f19370h) + "&");
            }
            return stringBuffer.toString();
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public final int A() {
        return this.f19357H;
    }

    public final String i() {
        return this.f19371i;
    }

    public final String j() {
        return this.f19372j;
    }

    public final int k() {
        return this.f19385w;
    }

    public final String l() {
        return this.f19386x;
    }

    public final int m() {
        return this.f19354E;
    }

    public final String n() {
        return this.f19373k;
    }

    public final long o() {
        return this.f19362M;
    }

    public final int p() {
        return this.f19361L;
    }

    public final String q() {
        return this.f19363N;
    }

    public final String r() {
        return this.f19387y;
    }

    public final String s() {
        return this.f19375m;
    }

    public final String t() {
        return this.f19374l;
    }

    public final String toString() {
        return "RewardReportData [key=" + this.f19381s + ", networkType=" + this.f19385w + ", isCompleteView=" + this.f19380r + ", watchedMillis=" + this.f19364O + ", videoLength=" + this.f19361L + ", offerUrl=" + this.f19387y + ", reason=" + this.f19388z + ", result=" + this.f19354E + ", duration=" + this.f19373k + ", videoSize=" + this.f19362M + "]";
    }

    public final int u() {
        return this.f19367e;
    }

    public final String v() {
        return this.f19379q;
    }

    public final int w() {
        return this.f19380r;
    }

    public final int x() {
        return this.f19364O;
    }

    public final int y() {
        return this.f19384v;
    }

    public final String z() {
        return this.f19358I;
    }

    public final void i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f19371i = URLEncoder.encode(str);
    }

    public final void j(String str) {
        this.f19372j = str;
    }

    public final void k(String str) {
        this.f19386x = str;
    }

    public final void l(String str) {
        this.f19373k = str;
    }

    public final void m(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f19363N = URLEncoder.encode(str, "utf-8");
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void n(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f19375m = URLEncoder.encode(str, "utf-8");
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void o(String str) {
        this.f19374l = str;
    }

    public final void p(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f19379q = URLEncoder.encode(str, "utf-8");
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void q(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f19358I = URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
        }
    }

    public final void r(String str) {
        this.f19376n = str;
    }

    public final void s(String str) {
        this.f19383u = str;
    }

    public final void t(String str) {
        this.f19353D = str;
    }

    public final void u(String str) {
        this.f19355F = str;
    }

    public final void v(String str) {
        this.f19356G = str;
    }

    public static String c(n nVar) {
        if (nVar != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=" + nVar.f19381s + "&");
            stringBuffer.append("cid=" + nVar.f19370h + "&");
            stringBuffer.append("rid=" + nVar.f19350A + "&");
            stringBuffer.append("rid_n=" + nVar.f19351B + "&");
            stringBuffer.append("unit_id=" + nVar.f19360K + "&");
            stringBuffer.append("reason=" + nVar.h() + "&");
            stringBuffer.append("case=" + nVar.f19369g + "&");
            StringBuilder sb = new StringBuilder();
            sb.append("network_type=");
            sb.append(nVar.f19385w);
            stringBuffer.append(sb.toString());
            return stringBuffer.toString();
        }
        return "";
    }

    public static String f(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (n nVar : list) {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + nVar.f19381s + "&");
                stringBuffer.append("network_type=" + nVar.f19385w + "&");
                stringBuffer.append("result=" + nVar.f19354E + "&");
                stringBuffer.append("cid=" + nVar.f19370h + "&");
                stringBuffer.append("template_url=" + nVar.f19358I + "&");
                stringBuffer.append("reason=" + nVar.h() + "&");
                stringBuffer.append("rid=" + nVar.f19350A + "&");
                stringBuffer.append("rid_n=" + nVar.f19351B + "&");
                stringBuffer.append("unit_id=" + nVar.f19360K + "&");
                stringBuffer.append("\n");
            } else {
                stringBuffer.append("key=" + nVar.f19381s + "&");
                stringBuffer.append("result=" + nVar.f19354E + "&");
                stringBuffer.append("cid=" + nVar.f19370h + "&");
                stringBuffer.append("template_url=" + nVar.f19358I + "&");
                stringBuffer.append("reason=" + nVar.h() + "&");
                stringBuffer.append("rid=" + nVar.f19350A + "&");
                stringBuffer.append("rid_n=" + nVar.f19351B + "&");
                stringBuffer.append("unit_id=" + nVar.f19360K + "&");
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    public n() {
    }

    public n(String str, int i8, String str2, String str3, String str4) {
        this.f19381s = str;
        this.f19386x = str4;
        this.f19385w = i8;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f19387y = URLEncoder.encode(str2, "utf-8");
            } catch (UnsupportedEncodingException e8) {
                e8.printStackTrace();
            }
        }
        this.f19388z = str3;
    }

    public final String c() {
        return this.f19360K;
    }

    public final void c(String str) {
        this.f19360K = str;
    }

    public static String b(n nVar) {
        if (nVar != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=" + nVar.f19381s + "&");
            stringBuffer.append("cid=" + nVar.f19370h + "&");
            stringBuffer.append("rid=" + nVar.f19350A + "&");
            stringBuffer.append("rid_n=" + nVar.f19351B + "&");
            stringBuffer.append("unit_id=" + nVar.f19360K + "&");
            stringBuffer.append("network_type=" + nVar.f19385w + "&");
            stringBuffer.append("mraid_type=" + nVar.f19384v + "&");
            stringBuffer.append("platform=1");
            return stringBuffer.toString();
        }
        return "";
    }

    public final void c(int i8) {
        this.f19367e = i8;
    }

    public final String h() {
        return TextUtils.isEmpty(this.f19388z) ? "" : this.f19388z;
    }

    public final void h(String str) {
        this.f19388z = str;
    }

    public static String d(n nVar) {
        if (nVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + nVar.f19381s + "&");
        stringBuffer.append("cid=" + nVar.f19370h + "&");
        stringBuffer.append("unit_id=" + nVar.f19360K + "&");
        stringBuffer.append("network_type=" + nVar.f19385w + "&");
        stringBuffer.append("rid=" + nVar.f19350A + "&");
        stringBuffer.append("rid_n=" + nVar.f19351B + "&");
        StringBuilder sb = new StringBuilder();
        sb.append("reason=");
        sb.append(nVar.h());
        stringBuffer.append(sb.toString());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    public n(String str, int i8, int i9, String str2, int i10, String str3, int i11, String str4) {
        this.f19381s = str;
        this.f19385w = i8;
        this.f19386x = str4;
        this.f19361L = i9;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f19387y = URLEncoder.encode(str2, "utf-8");
            } catch (UnsupportedEncodingException e8) {
                e8.printStackTrace();
            }
        }
        this.f19354E = i10;
        this.f19373k = str3;
        this.f19362M = i11;
    }

    public static String e(n nVar) {
        if (nVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + nVar.f19381s + "&");
        stringBuffer.append("result=" + nVar.f19354E + "&");
        stringBuffer.append("duration=" + nVar.f19373k + "&");
        stringBuffer.append("cid=" + nVar.f19370h + "&");
        stringBuffer.append("unit_id=" + nVar.f19360K + "&");
        stringBuffer.append("reason=" + nVar.h() + "&");
        stringBuffer.append("ad_type=" + nVar.f19366d + "&");
        stringBuffer.append("rid=" + nVar.f19350A + "&");
        stringBuffer.append("rid_n=" + nVar.f19351B + "&");
        stringBuffer.append("network_type=" + nVar.f19385w + "&");
        stringBuffer.append("mraid_type=" + nVar.f19384v + "&");
        stringBuffer.append("devid=" + nVar.f19372j + "&");
        if (nVar.f19352C != null) {
            stringBuffer.append("resource_type=" + nVar.f19352C + "&");
        }
        if (!TextUtils.isEmpty(nVar.f19375m)) {
            stringBuffer.append("endcard_url=" + nVar.f19375m + "&");
        }
        stringBuffer.append("type=" + nVar.f19374l);
        return stringBuffer.toString();
    }

    public final String g() {
        return this.f19351B;
    }

    public final void g(String str) {
        this.f19351B = str;
    }

    public final String b() {
        return this.f19352C;
    }

    public final void b(String str) {
        this.f19352C = str;
    }

    public final void b(int i8) {
        this.f19354E = i8;
    }

    public final String b(String str, String str2) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || (map = this.f19365c) == null) {
            return str2;
        }
        try {
            String str3 = map.get(str);
            return TextUtils.isEmpty(str3) ? str2 : str3;
        } catch (Exception unused) {
            return str2;
        }
    }

    public final String d() {
        return this.f19366d;
    }

    public final void d(String str) {
        this.f19366d = str;
    }

    public n(Context context, CampaignEx campaignEx, int i8, String str, long j8, int i9) {
        if (i9 == 1 || i9 == 287 || i9 == 94) {
            this.f19381s = "m_download_end";
        } else if (i9 == 95) {
            this.f19381s = "2000025";
        }
        int l8 = z.l(context);
        this.f19385w = l8;
        this.f19386x = z.a(context, l8);
        this.f19361L = campaignEx.getVideoLength();
        this.f19350A = campaignEx.getRequestId();
        this.f19351B = campaignEx.getRequestIdNotice();
        if (!TextUtils.isEmpty(this.f19387y)) {
            try {
                this.f19387y = URLEncoder.encode(campaignEx.getNoticeUrl() == null ? campaignEx.getClickURL() : campaignEx.getNoticeUrl(), "utf-8");
            } catch (UnsupportedEncodingException e8) {
                e8.printStackTrace();
            }
        }
        this.f19354E = i8;
        this.f19373k = str;
        this.f19362M = j8 == 0 ? campaignEx.getVideoSize() : j8;
    }

    public final void d(int i8) {
        this.f19384v = i8;
    }

    public final String f() {
        return this.f19350A;
    }

    public final void f(String str) {
        this.f19350A = str;
    }

    public static String a(n nVar) {
        if (nVar == null) {
            return null;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + nVar.f19381s + "&");
                stringBuffer.append("event=" + ai.a(nVar.f19377o) + "&");
                stringBuffer.append("template=" + ai.a(nVar.f19359J) + "&");
                stringBuffer.append("layout=" + ai.a(nVar.f19382t) + "&");
                stringBuffer.append("unit_id=" + ai.a(nVar.f19360K) + "&");
                stringBuffer.append("cid=" + ai.a(nVar.f19370h) + "&");
                stringBuffer.append("network_str=" + nVar.f19386x + "&");
                StringBuilder sb = new StringBuilder();
                sb.append("network_type=");
                sb.append(nVar.f19385w);
                stringBuffer.append(sb.toString());
            } else {
                stringBuffer.append("key=" + nVar.f19381s + "&");
                stringBuffer.append("event=" + ai.a(nVar.f19377o) + "&");
                stringBuffer.append("template=" + ai.a(nVar.f19359J) + "&");
                stringBuffer.append("layout=" + ai.a(nVar.f19382t) + "&");
                stringBuffer.append("unit_id=" + ai.a(nVar.f19360K) + "&");
                stringBuffer.append("cid=" + ai.a(nVar.f19370h) + "&");
            }
            return stringBuffer.toString();
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public n(String str, String str2, String str3, String str4, String str5, String str6, int i8, String str7) {
        this.f19381s = str;
        this.f19377o = str2;
        this.f19359J = str3;
        this.f19382t = str4;
        this.f19360K = str5;
        this.f19370h = str6;
        this.f19385w = i8;
        this.f19386x = str7;
    }

    public final String e() {
        return this.f19370h;
    }

    public final void e(String str) {
        this.f19370h = str;
    }

    public final void e(int i8) {
        this.f19357H = i8;
    }

    public n(String str) {
        this.f19378p = str;
    }

    public n(String str, int i8, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f19381s = str;
        this.f19354E = i8;
        this.f19373k = str2;
        try {
            if (!TextUtils.isEmpty(str3)) {
                this.f19375m = URLEncoder.encode(str3, "utf-8");
            }
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
        }
        this.f19370h = str4;
        this.f19360K = str5;
        this.f19388z = str6;
        this.f19374l = str7;
        if (Integer.valueOf(str2).intValue() > com.mbridge.msdk.foundation.same.a.f19400K) {
            this.f19354E = 2;
        }
    }

    public final String a() {
        return this.f19381s;
    }

    public final void a(String str) {
        this.f19381s = str;
    }

    public final void a(int i8) {
        this.f19385w = i8;
    }

    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.f19365c == null) {
            this.f19365c = new HashMap();
        }
        try {
            this.f19365c.put(str, str2);
        } catch (Exception unused) {
        }
    }

    public n(String str, String str2, String str3, String str4, String str5, int i8) {
        this.f19381s = str;
        this.f19370h = str2;
        this.f19350A = str3;
        this.f19351B = str4;
        this.f19360K = str5;
        this.f19385w = i8;
    }

    public n(String str, String str2, String str3, String str4, String str5, int i8, int i9, String str6) {
        this.f19381s = str;
        this.f19370h = str2;
        this.f19350A = str3;
        this.f19351B = str4;
        this.f19360K = str5;
        this.f19385w = i8;
        this.f19388z = str6;
        this.f19369g = i9;
    }
}
