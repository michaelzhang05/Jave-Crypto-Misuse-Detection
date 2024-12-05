package io.sentry;

import java.io.IOException;
import java.io.Reader;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: JsonObjectReader.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class n2 extends io.sentry.vendor.gson.stream.a {
    public n2(Reader reader) {
        super(reader);
    }

    public static Date H0(String str, w1 w1Var) {
        if (str == null) {
            return null;
        }
        try {
            try {
                return a1.e(str);
            } catch (Exception e2) {
                w1Var.b(s4.ERROR, "Error when deserializing millis timestamp format.", e2);
                return null;
            }
        } catch (Exception unused) {
            return a1.f(str);
        }
    }

    public Boolean I0() throws IOException {
        if (w0() == io.sentry.vendor.gson.stream.b.NULL) {
            s0();
            return null;
        }
        return Boolean.valueOf(Y());
    }

    public Date J0(w1 w1Var) throws IOException {
        if (w0() == io.sentry.vendor.gson.stream.b.NULL) {
            s0();
            return null;
        }
        return H0(u0(), w1Var);
    }

    public Double K0() throws IOException {
        if (w0() == io.sentry.vendor.gson.stream.b.NULL) {
            s0();
            return null;
        }
        return Double.valueOf(c0());
    }

    public Float L0() throws IOException {
        return Float.valueOf((float) c0());
    }

    public Float M0() throws IOException {
        if (w0() == io.sentry.vendor.gson.stream.b.NULL) {
            s0();
            return null;
        }
        return L0();
    }

    public Integer N0() throws IOException {
        if (w0() == io.sentry.vendor.gson.stream.b.NULL) {
            s0();
            return null;
        }
        return Integer.valueOf(g0());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        r0.add(r6.a(r4, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0024, code lost:
    
        r5.b(io.sentry.s4.WARNING, "Failed to deserialize object in list.", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (L() != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> java.util.List<T> O0(io.sentry.w1 r5, io.sentry.l2<T> r6) throws java.io.IOException {
        /*
            r4 = this;
            io.sentry.vendor.gson.stream.b r0 = r4.w0()
            io.sentry.vendor.gson.stream.b r1 = io.sentry.vendor.gson.stream.b.NULL
            if (r0 != r1) goto Ld
            r4.s0()
            r5 = 0
            return r5
        Ld:
            r4.a()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = r4.L()
            if (r1 == 0) goto L33
        L1b:
            java.lang.Object r1 = r6.a(r4, r5)     // Catch: java.lang.Exception -> L23
            r0.add(r1)     // Catch: java.lang.Exception -> L23
            goto L2b
        L23:
            r1 = move-exception
            io.sentry.s4 r2 = io.sentry.s4.WARNING
            java.lang.String r3 = "Failed to deserialize object in list."
            r5.b(r2, r3, r1)
        L2b:
            io.sentry.vendor.gson.stream.b r1 = r4.w0()
            io.sentry.vendor.gson.stream.b r2 = io.sentry.vendor.gson.stream.b.BEGIN_OBJECT
            if (r1 == r2) goto L1b
        L33:
            r4.z()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.n2.O0(io.sentry.w1, io.sentry.l2):java.util.List");
    }

    public Long P0() throws IOException {
        if (w0() == io.sentry.vendor.gson.stream.b.NULL) {
            s0();
            return null;
        }
        return Long.valueOf(i0());
    }

    public <T> Map<String, T> Q0(w1 w1Var, l2<T> l2Var) throws IOException {
        if (w0() == io.sentry.vendor.gson.stream.b.NULL) {
            s0();
            return null;
        }
        b();
        HashMap hashMap = new HashMap();
        if (L()) {
            while (true) {
                try {
                    hashMap.put(k0(), l2Var.a(this, w1Var));
                } catch (Exception e2) {
                    w1Var.b(s4.WARNING, "Failed to deserialize object in map.", e2);
                }
                if (w0() != io.sentry.vendor.gson.stream.b.BEGIN_OBJECT && w0() != io.sentry.vendor.gson.stream.b.NAME) {
                    break;
                }
            }
        }
        D();
        return hashMap;
    }

    public Object R0() throws IOException {
        return new m2().a(this);
    }

    public <T> T S0(w1 w1Var, l2<T> l2Var) throws Exception {
        if (w0() == io.sentry.vendor.gson.stream.b.NULL) {
            s0();
            return null;
        }
        return l2Var.a(this, w1Var);
    }

    public String T0() throws IOException {
        if (w0() == io.sentry.vendor.gson.stream.b.NULL) {
            s0();
            return null;
        }
        return u0();
    }

    public TimeZone U0(w1 w1Var) throws IOException {
        if (w0() == io.sentry.vendor.gson.stream.b.NULL) {
            s0();
            return null;
        }
        try {
            return TimeZone.getTimeZone(u0());
        } catch (Exception e2) {
            w1Var.b(s4.ERROR, "Error when deserializing TimeZone", e2);
            return null;
        }
    }

    public void V0(w1 w1Var, Map<String, Object> map, String str) {
        try {
            map.put(str, R0());
        } catch (Exception e2) {
            w1Var.a(s4.ERROR, e2, "Error deserializing unknown key: %s", str);
        }
    }
}
