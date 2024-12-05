package k2;

import L5.x;
import M5.Q;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import h6.C2758a;
import h6.EnumC2761d;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import x2.InterfaceC3871a;

/* renamed from: k2.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3110b implements InterfaceC3871a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0772b f33367a = new C0772b(null);

    /* renamed from: k2.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3110b {

        /* renamed from: b, reason: collision with root package name */
        private final String f33368b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f33369c;

        public a() {
            super(null);
            this.f33368b = "bi_card_number_completed";
            this.f33369c = Q.h();
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f33368b;
        }

        @Override // k2.AbstractC3110b
        public Map b() {
            return this.f33369c;
        }
    }

    /* renamed from: k2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0772b {
        private C0772b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float b(long j8) {
            return (float) C2758a.G(j8, EnumC2761d.f31419e);
        }

        public /* synthetic */ C0772b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: k2.b$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3110b {

        /* renamed from: b, reason: collision with root package name */
        private final String f33370b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f33371c;

        public c() {
            super(null);
            this.f33370b = "bi_load_started";
            this.f33371c = Q.h();
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f33370b;
        }

        @Override // k2.AbstractC3110b
        public Map b() {
            return this.f33371c;
        }
    }

    /* renamed from: k2.b$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3110b {

        /* renamed from: b, reason: collision with root package name */
        private final String f33372b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f33373c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String code) {
            super(null);
            AbstractC3159y.i(code, "code");
            this.f33372b = "bi_form_interacted";
            this.f33373c = Q.e(x.a("selected_lpm", code));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f33372b;
        }

        @Override // k2.AbstractC3110b
        public Map b() {
            return this.f33373c;
        }
    }

    /* renamed from: k2.b$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3110b {

        /* renamed from: b, reason: collision with root package name */
        private final String f33374b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f33375c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String code) {
            super(null);
            AbstractC3159y.i(code, "code");
            this.f33374b = "bi_form_shown";
            this.f33375c = Q.e(x.a("selected_lpm", code));
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f33374b;
        }

        @Override // k2.AbstractC3110b
        public Map b() {
            return this.f33375c;
        }
    }

    /* renamed from: k2.b$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3110b {

        /* renamed from: b, reason: collision with root package name */
        private final String f33376b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f33377c;

        public /* synthetic */ f(String str, C2758a c2758a, AbstractC3151p abstractC3151p) {
            this(str, c2758a);
        }

        @Override // x2.InterfaceC3871a
        public String a() {
            return this.f33376b;
        }

        @Override // k2.AbstractC3110b
        public Map b() {
            return this.f33377c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        private f(String code, C2758a c2758a) {
            super(0 == true ? 1 : 0);
            AbstractC3159y.i(code, "code");
            this.f33376b = "bi_done_button_tapped";
            this.f33377c = Q.k(x.a("selected_lpm", code), x.a(TypedValues.TransitionType.S_DURATION, c2758a != null ? Float.valueOf(AbstractC3110b.f33367a.b(c2758a.L())) : null));
        }
    }

    private AbstractC3110b() {
    }

    public abstract Map b();

    public /* synthetic */ AbstractC3110b(AbstractC3151p abstractC3151p) {
        this();
    }
}
