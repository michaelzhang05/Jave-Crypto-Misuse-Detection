package com.stripe.android.paymentsheet;

import B3.f;
import C3.c;
import M3.C1314i;
import M3.InterfaceC1319n;
import M3.InterfaceC1324t;
import O5.C1352h;
import O5.I;
import O5.InterfaceC1355k;
import P5.AbstractC1378t;
import a3.C1625g;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.lifecycle.ViewModelKt;
import b3.C1970d;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.p;
import e3.EnumC2791e;
import f4.InterfaceC2835a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3364k;
import l6.M;
import l6.X;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;
import o6.InterfaceC3707g;
import t3.C4028b;

/* loaded from: classes4.dex */
public final class B {

    /* renamed from: u, reason: collision with root package name */
    public static final e f26425u = new e(null);

    /* renamed from: v, reason: collision with root package name */
    public static final int f26426v = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1324t.a f26427a;

    /* renamed from: b, reason: collision with root package name */
    private final EventReporter f26428b;

    /* renamed from: c, reason: collision with root package name */
    private final M f26429c;

    /* renamed from: d, reason: collision with root package name */
    private final S5.g f26430d;

    /* renamed from: e, reason: collision with root package name */
    private final C3.b f26431e;

    /* renamed from: f, reason: collision with root package name */
    private final K3.c f26432f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f26433g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3698L f26434h;

    /* renamed from: i, reason: collision with root package name */
    private final Function1 f26435i;

    /* renamed from: j, reason: collision with root package name */
    private final Function0 f26436j;

    /* renamed from: k, reason: collision with root package name */
    private final Function0 f26437k;

    /* renamed from: l, reason: collision with root package name */
    private final Function0 f26438l;

    /* renamed from: m, reason: collision with root package name */
    private final C4028b f26439m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3698L f26440n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC3698L f26441o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC1355k f26442p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3698L f26443q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC3698L f26444r;

    /* renamed from: s, reason: collision with root package name */
    private final o6.w f26445s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC3698L f26446t;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f26447a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.B$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0560a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ B f26449a;

            C0560a(B b8) {
                this.f26449a = b8;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(B3.f fVar, S5.d dVar) {
                if (fVar instanceof f.C0009f) {
                    this.f26449a.f26439m.e(((f.C0009f) fVar).r());
                }
                return I.f8278a;
            }
        }

