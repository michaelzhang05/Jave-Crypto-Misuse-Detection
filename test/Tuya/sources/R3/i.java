package r3;

import L5.I;
import L5.t;
import M5.AbstractC1239l;
import M5.AbstractC1246t;
import M5.Q;
import M5.a0;
import X5.n;
import X5.o;
import e4.C2587A;
import e4.C2630q0;
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
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;
import m4.D;
import m4.G;
import m4.h0;
import r4.C3688a;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3349K f37622a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f37623b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3349K f37624c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3349K f37625d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3349K f37626e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3349K f37627f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3349K f37628g;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f37629a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2587A invoke(List elementsList) {
            AbstractC3159y.i(elementsList, "elementsList");
            ArrayList arrayList = new ArrayList();
            for (Object obj : elementsList) {
                if (obj instanceof h0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC1246t.D(arrayList2, ((h0) it.next()).g());
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (obj2 instanceof C2587A) {
                    arrayList3.add(obj2);
                }
            }
            return (C2587A) AbstractC1246t.o0(arrayList3);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f37630a = new b();

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3358f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3358f[] f37631a;

            /* renamed from: r3.i$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            static final class C0861a extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3358f[] f37632a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0861a(InterfaceC3358f[] interfaceC3358fArr) {
                    super(0);
                    this.f37632a = interfaceC3358fArr;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object[] invoke() {
                    return new List[this.f37632a.length];
                }
            }

            /* renamed from: r3.i$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0862b extends l implements o {

                /* renamed from: a, reason: collision with root package name */
                int f37633a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f37634b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f37635c;

                public C0862b(P5.d dVar) {
                    super(3, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = Q5.b.e();
                    int i8 = this.f37633a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        InterfaceC3359g interfaceC3359g = (InterfaceC3359g) this.f37634b;
                        Map w8 = Q.w(AbstractC1246t.z(AbstractC1246t.W0(AbstractC1239l.V0((Object[]) this.f37635c))));
                        this.f37633a = 1;
                        if (interfaceC3359g.emit(w8, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f6487a;
                }

                @Override // X5.o
                public final Object invoke(InterfaceC3359g interfaceC3359g, Object[] objArr, P5.d dVar) {
                    C0862b c0862b = new C0862b(dVar);
                    c0862b.f37634b = interfaceC3359g;
                    c0862b.f37635c = objArr;
                    return c0862b.invokeSuspend(I.f6487a);
                }
            }

            public a(InterfaceC3358f[] interfaceC3358fArr) {
                this.f37631a = interfaceC3358fArr;
            }

            @Override // l6.InterfaceC3358f
            public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
                InterfaceC3358f[] interfaceC3358fArr = this.f37631a;
                Object a8 = m6.k.a(interfaceC3359g, interfaceC3358fArr, new C0861a(interfaceC3358fArr), new C0862b(null), dVar);
                if (a8 == Q5.b.e()) {
                    return a8;
                }
                return I.f6487a;
            }
        }

        /* renamed from: r3.i$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0863b extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f37636a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0863b(List list) {
                super(0);
                this.f37636a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list = this.f37636a;
                ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC3349K) it.next()).getValue());
                }
                return Q.w(AbstractC1246t.z(AbstractC1246t.W0(arrayList)));
            }
        }

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3349K invoke(List elementsList) {
            InterfaceC3358f aVar;
            AbstractC3159y.i(elementsList, "elementsList");
            List list = elementsList;
            ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((D) it.next()).d());
            }
            if (arrayList.isEmpty()) {
                aVar = v4.g.n(Q.w(AbstractC1246t.z(AbstractC1246t.W0(AbstractC1246t.m()))));
            } else {
                aVar = new a((InterfaceC3358f[]) AbstractC1246t.W0(arrayList).toArray(new InterfaceC3358f[0]));
            }
            return new v4.e(aVar, new C0863b(arrayList));
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f37637a = new c();

        c() {
            super(2);
        }

        @Override // X5.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke(Map elementsList, Set hiddenIdentifiers) {
            AbstractC3159y.i(elementsList, "elementsList");
            AbstractC3159y.i(hiddenIdentifiers, "hiddenIdentifiers");
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
    static final class d extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f37638a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke(Map map) {
            AbstractC3159y.i(map, "map");
            Collection values = map.values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    if (!((C3688a) it.next()).d()) {
                        return null;
                    }
                }
                return map;
            }
            return map;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f37639a = new e();

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3358f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3358f[] f37640a;

            /* renamed from: r3.i$e$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            static final class C0864a extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3358f[] f37641a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0864a(InterfaceC3358f[] interfaceC3358fArr) {
                    super(0);
                    this.f37641a = interfaceC3358fArr;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object[] invoke() {
                    return new List[this.f37641a.length];
                }
            }

            /* loaded from: classes4.dex */
            public static final class b extends l implements o {

                /* renamed from: a, reason: collision with root package name */
                int f37642a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f37643b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f37644c;

                public b(P5.d dVar) {
                    super(3, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = Q5.b.e();
                    int i8 = this.f37642a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        InterfaceC3359g interfaceC3359g = (InterfaceC3359g) this.f37643b;
                        Map w8 = Q.w(AbstractC1246t.z(AbstractC1246t.W0(AbstractC1239l.V0((Object[]) this.f37644c))));
                        this.f37642a = 1;
                        if (interfaceC3359g.emit(w8, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f6487a;
                }

                @Override // X5.o
                public final Object invoke(InterfaceC3359g interfaceC3359g, Object[] objArr, P5.d dVar) {
                    b bVar = new b(dVar);
                    bVar.f37643b = interfaceC3359g;
                    bVar.f37644c = objArr;
                    return bVar.invokeSuspend(I.f6487a);
                }
            }

            public a(InterfaceC3358f[] interfaceC3358fArr) {
                this.f37640a = interfaceC3358fArr;
            }

            @Override // l6.InterfaceC3358f
            public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
                InterfaceC3358f[] interfaceC3358fArr = this.f37640a;
                Object a8 = m6.k.a(interfaceC3359g, interfaceC3358fArr, new C0864a(interfaceC3358fArr), new b(null), dVar);
                if (a8 == Q5.b.e()) {
                    return a8;
                }
                return I.f6487a;
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f37645a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(List list) {
                super(0);
                this.f37645a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list = this.f37645a;
                ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC3349K) it.next()).getValue());
                }
                return Q.w(AbstractC1246t.z(AbstractC1246t.W0(arrayList)));
            }
        }

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3349K invoke(List elementsList) {
            InterfaceC3358f aVar;
            AbstractC3159y.i(elementsList, "elementsList");
            List list = elementsList;
            ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((D) it.next()).d());
            }
            if (arrayList.isEmpty()) {
                aVar = v4.g.n(Q.w(AbstractC1246t.z(AbstractC1246t.W0(AbstractC1246t.m()))));
            } else {
                aVar = new a((InterfaceC3358f[]) AbstractC1246t.W0(arrayList).toArray(new InterfaceC3358f[0]));
            }
            return new v4.e(aVar, new b(arrayList));
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f37646a = new f();

        f() {
            super(2);
        }

        @Override // X5.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke(Map elementsList, Set hiddenIdentifiers) {
            AbstractC3159y.i(elementsList, "elementsList");
            AbstractC3159y.i(hiddenIdentifiers, "hiddenIdentifiers");
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
    static final class g extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final g f37647a = new g();

        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke(Map map) {
            AbstractC3159y.i(map, "map");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (((C3688a) entry.getValue()).d()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return linkedHashMap;
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f37648a = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3349K invoke(C2587A c2587a) {
            InterfaceC3349K w8;
            if (c2587a == null || (w8 = c2587a.w()) == null) {
                return v4.g.n(a0.f());
            }
            return w8;
        }
    }

    /* renamed from: r3.i$i, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0865i extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0865i f37649a = new C0865i();

        C0865i() {
            super(2);
        }

        @Override // X5.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G invoke(Set hiddenIds, List textFieldControllerIds) {
            Object obj;
            AbstractC3159y.i(hiddenIds, "hiddenIds");
            AbstractC3159y.i(textFieldControllerIds, "textFieldControllerIds");
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
    static final class j extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final j f37650a = new j();

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3358f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3358f[] f37651a;

            /* renamed from: r3.i$j$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            static final class C0866a extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3358f[] f37652a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0866a(InterfaceC3358f[] interfaceC3358fArr) {
                    super(0);
                    this.f37652a = interfaceC3358fArr;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object[] invoke() {
                    return new List[this.f37652a.length];
                }
            }

            /* loaded from: classes4.dex */
            public static final class b extends l implements o {

                /* renamed from: a, reason: collision with root package name */
                int f37653a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f37654b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f37655c;

                public b(P5.d dVar) {
                    super(3, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = Q5.b.e();
                    int i8 = this.f37653a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        InterfaceC3359g interfaceC3359g = (InterfaceC3359g) this.f37654b;
                        List z8 = AbstractC1246t.z(AbstractC1246t.W0(AbstractC1239l.V0((Object[]) this.f37655c)));
                        this.f37653a = 1;
                        if (interfaceC3359g.emit(z8, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f6487a;
                }

                @Override // X5.o
                public final Object invoke(InterfaceC3359g interfaceC3359g, Object[] objArr, P5.d dVar) {
                    b bVar = new b(dVar);
                    bVar.f37654b = interfaceC3359g;
                    bVar.f37655c = objArr;
                    return bVar.invokeSuspend(I.f6487a);
                }
            }

            public a(InterfaceC3358f[] interfaceC3358fArr) {
                this.f37651a = interfaceC3358fArr;
            }

            @Override // l6.InterfaceC3358f
            public Object collect(InterfaceC3359g interfaceC3359g, P5.d dVar) {
                InterfaceC3358f[] interfaceC3358fArr = this.f37651a;
                Object a8 = m6.k.a(interfaceC3359g, interfaceC3358fArr, new C0866a(interfaceC3358fArr), new b(null), dVar);
                if (a8 == Q5.b.e()) {
                    return a8;
                }
                return I.f6487a;
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f37656a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(List list) {
                super(0);
                this.f37656a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list = this.f37656a;
                ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC3349K) it.next()).getValue());
                }
                return AbstractC1246t.z(AbstractC1246t.W0(arrayList));
            }
        }

        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3349K invoke(List elementsList) {
            InterfaceC3358f aVar;
            AbstractC3159y.i(elementsList, "elementsList");
            List list = elementsList;
            ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((D) it.next()).e());
            }
            if (arrayList.isEmpty()) {
                aVar = v4.g.n(AbstractC1246t.z(AbstractC1246t.W0(AbstractC1246t.m())));
            } else {
                aVar = new a((InterfaceC3358f[]) AbstractC1246t.W0(arrayList).toArray(new InterfaceC3358f[0]));
            }
            return new v4.e(aVar, new b(arrayList));
        }
    }

    public i(C2630q0 formSpec, X2.h transformSpecToElement) {
        AbstractC3159y.i(formSpec, "formSpec");
        AbstractC3159y.i(transformSpecToElement, "transformSpecToElement");
        InterfaceC3349K n8 = v4.g.n(X2.h.b(transformSpecToElement, formSpec.a(), null, 2, null));
        this.f37622a = n8;
        InterfaceC3349K m8 = v4.g.m(n8, a.f37629a);
        this.f37623b = m8;
        InterfaceC3349K l8 = v4.g.l(m8, h.f37648a);
        this.f37624c = l8;
        this.f37625d = v4.g.m(v4.g.d(v4.g.l(n8, b.f37630a), l8, c.f37637a), d.f37638a);
        this.f37626e = v4.g.m(v4.g.d(v4.g.l(n8, e.f37639a), l8, f.f37646a), g.f37647a);
        InterfaceC3349K l9 = v4.g.l(n8, j.f37650a);
        this.f37627f = l9;
        this.f37628g = v4.g.d(l8, l9, C0865i.f37649a);
    }

    public final InterfaceC3349K a() {
        return this.f37625d;
    }

    public final InterfaceC3349K b() {
        return this.f37622a;
    }

    public final InterfaceC3349K c() {
        return this.f37626e;
    }

    public final InterfaceC3349K d() {
        return this.f37624c;
    }

    public final InterfaceC3349K e() {
        return this.f37628g;
    }
}
