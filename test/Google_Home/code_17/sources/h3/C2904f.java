package h3;

import A2.G;
import A2.t;
import A2.y;
import j6.C3205d;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import w2.C4139f;

/* renamed from: h3.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2904f extends G {

    /* renamed from: k, reason: collision with root package name */
    private static final a f32159k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    public static final int f32160l = 8;

    /* renamed from: c, reason: collision with root package name */
    private final Map f32161c;

    /* renamed from: d, reason: collision with root package name */
    private final y.e f32162d;

    /* renamed from: e, reason: collision with root package name */
    private final G.a f32163e;

    /* renamed from: f, reason: collision with root package name */
    private final G.b f32164f;

    /* renamed from: g, reason: collision with root package name */
    private final Iterable f32165g;

    /* renamed from: h, reason: collision with root package name */
    private final String f32166h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f32167i;

    /* renamed from: j, reason: collision with root package name */
    private Map f32168j;

    /* renamed from: h3.f$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C2904f(Map params, String guid) {
        AbstractC3255y.i(params, "params");
        AbstractC3255y.i(guid, "guid");
        this.f32161c = params;
        y.e eVar = new y.e(guid);
        this.f32162d = eVar;
        this.f32163e = G.a.f118c;
        this.f32164f = G.b.f125d;
        this.f32165g = t.a();
        this.f32166h = "https://m.stripe.com/6";
        this.f32167i = eVar.b();
        this.f32168j = eVar.c();
    }

    private final String h() {
        return String.valueOf(y2.e.f40920a.d(this.f32161c));
    }

    private final byte[] i() {
        try {
            byte[] bytes = h().getBytes(C3205d.f34020b);
            AbstractC3255y.h(bytes, "getBytes(...)");
            return bytes;
        } catch (UnsupportedEncodingException e8) {
            throw new C4139f(null, null, 0, "Unable to encode parameters to " + C3205d.f34020b.name() + ". Please contact support@stripe.com for assistance.", e8, 7, null);
        }
    }

    @Override // A2.G
    public Map a() {
        return this.f32167i;
    }

    @Override // A2.G
    public G.a b() {
        return this.f32163e;
    }

    @Override // A2.G
    public Map c() {
        return this.f32168j;
    }

    @Override // A2.G
    public Iterable d() {
        return this.f32165g;
    }

    @Override // A2.G
    public String f() {
        return this.f32166h;
    }

    @Override // A2.G
    public void g(OutputStream outputStream) {
        AbstractC3255y.i(outputStream, "outputStream");
        outputStream.write(i());
        outputStream.flush();
    }
}
