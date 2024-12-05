package io.sentry;

import cm.aptoide.pt.DeepLinkIntentReceiver;
import cm.aptoide.pt.timeline.view.follow.TimeLineFollowFragment;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: TraceContext.java */
@ApiStatus.Experimental
/* loaded from: classes2.dex */
public final class o5 implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private final io.sentry.protocol.q f19055f;

    /* renamed from: g, reason: collision with root package name */
    private final String f19056g;

    /* renamed from: h, reason: collision with root package name */
    private final String f19057h;

    /* renamed from: i, reason: collision with root package name */
    private final String f19058i;

    /* renamed from: j, reason: collision with root package name */
    private final String f19059j;

    /* renamed from: k, reason: collision with root package name */
    private final String f19060k;
    private final String l;
    private final String m;
    private final String n;
    private Map<String, Object> o;

    /* compiled from: TraceContext.java */
    /* loaded from: classes2.dex */
    public static final class b implements l2<o5> {
        private Exception c(String str, w1 w1Var) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            w1Var.b(s4.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00f3  */
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.sentry.o5 a(io.sentry.n2 r19, io.sentry.w1 r20) throws java.lang.Exception {
            /*
                Method dump skipped, instructions count: 378
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.o5.b.a(io.sentry.n2, io.sentry.w1):io.sentry.o5");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TraceContext.java */
    @Deprecated
    /* loaded from: classes2.dex */
    public static final class c {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private String f19061b;

        /* renamed from: c, reason: collision with root package name */
        private Map<String, Object> f19062c;

        /* compiled from: TraceContext.java */
        /* loaded from: classes2.dex */
        public static final class a implements l2<c> {
            @Override // io.sentry.l2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c a(n2 n2Var, w1 w1Var) throws Exception {
                n2Var.b();
                String str = null;
                String str2 = null;
                ConcurrentHashMap concurrentHashMap = null;
                while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String k0 = n2Var.k0();
                    k0.hashCode();
                    if (k0.equals(DeepLinkIntentReceiver.DeepLinksKeys.ID)) {
                        str = n2Var.T0();
                    } else if (!k0.equals("segment")) {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        n2Var.V0(w1Var, concurrentHashMap, k0);
                    } else {
                        str2 = n2Var.T0();
                    }
                }
                c cVar = new c(str, str2);
                cVar.c(concurrentHashMap);
                n2Var.D();
                return cVar;
            }
        }

        public String a() {
            return this.a;
        }

        public String b() {
            return this.f19061b;
        }

        public void c(Map<String, Object> map) {
            this.f19062c = map;
        }

        private c(String str, String str2) {
            this.a = str;
            this.f19061b = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o5(io.sentry.protocol.q qVar, String str) {
        this(qVar, str, null, null, null, null, null, null, null);
    }

    public String a() {
        return this.m;
    }

    public void b(Map<String, Object> map) {
        this.o = map;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        h3Var.k("trace_id").g(w1Var, this.f19055f);
        h3Var.k("public_key").b(this.f19056g);
        if (this.f19057h != null) {
            h3Var.k("release").b(this.f19057h);
        }
        if (this.f19058i != null) {
            h3Var.k("environment").b(this.f19058i);
        }
        if (this.f19059j != null) {
            h3Var.k(TimeLineFollowFragment.BundleKeys.USER_ID).b(this.f19059j);
        }
        if (this.f19060k != null) {
            h3Var.k("user_segment").b(this.f19060k);
        }
        if (this.l != null) {
            h3Var.k("transaction").b(this.l);
        }
        if (this.m != null) {
            h3Var.k("sample_rate").b(this.m);
        }
        if (this.n != null) {
            h3Var.k("sampled").b(this.n);
        }
        Map<String, Object> map = this.o;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.o.get(str);
                h3Var.k(str);
                h3Var.g(w1Var, obj);
            }
        }
        h3Var.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o5(io.sentry.protocol.q qVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f19055f = qVar;
        this.f19056g = str;
        this.f19057h = str2;
        this.f19058i = str3;
        this.f19059j = str4;
        this.f19060k = str5;
        this.l = str6;
        this.m = str7;
        this.n = str8;
    }
}
