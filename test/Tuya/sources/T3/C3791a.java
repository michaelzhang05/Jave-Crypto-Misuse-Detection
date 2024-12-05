package t3;

import L5.I;
import L5.t;
import P5.d;
import X5.n;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import i6.AbstractC2829k;
import i6.M;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3360h;
import l6.InterfaceC3358f;
import z3.InterfaceC4021c;

/* renamed from: t3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3791a {

    /* renamed from: d, reason: collision with root package name */
    public static final b f38234d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f38235e = 8;

    /* renamed from: a, reason: collision with root package name */
    private final SavedStateHandle f38236a;

    /* renamed from: b, reason: collision with root package name */
    private final EventReporter f38237b;

    /* renamed from: c, reason: collision with root package name */
    private final Function0 f38238c;

    /* renamed from: t3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0882a extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f38239a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3358f f38240b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3791a f38241c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: t3.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0883a extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f38242a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f38243b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3791a f38244c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0883a(C3791a c3791a, d dVar) {
                super(2, dVar);
                this.f38244c = c3791a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                C0883a c0883a = new C0883a(this.f38244c, dVar);
                c0883a.f38243b = obj;
                return c0883a;
            }

            @Override // X5.n
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC4021c interfaceC4021c, d dVar) {
                return ((C0883a) create(interfaceC4021c, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f38242a == 0) {
                    t.b(obj);
                    this.f38244c.i((InterfaceC4021c) this.f38243b);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0882a(InterfaceC3358f interfaceC3358f, C3791a c3791a, d dVar) {
            super(2, dVar);
            this.f38240b = interfaceC3358f;
            this.f38241c = c3791a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C0882a(this.f38240b, this.f38241c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, d dVar) {
            return ((C0882a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f38239a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC3358f interfaceC3358f = this.f38240b;
                C0883a c0883a = new C0883a(this.f38241c, null);
                this.f38239a = 1;
                if (AbstractC3360h.h(interfaceC3358f, c0883a, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* renamed from: t3.a$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C3791a(SavedStateHandle savedStateHandle, EventReporter eventReporter, InterfaceC3358f currentScreen, M coroutineScope, Function0 currentPaymentMethodTypeProvider) {
        AbstractC3159y.i(savedStateHandle, "savedStateHandle");
        AbstractC3159y.i(eventReporter, "eventReporter");
        AbstractC3159y.i(currentScreen, "currentScreen");
        AbstractC3159y.i(coroutineScope, "coroutineScope");
        AbstractC3159y.i(currentPaymentMethodTypeProvider, "currentPaymentMethodTypeProvider");
        this.f38236a = savedStateHandle;
        this.f38237b = eventReporter;
        this.f38238c = currentPaymentMethodTypeProvider;
        AbstractC2829k.d(coroutineScope, null, null, new C0882a(currentScreen, this, null), 3, null);
    }

    private final String c() {
        return (String) this.f38236a.get("previously_interacted_payment_form");
    }

    private final boolean d() {
        Boolean bool = (Boolean) this.f38236a.get("previously_sent_deep_link_event");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final String e() {
        return (String) this.f38236a.get("previously_shown_payment_form");
    }

    private final void g(String str) {
        if (!AbstractC3159y.d(e(), str)) {
            this.f38237b.o(str);
            l(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(InterfaceC4021c interfaceC4021c) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (interfaceC4021c instanceof InterfaceC4021c.g) {
            z8 = true;
        } else {
            z8 = interfaceC4021c instanceof InterfaceC4021c.l;
        }
        if (z8) {
            z9 = true;
        } else {
            z9 = interfaceC4021c instanceof InterfaceC4021c.h;
        }
        if (z9) {
            z10 = true;
        } else {
            z10 = interfaceC4021c instanceof InterfaceC4021c.i;
        }
        if (z10) {
            z11 = true;
        } else {
            z11 = interfaceC4021c instanceof InterfaceC4021c.d;
        }
        if (!z11) {
            if (interfaceC4021c instanceof InterfaceC4021c.f) {
                this.f38237b.f();
                return;
            }
            if (interfaceC4021c instanceof InterfaceC4021c.j) {
                this.f38237b.d();
                l(null);
                j(null);
            } else {
                if (interfaceC4021c instanceof InterfaceC4021c.k) {
                    this.f38237b.r();
                    return;
                }
                if (!(interfaceC4021c instanceof InterfaceC4021c.b)) {
                    z12 = interfaceC4021c instanceof InterfaceC4021c.a;
                }
                if (z12) {
                    g((String) this.f38238c.invoke());
                    this.f38237b.r();
                }
            }
        }
    }

    private final void j(String str) {
        this.f38236a.set("previously_interacted_payment_form", str);
    }

    private final void k(boolean z8) {
        this.f38236a.set("previously_sent_deep_link_event", Boolean.valueOf(z8));
    }

    private final void l(String str) {
        this.f38236a.set("previously_shown_payment_form", str);
    }

    public final void b() {
        if (!d()) {
            this.f38237b.v();
            k(true);
        }
    }

    public final void f(String code) {
        AbstractC3159y.i(code, "code");
        if (!AbstractC3159y.d(c(), code)) {
            this.f38237b.x(code);
            j(code);
        }
    }

    public final void h(InterfaceC4021c hiddenScreen) {
        AbstractC3159y.i(hiddenScreen, "hiddenScreen");
        if (hiddenScreen instanceof InterfaceC4021c.f) {
            this.f38237b.w();
        }
    }
}
