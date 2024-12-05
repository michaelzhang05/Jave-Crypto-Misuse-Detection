package A2;

import A2.G;
import P5.AbstractC1378t;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: A2.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0944b extends G {

    /* renamed from: j, reason: collision with root package name */
    public static final a f137j = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private final Map f138c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f139d;

    /* renamed from: e, reason: collision with root package name */
    private final String f140e;

    /* renamed from: f, reason: collision with root package name */
    private final G.a f141f;

    /* renamed from: g, reason: collision with root package name */
    private final G.b f142g;

    /* renamed from: h, reason: collision with root package name */
    private final Iterable f143h;

    /* renamed from: i, reason: collision with root package name */
    private final String f144i;

    /* renamed from: A2.b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C0944b(Map params, Map headers) {
        AbstractC3255y.i(params, "params");
        AbstractC3255y.i(headers, "headers");
        this.f138c = params;
        this.f139d = headers;
        String c8 = v.f242a.c(params);
        this.f140e = c8;
        this.f141f = G.a.f117b;
        this.f142g = G.b.f123b;
        this.f143h = new g6.i(429, 429);
        this.f144i = AbstractC1378t.w0(AbstractC1378t.r("https://q.stripe.com", c8.length() <= 0 ? null : c8), "?", null, null, 0, null, null, 62, null);
    }

    @Override // A2.G
    public Map a() {
        return this.f139d;
    }

    @Override // A2.G
    public G.a b() {
        return this.f141f;
    }

    @Override // A2.G
    public Iterable d() {
        return this.f143h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0944b)) {
            return false;
        }
        C0944b c0944b = (C0944b) obj;
        if (AbstractC3255y.d(this.f138c, c0944b.f138c) && AbstractC3255y.d(this.f139d, c0944b.f139d)) {
            return true;
        }
        return false;
    }

    @Override // A2.G
    public String f() {
        return this.f144i;
    }

    public final Map h() {
        return this.f138c;
    }

    public int hashCode() {
        return (this.f138c.hashCode() * 31) + this.f139d.hashCode();
    }

    public String toString() {
        return "AnalyticsRequest(params=" + this.f138c + ", headers=" + this.f139d + ")";
    }
}
