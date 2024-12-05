package m2;

import A2.j;
import P5.a0;
import a6.InterfaceC1668n;
import android.content.Context;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import l6.N;
import u2.C4054a;
import u2.C4055b;
import u2.C4056c;
import w2.AbstractC4144k;

/* renamed from: m2.I, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3411I {

    /* renamed from: i, reason: collision with root package name */
    private static C4056c f34913i;

    /* renamed from: a, reason: collision with root package name */
    private final h3.m f34915a;

    /* renamed from: b, reason: collision with root package name */
    private final s f34916b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34917c;

    /* renamed from: d, reason: collision with root package name */
    private final S5.g f34918d;

    /* renamed from: e, reason: collision with root package name */
    private final String f34919e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f34910f = new c(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f34911g = 8;

    /* renamed from: h, reason: collision with root package name */
    public static final String f34912h = C4055b.f39941c.a().b();

    /* renamed from: j, reason: collision with root package name */
    private static boolean f34914j = true;

    /* renamed from: m2.I$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f34920a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.f34920a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.f34920a;
        }
    }

    /* renamed from: m2.I$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f34921a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(0);
            this.f34921a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.f34921a;
        }
    }

    /* renamed from: m2.I$c */
    /* loaded from: classes4.dex */
    public static final class c {
        private c() {
        }

        public final boolean a() {
            return C3411I.f34914j;
        }

        public final C4056c b() {
            return C3411I.f34913i;
        }

        public /* synthetic */ c(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m2.I$d */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        int f34922a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.p f34924c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f34925d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f34926e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(com.stripe.android.model.p pVar, String str, String str2, S5.d dVar) {
            super(1, dVar);
            this.f34924c = pVar;
            this.f34925d = str;
            this.f34926e = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(S5.d dVar) {
            return new d(this.f34924c, this.f34925d, this.f34926e, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(S5.d dVar) {
            return ((d) create(dVar)).invokeSuspend(O5.I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object n8;
            Object e8 = T5.b.e();
            int i8 = this.f34922a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                    n8 = ((O5.s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                h3.m i9 = C3411I.this.i();
                com.stripe.android.model.p pVar = this.f34924c;
                j.c cVar = new j.c(C3411I.this.h(), this.f34925d, this.f34926e);
                this.f34922a = 1;
                n8 = i9.n(pVar, cVar, this);
                if (n8 == e8) {
                    return e8;
                }
            }
            return O5.s.a(n8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m2.I$e */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f34927a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f34928b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3415a f34929c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Object obj, InterfaceC3415a interfaceC3415a, S5.d dVar) {
            super(2, dVar);
            this.f34928b = obj;
            this.f34929c = interfaceC3415a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(this.f34928b, this.f34929c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f34927a == 0) {
                O5.t.b(obj);
                Object obj2 = this.f34928b;
                InterfaceC3415a interfaceC3415a = this.f34929c;
                Throwable e8 = O5.s.e(obj2);
                if (e8 == null) {
                    interfaceC3415a.b((y2.f) obj2);
                } else {
                    interfaceC3415a.a(AbstractC4144k.f40356e.b(e8));
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m2.I$f */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f34930a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f34931b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3411I f34932c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3415a f34933d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Function1 function1, C3411I c3411i, InterfaceC3415a interfaceC3415a, S5.d dVar) {
            super(2, dVar);
            this.f34931b = function1;
            this.f34932c = c3411i;
            this.f34933d = interfaceC3415a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(this.f34931b, this.f34932c, this.f34933d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f34930a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        O5.t.b(obj);
                        return O5.I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                Function1 function1 = this.f34931b;
                this.f34930a = 1;
                obj = function1.invoke(this);
                if (obj == e8) {
                    return e8;
                }
            }
            Object j8 = ((O5.s) obj).j();
            C3411I c3411i = this.f34932c;
            InterfaceC3415a interfaceC3415a = this.f34933d;
            this.f34930a = 2;
            if (c3411i.f(j8, interfaceC3415a, this) == e8) {
                return e8;
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public C3411I(h3.m stripeRepository, s paymentController, String publishableKey, String str, S5.g workContext) {
        AbstractC3255y.i(stripeRepository, "stripeRepository");
        AbstractC3255y.i(paymentController, "paymentController");
        AbstractC3255y.i(publishableKey, "publishableKey");
        AbstractC3255y.i(workContext, "workContext");
        this.f34915a = stripeRepository;
        this.f34916b = paymentController;
        this.f34917c = str;
        this.f34918d = workContext;
        this.f34919e = new C4054a().b(publishableKey);
    }

    public static /* synthetic */ void e(C3411I c3411i, com.stripe.android.model.p pVar, String str, String str2, InterfaceC3415a interfaceC3415a, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str = null;
        }
        if ((i8 & 4) != 0) {
            str2 = c3411i.f34917c;
        }
        c3411i.d(pVar, str, str2, interfaceC3415a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(Object obj, InterfaceC3415a interfaceC3415a, S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.c(), new e(obj, interfaceC3415a, null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return O5.I.f8278a;
    }

    private final void g(InterfaceC3415a interfaceC3415a, Function1 function1) {
        AbstractC3364k.d(N.a(this.f34918d), null, null, new f(function1, this, interfaceC3415a, null), 3, null);
    }

    public final void d(com.stripe.android.model.p paymentMethodCreateParams, String str, String str2, InterfaceC3415a callback) {
        AbstractC3255y.i(paymentMethodCreateParams, "paymentMethodCreateParams");
        AbstractC3255y.i(callback, "callback");
        g(callback, new d(paymentMethodCreateParams, str2, str, null));
    }

    public final String h() {
        return this.f34919e;
    }

    public final h3.m i() {
        return this.f34915a;
    }

    public /* synthetic */ C3411I(Context context, String str, String str2, boolean z8, Set set, int i8, AbstractC3247p abstractC3247p) {
        this(context, str, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? false : z8, (i8 & 16) != 0 ? a0.f() : set);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3411I(android.content.Context r22, java.lang.String r23, java.lang.String r24, boolean r25, java.util.Set r26) {
        /*
            r21 = this;
            r0 = r23
            r14 = r26
            java.lang.String r1 = "context"
            r2 = r22
            kotlin.jvm.internal.AbstractC3255y.i(r2, r1)
            java.lang.String r1 = "publishableKey"
            kotlin.jvm.internal.AbstractC3255y.i(r0, r1)
            java.lang.String r1 = "betas"
            r3 = r26
            kotlin.jvm.internal.AbstractC3255y.i(r3, r1)
            android.content.Context r15 = r22.getApplicationContext()
            java.lang.String r3 = "getApplicationContext(...)"
            kotlin.jvm.internal.AbstractC3255y.h(r15, r3)
            com.stripe.android.networking.a r19 = new com.stripe.android.networking.a
            r1 = r19
            android.content.Context r4 = r22.getApplicationContext()
            r2 = r4
            kotlin.jvm.internal.AbstractC3255y.h(r4, r3)
            m2.I$a r4 = new m2.I$a
            r3 = r4
            r4.<init>(r0)
            u2.c r4 = m2.C3411I.f34913i
            u2.d$a r5 = u2.InterfaceC4057d.f39950a
            r13 = r25
            u2.d r5 = r5.a(r13)
            r17 = 28656(0x6ff0, float:4.0156E-41)
            r18 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r13 = r16
            r20 = r15
            r15 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            u2.a$a r1 = u2.C4054a.f39939a
            u2.a r1 = r1.a()
            java.lang.String r5 = r1.b(r0)
            r2 = r21
            r3 = r20
            r4 = r19
            r6 = r24
            r7 = r25
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C3411I.<init>(android.content.Context, java.lang.String, java.lang.String, boolean, java.util.Set):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private C3411I(android.content.Context r15, h3.m r16, java.lang.String r17, java.lang.String r18, boolean r19) {
        /*
            r14 = this;
            r0 = r17
            com.stripe.android.b r13 = new com.stripe.android.b
            android.content.Context r2 = r15.getApplicationContext()
            java.lang.String r1 = "getApplicationContext(...)"
            kotlin.jvm.internal.AbstractC3255y.h(r2, r1)
            m2.I$b r3 = new m2.I$b
            r3.<init>(r0)
            r11 = 496(0x1f0, float:6.95E-43)
            r12 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r1 = r13
            r4 = r16
            r5 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = r14
            r2 = r16
            r3 = r18
            r14.<init>(r2, r13, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C3411I.<init>(android.content.Context, h3.m, java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3411I(h3.m stripeRepository, s paymentController, String publishableKey, String str) {
        this(stripeRepository, paymentController, publishableKey, str, C3347b0.b());
        AbstractC3255y.i(stripeRepository, "stripeRepository");
        AbstractC3255y.i(paymentController, "paymentController");
        AbstractC3255y.i(publishableKey, "publishableKey");
    }
}
