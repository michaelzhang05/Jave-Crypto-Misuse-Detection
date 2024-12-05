package L3;

import L3.i;
import L5.C1224h;
import L5.I;
import M5.AbstractC1246t;
import com.stripe.android.paymentsheet.B;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import i6.N;
import i6.U0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;
import q3.C3649b;
import q3.C3654g;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public final class b implements i {

    /* renamed from: q, reason: collision with root package name */
    public static final c f6120q = new c(null);

    /* renamed from: r, reason: collision with root package name */
    public static final int f6121r = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3349K f6122a;

    /* renamed from: b, reason: collision with root package name */
    private final Y2.d f6123b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3349K f6124c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3349K f6125d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3349K f6126e;

    /* renamed from: f, reason: collision with root package name */
    private final Function0 f6127f;

    /* renamed from: g, reason: collision with root package name */
    private final Function1 f6128g;

    /* renamed from: h, reason: collision with root package name */
    private final Function1 f6129h;

    /* renamed from: i, reason: collision with root package name */
    private final Function1 f6130i;

    /* renamed from: j, reason: collision with root package name */
    private final Function1 f6131j;

    /* renamed from: k, reason: collision with root package name */
    private final Function1 f6132k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f6133l;

    /* renamed from: m, reason: collision with root package name */
    private final M f6134m;

    /* renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f6135n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC3349K f6136o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC3349K f6137p;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f6138a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: L3.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0122a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f6140a;

            C0122a(b bVar) {
                this.f6140a = bVar;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(i.a aVar, P5.d dVar) {
                if (!aVar.e() && !aVar.a() && aVar.d().size() == 1) {
                    this.f6140a.h((C3654g) AbstractC1246t.m0(aVar.d()));
                }
                return I.f6487a;
            }
        }

        a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f6138a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K state = b.this.getState();
                C0122a c0122a = new C0122a(b.this);
                this.f6138a = 1;
                if (state.collect(c0122a, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* renamed from: L3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0123b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f6141a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: L3.b$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f6143a;

            a(b bVar) {
                this.f6143a = bVar;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(List list, P5.d dVar) {
                if (list.isEmpty()) {
                    this.f6143a.i(false);
                }
                return I.f6487a;
            }
        }

        C0123b(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C0123b(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((C0123b) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f6141a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K interfaceC3349K = b.this.f6122a;
                a aVar = new a(b.this);
                this.f6141a = 1;
                if (interfaceC3349K.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {

        /* loaded from: classes4.dex */
        /* synthetic */ class a extends C3156v implements Function0 {
            a(Object obj) {
                super(0, obj, B.class, "toggleEditing", "toggleEditing()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m42invoke();
                return I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m42invoke() {
                ((B) this.receiver).x();
            }
        }

        /* renamed from: L3.b$c$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0124b extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M3.a f6144a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0124b(M3.a aVar) {
                super(1);
                this.f6144a = aVar;
            }

            public final void a(C3654g it) {
                AbstractC3159y.i(it, "it");
                AbstractC3991f.C0916f c0916f = new AbstractC3991f.C0916f(it.d(), null, null, 6, null);
                this.f6144a.E(c0916f);
                this.f6144a.n().k(c0916f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C3654g) obj);
                return I.f6487a;
            }
        }

        /* renamed from: L3.b$c$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0125c extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ B f6145a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0125c(B b8) {
                super(1);
                this.f6145a = b8;
            }

            public final void a(C3654g it) {
                AbstractC3159y.i(it, "it");
                this.f6145a.u(it.d());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C3654g) obj);
                return I.f6487a;
            }
        }

        /* loaded from: classes4.dex */
        static final class d extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ B f6146a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(B b8) {
                super(1);
                this.f6146a = b8;
            }

            public final void a(C3654g it) {
                AbstractC3159y.i(it, "it");
                this.f6146a.s(it.d());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C3654g) obj);
                return I.f6487a;
            }
        }

        /* loaded from: classes4.dex */
        static final class e extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M3.a f6147a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(M3.a aVar) {
                super(1);
                this.f6147a = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return I.f6487a;
            }

            public final void invoke(boolean z8) {
                if (z8) {
                    this.f6147a.r().k();
                } else {
                    this.f6147a.r().i();
                }
            }
        }

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C3654g c(AbstractC3991f abstractC3991f, List list) {
            boolean z8;
            boolean d8;
            boolean d9;
            boolean z9 = true;
            if (abstractC3991f == null) {
                z8 = true;
            } else {
                z8 = abstractC3991f instanceof AbstractC3991f.b;
            }
            if (z8) {
                d8 = true;
            } else {
                d8 = AbstractC3159y.d(abstractC3991f, AbstractC3991f.c.f39776a);
            }
            if (d8) {
                d9 = true;
            } else {
                d9 = AbstractC3159y.d(abstractC3991f, AbstractC3991f.d.f39777a);
            }
            if (!d9) {
                z9 = abstractC3991f instanceof AbstractC3991f.e;
            }
            Object obj = null;
            if (z9) {
                return null;
            }
            if (abstractC3991f instanceof AbstractC3991f.C0916f) {
                String str = ((AbstractC3991f.C0916f) abstractC3991f).v().f24408a;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (AbstractC3159y.d(((C3654g) next).d().f24408a, str)) {
                        obj = next;
                        break;
                    }
                }
                return (C3654g) obj;
            }
            throw new L5.p();
        }

        public final i b(M3.a viewModel, Y2.d paymentMethodMetadata, C3649b customerStateHolder, B savedPaymentMethodMutator) {
            AbstractC3159y.i(viewModel, "viewModel");
            AbstractC3159y.i(paymentMethodMetadata, "paymentMethodMetadata");
            AbstractC3159y.i(customerStateHolder, "customerStateHolder");
            AbstractC3159y.i(savedPaymentMethodMutator, "savedPaymentMethodMutator");
            InterfaceC3349K c8 = customerStateHolder.c();
            InterfaceC3349K y8 = viewModel.y();
            InterfaceC3349K n8 = savedPaymentMethodMutator.n();
            InterfaceC3349K l8 = savedPaymentMethodMutator.l();
            return new b(c8, paymentMethodMetadata, y8, n8, savedPaymentMethodMutator.m(), l8, new a(savedPaymentMethodMutator), savedPaymentMethodMutator.q(), new C0124b(viewModel), new C0125c(savedPaymentMethodMutator), new d(savedPaymentMethodMutator), new e(viewModel), paymentMethodMetadata.V().a(), null, 8192, null);
        }

        public /* synthetic */ c(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements Function1 {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(List paymentMethods) {
            AbstractC3159y.i(paymentMethods, "paymentMethods");
            List list = paymentMethods;
            b bVar = b.this;
            ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(q.a((com.stripe.android.model.o) it.next(), bVar.f6128g, bVar.f6123b));
            }
            return arrayList;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements X5.q {

        /* renamed from: a, reason: collision with root package name */
        public static final e f6149a = new e();

        e() {
            super(5);
        }

        public final i.a a(List displayablePaymentMethods, AbstractC3991f abstractC3991f, boolean z8, boolean z9, boolean z10) {
            C3654g c8;
            AbstractC3159y.i(displayablePaymentMethods, "displayablePaymentMethods");
            if (!z8) {
                c8 = b.f6120q.c(abstractC3991f, displayablePaymentMethods);
            } else {
                c8 = null;
            }
            return new i.a(displayablePaymentMethods, c8, z8, z9, z10);
        }

        @Override // X5.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return a((List) obj, (AbstractC3991f) obj2, ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue(), ((Boolean) obj5).booleanValue());
        }
    }

    public b(InterfaceC3349K paymentMethods, Y2.d paymentMethodMetadata, InterfaceC3349K selection, InterfaceC3349K editing, InterfaceC3349K canRemove, InterfaceC3349K canEdit, Function0 toggleEdit, Function1 providePaymentMethodName, Function1 onSelectPaymentMethod, Function1 onDeletePaymentMethod, Function1 onEditPaymentMethod, Function1 navigateBack, boolean z8, P5.g dispatcher) {
        AbstractC3159y.i(paymentMethods, "paymentMethods");
        AbstractC3159y.i(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC3159y.i(selection, "selection");
        AbstractC3159y.i(editing, "editing");
        AbstractC3159y.i(canRemove, "canRemove");
        AbstractC3159y.i(canEdit, "canEdit");
        AbstractC3159y.i(toggleEdit, "toggleEdit");
        AbstractC3159y.i(providePaymentMethodName, "providePaymentMethodName");
        AbstractC3159y.i(onSelectPaymentMethod, "onSelectPaymentMethod");
        AbstractC3159y.i(onDeletePaymentMethod, "onDeletePaymentMethod");
        AbstractC3159y.i(onEditPaymentMethod, "onEditPaymentMethod");
        AbstractC3159y.i(navigateBack, "navigateBack");
        AbstractC3159y.i(dispatcher, "dispatcher");
        this.f6122a = paymentMethods;
        this.f6123b = paymentMethodMetadata;
        this.f6124c = selection;
        this.f6125d = editing;
        this.f6126e = canEdit;
        this.f6127f = toggleEdit;
        this.f6128g = providePaymentMethodName;
        this.f6129h = onSelectPaymentMethod;
        this.f6130i = onDeletePaymentMethod;
        this.f6131j = onEditPaymentMethod;
        this.f6132k = navigateBack;
        this.f6133l = z8;
        M a8 = N.a(dispatcher.plus(U0.b(null, 1, null)));
        this.f6134m = a8;
        this.f6135n = new AtomicBoolean(false);
        InterfaceC3349K m8 = v4.g.m(paymentMethods, new d());
        this.f6136o = m8;
        this.f6137p = v4.g.g(m8, selection, editing, canRemove, canEdit, e.f6149a);
        AbstractC2829k.d(a8, null, null, new a(null), 3, null);
        AbstractC2829k.d(a8, null, null, new C0123b(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(C3654g c3654g) {
        this.f6129h.invoke(c3654g);
        i(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(boolean z8) {
        if (!this.f6135n.getAndSet(true)) {
            this.f6132k.invoke(Boolean.valueOf(z8));
        }
    }

    @Override // L3.i
    public boolean a() {
        return this.f6133l;
    }

    @Override // L3.i
    public void b(i.b viewAction) {
        AbstractC3159y.i(viewAction, "viewAction");
        if (viewAction instanceof i.b.c) {
            h(((i.b.c) viewAction).a());
            return;
        }
        if (viewAction instanceof i.b.a) {
            this.f6130i.invoke(((i.b.a) viewAction).a());
        } else if (viewAction instanceof i.b.C0133b) {
            this.f6131j.invoke(((i.b.C0133b) viewAction).a());
        } else if (AbstractC3159y.d(viewAction, i.b.d.f6265a)) {
            this.f6127f.invoke();
        }
    }

    @Override // L3.i
    public void close() {
        N.d(this.f6134m, null, 1, null);
    }

    @Override // L3.i
    public InterfaceC3349K getState() {
        return this.f6137p;
    }

    public /* synthetic */ b(InterfaceC3349K interfaceC3349K, Y2.d dVar, InterfaceC3349K interfaceC3349K2, InterfaceC3349K interfaceC3349K3, InterfaceC3349K interfaceC3349K4, InterfaceC3349K interfaceC3349K5, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, boolean z8, P5.g gVar, int i8, AbstractC3151p abstractC3151p) {
        this(interfaceC3349K, dVar, interfaceC3349K2, interfaceC3349K3, interfaceC3349K4, interfaceC3349K5, function0, function1, function12, function13, function14, function15, z8, (i8 & 8192) != 0 ? C2812b0.a() : gVar);
    }
}
