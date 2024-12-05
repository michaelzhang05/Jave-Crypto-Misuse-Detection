package B3;

import B3.f;
import C3.j;
import L5.C1224h;
import L5.I;
import L5.r;
import L5.t;
import L5.x;
import M5.AbstractC1246t;
import M5.a0;
import android.app.Application;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import b4.C1880b;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.o;
import com.stripe.android.model.p;
import com.stripe.android.model.r;
import com.stripe.android.payments.bankaccount.navigation.a;
import com.stripe.android.payments.bankaccount.navigation.c;
import com.stripe.android.payments.bankaccount.navigation.d;
import com.stripe.android.paymentsheet.u;
import e4.C0;
import e6.InterfaceC2643c;
import g3.C2715d;
import g3.InterfaceC2712a;
import g3.InterfaceC2716e;
import i6.M;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;
import l6.u;
import l6.v;
import m4.C3410b;
import m4.G;
import m4.Q;
import m4.e0;
import m4.w0;
import q3.w;
import r3.C3686a;
import r4.C3688a;
import y2.AbstractC3984c;
import y2.InterfaceC3983b;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public final class g extends ViewModel {

    /* renamed from: K, reason: collision with root package name */
    private static final c f908K = new c(null);

    /* renamed from: L, reason: collision with root package name */
    public static final int f909L = 8;

    /* renamed from: A, reason: collision with root package name */
    private final InterfaceC3358f f910A;

    /* renamed from: B, reason: collision with root package name */
    private final u f911B;

    /* renamed from: C, reason: collision with root package name */
    private final InterfaceC3358f f912C;

    /* renamed from: D, reason: collision with root package name */
    private final boolean f913D;

    /* renamed from: E, reason: collision with root package name */
    private final C0 f914E;

    /* renamed from: F, reason: collision with root package name */
    private final InterfaceC3349K f915F;

    /* renamed from: G, reason: collision with root package name */
    private final v f916G;

    /* renamed from: H, reason: collision with root package name */
    private final InterfaceC3349K f917H;

    /* renamed from: I, reason: collision with root package name */
    private final InterfaceC3349K f918I;

    /* renamed from: J, reason: collision with root package name */
    private InterfaceC2716e f919J;

    /* renamed from: a, reason: collision with root package name */
    private final b f920a;

    /* renamed from: b, reason: collision with root package name */
    private final Application f921b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f922c;

    /* renamed from: d, reason: collision with root package name */
    private final SavedStateHandle f923d;

    /* renamed from: e, reason: collision with root package name */
    private final u.c f924e;

    /* renamed from: f, reason: collision with root package name */
    private final u.d f925f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f926g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f927h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f928i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f929j;

    /* renamed from: k, reason: collision with root package name */
    private final String f930k;

    /* renamed from: l, reason: collision with root package name */
    private final w0 f931l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3349K f932m;

    /* renamed from: n, reason: collision with root package name */
    private final String f933n;

    /* renamed from: o, reason: collision with root package name */
    private final w0 f934o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC3349K f935p;

    /* renamed from: q, reason: collision with root package name */
    private final String f936q;

    /* renamed from: r, reason: collision with root package name */
    private final String f937r;

    /* renamed from: s, reason: collision with root package name */
    private final Q f938s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC3349K f939t;

    /* renamed from: u, reason: collision with root package name */
    private final com.stripe.android.model.a f940u;

    /* renamed from: v, reason: collision with root package name */
    private final e0 f941v;

    /* renamed from: w, reason: collision with root package name */
    private final C3410b f942w;

    /* renamed from: x, reason: collision with root package name */
    private final InterfaceC3349K f943x;

    /* renamed from: y, reason: collision with root package name */
    private final InterfaceC3349K f944y;

    /* renamed from: z, reason: collision with root package name */
    private final l6.u f945z;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f946a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: B3.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0013a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f948a;

            C0013a(g gVar) {
                this.f948a = gVar;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, P5.d dVar) {
                if (str != null) {
                    this.f948a.s().y().r(str);
                }
                return I.f6487a;
            }
        }

        a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f946a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                InterfaceC3349K y8 = g.this.l().t().i().y();
                C0013a c0013a = new C0013a(g.this);
                this.f946a = 1;
                if (y8.collect(c0013a, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f949a;

        /* renamed from: b, reason: collision with root package name */
        private final A3.a f950b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f951c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f952d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f953e;

        /* renamed from: f, reason: collision with root package name */
        private final String f954f;

        /* renamed from: g, reason: collision with root package name */
        private final String f955g;

        /* renamed from: h, reason: collision with root package name */
        private final String f956h;

        /* renamed from: i, reason: collision with root package name */
        private final AbstractC3991f.e.d f957i;

        /* renamed from: j, reason: collision with root package name */
        private final C3686a f958j;

        /* renamed from: k, reason: collision with root package name */
        private final String f959k;

        public b(boolean z8, A3.a formArgs, boolean z9, boolean z10, boolean z11, String str, String str2, String str3, AbstractC3991f.e.d dVar, C3686a c3686a, String hostedSurface) {
            AbstractC3159y.i(formArgs, "formArgs");
            AbstractC3159y.i(hostedSurface, "hostedSurface");
            this.f949a = z8;
            this.f950b = formArgs;
            this.f951c = z9;
            this.f952d = z10;
            this.f953e = z11;
            this.f954f = str;
            this.f955g = str2;
            this.f956h = str3;
            this.f957i = dVar;
            this.f958j = c3686a;
            this.f959k = hostedSurface;
        }

        public final String a() {
            return this.f955g;
        }

        public final A3.a b() {
            return this.f950b;
        }

        public final String c() {
            return this.f959k;
        }

        public final boolean d() {
            return this.f949a;
        }

        public final String e() {
            return this.f956h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f949a == bVar.f949a && AbstractC3159y.d(this.f950b, bVar.f950b) && this.f951c == bVar.f951c && this.f952d == bVar.f952d && this.f953e == bVar.f953e && AbstractC3159y.d(this.f954f, bVar.f954f) && AbstractC3159y.d(this.f955g, bVar.f955g) && AbstractC3159y.d(this.f956h, bVar.f956h) && AbstractC3159y.d(this.f957i, bVar.f957i) && AbstractC3159y.d(this.f958j, bVar.f958j) && AbstractC3159y.d(this.f959k, bVar.f959k)) {
                return true;
            }
            return false;
        }

        public final AbstractC3991f.e.d f() {
            return this.f957i;
        }

        public final boolean g() {
            return this.f951c;
        }

        public final String h() {
            return this.f954f;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int a8 = ((((((((androidx.compose.foundation.a.a(this.f949a) * 31) + this.f950b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f951c)) * 31) + androidx.compose.foundation.a.a(this.f952d)) * 31) + androidx.compose.foundation.a.a(this.f953e)) * 31;
            String str = this.f954f;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = (a8 + hashCode) * 31;
            String str2 = this.f955g;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str3 = this.f956h;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            AbstractC3991f.e.d dVar = this.f957i;
            if (dVar == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = dVar.hashCode();
            }
            int i12 = (i11 + hashCode4) * 31;
            C3686a c3686a = this.f958j;
            if (c3686a != null) {
                i8 = c3686a.hashCode();
            }
            return ((i12 + i8) * 31) + this.f959k.hashCode();
        }

        public final boolean i() {
            return this.f952d;
        }

        public final boolean j() {
            return this.f953e;
        }

        public String toString() {
            return "Args(instantDebits=" + this.f949a + ", formArgs=" + this.f950b + ", showCheckbox=" + this.f951c + ", isCompleteFlow=" + this.f952d + ", isPaymentFlow=" + this.f953e + ", stripeIntentId=" + this.f954f + ", clientSecret=" + this.f955g + ", onBehalfOf=" + this.f956h + ", savedPaymentMethod=" + this.f957i + ", shippingDetails=" + this.f958j + ", hostedSurface=" + this.f959k + ")";
        }
    }

    /* loaded from: classes4.dex */
    private static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Function0 f960a;

        public d(Function0 argsSupplier) {
            AbstractC3159y.i(argsSupplier, "argsSupplier");
            this.f960a = argsSupplier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2643c interfaceC2643c, CreationExtras creationExtras) {
            return androidx.lifecycle.n.a(this, interfaceC2643c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls) {
            return androidx.lifecycle.n.b(this, cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass, CreationExtras extras) {
            AbstractC3159y.i(modelClass, "modelClass");
            AbstractC3159y.i(extras, "extras");
            g a8 = ((j.a) C3.b.a().b(A2.b.a(extras)).build().a().get()).b((b) this.f960a.invoke()).a(SavedStateHandleSupport.createSavedStateHandle(extras)).build().a();
            AbstractC3159y.g(a8, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel.Factory.create");
            return a8;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f961a = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.model.a invoke(List formFieldValues) {
            AbstractC3159y.i(formFieldValues, "formFieldValues");
            List<r> list = formFieldValues;
            LinkedHashMap linkedHashMap = new LinkedHashMap(d6.m.d(M5.Q.d(AbstractC1246t.x(list, 10)), 16));
            for (r rVar : list) {
                r a8 = x.a(rVar.c(), ((C3688a) rVar.d()).c());
                linkedHashMap.put(a8.c(), a8.d());
            }
            return B3.h.d(com.stripe.android.model.a.f24199g, linkedHashMap);
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f962a = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C3688a formFieldEntry) {
            AbstractC3159y.i(formFieldEntry, "formFieldEntry");
            if (!formFieldEntry.d()) {
                formFieldEntry = null;
            }
            if (formFieldEntry == null) {
                return null;
            }
            return formFieldEntry.c();
        }
    }

    /* renamed from: B3.g$g, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0014g extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0014g f963a = new C0014g();

        C0014g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G invoke(List it) {
            AbstractC3159y.i(it, "it");
            return (G) AbstractC1246t.y0(it);
        }
    }

    /* loaded from: classes4.dex */
    static final class h extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f964a = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C3688a formFieldEntry) {
            String c8;
            AbstractC3159y.i(formFieldEntry, "formFieldEntry");
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
    static final class i extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final i f965a = new i();

        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C3688a formFieldEntry) {
            AbstractC3159y.i(formFieldEntry, "formFieldEntry");
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
    /* synthetic */ class j extends C3156v implements Function1 {
        j(Object obj) {
            super(1, obj, g.class, "handleInstantDebitsResult", "handleInstantDebitsResult(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult;)V", 0);
        }

        public final void d(com.stripe.android.payments.bankaccount.navigation.a p02) {
            AbstractC3159y.i(p02, "p0");
            ((g) this.receiver).C(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((com.stripe.android.payments.bankaccount.navigation.a) obj);
            return I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    /* synthetic */ class k extends C3156v implements Function1 {
        k(Object obj) {
            super(1, obj, g.class, "handleCollectBankAccountResult", "handleCollectBankAccountResult(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;)V", 0);
        }

        public final void d(com.stripe.android.payments.bankaccount.navigation.d p02) {
            AbstractC3159y.i(p02, "p0");
            ((g) this.receiver).z(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((com.stripe.android.payments.bankaccount.navigation.d) obj);
            return I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    static final class l extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final l f966a = new l();

        l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C3688a it) {
            AbstractC3159y.i(it, "it");
            return Boolean.valueOf(it.d());
        }
    }

    /* loaded from: classes4.dex */
    static final class m extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final m f967a = new m();

        m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C3688a it) {
            AbstractC3159y.i(it, "it");
            return Boolean.valueOf(it.d());
        }
    }

    /* loaded from: classes4.dex */
    static final class n extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final n f968a = new n();

        n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C3688a it) {
            AbstractC3159y.i(it, "it");
            return Boolean.valueOf(it.d());
        }
    }

    /* loaded from: classes4.dex */
    static final class o extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final o f969a = new o();

        o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(List formFieldValues) {
            AbstractC3159y.i(formFieldValues, "formFieldValues");
            List list = formFieldValues;
            boolean z8 = true;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!((C3688a) ((r) it.next()).d()).d()) {
                        z8 = false;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z8);
        }
    }

    /* loaded from: classes4.dex */
    static final class p extends AbstractC3160z implements X5.p {
        p() {
            super(4);
        }

        public final Boolean a(boolean z8, boolean z9, boolean z10, boolean z11) {
            boolean z12;
            boolean z13 = false;
            if (!g.this.f920a.d()) {
                if (z8 && z9) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            }
            if ((!z10 && g.this.f925f.o() == u.d.b.f26398c) || (!z11 && g.this.f925f.b() == u.d.a.f26393c)) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (z9 && z12) {
                z13 = true;
            }
            return Boolean.valueOf(z13);
        }

        @Override // X5.p
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
    public g(B3.g.b r29, android.app.Application r30, I5.a r31, androidx.lifecycle.SavedStateHandle r32) {
        /*
            Method dump skipped, instructions count: 861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.g.<init>(B3.g$b, android.app.Application, I5.a, androidx.lifecycle.SavedStateHandle):void");
    }

    private final void A(d.b bVar) {
        String str;
        StripeIntent c8 = bVar.b().c();
        if (c8 != null) {
            str = c8.getId();
        } else {
            str = null;
        }
        c.C0545c e8 = bVar.b().e();
        if (e8 != null) {
            E(e8, str);
        } else {
            H(AbstractC3984c.a(w.f37471k));
        }
    }

    private final void B(a.b bVar) {
        Object value;
        v vVar = this.f916G;
        do {
            value = vVar.getValue();
        } while (!vVar.a(value, new f.b(new f.c.a(bVar.f()), bVar.b(), bVar.e(), bVar.c().getId(), e(), d())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(com.stripe.android.payments.bankaccount.navigation.a aVar) {
        J(false);
        if (aVar instanceof a.b) {
            B((a.b) aVar);
        } else if (aVar instanceof a.c) {
            H(AbstractC3984c.a(w.f37471k));
        } else if (aVar instanceof a.C0541a) {
            I(this, null, 1, null);
        }
    }

    private final void E(c.C0545c c0545c, String str) {
        if (c0545c.b().getPaymentAccount() == null) {
            H(AbstractC3984c.a(w.f37471k));
        }
    }

    public static /* synthetic */ void I(g gVar, InterfaceC3983b interfaceC3983b, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            interfaceC3983b = null;
        }
        gVar.H(interfaceC3983b);
    }

    private final void J(boolean z8) {
        this.f923d.set("has_launched", Boolean.valueOf(z8));
    }

    private final void K(boolean z8) {
        this.f923d.set("should_reset", Boolean.valueOf(z8));
    }

    private final void L(f.c cVar, String str, String str2) {
        if (str != null && str2 != null) {
            this.f945z.d(i(cVar, str2, str));
            K(true);
        }
    }

    private final InterfaceC3983b d() {
        return B3.i.f971a.a(k(), ((Boolean) this.f915F.getValue()).booleanValue(), this.f920a.d(), !this.f920a.j());
    }

    private final InterfaceC3983b e() {
        if (this.f920a.i()) {
            if (this.f920a.j()) {
                C1880b a8 = this.f920a.b().a();
                AbstractC3159y.f(a8);
                return a8.b();
            }
            return AbstractC3984c.a(b4.n.f14689C0);
        }
        return AbstractC3984c.a(b4.n.f14742o);
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
        String h8 = this.f920a.h();
        if (h8 == null) {
            return;
        }
        if (this.f920a.j()) {
            InterfaceC2716e interfaceC2716e = this.f919J;
            if (interfaceC2716e != null) {
                String e8 = ((j2.r) this.f922c.get()).e();
                String f8 = ((j2.r) this.f922c.get()).f();
                InterfaceC2712a.b bVar = new InterfaceC2712a.b((String) this.f932m.getValue(), (String) this.f935p.getValue());
                String e9 = this.f920a.e();
                C1880b a8 = this.f920a.b().a();
                if (a8 != null) {
                    num = Integer.valueOf((int) a8.e());
                } else {
                    num = null;
                }
                C1880b a9 = this.f920a.b().a();
                if (a9 != null) {
                    str = a9.c();
                } else {
                    str = null;
                }
                interfaceC2716e.d(e8, f8, bVar, h8, null, e9, num, str);
                return;
            }
            return;
        }
        InterfaceC2716e interfaceC2716e2 = this.f919J;
        if (interfaceC2716e2 != null) {
            interfaceC2716e2.b(((j2.r) this.f922c.get()).e(), ((j2.r) this.f922c.get()).f(), new InterfaceC2712a.b((String) this.f932m.getValue(), (String) this.f935p.getValue()), h8, null, this.f920a.e());
        }
    }

    private final void h(String str) {
        InterfaceC2712a bVar;
        if (this.f920a.d()) {
            bVar = new InterfaceC2712a.C0747a((String) this.f935p.getValue());
        } else {
            bVar = new InterfaceC2712a.b((String) this.f932m.getValue(), (String) this.f935p.getValue());
        }
        if (this.f920a.j()) {
            InterfaceC2716e interfaceC2716e = this.f919J;
            if (interfaceC2716e != null) {
                interfaceC2716e.a(((j2.r) this.f922c.get()).e(), ((j2.r) this.f922c.get()).f(), str, bVar);
                return;
            }
            return;
        }
        InterfaceC2716e interfaceC2716e2 = this.f919J;
        if (interfaceC2716e2 != null) {
            interfaceC2716e2.c(((j2.r) this.f922c.get()).e(), ((j2.r) this.f922c.get()).f(), str, bVar);
        }
    }

    private final AbstractC3991f.e.d i(f.c cVar, String str, String str2) {
        com.stripe.android.model.p h8;
        f.c.a aVar;
        AbstractC3991f.e.d.c cVar2;
        r.d dVar;
        AbstractC3991f.a c8 = B3.h.c(this.f920a.g(), ((Boolean) this.f915F.getValue()).booleanValue());
        boolean z8 = cVar instanceof f.c.a;
        if (z8) {
            h8 = com.stripe.android.model.p.f24581u.k(((f.c.a) cVar).getId(), true, a0.d("PaymentSheet"));
        } else if (cVar instanceof f.c.b) {
            h8 = p.e.h(com.stripe.android.model.p.f24581u, new p.n(((f.c.b) cVar).getId()), new o.e((com.stripe.android.model.a) this.f943x.getValue(), (String) this.f935p.getValue(), (String) this.f932m.getValue(), (String) this.f939t.getValue()), null, null, 12, null);
        } else {
            throw new L5.p();
        }
        com.stripe.android.model.p pVar = h8;
        if (z8) {
            aVar = (f.c.a) cVar;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            cVar2 = new AbstractC3991f.e.d.c(aVar.getId());
        } else {
            cVar2 = null;
        }
        if (cVar instanceof f.c.b) {
            dVar = new r.d(c8.b());
        } else {
            dVar = null;
        }
        String string = this.f921b.getString(w.f37445U, str);
        int a8 = B3.b.f741a.a(str2);
        B3.f fVar = (B3.f) this.f917H.getValue();
        AbstractC3991f.e.d.b bVar = new AbstractC3991f.e.d.b((String) this.f932m.getValue(), (String) this.f935p.getValue(), (String) this.f939t.getValue(), (com.stripe.android.model.a) this.f943x.getValue(), ((Boolean) this.f915F.getValue()).booleanValue());
        AbstractC3159y.f(string);
        return new AbstractC3991f.e.d(string, a8, bVar, fVar, cVar2, pVar, c8, dVar, null, 256, null);
    }

    private final B3.f j() {
        if (this.f920a.f() != null) {
            return this.f920a.f().o();
        }
        return new f.a(null, AbstractC3984c.a(b4.n.f14742o), false, 1, null);
    }

    private final boolean p() {
        return AbstractC3159y.d(this.f923d.get("has_launched"), Boolean.TRUE);
    }

    private final boolean y() {
        return AbstractC3159y.d(this.f923d.get("should_reset"), Boolean.TRUE);
    }

    public final void D(B3.f screenState) {
        f.d dVar;
        String j8;
        Object value;
        AbstractC3159y.i(screenState, "screenState");
        if (screenState instanceof f.a) {
            v vVar = this.f916G;
            do {
                value = vVar.getValue();
            } while (!vVar.a(value, f.a.j((f.a) screenState, null, null, true, 3, null)));
            f(this.f920a.a());
            return;
        }
        if (screenState instanceof f.b) {
            f.b bVar = (f.b) screenState;
            L(bVar.k(), bVar.i(), bVar.j());
        } else if (screenState instanceof f.e) {
            f.e eVar = (f.e) screenState;
            L(new f.c.b(eVar.i()), eVar.j().getBankName(), eVar.j().getLast4());
        } else if ((screenState instanceof f.d) && (j8 = (dVar = (f.d) screenState).j()) != null) {
            L(new f.c.b(j8), dVar.i(), dVar.k());
        }
    }

    public final void F() {
        if (y()) {
            I(this, null, 1, null);
        }
        this.f945z.d(null);
        this.f911B.d(null);
        InterfaceC2716e interfaceC2716e = this.f919J;
        if (interfaceC2716e != null) {
            interfaceC2716e.unregister();
        }
        this.f919J = null;
    }

    public final void G(ActivityResultRegistryOwner activityResultRegistryOwner) {
        InterfaceC2716e a8;
        AbstractC3159y.i(activityResultRegistryOwner, "activityResultRegistryOwner");
        if (this.f920a.d()) {
            a8 = C2715d.f31204d.b(this.f920a.c(), activityResultRegistryOwner, new j(this));
        } else {
            a8 = InterfaceC2716e.f31208a.a(this.f920a.c(), activityResultRegistryOwner, new k(this));
        }
        this.f919J = a8;
    }

    public final void H(InterfaceC3983b interfaceC3983b) {
        Object value;
        J(false);
        K(false);
        this.f914E.f().x(true);
        this.f911B.d(null);
        v vVar = this.f916G;
        do {
            value = vVar.getValue();
        } while (!vVar.a(value, new f.a(interfaceC3983b, AbstractC3984c.a(b4.n.f14742o), false)));
    }

    public final String k() {
        CharSequence charSequence;
        String d8 = this.f920a.b().d();
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

    public final C3410b l() {
        return this.f942w;
    }

    public final InterfaceC3358f m() {
        return this.f912C;
    }

    public final InterfaceC3349K n() {
        return this.f917H;
    }

    public final w0 o() {
        return this.f934o;
    }

    public final InterfaceC3349K q() {
        return this.f944y;
    }

    public final w0 r() {
        return this.f931l;
    }

    public final Q s() {
        return this.f938s;
    }

    public final InterfaceC3349K t() {
        return this.f918I;
    }

    public final InterfaceC3358f u() {
        return this.f910A;
    }

    public final e0 v() {
        return this.f941v;
    }

    public final InterfaceC3349K w() {
        return this.f915F;
    }

    public final C0 x() {
        return this.f914E;
    }

    public final void z(com.stripe.android.payments.bankaccount.navigation.d result) {
        AbstractC3159y.i(result, "result");
        J(false);
        this.f911B.d(result);
        if (result instanceof d.b) {
            A((d.b) result);
        } else if (result instanceof d.c) {
            H(AbstractC3984c.a(w.f37471k));
        } else if (result instanceof d.a) {
            I(this, null, 1, null);
        }
    }
}
