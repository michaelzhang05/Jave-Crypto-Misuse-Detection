package com.getcapacitor;

import org.json.JSONException;

/* loaded from: classes.dex */
public class k0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f4435a;

    public k0(v0 v0Var, String str) {
        this.f4435a = c(v0Var, str);
    }

    private Object c(v0 v0Var, String str) {
        g0 d6 = v0Var.d(str, null);
        if (d6 != null) {
            return d6;
        }
        j0 l6 = v0Var.l(str, null);
        if (l6 != null) {
            return l6;
        }
        String o6 = v0Var.o(str, null);
        return o6 != null ? o6 : v0Var.h().opt(str);
    }

    public Object a() {
        return this.f4435a;
    }

    public g0 b() {
        Object obj = this.f4435a;
        if (obj instanceof g0) {
            return (g0) obj;
        }
        throw new JSONException("JSValue could not be coerced to JSArray.");
    }

    public String toString() {
        return a().toString();
    }
}
