package m4;

import M5.AbstractC1239l;
import M5.AbstractC1246t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public final class h0 implements D {

    /* renamed from: f, reason: collision with root package name */
    public static final a f35513f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f35514g = 8;

    /* renamed from: a, reason: collision with root package name */
    private final G f35515a;

    /* renamed from: b, reason: collision with root package name */
    private final List f35516b;

    /* renamed from: c, reason: collision with root package name */
    private final g0 f35517c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f35518d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3983b f35519e;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public static /* synthetic */ h0 c(a aVar, k0 k0Var, Integer num, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                num = null;
            }
            return aVar.b(k0Var, num);
        }

        public final h0 a(List sectionFieldElements, Integer num) {
            AbstractC3159y.i(sectionFieldElements, "sectionFieldElements");
            List list = sectionFieldElements;
            ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((k0) it.next()).f());
            }
            return new h0(G.Companion.a(((k0) AbstractC1246t.m0(sectionFieldElements)).a().j0() + "_section"), sectionFieldElements, new g0(num, arrayList));
        }

        public final h0 b(k0 sectionFieldElement, Integer num) {
            AbstractC3159y.i(sectionFieldElement, "sectionFieldElement");
            return a(AbstractC1246t.e(sectionFieldElement), num);
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f[] f35520a;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3358f[] f35521a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC3358f[] interfaceC3358fArr) {
                super(0);
                this.f35521a = interfaceC3358fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new List[this.f35521a.length];
            }
        }

        /* renamed from: m4.h0$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0819b extends kotlin.coroutines.jvm.internal.l implements X5.o {

            /* renamed from: a, reason: collision with root package name */
            int f35522a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f35523b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f35524c;

            public C0819b(P5.d dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f35522a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        L5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    L5.t.b(obj);
                    InterfaceC3359g interfaceC3359g = (InterfaceC3359g) this.f35523b;
                    List z8 = AbstractC1246t.z(AbstractC1246t.W0(AbstractC1239l.V0((Object[]) this.f35524c)));
                    this.f35522a = 1;
                    if (interfaceC3359g.emit(z8, this) == e8) {
                        return e8;
                    }
                }
                return L5.I.f6487a;
            }

            @Override // X5.o
            public final Object invoke(InterfaceC3359g interfaceC3359g, Object[] objArr, P5.d dVar) {
                C0819b c0819b = new C0819b(dVar);
                c0819b.f35523b = interfaceC3359g;
                c0819b.f35524c = objArr;
                return c0819b.invokeSuspend(L5.I.f6487a);
            }
        }

        public b(InterfaceC3358f[] interfaceC3358fArr) {
            this.f35520a = interfaceC3358fArr;
        }

        @Override // l6.InterfaceC3358f
        public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            InterfaceC3358f[] interfaceC3358fArr = this.f35520a;
            Object a8 = m6.k.a(interfaceC3359g, interfaceC3358fArr, new a(interfaceC3358fArr), new C0819b(null), dVar);
            if (a8 == Q5.b.e()) {
                return a8;
            }
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f35525a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(0);
            this.f35525a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            List list = this.f35525a;
            ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC3349K) it.next()).getValue());
            }
            return AbstractC1246t.z(AbstractC1246t.W0(arrayList));
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC3358f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f[] f35526a;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3358f[] f35527a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC3358f[] interfaceC3358fArr) {
                super(0);
                this.f35527a = interfaceC3358fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new List[this.f35527a.length];
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.o {

            /* renamed from: a, reason: collision with root package name */
            int f35528a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f35529b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f35530c;

            public b(P5.d dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f35528a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        L5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    L5.t.b(obj);
                    InterfaceC3359g interfaceC3359g = (InterfaceC3359g) this.f35529b;
                    List z8 = AbstractC1246t.z(AbstractC1246t.W0(AbstractC1239l.V0((Object[]) this.f35530c)));
                    this.f35528a = 1;
                    if (interfaceC3359g.emit(z8, this) == e8) {
                        return e8;
                    }
                }
                return L5.I.f6487a;
            }

            @Override // X5.o
            public final Object invoke(InterfaceC3359g interfaceC3359g, Object[] objArr, P5.d dVar) {
                b bVar = new b(dVar);
                bVar.f35529b = interfaceC3359g;
                bVar.f35530c = objArr;
                return bVar.invokeSuspend(L5.I.f6487a);
            }
        }

        public d(InterfaceC3358f[] interfaceC3358fArr) {
            this.f35526a = interfaceC3358fArr;
        }

        @Override // l6.InterfaceC3358f
        public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            InterfaceC3358f[] interfaceC3358fArr = this.f35526a;
            Object a8 = m6.k.a(interfaceC3359g, interfaceC3358fArr, new a(interfaceC3358fArr), new b(null), dVar);
            if (a8 == Q5.b.e()) {
                return a8;
            }
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f35531a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List list) {
            super(0);
            this.f35531a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            List list = this.f35531a;
            ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC3349K) it.next()).getValue());
            }
            return AbstractC1246t.z(AbstractC1246t.W0(arrayList));
        }
    }

    public h0(G identifier, List fields, g0 controller) {
        InterfaceC3983b interfaceC3983b;
        AbstractC3159y.i(identifier, "identifier");
        AbstractC3159y.i(fields, "fields");
        AbstractC3159y.i(controller, "controller");
        this.f35515a = identifier;
        this.f35516b = fields;
        this.f35517c = controller;
        List list = fields;
        boolean z8 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((k0) it.next()).c()) {
                    z8 = true;
                    break;
                }
            }
        }
        this.f35518d = z8;
        Iterator it2 = this.f35516b.iterator();
        while (true) {
            if (it2.hasNext()) {
                interfaceC3983b = ((k0) it2.next()).b();
                if (interfaceC3983b != null) {
                    break;
                }
            } else {
                interfaceC3983b = null;
                break;
            }
        }
        this.f35519e = interfaceC3983b;
    }

    @Override // m4.D
    public G a() {
        return this.f35515a;
    }

    @Override // m4.D
    public InterfaceC3983b b() {
        return this.f35519e;
    }

    @Override // m4.D
    public boolean c() {
        return this.f35518d;
    }

    @Override // m4.D
    public InterfaceC3349K d() {
        InterfaceC3358f bVar;
        List list = this.f35516b;
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((k0) it.next()).d());
        }
        if (arrayList.isEmpty()) {
            bVar = v4.g.n(AbstractC1246t.z(AbstractC1246t.W0(AbstractC1246t.m())));
        } else {
            bVar = new b((InterfaceC3358f[]) AbstractC1246t.W0(arrayList).toArray(new InterfaceC3358f[0]));
        }
        return new v4.e(bVar, new c(arrayList));
    }

    @Override // m4.D
    public InterfaceC3349K e() {
        InterfaceC3358f dVar;
        List list = this.f35516b;
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((k0) it.next()).e());
        }
        if (arrayList.isEmpty()) {
            dVar = v4.g.n(AbstractC1246t.z(AbstractC1246t.W0(AbstractC1246t.m())));
        } else {
            dVar = new d((InterfaceC3358f[]) AbstractC1246t.W0(arrayList).toArray(new InterfaceC3358f[0]));
        }
        return new v4.e(dVar, new e(arrayList));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (AbstractC3159y.d(this.f35515a, h0Var.f35515a) && AbstractC3159y.d(this.f35516b, h0Var.f35516b) && AbstractC3159y.d(this.f35517c, h0Var.f35517c)) {
            return true;
        }
        return false;
    }

    public g0 f() {
        return this.f35517c;
    }

    public final List g() {
        return this.f35516b;
    }

    public int hashCode() {
        return (((this.f35515a.hashCode() * 31) + this.f35516b.hashCode()) * 31) + this.f35517c.hashCode();
    }

    public String toString() {
        return "SectionElement(identifier=" + this.f35515a + ", fields=" + this.f35516b + ", controller=" + this.f35517c + ")";
    }
}
