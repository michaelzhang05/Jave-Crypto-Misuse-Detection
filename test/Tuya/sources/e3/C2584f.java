package e3;

import g6.C2728d;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import t2.C3785f;
import x2.AbstractC3869G;
import x2.t;
import x2.y;

/* renamed from: e3.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2584f extends AbstractC3869G {

    /* renamed from: k, reason: collision with root package name */
    private static final a f30238k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    public static final int f30239l = 8;

    /* renamed from: c, reason: collision with root package name */
    private final Map f30240c;

    /* renamed from: d, reason: collision with root package name */
    private final y.e f30241d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC3869G.a f30242e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC3869G.b f30243f;

    /* renamed from: g, reason: collision with root package name */
    private final Iterable f30244g;

    /* renamed from: h, reason: collision with root package name */
    private final String f30245h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f30246i;

    /* renamed from: j, reason: collision with root package name */
    private Map f30247j;

    /* renamed from: e3.f$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C2584f(Map params, String guid) {
        AbstractC3159y.i(params, "params");
        AbstractC3159y.i(guid, "guid");
        this.f30240c = params;
        y.e eVar = new y.e(guid);
        this.f30241d = eVar;
        this.f30242e = AbstractC3869G.a.f39123c;
        this.f30243f = AbstractC3869G.b.f39130d;
        this.f30244g = t.a();
        this.f30245h = "https://m.stripe.com/6";
        this.f30246i = eVar.b();
        this.f30247j = eVar.c();
    }

    private final String h() {
        return String.valueOf(v2.e.f38789a.d(this.f30240c));
    }

    private final byte[] i() {
        try {
            byte[] bytes = h().getBytes(C2728d.f31293b);
            AbstractC3159y.h(bytes, "getBytes(...)");
            return bytes;
        } catch (UnsupportedEncodingException e8) {
            throw new C3785f(null, null, 0, "Unable to encode parameters to " + C2728d.f31293b.name() + ". Please contact support@stripe.com for assistance.", e8, 7, null);
        }
    }

    @Override // x2.AbstractC3869G
    public Map a() {
        return this.f30246i;
    }

    @Override // x2.AbstractC3869G
    public AbstractC3869G.a b() {
        return this.f30242e;
    }

    @Override // x2.AbstractC3869G
    public Map c() {
        return this.f30247j;
    }

    @Override // x2.AbstractC3869G
    public Iterable d() {
        return this.f30244g;
    }

    @Override // x2.AbstractC3869G
    public String f() {
        return this.f30245h;
    }

    @Override // x2.AbstractC3869G
    public void g(OutputStream outputStream) {
        AbstractC3159y.i(outputStream, "outputStream");
        outputStream.write(i());
        outputStream.flush();
    }
}
