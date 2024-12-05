package e4;

import M5.AbstractC1239l;
import M5.AbstractC1246t;
import b3.EnumC1870e;
import c4.InterfaceC1925a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l2.InterfaceC3167b;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;
import m4.G;
import r4.C3688a;
import y2.InterfaceC3983b;

/* renamed from: e4.D, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2590D extends m4.n0 {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1925a f30318b;

    /* renamed from: c, reason: collision with root package name */
    private final C2589C f30319c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f30320d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f30321e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3983b f30322f;

    /* renamed from: e4.D$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f[] f30323a;

        /* renamed from: e4.D$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0730a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3358f[] f30324a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0730a(InterfaceC3358f[] interfaceC3358fArr) {
                super(0);
                this.f30324a = interfaceC3358fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new L5.r[this.f30324a.length];
            }
        }

        /* renamed from: e4.D$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.o {

            /* renamed from: a, reason: collision with root package name */
            int f30325a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f30326b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f30327c;

            public b(P5.d dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f30325a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        L5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    L5.t.b(obj);
                    InterfaceC3359g interfaceC3359g = (InterfaceC3359g) this.f30326b;
                    List W02 = AbstractC1246t.W0(AbstractC1239l.V0((Object[]) this.f30327c));
                    this.f30325a = 1;
                    if (interfaceC3359g.emit(W02, this) == e8) {
                        return e8;
                    }
                }
                return L5.I.f6487a;
            }

            @Override // X5.o
            public final Object invoke(InterfaceC3359g interfaceC3359g, Object[] objArr, P5.d dVar) {
                b bVar = new b(dVar);
                bVar.f30326b = interfaceC3359g;
                bVar.f30327c = objArr;
                return bVar.invokeSuspend(L5.I.f6487a);
            }
        }

        public a(InterfaceC3358f[] interfaceC3358fArr) {
            this.f30323a = interfaceC3358fArr;
        }

        @Override // l6.InterfaceC3358f
        public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            InterfaceC3358f[] interfaceC3358fArr = this.f30323a;
            Object a8 = m6.k.a(interfaceC3359g, interfaceC3358fArr, new C0730a(interfaceC3358fArr), new b(null), dVar);
            if (a8 == Q5.b.e()) {
                return a8;
            }
            return L5.I.f6487a;
        }
    }

    /* renamed from: e4.D$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f30328a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list) {
            super(0);
            this.f30328a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            List list = this.f30328a;
            ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC3349K) it.next()).getValue());
            }
            return AbstractC1246t.W0(arrayList);
        }
    }

    /* renamed from: e4.D$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function1 {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L5.r invoke(C3688a it) {
            AbstractC3159y.i(it, "it");
            return L5.x.a(C2590D.this.i().y().a(), it);
        }
    }

    /* renamed from: e4.D$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements Function1 {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L5.r invoke(C3688a it) {
            AbstractC3159y.i(it, "it");
            return L5.x.a(C2590D.this.i().z().a(), it);
        }
    }

    /* renamed from: e4.D$e */
    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements Function1 {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L5.r invoke(C3688a it) {
            AbstractC3159y.i(it, "it");
            return L5.x.a(C2590D.this.i().v().a(), it);
        }
    }

    /* renamed from: e4.D$f */
    /* loaded from: classes4.dex */
    static final class f extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f30332a = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L5.r invoke(EnumC1870e it) {
            AbstractC3159y.i(it, "it");
            return L5.x.a(m4.G.Companion.f(), new C3688a(it.f(), true));
        }
    }

    /* renamed from: e4.D$g */
    /* loaded from: classes4.dex */
    static final class g extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final g f30333a = new g();

        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L5.r invoke(EnumC1870e brand) {
            AbstractC3159y.i(brand, "brand");
            m4.G v8 = m4.G.Companion.v();
            String f8 = brand.f();
            if (brand == EnumC1870e.f14446w) {
                f8 = null;
            }
            return L5.x.a(v8, new C3688a(f8, true));
        }
    }

    /* renamed from: e4.D$h */
    /* loaded from: classes4.dex */
    static final class h extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f30334a = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L5.r invoke(C3688a it) {
            C3688a c8;
            AbstractC3159y.i(it, "it");
            m4.G h8 = m4.G.Companion.h();
            c8 = AbstractC2591E.c(it);
            return L5.x.a(h8, c8);
        }
    }

    /* renamed from: e4.D$i */
    /* loaded from: classes4.dex */
    static final class i extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final i f30335a = new i();

        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L5.r invoke(C3688a it) {
            C3688a d8;
            AbstractC3159y.i(it, "it");
            m4.G i8 = m4.G.Companion.i();
            d8 = AbstractC2591E.d(it);
            return L5.x.a(i8, d8);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C2590D(m4.G r13, l2.InterfaceC3167b.a r14, java.util.Map r15, boolean r16, c4.InterfaceC1925a r17, e4.C2589C r18, int r19, kotlin.jvm.internal.AbstractC3151p r20) {
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
            c4.a$c r1 = c4.InterfaceC1925a.c.f14983a
            r10 = r1
            goto L12
        L10:
            r10 = r17
        L12:
            r1 = r19 & 32
            if (r1 == 0) goto L27
            e4.C r11 = new e4.C
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
        throw new UnsupportedOperationException("Method not decompiled: e4.C2590D.<init>(m4.G, l2.b$a, java.util.Map, boolean, c4.a, e4.C, int, kotlin.jvm.internal.p):void");
    }

    @Override // m4.k0
    public InterfaceC3983b b() {
        return this.f30322f;
    }

    @Override // m4.k0
    public boolean c() {
        return this.f30321e;
    }

    @Override // m4.k0
    public InterfaceC3349K d() {
        InterfaceC3358f aVar;
        List c8 = AbstractC1246t.c();
        if (this.f30319c.y() != null) {
            c8.add(v4.g.m(this.f30319c.y().i().m(), new c()));
        }
        c8.add(v4.g.m(this.f30319c.z().i().m(), new d()));
        c8.add(v4.g.m(this.f30319c.v().i().m(), new e()));
        c8.add(v4.g.m(this.f30319c.z().i().v(), f.f30332a));
        if (this.f30318b instanceof InterfaceC1925a.b) {
            c8.add(v4.g.m(this.f30319c.z().i().x(), g.f30333a));
        }
        c8.add(v4.g.m(this.f30319c.w().i().m(), h.f30334a));
        c8.add(v4.g.m(this.f30319c.w().i().m(), i.f30335a));
        List a8 = AbstractC1246t.a(c8);
        if (a8.isEmpty()) {
            aVar = v4.g.n(AbstractC1246t.W0(AbstractC1246t.m()));
        } else {
            aVar = new a((InterfaceC3358f[]) AbstractC1246t.W0(a8).toArray(new InterfaceC3358f[0]));
        }
        return new v4.e(aVar, new b(a8));
    }

    @Override // m4.k0
    public InterfaceC3349K e() {
        m4.G g8;
        m4.q0 y8 = this.f30319c.y();
        m4.G g9 = null;
        if (y8 != null) {
            g8 = y8.a();
        } else {
            g8 = null;
        }
        m4.G a8 = this.f30319c.z().a();
        m4.G a9 = this.f30319c.w().a();
        m4.G a10 = this.f30319c.v().a();
        G.b bVar = m4.G.Companion;
        m4.G f8 = bVar.f();
        m4.G v8 = bVar.v();
        if (this.f30318b instanceof InterfaceC1925a.b) {
            g9 = v8;
        }
        return v4.g.n(AbstractC1246t.r(g8, a8, a9, a10, f8, g9));
    }

    @Override // m4.k0
    public m4.m0 f() {
        return this.f30319c;
    }

    @Override // m4.k0
    public void h(Map rawValuesMap) {
        AbstractC3159y.i(rawValuesMap, "rawValuesMap");
    }

    public final C2589C i() {
        return this.f30319c;
    }

    public final boolean j() {
        return this.f30320d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2590D(m4.G identifier, InterfaceC3167b.a cardAccountRangeRepositoryFactory, Map initialValues, boolean z8, InterfaceC1925a cbcEligibility, C2589C controller) {
        super(identifier);
        AbstractC3159y.i(identifier, "identifier");
        AbstractC3159y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        AbstractC3159y.i(initialValues, "initialValues");
        AbstractC3159y.i(cbcEligibility, "cbcEligibility");
        AbstractC3159y.i(controller, "controller");
        this.f30318b = cbcEligibility;
        this.f30319c = controller;
        this.f30320d = controller.z().i().w();
        this.f30321e = true;
    }
}
