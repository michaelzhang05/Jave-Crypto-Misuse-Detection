package n2;

import A2.InterfaceC0943a;
import O5.x;
import P5.Q;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Map;
import k6.C3225a;
import k6.EnumC3228d;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: n2.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3465b implements InterfaceC0943a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0802b f35359a = new C0802b(null);

    /* renamed from: n2.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3465b {

        /* renamed from: b, reason: collision with root package name */
        private final String f35360b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f35361c;

        public a() {
            super(null);
            this.f35360b = "bi_card_number_completed";
            this.f35361c = Q.h();
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f35360b;
        }

        @Override // n2.AbstractC3465b
        public Map b() {
            return this.f35361c;
        }
    }

    /* renamed from: n2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0802b {
        private C0802b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float b(long j8) {
            return (float) C3225a.K(j8, EnumC3228d.f34141e);
        }

        public /* synthetic */ C0802b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: n2.b$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3465b {

        /* renamed from: b, reason: collision with root package name */
        private final String f35362b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f35363c;

        public c() {
            super(null);
            this.f35362b = "bi_load_started";
            this.f35363c = Q.h();
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f35362b;
        }

        @Override // n2.AbstractC3465b
        public Map b() {
            return this.f35363c;
        }
    }

    /* renamed from: n2.b$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3465b {

        /* renamed from: b, reason: collision with root package name */
        private final String f35364b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f35365c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String code) {
            super(null);
            AbstractC3255y.i(code, "code");
            this.f35364b = "bi_form_interacted";
            this.f35365c = Q.e(x.a("selected_lpm", code));
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f35364b;
        }

        @Override // n2.AbstractC3465b
        public Map b() {
            return this.f35365c;
        }
    }

    /* renamed from: n2.b$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3465b {

        /* renamed from: b, reason: collision with root package name */
        private final String f35366b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f35367c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String code) {
            super(null);
            AbstractC3255y.i(code, "code");
            this.f35366b = "bi_form_shown";
            this.f35367c = Q.e(x.a("selected_lpm", code));
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f35366b;
        }

        @Override // n2.AbstractC3465b
        public Map b() {
            return this.f35367c;
        }
    }

    /* renamed from: n2.b$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3465b {

        /* renamed from: b, reason: collision with root package name */
        private final String f35368b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f35369c;

        public /* synthetic */ f(String str, C3225a c3225a, AbstractC3247p abstractC3247p) {
            this(str, c3225a);
        }

        @Override // A2.InterfaceC0943a
        public String a() {
            return this.f35368b;
        }

        @Override // n2.AbstractC3465b
        public Map b() {
            return this.f35369c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        private f(String code, C3225a c3225a) {
            super(0 == true ? 1 : 0);
            AbstractC3255y.i(code, "code");
            this.f35368b = "bi_done_button_tapped";
            this.f35369c = Q.k(x.a("selected_lpm", code), x.a(TypedValues.TransitionType.S_DURATION, c3225a != null ? Float.valueOf(AbstractC3465b.f35359a.b(c3225a.P())) : null));
        }
    }

    private AbstractC3465b() {
    }

    public abstract Map b();

    public /* synthetic */ AbstractC3465b(AbstractC3247p abstractC3247p) {
        this();
    }
}
