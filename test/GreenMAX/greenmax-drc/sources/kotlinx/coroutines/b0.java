package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.j.internal.CoroutineStackFrame;

/* compiled from: CoroutineContext.kt */
/* loaded from: classes2.dex */
public final class b0 {
    private static final boolean a;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
    
        if (r0.equals("on") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if (r0.equals(okhttp3.HttpUrl.FRAGMENT_ENCODE_SET) != false) goto L21;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = kotlinx.coroutines.internal.w.d(r0)
            if (r0 == 0) goto L53
            int r1 = r0.hashCode()
            if (r1 == 0) goto L2a
            r2 = 3551(0xddf, float:4.976E-42)
            if (r1 == r2) goto L21
            r2 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 != r2) goto L33
            java.lang.String r1 = "off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L33
            r0 = 0
            goto L54
        L21:
            java.lang.String r1 = "on"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L33
            goto L53
        L2a:
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L33
            goto L53
        L33:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L53:
            r0 = 1
        L54:
            kotlinx.coroutines.b0.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b0.<clinit>():void");
    }

    public static final c0 a() {
        return a ? kotlinx.coroutines.i2.b.m : t.f22284h;
    }

    public static final String b(CoroutineContext coroutineContext) {
        f0 f0Var;
        String s0;
        if (!l0.c() || (f0Var = (f0) coroutineContext.get(f0.f22150f)) == null) {
            return null;
        }
        g0 g0Var = (g0) coroutineContext.get(g0.f22155f);
        String str = "coroutine";
        if (g0Var != null && (s0 = g0Var.s0()) != null) {
            str = s0;
        }
        return str + '#' + f0Var.s0();
    }

    public static final CoroutineContext c(h0 h0Var, CoroutineContext coroutineContext) {
        CoroutineContext plus = h0Var.c().plus(coroutineContext);
        CoroutineContext plus2 = l0.c() ? plus.plus(new f0(l0.b().incrementAndGet())) : plus;
        u0 u0Var = u0.a;
        return (plus == u0.a() || plus.get(ContinuationInterceptor.f22100b) != null) ? plus2 : plus2.plus(u0.a());
    }

    public static final d2<?> d(CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof r0) && (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) != null) {
            if (coroutineStackFrame instanceof d2) {
                return (d2) coroutineStackFrame;
            }
        }
        return null;
    }

    public static final d2<?> e(Continuation<?> continuation, CoroutineContext coroutineContext, Object obj) {
        if (!(continuation instanceof CoroutineStackFrame)) {
            return null;
        }
        if (!(coroutineContext.get(e2.f22148f) != null)) {
            return null;
        }
        d2<?> d2 = d((CoroutineStackFrame) continuation);
        if (d2 != null) {
            d2.u0(coroutineContext, obj);
        }
        return d2;
    }
}
