package p4;

import P5.AbstractC1371l;
import P5.AbstractC1378t;
import a6.InterfaceC1669o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;

/* loaded from: classes4.dex */
public final class h0 implements D {

    /* renamed from: f, reason: collision with root package name */
    public static final a f37539f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f37540g = 8;

    /* renamed from: a, reason: collision with root package name */
    private final G f37541a;

    /* renamed from: b, reason: collision with root package name */
    private final List f37542b;

    /* renamed from: c, reason: collision with root package name */
    private final g0 f37543c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f37544d;

    /* renamed from: e, reason: collision with root package name */
    private final B2.b f37545e;

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
            AbstractC3255y.i(sectionFieldElements, "sectionFieldElements");
            List list = sectionFieldElements;
            ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((k0) it.next()).f());
            }
            return new h0(G.Companion.a(((k0) AbstractC1378t.m0(sectionFieldElements)).a().j0() + "_section"), sectionFieldElements, new g0(num, arrayList));
        }

        public final h0 b(k0 sectionFieldElement, Integer num) {
            AbstractC3255y.i(sectionFieldElement, "sectionFieldElement");
            return a(AbstractC1378t.e(sectionFieldElement), num);
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC3706f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f[] f37546a;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3706f[] f37547a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC3706f[] interfaceC3706fArr) {
                super(0);
                this.f37547a = interfaceC3706fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new List[this.f37547a.length];
            }
        }

        /* renamed from: p4.h0$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0849b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1669o {

            /* renamed from: a, reason: collision with root package name */
            int f37548a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f37549b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f37550c;

            public C0849b(S5.d dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f37548a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        O5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    O5.t.b(obj);
                    InterfaceC3707g interfaceC3707g = (InterfaceC3707g) this.f37549b;
                    List z8 = AbstractC1378t.z(AbstractC1378t.W0(AbstractC1371l.V0((Object[]) this.f37550c)));
                    this.f37548a = 1;
                    if (interfaceC3707g.emit(z8, this) == e8) {
                        return e8;
                    }
                }
                return O5.I.f8278a;
            }

            @Override // a6.InterfaceC1669o
            public final Object invoke(InterfaceC3707g interfaceC3707g, Object[] objArr, S5.d dVar) {
                C0849b c0849b = new C0849b(dVar);
                c0849b.f37549b = interfaceC3707g;
                c0849b.f37550c = objArr;
                return c0849b.invokeSuspend(O5.I.f8278a);
            }
        }

        public b(InterfaceC3706f[] interfaceC3706fArr) {
            this.f37546a = interfaceC3706fArr;
        }

        @Override // o6.InterfaceC3706f
        public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
            InterfaceC3706f[] interfaceC3706fArr = this.f37546a;
            Object a8 = p6.k.a(interfaceC3707g, interfaceC3706fArr, new a(interfaceC3706fArr), new C0849b(null), dVar);
            if (a8 == T5.b.e()) {
                return a8;
            }
            return O5.I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f37551a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(0);
            this.f37551a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            List list = this.f37551a;
            ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC3698L) it.next()).getValue());
            }
            return AbstractC1378t.z(AbstractC1378t.W0(arrayList));
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC3706f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f[] f37552a;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3706f[] f37553a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC3706f[] interfaceC3706fArr) {
                super(0);
                this.f37553a = interfaceC3706fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new List[this.f37553a.length];
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1669o {

            /* renamed from: a, reason: collision with root package name */
            int f37554a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f37555b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f37556c;

            public b(S5.d dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f37554a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        O5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    O5.t.b(obj);
                    InterfaceC3707g interfaceC3707g = (InterfaceC3707g) this.f37555b;
                    List z8 = AbstractC1378t.z(AbstractC1378t.W0(AbstractC1371l.V0((Object[]) this.f37556c)));
                    this.f37554a = 1;
                    if (interfaceC3707g.emit(z8, this) == e8) {
                        return e8;
                    }
                }
                return O5.I.f8278a;
            }

            @Override // a6.InterfaceC1669o
            public final Object invoke(InterfaceC3707g interfaceC3707g, Object[] objArr, S5.d dVar) {
                b bVar = new b(dVar);
                bVar.f37555b = interfaceC3707g;
                bVar.f37556c = objArr;
                return bVar.invokeSuspend(O5.I.f8278a);
            }
        }

        public d(InterfaceC3706f[] interfaceC3706fArr) {
            this.f37552a = interfaceC3706fArr;
        }

        @Override // o6.InterfaceC3706f
        public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
            InterfaceC3706f[] interfaceC3706fArr = this.f37552a;
            Object a8 = p6.k.a(interfaceC3707g, interfaceC3706fArr, new a(interfaceC3706fArr), new b(null), dVar);
            if (a8 == T5.b.e()) {
                return a8;
            }
            return O5.I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f37557a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List list) {
            super(0);
            this.f37557a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            List list = this.f37557a;
            ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC3698L) it.next()).getValue());
            }
            return AbstractC1378t.z(AbstractC1378t.W0(arrayList));
        }
    }

    public h0(G identifier, List fields, g0 controller) {
        B2.b bVar;
        AbstractC3255y.i(identifier, "identifier");
        AbstractC3255y.i(fields, "fields");
        AbstractC3255y.i(controller, "controller");
        this.f37541a = identifier;
        this.f37542b = fields;
        this.f37543c = controller;
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
        this.f37544d = z8;
        Iterator it2 = this.f37542b.iterator();
        while (true) {
            if (it2.hasNext()) {
                bVar = ((k0) it2.next()).b();
                if (bVar != null) {
                    break;
                }
            } else {
                bVar = null;
                break;
            }
        }
        this.f37545e = bVar;
    }

    @Override // p4.D
    public G a() {
        return this.f37541a;
    }

    @Override // p4.D
    public B2.b b() {
        return this.f37545e;
    }

    @Override // p4.D
    public boolean c() {
        return this.f37544d;
    }

    @Override // p4.D
    public InterfaceC3698L d() {
        InterfaceC3706f bVar;
        List list = this.f37542b;
        ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((k0) it.next()).d());
        }
        if (arrayList.isEmpty()) {
            bVar = y4.g.n(AbstractC1378t.z(AbstractC1378t.W0(AbstractC1378t.m())));
        } else {
            bVar = new b((InterfaceC3706f[]) AbstractC1378t.W0(arrayList).toArray(new InterfaceC3706f[0]));
        }
        return new y4.e(bVar, new c(arrayList));
    }

    @Override // p4.D
    public InterfaceC3698L e() {
        InterfaceC3706f dVar;
        List list = this.f37542b;
        ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((k0) it.next()).e());
        }
        if (arrayList.isEmpty()) {
            dVar = y4.g.n(AbstractC1378t.z(AbstractC1378t.W0(AbstractC1378t.m())));
        } else {
            dVar = new d((InterfaceC3706f[]) AbstractC1378t.W0(arrayList).toArray(new InterfaceC3706f[0]));
        }
        return new y4.e(dVar, new e(arrayList));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (AbstractC3255y.d(this.f37541a, h0Var.f37541a) && AbstractC3255y.d(this.f37542b, h0Var.f37542b) && AbstractC3255y.d(this.f37543c, h0Var.f37543c)) {
            return true;
        }
        return false;
    }

    public g0 f() {
        return this.f37543c;
    }

    public final List g() {
        return this.f37542b;
    }

    public int hashCode() {
        return (((this.f37541a.hashCode() * 31) + this.f37542b.hashCode()) * 31) + this.f37543c.hashCode();
    }

    public String toString() {
        return "SectionElement(identifier=" + this.f37541a + ", fields=" + this.f37542b + ", controller=" + this.f37543c + ")";
    }
}
