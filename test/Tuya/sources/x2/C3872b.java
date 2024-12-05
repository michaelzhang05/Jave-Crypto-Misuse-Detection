package x2;

import M5.AbstractC1246t;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import x2.AbstractC3869G;

/* renamed from: x2.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3872b extends AbstractC3869G {

    /* renamed from: j, reason: collision with root package name */
    public static final a f39142j = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private final Map f39143c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f39144d;

    /* renamed from: e, reason: collision with root package name */
    private final String f39145e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC3869G.a f39146f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC3869G.b f39147g;

    /* renamed from: h, reason: collision with root package name */
    private final Iterable f39148h;

    /* renamed from: i, reason: collision with root package name */
    private final String f39149i;

    /* renamed from: x2.b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C3872b(Map params, Map headers) {
        AbstractC3159y.i(params, "params");
        AbstractC3159y.i(headers, "headers");
        this.f39143c = params;
        this.f39144d = headers;
        String c8 = v.f39247a.c(params);
        this.f39145e = c8;
        this.f39146f = AbstractC3869G.a.f39122b;
        this.f39147g = AbstractC3869G.b.f39128b;
        this.f39148h = new d6.i(429, 429);
        this.f39149i = AbstractC1246t.w0(AbstractC1246t.r("https://q.stripe.com", c8.length() <= 0 ? null : c8), "?", null, null, 0, null, null, 62, null);
    }

    @Override // x2.AbstractC3869G
    public Map a() {
        return this.f39144d;
    }

    @Override // x2.AbstractC3869G
    public AbstractC3869G.a b() {
        return this.f39146f;
    }

    @Override // x2.AbstractC3869G
    public Iterable d() {
        return this.f39148h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3872b)) {
            return false;
        }
        C3872b c3872b = (C3872b) obj;
        if (AbstractC3159y.d(this.f39143c, c3872b.f39143c) && AbstractC3159y.d(this.f39144d, c3872b.f39144d)) {
            return true;
        }
        return false;
    }

    @Override // x2.AbstractC3869G
    public String f() {
        return this.f39149i;
    }

    public final Map h() {
        return this.f39143c;
    }

    public int hashCode() {
        return (this.f39143c.hashCode() * 31) + this.f39144d.hashCode();
    }

    public String toString() {
        return "AnalyticsRequest(params=" + this.f39143c + ", headers=" + this.f39144d + ")";
    }
}
