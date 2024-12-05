package com.mbridge.msdk.newreward.function.d.a;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.newreward.function.d.c.d;
import com.mbridge.msdk.newreward.function.d.c.e;
import com.mbridge.msdk.newreward.function.d.c.i;
import com.mbridge.msdk.newreward.function.d.c.n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: A, reason: collision with root package name */
    private String f21034A;

    /* renamed from: B, reason: collision with root package name */
    private int f21035B;

    /* renamed from: C, reason: collision with root package name */
    private int f21036C;

    /* renamed from: D, reason: collision with root package name */
    private List<CampaignEx> f21037D;

    /* renamed from: E, reason: collision with root package name */
    private int f21038E;

    /* renamed from: G, reason: collision with root package name */
    private long f21040G;

    /* renamed from: H, reason: collision with root package name */
    private Map<String, Object> f21041H;

    /* renamed from: I, reason: collision with root package name */
    private String f21042I;

    /* renamed from: a, reason: collision with root package name */
    private int f21043a;

    /* renamed from: b, reason: collision with root package name */
    private String f21044b;

    /* renamed from: c, reason: collision with root package name */
    private String f21045c;

    /* renamed from: d, reason: collision with root package name */
    private String f21046d;

    /* renamed from: e, reason: collision with root package name */
    private String f21047e;

    /* renamed from: f, reason: collision with root package name */
    private String f21048f;

    /* renamed from: g, reason: collision with root package name */
    private String f21049g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f21050h;

    /* renamed from: j, reason: collision with root package name */
    private int f21052j;

    /* renamed from: k, reason: collision with root package name */
    private String f21053k;

    /* renamed from: l, reason: collision with root package name */
    private String f21054l;

    /* renamed from: m, reason: collision with root package name */
    private String f21055m;

    /* renamed from: n, reason: collision with root package name */
    private String f21056n;

    /* renamed from: o, reason: collision with root package name */
    private int f21057o;

    /* renamed from: p, reason: collision with root package name */
    private long f21058p;

    /* renamed from: q, reason: collision with root package name */
    private long f21059q;

    /* renamed from: r, reason: collision with root package name */
    private long f21060r;

    /* renamed from: s, reason: collision with root package name */
    private double f21061s;

    /* renamed from: t, reason: collision with root package name */
    private int f21062t;

    /* renamed from: u, reason: collision with root package name */
    private List<a> f21063u;

    /* renamed from: v, reason: collision with root package name */
    private JSONObject f21064v;

    /* renamed from: w, reason: collision with root package name */
    private d<?> f21065w;

    /* renamed from: z, reason: collision with root package name */
    private Context f21068z;

    /* renamed from: i, reason: collision with root package name */
    private long f21051i = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;

    /* renamed from: x, reason: collision with root package name */
    private int f21066x = MBridgeCommon.DEFAULT_LOAD_TIMEOUT;

    /* renamed from: y, reason: collision with root package name */
    private int f21067y = MBridgeCommon.DEFAULT_LOAD_TIMEOUT;

    /* renamed from: F, reason: collision with root package name */
    private int f21039F = 0;

    public b(int i8, String str, String str2, String str3) {
        this.f21043a = i8;
        this.f21044b = str;
        this.f21045c = str2;
        this.f21046d = str3;
    }

    public final int A() {
        return this.f21036C;
    }

    public final int B() {
        return this.f21035B;
    }

    public final List<CampaignEx> C() {
        return this.f21037D;
    }

    public final int D() {
        int i8 = this.f21038E;
        if (i8 <= 0) {
            return 1;
        }
        return i8;
    }

    public final int E() {
        return this.f21039F;
    }

    public final Map<String, Object> F() {
        if (this.f21041H == null) {
            this.f21041H = new HashMap();
        }
        return this.f21041H;
    }

    public final long G() {
        return this.f21040G;
    }

    public final String H() {
        return this.f21042I;
    }

    public final int a() {
        return this.f21043a;
    }

    public final String b() {
        return this.f21045c;
    }

    public final String c() {
        return this.f21046d;
    }

    public final String d() {
        return this.f21047e;
    }

    public final String e() {
        return this.f21048f;
    }

    public final String f() {
        return this.f21049g;
    }

    public final boolean g() {
        return this.f21050h;
    }

    public final int h() {
        return this.f21052j;
    }

    public final String i() {
        return this.f21053k;
    }

    public final String j() {
        return this.f21054l;
    }

    public final String k() {
        return this.f21055m;
    }

    public final String l() {
        return this.f21056n;
    }

    public final int m() {
        return this.f21057o;
    }

    public final long n() {
        return this.f21058p;
    }

    public final long o() {
        return this.f21059q;
    }

    public final long p() {
        return this.f21060r;
    }

    public final double q() {
        return this.f21061s;
    }

    public final int r() {
        return this.f21062t;
    }

    public final List<a> s() {
        return this.f21063u;
    }

    public final JSONObject t() {
        return this.f21064v;
    }

    public final d<?> u() {
        d<?> dVar = this.f21065w;
        if (dVar != null) {
            return dVar;
        }
        String str = this.f21034A;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f21065w == null) {
            if (com.mbridge.msdk.newreward.function.h.a.b(str)) {
                this.f21065w = new e(this, null);
            } else {
                this.f21065w = new i(this, null);
            }
        }
        return this.f21065w;
    }

    public final int v() {
        return this.f21066x;
    }

    public final Context w() {
        return this.f21068z;
    }

    public final boolean x() {
        List<a> list;
        boolean z8;
        boolean z9;
        d<?> dVar = this.f21065w;
        if ((dVar != null && !dVar.c()) || (list = this.f21063u) == null || list.isEmpty()) {
            return false;
        }
        int size = this.f21063u.size();
        Iterator<a> it = this.f21063u.iterator();
        int i8 = 0;
        while (true) {
            boolean z10 = true;
            if (!it.hasNext()) {
                break;
            }
            a next = it.next();
            n d8 = next.d();
            if (d8 != null && !d8.c()) {
                z8 = false;
            } else {
                z8 = true;
            }
            d<?> f8 = next.f();
            if (f8 != null && !f8.c()) {
                z9 = false;
            } else {
                z9 = true;
            }
            d<?> c8 = next.c();
            if (c8 != null && !c8.c()) {
                z10 = false;
            }
            if (z8 && z9 && z10) {
                i8++;
            }
        }
        if (i8 != size) {
            return false;
        }
        return true;
    }

    public final boolean y() {
        boolean z8;
        List<a> list;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f21058p > System.currentTimeMillis()) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean x8 = x();
        d<?> dVar = this.f21065w;
        if ((dVar == null || dVar.c()) && (list = this.f21063u) != null && !list.isEmpty()) {
            int size = this.f21063u.size();
            int i8 = 0;
            for (a aVar : this.f21063u) {
                n d8 = aVar.d();
                if (d8 != null && !d8.d()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                d<?> f8 = aVar.f();
                if (f8 != null && !f8.d()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                d<?> c8 = aVar.c();
                if (c8 != null && !c8.d()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z10 && z11 && z12) {
                    i8++;
                }
            }
            if (i8 == size) {
                z9 = true;
                if (!z8 && x8 && z9) {
                    return true;
                }
                return false;
            }
        }
        z9 = false;
        if (!z8) {
        }
        return false;
    }

    public final String z() {
        return this.f21034A;
    }

    public final void a(String str) {
        this.f21047e = str;
    }

    public final void b(String str) {
        this.f21048f = str;
    }

    public final void c(String str) {
        this.f21049g = str;
    }

    public final void d(String str) {
        this.f21053k = str;
    }

    public final void e(String str) {
        this.f21054l = str;
    }

    public final void f(String str) {
        this.f21055m = str;
    }

    public final void g(String str) {
        this.f21056n = str;
    }

    public final void h(String str) {
        this.f21034A = str;
    }

    public final void i(int i8) {
        this.f21039F = i8;
    }

    public final void a(boolean z8) {
        this.f21050h = z8;
    }

    public final void b(int i8) {
        this.f21057o = i8;
    }

    public final void c(long j8) {
        this.f21059q = j8;
    }

    public final void d(long j8) {
        this.f21060r = j8;
    }

    public final void e(int i8) {
        this.f21067y = i8;
    }

    public final void f(int i8) {
        this.f21036C = i8;
    }

    public final void g(int i8) {
        this.f21035B = i8;
    }

    public final void h(int i8) {
        this.f21038E = i8;
    }

    public final void i(String str) {
        this.f21042I = str;
    }

    public final void a(long j8) {
        this.f21051i = j8;
    }

    public final void b(long j8) {
        this.f21058p = j8;
    }

    public final void c(int i8) {
        this.f21062t = i8;
    }

    public final void d(int i8) {
        this.f21066x = i8;
    }

    public final void e(long j8) {
        this.f21040G = j8;
    }

    public final void a(int i8) {
        this.f21052j = i8;
    }

    public final void b(List<CampaignEx> list) {
        this.f21037D = list;
    }

    public final void a(double d8) {
        this.f21061s = d8;
    }

    public final void a(List<a> list) {
        this.f21063u = list;
    }

    public final void a(JSONObject jSONObject) {
        this.f21064v = jSONObject;
    }
}
