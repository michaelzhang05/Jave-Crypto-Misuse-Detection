package I3;

import L5.I;
import L5.s;
import L5.t;
import M5.AbstractC1246t;
import X2.d;
import b3.y;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.j;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.u;
import e4.C2600b0;
import e4.C2602c0;
import i6.M;
import i6.U;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k3.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.C3156v;
import l6.AbstractC3360h;
import q3.q;
import r2.InterfaceC3684d;
import t2.AbstractC3790k;
import y3.AbstractC3988c;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public final class d implements I3.h {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f3928a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f3929b;

    /* renamed from: c, reason: collision with root package name */
    private final H3.e f3930c;

    /* renamed from: d, reason: collision with root package name */
    private final H3.c f3931d;

    /* renamed from: e, reason: collision with root package name */
    private final X2.d f3932e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3684d f3933f;

    /* renamed from: g, reason: collision with root package name */
    private final EventReporter f3934g;

    /* renamed from: h, reason: collision with root package name */
    private final k3.i f3935h;

    /* renamed from: i, reason: collision with root package name */
    private final P5.g f3936i;

    /* renamed from: j, reason: collision with root package name */
    private final I3.f f3937j;

    /* renamed from: k, reason: collision with root package name */
    private final L2.d f3938k;

    /* renamed from: l, reason: collision with root package name */
    private final C2602c0 f3939l;

    /* renamed from: m, reason: collision with root package name */
    private final A2.h f3940m;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public interface a {

        /* renamed from: I3.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0060a implements a {

            /* renamed from: d, reason: collision with root package name */
            public static final int f3941d = j.c.f24281d;

            /* renamed from: a, reason: collision with root package name */
            private final j.c f3942a;

            /* renamed from: b, reason: collision with root package name */
            private final String f3943b;

            /* renamed from: c, reason: collision with root package name */
            private final String f3944c;

            public C0060a(j.c elementsSessionCustomer) {
                AbstractC3159y.i(elementsSessionCustomer, "elementsSessionCustomer");
                this.f3942a = elementsSessionCustomer;
                this.f3943b = elementsSessionCustomer.c().e();
                this.f3944c = elementsSessionCustomer.c().b();
            }

            @Override // I3.d.a
            public String a() {
                return this.f3944c;
            }

            public final j.c b() {
                return this.f3942a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0060a) && AbstractC3159y.d(this.f3942a, ((C0060a) obj).f3942a)) {
                    return true;
                }
                return false;
            }

            @Override // I3.d.a
            public String getId() {
                return this.f3943b;
            }

            public int hashCode() {
                return this.f3942a.hashCode();
            }

            public String toString() {
                return "CustomerSession(elementsSessionCustomer=" + this.f3942a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            private final u.i f3945a;

            /* renamed from: b, reason: collision with root package name */
            private final u.h.b f3946b;

            /* renamed from: c, reason: collision with root package name */
            private final String f3947c;

            /* renamed from: d, reason: collision with root package name */
            private final String f3948d;

            public b(u.i customerConfig, u.h.b accessType) {
                AbstractC3159y.i(customerConfig, "customerConfig");
                AbstractC3159y.i(accessType, "accessType");
                this.f3945a = customerConfig;
                this.f3946b = accessType;
                this.f3947c = customerConfig.getId();
                this.f3948d = accessType.b();
            }

            @Override // I3.d.a
            public String a() {
                return this.f3948d;
            }

            public final u.h.b b() {
                return this.f3946b;
            }

            public final u.i c() {
                return this.f3945a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                if (AbstractC3159y.d(this.f3945a, bVar.f3945a) && AbstractC3159y.d(this.f3946b, bVar.f3946b)) {
                    return true;
                }
                return false;
            }

            @Override // I3.d.a
            public String getId() {
                return this.f3947c;
            }

            public int hashCode() {
                return (this.f3945a.hashCode() * 31) + this.f3946b.hashCode();
            }

            public String toString() {
                return "Legacy(customerConfig=" + this.f3945a + ", accessType=" + this.f3946b + ")";
            }
        }

        String a();

        String getId();
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3949a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f3950b;

        static {
            int[] iArr = new int[O2.a.values().length];
            try {
                iArr[O2.a.f7760a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[O2.a.f7761b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[O2.a.f7762c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[O2.a.f7763d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[O2.a.f7764e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f3949a = iArr;
            int[] iArr2 = new int[u.k.c.values().length];
            try {
                iArr2[u.k.c.f26462a.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[u.k.c.f26463b.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f3950b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f3951a;

        /* renamed from: b, reason: collision with root package name */
        Object f3952b;

        /* renamed from: c, reason: collision with root package name */
        Object f3953c;

        /* renamed from: d, reason: collision with root package name */
        Object f3954d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f3955e;

        /* renamed from: g, reason: collision with root package name */
        int f3957g;

        c(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3955e = obj;
            this.f3957g |= Integer.MIN_VALUE;
            return d.this.v(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I3.d$d, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0061d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f3958a;

        /* renamed from: b, reason: collision with root package name */
        Object f3959b;

        /* renamed from: c, reason: collision with root package name */
        Object f3960c;

        /* renamed from: d, reason: collision with root package name */
        Object f3961d;

        /* renamed from: e, reason: collision with root package name */
        Object f3962e;

        /* renamed from: f, reason: collision with root package name */
        Object f3963f;

        /* renamed from: g, reason: collision with root package name */
        boolean f3964g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f3965h;

        /* renamed from: j, reason: collision with root package name */
        int f3967j;

        C0061d(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3965h = obj;
            this.f3967j |= Integer.MIN_VALUE;
            return d.this.w(null, null, null, null, false, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f3968a;

        /* renamed from: c, reason: collision with root package name */
        int f3970c;

        e(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3968a = obj;
            this.f3970c |= Integer.MIN_VALUE;
            return d.this.A(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f3971a;

        /* renamed from: c, reason: collision with root package name */
        int f3973c;

        f(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3971a = obj;
            this.f3973c |= Integer.MIN_VALUE;
            Object a8 = d.this.a(null, null, false, false, this);
            if (a8 == Q5.b.e()) {
                return a8;
            }
            return s.a(a8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class g extends C3156v implements Function1 {
        g(Object obj) {
            super(1, obj, d.class, "reportFailedLoad", "reportFailedLoad(Ljava/lang/Throwable;)V", 0);
        }

        public final void d(Throwable p02) {
            AbstractC3159y.i(p02, "p0");
            ((d) this.receiver).F(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((Throwable) obj);
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f3974a;

        /* renamed from: b, reason: collision with root package name */
        Object f3975b;

        /* renamed from: c, reason: collision with root package name */
        Object f3976c;

        /* renamed from: d, reason: collision with root package name */
        Object f3977d;

        /* renamed from: e, reason: collision with root package name */
        Object f3978e;

        /* renamed from: f, reason: collision with root package name */
        boolean f3979f;

        /* renamed from: g, reason: collision with root package name */
        int f3980g;

        /* renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f3981h;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f3983j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ u.g f3984k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ u.l f3985l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f3986m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            Object f3987a;

            /* renamed from: b, reason: collision with root package name */
            Object f3988b;

            /* renamed from: c, reason: collision with root package name */
            int f3989c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ d f3990d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ a f3991e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ U f3992f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ U f3993g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, a aVar, U u8, U u9, P5.d dVar2) {
                super(2, dVar2);
                this.f3990d = dVar;
                this.f3991e = aVar;
                this.f3992f = u8;
                this.f3993g = u9;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f3990d, this.f3991e, this.f3992f, this.f3993g, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a aVar;
                d dVar;
                Object e8 = Q5.b.e();
                int i8 = this.f3989c;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            t.b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) this.f3988b;
                    dVar = (d) this.f3987a;
                    t.b(obj);
                } else {
                    t.b(obj);
                    d dVar2 = this.f3990d;
                    aVar = this.f3991e;
                    U u8 = this.f3992f;
                    this.f3987a = dVar2;
                    this.f3988b = aVar;
                    this.f3989c = 1;
                    Object g8 = u8.g(this);
                    if (g8 == e8) {
                        return e8;
                    }
                    dVar = dVar2;
                    obj = g8;
                }
                U u9 = this.f3993g;
                this.f3987a = null;
                this.f3988b = null;
                this.f3989c = 2;
                obj = dVar.v(aVar, (Y2.d) obj, u9, this);
                if (obj == e8) {
                    return e8;
                }
                return obj;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f3994a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f3995b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ U f3996c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ U f3997d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(d dVar, U u8, U u9, P5.d dVar2) {
                super(2, dVar2);
                this.f3995b = dVar;
                this.f3996c = u8;
                this.f3997d = u9;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new b(this.f3995b, this.f3996c, this.f3997d, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f3994a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    d dVar = this.f3995b;
                    U u8 = this.f3996c;
                    U u9 = this.f3997d;
                    this.f3994a = 1;
                    obj = dVar.J(u8, u9, this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                return obj;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f3998a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f3999b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.stripe.android.model.j f4000c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ u.g f4001d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ a f4002e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(d dVar, com.stripe.android.model.j jVar, u.g gVar, a aVar, P5.d dVar2) {
                super(2, dVar2);
                this.f3999b = dVar;
                this.f4000c = jVar;
                this.f4001d = gVar;
                this.f4002e = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new c(this.f3999b, this.f4000c, this.f4001d, this.f4002e, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f3998a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    d dVar = this.f3999b;
                    com.stripe.android.model.j jVar = this.f4000c;
                    u.g gVar = this.f4001d;
                    a aVar = this.f4002e;
                    this.f3998a = 1;
                    obj = dVar.y(jVar, gVar, aVar, this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                return obj;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: I3.d$h$d, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0062d extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f4003a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ U f4004b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ d f4005c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ u.g f4006d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ com.stripe.android.model.j f4007e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f4008f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0062d(U u8, d dVar, u.g gVar, com.stripe.android.model.j jVar, boolean z8, P5.d dVar2) {
                super(2, dVar2);
                this.f4004b = u8;
                this.f4005c = dVar;
                this.f4006d = gVar;
                this.f4007e = jVar;
                this.f4008f = z8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0062d(this.f4004b, this.f4005c, this.f4006d, this.f4007e, this.f4008f, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((C0062d) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f4003a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    U u8 = this.f4004b;
                    this.f4003a = 1;
                    obj = u8.g(this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                return this.f4005c.z(this.f4006d, this.f4007e, (I3.g) obj, this.f4008f);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f4009a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f4010b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ u.g f4011c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f4012d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ com.stripe.android.model.j f4013e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(d dVar, u.g gVar, boolean z8, com.stripe.android.model.j jVar, P5.d dVar2) {
                super(2, dVar2);
                this.f4010b = dVar;
                this.f4011c = gVar;
                this.f4012d = z8;
                this.f4013e = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new e(this.f4010b, this.f4011c, this.f4012d, this.f4013e, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((e) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f4009a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    d dVar = this.f4010b;
                    u.g gVar = this.f4011c;
                    boolean z8 = this.f4012d;
                    com.stripe.android.model.j jVar = this.f4013e;
                    this.f4009a = 1;
                    obj = dVar.L(gVar, z8, jVar, this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z8, u.g gVar, u.l lVar, boolean z9, P5.d dVar) {
            super(2, dVar);
            this.f3983j = z8;
            this.f3984k = gVar;
            this.f3985l = lVar;
            this.f3986m = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            h hVar = new h(this.f3983j, this.f3984k, this.f3985l, this.f3986m, dVar);
            hVar.f3981h = obj;
            return hVar;
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(I.f6487a);
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
            throw new UnsupportedOperationException("Method not decompiled: I3.d.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f4014a;

        /* renamed from: b, reason: collision with root package name */
        Object f4015b;

        /* renamed from: c, reason: collision with root package name */
        Object f4016c;

        /* renamed from: d, reason: collision with root package name */
        Object f4017d;

        /* renamed from: e, reason: collision with root package name */
        boolean f4018e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f4019f;

        /* renamed from: h, reason: collision with root package name */
        int f4021h;

        i(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4019f = obj;
            this.f4021h |= Integer.MIN_VALUE;
            return d.this.D(null, null, null, null, false, false, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f4022a;

        /* renamed from: c, reason: collision with root package name */
        int f4024c;

        j(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4022a = obj;
            this.f4024c |= Integer.MIN_VALUE;
            return d.this.H(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f4025a;

        /* renamed from: c, reason: collision with root package name */
        int f4027c;

        k(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4025a = obj;
            this.f4027c |= Integer.MIN_VALUE;
            Object I8 = d.this.I(null, null, null, null, this);
            if (I8 == Q5.b.e()) {
                return I8;
            }
            return s.a(I8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f4028a;

        /* renamed from: b, reason: collision with root package name */
        Object f4029b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f4030c;

        /* renamed from: e, reason: collision with root package name */
        int f4032e;

        l(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4030c = obj;
            this.f4032e |= Integer.MIN_VALUE;
            return d.this.J(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f4033a;

        /* renamed from: c, reason: collision with root package name */
        int f4035c;

        m(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4033a = obj;
            this.f4035c |= Integer.MIN_VALUE;
            return d.this.K(null, this);
        }
    }

    public d(Function1 prefsRepositoryFactory, Function1 googlePayRepositoryFactory, H3.e elementsSessionRepository, H3.c customerRepository, X2.d lpmRepository, InterfaceC3684d logger, EventReporter eventReporter, k3.i errorReporter, P5.g workContext, I3.f accountStatusProvider, L2.d linkStore, C2602c0 externalPaymentMethodsRepository, A2.h userFacingLogger) {
        AbstractC3159y.i(prefsRepositoryFactory, "prefsRepositoryFactory");
        AbstractC3159y.i(googlePayRepositoryFactory, "googlePayRepositoryFactory");
        AbstractC3159y.i(elementsSessionRepository, "elementsSessionRepository");
        AbstractC3159y.i(customerRepository, "customerRepository");
        AbstractC3159y.i(lpmRepository, "lpmRepository");
        AbstractC3159y.i(logger, "logger");
        AbstractC3159y.i(eventReporter, "eventReporter");
        AbstractC3159y.i(errorReporter, "errorReporter");
        AbstractC3159y.i(workContext, "workContext");
        AbstractC3159y.i(accountStatusProvider, "accountStatusProvider");
        AbstractC3159y.i(linkStore, "linkStore");
        AbstractC3159y.i(externalPaymentMethodsRepository, "externalPaymentMethodsRepository");
        AbstractC3159y.i(userFacingLogger, "userFacingLogger");
        this.f3928a = prefsRepositoryFactory;
        this.f3929b = googlePayRepositoryFactory;
        this.f3930c = elementsSessionRepository;
        this.f3931d = customerRepository;
        this.f3932e = lpmRepository;
        this.f3933f = logger;
        this.f3934g = eventReporter;
        this.f3935h = errorReporter;
        this.f3936i = workContext;
        this.f3937j = accountStatusProvider;
        this.f3938k = linkStore;
        this.f3939l = externalPaymentMethodsRepository;
        this.f3940m = userFacingLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(com.stripe.android.paymentsheet.u.g r6, P5.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof I3.d.e
            if (r0 == 0) goto L13
            r0 = r7
            I3.d$e r0 = (I3.d.e) r0
            int r1 = r0.f3970c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3970c = r1
            goto L18
        L13:
            I3.d$e r0 = new I3.d$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f3968a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f3970c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            L5.t.b(r7)
            goto L72
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            L5.t.b(r7)
            com.stripe.android.paymentsheet.u$k r6 = r6.o()
            if (r6 == 0) goto L7b
            com.stripe.android.paymentsheet.u$k$c r6 = r6.f()
            if (r6 == 0) goto L7b
            kotlin.jvm.functions.Function1 r7 = r5.f3929b
            int[] r2 = I3.d.b.f3950b
            int r6 = r6.ordinal()
            r6 = r2[r6]
            if (r6 == r4) goto L59
            r2 = 2
            if (r6 != r2) goto L53
            I2.d r6 = I2.d.f3911c
            goto L5b
        L53:
            L5.p r6 = new L5.p
            r6.<init>()
            throw r6
        L59:
            I2.d r6 = I2.d.f3910b
        L5b:
            java.lang.Object r6 = r7.invoke(r6)
            I2.g r6 = (I2.g) r6
            if (r6 == 0) goto L7b
            l6.f r6 = r6.isReady()
            if (r6 == 0) goto L7b
            r0.f3970c = r4
            java.lang.Object r7 = l6.AbstractC3360h.u(r6, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: I3.d.A(com.stripe.android.paymentsheet.u$g, P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B(u.g gVar, com.stripe.android.model.j jVar, P5.d dVar) {
        if (jVar.z()) {
            return A(gVar, dVar);
        }
        return kotlin.coroutines.jvm.internal.b.a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C(P5.d dVar) {
        return AbstractC3360h.u(((I2.g) this.f3929b.invoke(I2.d.f3910b)).isReady(), dVar);
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
    public final java.lang.Object D(com.stripe.android.paymentsheet.u.g r17, I3.d.a r18, com.stripe.android.model.j r19, java.lang.String r20, boolean r21, boolean r22, java.util.Map r23, P5.d r24) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.d.D(com.stripe.android.paymentsheet.u$g, I3.d$a, com.stripe.android.model.j, java.lang.String, boolean, boolean, java.util.Map, P5.d):java.lang.Object");
    }

    private final void E(List list, List list2) {
        ArrayList arrayList;
        List list3 = list;
        if (list3 != null && !list3.isEmpty()) {
            if (list2 != null) {
                List list4 = list2;
                arrayList = new ArrayList(AbstractC1246t.x(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C2600b0) it.next()).getType());
                }
            } else {
                arrayList = null;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (arrayList == null || !arrayList.contains(str)) {
                    this.f3940m.a("Requested external payment method " + str + " is not supported. View all available external payment methods here: https://docs.stripe.com/payments/external-payment-methods?platform=android#available-external-payment-methods");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(Throwable th) {
        this.f3933f.a("Failure loading PaymentSheetState", th);
        this.f3934g.p(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(com.stripe.android.model.j jVar, I3.l lVar, boolean z8, boolean z9, u.l lVar2) {
        boolean z10;
        Throwable o8 = jVar.o();
        if (o8 != null) {
            this.f3934g.n(o8);
        }
        if (lVar.k().J() && !z8) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (lVar.n() != null && z10) {
            this.f3934g.p(lVar.n());
            return;
        }
        EventReporter eventReporter = this.f3934g;
        y i8 = jVar.i();
        String a8 = AbstractC3988c.a(jVar.s());
        AbstractC3991f i9 = lVar.i();
        List e02 = lVar.f().e0();
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(e02, 10));
        Iterator it = e02.iterator();
        while (it.hasNext()) {
            arrayList.add(((X2.g) it.next()).d());
        }
        eventReporter.t(i9, i8, z9, a8, lVar2, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(Y2.d r7, com.stripe.android.paymentsheet.u.i r8, P5.d r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof I3.d.j
            if (r0 == 0) goto L13
            r0 = r9
            I3.d$j r0 = (I3.d.j) r0
            int r1 = r0.f4024c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4024c = r1
            goto L18
        L13:
            I3.d$j r0 = new I3.d$j
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f4022a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f4024c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r9)
            L5.s r9 = (L5.s) r9
            java.lang.Object r7 = r9.k()
            goto L5e
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            L5.t.b(r9)
            java.util.List r9 = r7.i0()
            H3.c r2 = r6.f3931d
            H3.c$a r4 = new H3.c$a
            java.lang.String r5 = r8.getId()
            java.lang.String r8 = r8.c()
            r4.<init>(r5, r8)
            com.stripe.android.model.StripeIntent r7 = r7.V()
            boolean r7 = r7.a()
            r0.f4024c = r3
            java.lang.Object r7 = r2.c(r4, r9, r7, r0)
            if (r7 != r1) goto L5e
            return r1
        L5e:
            L5.t.b(r7)
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
            boolean r0 = r0.b()
            if (r0 == 0) goto L6e
            r8.add(r9)
            goto L6e
        L85:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.d.H(Y2.d, com.stripe.android.paymentsheet.u$i, P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(com.stripe.android.paymentsheet.u.l r8, com.stripe.android.paymentsheet.u.i r9, java.util.List r10, java.lang.String r11, P5.d r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof I3.d.k
            if (r0 == 0) goto L14
            r0 = r12
            I3.d$k r0 = (I3.d.k) r0
            int r1 = r0.f4027c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f4027c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            I3.d$k r0 = new I3.d$k
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f4025a
            java.lang.Object r0 = Q5.b.e()
            int r1 = r6.f4027c
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            L5.t.b(r12)
            L5.s r12 = (L5.s) r12
            java.lang.Object r8 = r12.k()
            goto L4b
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            L5.t.b(r12)
            H3.e r1 = r7.f3930c
            r6.f4027c = r2
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
        throw new UnsupportedOperationException("Method not decompiled: I3.d.I(com.stripe.android.paymentsheet.u$l, com.stripe.android.paymentsheet.u$i, java.util.List, java.lang.String, P5.d):java.lang.Object");
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
    public final java.lang.Object J(i6.U r8, i6.U r9, P5.d r10) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.d.J(i6.U, i6.U, P5.d):java.lang.Object");
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
    public final java.lang.Object K(com.stripe.android.paymentsheet.u.g r6, P5.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof I3.d.m
            if (r0 == 0) goto L13
            r0 = r7
            I3.d$m r0 = (I3.d.m) r0
            int r1 = r0.f4035c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4035c = r1
            goto L18
        L13:
            I3.d$m r0 = new I3.d$m
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f4033a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f4035c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            L5.t.b(r7)
            goto L4f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            L5.t.b(r7)
            com.stripe.android.paymentsheet.u$i r7 = r6.j()
            if (r7 == 0) goto L40
            com.stripe.android.paymentsheet.u$h r7 = r7.b()
            goto L41
        L40:
            r7 = r4
        L41:
            boolean r2 = r7 instanceof com.stripe.android.paymentsheet.u.h.a
            if (r2 == 0) goto L57
            r0.f4035c = r3
            r7 = 0
            java.lang.Object r7 = r5.M(r6, r7, r7, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            boolean r6 = r7 instanceof y3.i.d
            if (r6 == 0) goto L5e
            r4 = r7
            y3.i$d r4 = (y3.i.d) r4
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
            L5.p r6 = new L5.p
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.d.K(com.stripe.android.paymentsheet.u$g, P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object L(u.g gVar, boolean z8, com.stripe.android.model.j jVar, P5.d dVar) {
        return M(gVar, z8, jVar.G(), dVar);
    }

    private final Object M(u.g gVar, boolean z8, boolean z9, P5.d dVar) {
        return ((q) this.f3928a.invoke(gVar.j())).b(z8, z9, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean N(Y2.d dVar) {
        return !dVar.h0().isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(StripeIntent stripeIntent) {
        if (stripeIntent.D().isEmpty()) {
            return;
        }
        this.f3933f.c("[Stripe SDK] Warning: Your Intent contains the following payment method types which are activated for test mode but not activated for live mode: " + stripeIntent.D() + ". These payment method types will not be displayed in live mode until they are activated. To activate these payment method types visit your Stripe dashboard.More information: https://support.stripe.com/questions/activate-a-new-payment-method");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a u(u.g gVar, com.stripe.android.model.j jVar) {
        u.h hVar;
        u.i j8 = gVar.j();
        if (j8 != null) {
            hVar = j8.b();
        } else {
            hVar = null;
        }
        if (hVar instanceof u.h.a) {
            j.c b8 = jVar.b();
            if (b8 != null) {
                return new a.C0060a(b8);
            }
            IllegalStateException illegalStateException = new IllegalStateException("Excepted 'customer' attribute as part of 'elements_session' response!");
            i.b.a(this.f3935h, i.f.f33437m, AbstractC3790k.f38229e.b(illegalStateException), null, 4, null);
            if (jVar.s().a()) {
                return null;
            }
            throw illegalStateException;
        }
        if (!(hVar instanceof u.h.b)) {
            return null;
        }
        return new a.b(j8, (u.h.b) hVar);
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
    public final java.lang.Object v(I3.d.a r10, Y2.d r11, i6.U r12, P5.d r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof I3.d.c
            if (r0 == 0) goto L13
            r0 = r13
            I3.d$c r0 = (I3.d.c) r0
            int r1 = r0.f3957g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3957g = r1
            goto L18
        L13:
            I3.d$c r0 = new I3.d$c
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f3955e
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f3957g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L53
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r10 = r0.f3952b
            I3.a r10 = (I3.a) r10
            java.lang.Object r11 = r0.f3951a
            java.util.List r11 = (java.util.List) r11
            L5.t.b(r13)
        L34:
            r2 = r10
            goto Lb5
        L37:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3f:
            java.lang.Object r10 = r0.f3954d
            com.stripe.android.paymentsheet.u$h$b r10 = (com.stripe.android.paymentsheet.u.h.b) r10
            java.lang.Object r11 = r0.f3953c
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r0.f3952b
            I3.a$a r12 = (I3.a.C0058a) r12
            java.lang.Object r2 = r0.f3951a
            i6.U r2 = (i6.U) r2
            L5.t.b(r13)
            goto L95
        L53:
            L5.t.b(r13)
            boolean r13 = r10 instanceof I3.d.a.C0060a
            if (r13 == 0) goto L6b
            I3.a$a r13 = I3.a.f3918e
            I3.d$a$a r10 = (I3.d.a.C0060a) r10
            com.stripe.android.model.j$c r10 = r10.b()
            java.util.List r11 = r11.i0()
            I3.a r10 = r13.a(r10, r11)
            goto L9e
        L6b:
            boolean r13 = r10 instanceof I3.d.a.b
            if (r13 == 0) goto L9d
            I3.a$a r13 = I3.a.f3918e
            I3.d$a$b r10 = (I3.d.a.b) r10
            java.lang.String r2 = r10.getId()
            com.stripe.android.paymentsheet.u$h$b r6 = r10.b()
            com.stripe.android.paymentsheet.u$i r10 = r10.c()
            r0.f3951a = r12
            r0.f3952b = r13
            r0.f3953c = r2
            r0.f3954d = r6
            r0.f3957g = r4
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
            I3.a r10 = r12.b(r11, r10, r13)
            r12 = r2
            goto L9e
        L9d:
            r10 = r5
        L9e:
            if (r10 == 0) goto Lc5
            java.util.List r11 = r10.f()
            r0.f3951a = r11
            r0.f3952b = r10
            r0.f3953c = r5
            r0.f3954d = r5
            r0.f3957g = r3
            java.lang.Object r13 = r12.g(r0)
            if (r13 != r1) goto L34
            return r1
        Lb5:
            y3.i r13 = (y3.i) r13
            java.util.List r5 = I3.i.b(r11, r13)
            r7 = 11
            r8 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            I3.a r5 = I3.a.c(r2, r3, r4, r5, r6, r7, r8)
        Lc5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.d.v(I3.d$a, Y2.d, i6.U, P5.d):java.lang.Object");
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
    public final java.lang.Object w(com.stripe.android.paymentsheet.u.g r20, I3.d.a r21, com.stripe.android.model.j r22, java.lang.String r23, boolean r24, java.util.Map r25, P5.d r26) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.d.w(com.stripe.android.paymentsheet.u$g, I3.d$a, com.stripe.android.model.j, java.lang.String, boolean, java.util.Map, P5.d):java.lang.Object");
    }

    private final a3.b x(I3.g gVar) {
        T2.k c8;
        if (gVar == null || (c8 = gVar.c()) == null) {
            return null;
        }
        return new a3.b(c8, gVar.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y(com.stripe.android.model.j jVar, u.g gVar, a aVar, P5.d dVar) {
        if (jVar.G() && !gVar.i().e()) {
            Object D8 = D(gVar, aVar, jVar, jVar.k(), jVar.j(), jVar.c(), jVar.f(), dVar);
            if (D8 == Q5.b.e()) {
                return D8;
            }
            return (I3.g) D8;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Y2.d z(u.g gVar, com.stripe.android.model.j jVar, I3.g gVar2, boolean z8) {
        d.a b8 = this.f3932e.b(jVar.s(), jVar.n());
        if (b8.b()) {
            this.f3934g.q(b8.a());
        }
        List a8 = this.f3939l.a(jVar.e());
        E(gVar.n(), a8);
        return Y2.d.f13031q.b(jVar, gVar, b8.c(), a8, z8, x(gVar2));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // I3.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.stripe.android.paymentsheet.u.l r15, com.stripe.android.paymentsheet.u.g r16, boolean r17, boolean r18, P5.d r19) {
        /*
            r14 = this;
            r7 = r14
            r0 = r19
            boolean r1 = r0 instanceof I3.d.f
            if (r1 == 0) goto L17
            r1 = r0
            I3.d$f r1 = (I3.d.f) r1
            int r2 = r1.f3973c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f3973c = r2
        L15:
            r8 = r1
            goto L1d
        L17:
            I3.d$f r1 = new I3.d$f
            r1.<init>(r0)
            goto L15
        L1d:
            java.lang.Object r0 = r8.f3971a
            java.lang.Object r9 = Q5.b.e()
            int r1 = r8.f3973c
            r10 = 1
            if (r1 == 0) goto L3c
            if (r1 != r10) goto L34
            L5.t.b(r0)
            L5.s r0 = (L5.s) r0
            java.lang.Object r0 = r0.k()
            goto L5e
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3c:
            L5.t.b(r0)
            P5.g r11 = r7.f3936i
            I3.d$g r12 = new I3.d$g
            r12.<init>(r14)
            I3.d$h r13 = new I3.d$h
            r6 = 0
            r0 = r13
            r1 = r14
            r2 = r18
            r3 = r16
            r4 = r15
            r5 = r17
            r0.<init>(r2, r3, r4, r5, r6)
            r8.f3973c = r10
            java.lang.Object r0 = o2.AbstractC3526a.a(r11, r12, r13, r8)
            if (r0 != r9) goto L5e
            return r9
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.d.a(com.stripe.android.paymentsheet.u$l, com.stripe.android.paymentsheet.u$g, boolean, boolean, P5.d):java.lang.Object");
    }
}
