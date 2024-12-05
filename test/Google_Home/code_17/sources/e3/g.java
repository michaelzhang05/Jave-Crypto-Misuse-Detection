package E3;

import B3.f;
import E3.f;
import F3.j;
import O5.C1352h;
import O5.I;
import O5.r;
import O5.t;
import O5.x;
import P5.AbstractC1378t;
import P5.a0;
import a6.InterfaceC1668n;
import a6.InterfaceC1670p;
import android.app.Application;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.o;
import com.stripe.android.model.p;
import com.stripe.android.model.r;
import com.stripe.android.payments.bankaccount.navigation.a;
import com.stripe.android.payments.bankaccount.navigation.c;
import com.stripe.android.payments.bankaccount.navigation.d;
import com.stripe.android.paymentsheet.u;
import e4.C2801b;
import h4.C0;
import h6.InterfaceC2963c;
import j3.C3192d;
import j3.InterfaceC3189a;
import j3.InterfaceC3193e;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import l6.M;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;
import o6.v;
import o6.w;
import p4.C3753b;
import p4.G;
import p4.Q;
import p4.e0;
import p4.w0;
import u3.C4059a;
import u4.C4061a;

/* loaded from: classes4.dex */
public final class g extends ViewModel {

    /* renamed from: K, reason: collision with root package name */
    private static final c f2503K = new c(null);

    /* renamed from: L, reason: collision with root package name */
    public static final int f2504L = 8;

    /* renamed from: A, reason: collision with root package name */
    private final InterfaceC3706f f2505A;

    /* renamed from: B, reason: collision with root package name */
    private final v f2506B;

    /* renamed from: C, reason: collision with root package name */
    private final InterfaceC3706f f2507C;

    /* renamed from: D, reason: collision with root package name */
    private final boolean f2508D;

    /* renamed from: E, reason: collision with root package name */
    private final C0 f2509E;

    /* renamed from: F, reason: collision with root package name */
    private final InterfaceC3698L f2510F;

    /* renamed from: G, reason: collision with root package name */
    private final w f2511G;

    /* renamed from: H, reason: collision with root package name */
    private final InterfaceC3698L f2512H;

    /* renamed from: I, reason: collision with root package name */
    private final InterfaceC3698L f2513I;

    /* renamed from: J, reason: collision with root package name */
    private InterfaceC3193e f2514J;

    /* renamed from: a, reason: collision with root package name */
    private final b f2515a;

    /* renamed from: b, reason: collision with root package name */
    private final Application f2516b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f2517c;

    /* renamed from: d, reason: collision with root package name */
    private final SavedStateHandle f2518d;

    /* renamed from: e, reason: collision with root package name */
    private final u.c f2519e;

    /* renamed from: f, reason: collision with root package name */
    private final u.d f2520f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f2521g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f2522h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f2523i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f2524j;

    /* renamed from: k, reason: collision with root package name */
    private final String f2525k;

    /* renamed from: l, reason: collision with root package name */
    private final w0 f2526l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3698L f2527m;

    /* renamed from: n, reason: collision with root package name */
    private final String f2528n;

    /* renamed from: o, reason: collision with root package name */
    private final w0 f2529o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC3698L f2530p;

    /* renamed from: q, reason: collision with root package name */
    private final String f2531q;

    /* renamed from: r, reason: collision with root package name */
    private final String f2532r;

    /* renamed from: s, reason: collision with root package name */
    private final Q f2533s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC3698L f2534t;

    /* renamed from: u, reason: collision with root package name */
    private final com.stripe.android.model.a f2535u;

    /* renamed from: v, reason: collision with root package name */
    private final e0 f2536v;

    /* renamed from: w, reason: collision with root package name */
    private final C3753b f2537w;

    /* renamed from: x, reason: collision with root package name */
    private final InterfaceC3698L f2538x;

    /* renamed from: y, reason: collision with root package name */
    private final InterfaceC3698L f2539y;

    /* renamed from: z, reason: collision with root package name */
    private final v f2540z;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f2541a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: E3.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0038a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f2543a;

