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
    private String f22089A;

    /* renamed from: B, reason: collision with root package name */
    private int f22090B;

    /* renamed from: C, reason: collision with root package name */
    private int f22091C;

    /* renamed from: D, reason: collision with root package name */
    private List<CampaignEx> f22092D;

    /* renamed from: E, reason: collision with root package name */
    private int f22093E;

    /* renamed from: G, reason: collision with root package name */
    private long f22095G;

    /* renamed from: H, reason: collision with root package name */
    private Map<String, Object> f22096H;

    /* renamed from: I, reason: collision with root package name */
    private String f22097I;

    /* renamed from: a, reason: collision with root package name */
    private int f22098a;

    /* renamed from: b, reason: collision with root package name */
    private String f22099b;

    /* renamed from: c, reason: collision with root package name */
    private String f22100c;

    /* renamed from: d, reason: collision with root package name */
    private String f22101d;

    /* renamed from: e, reason: collision with root package name */
    private String f22102e;

    /* renamed from: f, reason: collision with root package name */
    private String f22103f;

    /* renamed from: g, reason: collision with root package name */
    private String f22104g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f22105h;

    /* renamed from: j, reason: collision with root package name */
    private int f22107j;

    /* renamed from: k, reason: collision with root package name */
    private String f22108k;

    /* renamed from: l, reason: collision with root package name */
    private String f22109l;

    /* renamed from: m, reason: collision with root package name */
    private String f22110m;

    /* renamed from: n, reason: collision with root package name */
    private String f22111n;

    /* renamed from: o, reason: collision with root package name */
    private int f22112o;

    /* renamed from: p, reason: collision with root package name */
    private long f22113p;

    /* renamed from: q, reason: collision with root package name */
    private long f22114q;

    /* renamed from: r, reason: collision with root package name */
    private long f22115r;

    /* renamed from: s, reason: collision with root package name */
    private double f22116s;

    /* renamed from: t, reason: collision with root package name */
    private int f22117t;

    /* renamed from: u, reason: collision with root package name */
    private List<a> f22118u;

    /* renamed from: v, reason: collision with root package name */
    private JSONObject f22119v;

    /* renamed from: w, reason: collision with root package name */
    private d<?> f22120w;

    /* renamed from: z, reason: collision with root package name */
    private Context f22123z;

    /* renamed from: i, reason: collision with root package name */
    private long f22106i = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;

    /* renamed from: x, reason: collision with root package name */
    private int f22121x = MBridgeCommon.DEFAULT_LOAD_TIMEOUT;

    /* renamed from: y, reason: collision with root package name */
    private int f22122y = MBridgeCommon.DEFAULT_LOAD_TIMEOUT;

    /* renamed from: F, reason: collision with root package name */
    private int f22094F = 0;

    public b(int i8, String str, String str2, String str3) {
        this.f22098a = i8;
        this.f22099b = str;
        this.f22100c = str2;
        this.f22101d = str3;
    }

    public final int A() {
        return this.f22091C;
    }

    public final int B() {
        return this.f22090B;
    }

    public final List<CampaignEx> C() {
        return this.f22092D;
    }

    public final int D() {
        int i8 = this.f22093E;
        if (i8 <= 0) {
            return 1;
        }
        return i8;
    }

    public final int E() {
        return this.f22094F;
    }

    public final Map<String, Object> F() {
        if (this.f22096H == null) {
            this.f22096H = new HashMap();
        }
        return this.f22096H;
    }

    public final long G() {
        return this.f22095G;
    }

    public final String H() {
        return this.f22097I;
    }

    public final int a() {
        return this.f22098a;
    }

    public final String b() {
        return this.f22100c;
    }

    public final String c() {
        return this.f22101d;
    }

    public final String d() {
        return this.f22102e;
    }

    public final String e() {
        return this.f22103f;
    }

    public final String f() {
        return this.f22104g;
    }

    public final boolean g() {
        return this.f22105h;
    }

    public final int h() {
        return this.f22107j;
    }

    public final String i() {
        return this.f22108k;
    }

    public final String j() {
        return this.f22109l;
    }

    public final String k() {
        return this.f22110m;
    }

    public final String l() {
        return this.f22111n;
    }

    public final int m() {
        return this.f22112o;
    }

    public final long n() {
        return this.f22113p;
    }

    public final long o() {
        return this.f22114q;
    }

    public final long p() {
        return this.f22115r;
    }

    public final double q() {
        return this.f22116s;
    }

    public final int r() {
        return this.f22117t;
    }

    public final List<a> s() {
        return this.f22118u;
    }

    public final JSONObject t() {
        return this.f22119v;
    }

    public final d<?> u() {
        d<?> dVar = this.f22120w;
        if (dVar != null) {
            return dVar;
        }
        String str = this.f22089A;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f22120w == null) {
            if (com.mbridge.msdk.newreward.function.h.a.b(str)) {
                this.f22120w = new e(this, null);
            } else {
                this.f22120w = new i(this, null);
            }
        }
        return this.f22120w;
    }

    public final int v() {
        return this.f22121x;
    }

    public final Context w() {
        return this.f22123z;
    }

    public final boolean x() {
        List<a> list;
        boolean z8;
        boolean z9;
        d<?> dVar = this.f22120w;
        if ((dVar != null && !dVar.c()) || (list = this.f22118u) == null || list.isEmpty()) {
            return false;
        }
        int size = this.f22118u.size();
        Iterator<a> it = this.f22118u.iterator();
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
        if (this.f22113p > System.currentTimeMillis()) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean x8 = x();
        d<?> dVar = this.f22120w;
        if ((dVar == null || dVar.c()) && (list = this.f22118u) != null && !list.isEmpty()) {
            int size = this.f22118u.size();
            int i8 = 0;
            for (a aVar : this.f22118u) {
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
        return this.f22089A;
    }

    public final void a(String str) {
        this.f22102e = str;
    }

    public final void b(String str) {
        this.f22103f = str;
    }

    public final void c(String str) {
        this.f22104g = str;
    }

    public final void d(String str) {
        this.f22108k = str;
    }

    public final void e(String str) {
        this.f22109l = str;
    }

    public final void f(String str) {
        this.f22110m = str;
    }

    public final void g(String str) {
        this.f22111n = str;
    }

    public final void h(String str) {
        this.f22089A = str;
    }

    public final void i(int i8) {
        this.f22094F = i8;
    }

    public final void a(boolean z8) {
        this.f22105h = z8;
    }

    public final void b(int i8) {
        this.f22112o = i8;
    }

    public final void c(long j8) {
        this.f22114q = j8;
    }

    public final void d(long j8) {
        this.f22115r = j8;
    }

    public final void e(int i8) {
        this.f22122y = i8;
    }

    public final void f(int i8) {
        this.f22091C = i8;
    }

    public final void g(int i8) {
        this.f22090B = i8;
    }

    public final void h(int i8) {
        this.f22093E = i8;
    }

    public final void i(String str) {
        this.f22097I = str;
    }

    public final void a(long j8) {
        this.f22106i = j8;
    }

    public final void b(long j8) {
        this.f22113p = j8;
    }

    public final void c(int i8) {
        this.f22117t = i8;
    }

    public final void d(int i8) {
        this.f22121x = i8;
    }

    public final void e(long j8) {
        this.f22095G = j8;
    }

    public final void a(int i8) {
        this.f22107j = i8;
    }

    public final void b(List<CampaignEx> list) {
        this.f22092D = list;
    }

    public final void a(double d8) {
        this.f22116s = d8;
    }

    public final void a(List<a> list) {
        this.f22118u = list;
    }

    public final void a(JSONObject jSONObject) {
        this.f22119v = jSONObject;
    }
}
