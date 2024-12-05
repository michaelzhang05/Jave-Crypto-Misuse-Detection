package io.sentry.clientreport;

import io.sentry.h3;
import io.sentry.l2;
import io.sentry.r2;
import io.sentry.s4;
import io.sentry.w1;
import java.io.IOException;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: DiscardedEvent.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class f implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private final String f18888f;

    /* renamed from: g, reason: collision with root package name */
    private final String f18889g;

    /* renamed from: h, reason: collision with root package name */
    private final Long f18890h;

    /* renamed from: i, reason: collision with root package name */
    private Map<String, Object> f18891i;

    /* compiled from: DiscardedEvent.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<f> {
        private Exception c(String str, w1 w1Var) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            w1Var.b(s4.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x004d A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0057 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0042 A[SYNTHETIC] */
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.sentry.clientreport.f a(io.sentry.n2 r11, io.sentry.w1 r12) throws java.lang.Exception {
            /*
                r10 = this;
                r11.b()
                r0 = 0
                r1 = r0
                r2 = r1
                r3 = r2
            L7:
                io.sentry.vendor.gson.stream.b r4 = r11.w0()
                io.sentry.vendor.gson.stream.b r5 = io.sentry.vendor.gson.stream.b.NAME
                java.lang.String r6 = "category"
                java.lang.String r7 = "reason"
                java.lang.String r8 = "quantity"
                if (r4 != r5) goto L5c
                java.lang.String r4 = r11.k0()
                r4.hashCode()
                r5 = -1
                int r9 = r4.hashCode()
                switch(r9) {
                    case -1285004149: goto L37;
                    case -934964668: goto L2e;
                    case 50511102: goto L25;
                    default: goto L24;
                }
            L24:
                goto L3f
            L25:
                boolean r6 = r4.equals(r6)
                if (r6 != 0) goto L2c
                goto L3f
            L2c:
                r5 = 2
                goto L3f
            L2e:
                boolean r6 = r4.equals(r7)
                if (r6 != 0) goto L35
                goto L3f
            L35:
                r5 = 1
                goto L3f
            L37:
                boolean r6 = r4.equals(r8)
                if (r6 != 0) goto L3e
                goto L3f
            L3e:
                r5 = 0
            L3f:
                switch(r5) {
                    case 0: goto L57;
                    case 1: goto L52;
                    case 2: goto L4d;
                    default: goto L42;
                }
            L42:
                if (r3 != 0) goto L49
                java.util.HashMap r3 = new java.util.HashMap
                r3.<init>()
            L49:
                r11.V0(r12, r3, r4)
                goto L7
            L4d:
                java.lang.String r1 = r11.T0()
                goto L7
            L52:
                java.lang.String r0 = r11.T0()
                goto L7
            L57:
                java.lang.Long r2 = r11.P0()
                goto L7
            L5c:
                r11.D()
                if (r0 == 0) goto L78
                if (r1 == 0) goto L73
                if (r2 == 0) goto L6e
                io.sentry.clientreport.f r11 = new io.sentry.clientreport.f
                r11.<init>(r0, r1, r2)
                r11.d(r3)
                return r11
            L6e:
                java.lang.Exception r11 = r10.c(r8, r12)
                throw r11
            L73:
                java.lang.Exception r11 = r10.c(r6, r12)
                throw r11
            L78:
                java.lang.Exception r11 = r10.c(r7, r12)
                goto L7e
            L7d:
                throw r11
            L7e:
                goto L7d
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.clientreport.f.a.a(io.sentry.n2, io.sentry.w1):io.sentry.clientreport.f");
        }
    }

    public f(String str, String str2, Long l) {
        this.f18888f = str;
        this.f18889g = str2;
        this.f18890h = l;
    }

    public String a() {
        return this.f18889g;
    }

    public Long b() {
        return this.f18890h;
    }

    public String c() {
        return this.f18888f;
    }

    public void d(Map<String, Object> map) {
        this.f18891i = map;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        h3Var.k("reason").b(this.f18888f);
        h3Var.k("category").b(this.f18889g);
        h3Var.k("quantity").e(this.f18890h);
        Map<String, Object> map = this.f18891i;
        if (map != null) {
            for (String str : map.keySet()) {
                h3Var.k(str).g(w1Var, this.f18891i.get(str));
            }
        }
        h3Var.d();
    }

    public String toString() {
        return "DiscardedEvent{reason='" + this.f18888f + "', category='" + this.f18889g + "', quantity=" + this.f18890h + '}';
    }
}
