package A2;

import A2.G;
import A6.AbstractC0983d0;
import A6.AbstractC1005y;
import A6.C;
import A6.C0985e0;
import A6.C1000t;
import A6.K;
import A6.n0;
import A6.r0;
import P5.AbstractC1378t;
import P5.Q;
import androidx.annotation.RestrictTo;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import j6.C3205d;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.UUID;
import k6.AbstractC3227c;
import k6.C3225a;
import k6.EnumC3228d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.U;

@w6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: A2.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0949g extends G {
    public static final b Companion = new b(null);

    /* renamed from: n, reason: collision with root package name */
    private static final w6.b[] f155n;

    /* renamed from: c, reason: collision with root package name */
    private final String f156c;

    /* renamed from: d, reason: collision with root package name */
    private final String f157d;

    /* renamed from: e, reason: collision with root package name */
    private final String f158e;

    /* renamed from: f, reason: collision with root package name */
    private final double f159f;

    /* renamed from: g, reason: collision with root package name */
    private final B6.i f160g;

    /* renamed from: h, reason: collision with root package name */
    private final String f161h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f162i;

    /* renamed from: j, reason: collision with root package name */
    private final G.a f163j;

    /* renamed from: k, reason: collision with root package name */
    private final G.b f164k;

    /* renamed from: l, reason: collision with root package name */
    private final Iterable f165l;

    /* renamed from: m, reason: collision with root package name */
    private final String f166m;

    /* renamed from: A2.g$a */
    /* loaded from: classes4.dex */
    public static final class a implements A6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f167a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0985e0 f168b;

        static {
            a aVar = new a();
            f167a = aVar;
            C0985e0 c0985e0 = new C0985e0("com.stripe.android.core.networking.AnalyticsRequestV2", aVar, 11);
            c0985e0.k("eventName", false);
            c0985e0.k("clientId", false);
            c0985e0.k(TtmlNode.ATTR_TTS_ORIGIN, false);
            c0985e0.k("created", false);
            c0985e0.k("params", false);
            c0985e0.k("postParameters", true);
            c0985e0.k("headers", true);
            c0985e0.k("method", true);
            c0985e0.k("mimeType", true);
            c0985e0.k("retryResponseCodes", true);
            c0985e0.k("url", true);
            f168b = c0985e0;
        }

        private a() {
        }

        @Override // w6.b, w6.i, w6.InterfaceC4150a
        public y6.f a() {
            return f168b;
        }

        @Override // A6.C
        public w6.b[] c() {
            return C.a.a(this);
        }

        @Override // A6.C
        public w6.b[] e() {
            w6.b[] bVarArr = C0949g.f155n;
            w6.b bVar = bVarArr[6];
            w6.b bVar2 = bVarArr[7];
            w6.b bVar3 = bVarArr[8];
            w6.b bVar4 = bVarArr[9];
            r0 r0Var = r0.f595a;
            return new w6.b[]{r0Var, r0Var, r0Var, C1000t.f606a, B6.k.f1048a, r0Var, bVar, bVar2, bVar3, bVar4, r0Var};
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:10:0x009e. Please report as an issue. */
        @Override // w6.InterfaceC4150a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C0949g b(z6.e decoder) {
            int i8;
            G.b bVar;
            Iterable iterable;
            G.a aVar;
            Map map;
            B6.i iVar;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            double d8;
            AbstractC3255y.i(decoder, "decoder");
            y6.f a8 = a();
            z6.c d9 = decoder.d(a8);
            w6.b[] bVarArr = C0949g.f155n;
            int i9 = 10;
            String str6 = null;
            if (d9.w()) {
                String e8 = d9.e(a8, 0);
                String e9 = d9.e(a8, 1);
                String e10 = d9.e(a8, 2);
                double A8 = d9.A(a8, 3);
                B6.i iVar2 = (B6.i) d9.x(a8, 4, B6.k.f1048a, null);
                String e11 = d9.e(a8, 5);
                Map map2 = (Map) d9.x(a8, 6, bVarArr[6], null);
                G.a aVar2 = (G.a) d9.x(a8, 7, bVarArr[7], null);
                G.b bVar2 = (G.b) d9.x(a8, 8, bVarArr[8], null);
                iterable = (Iterable) d9.x(a8, 9, bVarArr[9], null);
                str = e8;
                str5 = d9.e(a8, 10);
                str4 = e11;
                iVar = iVar2;
                map = map2;
                str3 = e10;
                aVar = aVar2;
                bVar = bVar2;
                str2 = e9;
                d8 = A8;
                i8 = 2047;
            } else {
                G.b bVar3 = null;
                Iterable iterable2 = null;
                G.a aVar3 = null;
                Map map3 = null;
                B6.i iVar3 = null;
                String str7 = null;
                String str8 = null;
                double d10 = 0.0d;
                int i10 = 0;
                boolean z8 = true;
                String str9 = null;
                String str10 = null;
                while (z8) {
                    int g8 = d9.g(a8);
                    switch (g8) {
                        case -1:
                            i9 = 10;
                            z8 = false;
                        case 0:
                            i10 |= 1;
                            str6 = d9.e(a8, 0);
                            i9 = 10;
                        case 1:
                            str9 = d9.e(a8, 1);
                            i10 |= 2;
                            i9 = 10;
                        case 2:
                            str10 = d9.e(a8, 2);
                            i10 |= 4;
                            i9 = 10;
                        case 3:
                            d10 = d9.A(a8, 3);
                            i10 |= 8;
                            i9 = 10;
                        case 4:
                            iVar3 = (B6.i) d9.x(a8, 4, B6.k.f1048a, iVar3);
                            i10 |= 16;
                            i9 = 10;
                        case 5:
                            str7 = d9.e(a8, 5);
                            i10 |= 32;
                        case 6:
                            map3 = (Map) d9.x(a8, 6, bVarArr[6], map3);
                            i10 |= 64;
                        case 7:
                            aVar3 = (G.a) d9.x(a8, 7, bVarArr[7], aVar3);
                            i10 |= 128;
                        case 8:
                            bVar3 = (G.b) d9.x(a8, 8, bVarArr[8], bVar3);
                            i10 |= 256;
                        case 9:
                            iterable2 = (Iterable) d9.x(a8, 9, bVarArr[9], iterable2);
                            i10 |= 512;
                        case 10:
                            str8 = d9.e(a8, i9);
                            i10 |= 1024;
                        default:
                            throw new w6.l(g8);
                    }
                }
                i8 = i10;
                bVar = bVar3;
                iterable = iterable2;
                aVar = aVar3;
                map = map3;
                iVar = iVar3;
                str = str6;
                str2 = str9;
                str3 = str10;
                str4 = str7;
                str5 = str8;
                d8 = d10;
            }
            d9.b(a8);
            return new C0949g(i8, str, str2, str3, d8, iVar, str4, map, aVar, bVar, iterable, str5, null);
        }

        @Override // w6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(z6.f encoder, C0949g value) {
            AbstractC3255y.i(encoder, "encoder");
            AbstractC3255y.i(value, "value");
            y6.f a8 = a();
            z6.d d8 = encoder.d(a8);
            C0949g.u(value, d8, a8);
            d8.b(a8);
        }
    }

    /* renamed from: A2.g$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final w6.b serializer() {
            return a.f167a;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A2.g$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f169a;

        /* renamed from: b, reason: collision with root package name */
        private final String f170b;

        public c(String key, String value) {
            AbstractC3255y.i(key, "key");
            AbstractC3255y.i(value, "value");
            this.f169a = key;
            this.f170b = value;
        }

        private final String a(String str) {
            String encode = URLEncoder.encode(str, C3205d.f34020b.name());
            AbstractC3255y.h(encode, "encode(...)");
            return encode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (AbstractC3255y.d(this.f169a, cVar.f169a) && AbstractC3255y.d(this.f170b, cVar.f170b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f169a.hashCode() * 31) + this.f170b.hashCode();
        }

        public String toString() {
            return a(this.f169a) + "=" + a(this.f170b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A2.g$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f171a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(c it) {
            AbstractC3255y.i(it, "it");
            return it.toString();
        }
    }

    static {
        r0 r0Var = r0.f595a;
        f155n = new w6.b[]{null, null, null, null, null, null, new K(r0Var, r0Var), AbstractC1005y.b("com.stripe.android.core.networking.StripeRequest.Method", G.a.values()), AbstractC1005y.b("com.stripe.android.core.networking.StripeRequest.MimeType", G.b.values()), new w6.e(U.b(Iterable.class), new Annotation[0]), null};
    }

    public /* synthetic */ C0949g(int i8, String str, String str2, String str3, double d8, B6.i iVar, String str4, Map map, G.a aVar, G.b bVar, Iterable iterable, String str5, n0 n0Var) {
        if (31 != (i8 & 31)) {
            AbstractC0983d0.a(i8, 31, a.f167a.a());
        }
        this.f156c = str;
        this.f157d = str2;
        this.f158e = str3;
        this.f159f = d8;
        this.f160g = iVar;
        if ((i8 & 32) == 0) {
            this.f161h = m();
        } else {
            this.f161h = str4;
        }
        if ((i8 & 64) == 0) {
            this.f162i = Q.k(O5.x.a("Content-Type", G.b.f123b.b() + "; charset=" + C3205d.f34020b.name()), O5.x.a(TtmlNode.ATTR_TTS_ORIGIN, str3), O5.x.a(Command.HTTP_HEADER_USER_AGENT, "Stripe/v1 android/20.49.0"));
        } else {
            this.f162i = map;
        }
        if ((i8 & 128) == 0) {
            this.f163j = G.a.f118c;
        } else {
            this.f163j = aVar;
        }
        if ((i8 & 256) == 0) {
            this.f164k = G.b.f123b;
        } else {
            this.f164k = bVar;
        }
        if ((i8 & 512) == 0) {
            this.f165l = new g6.i(429, 429);
        } else {
            this.f165l = iterable;
        }
        if ((i8 & 1024) == 0) {
            this.f166m = "https://r.stripe.com/0";
        } else {
            this.f166m = str5;
        }
    }

    private final Map j() {
        return Q.k(O5.x.a("client_id", this.f157d), O5.x.a("created", Double.valueOf(this.f159f)), O5.x.a("event_name", this.f156c), O5.x.a("event_id", UUID.randomUUID().toString()));
    }

    public static /* synthetic */ C0949g l(C0949g c0949g, String str, String str2, String str3, double d8, B6.i iVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = c0949g.f156c;
        }
        if ((i8 & 2) != 0) {
            str2 = c0949g.f157d;
        }
        String str4 = str2;
        if ((i8 & 4) != 0) {
            str3 = c0949g.f158e;
        }
        String str5 = str3;
        if ((i8 & 8) != 0) {
            d8 = c0949g.f159f;
        }
        double d9 = d8;
        if ((i8 & 16) != 0) {
            iVar = c0949g.f160g;
        }
        return c0949g.k(str, str4, str5, d9, iVar);
    }

    private final String m() {
        Map q8 = Q.q(q.a(this.f160g), j());
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : v.f242a.a(q8).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                arrayList.add(new c(str, p(this, (Map) value, 0, 2, null)));
            } else {
                arrayList.add(new c(str, value.toString()));
            }
        }
        return AbstractC1378t.w0(arrayList, "&", null, null, 0, null, d.f171a, 30, null);
    }

    private final Map n(int i8) {
        boolean z8;
        boolean z9;
        C3225a.C0782a c0782a = C3225a.f34131b;
        if (C3225a.K(AbstractC3227c.t(System.currentTimeMillis(), EnumC3228d.f34140d), EnumC3228d.f34141e) - this.f159f > 5.0d) {
            z8 = true;
        } else {
            z8 = false;
        }
        O5.r a8 = O5.x.a("uses_work_manager", Boolean.TRUE);
        if (i8 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        return Q.k(a8, O5.x.a("is_retry", Boolean.valueOf(z9)), O5.x.a("delayed", Boolean.valueOf(z8)));
    }

    private final String o(Map map, int i8) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        AbstractC3255y.h(sb, "append(...)");
        sb.append('\n');
        AbstractC3255y.h(sb, "append(...)");
        boolean z8 = true;
        for (Map.Entry entry : Q.g(map, new Comparator() { // from class: A2.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int q8;
                q8 = C0949g.q(obj, obj2);
                return q8;
            }
        }).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                str = o((Map) value, i8 + 1);
            } else if (value == null) {
                str = "";
            } else {
                str = "\"" + value + "\"";
            }
            if (!j6.n.u(str)) {
                if (z8) {
                    sb.append(j6.n.w("  ", i8));
                    sb.append("  \"" + key + "\": " + str);
                    z8 = false;
                } else {
                    sb.append(",");
                    AbstractC3255y.h(sb, "append(...)");
                    sb.append('\n');
                    AbstractC3255y.h(sb, "append(...)");
                    sb.append(j6.n.w("  ", i8));
                    sb.append("  \"" + key + "\": " + str);
                }
            }
        }
        sb.append('\n');
        AbstractC3255y.h(sb, "append(...)");
        sb.append(j6.n.w("  ", i8));
        sb.append("}");
        String sb2 = sb.toString();
        AbstractC3255y.h(sb2, "toString(...)");
        return sb2;
    }

    static /* synthetic */ String p(C0949g c0949g, Map map, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return c0949g.o(map, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q(Object obj, Object obj2) {
        return String.valueOf(obj).compareTo(String.valueOf(obj2));
    }

    private final byte[] s() {
        byte[] bytes = this.f161h.getBytes(C3205d.f34020b);
        AbstractC3255y.h(bytes, "getBytes(...)");
        return bytes;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x008d, code lost:
    
        if (kotlin.jvm.internal.AbstractC3255y.d(r11.a(), P5.Q.k(O5.x.a("Content-Type", A2.G.b.f123b.b() + "; charset=" + j6.C3205d.f34020b.name()), O5.x.a(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.ATTR_TTS_ORIGIN, r11.f158e), O5.x.a(com.mbridge.msdk.foundation.download.Command.HTTP_HEADER_USER_AGENT, "Stripe/v1 android/20.49.0"))) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void u(A2.C0949g r11, z6.d r12, y6.f r13) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.C0949g.u(A2.g, z6.d, y6.f):void");
    }

    @Override // A2.G
    public Map a() {
        return this.f162i;
    }

    @Override // A2.G
    public G.a b() {
        return this.f163j;
    }

    @Override // A2.G
    public Iterable d() {
        return this.f165l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0949g)) {
            return false;
        }
        C0949g c0949g = (C0949g) obj;
        if (AbstractC3255y.d(this.f156c, c0949g.f156c) && AbstractC3255y.d(this.f157d, c0949g.f157d) && AbstractC3255y.d(this.f158e, c0949g.f158e) && Double.compare(this.f159f, c0949g.f159f) == 0 && AbstractC3255y.d(this.f160g, c0949g.f160g)) {
            return true;
        }
        return false;
    }

    @Override // A2.G
    public String f() {
        return this.f166m;
    }

    @Override // A2.G
    public void g(OutputStream outputStream) {
        AbstractC3255y.i(outputStream, "outputStream");
        outputStream.write(s());
        outputStream.flush();
    }

    public int hashCode() {
        return (((((((this.f156c.hashCode() * 31) + this.f157d.hashCode()) * 31) + this.f158e.hashCode()) * 31) + androidx.compose.animation.core.b.a(this.f159f)) * 31) + this.f160g.hashCode();
    }

    public final C0949g k(String eventName, String clientId, String origin, double d8, B6.i params) {
        AbstractC3255y.i(eventName, "eventName");
        AbstractC3255y.i(clientId, "clientId");
        AbstractC3255y.i(origin, "origin");
        AbstractC3255y.i(params, "params");
        return new C0949g(eventName, clientId, origin, d8, params);
    }

    public G.b r() {
        return this.f164k;
    }

    public final C0949g t(int i8) {
        B6.i c8;
        c8 = AbstractC0950h.c(Q.q(q.a(this.f160g), n(i8)));
        return l(this, null, null, null, 0.0d, c8, 15, null);
    }

    public String toString() {
        return "AnalyticsRequestV2(eventName=" + this.f156c + ", clientId=" + this.f157d + ", origin=" + this.f158e + ", created=" + this.f159f + ", params=" + this.f160g + ")";
    }

    private C0949g(String str, String str2, String str3, double d8, B6.i iVar) {
        this.f156c = str;
        this.f157d = str2;
        this.f158e = str3;
        this.f159f = d8;
        this.f160g = iVar;
        this.f161h = m();
        G.b bVar = G.b.f123b;
        this.f162i = Q.k(O5.x.a("Content-Type", bVar.b() + "; charset=" + C3205d.f34020b.name()), O5.x.a(TtmlNode.ATTR_TTS_ORIGIN, str3), O5.x.a(Command.HTTP_HEADER_USER_AGENT, "Stripe/v1 android/20.49.0"));
        this.f163j = G.a.f118c;
        this.f164k = bVar;
        this.f165l = new g6.i(429, 429);
        this.f166m = "https://r.stripe.com/0";
    }
}
