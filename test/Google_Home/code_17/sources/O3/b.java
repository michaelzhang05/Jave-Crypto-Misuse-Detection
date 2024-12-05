package O3;

import B3.f;
import O3.i;
import O5.C1352h;
import O5.I;
import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import a6.InterfaceC1671q;
import b3.C1970d;
import com.stripe.android.paymentsheet.B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import l6.N;
import l6.U0;
import o6.InterfaceC3698L;
import o6.InterfaceC3707g;
import t3.C4028b;
import t3.C4033g;

/* loaded from: classes4.dex */
public final class b implements i {

    /* renamed from: q, reason: collision with root package name */
    public static final c f7911q = new c(null);

    /* renamed from: r, reason: collision with root package name */
    public static final int f7912r = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3698L f7913a;

    /* renamed from: b, reason: collision with root package name */
    private final C1970d f7914b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3698L f7915c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3698L f7916d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3698L f7917e;

    /* renamed from: f, reason: collision with root package name */
    private final Function0 f7918f;

    /* renamed from: g, reason: collision with root package name */
    private final Function1 f7919g;

    /* renamed from: h, reason: collision with root package name */
    private final Function1 f7920h;

    /* renamed from: i, reason: collision with root package name */
    private final Function1 f7921i;

    /* renamed from: j, reason: collision with root package name */
    private final Function1 f7922j;

    /* renamed from: k, reason: collision with root package name */
    private final Function1 f7923k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f7924l;

    /* renamed from: m, reason: collision with root package name */
    private final M f7925m;

