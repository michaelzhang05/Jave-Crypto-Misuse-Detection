package E3;

import E3.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3351M;
import l6.AbstractC3360h;
import l6.InterfaceC3349K;
import l6.v;

/* loaded from: classes4.dex */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name */
    private final v f1995a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f1996b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3349K f1997c;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1998a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke(f state) {
            AbstractC3159y.i(state, "state");
            if (state.c().e()) {
                return new c.a(state.c().b());
            }
            return c.b.f1982a;
        }
    }

    public h(E3.a args) {
        AbstractC3159y.i(args, "args");
        String c8 = args.c();
        boolean d8 = args.d();
        String b8 = args.b();
        v a8 = AbstractC3351M.a(new f(c8, d8, new g(b8 == null ? "" : b8, args.a())));
        this.f1995a = a8;
        this.f1996b = AbstractC3360h.b(a8);
        this.f1997c = v4.g.m(a8, a.f1998a);
    }

    @Override // E3.e
    public InterfaceC3349K b() {
        return this.f1996b;
    }

    @Override // E3.e
    public void c(String cvc) {
        Object value;
        f fVar;
        AbstractC3159y.i(cvc, "cvc");
        v vVar = this.f1995a;
        do {
            value = vVar.getValue();
            fVar = (f) value;
        } while (!vVar.a(value, f.b(fVar, null, false, fVar.c().f(cvc), 3, null)));
    }

    @Override // E3.e
    public InterfaceC3349K d() {
        return this.f1997c;
    }
}
