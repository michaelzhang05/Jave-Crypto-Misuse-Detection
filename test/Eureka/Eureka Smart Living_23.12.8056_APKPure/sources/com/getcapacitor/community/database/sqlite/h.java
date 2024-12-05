package com.getcapacitor.community.database.sqlite;

import android.util.Log;
import com.getcapacitor.g0;
import com.getcapacitor.j0;
import com.getcapacitor.v0;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4344a = "com.getcapacitor.community.database.sqlite.h";

    public void a(v0 v0Var, j0 j0Var, String str) {
        j0 j0Var2 = new j0();
        if (str == null) {
            j0Var2.put("changes", j0Var);
            v0Var.x(j0Var2);
            return;
        }
        j0Var2.m("message", str);
        Log.v(f4344a, "*** ERROR " + str);
        v0Var.r(str);
    }

    public void b(v0 v0Var, j0 j0Var, String str) {
        j0 j0Var2 = new j0();
        if (str == null) {
            j0Var2.put("export", j0Var);
            v0Var.x(j0Var2);
            return;
        }
        j0Var2.m("message", str);
        Log.v(f4344a, "*** ERROR " + str);
        v0Var.r(str);
    }

    public void c(v0 v0Var, String str, String str2) {
        j0 j0Var = new j0();
        if (str2 == null) {
            if (str == null) {
                v0Var.w();
                return;
            } else {
                j0Var.m("path", str);
                v0Var.x(j0Var);
                return;
            }
        }
        j0Var.m("message", str2);
        Log.v(f4344a, "*** ERROR " + str2);
        v0Var.r(str2);
    }

    public void d(v0 v0Var, Boolean bool, String str) {
        j0 j0Var = new j0();
        if (str == null) {
            if (bool == null) {
                v0Var.w();
                return;
            } else {
                j0Var.put("result", bool);
                v0Var.x(j0Var);
                return;
            }
        }
        j0Var.m("message", str);
        Log.v(f4344a, "*** ERROR " + str);
        v0Var.r(str);
    }

    public void e(v0 v0Var, Long l6, String str) {
        j0 j0Var = new j0();
        if (str == null) {
            j0Var.put("syncDate", l6);
            v0Var.x(j0Var);
            return;
        }
        j0Var.m("message", str);
        Log.v(f4344a, "*** ERROR " + str);
        v0Var.r(str);
    }

    public void f(v0 v0Var, String str, String str2) {
        j0 j0Var = new j0();
        if (str2 == null) {
            if (str == null) {
                v0Var.w();
                return;
            } else {
                j0Var.m("url", str);
                v0Var.x(j0Var);
                return;
            }
        }
        j0Var.m("message", str2);
        Log.v(f4344a, "*** ERROR " + str2);
        v0Var.r(str2);
    }

    public void g(v0 v0Var, g0 g0Var, String str) {
        j0 j0Var = new j0();
        if (str == null) {
            j0Var.put("values", g0Var);
            v0Var.x(j0Var);
            return;
        }
        j0Var.m("message", str);
        Log.v(f4344a, "*** ERROR " + str);
        v0Var.r(str);
    }

    public void h(v0 v0Var, Integer num, String str) {
        j0 j0Var = new j0();
        if (str == null) {
            if (num == null) {
                v0Var.w();
                return;
            } else {
                j0Var.put("version", num);
                v0Var.x(j0Var);
                return;
            }
        }
        j0Var.m("message", str);
        Log.v(f4344a, "*** ERROR " + str);
        v0Var.r(str);
    }
}
