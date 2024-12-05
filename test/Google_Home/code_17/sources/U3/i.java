package u3;

import O5.I;
import O5.t;
import P5.AbstractC1371l;
import P5.AbstractC1378t;
import P5.Q;
import P5.a0;
import a3.C1626h;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import h4.C2907A;
import h4.C2950q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;
import p4.D;
import p4.G;
import p4.h0;
import u4.C4061a;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3698L f40002a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3698L f40003b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3698L f40004c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3698L f40005d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3698L f40006e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3698L f40007f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3698L f40008g;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f40009a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2907A invoke(List elementsList) {
            AbstractC3255y.i(elementsList, "elementsList");
            ArrayList arrayList = new ArrayList();
            for (Object obj : elementsList) {
                if (obj instanceof h0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC1378t.D(arrayList2, ((h0) it.next()).g());
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (obj2 instanceof C2907A) {
                    arrayList3.add(obj2);
                }
            }
            return (C2907A) AbstractC1378t.o0(arrayList3);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40010a = new b();

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3706f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3706f[] f40011a;

            /* renamed from: u3.i$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            static final class C0896a extends AbstractC3256z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3706f[] f40012a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0896a(InterfaceC3706f[] interfaceC3706fArr) {
                    super(0);
                    this.f40012a = interfaceC3706fArr;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object[] invoke() {
                    return new List[this.f40012a.length];
                }
            }

            /* renamed from: u3.i$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0897b extends l implements InterfaceC1669o {

                /* renamed from: a, reason: collision with root package name */
                int f40013a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f40014b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f40015c;

                public C0897b(S5.d dVar) {
                    super(3, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = T5.b.e();
                    int i8 = this.f40013a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        InterfaceC3707g interfaceC3707g = (InterfaceC3707g) this.f40014b;
                        Map w8 = Q.w(AbstractC1378t.z(AbstractC1378t.W0(AbstractC1371l.V0((Object[]) this.f40015c))));
                        this.f40013a = 1;
                        if (interfaceC3707g.emit(w8, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f8278a;
                }

                @Override // a6.InterfaceC1669o
                public final Object invoke(InterfaceC3707g interfaceC3707g, Object[] objArr, S5.d dVar) {
                    C0897b c0897b = new C0897b(dVar);
                    c0897b.f40014b = interfaceC3707g;
                    c0897b.f40015c = objArr;
                    return c0897b.invokeSuspend(I.f8278a);
                }
            }

            public a(InterfaceC3706f[] interfaceC3706fArr) {
                this.f40011a = interfaceC3706fArr;
            }

            @Override // o6.InterfaceC3706f
            public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
                InterfaceC3706f[] interfaceC3706fArr = this.f40011a;
                Object a8 = p6.k.a(interfaceC3707g, interfaceC3706fArr, new C0896a(interfaceC3706fArr), new C0897b(null), dVar);
                if (a8 == T5.b.e()) {
                    return a8;
                }
                return I.f8278a;
            }
        }

        /* renamed from: u3.i$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0898b extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f40016a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0898b(List list) {
                super(0);
                this.f40016a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list = this.f40016a;
                ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC3698L) it.next()).getValue());
                }
                return Q.w(AbstractC1378t.z(AbstractC1378t.W0(arrayList)));
            }
        }

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3698L invoke(List elementsList) {
            InterfaceC3706f aVar;
            AbstractC3255y.i(elementsList, "elementsList");
            List list = elementsList;
            ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((D) it.next()).d());
            }
            if (arrayList.isEmpty()) {
                aVar = y4.g.n(Q.w(AbstractC1378t.z(AbstractC1378t.W0(AbstractC1378t.m()))));
            } else {
                aVar = new a((InterfaceC3706f[]) AbstractC1378t.W0(arrayList).toArray(new InterfaceC3706f[0]));
            }
            return new y4.e(aVar, new C0898b(arrayList));
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f40017a = new c();

        c() {
            super(2);
        }

        @Override // a6.InterfaceC1668n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke(Map elementsList, Set hiddenIdentifiers) {
            AbstractC3255y.i(elementsList, "elementsList");
            AbstractC3255y.i(hiddenIdentifiers, "hiddenIdentifiers");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : elementsList.entrySet()) {
                if (!hiddenIdentifiers.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return linkedHashMap;
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f40018a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke(Map map) {
            AbstractC3255y.i(map, "map");
            Collection values = map.values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    if (!((C4061a) it.next()).d()) {
                        return null;
                    }
                }
                return map;
            }
            return map;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f40019a = new e();

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3706f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3706f[] f40020a;

            /* renamed from: u3.i$e$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            static final class C0899a extends AbstractC3256z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3706f[] f40021a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0899a(InterfaceC3706f[] interfaceC3706fArr) {
                    super(0);
                    this.f40021a = interfaceC3706fArr;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object[] invoke() {
                    return new List[this.f40021a.length];
                }
            }

            /* loaded from: classes4.dex */
            public static final class b extends l implements InterfaceC1669o {

                /* renamed from: a, reason: collision with root package name */
                int f40022a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f40023b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f40024c;

                public b(S5.d dVar) {
                    super(3, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = T5.b.e();
                    int i8 = this.f40022a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        InterfaceC3707g interfaceC3707g = (InterfaceC3707g) this.f40023b;
                        Map w8 = Q.w(AbstractC1378t.z(AbstractC1378t.W0(AbstractC1371l.V0((Object[]) this.f40024c))));
                        this.f40022a = 1;
                        if (interfaceC3707g.emit(w8, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f8278a;
                }

                @Override // a6.InterfaceC1669o
                public final Object invoke(InterfaceC3707g interfaceC3707g, Object[] objArr, S5.d dVar) {
                    b bVar = new b(dVar);
                    bVar.f40023b = interfaceC3707g;
                    bVar.f40024c = objArr;
                    return bVar.invokeSuspend(I.f8278a);
                }
            }

            public a(InterfaceC3706f[] interfaceC3706fArr) {
                this.f40020a = interfaceC3706fArr;
            }

            @Override // o6.InterfaceC3706f
            public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
                InterfaceC3706f[] interfaceC3706fArr = this.f40020a;
                Object a8 = p6.k.a(interfaceC3707g, interfaceC3706fArr, new C0899a(interfaceC3706fArr), new b(null), dVar);
                if (a8 == T5.b.e()) {
                    return a8;
                }
                return I.f8278a;
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f40025a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(List list) {
                super(0);
                this.f40025a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list = this.f40025a;
                ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC3698L) it.next()).getValue());
                }
                return Q.w(AbstractC1378t.z(AbstractC1378t.W0(arrayList)));
            }
        }

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3698L invoke(List elementsList) {
            InterfaceC3706f aVar;
            AbstractC3255y.i(elementsList, "elementsList");
            List list = elementsList;
            ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((D) it.next()).d());
            }
            if (arrayList.isEmpty()) {
                aVar = y4.g.n(Q.w(AbstractC1378t.z(AbstractC1378t.W0(AbstractC1378t.m()))));
            } else {
                aVar = new a((InterfaceC3706f[]) AbstractC1378t.W0(arrayList).toArray(new InterfaceC3706f[0]));
            }
            return new y4.e(aVar, new b(arrayList));
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f40026a = new f();

        f() {
            super(2);
        }

        @Override // a6.InterfaceC1668n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke(Map elementsList, Set hiddenIdentifiers) {
            AbstractC3255y.i(elementsList, "elementsList");
            AbstractC3255y.i(hiddenIdentifiers, "hiddenIdentifiers");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : elementsList.entrySet()) {
                if (!hiddenIdentifiers.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return linkedHashMap;
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final g f40027a = new g();

        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke(Map map) {
            AbstractC3255y.i(map, "map");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (((C4061a) entry.getValue()).d()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return linkedHashMap;
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f40028a = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3698L invoke(C2907A c2907a) {
            InterfaceC3698L w8;
            if (c2907a == null || (w8 = c2907a.w()) == null) {
                return y4.g.n(a0.f());
            }
            return w8;
        }
    }

    /* renamed from: u3.i$i, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0900i extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0900i f40029a = new C0900i();

        C0900i() {
            super(2);
        }

        @Override // a6.InterfaceC1668n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G invoke(Set hiddenIds, List textFieldControllerIds) {
            Object obj;
            AbstractC3255y.i(hiddenIds, "hiddenIds");
            AbstractC3255y.i(textFieldControllerIds, "textFieldControllerIds");
            ListIterator listIterator = textFieldControllerIds.listIterator(textFieldControllerIds.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    obj = listIterator.previous();
                    if (!hiddenIds.contains((G) obj)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return (G) obj;
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final j f40030a = new j();

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3706f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3706f[] f40031a;

            /* renamed from: u3.i$j$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            static final class C0901a extends AbstractC3256z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3706f[] f40032a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0901a(InterfaceC3706f[] interfaceC3706fArr) {
                    super(0);
                    this.f40032a = interfaceC3706fArr;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object[] invoke() {
                    return new List[this.f40032a.length];
                }
            }

            /* loaded from: classes4.dex */
            public static final class b extends l implements InterfaceC1669o {

                /* renamed from: a, reason: collision with root package name */
                int f40033a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f40034b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f40035c;

                public b(S5.d dVar) {
                    super(3, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = T5.b.e();
                    int i8 = this.f40033a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        InterfaceC3707g interfaceC3707g = (InterfaceC3707g) this.f40034b;
                        List z8 = AbstractC1378t.z(AbstractC1378t.W0(AbstractC1371l.V0((Object[]) this.f40035c)));
                        this.f40033a = 1;
                        if (interfaceC3707g.emit(z8, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f8278a;
                }

                @Override // a6.InterfaceC1669o
                public final Object invoke(InterfaceC3707g interfaceC3707g, Object[] objArr, S5.d dVar) {
                    b bVar = new b(dVar);
                    bVar.f40034b = interfaceC3707g;
                    bVar.f40035c = objArr;
                    return bVar.invokeSuspend(I.f8278a);
                }
            }

            public a(InterfaceC3706f[] interfaceC3706fArr) {
                this.f40031a = interfaceC3706fArr;
            }

            @Override // o6.InterfaceC3706f
            public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
                InterfaceC3706f[] interfaceC3706fArr = this.f40031a;
                Object a8 = p6.k.a(interfaceC3707g, interfaceC3706fArr, new C0901a(interfaceC3706fArr), new b(null), dVar);
                if (a8 == T5.b.e()) {
                    return a8;
                }
                return I.f8278a;
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f40036a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(List list) {
                super(0);
                this.f40036a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list = this.f40036a;
                ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC3698L) it.next()).getValue());
                }
                return AbstractC1378t.z(AbstractC1378t.W0(arrayList));
            }
        }

        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3698L invoke(List elementsList) {
            InterfaceC3706f aVar;
            AbstractC3255y.i(elementsList, "elementsList");
            List list = elementsList;
            ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((D) it.next()).e());
            }
            if (arrayList.isEmpty()) {
                aVar = y4.g.n(AbstractC1378t.z(AbstractC1378t.W0(AbstractC1378t.m())));
            } else {
                aVar = new a((InterfaceC3706f[]) AbstractC1378t.W0(arrayList).toArray(new InterfaceC3706f[0]));
            }
            return new y4.e(aVar, new b(arrayList));
        }
    }

    public i(C2950q0 formSpec, C1626h transformSpecToElement) {
        AbstractC3255y.i(formSpec, "formSpec");
        AbstractC3255y.i(transformSpecToElement, "transformSpecToElement");
        InterfaceC3698L n8 = y4.g.n(C1626h.b(transformSpecToElement, formSpec.a(), null, 2, null));
        this.f40002a = n8;
        InterfaceC3698L m8 = y4.g.m(n8, a.f40009a);
        this.f40003b = m8;
        InterfaceC3698L l8 = y4.g.l(m8, h.f40028a);
        this.f40004c = l8;
        this.f40005d = y4.g.m(y4.g.d(y4.g.l(n8, b.f40010a), l8, c.f40017a), d.f40018a);
        this.f40006e = y4.g.m(y4.g.d(y4.g.l(n8, e.f40019a), l8, f.f40026a), g.f40027a);
        InterfaceC3698L l9 = y4.g.l(n8, j.f40030a);
        this.f40007f = l9;
        this.f40008g = y4.g.d(l8, l9, C0900i.f40029a);
    }

    public final InterfaceC3698L a() {
        return this.f40005d;
    }

    public final InterfaceC3698L b() {
        return this.f40002a;
    }

    public final InterfaceC3698L c() {
        return this.f40006e;
    }

    public final InterfaceC3698L d() {
        return this.f40004c;
    }

    public final InterfaceC3698L e() {
        return this.f40008g;
    }
}
