package com.getcapacitor;

/* loaded from: classes.dex */
public class c1 {

    /* renamed from: a, reason: collision with root package name */
    private final j0 f4296a;

    public c1() {
        this(new j0());
    }

    public j0 a() {
        j0 j0Var = new j0();
        j0Var.m("pluginId", this.f4296a.getString("pluginId"));
        j0Var.m("methodName", this.f4296a.getString("methodName"));
        j0Var.put("success", this.f4296a.c("success", Boolean.FALSE));
        j0Var.put("data", this.f4296a.f("data"));
        j0Var.put("error", this.f4296a.f("error"));
        return j0Var;
    }

    c1 b(String str, Object obj) {
        try {
            this.f4296a.put(str, obj);
        } catch (Exception e6) {
            l0.d(l0.k("Plugin"), "", e6);
        }
        return this;
    }

    public c1 c(String str, c1 c1Var) {
        return b(str, c1Var.f4296a);
    }

    public c1 d(String str, Object obj) {
        return b(str, obj);
    }

    public c1 e(String str, boolean z5) {
        return b(str, Boolean.valueOf(z5));
    }

    public String toString() {
        return this.f4296a.toString();
    }

    public c1(j0 j0Var) {
        this.f4296a = j0Var;
    }
}
