package e.i;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.b0;
import kotlin.collections.o0;
import kotlin.collections.r;
import kotlin.collections.t;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.u;

/* compiled from: StateMachine.kt */
/* loaded from: classes2.dex */
public final class a<STATE, EVENT, SIDE_EFFECT> {
    public static final C0241a a = new C0241a(null);

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<STATE> f17915b;

    /* renamed from: c, reason: collision with root package name */
    private final b<STATE, EVENT, SIDE_EFFECT> f17916c;

    /* compiled from: StateMachine.kt */
    /* renamed from: e.i.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0241a {
        private C0241a() {
        }

        private final <STATE, EVENT, SIDE_EFFECT> a<STATE, EVENT, SIDE_EFFECT> a(b<STATE, EVENT, SIDE_EFFECT> bVar, Function1<? super c<STATE, EVENT, SIDE_EFFECT>, u> function1) {
            c cVar = new c(bVar);
            function1.invoke(cVar);
            return new a<>(cVar.a(), null);
        }

        public final <STATE, EVENT, SIDE_EFFECT> a<STATE, EVENT, SIDE_EFFECT> b(Function1<? super c<STATE, EVENT, SIDE_EFFECT>, u> function1) {
            l.g(function1, "init");
            return a(null, function1);
        }

        public /* synthetic */ C0241a(g gVar) {
            this();
        }
    }

    /* compiled from: StateMachine.kt */
    /* loaded from: classes2.dex */
    public static final class b<STATE, EVENT, SIDE_EFFECT> {
        private final STATE a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<d<STATE, STATE>, C0242a<STATE, EVENT, SIDE_EFFECT>> f17917b;

        /* renamed from: c, reason: collision with root package name */
        private final List<Function1<e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, u>> f17918c;

        /* compiled from: StateMachine.kt */
        /* renamed from: e.i.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0242a<STATE, EVENT, SIDE_EFFECT> {
            private final List<Function2<STATE, EVENT, u>> a = new ArrayList();

            /* renamed from: b, reason: collision with root package name */
            private final List<Function2<STATE, EVENT, u>> f17919b = new ArrayList();

            /* renamed from: c, reason: collision with root package name */
            private final LinkedHashMap<d<EVENT, EVENT>, Function2<STATE, EVENT, C0243a<STATE, SIDE_EFFECT>>> f17920c = new LinkedHashMap<>();

            /* compiled from: StateMachine.kt */
            /* renamed from: e.i.a$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0243a<STATE, SIDE_EFFECT> {
                private final STATE a;

                /* renamed from: b, reason: collision with root package name */
                private final SIDE_EFFECT f17921b;

                public C0243a(STATE state, SIDE_EFFECT side_effect) {
                    l.g(state, "toState");
                    this.a = state;
                    this.f17921b = side_effect;
                }

                public final STATE a() {
                    return this.a;
                }

                public final SIDE_EFFECT b() {
                    return this.f17921b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0243a)) {
                        return false;
                    }
                    C0243a c0243a = (C0243a) obj;
                    return l.a(this.a, c0243a.a) && l.a(this.f17921b, c0243a.f17921b);
                }

                public int hashCode() {
                    STATE state = this.a;
                    int hashCode = (state != null ? state.hashCode() : 0) * 31;
                    SIDE_EFFECT side_effect = this.f17921b;
                    return hashCode + (side_effect != null ? side_effect.hashCode() : 0);
                }

                public String toString() {
                    return "TransitionTo(toState=" + this.a + ", sideEffect=" + this.f17921b + ")";
                }
            }

            public final List<Function2<STATE, EVENT, u>> a() {
                return this.a;
            }

            public final List<Function2<STATE, EVENT, u>> b() {
                return this.f17919b;
            }

            public final LinkedHashMap<d<EVENT, EVENT>, Function2<STATE, EVENT, C0243a<STATE, SIDE_EFFECT>>> c() {
                return this.f17920c;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(STATE state, Map<d<STATE, STATE>, C0242a<STATE, EVENT, SIDE_EFFECT>> map, List<? extends Function1<? super e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, u>> list) {
            l.g(state, "initialState");
            l.g(map, "stateDefinitions");
            l.g(list, "onTransitionListeners");
            this.a = state;
            this.f17917b = map;
            this.f17918c = list;
        }

        public final STATE a() {
            return this.a;
        }

        public final List<Function1<e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, u>> b() {
            return this.f17918c;
        }

        public final Map<d<STATE, STATE>, C0242a<STATE, EVENT, SIDE_EFFECT>> c() {
            return this.f17917b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return l.a(this.a, bVar.a) && l.a(this.f17917b, bVar.f17917b) && l.a(this.f17918c, bVar.f17918c);
        }

        public int hashCode() {
            STATE state = this.a;
            int hashCode = (state != null ? state.hashCode() : 0) * 31;
            Map<d<STATE, STATE>, C0242a<STATE, EVENT, SIDE_EFFECT>> map = this.f17917b;
            int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
            List<Function1<e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, u>> list = this.f17918c;
            return hashCode2 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Graph(initialState=" + this.a + ", stateDefinitions=" + this.f17917b + ", onTransitionListeners=" + this.f17918c + ")";
        }
    }

    /* compiled from: StateMachine.kt */
    /* loaded from: classes2.dex */
    public static abstract class e<STATE, EVENT, SIDE_EFFECT> {

        /* compiled from: StateMachine.kt */
        /* renamed from: e.i.a$e$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0247a<STATE, EVENT, SIDE_EFFECT> extends e<STATE, EVENT, SIDE_EFFECT> {
            private final STATE a;

            /* renamed from: b, reason: collision with root package name */
            private final EVENT f17930b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0247a(STATE state, EVENT event) {
                super(null);
                l.g(state, "fromState");
                l.g(event, "event");
                this.a = state;
                this.f17930b = event;
            }

            public EVENT a() {
                return this.f17930b;
            }

            public STATE b() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0247a)) {
                    return false;
                }
                C0247a c0247a = (C0247a) obj;
                return l.a(b(), c0247a.b()) && l.a(a(), c0247a.a());
            }

            public int hashCode() {
                STATE b2 = b();
                int hashCode = (b2 != null ? b2.hashCode() : 0) * 31;
                EVENT a = a();
                return hashCode + (a != null ? a.hashCode() : 0);
            }

            public String toString() {
                return "Invalid(fromState=" + b() + ", event=" + a() + ")";
            }
        }

        /* compiled from: StateMachine.kt */
        /* loaded from: classes2.dex */
        public static final class b<STATE, EVENT, SIDE_EFFECT> extends e<STATE, EVENT, SIDE_EFFECT> {
            private final STATE a;

            /* renamed from: b, reason: collision with root package name */
            private final EVENT f17931b;

            /* renamed from: c, reason: collision with root package name */
            private final STATE f17932c;

            /* renamed from: d, reason: collision with root package name */
            private final SIDE_EFFECT f17933d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(STATE state, EVENT event, STATE state2, SIDE_EFFECT side_effect) {
                super(null);
                l.g(state, "fromState");
                l.g(event, "event");
                l.g(state2, "toState");
                this.a = state;
                this.f17931b = event;
                this.f17932c = state2;
                this.f17933d = side_effect;
            }

            public EVENT a() {
                return this.f17931b;
            }

            public STATE b() {
                return this.a;
            }

            public final STATE c() {
                return this.f17932c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return l.a(b(), bVar.b()) && l.a(a(), bVar.a()) && l.a(this.f17932c, bVar.f17932c) && l.a(this.f17933d, bVar.f17933d);
            }

            public int hashCode() {
                STATE b2 = b();
                int hashCode = (b2 != null ? b2.hashCode() : 0) * 31;
                EVENT a = a();
                int hashCode2 = (hashCode + (a != null ? a.hashCode() : 0)) * 31;
                STATE state = this.f17932c;
                int hashCode3 = (hashCode2 + (state != null ? state.hashCode() : 0)) * 31;
                SIDE_EFFECT side_effect = this.f17933d;
                return hashCode3 + (side_effect != null ? side_effect.hashCode() : 0);
            }

            public String toString() {
                return "Valid(fromState=" + b() + ", event=" + a() + ", toState=" + this.f17932c + ", sideEffect=" + this.f17933d + ")";
            }
        }

        private e() {
        }

        public /* synthetic */ e(g gVar) {
            this();
        }
    }

    private a(b<STATE, EVENT, SIDE_EFFECT> bVar) {
        this.f17916c = bVar;
        this.f17915b = new AtomicReference<>(bVar.a());
    }

    private final b.C0242a<STATE, EVENT, SIDE_EFFECT> a(STATE state) {
        Map<d<STATE, STATE>, b.C0242a<STATE, EVENT, SIDE_EFFECT>> c2 = this.f17916c.c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<d<STATE, STATE>, b.C0242a<STATE, EVENT, SIDE_EFFECT>> entry : c2.entrySet()) {
            if (entry.getKey().b(state)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((b.C0242a) ((Map.Entry) it.next()).getValue());
        }
        b.C0242a<STATE, EVENT, SIDE_EFFECT> c0242a = (b.C0242a) r.T(arrayList);
        if (c0242a != null) {
            return c0242a;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    private final e<STATE, EVENT, SIDE_EFFECT> c(STATE state, EVENT event) {
        for (Map.Entry<d<EVENT, EVENT>, Function2<STATE, EVENT, b.C0242a.C0243a<STATE, SIDE_EFFECT>>> entry : a(state).c().entrySet()) {
            d<EVENT, EVENT> key = entry.getKey();
            Function2<STATE, EVENT, b.C0242a.C0243a<STATE, SIDE_EFFECT>> value = entry.getValue();
            if (key.b(event)) {
                b.C0242a.C0243a<STATE, SIDE_EFFECT> invoke = value.invoke(state, event);
                return new e.b(state, event, invoke.a(), invoke.b());
            }
        }
        return new e.C0247a(state, event);
    }

    private final void d(STATE state, EVENT event) {
        Iterator<T> it = a(state).a().iterator();
        while (it.hasNext()) {
            ((Function2) it.next()).invoke(state, event);
        }
    }

    private final void e(STATE state, EVENT event) {
        Iterator<T> it = a(state).b().iterator();
        while (it.hasNext()) {
            ((Function2) it.next()).invoke(state, event);
        }
    }

    private final void f(e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT> eVar) {
        Iterator<T> it = this.f17916c.b().iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(eVar);
        }
    }

    public final STATE b() {
        STATE state = this.f17915b.get();
        l.b(state, "stateRef.get()");
        return state;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e<STATE, EVENT, SIDE_EFFECT> g(EVENT event) {
        e<STATE, EVENT, SIDE_EFFECT> c2;
        l.g(event, "event");
        synchronized (this) {
            STATE state = this.f17915b.get();
            l.b(state, "fromState");
            c2 = c(state, event);
            if (c2 instanceof e.b) {
                this.f17915b.set(((e.b) c2).c());
            }
        }
        f(c2);
        if (c2 instanceof e.b) {
            e.b bVar = (e.b) c2;
            e(bVar.b(), event);
            d(bVar.c(), event);
        }
        return c2;
    }

    /* compiled from: StateMachine.kt */
    /* loaded from: classes2.dex */
    public static final class d<T, R extends T> {
        public static final C0246a a = new C0246a(null);

        /* renamed from: b, reason: collision with root package name */
        private final List<Function1<T, Boolean>> f17927b;

        /* renamed from: c, reason: collision with root package name */
        private final Class<R> f17928c;

        /* compiled from: StateMachine.kt */
        /* renamed from: e.i.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0246a {
            private C0246a() {
            }

            public final <T, R extends T> d<T, R> a(Class<R> cls) {
                l.g(cls, "clazz");
                return new d<>(cls, null);
            }

            public /* synthetic */ C0246a(g gVar) {
                this();
            }
        }

        /* compiled from: StateMachine.kt */
        /* loaded from: classes2.dex */
        static final class b extends Lambda implements Function1<T, Boolean> {
            b() {
                super(1);
            }

            public final boolean b(T t) {
                l.g(t, "it");
                return d.this.f17928c.isInstance(t);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                return Boolean.valueOf(b(obj));
            }
        }

        private d(Class<R> cls) {
            List<Function1<T, Boolean>> o;
            this.f17928c = cls;
            o = t.o(new b());
            this.f17927b = o;
        }

        public final boolean b(T t) {
            l.g(t, "value");
            List<Function1<T, Boolean>> list = this.f17927b;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((Boolean) ((Function1) it.next()).invoke(t)).booleanValue()) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ d(Class cls, g gVar) {
            this(cls);
        }
    }

    public /* synthetic */ a(b bVar, g gVar) {
        this(bVar);
    }

    /* compiled from: StateMachine.kt */
    /* loaded from: classes2.dex */
    public static final class c<STATE, EVENT, SIDE_EFFECT> {
        private STATE a;

        /* renamed from: b, reason: collision with root package name */
        private final LinkedHashMap<d<STATE, STATE>, b.C0242a<STATE, EVENT, SIDE_EFFECT>> f17922b;

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList<Function1<e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, u>> f17923c;

        /* compiled from: StateMachine.kt */
        /* renamed from: e.i.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public final class C0244a<S extends STATE> {
            private final b.C0242a<STATE, EVENT, SIDE_EFFECT> a = new b.C0242a<>();

            /* compiled from: StateMachine.kt */
            /* renamed from: e.i.a$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            static final class C0245a extends Lambda implements Function2<STATE, EVENT, b.C0242a.C0243a<? extends STATE, ? extends SIDE_EFFECT>> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function2 f17925f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0245a(Function2 function2) {
                    super(2);
                    this.f17925f = function2;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b.C0242a.C0243a<STATE, SIDE_EFFECT> invoke(STATE state, EVENT event) {
                    l.g(state, "state");
                    l.g(event, "event");
                    return (b.C0242a.C0243a) this.f17925f.invoke(state, event);
                }
            }

            /* compiled from: StateMachine.kt */
            /* renamed from: e.i.a$c$a$b */
            /* loaded from: classes2.dex */
            static final class b extends Lambda implements Function2<STATE, EVENT, u> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function2 f17926f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(Function2 function2) {
                    super(2);
                    this.f17926f = function2;
                }

                public final void b(STATE state, EVENT event) {
                    l.g(state, "state");
                    l.g(event, "cause");
                    this.f17926f.invoke(state, event);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ u invoke(Object obj, Object obj2) {
                    b(obj, obj2);
                    return u.a;
                }
            }

            public C0244a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* bridge */ /* synthetic */ b.C0242a.C0243a c(C0244a c0244a, Object obj, Object obj2, int i2, Object obj3) {
                if ((i2 & 1) != 0) {
                    obj2 = null;
                }
                return c0244a.b(obj, obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* bridge */ /* synthetic */ b.C0242a.C0243a g(C0244a c0244a, Object obj, Object obj2, Object obj3, int i2, Object obj4) {
                if ((i2 & 2) != 0) {
                    obj3 = null;
                }
                return c0244a.f(obj, obj2, obj3);
            }

            public final b.C0242a<STATE, EVENT, SIDE_EFFECT> a() {
                return this.a;
            }

            public final b.C0242a.C0243a<STATE, SIDE_EFFECT> b(S s, SIDE_EFFECT side_effect) {
                l.g(s, "$receiver");
                return f(s, s, side_effect);
            }

            public final <E extends EVENT> void d(d<EVENT, ? extends E> dVar, Function2<? super S, ? super E, ? extends b.C0242a.C0243a<? extends STATE, ? extends SIDE_EFFECT>> function2) {
                l.g(dVar, "eventMatcher");
                l.g(function2, "createTransitionTo");
                this.a.c().put(dVar, new C0245a(function2));
            }

            public final boolean e(Function2<? super S, ? super EVENT, u> function2) {
                l.g(function2, "listener");
                return this.a.a().add(new b(function2));
            }

            public final b.C0242a.C0243a<STATE, SIDE_EFFECT> f(S s, STATE state, SIDE_EFFECT side_effect) {
                l.g(s, "$receiver");
                l.g(state, "state");
                return new b.C0242a.C0243a<>(state, side_effect);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public c(b<STATE, EVENT, SIDE_EFFECT> bVar) {
            List<Function1<e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, u>> b2;
            Map<d<STATE, STATE>, b.C0242a<STATE, EVENT, SIDE_EFFECT>> c2;
            this.a = bVar != null ? bVar.a() : null;
            this.f17922b = new LinkedHashMap<>((bVar == null || (c2 = bVar.c()) == null) ? o0.i() : c2);
            this.f17923c = new ArrayList<>((bVar == null || (b2 = bVar.b()) == null) ? t.i() : b2);
        }

        public final b<STATE, EVENT, SIDE_EFFECT> a() {
            Map s;
            List y0;
            STATE state = this.a;
            if (state == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            s = o0.s(this.f17922b);
            y0 = b0.y0(this.f17923c);
            return new b<>(state, s, y0);
        }

        public final void b(STATE state) {
            l.g(state, "initialState");
            this.a = state;
        }

        public final <S extends STATE> void c(d<STATE, ? extends S> dVar, Function1<? super c<STATE, EVENT, SIDE_EFFECT>.C0244a<S>, u> function1) {
            l.g(dVar, "stateMatcher");
            l.g(function1, "init");
            LinkedHashMap<d<STATE, STATE>, b.C0242a<STATE, EVENT, SIDE_EFFECT>> linkedHashMap = this.f17922b;
            C0244a c0244a = new C0244a();
            function1.invoke(c0244a);
            linkedHashMap.put(dVar, c0244a.a());
        }

        public /* synthetic */ c(b bVar, int i2, g gVar) {
            this((i2 & 1) != 0 ? null : bVar);
        }
    }
}
