package j2;

import M5.a0;
import android.content.Context;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import i6.N;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import r2.C3681a;
import r2.C3682b;
import r2.C3683c;
import t2.AbstractC3790k;
import x2.j;

/* renamed from: j2.I, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3057I {

    /* renamed from: i, reason: collision with root package name */
    private static C3683c f32937i;

    /* renamed from: a, reason: collision with root package name */
    private final e3.m f32939a;

    /* renamed from: b, reason: collision with root package name */
    private final s f32940b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32941c;

    /* renamed from: d, reason: collision with root package name */
    private final P5.g f32942d;

    /* renamed from: e, reason: collision with root package name */
    private final String f32943e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f32934f = new c(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f32935g = 8;

    /* renamed from: h, reason: collision with root package name */
    public static final String f32936h = C3682b.f37561c.a().b();

    /* renamed from: j, reason: collision with root package name */
    private static boolean f32938j = true;

    /* renamed from: j2.I$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f32944a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.f32944a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.f32944a;
        }
    }

    /* renamed from: j2.I$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f32945a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(0);
            this.f32945a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.f32945a;
        }
    }

    /* renamed from: j2.I$c */
    /* loaded from: classes4.dex */
    public static final class c {
        private c() {
        }

        public final boolean a() {
            return C3057I.f32938j;
        }

        public final C3683c b() {
            return C3057I.f32937i;
        }

        public /* synthetic */ c(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j2.I$d */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        int f32946a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.p f32948c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f32949d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f32950e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(com.stripe.android.model.p pVar, String str, String str2, P5.d dVar) {
            super(1, dVar);
            this.f32948c = pVar;
            this.f32949d = str;
            this.f32950e = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(P5.d dVar) {
            return new d(this.f32948c, this.f32949d, this.f32950e, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(P5.d dVar) {
            return ((d) create(dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object B8;
            Object e8 = Q5.b.e();
            int i8 = this.f32946a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                    B8 = ((L5.s) obj).k();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                e3.m i9 = C3057I.this.i();
                com.stripe.android.model.p pVar = this.f32948c;
                j.c cVar = new j.c(C3057I.this.h(), this.f32949d, this.f32950e);
                this.f32946a = 1;
                B8 = i9.B(pVar, cVar, this);
                if (B8 == e8) {
                    return e8;
                }
            }
            return L5.s.a(B8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j2.I$e */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f32951a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f32952b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3061a f32953c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Object obj, InterfaceC3061a interfaceC3061a, P5.d dVar) {
            super(2, dVar);
            this.f32952b = obj;
            this.f32953c = interfaceC3061a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f32952b, this.f32953c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f32951a == 0) {
                L5.t.b(obj);
                Object obj2 = this.f32952b;
                InterfaceC3061a interfaceC3061a = this.f32953c;
                Throwable e8 = L5.s.e(obj2);
                if (e8 == null) {
                    interfaceC3061a.b((v2.f) obj2);
                } else {
                    interfaceC3061a.a(AbstractC3790k.f38229e.b(e8));
                }
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j2.I$f */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f32954a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f32955b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3057I f32956c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3061a f32957d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Function1 function1, C3057I c3057i, InterfaceC3061a interfaceC3061a, P5.d dVar) {
            super(2, dVar);
            this.f32955b = function1;
            this.f32956c = c3057i;
            this.f32957d = interfaceC3061a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(this.f32955b, this.f32956c, this.f32957d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f32954a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        L5.t.b(obj);
                        return L5.I.f6487a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                Function1 function1 = this.f32955b;
                this.f32954a = 1;
                obj = function1.invoke(this);
                if (obj == e8) {
                    return e8;
                }
            }
            Object k8 = ((L5.s) obj).k();
            C3057I c3057i = this.f32956c;
            InterfaceC3061a interfaceC3061a = this.f32957d;
            this.f32954a = 2;
            if (c3057i.f(k8, interfaceC3061a, this) == e8) {
                return e8;
            }
            return L5.I.f6487a;
        }
    }

    public C3057I(e3.m stripeRepository, s paymentController, String publishableKey, String str, P5.g workContext) {
        AbstractC3159y.i(stripeRepository, "stripeRepository");
        AbstractC3159y.i(paymentController, "paymentController");
        AbstractC3159y.i(publishableKey, "publishableKey");
        AbstractC3159y.i(workContext, "workContext");
        this.f32939a = stripeRepository;
        this.f32940b = paymentController;
        this.f32941c = str;
        this.f32942d = workContext;
        this.f32943e = new C3681a().b(publishableKey);
    }

    public static /* synthetic */ void e(C3057I c3057i, com.stripe.android.model.p pVar, String str, String str2, InterfaceC3061a interfaceC3061a, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str = null;
        }
        if ((i8 & 4) != 0) {
            str2 = c3057i.f32941c;
        }
        c3057i.d(pVar, str, str2, interfaceC3061a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(Object obj, InterfaceC3061a interfaceC3061a, P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.c(), new e(obj, interfaceC3061a, null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return L5.I.f6487a;
    }

    private final void g(InterfaceC3061a interfaceC3061a, Function1 function1) {
        AbstractC2829k.d(N.a(this.f32942d), null, null, new f(function1, this, interfaceC3061a, null), 3, null);
    }

    public final void d(com.stripe.android.model.p paymentMethodCreateParams, String str, String str2, InterfaceC3061a callback) {
        AbstractC3159y.i(paymentMethodCreateParams, "paymentMethodCreateParams");
        AbstractC3159y.i(callback, "callback");
        g(callback, new d(paymentMethodCreateParams, str2, str, null));
    }

    public final String h() {
        return this.f32943e;
    }

    public final e3.m i() {
        return this.f32939a;
    }

    public /* synthetic */ C3057I(Context context, String str, String str2, boolean z8, Set set, int i8, AbstractC3151p abstractC3151p) {
        this(context, str, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? false : z8, (i8 & 16) != 0 ? a0.f() : set);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3057I(android.content.Context r22, java.lang.String r23, java.lang.String r24, boolean r25, java.util.Set r26) {
        /*
            r21 = this;
            r0 = r23
            r14 = r26
            java.lang.String r1 = "context"
            r2 = r22
            kotlin.jvm.internal.AbstractC3159y.i(r2, r1)
            java.lang.String r1 = "publishableKey"
            kotlin.jvm.internal.AbstractC3159y.i(r0, r1)
            java.lang.String r1 = "betas"
            r3 = r26
            kotlin.jvm.internal.AbstractC3159y.i(r3, r1)
            android.content.Context r15 = r22.getApplicationContext()
            java.lang.String r3 = "getApplicationContext(...)"
            kotlin.jvm.internal.AbstractC3159y.h(r15, r3)
            com.stripe.android.networking.a r19 = new com.stripe.android.networking.a
            r1 = r19
            android.content.Context r4 = r22.getApplicationContext()
            r2 = r4
            kotlin.jvm.internal.AbstractC3159y.h(r4, r3)
            j2.I$a r4 = new j2.I$a
            r3 = r4
            r4.<init>(r0)
            r2.c r4 = j2.C3057I.f32937i
            r2.d$a r5 = r2.InterfaceC3684d.f37570a
            r13 = r25
            r2.d r5 = r5.a(r13)
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
            r2.a$a r1 = r2.C3681a.f37559a
            r2.a r1 = r1.a()
            java.lang.String r5 = r1.b(r0)
            r2 = r21
            r3 = r20
            r4 = r19
            r6 = r24
            r7 = r25
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.C3057I.<init>(android.content.Context, java.lang.String, java.lang.String, boolean, java.util.Set):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private C3057I(android.content.Context r15, e3.m r16, java.lang.String r17, java.lang.String r18, boolean r19) {
        /*
            r14 = this;
            r0 = r17
            com.stripe.android.b r13 = new com.stripe.android.b
            android.content.Context r2 = r15.getApplicationContext()
            java.lang.String r1 = "getApplicationContext(...)"
            kotlin.jvm.internal.AbstractC3159y.h(r2, r1)
            j2.I$b r3 = new j2.I$b
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
        throw new UnsupportedOperationException("Method not decompiled: j2.C3057I.<init>(android.content.Context, e3.m, java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3057I(e3.m stripeRepository, s paymentController, String publishableKey, String str) {
        this(stripeRepository, paymentController, publishableKey, str, C2812b0.b());
        AbstractC3159y.i(stripeRepository, "stripeRepository");
        AbstractC3159y.i(paymentController, "paymentController");
        AbstractC3159y.i(publishableKey, "publishableKey");
    }
}
