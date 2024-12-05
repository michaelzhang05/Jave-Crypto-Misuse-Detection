package w3;

import C3.c;
import O5.I;
import O5.t;
import S5.d;
import a6.InterfaceC1668n;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.M;
import o6.AbstractC3708h;
import o6.InterfaceC3706f;

/* renamed from: w3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4145a {

    /* renamed from: d, reason: collision with root package name */
    public static final b f40361d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f40362e = 8;

    /* renamed from: a, reason: collision with root package name */
    private final SavedStateHandle f40363a;

    /* renamed from: b, reason: collision with root package name */
    private final EventReporter f40364b;

    /* renamed from: c, reason: collision with root package name */
    private final Function0 f40365c;

    /* renamed from: w3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0916a extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f40366a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f f40367b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C4145a f40368c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: w3.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0917a extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f40369a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f40370b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C4145a f40371c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0917a(C4145a c4145a, d dVar) {
                super(2, dVar);
                this.f40371c = c4145a;
            }

            @Override // a6.InterfaceC1668n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C3.c cVar, d dVar) {
                return ((C0917a) create(cVar, dVar)).invokeSuspend(I.f8278a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                C0917a c0917a = new C0917a(this.f40371c, dVar);
                c0917a.f40370b = obj;
                return c0917a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f40369a == 0) {
                    t.b(obj);
                    this.f40371c.i((C3.c) this.f40370b);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0916a(InterfaceC3706f interfaceC3706f, C4145a c4145a, d dVar) {
            super(2, dVar);
            this.f40367b = interfaceC3706f;
            this.f40368c = c4145a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C0916a(this.f40367b, this.f40368c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f40366a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC3706f interfaceC3706f = this.f40367b;
                C0917a c0917a = new C0917a(this.f40368c, null);
                this.f40366a = 1;
                if (AbstractC3708h.j(interfaceC3706f, c0917a, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, d dVar) {
            return ((C0916a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* renamed from: w3.a$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C4145a(SavedStateHandle savedStateHandle, EventReporter eventReporter, InterfaceC3706f currentScreen, M coroutineScope, Function0 currentPaymentMethodTypeProvider) {
        AbstractC3255y.i(savedStateHandle, "savedStateHandle");
        AbstractC3255y.i(eventReporter, "eventReporter");
        AbstractC3255y.i(currentScreen, "currentScreen");
        AbstractC3255y.i(coroutineScope, "coroutineScope");
        AbstractC3255y.i(currentPaymentMethodTypeProvider, "currentPaymentMethodTypeProvider");
        this.f40363a = savedStateHandle;
        this.f40364b = eventReporter;
        this.f40365c = currentPaymentMethodTypeProvider;
        AbstractC3364k.d(coroutineScope, null, null, new C0916a(currentScreen, this, null), 3, null);
    }

    private final String c() {
        return (String) this.f40363a.get("previously_interacted_payment_form");
    }

    private final boolean d() {
        Boolean bool = (Boolean) this.f40363a.get("previously_sent_deep_link_event");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final String e() {
        return (String) this.f40363a.get("previously_shown_payment_form");
    }

    private final void g(String str) {
        if (!AbstractC3255y.d(e(), str)) {
            this.f40364b.q(str);
            l(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(C3.c cVar) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (cVar instanceof c.g) {
            z8 = true;
        } else {
            z8 = cVar instanceof c.l;
        }
        if (z8) {
            z9 = true;
        } else {
            z9 = cVar instanceof c.h;
        }
        if (z9) {
            z10 = true;
        } else {
            z10 = cVar instanceof c.i;
        }
        if (z10) {
            z11 = true;
        } else {
            z11 = cVar instanceof c.d;
        }
        if (!z11) {
            if (cVar instanceof c.f) {
                this.f40364b.g();
                return;
            }
            if (cVar instanceof c.j) {
                this.f40364b.e();
                l(null);
                j(null);
            } else {
                if (cVar instanceof c.k) {
                    this.f40364b.t();
                    return;
                }
                if (!(cVar instanceof c.b)) {
                    z12 = cVar instanceof c.a;
                }
                if (z12) {
                    g((String) this.f40365c.invoke());
                    this.f40364b.t();
                }
            }
        }
    }

    private final void j(String str) {
        this.f40363a.set("previously_interacted_payment_form", str);
    }

    private final void k(boolean z8) {
        this.f40363a.set("previously_sent_deep_link_event", Boolean.valueOf(z8));
    }

    private final void l(String str) {
        this.f40363a.set("previously_shown_payment_form", str);
    }

    public final void b() {
        if (!d()) {
            this.f40364b.v();
            k(true);
        }
    }

    public final void f(String code) {
        AbstractC3255y.i(code, "code");
        if (!AbstractC3255y.d(c(), code)) {
            this.f40364b.x(code);
            j(code);
        }
    }

    public final void h(C3.c hiddenScreen) {
        AbstractC3255y.i(hiddenScreen, "hiddenScreen");
        if (hiddenScreen instanceof c.f) {
            this.f40364b.w();
        }
    }
}
