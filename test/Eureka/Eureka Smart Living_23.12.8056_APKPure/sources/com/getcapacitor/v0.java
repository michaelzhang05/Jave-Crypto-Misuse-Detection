package com.getcapacitor;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class v0 {

    /* renamed from: a, reason: collision with root package name */
    private final p0 f4481a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4482b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4483c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4484d;

    /* renamed from: e, reason: collision with root package name */
    private final j0 f4485e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4486f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4487g = false;

    public v0(p0 p0Var, String str, String str2, String str3, j0 j0Var) {
        this.f4481a = p0Var;
        this.f4482b = str;
        this.f4483c = str2;
        this.f4484d = str3;
        this.f4485e = j0Var;
    }

    public void A(String str) {
        u(str, "UNAVAILABLE", null, null);
    }

    public void B() {
        C("not implemented");
    }

    public void C(String str) {
        u(str, "UNIMPLEMENTED", null, null);
    }

    public void a(String str) {
        r(str);
    }

    public void b(String str) {
        c1 c1Var = new c1();
        try {
            c1Var.d("message", str);
        } catch (Exception e6) {
            l0.d(l0.k("Plugin"), e6.toString(), null);
        }
        this.f4481a.j(this, null, c1Var);
    }

    public g0 c(String str) {
        return d(str, null);
    }

    public g0 d(String str, g0 g0Var) {
        Object opt = this.f4485e.opt(str);
        if (opt != null && (opt instanceof JSONArray)) {
            try {
                JSONArray jSONArray = (JSONArray) opt;
                ArrayList arrayList = new ArrayList();
                for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                    arrayList.add(jSONArray.get(i6));
                }
                return new g0(arrayList.toArray());
            } catch (JSONException unused) {
            }
        }
        return g0Var;
    }

    public Boolean e(String str) {
        return f(str, null);
    }

    public Boolean f(String str, Boolean bool) {
        Object opt = this.f4485e.opt(str);
        return (opt != null && (opt instanceof Boolean)) ? (Boolean) opt : bool;
    }

    public String g() {
        return this.f4483c;
    }

    public j0 h() {
        return this.f4485e;
    }

    public Integer i(String str) {
        return j(str, null);
    }

    public Integer j(String str, Integer num) {
        Object opt = this.f4485e.opt(str);
        return (opt != null && (opt instanceof Integer)) ? (Integer) opt : num;
    }

    public String k() {
        return this.f4484d;
    }

    public j0 l(String str, j0 j0Var) {
        Object opt = this.f4485e.opt(str);
        if (opt != null && (opt instanceof JSONObject)) {
            try {
                return j0.a((JSONObject) opt);
            } catch (JSONException unused) {
            }
        }
        return j0Var;
    }

    public String m() {
        return this.f4482b;
    }

    public String n(String str) {
        return o(str, null);
    }

    public String o(String str, String str2) {
        Object opt = this.f4485e.opt(str);
        return (opt != null && (opt instanceof String)) ? (String) opt : str2;
    }

    public boolean p(String str) {
        return this.f4485e.has(str);
    }

    public boolean q() {
        return this.f4486f;
    }

    public void r(String str) {
        u(str, null, null, null);
    }

    public void s(String str, Exception exc) {
        u(str, null, exc, null);
    }

    public void t(String str, String str2, Exception exc) {
        u(str, str2, exc, null);
    }

    public void u(String str, String str2, Exception exc, j0 j0Var) {
        c1 c1Var = new c1();
        if (exc != null) {
            l0.d(l0.k("Plugin"), str, exc);
        }
        try {
            c1Var.d("message", str);
            c1Var.d("code", str2);
            if (j0Var != null) {
                c1Var.d("data", j0Var);
            }
        } catch (Exception e6) {
            l0.d(l0.k("Plugin"), e6.getMessage(), e6);
        }
        this.f4481a.j(this, null, c1Var);
    }

    public void v(h hVar) {
        this.f4486f = false;
        hVar.o0(this);
        this.f4487g = true;
    }

    public void w() {
        this.f4481a.j(this, null, null);
    }

    public void x(j0 j0Var) {
        this.f4481a.j(this, new c1(j0Var), null);
    }

    public void y(Boolean bool) {
        this.f4486f = bool.booleanValue();
    }

    public void z() {
        A("not available");
    }
}
