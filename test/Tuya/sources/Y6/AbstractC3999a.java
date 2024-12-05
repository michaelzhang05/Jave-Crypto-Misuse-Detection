package y6;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import t6.InterfaceC3796a;
import z6.AbstractC4035F;
import z6.C4036G;
import z6.C4060u;
import z6.N;
import z6.Q;
import z6.T;
import z6.U;

/* renamed from: y6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3999a {

    /* renamed from: d, reason: collision with root package name */
    public static final C0918a f39962d = new C0918a(null);

    /* renamed from: a, reason: collision with root package name */
    private final C4004f f39963a;

    /* renamed from: b, reason: collision with root package name */
    private final A6.b f39964b;

    /* renamed from: c, reason: collision with root package name */
    private final C4060u f39965c;

    /* renamed from: y6.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0918a extends AbstractC3999a {
        public /* synthetic */ C0918a(AbstractC3151p abstractC3151p) {
            this();
        }

        private C0918a() {
            super(new C4004f(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, 32767, null), A6.c.a(), null);
        }
    }

    public /* synthetic */ AbstractC3999a(C4004f c4004f, A6.b bVar, AbstractC3151p abstractC3151p) {
        this(c4004f, bVar);
    }

    public final Object a(InterfaceC3796a deserializer, AbstractC4007i element) {
        AbstractC3159y.i(deserializer, "deserializer");
        AbstractC3159y.i(element, "element");
        return T.a(this, element, deserializer);
    }

    public final Object b(InterfaceC3796a deserializer, String string) {
        AbstractC3159y.i(deserializer, "deserializer");
        AbstractC3159y.i(string, "string");
        Q q8 = new Q(string);
        Object e8 = new N(this, U.f40539c, q8, deserializer.a(), null).e(deserializer);
        q8.v();
        return e8;
    }

    public final String c(t6.i serializer, Object obj) {
        AbstractC3159y.i(serializer, "serializer");
        C4036G c4036g = new C4036G();
        try {
            AbstractC4035F.a(this, c4036g, serializer, obj);
            return c4036g.toString();
        } finally {
            c4036g.g();
        }
    }

    public final C4004f d() {
        return this.f39963a;
    }

    public A6.b e() {
        return this.f39964b;
    }

    public final C4060u f() {
        return this.f39965c;
    }

    private AbstractC3999a(C4004f c4004f, A6.b bVar) {
        this.f39963a = c4004f;
        this.f39964b = bVar;
        this.f39965c = new C4060u();
    }
}