            C0038a(g gVar) {
                this.f2543a = gVar;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, S5.d dVar) {
                if (str != null) {
                    this.f2543a.s().y().r(str);
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
            int i8 = this.f2541a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                InterfaceC3698L y8 = g.this.l().t().i().y();
                C0038a c0038a = new C0038a(g.this);
                this.f2541a = 1;
                if (y8.collect(c0038a, this) == e8) {
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

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f2544a;

        /* renamed from: b, reason: collision with root package name */
        private final D3.a f2545b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f2546c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f2547d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f2548e;

        /* renamed from: f, reason: collision with root package name */
        private final String f2549f;

        /* renamed from: g, reason: collision with root package name */
        private final String f2550g;

        /* renamed from: h, reason: collision with root package name */
        private final String f2551h;

        /* renamed from: i, reason: collision with root package name */
        private final f.e.d f2552i;

        /* renamed from: j, reason: collision with root package name */
        private final C4059a f2553j;

        /* renamed from: k, reason: collision with root package name */
        private final String f2554k;

        public b(boolean z8, D3.a formArgs, boolean z9, boolean z10, boolean z11, String str, String str2, String str3, f.e.d dVar, C4059a c4059a, String hostedSurface) {
            AbstractC3255y.i(formArgs, "formArgs");
            AbstractC3255y.i(hostedSurface, "hostedSurface");
            this.f2544a = z8;
            this.f2545b = formArgs;
            this.f2546c = z9;
            this.f2547d = z10;
            this.f2548e = z11;
            this.f2549f = str;
            this.f2550g = str2;
            this.f2551h = str3;
            this.f2552i = dVar;
            this.f2553j = c4059a;
            this.f2554k = hostedSurface;
        }

        public final String a() {
            return this.f2550g;
        }

        public final D3.a b() {
            return this.f2545b;
        }

        public final String c() {
            return this.f2554k;
        }

        public final boolean d() {
            return this.f2544a;
        }

        public final String e() {
            return this.f2551h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f2544a == bVar.f2544a && AbstractC3255y.d(this.f2545b, bVar.f2545b) && this.f2546c == bVar.f2546c && this.f2547d == bVar.f2547d && this.f2548e == bVar.f2548e && AbstractC3255y.d(this.f2549f, bVar.f2549f) && AbstractC3255y.d(this.f2550g, bVar.f2550g) && AbstractC3255y.d(this.f2551h, bVar.f2551h) && AbstractC3255y.d(this.f2552i, bVar.f2552i) && AbstractC3255y.d(this.f2553j, bVar.f2553j) && AbstractC3255y.d(this.f2554k, bVar.f2554k)) {
                return true;
            }
            return false;
        }

        public final f.e.d f() {
            return this.f2552i;
        }

        public final boolean g() {
            return this.f2546c;
        }

        public final String h() {
            return this.f2549f;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int a8 = ((((((((androidx.compose.foundation.a.a(this.f2544a) * 31) + this.f2545b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f2546c)) * 31) + androidx.compose.foundation.a.a(this.f2547d)) * 31) + androidx.compose.foundation.a.a(this.f2548e)) * 31;
            String str = this.f2549f;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = (a8 + hashCode) * 31;
            String str2 = this.f2550g;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str3 = this.f2551h;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            f.e.d dVar = this.f2552i;
            if (dVar == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = dVar.hashCode();
            }
            int i12 = (i11 + hashCode4) * 31;
            C4059a c4059a = this.f2553j;
            if (c4059a != null) {
                i8 = c4059a.hashCode();
            }
            return ((i12 + i8) * 31) + this.f2554k.hashCode();
        }

        public final boolean i() {
            return this.f2547d;
        }

        public final boolean j() {
            return this.f2548e;
        }

        public String toString() {
            return "Args(instantDebits=" + this.f2544a + ", formArgs=" + this.f2545b + ", showCheckbox=" + this.f2546c + ", isCompleteFlow=" + this.f2547d + ", isPaymentFlow=" + this.f2548e + ", stripeIntentId=" + this.f2549f + ", clientSecret=" + this.f2550g + ", onBehalfOf=" + this.f2551h + ", savedPaymentMethod=" + this.f2552i + ", shippingDetails=" + this.f2553j + ", hostedSurface=" + this.f2554k + ")";
        }
    }

    /* loaded from: classes4.dex */
    private static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Function0 f2555a;

        public d(Function0 argsSupplier) {
            AbstractC3255y.i(argsSupplier, "argsSupplier");
            this.f2555a = argsSupplier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2963c interfaceC2963c, CreationExtras creationExtras) {
            return androidx.lifecycle.n.a(this, interfaceC2963c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls) {
            return androidx.lifecycle.n.b(this, cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass, CreationExtras extras) {
            AbstractC3255y.i(modelClass, "modelClass");
            AbstractC3255y.i(extras, "extras");
            g a8 = ((j.a) F3.b.a().b(D2.b.a(extras)).build().a().get()).b((b) this.f2555a.invoke()).a(SavedStateHandleSupport.createSavedStateHandle(extras)).build().a();
            AbstractC3255y.g(a8, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel.Factory.create");
            return a8;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f2556a = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.model.a invoke(List formFieldValues) {
            AbstractC3255y.i(formFieldValues, "formFieldValues");
            List<r> list = formFieldValues;
            LinkedHashMap linkedHashMap = new LinkedHashMap(g6.m.d(P5.Q.d(AbstractC1378t.x(list, 10)), 16));
            for (r rVar : list) {
                r a8 = x.a(rVar.c(), ((C4061a) rVar.d()).c());
                linkedHashMap.put(a8.c(), a8.d());
            }
            return E3.h.d(com.stripe.android.model.a.f25254g, linkedHashMap);
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f2557a = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C4061a formFieldEntry) {
            AbstractC3255y.i(formFieldEntry, "formFieldEntry");
            if (!formFieldEntry.d()) {
                formFieldEntry = null;
            }
            if (formFieldEntry == null) {
                return null;
            }
            return formFieldEntry.c();
        }
    }

    /* renamed from: E3.g$g, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0039g extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0039g f2558a = new C0039g();

        C0039g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G invoke(List it) {
            AbstractC3255y.i(it, "it");
            return (G) AbstractC1378t.y0(it);
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f2559a = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C4061a formFieldEntry) {
            String c8;
            AbstractC3255y.i(formFieldEntry, "formFieldEntry");
            if (!formFieldEntry.d()) {
                formFieldEntry = null;
            }
            if (formFieldEntry == null || (c8 = formFieldEntry.c()) == null) {
                return "";
            }
            return c8;
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final i f2560a = new i();

        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C4061a formFieldEntry) {
            AbstractC3255y.i(formFieldEntry, "formFieldEntry");
            if (!formFieldEntry.d()) {
                formFieldEntry = null;
            }
            if (formFieldEntry == null) {
                return null;
            }
            return formFieldEntry.c();
        }
    }

    /* loaded from: classes4.dex */
    /* synthetic */ class j extends C3252v implements Function1 {
        j(Object obj) {
            super(1, obj, g.class, "handleInstantDebitsResult", "handleInstantDebitsResult(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult;)V", 0);
        }

        public final void d(com.stripe.android.payments.bankaccount.navigation.a p02) {
            AbstractC3255y.i(p02, "p0");
            ((g) this.receiver).C(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((com.stripe.android.payments.bankaccount.navigation.a) obj);
            return I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    /* synthetic */ class k extends C3252v implements Function1 {
        k(Object obj) {
            super(1, obj, g.class, "handleCollectBankAccountResult", "handleCollectBankAccountResult(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;)V", 0);
        }

        public final void d(com.stripe.android.payments.bankaccount.navigation.d p02) {
            AbstractC3255y.i(p02, "p0");
            ((g) this.receiver).z(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((com.stripe.android.payments.bankaccount.navigation.d) obj);
            return I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    static final class l extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final l f2561a = new l();

        l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C4061a it) {
            AbstractC3255y.i(it, "it");
            return Boolean.valueOf(it.d());
        }
    }

    /* loaded from: classes4.dex */
    static final class m extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final m f2562a = new m();

        m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C4061a it) {
            AbstractC3255y.i(it, "it");
            return Boolean.valueOf(it.d());
        }
    }

    /* loaded from: classes4.dex */
    static final class n extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final n f2563a = new n();

        n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C4061a it) {
            AbstractC3255y.i(it, "it");
            return Boolean.valueOf(it.d());
        }
    }

    /* loaded from: classes4.dex */
    static final class o extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final o f2564a = new o();

        o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(List formFieldValues) {
            AbstractC3255y.i(formFieldValues, "formFieldValues");
            List list = formFieldValues;
            boolean z8 = true;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!((C4061a) ((r) it.next()).d()).d()) {
                        z8 = false;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z8);
        }
    }

    /* loaded from: classes4.dex */
    static final class p extends AbstractC3256z implements InterfaceC1670p {
        p() {
            super(4);
        }

        public final Boolean a(boolean z8, boolean z9, boolean z10, boolean z11) {
            boolean z12;
            boolean z13 = false;
            if (!g.this.f2515a.d()) {
                if (z8 && z9) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            }
            if ((!z10 && g.this.f2520f.u() == u.d.b.f27453c) || (!z11 && g.this.f2520f.a() == u.d.a.f27448c)) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (z9 && z12) {
                z13 = true;
            }
            return Boolean.valueOf(z13);
        }

        @Override // a6.InterfaceC1670p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return a(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0234  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(E3.g.b r29, android.app.Application r30, L5.a r31, androidx.lifecycle.SavedStateHandle r32) {
        /*
            Method dump skipped, instructions count: 861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.g.<init>(E3.g$b, android.app.Application, L5.a, androidx.lifecycle.SavedStateHandle):void");
    }

    private final void A(d.b bVar) {
        String str;
        StripeIntent b8 = bVar.a().b();
        if (b8 != null) {
            str = b8.getId();
        } else {
            str = null;
        }
        c.C0541c g8 = bVar.a().g();
        if (g8 != null) {
            E(g8, str);
        } else {
            H(B2.c.a(t3.w.f39793k));
        }
    }

    private final void B(a.b bVar) {
        Object value;
        w wVar = this.f2511G;
        do {
            value = wVar.getValue();
        } while (!wVar.c(value, new f.b(new f.c.a(bVar.h()), bVar.a(), bVar.g(), bVar.b().getId(), e(), d())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(com.stripe.android.payments.bankaccount.navigation.a aVar) {
        J(false);
        if (aVar instanceof a.b) {
            B((a.b) aVar);
        } else if (aVar instanceof a.c) {
            H(B2.c.a(t3.w.f39793k));
        } else if (aVar instanceof a.C0537a) {
            I(this, null, 1, null);
        }
    }

    private final void E(c.C0541c c0541c, String str) {
        if (c0541c.a().getPaymentAccount() == null) {
            H(B2.c.a(t3.w.f39793k));
        }
    }

    public static /* synthetic */ void I(g gVar, B2.b bVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            bVar = null;
        }
        gVar.H(bVar);
    }

    private final void J(boolean z8) {
        this.f2518d.set("has_launched", Boolean.valueOf(z8));
    }

    private final void K(boolean z8) {
        this.f2518d.set("should_reset", Boolean.valueOf(z8));
    }

    private final void L(f.c cVar, String str, String str2) {
        if (str != null && str2 != null) {
            this.f2540z.e(i(cVar, str2, str));
            K(true);
        }
    }

    private final B2.b d() {
        return E3.i.f2566a.a(k(), ((Boolean) this.f2510F.getValue()).booleanValue(), this.f2515a.d(), !this.f2515a.j());
    }

    private final B2.b e() {
        if (this.f2515a.i()) {
            if (this.f2515a.j()) {
                C2801b a8 = this.f2515a.b().a();
                AbstractC3255y.f(a8);
                return a8.a();
            }
            return B2.c.a(e4.n.f31695C0);
        }
        return B2.c.a(e4.n.f31748o);
    }

    private final void f(String str) {
        if (p()) {
            return;
        }
        J(true);
        if (str != null) {
            h(str);
        } else {
            g();
        }
    }

    private final void g() {
        Integer num;
        String str;
        String h8 = this.f2515a.h();
        if (h8 == null) {
            return;
        }
        if (this.f2515a.j()) {
            InterfaceC3193e interfaceC3193e = this.f2514J;
            if (interfaceC3193e != null) {
                String g8 = ((m2.r) this.f2517c.get()).g();
                String h9 = ((m2.r) this.f2517c.get()).h();
                InterfaceC3189a.b bVar = new InterfaceC3189a.b((String) this.f2527m.getValue(), (String) this.f2530p.getValue());
                String e8 = this.f2515a.e();
                C2801b a8 = this.f2515a.b().a();
                if (a8 != null) {
                    num = Integer.valueOf((int) a8.g());
                } else {
                    num = null;
                }
                C2801b a9 = this.f2515a.b().a();
                if (a9 != null) {
                    str = a9.b();
                } else {
                    str = null;
                }
                interfaceC3193e.c(g8, h9, bVar, h8, null, e8, num, str);
                return;
            }
            return;
        }
        InterfaceC3193e interfaceC3193e2 = this.f2514J;
        if (interfaceC3193e2 != null) {
            interfaceC3193e2.b(((m2.r) this.f2517c.get()).g(), ((m2.r) this.f2517c.get()).h(), new InterfaceC3189a.b((String) this.f2527m.getValue(), (String) this.f2530p.getValue()), h8, null, this.f2515a.e());
        }
    }

    private final void h(String str) {
        InterfaceC3189a bVar;
        if (this.f2515a.d()) {
            bVar = new InterfaceC3189a.C0772a((String) this.f2530p.getValue());
        } else {
            bVar = new InterfaceC3189a.b((String) this.f2527m.getValue(), (String) this.f2530p.getValue());
        }
        if (this.f2515a.j()) {
            InterfaceC3193e interfaceC3193e = this.f2514J;
            if (interfaceC3193e != null) {
                interfaceC3193e.a(((m2.r) this.f2517c.get()).g(), ((m2.r) this.f2517c.get()).h(), str, bVar);
                return;
            }
            return;
        }
        InterfaceC3193e interfaceC3193e2 = this.f2514J;
        if (interfaceC3193e2 != null) {
            interfaceC3193e2.d(((m2.r) this.f2517c.get()).g(), ((m2.r) this.f2517c.get()).h(), str, bVar);
        }
    }

    private final f.e.d i(f.c cVar, String str, String str2) {
        com.stripe.android.model.p h8;
        f.c.a aVar;
        f.e.d.c cVar2;
        r.d dVar;
        f.a c8 = E3.h.c(this.f2515a.g(), ((Boolean) this.f2510F.getValue()).booleanValue());
        boolean z8 = cVar instanceof f.c.a;
        if (z8) {
            h8 = com.stripe.android.model.p.f25636u.k(((f.c.a) cVar).getId(), true, a0.d("PaymentSheet"));
        } else if (cVar instanceof f.c.b) {
            h8 = p.e.h(com.stripe.android.model.p.f25636u, new p.n(((f.c.b) cVar).getId()), new o.e((com.stripe.android.model.a) this.f2538x.getValue(), (String) this.f2530p.getValue(), (String) this.f2527m.getValue(), (String) this.f2534t.getValue()), null, null, 12, null);
        } else {
            throw new O5.p();
        }
        com.stripe.android.model.p pVar = h8;
        if (z8) {
            aVar = (f.c.a) cVar;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            cVar2 = new f.e.d.c(aVar.getId());
        } else {
            cVar2 = null;
        }
        if (cVar instanceof f.c.b) {
            dVar = new r.d(c8.b());
        } else {
            dVar = null;
        }
        String string = this.f2516b.getString(t3.w.f39767U, str);
        int a8 = E3.b.f2336a.a(str2);
        E3.f fVar = (E3.f) this.f2512H.getValue();
        f.e.d.b bVar = new f.e.d.b((String) this.f2527m.getValue(), (String) this.f2530p.getValue(), (String) this.f2534t.getValue(), (com.stripe.android.model.a) this.f2538x.getValue(), ((Boolean) this.f2510F.getValue()).booleanValue());
        AbstractC3255y.f(string);
        return new f.e.d(string, a8, bVar, fVar, cVar2, pVar, c8, dVar, null, 256, null);
    }

    private final E3.f j() {
        if (this.f2515a.f() != null) {
            return this.f2515a.f().u();
        }
        return new f.a(null, B2.c.a(e4.n.f31748o), false, 1, null);
    }

    private final boolean p() {
        return AbstractC3255y.d(this.f2518d.get("has_launched"), Boolean.TRUE);
    }

    private final boolean y() {
        return AbstractC3255y.d(this.f2518d.get("should_reset"), Boolean.TRUE);
    }

    public final void D(E3.f screenState) {
        f.d dVar;
        String l8;
        Object value;
        AbstractC3255y.i(screenState, "screenState");
        if (screenState instanceof f.a) {
            w wVar = this.f2511G;
            do {
                value = wVar.getValue();
            } while (!wVar.c(value, f.a.l((f.a) screenState, null, null, true, 3, null)));
            f(this.f2515a.a());
            return;
        }
        if (screenState instanceof f.b) {
            f.b bVar = (f.b) screenState;
            L(bVar.p(), bVar.i(), bVar.l());
        } else if (screenState instanceof f.e) {
            f.e eVar = (f.e) screenState;
            L(new f.c.b(eVar.i()), eVar.l().getBankName(), eVar.l().getLast4());
        } else if ((screenState instanceof f.d) && (l8 = (dVar = (f.d) screenState).l()) != null) {
            L(new f.c.b(l8), dVar.i(), dVar.p());
        }
    }

    public final void F() {
        if (y()) {
            I(this, null, 1, null);
        }
        this.f2540z.e(null);
        this.f2506B.e(null);
        InterfaceC3193e interfaceC3193e = this.f2514J;
        if (interfaceC3193e != null) {
            interfaceC3193e.unregister();
        }
        this.f2514J = null;
    }

    public final void G(ActivityResultRegistryOwner activityResultRegistryOwner) {
        InterfaceC3193e a8;
        AbstractC3255y.i(activityResultRegistryOwner, "activityResultRegistryOwner");
        if (this.f2515a.d()) {
            a8 = C3192d.f33931d.b(this.f2515a.c(), activityResultRegistryOwner, new j(this));
        } else {
            a8 = InterfaceC3193e.f33935a.a(this.f2515a.c(), activityResultRegistryOwner, new k(this));
        }
        this.f2514J = a8;
    }

    public final void H(B2.b bVar) {
        Object value;
        J(false);
        K(false);
        this.f2509E.f().x(true);
        this.f2506B.e(null);
        w wVar = this.f2511G;
        do {
            value = wVar.getValue();
        } while (!wVar.c(value, new f.a(bVar, B2.c.a(e4.n.f31748o), false)));
    }

    public final String k() {
        CharSequence charSequence;
        String d8 = this.f2515a.b().d();
        int length = d8.length() - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (d8.charAt(length) == '.') {
                    if (i8 < 0) {
                        break;
                    }
                    length = i8;
                } else {
                    charSequence = d8.subSequence(0, length + 1);
                    break;
                }
            }
        }
        charSequence = "";
        return charSequence.toString();
    }

    public final C3753b l() {
        return this.f2537w;
    }

    public final InterfaceC3706f m() {
        return this.f2507C;
    }

    public final InterfaceC3698L n() {
        return this.f2512H;
    }

    public final w0 o() {
        return this.f2529o;
    }

    public final InterfaceC3698L q() {
        return this.f2539y;
    }

    public final w0 r() {
        return this.f2526l;
    }

    public final Q s() {
        return this.f2533s;
    }

    public final InterfaceC3698L t() {
        return this.f2513I;
    }

    public final InterfaceC3706f u() {
        return this.f2505A;
    }

    public final e0 v() {
        return this.f2536v;
    }

    public final InterfaceC3698L w() {
        return this.f2510F;
    }

    public final C0 x() {
        return this.f2509E;
    }

    public final void z(com.stripe.android.payments.bankaccount.navigation.d result) {
        AbstractC3255y.i(result, "result");
        J(false);
        this.f2506B.e(result);
        if (result instanceof d.b) {
            A((d.b) result);
        } else if (result instanceof d.c) {
            H(B2.c.a(t3.w.f39793k));
        } else if (result instanceof d.a) {
            I(this, null, 1, null);
        }
    }
}
