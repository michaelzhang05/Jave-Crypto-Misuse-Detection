package L3;

import O5.I;
import O5.s;
import O5.t;
import P5.AbstractC1378t;
import a3.C1622d;
import a3.C1625g;
import a6.InterfaceC1668n;
import b3.C1970d;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.j;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.u;
import e3.y;
import h4.C2920b0;
import h4.C2922c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.C3252v;
import l6.M;
import l6.U;
import n3.i;
import o6.AbstractC3708h;
import t3.q;
import u2.InterfaceC4057d;
import w2.AbstractC4144k;

/* loaded from: classes4.dex */
public final class d implements L3.h {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f5923a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f5924b;

    /* renamed from: c, reason: collision with root package name */
    private final K3.e f5925c;

    /* renamed from: d, reason: collision with root package name */
    private final K3.c f5926d;

    /* renamed from: e, reason: collision with root package name */
    private final C1622d f5927e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC4057d f5928f;

    /* renamed from: g, reason: collision with root package name */
    private final EventReporter f5929g;

    /* renamed from: h, reason: collision with root package name */
    private final n3.i f5930h;

    /* renamed from: i, reason: collision with root package name */
    private final S5.g f5931i;

    /* renamed from: j, reason: collision with root package name */
    private final L3.f f5932j;

    /* renamed from: k, reason: collision with root package name */
    private final O2.d f5933k;

    /* renamed from: l, reason: collision with root package name */
    private final C2922c0 f5934l;