    /* renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f7926n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC3698L f7927o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC3698L f7928p;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f7929a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0150a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f7931a;

            C0150a(b bVar) {
                this.f7931a = bVar;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(i.a aVar, S5.d dVar) {
                if (!aVar.e() && !aVar.a() && aVar.d().size() == 1) {
                    this.f7931a.h((C4033g) AbstractC1378t.m0(aVar.d()));
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
            int i8 = this.f7929a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L state = b.this.getState();
                C0150a c0150a = new C0150a(b.this);
                this.f7929a = 1;
                if (state.collect(c0150a, this) == e8) {
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

    /* renamed from: O3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0151b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f7932a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.b$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f7934a;

            a(b bVar) {
                this.f7934a = bVar;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(List list, S5.d dVar) {
                if (list.isEmpty()) {
                    this.f7934a.i(false);
                }
                return I.f8278a;
            }
        }

        C0151b(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C0151b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f7932a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L interfaceC3698L = b.this.f7913a;
                a aVar = new a(b.this);
                this.f7932a = 1;
                if (interfaceC3698L.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((C0151b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {

        /* loaded from: classes4.dex */
        /* synthetic */ class a extends C3252v implements Function0 {
            a(Object obj) {
                super(0, obj, B.class, "toggleEditing", "toggleEditing()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m47invoke();
                return I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m47invoke() {
                ((B) this.receiver).x();
            }
        }

        /* renamed from: O3.b$c$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0152b extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P3.a f7935a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0152b(P3.a aVar) {
                super(1);
                this.f7935a = aVar;
            }

            public final void a(C4033g it) {
                AbstractC3255y.i(it, "it");
                f.C0009f c0009f = new f.C0009f(it.d(), null, null, 6, null);
                this.f7935a.E(c0009f);
                this.f7935a.n().i(c0009f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C4033g) obj);
                return I.f8278a;
            }
        }

        /* renamed from: O3.b$c$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0153c extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ B f7936a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0153c(B b8) {
                super(1);
                this.f7936a = b8;
            }

            public final void a(C4033g it) {
                AbstractC3255y.i(it, "it");
                this.f7936a.u(it.d());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C4033g) obj);
                return I.f8278a;
            }
        }

        /* loaded from: classes4.dex */
        static final class d extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ B f7937a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(B b8) {
                super(1);
                this.f7937a = b8;
            }

            public final void a(C4033g it) {
                AbstractC3255y.i(it, "it");
                this.f7937a.s(it.d());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C4033g) obj);
                return I.f8278a;
            }
        }

        /* loaded from: classes4.dex */
        static final class e extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P3.a f7938a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(P3.a aVar) {
                super(1);
                this.f7938a = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return I.f8278a;
            }

            public final void invoke(boolean z8) {
                if (z8) {
                    this.f7938a.r().k();
                } else {
                    this.f7938a.r().i();
                }
            }
        }

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C4033g c(B3.f fVar, List list) {
            boolean z8;
            boolean d8;
            boolean d9;
            boolean z9 = true;
            if (fVar == null) {
                z8 = true;
            } else {
                z8 = fVar instanceof f.b;
            }
            if (z8) {
                d8 = true;
            } else {
                d8 = AbstractC3255y.d(fVar, f.c.f820a);
            }
            if (d8) {
                d9 = true;
            } else {
                d9 = AbstractC3255y.d(fVar, f.d.f821a);
            }
            if (!d9) {
                z9 = fVar instanceof f.e;
            }
            Object obj = null;
            if (z9) {
                return null;
            }
            if (fVar instanceof f.C0009f) {
                String str = ((f.C0009f) fVar).r().f25463a;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (AbstractC3255y.d(((C4033g) next).d().f25463a, str)) {
                        obj = next;
                        break;
                    }
                }
                return (C4033g) obj;
            }
            throw new O5.p();
        }

        public final i b(P3.a viewModel, C1970d paymentMethodMetadata, C4028b customerStateHolder, B savedPaymentMethodMutator) {
            AbstractC3255y.i(viewModel, "viewModel");
            AbstractC3255y.i(paymentMethodMetadata, "paymentMethodMetadata");
            AbstractC3255y.i(customerStateHolder, "customerStateHolder");
            AbstractC3255y.i(savedPaymentMethodMutator, "savedPaymentMethodMutator");
            InterfaceC3698L c8 = customerStateHolder.c();
            InterfaceC3698L y8 = viewModel.y();
            InterfaceC3698L n8 = savedPaymentMethodMutator.n();
            InterfaceC3698L l8 = savedPaymentMethodMutator.l();
            return new b(c8, paymentMethodMetadata, y8, n8, savedPaymentMethodMutator.m(), l8, new a(savedPaymentMethodMutator), savedPaymentMethodMutator.q(), new C0152b(viewModel), new C0153c(savedPaymentMethodMutator), new d(savedPaymentMethodMutator), new e(viewModel), paymentMethodMetadata.W().c(), null, 8192, null);
        }

        public /* synthetic */ c(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3256z implements Function1 {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(List paymentMethods) {
            AbstractC3255y.i(paymentMethods, "paymentMethods");
            List list = paymentMethods;
            b bVar = b.this;
            ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(q.a((com.stripe.android.model.o) it.next(), bVar.f7919g, bVar.f7914b));
            }
            return arrayList;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3256z implements InterfaceC1671q {

        /* renamed from: a, reason: collision with root package name */
        public static final e f7940a = new e();

        e() {
            super(5);
        }

        public final i.a a(List displayablePaymentMethods, B3.f fVar, boolean z8, boolean z9, boolean z10) {
            C4033g c8;
            AbstractC3255y.i(displayablePaymentMethods, "displayablePaymentMethods");
            if (!z8) {
                c8 = b.f7911q.c(fVar, displayablePaymentMethods);
            } else {
                c8 = null;
            }
            return new i.a(displayablePaymentMethods, c8, z8, z9, z10);
        }

        @Override // a6.InterfaceC1671q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return a((List) obj, (B3.f) obj2, ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue(), ((Boolean) obj5).booleanValue());
        }
    }

    public b(InterfaceC3698L paymentMethods, C1970d paymentMethodMetadata, InterfaceC3698L selection, InterfaceC3698L editing, InterfaceC3698L canRemove, InterfaceC3698L canEdit, Function0 toggleEdit, Function1 providePaymentMethodName, Function1 onSelectPaymentMethod, Function1 onDeletePaymentMethod, Function1 onEditPaymentMethod, Function1 navigateBack, boolean z8, S5.g dispatcher) {
        AbstractC3255y.i(paymentMethods, "paymentMethods");
        AbstractC3255y.i(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC3255y.i(selection, "selection");
        AbstractC3255y.i(editing, "editing");
        AbstractC3255y.i(canRemove, "canRemove");
        AbstractC3255y.i(canEdit, "canEdit");
        AbstractC3255y.i(toggleEdit, "toggleEdit");
        AbstractC3255y.i(providePaymentMethodName, "providePaymentMethodName");
        AbstractC3255y.i(onSelectPaymentMethod, "onSelectPaymentMethod");
        AbstractC3255y.i(onDeletePaymentMethod, "onDeletePaymentMethod");
        AbstractC3255y.i(onEditPaymentMethod, "onEditPaymentMethod");
        AbstractC3255y.i(navigateBack, "navigateBack");
        AbstractC3255y.i(dispatcher, "dispatcher");
        this.f7913a = paymentMethods;
        this.f7914b = paymentMethodMetadata;
        this.f7915c = selection;
        this.f7916d = editing;
        this.f7917e = canEdit;
        this.f7918f = toggleEdit;
        this.f7919g = providePaymentMethodName;
        this.f7920h = onSelectPaymentMethod;
        this.f7921i = onDeletePaymentMethod;
        this.f7922j = onEditPaymentMethod;
        this.f7923k = navigateBack;
        this.f7924l = z8;
        M a8 = N.a(dispatcher.plus(U0.b(null, 1, null)));
        this.f7925m = a8;
        this.f7926n = new AtomicBoolean(false);
        InterfaceC3698L m8 = y4.g.m(paymentMethods, new d());
        this.f7927o = m8;
        this.f7928p = y4.g.g(m8, selection, editing, canRemove, canEdit, e.f7940a);
        AbstractC3364k.d(a8, null, null, new a(null), 3, null);
        AbstractC3364k.d(a8, null, null, new C0151b(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(C4033g c4033g) {
        this.f7920h.invoke(c4033g);
        i(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(boolean z8) {
        if (!this.f7926n.getAndSet(true)) {
            this.f7923k.invoke(Boolean.valueOf(z8));
        }
    }

    @Override // O3.i
    public void a(i.b viewAction) {
        AbstractC3255y.i(viewAction, "viewAction");
        if (viewAction instanceof i.b.c) {
            h(((i.b.c) viewAction).a());
            return;
        }
        if (viewAction instanceof i.b.a) {
            this.f7921i.invoke(((i.b.a) viewAction).a());
        } else if (viewAction instanceof i.b.C0161b) {
            this.f7922j.invoke(((i.b.C0161b) viewAction).a());
        } else if (AbstractC3255y.d(viewAction, i.b.d.f8056a)) {
            this.f7918f.invoke();
        }
    }

    @Override // O3.i
    public boolean c() {
        return this.f7924l;
    }

    @Override // O3.i
    public void close() {
        N.d(this.f7925m, null, 1, null);
    }

    @Override // O3.i
    public InterfaceC3698L getState() {
        return this.f7928p;
    }

    public /* synthetic */ b(InterfaceC3698L interfaceC3698L, C1970d c1970d, InterfaceC3698L interfaceC3698L2, InterfaceC3698L interfaceC3698L3, InterfaceC3698L interfaceC3698L4, InterfaceC3698L interfaceC3698L5, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, boolean z8, S5.g gVar, int i8, AbstractC3247p abstractC3247p) {
        this(interfaceC3698L, c1970d, interfaceC3698L2, interfaceC3698L3, interfaceC3698L4, interfaceC3698L5, function0, function1, function12, function13, function14, function15, z8, (i8 & 8192) != 0 ? C3347b0.a() : gVar);
    }
}