        a(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f26447a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L interfaceC3698L = B.this.f26434h;
                C0560a c0560a = new C0560a(B.this);
                this.f26447a = 1;
                if (interfaceC3698L.collect(c0560a, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f26450a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ B f26452a;

            a(B b8) {
                this.f26452a = b8;
            }

            public final Object a(boolean z8, S5.d dVar) {
                if (!z8 && ((Boolean) this.f26452a.n().getValue()).booleanValue()) {
                    this.f26452a.f26445s.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                }
                return I.f8278a;
            }

            @Override // o6.InterfaceC3707g
            public /* bridge */ /* synthetic */ Object emit(Object obj, S5.d dVar) {
                return a(((Boolean) obj).booleanValue(), dVar);
            }
        }

        b(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f26450a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L l8 = B.this.l();
                a aVar = new a(B.this);
                this.f26450a = 1;
                if (l8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f26453a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ B f26455a;

            a(B b8) {
                this.f26455a = b8;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(List list, S5.d dVar) {
                if (list.isEmpty() && ((Boolean) this.f26455a.n().getValue()).booleanValue()) {
                    this.f26455a.f26445s.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                }
                return I.f8278a;
            }
        }

        c(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f26453a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L c8 = B.this.f26439m.c();
                a aVar = new a(B.this);
                this.f26453a = 1;
                if (c8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f26456a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ B f26458a;

            a(B b8) {
                this.f26458a = b8;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(C3.c cVar, S5.d dVar) {
                if (cVar instanceof c.k) {
                    this.f26458a.f26445s.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                }
                return I.f8278a;
            }
        }

        d(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f26456a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L interfaceC3698L = B.this.f26440n;
                a aVar = new a(B.this);
                this.f26456a = 1;
                if (interfaceC3698L.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f26459a = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(C1970d c1970d) {
                boolean z8 = false;
                if (c1970d != null && c1970d.a0()) {
                    z8 = true;
                }
                return Boolean.valueOf(z8);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P3.a f26460a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(P3.a aVar) {
                super(1);
                this.f26460a = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final B2.b invoke(String str) {
                C1625g c1625g;
                B2.b bVar = null;
                if (str != null) {
                    C1970d c1970d = (C1970d) this.f26460a.t().getValue();
                    if (c1970d != null) {
                        c1625g = c1970d.g0(str);
                    } else {
                        c1625g = null;
                    }
                    if (c1625g != null) {
                        bVar = c1625g.f();
                    }
                }
                return B2.c.c(bVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P3.a f26461a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(P3.a aVar) {
                super(0);
                this.f26461a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C3.c invoke() {
                C1314i.e eVar = C1314i.f6895r;
                P3.a aVar = this.f26461a;
                Object value = aVar.t().getValue();
                if (value != null) {
                    return new c.b(eVar.a(aVar, (C1970d) value));
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class d extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P3.a f26462a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(P3.a aVar) {
                super(0);
                this.f26462a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5515invoke();
                return I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5515invoke() {
                this.f26462a.M(null);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.B$e$e, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0561e extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P3.a f26463a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0561e(P3.a aVar) {
                super(0);
                this.f26463a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                Object value = this.f26463a.t().getValue();
                if (value != null) {
                    return Boolean.valueOf(((C1970d) value).W().c());
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class f extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P3.a f26464a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(P3.a aVar) {
                super(0);
                this.f26464a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                C1970d c1970d = (C1970d) this.f26464a.t().getValue();
                return Boolean.valueOf((c1970d != null ? c1970d.w() : null) instanceof InterfaceC2835a.b);
            }
        }

        private e() {
        }

        public final B a(P3.a viewModel) {
            AbstractC3255y.i(viewModel, "viewModel");
            return new B(viewModel.l(), viewModel.n(), ViewModelKt.getViewModelScope(viewModel), viewModel.B(), viewModel.r(), viewModel.h(), viewModel.f().g(), viewModel.y(), new b(viewModel), new c(viewModel), new d(viewModel), new C0561e(viewModel), viewModel.i(), viewModel.r().f(), new f(viewModel), y4.g.m(viewModel.t(), a.f26459a), viewModel.p().g(), !viewModel.F());
        }

        public /* synthetic */ e(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f26465a = new f();

        f() {
            super(2);
        }

        public final Boolean a(boolean z8, List items) {
            boolean z9;
            AbstractC3255y.i(items, "items");
            if (!z8) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : items) {
                    if (obj instanceof p.d) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((p.d) it.next()).f()) {
                        }
                    }
                }
                z9 = false;
                return Boolean.valueOf(z9);
            }
            z9 = true;
            return Boolean.valueOf(z9);
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (List) obj2);
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3256z implements Function1 {
        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(L3.a aVar) {
            boolean z8 = false;
            if (aVar != null) {
                B b8 = B.this;
                boolean b9 = aVar.i().b();
                int size = aVar.h().size();
                if (size != 0) {
                    if (size != 1) {
                        z8 = b9;
                    } else if (b8.f26433g && b9) {
                        z8 = true;
                    }
                }
            }
            return Boolean.valueOf(z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f26467a;

        /* renamed from: b, reason: collision with root package name */
        Object f26468b;

        /* renamed from: c, reason: collision with root package name */
        Object f26469c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f26470d;

        /* renamed from: f, reason: collision with root package name */
        int f26472f;

        h(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26470d = obj;
            this.f26472f |= Integer.MIN_VALUE;
            Object r8 = B.this.r(null, null, this);
            return r8 == T5.b.e() ? r8 : O5.s.a(r8);
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3256z implements Function1 {
        i() {
            super(1);
        }

        public final void a(InterfaceC1319n.a event) {
            AbstractC3255y.i(event, "event");
            if (event instanceof InterfaceC1319n.a.b) {
                B.this.f26428b.p(EventReporter.a.f26783a, ((InterfaceC1319n.a.b) event).a());
            } else if (event instanceof InterfaceC1319n.a.C0131a) {
                B.this.f26428b.d(EventReporter.a.f26783a, ((InterfaceC1319n.a.C0131a) event).a());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC1319n.a) obj);
            return I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f26474a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f26475b;

        j(S5.d dVar) {
            super(2, dVar);
        }

        @Override // a6.InterfaceC1668n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.stripe.android.model.o oVar, S5.d dVar) {
            return ((j) create(oVar, dVar)).invokeSuspend(I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            j jVar = new j(dVar);
            jVar.f26475b = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f26474a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                com.stripe.android.model.o oVar = (com.stripe.android.model.o) this.f26475b;
                B b8 = B.this;
                this.f26474a = 1;
                obj = b8.v(oVar, this);
                if (obj == e8) {
                    return e8;
                }
            }
            return obj;
        }
    }

    /* loaded from: classes4.dex */
    static final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        int f26477a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f26478b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f26479c;

        k(S5.d dVar) {
            super(3, dVar);
        }

        @Override // a6.InterfaceC1669o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.stripe.android.model.o oVar, EnumC2791e enumC2791e, S5.d dVar) {
            k kVar = new k(dVar);
            kVar.f26478b = oVar;
            kVar.f26479c = enumC2791e;
            return kVar.invokeSuspend(I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object r8;
            Object e8 = T5.b.e();
            int i8 = this.f26477a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                    r8 = ((O5.s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                com.stripe.android.model.o oVar = (com.stripe.android.model.o) this.f26478b;
                EnumC2791e enumC2791e = (EnumC2791e) this.f26479c;
                B b8 = B.this;
                this.f26478b = null;
                this.f26477a = 1;
                r8 = b8.r(oVar, enumC2791e, this);
                if (r8 == e8) {
                    return e8;
                }
            }
            return O5.s.a(r8);
        }
    }

    /* loaded from: classes4.dex */
    static final class l extends AbstractC3256z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f26482b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f26483c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f26484d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f26485e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(InterfaceC3698L interfaceC3698L, InterfaceC3698L interfaceC3698L2, boolean z8, Function0 function0) {
            super(0);
            this.f26482b = interfaceC3698L;
            this.f26483c = interfaceC3698L2;
            this.f26484d = z8;
            this.f26485e = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P3.b invoke() {
            InterfaceC3698L a8 = B.this.f26439m.a();
            Function1 q8 = B.this.q();
            return new P3.b(a8, this.f26482b, this.f26483c, B.this.m(), q8, this.f26484d, this.f26485e);
        }
    }

    /* loaded from: classes4.dex */
    static final class m extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f26486a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f26488c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, S5.d dVar) {
            super(2, dVar);
            this.f26488c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new m(this.f26488c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f26486a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                    ((O5.s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                B.this.t(this.f26488c);
                B b8 = B.this;
                String str = this.f26488c;
                this.f26486a = 1;
                if (b8.w(str, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f26489a;

        /* renamed from: b, reason: collision with root package name */
        Object f26490b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f26491c;

        /* renamed from: e, reason: collision with root package name */
        int f26493e;

        n(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26491c = obj;
            this.f26493e |= Integer.MIN_VALUE;
            return B.this.v(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f26494a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f26496c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, S5.d dVar) {
            super(2, dVar);
            this.f26496c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new o(this.f26496c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f26494a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                B.this.f26431e.i();
                this.f26494a = 1;
                if (X.b(600L, this) == e8) {
                    return e8;
                }
            }
            B.this.t(this.f26496c);
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((o) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class p extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26497a;

        /* renamed from: c, reason: collision with root package name */
        int f26499c;

        p(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26497a = obj;
            this.f26499c |= Integer.MIN_VALUE;
            Object w8 = B.this.w(null, this);
            return w8 == T5.b.e() ? w8 : O5.s.a(w8);
        }
    }

    public B(InterfaceC1324t.a editInteractorFactory, EventReporter eventReporter, M coroutineScope, S5.g workContext, C3.b navigationHandler, K3.c customerRepository, boolean z8, InterfaceC3698L selection, Function1 providePaymentMethodName, Function0 addFirstPaymentMethodScreenFactory, Function0 clearSelection, Function0 isLiveModeProvider, C4028b customerStateHolder, InterfaceC3698L currentScreen, Function0 isCbcEligible, InterfaceC3698L isGooglePayReady, InterfaceC3698L isLinkEnabled, boolean z9) {
        AbstractC3255y.i(editInteractorFactory, "editInteractorFactory");
        AbstractC3255y.i(eventReporter, "eventReporter");
        AbstractC3255y.i(coroutineScope, "coroutineScope");
        AbstractC3255y.i(workContext, "workContext");
        AbstractC3255y.i(navigationHandler, "navigationHandler");
        AbstractC3255y.i(customerRepository, "customerRepository");
        AbstractC3255y.i(selection, "selection");
        AbstractC3255y.i(providePaymentMethodName, "providePaymentMethodName");
        AbstractC3255y.i(addFirstPaymentMethodScreenFactory, "addFirstPaymentMethodScreenFactory");
        AbstractC3255y.i(clearSelection, "clearSelection");
        AbstractC3255y.i(isLiveModeProvider, "isLiveModeProvider");
        AbstractC3255y.i(customerStateHolder, "customerStateHolder");
        AbstractC3255y.i(currentScreen, "currentScreen");
        AbstractC3255y.i(isCbcEligible, "isCbcEligible");
        AbstractC3255y.i(isGooglePayReady, "isGooglePayReady");
        AbstractC3255y.i(isLinkEnabled, "isLinkEnabled");
        this.f26427a = editInteractorFactory;
        this.f26428b = eventReporter;
        this.f26429c = coroutineScope;
        this.f26430d = workContext;
        this.f26431e = navigationHandler;
        this.f26432f = customerRepository;
        this.f26433g = z8;
        this.f26434h = selection;
        this.f26435i = providePaymentMethodName;
        this.f26436j = addFirstPaymentMethodScreenFactory;
        this.f26437k = clearSelection;
        this.f26438l = isLiveModeProvider;
        this.f26439m = customerStateHolder;
        this.f26440n = currentScreen;
        InterfaceC3698L m8 = y4.g.m(customerStateHolder.a(), new g());
        this.f26441o = m8;
        this.f26442p = O5.l.b(new l(isGooglePayReady, isLinkEnabled, z9, isCbcEligible));
        InterfaceC3698L c8 = p().c();
        this.f26443q = c8;
        this.f26444r = y4.g.d(m8, c8, f.f26465a);
        o6.w a8 = AbstractC3700N.a(Boolean.FALSE);
        this.f26445s = a8;
        this.f26446t = a8;
        AbstractC3364k.d(coroutineScope, null, null, new a(null), 3, null);
        AbstractC3364k.d(coroutineScope, null, null, new b(null), 3, null);
        AbstractC3364k.d(coroutineScope, null, null, new c(null), 3, null);
        AbstractC3364k.d(coroutineScope, null, null, new d(null), 3, null);
    }

    private final P3.b p() {
        return (P3.b) this.f26442p.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(com.stripe.android.model.o r18, e3.EnumC2791e r19, S5.d r20) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.B.r(com.stripe.android.model.o, e3.e, S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(String str) {
        String str2;
        f.C0009f c0009f;
        com.stripe.android.model.o r8;
        L3.a aVar = (L3.a) this.f26439m.a().getValue();
        if (aVar == null) {
            return;
        }
        C4028b c4028b = this.f26439m;
        List h8 = aVar.h();
        ArrayList arrayList = new ArrayList();
        for (Object obj : h8) {
            if (!AbstractC3255y.d(((com.stripe.android.model.o) obj).f25463a, str)) {
                arrayList.add(obj);
            }
        }
        c4028b.d(L3.a.b(aVar, null, null, arrayList, null, 11, null));
        com.stripe.android.model.o oVar = (com.stripe.android.model.o) this.f26439m.b().getValue();
        String str3 = null;
        if (oVar != null) {
            str2 = oVar.f25463a;
        } else {
            str2 = null;
        }
        if (AbstractC3255y.d(str2, str)) {
            this.f26439m.e(null);
        }
        Object value = this.f26434h.getValue();
        if (value instanceof f.C0009f) {
            c0009f = (f.C0009f) value;
        } else {
            c0009f = null;
        }
        if (c0009f != null && (r8 = c0009f.r()) != null) {
            str3 = r8.f25463a;
        }
        if (AbstractC3255y.d(str3, str)) {
            this.f26437k.invoke();
        }
        if (((List) this.f26439m.c().getValue()).isEmpty() && (this.f26431e.f().getValue() instanceof c.j)) {
            this.f26431e.l(AbstractC1378t.e(this.f26436j.invoke()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(com.stripe.android.model.o r9, S5.d r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.stripe.android.paymentsheet.B.n
            if (r0 == 0) goto L13
            r0 = r10
            com.stripe.android.paymentsheet.B$n r0 = (com.stripe.android.paymentsheet.B.n) r0
            int r1 = r0.f26493e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26493e = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.B$n r0 = new com.stripe.android.paymentsheet.B$n
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f26491c
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f26493e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r9 = r0.f26490b
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r0.f26489a
            com.stripe.android.paymentsheet.B r0 = (com.stripe.android.paymentsheet.B) r0
            O5.t.b(r10)
            O5.s r10 = (O5.s) r10
            java.lang.Object r10 = r10.j()
            goto L55
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3f:
            O5.t.b(r10)
            java.lang.String r9 = r9.f25463a
            kotlin.jvm.internal.AbstractC3255y.f(r9)
            r0.f26489a = r8
            r0.f26490b = r9
            r0.f26493e = r3
            java.lang.Object r10 = r8.w(r9, r0)
            if (r10 != r1) goto L54
            return r1
        L54:
            r0 = r8
        L55:
            boolean r1 = O5.s.h(r10)
            if (r1 == 0) goto L6b
            l6.M r2 = r0.f26429c
            S5.g r3 = r0.f26430d
            com.stripe.android.paymentsheet.B$o r5 = new com.stripe.android.paymentsheet.B$o
            r1 = 0
            r5.<init>(r9, r1)
            r6 = 2
            r7 = 0
            r4 = 0
            l6.AbstractC3360i.d(r2, r3, r4, r5, r6, r7)
        L6b:
            java.lang.Throwable r9 = O5.s.e(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.B.v(com.stripe.android.model.o, S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(java.lang.String r8, S5.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.stripe.android.paymentsheet.B.p
            if (r0 == 0) goto L13
            r0 = r9
            com.stripe.android.paymentsheet.B$p r0 = (com.stripe.android.paymentsheet.B.p) r0
            int r1 = r0.f26499c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26499c = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.B$p r0 = new com.stripe.android.paymentsheet.B$p
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f26497a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f26499c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            O5.t.b(r9)
            O5.s r9 = (O5.s) r9
            java.lang.Object r8 = r9.j()
            goto L9e
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            O5.t.b(r9)
            t3.b r9 = r7.f26439m
            o6.L r9 = r9.a()
            java.lang.Object r9 = r9.getValue()
            L3.a r9 = (L3.a) r9
            if (r9 != 0) goto L5a
            O5.s$a r8 = O5.s.f8302b
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Could not remove payment method because CustomerConfiguration was not found! Make sure it is provided as part of PaymentSheet.Configuration"
            r8.<init>(r9)
            java.lang.Object r8 = O5.t.a(r8)
            java.lang.Object r8 = O5.s.b(r8)
            return r8
        L5a:
            o6.L r2 = r7.f26434h
            java.lang.Object r2 = r2.getValue()
            boolean r4 = r2 instanceof B3.f.C0009f
            r5 = 0
            if (r4 == 0) goto L68
            B3.f$f r2 = (B3.f.C0009f) r2
            goto L69
        L68:
            r2 = r5
        L69:
            if (r2 == 0) goto L73
            com.stripe.android.model.o r2 = r2.r()
            if (r2 == 0) goto L73
            java.lang.String r5 = r2.f25463a
        L73:
            boolean r2 = kotlin.jvm.internal.AbstractC3255y.d(r5, r8)
            if (r2 == 0) goto L7e
            kotlin.jvm.functions.Function0 r2 = r7.f26437k
            r2.invoke()
        L7e:
            K3.c r2 = r7.f26432f
            K3.c$a r4 = new K3.c$a
            java.lang.String r5 = r9.getId()
            java.lang.String r6 = r9.g()
            r4.<init>(r5, r6)
            L3.a$c r9 = r9.i()
            boolean r9 = r9.a()
            r0.f26499c = r3
            java.lang.Object r8 = r2.c(r4, r8, r9, r0)
            if (r8 != r1) goto L9e
            return r1
        L9e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.B.w(java.lang.String, S5.d):java.lang.Object");
    }

    public final InterfaceC3698L l() {
        return this.f26444r;
    }

    public final InterfaceC3698L m() {
        return this.f26441o;
    }

    public final InterfaceC3698L n() {
        return this.f26446t;
    }

    public final InterfaceC3698L o() {
        return this.f26443q;
    }

    public final Function1 q() {
        return this.f26435i;
    }

    public final void s(com.stripe.android.model.o paymentMethod) {
        String str;
        AbstractC3255y.i(paymentMethod, "paymentMethod");
        C3.b bVar = this.f26431e;
        InterfaceC1324t.a aVar = this.f26427a;
        Function1 function1 = this.f26435i;
        o.p pVar = paymentMethod.f25467e;
        if (pVar != null) {
            str = pVar.f25605a;
        } else {
            str = null;
        }
        bVar.m(new c.f(aVar.a(paymentMethod, new i(), new j(null), new k(null), (B2.b) function1.invoke(str), ((Boolean) this.f26441o.getValue()).booleanValue(), ((Boolean) this.f26438l.invoke()).booleanValue())));
    }

    public final void u(com.stripe.android.model.o paymentMethod) {
        AbstractC3255y.i(paymentMethod, "paymentMethod");
        String str = paymentMethod.f25463a;
        if (str != null) {
            AbstractC3364k.d(this.f26429c, this.f26430d, null, new m(str, null), 2, null);
        }
    }

    public final void x() {
        o6.w wVar = this.f26445s;
        do {
        } while (!wVar.c(wVar.getValue(), Boolean.valueOf(!((Boolean) r1).booleanValue())));
    }
}