    /* renamed from: m, reason: collision with root package name */
    private final D2.h f5935m;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public interface a {

        /* renamed from: L3.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0103a implements a {

            /* renamed from: d, reason: collision with root package name */
            public static final int f5936d = j.c.f25336d;

            /* renamed from: a, reason: collision with root package name */
            private final j.c f5937a;

            /* renamed from: b, reason: collision with root package name */
            private final String f5938b;

            /* renamed from: c, reason: collision with root package name */
            private final String f5939c;

            public C0103a(j.c elementsSessionCustomer) {
                AbstractC3255y.i(elementsSessionCustomer, "elementsSessionCustomer");
                this.f5937a = elementsSessionCustomer;
                this.f5938b = elementsSessionCustomer.b().g();
                this.f5939c = elementsSessionCustomer.b().a();
            }

            @Override // L3.d.a
            public String a() {
                return this.f5939c;
            }

            public final j.c b() {
                return this.f5937a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0103a) && AbstractC3255y.d(this.f5937a, ((C0103a) obj).f5937a)) {
                    return true;
                }
                return false;
            }

            @Override // L3.d.a
            public String getId() {
                return this.f5938b;
            }

            public int hashCode() {
                return this.f5937a.hashCode();
            }

            public String toString() {
                return "CustomerSession(elementsSessionCustomer=" + this.f5937a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            private final u.i f5940a;

            /* renamed from: b, reason: collision with root package name */
            private final u.h.b f5941b;

            /* renamed from: c, reason: collision with root package name */
            private final String f5942c;

            /* renamed from: d, reason: collision with root package name */
            private final String f5943d;

            public b(u.i customerConfig, u.h.b accessType) {
                AbstractC3255y.i(customerConfig, "customerConfig");
                AbstractC3255y.i(accessType, "accessType");
                this.f5940a = customerConfig;
                this.f5941b = accessType;
                this.f5942c = customerConfig.getId();
                this.f5943d = accessType.a();
            }

            @Override // L3.d.a
            public String a() {
                return this.f5943d;
            }

            public final u.h.b b() {
                return this.f5941b;
            }

            public final u.i c() {
                return this.f5940a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                if (AbstractC3255y.d(this.f5940a, bVar.f5940a) && AbstractC3255y.d(this.f5941b, bVar.f5941b)) {
                    return true;
                }
                return false;
            }

            @Override // L3.d.a
            public String getId() {
                return this.f5942c;
            }

            public int hashCode() {
                return (this.f5940a.hashCode() * 31) + this.f5941b.hashCode();
            }

            public String toString() {
                return "Legacy(customerConfig=" + this.f5940a + ", accessType=" + this.f5941b + ")";
            }
        }

        String a();

        String getId();
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5944a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f5945b;

        static {
            int[] iArr = new int[R2.a.values().length];
            try {
                iArr[R2.a.f9616a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[R2.a.f9617b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[R2.a.f9618c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[R2.a.f9619d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[R2.a.f9620e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f5944a = iArr;
            int[] iArr2 = new int[u.k.c.values().length];
            try {
                iArr2[u.k.c.f27517a.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[u.k.c.f27518b.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f5945b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f5946a;

        /* renamed from: b, reason: collision with root package name */
        Object f5947b;

        /* renamed from: c, reason: collision with root package name */
        Object f5948c;

        /* renamed from: d, reason: collision with root package name */
        Object f5949d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f5950e;

        /* renamed from: g, reason: collision with root package name */
        int f5952g;

        c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5950e = obj;
            this.f5952g |= Integer.MIN_VALUE;
            return d.this.v(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L3.d$d, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0104d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f5953a;

        /* renamed from: b, reason: collision with root package name */
        Object f5954b;

        /* renamed from: c, reason: collision with root package name */
        Object f5955c;

        /* renamed from: d, reason: collision with root package name */
        Object f5956d;

        /* renamed from: e, reason: collision with root package name */
        Object f5957e;

        /* renamed from: f, reason: collision with root package name */
        Object f5958f;

        /* renamed from: g, reason: collision with root package name */
        boolean f5959g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f5960h;

        /* renamed from: j, reason: collision with root package name */
        int f5962j;

        C0104d(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5960h = obj;
            this.f5962j |= Integer.MIN_VALUE;
            return d.this.w(null, null, null, null, false, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f5963a;

        /* renamed from: c, reason: collision with root package name */
        int f5965c;

        e(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5963a = obj;
            this.f5965c |= Integer.MIN_VALUE;
            return d.this.A(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f5966a;

        /* renamed from: c, reason: collision with root package name */
        int f5968c;

        f(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5966a = obj;
            this.f5968c |= Integer.MIN_VALUE;
            Object a8 = d.this.a(null, null, false, false, this);
            if (a8 == T5.b.e()) {
                return a8;
            }
            return s.a(a8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class g extends C3252v implements Function1 {
        g(Object obj) {
            super(1, obj, d.class, "reportFailedLoad", "reportFailedLoad(Ljava/lang/Throwable;)V", 0);
        }

        public final void d(Throwable p02) {
            AbstractC3255y.i(p02, "p0");
            ((d) this.receiver).F(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((Throwable) obj);
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f5969a;

        /* renamed from: b, reason: collision with root package name */
        Object f5970b;

        /* renamed from: c, reason: collision with root package name */
        Object f5971c;

        /* renamed from: d, reason: collision with root package name */
        Object f5972d;

        /* renamed from: e, reason: collision with root package name */
        Object f5973e;

        /* renamed from: f, reason: collision with root package name */
        boolean f5974f;

        /* renamed from: g, reason: collision with root package name */
        int f5975g;

        /* renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f5976h;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f5978j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ u.g f5979k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ u.l f5980l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f5981m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            Object f5982a;

            /* renamed from: b, reason: collision with root package name */
            Object f5983b;

            /* renamed from: c, reason: collision with root package name */
            int f5984c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ d f5985d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ a f5986e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ U f5987f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ U f5988g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, a aVar, U u8, U u9, S5.d dVar2) {
                super(2, dVar2);
                this.f5985d = dVar;
                this.f5986e = aVar;
                this.f5987f = u8;
                this.f5988g = u9;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f5985d, this.f5986e, this.f5987f, this.f5988g, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a aVar;
                d dVar;
                Object e8 = T5.b.e();
                int i8 = this.f5984c;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            t.b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) this.f5983b;
                    dVar = (d) this.f5982a;
                    t.b(obj);
                } else {
                    t.b(obj);
                    d dVar2 = this.f5985d;
                    aVar = this.f5986e;
                    U u8 = this.f5987f;
                    this.f5982a = dVar2;
                    this.f5983b = aVar;
                    this.f5984c = 1;
                    Object D8 = u8.D(this);
                    if (D8 == e8) {
                        return e8;
                    }
                    dVar = dVar2;
                    obj = D8;
                }
                U u9 = this.f5988g;
                this.f5982a = null;
                this.f5983b = null;
                this.f5984c = 2;
                obj = dVar.v(aVar, (C1970d) obj, u9, this);
                if (obj == e8) {
                    return e8;
                }
                return obj;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f5989a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f5990b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ U f5991c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ U f5992d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(d dVar, U u8, U u9, S5.d dVar2) {
                super(2, dVar2);
                this.f5990b = dVar;
                this.f5991c = u8;
                this.f5992d = u9;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new b(this.f5990b, this.f5991c, this.f5992d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f5989a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    d dVar = this.f5990b;
                    U u8 = this.f5991c;
                    U u9 = this.f5992d;
                    this.f5989a = 1;
                    obj = dVar.J(u8, u9, this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                return obj;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f5993a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f5994b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.stripe.android.model.j f5995c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ u.g f5996d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ a f5997e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(d dVar, com.stripe.android.model.j jVar, u.g gVar, a aVar, S5.d dVar2) {
                super(2, dVar2);
                this.f5994b = dVar;
                this.f5995c = jVar;
                this.f5996d = gVar;
                this.f5997e = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new c(this.f5994b, this.f5995c, this.f5996d, this.f5997e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f5993a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    d dVar = this.f5994b;
                    com.stripe.android.model.j jVar = this.f5995c;
                    u.g gVar = this.f5996d;
                    a aVar = this.f5997e;
                    this.f5993a = 1;
                    obj = dVar.y(jVar, gVar, aVar, this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                return obj;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: L3.d$h$d, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0105d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f5998a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ U f5999b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ d f6000c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ u.g f6001d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ com.stripe.android.model.j f6002e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f6003f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0105d(U u8, d dVar, u.g gVar, com.stripe.android.model.j jVar, boolean z8, S5.d dVar2) {
                super(2, dVar2);
                this.f5999b = u8;
                this.f6000c = dVar;
                this.f6001d = gVar;
                this.f6002e = jVar;
                this.f6003f = z8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0105d(this.f5999b, this.f6000c, this.f6001d, this.f6002e, this.f6003f, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f5998a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    U u8 = this.f5999b;
                    this.f5998a = 1;
                    obj = u8.D(this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                return this.f6000c.z(this.f6001d, this.f6002e, (L3.g) obj, this.f6003f);
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0105d) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f6004a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f6005b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ u.g f6006c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f6007d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ com.stripe.android.model.j f6008e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(d dVar, u.g gVar, boolean z8, com.stripe.android.model.j jVar, S5.d dVar2) {
                super(2, dVar2);
                this.f6005b = dVar;
                this.f6006c = gVar;
                this.f6007d = z8;
                this.f6008e = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new e(this.f6005b, this.f6006c, this.f6007d, this.f6008e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f6004a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    d dVar = this.f6005b;
                    u.g gVar = this.f6006c;
                    boolean z8 = this.f6007d;
                    com.stripe.android.model.j jVar = this.f6008e;
                    this.f6004a = 1;
                    obj = dVar.L(gVar, z8, jVar, this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                return obj;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((e) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z8, u.g gVar, u.l lVar, boolean z9, S5.d dVar) {
            super(2, dVar);
            this.f5978j = z8;
            this.f5979k = gVar;
            this.f5980l = lVar;
            this.f5981m = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            h hVar = new h(this.f5978j, this.f5979k, this.f5980l, this.f5981m, dVar);
            hVar.f5976h = obj;
            return hVar;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:12:0x027e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x027f  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x024e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x024f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x022c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x022d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x01f5  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x028f  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x01e0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x01e1  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x015d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x013b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0129  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 704
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: L3.d.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6009a;

        /* renamed from: b, reason: collision with root package name */
        Object f6010b;

        /* renamed from: c, reason: collision with root package name */
        Object f6011c;

        /* renamed from: d, reason: collision with root package name */
        Object f6012d;

        /* renamed from: e, reason: collision with root package name */
        boolean f6013e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f6014f;

        /* renamed from: h, reason: collision with root package name */
        int f6016h;

        i(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6014f = obj;
            this.f6016h |= Integer.MIN_VALUE;
            return d.this.D(null, null, null, null, false, false, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f6017a;

        /* renamed from: c, reason: collision with root package name */
        int f6019c;

        j(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6017a = obj;
            this.f6019c |= Integer.MIN_VALUE;
            return d.this.H(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f6020a;

        /* renamed from: c, reason: collision with root package name */
        int f6022c;

        k(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6020a = obj;
            this.f6022c |= Integer.MIN_VALUE;
            Object I8 = d.this.I(null, null, null, null, this);
            if (I8 == T5.b.e()) {
                return I8;
            }
            return s.a(I8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6023a;

        /* renamed from: b, reason: collision with root package name */
        Object f6024b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f6025c;

        /* renamed from: e, reason: collision with root package name */
        int f6027e;

        l(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6025c = obj;
            this.f6027e |= Integer.MIN_VALUE;
            return d.this.J(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f6028a;

        /* renamed from: c, reason: collision with root package name */
        int f6030c;

        m(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6028a = obj;
            this.f6030c |= Integer.MIN_VALUE;
            return d.this.K(null, this);
        }
    }

    public d(Function1 prefsRepositoryFactory, Function1 googlePayRepositoryFactory, K3.e elementsSessionRepository, K3.c customerRepository, C1622d lpmRepository, InterfaceC4057d logger, EventReporter eventReporter, n3.i errorReporter, S5.g workContext, L3.f accountStatusProvider, O2.d linkStore, C2922c0 externalPaymentMethodsRepository, D2.h userFacingLogger) {
        AbstractC3255y.i(prefsRepositoryFactory, "prefsRepositoryFactory");
        AbstractC3255y.i(googlePayRepositoryFactory, "googlePayRepositoryFactory");
        AbstractC3255y.i(elementsSessionRepository, "elementsSessionRepository");
        AbstractC3255y.i(customerRepository, "customerRepository");
        AbstractC3255y.i(lpmRepository, "lpmRepository");
        AbstractC3255y.i(logger, "logger");
        AbstractC3255y.i(eventReporter, "eventReporter");
        AbstractC3255y.i(errorReporter, "errorReporter");
        AbstractC3255y.i(workContext, "workContext");
        AbstractC3255y.i(accountStatusProvider, "accountStatusProvider");
        AbstractC3255y.i(linkStore, "linkStore");
        AbstractC3255y.i(externalPaymentMethodsRepository, "externalPaymentMethodsRepository");
        AbstractC3255y.i(userFacingLogger, "userFacingLogger");
        this.f5923a = prefsRepositoryFactory;
        this.f5924b = googlePayRepositoryFactory;
        this.f5925c = elementsSessionRepository;
        this.f5926d = customerRepository;
        this.f5927e = lpmRepository;
        this.f5928f = logger;
        this.f5929g = eventReporter;
        this.f5930h = errorReporter;
        this.f5931i = workContext;
        this.f5932j = accountStatusProvider;
        this.f5933k = linkStore;
        this.f5934l = externalPaymentMethodsRepository;
        this.f5935m = userFacingLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(com.stripe.android.paymentsheet.u.g r6, S5.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof L3.d.e
            if (r0 == 0) goto L13
            r0 = r7
            L3.d$e r0 = (L3.d.e) r0
            int r1 = r0.f5965c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5965c = r1
            goto L18
        L13:
            L3.d$e r0 = new L3.d$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f5963a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f5965c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            O5.t.b(r7)
            goto L72
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            O5.t.b(r7)
            com.stripe.android.paymentsheet.u$k r6 = r6.u()
            if (r6 == 0) goto L7b
            com.stripe.android.paymentsheet.u$k$c r6 = r6.h()
            if (r6 == 0) goto L7b
            kotlin.jvm.functions.Function1 r7 = r5.f5924b
            int[] r2 = L3.d.b.f5945b
            int r6 = r6.ordinal()
            r6 = r2[r6]
            if (r6 == r4) goto L59
            r2 = 2
            if (r6 != r2) goto L53
            L2.d r6 = L2.d.f5906c
            goto L5b
        L53:
            O5.p r6 = new O5.p
            r6.<init>()
            throw r6
        L59:
            L2.d r6 = L2.d.f5905b
        L5b:
            java.lang.Object r6 = r7.invoke(r6)
            L2.g r6 = (L2.g) r6
            if (r6 == 0) goto L7b
            o6.f r6 = r6.isReady()
            if (r6 == 0) goto L7b
            r0.f5965c = r4
            java.lang.Object r7 = o6.AbstractC3708h.w(r6, r0)
            if (r7 != r1) goto L72
            return r1
        L72:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            if (r6 == 0) goto L7b
            r3 = 1
        L7b:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.d.A(com.stripe.android.paymentsheet.u$g, S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B(u.g gVar, com.stripe.android.model.j jVar, S5.d dVar) {
        if (jVar.x()) {
            return A(gVar, dVar);
        }
        return kotlin.coroutines.jvm.internal.b.a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C(S5.d dVar) {
        return AbstractC3708h.w(((L2.g) this.f5924b.invoke(L2.d.f5905b)).isReady(), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(com.stripe.android.paymentsheet.u.g r17, L3.d.a r18, com.stripe.android.model.j r19, java.lang.String r20, boolean r21, boolean r22, java.util.Map r23, S5.d r24) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.d.D(com.stripe.android.paymentsheet.u$g, L3.d$a, com.stripe.android.model.j, java.lang.String, boolean, boolean, java.util.Map, S5.d):java.lang.Object");
    }

    private final void E(List list, List list2) {
        ArrayList arrayList;
        List list3 = list;
        if (list3 != null && !list3.isEmpty()) {
            if (list2 != null) {
                List list4 = list2;
                arrayList = new ArrayList(AbstractC1378t.x(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C2920b0) it.next()).getType());
                }
            } else {
                arrayList = null;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (arrayList == null || !arrayList.contains(str)) {
                    this.f5935m.a("Requested external payment method " + str + " is not supported. View all available external payment methods here: https://docs.stripe.com/payments/external-payment-methods?platform=android#available-external-payment-methods");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(Throwable th) {
        this.f5928f.a("Failure loading PaymentSheetState", th);
        this.f5929g.r(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(com.stripe.android.model.j jVar, L3.l lVar, boolean z8, boolean z9, u.l lVar2) {
        boolean z10;
        Throwable u8 = jVar.u();
        if (u8 != null) {
            this.f5929g.n(u8);
        }
        if (lVar.p().L() && !z8) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (lVar.s() != null && z10) {
            this.f5929g.r(lVar.s());
            return;
        }
        EventReporter eventReporter = this.f5929g;
        y i8 = jVar.i();
        String a8 = B3.c.a(jVar.v());
        B3.f i9 = lVar.i();
        List e02 = lVar.h().e0();
        ArrayList arrayList = new ArrayList(AbstractC1378t.x(e02, 10));
        Iterator it = e02.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1625g) it.next()).d());
        }
        eventReporter.m(i9, i8, z9, a8, lVar2, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(b3.C1970d r7, com.stripe.android.paymentsheet.u.i r8, S5.d r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof L3.d.j
            if (r0 == 0) goto L13
            r0 = r9
            L3.d$j r0 = (L3.d.j) r0
            int r1 = r0.f6019c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6019c = r1
            goto L18
        L13:
            L3.d$j r0 = new L3.d$j
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f6017a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f6019c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            O5.t.b(r9)
            O5.s r9 = (O5.s) r9
            java.lang.Object r7 = r9.j()
            goto L5e
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            O5.t.b(r9)
            java.util.List r9 = r7.i0()
            K3.c r2 = r6.f5926d
            K3.c$a r4 = new K3.c$a
            java.lang.String r5 = r8.getId()
            java.lang.String r8 = r8.b()
            r4.<init>(r5, r8)
            com.stripe.android.model.StripeIntent r7 = r7.W()
            boolean r7 = r7.c()
            r0.f6019c = r3
            java.lang.Object r7 = r2.d(r4, r9, r7, r0)
            if (r7 != r1) goto L5e
            return r1
        L5e:
            O5.t.b(r7)
            java.util.List r7 = (java.util.List) r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L6e:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L85
            java.lang.Object r9 = r7.next()
            r0 = r9
            com.stripe.android.model.o r0 = (com.stripe.android.model.o) r0
            boolean r0 = r0.a()
            if (r0 == 0) goto L6e
            r8.add(r9)
            goto L6e
        L85:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.d.H(b3.d, com.stripe.android.paymentsheet.u$i, S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(com.stripe.android.paymentsheet.u.l r8, com.stripe.android.paymentsheet.u.i r9, java.util.List r10, java.lang.String r11, S5.d r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof L3.d.k
            if (r0 == 0) goto L14
            r0 = r12
            L3.d$k r0 = (L3.d.k) r0
            int r1 = r0.f6022c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f6022c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            L3.d$k r0 = new L3.d$k
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f6020a
            java.lang.Object r0 = T5.b.e()
            int r1 = r6.f6022c
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            O5.t.b(r12)
            O5.s r12 = (O5.s) r12
            java.lang.Object r8 = r12.j()
            goto L4b
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            O5.t.b(r12)
            K3.e r1 = r7.f5925c
            r6.f6022c = r2
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.Object r8 = r1.a(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L4b
            return r0
        L4b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.d.I(com.stripe.android.paymentsheet.u$l, com.stripe.android.paymentsheet.u$i, java.util.List, java.lang.String, S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(l6.U r8, l6.U r9, S5.d r10) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.d.J(l6.U, l6.U, S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(com.stripe.android.paymentsheet.u.g r6, S5.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof L3.d.m
            if (r0 == 0) goto L13
            r0 = r7
            L3.d$m r0 = (L3.d.m) r0
            int r1 = r0.f6030c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6030c = r1
            goto L18
        L13:
            L3.d$m r0 = new L3.d$m
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f6028a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f6030c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            O5.t.b(r7)
            goto L4f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            O5.t.b(r7)
            com.stripe.android.paymentsheet.u$i r7 = r6.l()
            if (r7 == 0) goto L40
            com.stripe.android.paymentsheet.u$h r7 = r7.a()
            goto L41
        L40:
            r7 = r4
        L41:
            boolean r2 = r7 instanceof com.stripe.android.paymentsheet.u.h.a
            if (r2 == 0) goto L57
            r0.f6030c = r3
            r7 = 0
            java.lang.Object r7 = r5.M(r6, r7, r7, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            boolean r6 = r7 instanceof B3.i.d
            if (r6 == 0) goto L5e
            r4 = r7
            B3.i$d r4 = (B3.i.d) r4
            goto L5e
        L57:
            boolean r6 = r7 instanceof com.stripe.android.paymentsheet.u.h.b
            if (r6 == 0) goto L5c
            goto L5e
        L5c:
            if (r7 != 0) goto L5f
        L5e:
            return r4
        L5f:
            O5.p r6 = new O5.p
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.d.K(com.stripe.android.paymentsheet.u$g, S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object L(u.g gVar, boolean z8, com.stripe.android.model.j jVar, S5.d dVar) {
        return M(gVar, z8, jVar.y(), dVar);
    }

    private final Object M(u.g gVar, boolean z8, boolean z9, S5.d dVar) {
        return ((q) this.f5923a.invoke(gVar.l())).b(z8, z9, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean N(C1970d c1970d) {
        return !c1970d.h0().isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(StripeIntent stripeIntent) {
        if (stripeIntent.F().isEmpty()) {
            return;
        }
        this.f5928f.c("[Stripe SDK] Warning: Your Intent contains the following payment method types which are activated for test mode but not activated for live mode: " + stripeIntent.F() + ". These payment method types will not be displayed in live mode until they are activated. To activate these payment method types visit your Stripe dashboard.More information: https://support.stripe.com/questions/activate-a-new-payment-method");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a u(u.g gVar, com.stripe.android.model.j jVar) {
        u.h hVar;
        u.i l8 = gVar.l();
        if (l8 != null) {
            hVar = l8.a();
        } else {
            hVar = null;
        }
        if (hVar instanceof u.h.a) {
            j.c a8 = jVar.a();
            if (a8 != null) {
                return new a.C0103a(a8);
            }
            IllegalStateException illegalStateException = new IllegalStateException("Excepted 'customer' attribute as part of 'elements_session' response!");
            i.b.a(this.f5930h, i.f.f35429m, AbstractC4144k.f40356e.b(illegalStateException), null, 4, null);
            if (jVar.v().c()) {
                return null;
            }
            throw illegalStateException;
        }
        if (!(hVar instanceof u.h.b)) {
            return null;
        }
        return new a.b(l8, (u.h.b) hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(L3.d.a r10, b3.C1970d r11, l6.U r12, S5.d r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof L3.d.c
            if (r0 == 0) goto L13
            r0 = r13
            L3.d$c r0 = (L3.d.c) r0
            int r1 = r0.f5952g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5952g = r1
            goto L18
        L13:
            L3.d$c r0 = new L3.d$c
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f5950e
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f5952g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L53
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r10 = r0.f5947b
            L3.a r10 = (L3.a) r10
            java.lang.Object r11 = r0.f5946a
            java.util.List r11 = (java.util.List) r11
            O5.t.b(r13)
        L34:
            r2 = r10
            goto Lb5
        L37:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3f:
            java.lang.Object r10 = r0.f5949d
            com.stripe.android.paymentsheet.u$h$b r10 = (com.stripe.android.paymentsheet.u.h.b) r10
            java.lang.Object r11 = r0.f5948c
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r0.f5947b
            L3.a$a r12 = (L3.a.C0101a) r12
            java.lang.Object r2 = r0.f5946a
            l6.U r2 = (l6.U) r2
            O5.t.b(r13)
            goto L95
        L53:
            O5.t.b(r13)
            boolean r13 = r10 instanceof L3.d.a.C0103a
            if (r13 == 0) goto L6b
            L3.a$a r13 = L3.a.f5913e
            L3.d$a$a r10 = (L3.d.a.C0103a) r10
            com.stripe.android.model.j$c r10 = r10.b()
            java.util.List r11 = r11.i0()
            L3.a r10 = r13.a(r10, r11)
            goto L9e
        L6b:
            boolean r13 = r10 instanceof L3.d.a.b
            if (r13 == 0) goto L9d
            L3.a$a r13 = L3.a.f5913e
            L3.d$a$b r10 = (L3.d.a.b) r10
            java.lang.String r2 = r10.getId()
            com.stripe.android.paymentsheet.u$h$b r6 = r10.b()
            com.stripe.android.paymentsheet.u$i r10 = r10.c()
            r0.f5946a = r12
            r0.f5947b = r13
            r0.f5948c = r2
            r0.f5949d = r6
            r0.f5952g = r4
            java.lang.Object r10 = r9.H(r11, r10, r0)
            if (r10 != r1) goto L90
            return r1
        L90:
            r11 = r2
            r2 = r12
            r12 = r13
            r13 = r10
            r10 = r6
        L95:
            java.util.List r13 = (java.util.List) r13
            L3.a r10 = r12.b(r11, r10, r13)
            r12 = r2
            goto L9e
        L9d:
            r10 = r5
        L9e:
            if (r10 == 0) goto Lc5
            java.util.List r11 = r10.h()
            r0.f5946a = r11
            r0.f5947b = r10
            r0.f5948c = r5
            r0.f5949d = r5
            r0.f5952g = r3
            java.lang.Object r13 = r12.D(r0)
            if (r13 != r1) goto L34
            return r1
        Lb5:
            B3.i r13 = (B3.i) r13
            java.util.List r5 = L3.i.b(r11, r13)
            r7 = 11
            r8 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            L3.a r5 = L3.a.b(r2, r3, r4, r5, r6, r7, r8)
        Lc5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.d.v(L3.d$a, b3.d, l6.U, S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(com.stripe.android.paymentsheet.u.g r20, L3.d.a r21, com.stripe.android.model.j r22, java.lang.String r23, boolean r24, java.util.Map r25, S5.d r26) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.d.w(com.stripe.android.paymentsheet.u$g, L3.d$a, com.stripe.android.model.j, java.lang.String, boolean, java.util.Map, S5.d):java.lang.Object");
    }

    private final d3.b x(L3.g gVar) {
        W2.k b8;
        if (gVar == null || (b8 = gVar.b()) == null) {
            return null;
        }
        return new d3.b(b8, gVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y(com.stripe.android.model.j jVar, u.g gVar, a aVar, S5.d dVar) {
        if (jVar.y() && !gVar.i().g()) {
            Object D8 = D(gVar, aVar, jVar, jVar.p(), jVar.l(), jVar.b(), jVar.h(), dVar);
            if (D8 == T5.b.e()) {
                return D8;
            }
            return (L3.g) D8;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1970d z(u.g gVar, com.stripe.android.model.j jVar, L3.g gVar2, boolean z8) {
        C1622d.a b8 = this.f5927e.b(jVar.v(), jVar.s());
        if (b8.b()) {
            this.f5929g.s(b8.a());
        }
        List a8 = this.f5934l.a(jVar.g());
        E(gVar.s(), a8);
        return C1970d.f15316q.b(jVar, gVar, b8.c(), a8, z8, x(gVar2));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // L3.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.stripe.android.paymentsheet.u.l r15, com.stripe.android.paymentsheet.u.g r16, boolean r17, boolean r18, S5.d r19) {
        /*
            r14 = this;
            r7 = r14
            r0 = r19
            boolean r1 = r0 instanceof L3.d.f
            if (r1 == 0) goto L17
            r1 = r0
            L3.d$f r1 = (L3.d.f) r1
            int r2 = r1.f5968c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f5968c = r2
        L15:
            r8 = r1
            goto L1d
        L17:
            L3.d$f r1 = new L3.d$f
            r1.<init>(r0)
            goto L15
        L1d:
            java.lang.Object r0 = r8.f5966a
            java.lang.Object r9 = T5.b.e()
            int r1 = r8.f5968c
            r10 = 1
            if (r1 == 0) goto L3c
            if (r1 != r10) goto L34
            O5.t.b(r0)
            O5.s r0 = (O5.s) r0
            java.lang.Object r0 = r0.j()
            goto L5e
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3c:
            O5.t.b(r0)
            S5.g r11 = r7.f5931i
            L3.d$g r12 = new L3.d$g
            r12.<init>(r14)
            L3.d$h r13 = new L3.d$h
            r6 = 0
            r0 = r13
            r1 = r14
            r2 = r18
            r3 = r16
            r4 = r15
            r5 = r17
            r0.<init>(r2, r3, r4, r5, r6)
            r8.f5968c = r10
            java.lang.Object r0 = r2.AbstractC3916a.a(r11, r12, r13, r8)
            if (r0 != r9) goto L5e
            return r9
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.d.a(com.stripe.android.paymentsheet.u$l, com.stripe.android.paymentsheet.u$g, boolean, boolean, S5.d):java.lang.Object");
    }
}
