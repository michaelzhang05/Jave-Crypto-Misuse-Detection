package H3;

import H3.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import o6.AbstractC3700N;
import o6.AbstractC3708h;
import o6.InterfaceC3698L;
import o6.w;

/* loaded from: classes4.dex */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name */
    private final w f3545a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3698L f3546b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3698L f3547c;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f3548a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke(f state) {
            AbstractC3255y.i(state, "state");
            if (state.c().e()) {
                return new c.a(state.c().b());
            }
            return c.b.f3532a;
        }
    }

    public h(H3.a args) {
        AbstractC3255y.i(args, "args");
        String c8 = args.c();
        boolean d8 = args.d();
        String b8 = args.b();
        w a8 = AbstractC3700N.a(new f(c8, d8, new g(b8 == null ? "" : b8, args.a())));
        this.f3545a = a8;
        this.f3546b = AbstractC3708h.b(a8);
        this.f3547c = y4.g.m(a8, a.f3548a);
    }

    @Override // H3.e
    public InterfaceC3698L a() {
        return this.f3546b;
    }

    @Override // H3.e
    public void b(String cvc) {
        Object value;
        f fVar;
        AbstractC3255y.i(cvc, "cvc");
        w wVar = this.f3545a;
        do {
            value = wVar.getValue();
            fVar = (f) value;
        } while (!wVar.c(value, f.b(fVar, null, false, fVar.c().f(cvc), 3, null)));
    }

    @Override // H3.e
    public InterfaceC3698L c() {
        return this.f3547c;
    }
}
