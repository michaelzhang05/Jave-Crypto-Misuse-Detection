package h4;

import P5.AbstractC1371l;
import P5.AbstractC1378t;
import a6.InterfaceC1669o;
import e3.EnumC2791e;
import f4.InterfaceC2835a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import o2.InterfaceC3515b;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;
import p4.G;
import u4.C4061a;

/* renamed from: h4.D, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2910D extends p4.n0 {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2835a f32239b;

    /* renamed from: c, reason: collision with root package name */
    private final C2909C f32240c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f32241d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f32242e;

    /* renamed from: f, reason: collision with root package name */
    private final B2.b f32243f;

    /* renamed from: h4.D$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3706f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f[] f32244a;

        /* renamed from: h4.D$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0756a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3706f[] f32245a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0756a(InterfaceC3706f[] interfaceC3706fArr) {
                super(0);
                this.f32245a = interfaceC3706fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new O5.r[this.f32245a.length];
            }
        }

        /* renamed from: h4.D$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1669o {

            /* renamed from: a, reason: collision with root package name */
            int f32246a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f32247b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f32248c;

            public b(S5.d dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f32246a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        O5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    O5.t.b(obj);
                    InterfaceC3707g interfaceC3707g = (InterfaceC3707g) this.f32247b;
                    List W02 = AbstractC1378t.W0(AbstractC1371l.V0((Object[]) this.f32248c));
                    this.f32246a = 1;
                    if (interfaceC3707g.emit(W02, this) == e8) {
                        return e8;
                    }
                }
                return O5.I.f8278a;
            }

            @Override // a6.InterfaceC1669o
            public final Object invoke(InterfaceC3707g interfaceC3707g, Object[] objArr, S5.d dVar) {
                b bVar = new b(dVar);
                bVar.f32247b = interfaceC3707g;
                bVar.f32248c = objArr;
                return bVar.invokeSuspend(O5.I.f8278a);
            }
        }

        public a(InterfaceC3706f[] interfaceC3706fArr) {
            this.f32244a = interfaceC3706fArr;
        }

        @Override // o6.InterfaceC3706f
        public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
            InterfaceC3706f[] interfaceC3706fArr = this.f32244a;
            Object a8 = p6.k.a(interfaceC3707g, interfaceC3706fArr, new C0756a(interfaceC3706fArr), new b(null), dVar);
            if (a8 == T5.b.e()) {
                return a8;
            }
            return O5.I.f8278a;
        }
    }

    /* renamed from: h4.D$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f32249a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list) {
            super(0);
            this.f32249a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            List list = this.f32249a;
            ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC3698L) it.next()).getValue());
            }
            return AbstractC1378t.W0(arrayList);
        }
    }

    /* renamed from: h4.D$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements Function1 {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O5.r invoke(C4061a it) {
            AbstractC3255y.i(it, "it");
            return O5.x.a(C2910D.this.i().y().a(), it);
        }
    }

    /* renamed from: h4.D$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC3256z implements Function1 {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O5.r invoke(C4061a it) {
            AbstractC3255y.i(it, "it");
            return O5.x.a(C2910D.this.i().z().a(), it);
        }
    }

    /* renamed from: h4.D$e */
    /* loaded from: classes4.dex */
    static final class e extends AbstractC3256z implements Function1 {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O5.r invoke(C4061a it) {
            AbstractC3255y.i(it, "it");
            return O5.x.a(C2910D.this.i().v().a(), it);
        }
    }

    /* renamed from: h4.D$f */
    /* loaded from: classes4.dex */
    static final class f extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f32253a = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O5.r invoke(EnumC2791e it) {
            AbstractC3255y.i(it, "it");
            return O5.x.a(p4.G.Companion.f(), new C4061a(it.f(), true));
        }
    }

    /* renamed from: h4.D$g */
    /* loaded from: classes4.dex */
    static final class g extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final g f32254a = new g();

        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O5.r invoke(EnumC2791e brand) {
            AbstractC3255y.i(brand, "brand");
            p4.G v8 = p4.G.Companion.v();
            String f8 = brand.f();
            if (brand == EnumC2791e.f31452w) {
                f8 = null;
            }
            return O5.x.a(v8, new C4061a(f8, true));
        }
    }

    /* renamed from: h4.D$h */
    /* loaded from: classes4.dex */
    static final class h extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f32255a = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O5.r invoke(C4061a it) {
            C4061a c8;
            AbstractC3255y.i(it, "it");
            p4.G h8 = p4.G.Companion.h();
            c8 = AbstractC2911E.c(it);
            return O5.x.a(h8, c8);
        }
    }

    /* renamed from: h4.D$i */
    /* loaded from: classes4.dex */
    static final class i extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final i f32256a = new i();

        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O5.r invoke(C4061a it) {
            C4061a d8;
            AbstractC3255y.i(it, "it");
            p4.G i8 = p4.G.Companion.i();
            d8 = AbstractC2911E.d(it);
            return O5.x.a(i8, d8);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C2910D(p4.G r13, o2.InterfaceC3515b.a r14, java.util.Map r15, boolean r16, f4.InterfaceC2835a r17, h4.C2909C r18, int r19, kotlin.jvm.internal.AbstractC3247p r20) {
        /*
            r12 = this;
            r0 = r19 & 8
            if (r0 == 0) goto L6
            r0 = 0
            goto L8
        L6:
            r0 = r16
        L8:
            r1 = r19 & 16
            if (r1 == 0) goto L10
            f4.a$c r1 = f4.InterfaceC2835a.c.f31958a
            r10 = r1
            goto L12
        L10:
            r10 = r17
        L12:
            r1 = r19 & 32
            if (r1 == 0) goto L27
            h4.C r11 = new h4.C
            r8 = 48
            r9 = 0
            r6 = 0
            r7 = 0
            r1 = r11
            r2 = r14
            r3 = r15
            r4 = r0
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r7 = r11
            goto L29
        L27:
            r7 = r18
        L29:
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r0
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.C2910D.<init>(p4.G, o2.b$a, java.util.Map, boolean, f4.a, h4.C, int, kotlin.jvm.internal.p):void");
    }

    @Override // p4.k0
    public B2.b b() {
        return this.f32243f;
    }

    @Override // p4.k0
    public boolean c() {
        return this.f32242e;
    }

    @Override // p4.k0
    public InterfaceC3698L d() {
        InterfaceC3706f aVar;
        List c8 = AbstractC1378t.c();
        if (this.f32240c.y() != null) {
            c8.add(y4.g.m(this.f32240c.y().i().m(), new c()));
        }
        c8.add(y4.g.m(this.f32240c.z().i().m(), new d()));
        c8.add(y4.g.m(this.f32240c.v().i().m(), new e()));
        c8.add(y4.g.m(this.f32240c.z().i().v(), f.f32253a));
        if (this.f32239b instanceof InterfaceC2835a.b) {
            c8.add(y4.g.m(this.f32240c.z().i().x(), g.f32254a));
        }
        c8.add(y4.g.m(this.f32240c.w().i().m(), h.f32255a));
        c8.add(y4.g.m(this.f32240c.w().i().m(), i.f32256a));
        List a8 = AbstractC1378t.a(c8);
        if (a8.isEmpty()) {
            aVar = y4.g.n(AbstractC1378t.W0(AbstractC1378t.m()));
        } else {
            aVar = new a((InterfaceC3706f[]) AbstractC1378t.W0(a8).toArray(new InterfaceC3706f[0]));
        }
        return new y4.e(aVar, new b(a8));
    }

    @Override // p4.k0
    public InterfaceC3698L e() {
        p4.G g8;
        p4.q0 y8 = this.f32240c.y();
        p4.G g9 = null;
        if (y8 != null) {
            g8 = y8.a();
        } else {
            g8 = null;
        }
        p4.G a8 = this.f32240c.z().a();
        p4.G a9 = this.f32240c.w().a();
        p4.G a10 = this.f32240c.v().a();
        G.b bVar = p4.G.Companion;
        p4.G f8 = bVar.f();
        p4.G v8 = bVar.v();
        if (this.f32239b instanceof InterfaceC2835a.b) {
            g9 = v8;
        }
        return y4.g.n(AbstractC1378t.r(g8, a8, a9, a10, f8, g9));
    }

    @Override // p4.k0
    public p4.m0 f() {
        return this.f32240c;
    }

    @Override // p4.k0
    public void h(Map rawValuesMap) {
        AbstractC3255y.i(rawValuesMap, "rawValuesMap");
    }

    public final C2909C i() {
        return this.f32240c;
    }

    public final boolean j() {
        return this.f32241d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2910D(p4.G identifier, InterfaceC3515b.a cardAccountRangeRepositoryFactory, Map initialValues, boolean z8, InterfaceC2835a cbcEligibility, C2909C controller) {
        super(identifier);
        AbstractC3255y.i(identifier, "identifier");
        AbstractC3255y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        AbstractC3255y.i(initialValues, "initialValues");
        AbstractC3255y.i(cbcEligibility, "cbcEligibility");
        AbstractC3255y.i(controller, "controller");
        this.f32239b = cbcEligibility;
        this.f32240c = controller;
        this.f32241d = controller.z().i().w();
        this.f32242e = true;
    }
}
