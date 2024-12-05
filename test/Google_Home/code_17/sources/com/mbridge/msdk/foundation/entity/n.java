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
    public static int f20403a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static int f20404b;

    /* renamed from: A, reason: collision with root package name */
    private String f20405A;

    /* renamed from: B, reason: collision with root package name */
    private String f20406B;

    /* renamed from: C, reason: collision with root package name */
    private String f20407C;

    /* renamed from: D, reason: collision with root package name */
    private String f20408D;

    /* renamed from: E, reason: collision with root package name */
    private int f20409E;

    /* renamed from: F, reason: collision with root package name */
    private String f20410F;

    /* renamed from: G, reason: collision with root package name */
    private String f20411G;

    /* renamed from: I, reason: collision with root package name */
    private String f20413I;

    /* renamed from: J, reason: collision with root package name */
    private String f20414J;

    /* renamed from: K, reason: collision with root package name */
    private String f20415K;

    /* renamed from: L, reason: collision with root package name */
    private int f20416L;

    /* renamed from: M, reason: collision with root package name */
    private long f20417M;

    /* renamed from: N, reason: collision with root package name */
    private String f20418N;

    /* renamed from: O, reason: collision with root package name */
    private int f20419O;

    /* renamed from: d, reason: collision with root package name */
    private String f20421d;

    /* renamed from: e, reason: collision with root package name */
    private int f20422e;

    /* renamed from: g, reason: collision with root package name */
    private int f20424g;

    /* renamed from: h, reason: collision with root package name */
    private String f20425h;

    /* renamed from: i, reason: collision with root package name */
    private String f20426i;

    /* renamed from: j, reason: collision with root package name */
    private String f20427j;

    /* renamed from: k, reason: collision with root package name */
    private String f20428k;

    /* renamed from: l, reason: collision with root package name */
    private String f20429l;

    /* renamed from: m, reason: collision with root package name */
    private String f20430m;

    /* renamed from: n, reason: collision with root package name */
    private String f20431n;

    /* renamed from: o, reason: collision with root package name */
    private String f20432o;

    /* renamed from: p, reason: collision with root package name */
    private String f20433p;

    /* renamed from: q, reason: collision with root package name */
    private String f20434q;

    /* renamed from: r, reason: collision with root package name */
    private int f20435r;

    /* renamed from: s, reason: collision with root package name */
    private String f20436s;

    /* renamed from: t, reason: collision with root package name */
    private String f20437t;

    /* renamed from: u, reason: collision with root package name */
    private String f20438u;

    /* renamed from: w, reason: collision with root package name */
    private int f20440w;

    /* renamed from: x, reason: collision with root package name */
    private String f20441x;

    /* renamed from: y, reason: collision with root package name */
    private String f20442y;

    /* renamed from: z, reason: collision with root package name */
    private String f20443z;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f20420c = null;

    /* renamed from: f, reason: collision with root package name */
    private int f20423f = 0;

    /* renamed from: v, reason: collision with root package name */
    private int f20439v = 0;

    /* renamed from: H, reason: collision with root package name */
    private int f20412H = 0;

    public n(String str, int i8, int i9, int i10, int i11, String str2, String str3, int i12, String str4, int i13, String str5) {
        this.f20436s = str;
        this.f20440w = i8;
        this.f20441x = str5;
        this.f20435r = i9;
        this.f20419O = i10;
        this.f20416L = i11;
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.f20442y = URLEncoder.encode(str2, "utf-8");
            }
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
        }
        this.f20443z = str3;
        this.f20409E = i12;
        this.f20428k = str4;
        this.f20417M = i13;
    }

    public static String a(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<n> it = list.iterator();
        while (it.hasNext()) {
            n next = it.next();
            if (next.f20407C != null) {
                stringBuffer.append("resource_type=" + next.f20407C + "&");
            }
            if (next.f20426i != null) {
                stringBuffer.append("creative=" + next.f20426i + "&");
            }
            Iterator<n> it2 = it;
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + next.f20436s + "&");
                stringBuffer.append("network_type=" + next.f20440w + "&");
                stringBuffer.append("network_str=" + next.f20441x + "&");
                stringBuffer.append("result=" + next.f20409E + "&");
                stringBuffer.append("duration=" + next.f20428k + "&");
                stringBuffer.append("video_size=" + next.f20417M + "&");
                stringBuffer.append("video_length=" + next.f20416L + "&");
                stringBuffer.append("reason=" + next.h() + "&");
                stringBuffer.append("cid=" + next.f20425h + "&");
                stringBuffer.append("video_url=" + next.f20418N + "&");
                stringBuffer.append("rid=" + next.f20405A + "&");
                stringBuffer.append("rid_n=" + next.f20406B + "&");
                stringBuffer.append("unit_id=" + next.f20415K + "&");
                StringBuilder sb = new StringBuilder();
                sb.append("offer_url=");
                sb.append(next.f20442y);
                stringBuffer.append(sb.toString());
                stringBuffer.append("\n");
            } else {
                stringBuffer.append("key=" + next.f20436s + "&");
                stringBuffer.append("result=" + next.f20409E + "&");
                stringBuffer.append("duration=" + next.f20428k + "&");
                stringBuffer.append("video_size=" + next.f20417M + "&");
                stringBuffer.append("video_length=" + next.f20416L + "&");
                stringBuffer.append("reason=" + next.h() + "&");
                stringBuffer.append("cid=" + next.f20425h + "&");
                stringBuffer.append("video_url=" + next.f20418N + "&");
                stringBuffer.append("rid=" + next.f20405A + "&");
                stringBuffer.append("rid_n=" + next.f20406B + "&");
                stringBuffer.append("unit_id=" + next.f20415K + "&");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("offer_url=");
                sb2.append(next.f20442y);
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
            stringBuffer.append("key=" + nVar.f20436s + "&");
            stringBuffer.append("result=" + nVar.f20409E + "&");
            stringBuffer.append("duration=" + nVar.f20428k + "&");
            stringBuffer.append("endcard_url=" + nVar.f20430m + "&");
            stringBuffer.append("cid=" + nVar.f20425h + "&");
            stringBuffer.append("unit_id=" + nVar.f20415K + "&");
            stringBuffer.append("reason=" + nVar.h() + "&");
            stringBuffer.append("ad_type=" + nVar.f20421d + "&");
            stringBuffer.append("rid=" + nVar.f20405A + "&");
            stringBuffer.append("rid_n=" + nVar.f20406B + "&");
            stringBuffer.append("type=" + nVar.f20429l + "&");
            StringBuilder sb = new StringBuilder();
            sb.append("adspace_t=");
            sb.append(nVar.f20422e);
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
                stringBuffer.append(it.next().f20433p);
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
                stringBuffer.append("key=" + nVar.f20436s + "&");
                stringBuffer.append("network_type=" + nVar.f20440w + "&");
                stringBuffer.append("cid=" + nVar.f20425h + "&");
                stringBuffer.append("image_url=" + nVar.f20434q + "&");
                stringBuffer.append("reason=" + nVar.h() + "&");
                stringBuffer.append("rid=" + nVar.f20405A + "&");
                stringBuffer.append("rid_n=" + nVar.f20406B + "&");
                stringBuffer.append("unit_id=" + nVar.f20415K + "&");
                stringBuffer.append("\n");
            } else {
                stringBuffer.append("key=" + nVar.f20436s + "&");
                stringBuffer.append("cid=" + nVar.f20425h + "&");
                stringBuffer.append("image_url=" + nVar.f20434q + "&");
                stringBuffer.append("reason=" + nVar.h() + "&");
                stringBuffer.append("rid=" + nVar.f20405A + "&");
                stringBuffer.append("rid_n=" + nVar.f20406B + "&");
                stringBuffer.append("unit_id=" + nVar.f20415K + "&");
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
                stringBuffer.append("key=" + nVar.f20436s + "&");
                stringBuffer.append("network_type=" + nVar.f20440w + "&");
                stringBuffer.append("network_str=" + nVar.f20441x + "&");
                stringBuffer.append("reason=" + nVar.h() + "&");
                stringBuffer.append("cid=" + nVar.f20425h + "&");
                stringBuffer.append("video_url=" + nVar.f20418N + "&");
                stringBuffer.append("rid=" + nVar.f20405A + "&");
                stringBuffer.append("rid_n=" + nVar.f20406B + "&");
                stringBuffer.append("unit_id=" + nVar.f20415K + "&");
                StringBuilder sb = new StringBuilder();
                sb.append("offer_url=");
                sb.append(nVar.f20442y);
                stringBuffer.append(sb.toString());
                stringBuffer.append("\n");
            } else {
                stringBuffer.append("key=" + nVar.f20436s + "&");
                stringBuffer.append("reason=" + nVar.h() + "&");
                stringBuffer.append("cid=" + nVar.f20425h + "&");
                stringBuffer.append("video_url=" + nVar.f20418N + "&");
                stringBuffer.append("rid=" + nVar.f20405A + "&");
                stringBuffer.append("rid_n=" + nVar.f20406B + "&");
                stringBuffer.append("unit_id=" + nVar.f20415K + "&");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("offer_url=");
                sb2.append(nVar.f20442y);
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
        stringBuffer.append("key=" + nVar.f20436s + "&");
        stringBuffer.append("cid=" + nVar.f20425h + "&");
        stringBuffer.append("unit_id=" + nVar.f20415K + "&");
        stringBuffer.append("network_type=" + nVar.f20440w + "&");
        stringBuffer.append("mraid_type=" + nVar.f20439v + "&");
        stringBuffer.append("rid_n=" + nVar.f20406B + "&");
        StringBuilder sb = new StringBuilder();
        sb.append("rid=");
        sb.append(nVar.f20405A);
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }

    public static String g(n nVar) {
        if (nVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + nVar.f20436s + "&");
        stringBuffer.append("result=" + nVar.f20409E + "&");
        stringBuffer.append("duration=" + nVar.f20428k + "&");
        stringBuffer.append("cid=" + nVar.f20425h + "&");
        stringBuffer.append("reason=" + nVar.h() + "&");
        stringBuffer.append("ad_type=" + nVar.f20421d + "&");
        stringBuffer.append("unit_id=" + nVar.f20415K + "&");
        stringBuffer.append("devid=" + nVar.f20427j + "&");
        stringBuffer.append("mraid_type=" + nVar.f20439v + "&");
        stringBuffer.append("network_type=" + nVar.f20440w + "&");
        if (!TextUtils.isEmpty(nVar.f20430m)) {
            stringBuffer.append("endcard_url=" + nVar.f20430m + "&");
        }
        if (!TextUtils.isEmpty(nVar.f20429l)) {
            stringBuffer.append("type=" + nVar.f20429l + "&");
        }
        if (nVar.f20407C != null) {
            stringBuffer.append("resource_type=" + nVar.f20407C + "&");
        }
        stringBuffer.append("rid_n=" + nVar.f20406B + "&");
        StringBuilder sb = new StringBuilder();
        sb.append("rid=");
        sb.append(nVar.f20405A);
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
                stringBuffer.append("key=" + nVar.f20436s + "&");
                stringBuffer.append("error=" + ai.a(nVar.f20431n) + "&");
                stringBuffer.append("template_url=" + ai.a(nVar.f20413I) + "&");
                stringBuffer.append("unit_id=" + ai.a(nVar.f20415K) + "&");
                stringBuffer.append("cid=" + ai.a(nVar.f20425h) + "&");
                stringBuffer.append("network_str=" + nVar.f20441x + "&");
                StringBuilder sb = new StringBuilder();
                sb.append("network_type=");
                sb.append(nVar.f20440w);
                stringBuffer.append(sb.toString());
            } else {
                stringBuffer.append("key=" + nVar.f20436s + "&");
                stringBuffer.append("error=" + ai.a(nVar.f20431n) + "&");
                stringBuffer.append("template_url=" + ai.a(nVar.f20413I) + "&");
                stringBuffer.append("unit_id=" + ai.a(nVar.f20415K) + "&");
                stringBuffer.append("cid=" + ai.a(nVar.f20425h) + "&");
            }
            return stringBuffer.toString();
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public final int A() {
        return this.f20412H;
    }

    public final String i() {
        return this.f20426i;
    }

    public final String j() {
        return this.f20427j;
    }

    public final int k() {
        return this.f20440w;
    }

    public final String l() {
        return this.f20441x;
    }

    public final int m() {
        return this.f20409E;
    }

    public final String n() {
        return this.f20428k;
    }

    public final long o() {
        return this.f20417M;
    }

    public final int p() {
        return this.f20416L;
    }

    public final String q() {
        return this.f20418N;
    }

    public final String r() {
        return this.f20442y;
    }

    public final String s() {
        return this.f20430m;
    }

    public final String t() {
        return this.f20429l;
    }

    public final String toString() {
        return "RewardReportData [key=" + this.f20436s + ", networkType=" + this.f20440w + ", isCompleteView=" + this.f20435r + ", watchedMillis=" + this.f20419O + ", videoLength=" + this.f20416L + ", offerUrl=" + this.f20442y + ", reason=" + this.f20443z + ", result=" + this.f20409E + ", duration=" + this.f20428k + ", videoSize=" + this.f20417M + "]";
    }

    public final int u() {
        return this.f20422e;
    }

    public final String v() {
        return this.f20434q;
    }

    public final int w() {
        return this.f20435r;
    }

    public final int x() {
        return this.f20419O;
    }

    public final int y() {
        return this.f20439v;
    }

    public final String z() {
        return this.f20413I;
    }

    public final void i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f20426i = URLEncoder.encode(str);
    }

    public final void j(String str) {
        this.f20427j = str;
    }

    public final void k(String str) {
        this.f20441x = str;
    }

    public final void l(String str) {
        this.f20428k = str;
    }

    public final void m(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f20418N = URLEncoder.encode(str, "utf-8");
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void n(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f20430m = URLEncoder.encode(str, "utf-8");
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void o(String str) {
        this.f20429l = str;
    }

    public final void p(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f20434q = URLEncoder.encode(str, "utf-8");
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void q(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f20413I = URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
        }
    }

    public final void r(String str) {
        this.f20431n = str;
    }

    public final void s(String str) {
        this.f20438u = str;
    }

    public final void t(String str) {
        this.f20408D = str;
    }

    public final void u(String str) {
        this.f20410F = str;
    }

    public final void v(String str) {
        this.f20411G = str;
    }

    public static String c(n nVar) {
        if (nVar != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=" + nVar.f20436s + "&");
            stringBuffer.append("cid=" + nVar.f20425h + "&");
            stringBuffer.append("rid=" + nVar.f20405A + "&");
            stringBuffer.append("rid_n=" + nVar.f20406B + "&");
            stringBuffer.append("unit_id=" + nVar.f20415K + "&");
            stringBuffer.append("reason=" + nVar.h() + "&");
            stringBuffer.append("case=" + nVar.f20424g + "&");
            StringBuilder sb = new StringBuilder();
            sb.append("network_type=");
            sb.append(nVar.f20440w);
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
                stringBuffer.append("key=" + nVar.f20436s + "&");
                stringBuffer.append("network_type=" + nVar.f20440w + "&");
                stringBuffer.append("result=" + nVar.f20409E + "&");
                stringBuffer.append("cid=" + nVar.f20425h + "&");
                stringBuffer.append("template_url=" + nVar.f20413I + "&");
                stringBuffer.append("reason=" + nVar.h() + "&");
                stringBuffer.append("rid=" + nVar.f20405A + "&");
                stringBuffer.append("rid_n=" + nVar.f20406B + "&");
                stringBuffer.append("unit_id=" + nVar.f20415K + "&");
                stringBuffer.append("\n");
            } else {
                stringBuffer.append("key=" + nVar.f20436s + "&");
                stringBuffer.append("result=" + nVar.f20409E + "&");
                stringBuffer.append("cid=" + nVar.f20425h + "&");
                stringBuffer.append("template_url=" + nVar.f20413I + "&");
                stringBuffer.append("reason=" + nVar.h() + "&");
                stringBuffer.append("rid=" + nVar.f20405A + "&");
                stringBuffer.append("rid_n=" + nVar.f20406B + "&");
                stringBuffer.append("unit_id=" + nVar.f20415K + "&");
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    public n() {
    }

    public n(String str, int i8, String str2, String str3, String str4) {
        this.f20436s = str;
        this.f20441x = str4;
        this.f20440w = i8;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f20442y = URLEncoder.encode(str2, "utf-8");
            } catch (UnsupportedEncodingException e8) {
                e8.printStackTrace();
            }
        }
        this.f20443z = str3;
    }

    public final String c() {
        return this.f20415K;
    }

    public final void c(String str) {
        this.f20415K = str;
    }

    public static String b(n nVar) {
        if (nVar != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=" + nVar.f20436s + "&");
            stringBuffer.append("cid=" + nVar.f20425h + "&");
            stringBuffer.append("rid=" + nVar.f20405A + "&");
            stringBuffer.append("rid_n=" + nVar.f20406B + "&");
            stringBuffer.append("unit_id=" + nVar.f20415K + "&");
            stringBuffer.append("network_type=" + nVar.f20440w + "&");
            stringBuffer.append("mraid_type=" + nVar.f20439v + "&");
            stringBuffer.append("platform=1");
            return stringBuffer.toString();
        }
        return "";
    }

    public final void c(int i8) {
        this.f20422e = i8;
    }

    public final String h() {
        return TextUtils.isEmpty(this.f20443z) ? "" : this.f20443z;
    }

    public final void h(String str) {
        this.f20443z = str;
    }

    public static String d(n nVar) {
        if (nVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + nVar.f20436s + "&");
        stringBuffer.append("cid=" + nVar.f20425h + "&");
        stringBuffer.append("unit_id=" + nVar.f20415K + "&");
        stringBuffer.append("network_type=" + nVar.f20440w + "&");
        stringBuffer.append("rid=" + nVar.f20405A + "&");
        stringBuffer.append("rid_n=" + nVar.f20406B + "&");
        StringBuilder sb = new StringBuilder();
        sb.append("reason=");
        sb.append(nVar.h());
        stringBuffer.append(sb.toString());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    public n(String str, int i8, int i9, String str2, int i10, String str3, int i11, String str4) {
        this.f20436s = str;
        this.f20440w = i8;
        this.f20441x = str4;
        this.f20416L = i9;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f20442y = URLEncoder.encode(str2, "utf-8");
            } catch (UnsupportedEncodingException e8) {
                e8.printStackTrace();
            }
        }
        this.f20409E = i10;
        this.f20428k = str3;
        this.f20417M = i11;
    }

    public static String e(n nVar) {
        if (nVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + nVar.f20436s + "&");
        stringBuffer.append("result=" + nVar.f20409E + "&");
        stringBuffer.append("duration=" + nVar.f20428k + "&");
        stringBuffer.append("cid=" + nVar.f20425h + "&");
        stringBuffer.append("unit_id=" + nVar.f20415K + "&");
        stringBuffer.append("reason=" + nVar.h() + "&");
        stringBuffer.append("ad_type=" + nVar.f20421d + "&");
        stringBuffer.append("rid=" + nVar.f20405A + "&");
        stringBuffer.append("rid_n=" + nVar.f20406B + "&");
        stringBuffer.append("network_type=" + nVar.f20440w + "&");
        stringBuffer.append("mraid_type=" + nVar.f20439v + "&");
        stringBuffer.append("devid=" + nVar.f20427j + "&");
        if (nVar.f20407C != null) {
            stringBuffer.append("resource_type=" + nVar.f20407C + "&");
        }
        if (!TextUtils.isEmpty(nVar.f20430m)) {
            stringBuffer.append("endcard_url=" + nVar.f20430m + "&");
        }
        stringBuffer.append("type=" + nVar.f20429l);
        return stringBuffer.toString();
    }

    public final String g() {
        return this.f20406B;
    }

    public final void g(String str) {
        this.f20406B = str;
    }

    public final String b() {
        return this.f20407C;
    }

    public final void b(String str) {
        this.f20407C = str;
    }

    public final void b(int i8) {
        this.f20409E = i8;
    }

    public final String b(String str, String str2) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || (map = this.f20420c) == null) {
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
        return this.f20421d;
    }

    public final void d(String str) {
        this.f20421d = str;
    }

    public n(Context context, CampaignEx campaignEx, int i8, String str, long j8, int i9) {
        if (i9 == 1 || i9 == 287 || i9 == 94) {
            this.f20436s = "m_download_end";
        } else if (i9 == 95) {
            this.f20436s = "2000025";
        }
        int l8 = z.l(context);
        this.f20440w = l8;
        this.f20441x = z.a(context, l8);
        this.f20416L = campaignEx.getVideoLength();
        this.f20405A = campaignEx.getRequestId();
        this.f20406B = campaignEx.getRequestIdNotice();
        if (!TextUtils.isEmpty(this.f20442y)) {
            try {
                this.f20442y = URLEncoder.encode(campaignEx.getNoticeUrl() == null ? campaignEx.getClickURL() : campaignEx.getNoticeUrl(), "utf-8");
            } catch (UnsupportedEncodingException e8) {
                e8.printStackTrace();
            }
        }
        this.f20409E = i8;
        this.f20428k = str;
        this.f20417M = j8 == 0 ? campaignEx.getVideoSize() : j8;
    }

    public final void d(int i8) {
        this.f20439v = i8;
    }

    public final String f() {
        return this.f20405A;
    }

    public final void f(String str) {
        this.f20405A = str;
    }

    public static String a(n nVar) {
        if (nVar == null) {
            return null;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + nVar.f20436s + "&");
                stringBuffer.append("event=" + ai.a(nVar.f20432o) + "&");
                stringBuffer.append("template=" + ai.a(nVar.f20414J) + "&");
                stringBuffer.append("layout=" + ai.a(nVar.f20437t) + "&");
                stringBuffer.append("unit_id=" + ai.a(nVar.f20415K) + "&");
                stringBuffer.append("cid=" + ai.a(nVar.f20425h) + "&");
                stringBuffer.append("network_str=" + nVar.f20441x + "&");
                StringBuilder sb = new StringBuilder();
                sb.append("network_type=");
                sb.append(nVar.f20440w);
                stringBuffer.append(sb.toString());
            } else {
                stringBuffer.append("key=" + nVar.f20436s + "&");
                stringBuffer.append("event=" + ai.a(nVar.f20432o) + "&");
                stringBuffer.append("template=" + ai.a(nVar.f20414J) + "&");
                stringBuffer.append("layout=" + ai.a(nVar.f20437t) + "&");
                stringBuffer.append("unit_id=" + ai.a(nVar.f20415K) + "&");
                stringBuffer.append("cid=" + ai.a(nVar.f20425h) + "&");
            }
            return stringBuffer.toString();
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public n(String str, String str2, String str3, String str4, String str5, String str6, int i8, String str7) {
        this.f20436s = str;
        this.f20432o = str2;
        this.f20414J = str3;
        this.f20437t = str4;
        this.f20415K = str5;
        this.f20425h = str6;
        this.f20440w = i8;
        this.f20441x = str7;
    }

    public final String e() {
        return this.f20425h;
    }

    public final void e(String str) {
        this.f20425h = str;
    }

    public final void e(int i8) {
        this.f20412H = i8;
    }

    public n(String str) {
        this.f20433p = str;
    }

    public n(String str, int i8, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f20436s = str;
        this.f20409E = i8;
        this.f20428k = str2;
        try {
            if (!TextUtils.isEmpty(str3)) {
                this.f20430m = URLEncoder.encode(str3, "utf-8");
            }
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
        }
        this.f20425h = str4;
        this.f20415K = str5;
        this.f20443z = str6;
        this.f20429l = str7;
        if (Integer.valueOf(str2).intValue() > com.mbridge.msdk.foundation.same.a.f20455K) {
            this.f20409E = 2;
        }
    }

    public final String a() {
        return this.f20436s;
    }

    public final void a(String str) {
        this.f20436s = str;
    }

    public final void a(int i8) {
        this.f20440w = i8;
    }

    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.f20420c == null) {
            this.f20420c = new HashMap();
        }
        try {
            this.f20420c.put(str, str2);
        } catch (Exception unused) {
        }
    }

    public n(String str, String str2, String str3, String str4, String str5, int i8) {
        this.f20436s = str;
        this.f20425h = str2;
        this.f20405A = str3;
        this.f20406B = str4;
        this.f20415K = str5;
        this.f20440w = i8;
    }

    public n(String str, String str2, String str3, String str4, String str5, int i8, int i9, String str6) {
        this.f20436s = str;
        this.f20425h = str2;
        this.f20405A = str3;
        this.f20406B = str4;
        this.f20415K = str5;
        this.f20440w = i8;
        this.f20443z = str6;
        this.f20424g = i9;
    }
}
