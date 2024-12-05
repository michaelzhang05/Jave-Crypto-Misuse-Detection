package o2;

import O5.I;
import O5.t;
import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import e3.C2787a;
import e3.C2789c;
import e3.EnumC2791e;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.InterfaceC3390x0;
import l6.M;
import l6.N;
import o2.f;
import o6.InterfaceC3698L;

/* renamed from: o2.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3516c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3515b f35798a;

    /* renamed from: b, reason: collision with root package name */
    private final S5.g f35799b;

    /* renamed from: c, reason: collision with root package name */
    private final S5.g f35800c;

    /* renamed from: d, reason: collision with root package name */
    private final p f35801d;

    /* renamed from: e, reason: collision with root package name */
    private final a f35802e;

    /* renamed from: f, reason: collision with root package name */
    private final Function0 f35803f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3698L f35804g;

    /* renamed from: h, reason: collision with root package name */
    private C3514a f35805h;

    /* renamed from: i, reason: collision with root package name */
    private List f35806i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC3390x0 f35807j;

    /* renamed from: o2.c$a */
    /* loaded from: classes4.dex */
    public interface a {
        void a(List list);
    }

    /* renamed from: o2.c$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35808a;

        static {
            int[] iArr = new int[EnumC2791e.values().length];
            try {
                iArr[EnumC2791e.f31452w.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2791e.f31450u.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f35808a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o2.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0808c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f35809a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f.b f35810b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3516c f35811c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o2.c$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f35812a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3516c f35813b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f35814c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C3516c c3516c, List list, S5.d dVar) {
                super(2, dVar);
                this.f35813b = c3516c;
                this.f35814c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f35813b, this.f35814c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f35812a == 0) {
                    t.b(obj);
                    C3516c c3516c = this.f35813b;
                    List list = this.f35814c;
                    if (list == null) {
                        list = AbstractC1378t.m();
                    }
                    c3516c.l(list);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0808c(f.b bVar, C3516c c3516c, S5.d dVar) {
            super(2, dVar);
            this.f35810b = bVar;
            this.f35811c = c3516c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C0808c(this.f35810b, this.f35811c, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0054 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = T5.b.e()
                int r1 = r6.f35809a
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1f
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                O5.t.b(r7)
                goto L55
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                O5.t.b(r7)
                goto L3b
            L1f:
                O5.t.b(r7)
                o2.f$b r7 = r6.f35810b
                o2.a r7 = r7.d()
                if (r7 == 0) goto L3e
                o2.c r7 = r6.f35811c
                o2.b r7 = o2.C3516c.a(r7)
                o2.f$b r1 = r6.f35810b
                r6.f35809a = r4
                java.lang.Object r7 = r7.b(r1, r6)
                if (r7 != r0) goto L3b
                return r0
            L3b:
                java.util.List r7 = (java.util.List) r7
                goto L3f
            L3e:
                r7 = r2
            L3f:
                o2.c r1 = r6.f35811c
                S5.g r1 = o2.C3516c.b(r1)
                o2.c$c$a r4 = new o2.c$c$a
                o2.c r5 = r6.f35811c
                r4.<init>(r5, r7, r2)
                r6.f35809a = r3
                java.lang.Object r7 = l6.AbstractC3360i.g(r1, r4, r6)
                if (r7 != r0) goto L55
                return r0
            L55:
                O5.I r7 = O5.I.f8278a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o2.C3516c.C0808c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((C0808c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public C3516c(InterfaceC3515b cardAccountRangeRepository, S5.g uiContext, S5.g workContext, p staticCardAccountRanges, a accountRangeResultListener, Function0 isCbcEligible) {
        AbstractC3255y.i(cardAccountRangeRepository, "cardAccountRangeRepository");
        AbstractC3255y.i(uiContext, "uiContext");
        AbstractC3255y.i(workContext, "workContext");
        AbstractC3255y.i(staticCardAccountRanges, "staticCardAccountRanges");
        AbstractC3255y.i(accountRangeResultListener, "accountRangeResultListener");
        AbstractC3255y.i(isCbcEligible, "isCbcEligible");
        this.f35798a = cardAccountRangeRepository;
        this.f35799b = uiContext;
        this.f35800c = workContext;
        this.f35801d = staticCardAccountRanges;
        this.f35802e = accountRangeResultListener;
        this.f35803f = isCbcEligible;
        this.f35804g = cardAccountRangeRepository.a();
        this.f35806i = AbstractC1378t.m();
    }

    private final boolean j(f.b bVar) {
        boolean z8;
        C2787a d8;
        C2789c a8;
        if (d() != null && bVar.d() != null && (((d8 = d()) == null || (a8 = d8.a()) == null || a8.a(bVar)) && AbstractC3255y.d(bVar.d(), this.f35805h))) {
            z8 = false;
        } else {
            z8 = true;
        }
        this.f35805h = bVar.d();
        return z8;
    }

    private final boolean k(List list) {
        EnumC2791e enumC2791e;
        int i8;
        C2787a c2787a = (C2787a) AbstractC1378t.o0(list);
        if (c2787a != null) {
            enumC2791e = c2787a.b();
        } else {
            enumC2791e = null;
        }
        if (enumC2791e == null) {
            i8 = -1;
        } else {
            i8 = b.f35808a[enumC2791e.ordinal()];
        }
        if (i8 == 1 || i8 == 2) {
            return true;
        }
        return false;
    }

    public final void c() {
        InterfaceC3390x0 interfaceC3390x0 = this.f35807j;
        if (interfaceC3390x0 != null) {
            InterfaceC3390x0.a.a(interfaceC3390x0, null, 1, null);
        }
        this.f35807j = null;
    }

    public final C2787a d() {
        return (C2787a) AbstractC1378t.o0(this.f35806i);
    }

    public final List e() {
        return this.f35806i;
    }

    public final p f() {
        return this.f35801d;
    }

    public final InterfaceC3698L g() {
        return this.f35804g;
    }

    public final void h(f.b cardNumber) {
        List m8;
        AbstractC3255y.i(cardNumber, "cardNumber");
        boolean booleanValue = ((Boolean) this.f35803f.invoke()).booleanValue();
        if (booleanValue && cardNumber.f() < 8) {
            l(AbstractC1378t.m());
            return;
        }
        if (((Boolean) this.f35803f.invoke()).booleanValue()) {
            m8 = g.f35827a.a(cardNumber);
        } else {
            m8 = AbstractC1378t.m();
        }
        if (!m8.isEmpty()) {
            l(m8);
            return;
        }
        List b8 = this.f35801d.b(cardNumber);
        if (booleanValue) {
            i(cardNumber);
        } else if (!b8.isEmpty() && !k(b8)) {
            l(b8);
        } else {
            i(cardNumber);
        }
    }

    public final /* synthetic */ void i(f.b cardNumber) {
        InterfaceC3390x0 d8;
        AbstractC3255y.i(cardNumber, "cardNumber");
        if (j(cardNumber)) {
            c();
            this.f35806i = AbstractC1378t.m();
            d8 = AbstractC3364k.d(N.a(this.f35800c), null, null, new C0808c(cardNumber, this, null), 3, null);
            this.f35807j = d8;
        }
    }

    public final void l(List accountRanges) {
        AbstractC3255y.i(accountRanges, "accountRanges");
        this.f35806i = accountRanges;
        this.f35802e.a(accountRanges);
    }
}
