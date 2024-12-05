package z3;

import O5.I;
import O5.t;
import P5.AbstractC1371l;
import P5.AbstractC1378t;
import P5.a0;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.paymentsheet.u;
import h4.C2907A;
import h6.InterfaceC2963c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3364k;
import l6.M;
import o6.AbstractC3700N;
import o6.AbstractC3708h;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;
import o6.w;
import p4.D;
import p4.G;
import p4.h0;
import p6.k;

/* loaded from: classes4.dex */
public final class d extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final List f41133a;

    /* renamed from: b, reason: collision with root package name */
    private final D3.a f41134b;

    /* renamed from: c, reason: collision with root package name */
    private final C2907A f41135c;

    /* renamed from: d, reason: collision with root package name */
    private w f41136d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3698L f41137e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3706f f41138f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3706f f41139g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3698L f41140h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC3698L f41141i;

    /* loaded from: classes4.dex */
    static final class a extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f41142a;

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
            int i8 = this.f41142a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                z3.f fVar = z3.f.f41170a;
                List d8 = d.this.d();
                this.f41142a = 1;
                if (fVar.b(d8, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final List f41144a;

        /* renamed from: b, reason: collision with root package name */
        private final D3.a f41145b;

        public b(List formElements, D3.a formArguments) {
            AbstractC3255y.i(formElements, "formElements");
            AbstractC3255y.i(formArguments, "formArguments");
            this.f41144a = formElements;
            this.f41145b = formArguments;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2963c interfaceC2963c, CreationExtras creationExtras) {
            return n.a(this, interfaceC2963c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return n.c(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass) {
            AbstractC3255y.i(modelClass, "modelClass");
            return new d(this.f41144a, this.f41145b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC3706f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f[] f41146a;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3706f[] f41147a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC3706f[] interfaceC3706fArr) {
                super(0);
                this.f41147a = interfaceC3706fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new List[this.f41147a.length];
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends l implements InterfaceC1669o {

            /* renamed from: a, reason: collision with root package name */
            int f41148a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f41149b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f41150c;

            public b(S5.d dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f41148a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    InterfaceC3707g interfaceC3707g = (InterfaceC3707g) this.f41149b;
                    List z8 = AbstractC1378t.z(AbstractC1371l.V0((List[]) ((Object[]) this.f41150c)));
                    this.f41148a = 1;
                    if (interfaceC3707g.emit(z8, this) == e8) {
                        return e8;
                    }
                }
                return I.f8278a;
            }

            @Override // a6.InterfaceC1669o
            public final Object invoke(InterfaceC3707g interfaceC3707g, Object[] objArr, S5.d dVar) {
                b bVar = new b(dVar);
                bVar.f41149b = interfaceC3707g;
                bVar.f41150c = objArr;
                return bVar.invokeSuspend(I.f8278a);
            }
        }

        public c(InterfaceC3706f[] interfaceC3706fArr) {
            this.f41146a = interfaceC3706fArr;
        }

        @Override // o6.InterfaceC3706f
        public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
            InterfaceC3706f[] interfaceC3706fArr = this.f41146a;
            Object a8 = k.a(interfaceC3707g, interfaceC3706fArr, new a(interfaceC3706fArr), new b(null), dVar);
            if (a8 == T5.b.e()) {
                return a8;
            }
            return I.f8278a;
        }
    }

    /* renamed from: z3.d$d, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0939d extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0939d f41151a = new C0939d();

        C0939d() {
            super(2);
        }

        @Override // a6.InterfaceC1668n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set invoke(Set cardBillingIdentifiers, Set externalHiddenIdentifiers) {
            AbstractC3255y.i(cardBillingIdentifiers, "cardBillingIdentifiers");
            AbstractC3255y.i(externalHiddenIdentifiers, "externalHiddenIdentifiers");
            return a0.m(externalHiddenIdentifiers, cardBillingIdentifiers);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f41152a = new e();

        e() {
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
    public static final class f implements InterfaceC3706f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f[] f41153a;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3706f[] f41154a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC3706f[] interfaceC3706fArr) {
                super(0);
                this.f41154a = interfaceC3706fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new List[this.f41154a.length];
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends l implements InterfaceC1669o {

            /* renamed from: a, reason: collision with root package name */
            int f41155a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f41156b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f41157c;

            public b(S5.d dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f41155a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    InterfaceC3707g interfaceC3707g = (InterfaceC3707g) this.f41156b;
                    List z8 = AbstractC1378t.z(AbstractC1378t.W0(AbstractC1371l.V0((Object[]) this.f41157c)));
                    this.f41155a = 1;
                    if (interfaceC3707g.emit(z8, this) == e8) {
                        return e8;
                    }
                }
                return I.f8278a;
            }

            @Override // a6.InterfaceC1669o
            public final Object invoke(InterfaceC3707g interfaceC3707g, Object[] objArr, S5.d dVar) {
                b bVar = new b(dVar);
                bVar.f41156b = interfaceC3707g;
                bVar.f41157c = objArr;
                return bVar.invokeSuspend(I.f8278a);
            }
        }

        public f(InterfaceC3706f[] interfaceC3706fArr) {
            this.f41153a = interfaceC3706fArr;
        }

        @Override // o6.InterfaceC3706f
        public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
            InterfaceC3706f[] interfaceC3706fArr = this.f41153a;
            Object a8 = k.a(interfaceC3707g, interfaceC3706fArr, new a(interfaceC3706fArr), new b(null), dVar);
            if (a8 == T5.b.e()) {
                return a8;
            }
            return I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f41158a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List list) {
            super(0);
            this.f41158a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            List list = this.f41158a;
            ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC3698L) it.next()).getValue());
            }
            return AbstractC1378t.z(AbstractC1378t.W0(arrayList));
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements InterfaceC3706f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f f41159a;

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3707g f41160a;

            /* renamed from: z3.d$h$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0940a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f41161a;

                /* renamed from: b, reason: collision with root package name */
                int f41162b;

                public C0940a(S5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f41161a = obj;
                    this.f41162b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC3707g interfaceC3707g) {
                this.f41160a = interfaceC3707g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // o6.InterfaceC3707g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, S5.d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof z3.d.h.a.C0940a
                    if (r0 == 0) goto L13
                    r0 = r9
                    z3.d$h$a$a r0 = (z3.d.h.a.C0940a) r0
                    int r1 = r0.f41162b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f41162b = r1
                    goto L18
                L13:
                    z3.d$h$a$a r0 = new z3.d$h$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f41161a
                    java.lang.Object r1 = T5.b.e()
                    int r2 = r0.f41162b
                    r3 = 1
                    if (r2 == 0) goto L32
                    if (r2 != r3) goto L2a
                    O5.t.b(r9)
                    goto Ld1
                L2a:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L32:
                    O5.t.b(r9)
                    o6.g r9 = r7.f41160a
                    java.util.List r8 = (java.util.List) r8
                    java.lang.Iterable r8 = (java.lang.Iterable) r8
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.Iterator r8 = r8.iterator()
                L44:
                    boolean r4 = r8.hasNext()
                    if (r4 == 0) goto L65
                    java.lang.Object r4 = r8.next()
                    r5 = r4
                    O5.r r5 = (O5.r) r5
                    java.lang.Object r5 = r5.c()
                    p4.G$b r6 = p4.G.Companion
                    p4.G r6 = r6.x()
                    boolean r5 = kotlin.jvm.internal.AbstractC3255y.d(r5, r6)
                    if (r5 == 0) goto L44
                    r2.add(r4)
                    goto L44
                L65:
                    java.util.ArrayList r8 = new java.util.ArrayList
                    r4 = 10
                    int r5 = P5.AbstractC1378t.x(r2, r4)
                    r8.<init>(r5)
                    java.util.Iterator r2 = r2.iterator()
                L74:
                    boolean r5 = r2.hasNext()
                    if (r5 == 0) goto L96
                    java.lang.Object r5 = r2.next()
                    O5.r r5 = (O5.r) r5
                    java.lang.Object r5 = r5.d()
                    u4.a r5 = (u4.C4061a) r5
                    java.lang.String r5 = r5.c()
                    boolean r5 = java.lang.Boolean.parseBoolean(r5)
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r8.add(r5)
                    goto L74
                L96:
                    java.util.ArrayList r2 = new java.util.ArrayList
                    int r4 = P5.AbstractC1378t.x(r8, r4)
                    r2.<init>(r4)
                    java.util.Iterator r8 = r8.iterator()
                La3:
                    boolean r4 = r8.hasNext()
                    if (r4 == 0) goto Lbe
                    java.lang.Object r4 = r8.next()
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    boolean r4 = r4.booleanValue()
                    if (r4 == 0) goto Lb8
                    B3.f$a r4 = B3.f.a.f808b
                    goto Lba
                Lb8:
                    B3.f$a r4 = B3.f.a.f809c
                Lba:
                    r2.add(r4)
                    goto La3
                Lbe:
                    java.lang.Object r8 = P5.AbstractC1378t.o0(r2)
                    B3.f$a r8 = (B3.f.a) r8
                    if (r8 != 0) goto Lc8
                    B3.f$a r8 = B3.f.a.f810d
                Lc8:
                    r0.f41162b = r3
                    java.lang.Object r8 = r9.emit(r8, r0)
                    if (r8 != r1) goto Ld1
                    return r1
                Ld1:
                    O5.I r8 = O5.I.f8278a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: z3.d.h.a.emit(java.lang.Object, S5.d):java.lang.Object");
            }
        }

        public h(InterfaceC3706f interfaceC3706f) {
            this.f41159a = interfaceC3706f;
        }

        @Override // o6.InterfaceC3706f
        public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
            Object collect = this.f41159a.collect(new a(interfaceC3707g), dVar);
            if (collect == T5.b.e()) {
                return collect;
            }
            return I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class i implements InterfaceC3706f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f f41164a;

        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3707g f41165a;

            /* renamed from: z3.d$i$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0941a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f41166a;

                /* renamed from: b, reason: collision with root package name */
                int f41167b;

                public C0941a(S5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f41166a = obj;
                    this.f41167b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC3707g interfaceC3707g) {
                this.f41165a = interfaceC3707g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // o6.InterfaceC3707g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, S5.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof z3.d.i.a.C0941a
                    if (r0 == 0) goto L13
                    r0 = r6
                    z3.d$i$a$a r0 = (z3.d.i.a.C0941a) r0
                    int r1 = r0.f41167b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f41167b = r1
                    goto L18
                L13:
                    z3.d$i$a$a r0 = new z3.d$i$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f41166a
                    java.lang.Object r1 = T5.b.e()
                    int r2 = r0.f41167b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    O5.t.b(r6)
                    goto L47
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    O5.t.b(r6)
                    o6.g r6 = r4.f41165a
                    java.util.List r5 = (java.util.List) r5
                    java.lang.Iterable r5 = (java.lang.Iterable) r5
                    java.util.Map r5 = P5.Q.w(r5)
                    r0.f41167b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    O5.I r5 = O5.I.f8278a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: z3.d.i.a.emit(java.lang.Object, S5.d):java.lang.Object");
            }
        }

        public i(InterfaceC3706f interfaceC3706f) {
            this.f41164a = interfaceC3706f;
        }

        @Override // o6.InterfaceC3706f
        public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
            Object collect = this.f41164a.collect(new a(interfaceC3707g), dVar);
            if (collect == T5.b.e()) {
                return collect;
            }
            return I.f8278a;
        }
    }

    public d(List elements, D3.a formArguments) {
        InterfaceC3706f fVar;
        InterfaceC3698L w8;
        AbstractC3255y.i(elements, "elements");
        AbstractC3255y.i(formArguments, "formArguments");
        this.f41133a = elements;
        this.f41134b = formArguments;
        ArrayList arrayList = new ArrayList();
        for (Object obj : elements) {
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
        C2907A c2907a = (C2907A) AbstractC1378t.o0(arrayList3);
        this.f41135c = c2907a;
        this.f41136d = AbstractC3700N.a(a0.f());
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), null, null, new a(null), 3, null);
        InterfaceC3698L d8 = y4.g.d((c2907a == null || (w8 = c2907a.w()) == null) ? y4.g.n(a0.f()) : w8, this.f41136d, C0939d.f41151a);
        this.f41137e = d8;
        h hVar = new h(a());
        this.f41138f = hVar;
        this.f41139g = new C4226a(new i(a()), d8, hVar, c()).c();
        List list = this.f41133a;
        ArrayList arrayList4 = new ArrayList(AbstractC1378t.x(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((D) it2.next()).e());
        }
        if (arrayList4.isEmpty()) {
            fVar = y4.g.n(AbstractC1378t.z(AbstractC1378t.W0(AbstractC1378t.m())));
        } else {
            fVar = new f((InterfaceC3706f[]) AbstractC1378t.W0(arrayList4).toArray(new InterfaceC3706f[0]));
        }
        y4.e eVar = new y4.e(fVar, new g(arrayList4));
        this.f41140h = eVar;
        this.f41141i = y4.g.d(this.f41137e, eVar, e.f41152a);
    }

    private final InterfaceC3706f a() {
        if (this.f41133a.isEmpty()) {
            return AbstractC3708h.B(AbstractC1378t.m());
        }
        List list = this.f41133a;
        ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((D) it.next()).d());
        }
        return new c((InterfaceC3706f[]) AbstractC1378t.W0(arrayList).toArray(new InterfaceC3706f[0]));
    }

    public final InterfaceC3706f b() {
        return this.f41139g;
    }

    public final Map c() {
        u.c b8;
        String b9;
        String i8;
        String l8;
        String a8;
        String h8;
        String g8;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (this.f41134b.c().b() && (b8 = this.f41134b.b()) != null) {
            String g9 = b8.g();
            if (g9 != null) {
                linkedHashMap.put(G.Companion.r(), g9);
            }
            String b10 = b8.b();
            if (b10 != null) {
                linkedHashMap.put(G.Companion.n(), b10);
            }
            String h9 = b8.h();
            if (h9 != null) {
                linkedHashMap.put(G.Companion.t(), h9);
            }
            u.a a9 = b8.a();
            if (a9 != null && (g8 = a9.g()) != null) {
                linkedHashMap.put(G.Companion.p(), g8);
            }
            u.a a10 = b8.a();
            if (a10 != null && (h8 = a10.h()) != null) {
                linkedHashMap.put(G.Companion.q(), h8);
            }
            u.a a11 = b8.a();
            if (a11 != null && (a8 = a11.a()) != null) {
                linkedHashMap.put(G.Companion.k(), a8);
            }
            u.a a12 = b8.a();
            if (a12 != null && (l8 = a12.l()) != null) {
                linkedHashMap.put(G.Companion.z(), l8);
            }
            u.a a13 = b8.a();
            if (a13 != null && (i8 = a13.i()) != null) {
                linkedHashMap.put(G.Companion.u(), i8);
            }
            u.a a14 = b8.a();
            if (a14 != null && (b9 = a14.b()) != null) {
                linkedHashMap.put(G.Companion.l(), b9);
            }
        }
        return linkedHashMap;
    }

    public final List d() {
        return this.f41133a;
    }

    public final InterfaceC3698L e() {
        return this.f41137e;
    }

    public final InterfaceC3698L f() {
        return this.f41141i;
    }
}
