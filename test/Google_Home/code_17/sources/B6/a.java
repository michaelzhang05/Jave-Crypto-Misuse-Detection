package B6;

import C6.C1049u;
import C6.F;
import C6.G;
import C6.N;
import C6.Q;
import C6.T;
import C6.U;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import w6.InterfaceC4150a;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: d, reason: collision with root package name */
    public static final C0011a f1006d = new C0011a(null);

    /* renamed from: a, reason: collision with root package name */
    private final f f1007a;

    /* renamed from: b, reason: collision with root package name */
    private final D6.b f1008b;

    /* renamed from: c, reason: collision with root package name */
    private final C1049u f1009c;

    /* renamed from: B6.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0011a extends a {
        public /* synthetic */ C0011a(AbstractC3247p abstractC3247p) {
            this();
        }

        private C0011a() {
            super(new f(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, 32767, null), D6.c.a(), null);
        }
    }

    public /* synthetic */ a(f fVar, D6.b bVar, AbstractC3247p abstractC3247p) {
        this(fVar, bVar);
    }

    public final Object a(InterfaceC4150a deserializer, i element) {
        AbstractC3255y.i(deserializer, "deserializer");
        AbstractC3255y.i(element, "element");
        return T.a(this, element, deserializer);
    }

    public final Object b(InterfaceC4150a deserializer, String string) {
        AbstractC3255y.i(deserializer, "deserializer");
        AbstractC3255y.i(string, "string");
        Q q8 = new Q(string);
        Object s8 = new N(this, U.f1657c, q8, deserializer.a(), null).s(deserializer);
        q8.v();
        return s8;
    }

    public final String c(w6.i serializer, Object obj) {
        AbstractC3255y.i(serializer, "serializer");
        G g8 = new G();
        try {
            F.a(this, g8, serializer, obj);
            return g8.toString();
        } finally {
            g8.g();
        }
    }

    public final f d() {
        return this.f1007a;
    }

    public D6.b e() {
        return this.f1008b;
    }

    public final C1049u f() {
        return this.f1009c;
    }

    private a(f fVar, D6.b bVar) {
        this.f1007a = fVar;
        this.f1008b = bVar;
        this.f1009c = new C1049u();
    }
}
