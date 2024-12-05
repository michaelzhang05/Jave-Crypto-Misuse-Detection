package io.sentry;

import java.io.IOException;
import java.util.Map;

/* compiled from: UserFeedback.java */
/* loaded from: classes2.dex */
public final class w5 implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private final io.sentry.protocol.q f19336f;

    /* renamed from: g, reason: collision with root package name */
    private String f19337g;

    /* renamed from: h, reason: collision with root package name */
    private String f19338h;

    /* renamed from: i, reason: collision with root package name */
    private String f19339i;

    /* renamed from: j, reason: collision with root package name */
    private Map<String, Object> f19340j;

    /* compiled from: UserFeedback.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<w5> {
        /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0068 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x006d A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x004e A[SYNTHETIC] */
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.sentry.w5 a(io.sentry.n2 r9, io.sentry.w1 r10) throws java.lang.Exception {
            /*
                r8 = this;
                r9.b()
                r0 = 0
                r1 = r0
                r2 = r1
                r3 = r2
                r4 = r3
            L8:
                io.sentry.vendor.gson.stream.b r5 = r9.w0()
                io.sentry.vendor.gson.stream.b r6 = io.sentry.vendor.gson.stream.b.NAME
                if (r5 != r6) goto L72
                java.lang.String r5 = r9.k0()
                r5.hashCode()
                r6 = -1
                int r7 = r5.hashCode()
                switch(r7) {
                    case -602415628: goto L41;
                    case 3373707: goto L36;
                    case 96619420: goto L2b;
                    case 278118624: goto L20;
                    default: goto L1f;
                }
            L1f:
                goto L4b
            L20:
                java.lang.String r7 = "event_id"
                boolean r7 = r5.equals(r7)
                if (r7 != 0) goto L29
                goto L4b
            L29:
                r6 = 3
                goto L4b
            L2b:
                java.lang.String r7 = "email"
                boolean r7 = r5.equals(r7)
                if (r7 != 0) goto L34
                goto L4b
            L34:
                r6 = 2
                goto L4b
            L36:
                java.lang.String r7 = "name"
                boolean r7 = r5.equals(r7)
                if (r7 != 0) goto L3f
                goto L4b
            L3f:
                r6 = 1
                goto L4b
            L41:
                java.lang.String r7 = "comments"
                boolean r7 = r5.equals(r7)
                if (r7 != 0) goto L4a
                goto L4b
            L4a:
                r6 = 0
            L4b:
                switch(r6) {
                    case 0: goto L6d;
                    case 1: goto L68;
                    case 2: goto L63;
                    case 3: goto L59;
                    default: goto L4e;
                }
            L4e:
                if (r4 != 0) goto L55
                java.util.HashMap r4 = new java.util.HashMap
                r4.<init>()
            L55:
                r9.V0(r10, r4, r5)
                goto L8
            L59:
                io.sentry.protocol.q$a r0 = new io.sentry.protocol.q$a
                r0.<init>()
                io.sentry.protocol.q r0 = r0.a(r9, r10)
                goto L8
            L63:
                java.lang.String r2 = r9.T0()
                goto L8
            L68:
                java.lang.String r1 = r9.T0()
                goto L8
            L6d:
                java.lang.String r3 = r9.T0()
                goto L8
            L72:
                r9.D()
                if (r0 == 0) goto L80
                io.sentry.w5 r9 = new io.sentry.w5
                r9.<init>(r0, r1, r2, r3)
                r9.a(r4)
                return r9
            L80:
                java.lang.String r9 = "Missing required field \"event_id\""
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>(r9)
                io.sentry.s4 r1 = io.sentry.s4.ERROR
                r10.b(r1, r9, r0)
                goto L8e
            L8d:
                throw r0
            L8e:
                goto L8d
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.w5.a.a(io.sentry.n2, io.sentry.w1):io.sentry.w5");
        }
    }

    public w5(io.sentry.protocol.q qVar, String str, String str2, String str3) {
        this.f19336f = qVar;
        this.f19337g = str;
        this.f19338h = str2;
        this.f19339i = str3;
    }

    public void a(Map<String, Object> map) {
        this.f19340j = map;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        h3Var.k("event_id");
        this.f19336f.serialize(h3Var, w1Var);
        if (this.f19337g != null) {
            h3Var.k("name").b(this.f19337g);
        }
        if (this.f19338h != null) {
            h3Var.k("email").b(this.f19338h);
        }
        if (this.f19339i != null) {
            h3Var.k("comments").b(this.f19339i);
        }
        Map<String, Object> map = this.f19340j;
        if (map != null) {
            for (String str : map.keySet()) {
                h3Var.k(str).g(w1Var, this.f19340j.get(str));
            }
        }
        h3Var.d();
    }

    public String toString() {
        return "UserFeedback{eventId=" + this.f19336f + ", name='" + this.f19337g + "', email='" + this.f19338h + "', comments='" + this.f19339i + "'}";
    }
}
