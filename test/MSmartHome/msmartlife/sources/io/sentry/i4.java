package io.sentry;

import io.sentry.o5;
import io.sentry.protocol.o;
import io.sentry.protocol.q;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryEnvelopeHeader.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class i4 implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private final io.sentry.protocol.q f18958f;

    /* renamed from: g, reason: collision with root package name */
    private final io.sentry.protocol.o f18959g;

    /* renamed from: h, reason: collision with root package name */
    private final o5 f18960h;

    /* renamed from: i, reason: collision with root package name */
    private Date f18961i;

    /* renamed from: j, reason: collision with root package name */
    private Map<String, Object> f18962j;

    /* compiled from: SentryEnvelopeHeader.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<i4> {
        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001c. Please report as an issue. */
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i4 a(n2 n2Var, w1 w1Var) throws Exception {
            n2Var.b();
            io.sentry.protocol.q qVar = null;
            io.sentry.protocol.o oVar = null;
            o5 o5Var = null;
            Date date = null;
            HashMap hashMap = null;
            while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                String k0 = n2Var.k0();
                k0.hashCode();
                char c2 = 65535;
                switch (k0.hashCode()) {
                    case 113722:
                        if (k0.equals("sdk")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 110620997:
                        if (k0.equals("trace")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 278118624:
                        if (k0.equals("event_id")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 1980389946:
                        if (k0.equals("sent_at")) {
                            c2 = 3;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        oVar = (io.sentry.protocol.o) n2Var.S0(w1Var, new o.a());
                        break;
                    case 1:
                        o5Var = (o5) n2Var.S0(w1Var, new o5.b());
                        break;
                    case 2:
                        qVar = (io.sentry.protocol.q) n2Var.S0(w1Var, new q.a());
                        break;
                    case 3:
                        date = n2Var.J0(w1Var);
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        n2Var.V0(w1Var, hashMap, k0);
                        break;
                }
            }
            i4 i4Var = new i4(qVar, oVar, o5Var);
            i4Var.d(date);
            i4Var.e(hashMap);
            n2Var.D();
            return i4Var;
        }
    }

    public i4(io.sentry.protocol.q qVar, io.sentry.protocol.o oVar) {
        this(qVar, oVar, null);
    }

    public io.sentry.protocol.q a() {
        return this.f18958f;
    }

    public io.sentry.protocol.o b() {
        return this.f18959g;
    }

    public o5 c() {
        return this.f18960h;
    }

    public void d(Date date) {
        this.f18961i = date;
    }

    public void e(Map<String, Object> map) {
        this.f18962j = map;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        if (this.f18958f != null) {
            h3Var.k("event_id").g(w1Var, this.f18958f);
        }
        if (this.f18959g != null) {
            h3Var.k("sdk").g(w1Var, this.f18959g);
        }
        if (this.f18960h != null) {
            h3Var.k("trace").g(w1Var, this.f18960h);
        }
        if (this.f18961i != null) {
            h3Var.k("sent_at").g(w1Var, a1.g(this.f18961i));
        }
        Map<String, Object> map = this.f18962j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f18962j.get(str);
                h3Var.k(str);
                h3Var.g(w1Var, obj);
            }
        }
        h3Var.d();
    }

    public i4(io.sentry.protocol.q qVar, io.sentry.protocol.o oVar, o5 o5Var) {
        this.f18958f = qVar;
        this.f18959g = oVar;
        this.f18960h = o5Var;
    }

    public i4(io.sentry.protocol.q qVar) {
        this(qVar, null);
    }

    public i4() {
        this(new io.sentry.protocol.q());
    }
}
