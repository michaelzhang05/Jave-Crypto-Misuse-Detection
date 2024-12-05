package com.stripe.android.stripe3ds2.transaction;

import L5.I;
import L5.s;
import L5.t;
import com.stripe.android.stripe3ds2.transaction.k;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import i6.N;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class q implements k {

    /* renamed from: d, reason: collision with root package name */
    private static final a f26917d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final X3.k f26918a;

    /* renamed from: b, reason: collision with root package name */
    private final U3.c f26919b;

    /* renamed from: c, reason: collision with root package name */
    private final P5.g f26920c;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements k.a {

        /* renamed from: a, reason: collision with root package name */
        private final P5.g f26921a;

        public b(P5.g workContext) {
            AbstractC3159y.i(workContext, "workContext");
            this.f26921a = workContext;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.k.a
        public k a(String acsUrl, U3.c errorReporter) {
            AbstractC3159y.i(acsUrl, "acsUrl");
            AbstractC3159y.i(errorReporter, "errorReporter");
            return new q(new r(acsUrl, null, errorReporter, this.f26921a, 2, null), errorReporter, C2812b0.b());
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f26922a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f26923b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f26925d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, P5.d dVar) {
            super(2, dVar);
            this.f26925d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            c cVar = new c(this.f26925d, dVar);
            cVar.f26923b = obj;
            return cVar;
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b8;
            Object e8 = Q5.b.e();
            int i8 = this.f26922a;
            try {
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    q qVar = q.this;
                    String str = this.f26925d;
                    s.a aVar = s.f6511b;
                    X3.k kVar = qVar.f26918a;
                    AbstractC3159y.f(str);
                    this.f26922a = 1;
                    obj = kVar.a(str, "application/json; charset=utf-8", this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                b8 = s.b((X3.l) obj);
            } catch (Throwable th) {
                s.a aVar2 = s.f6511b;
                b8 = s.b(t.a(th));
            }
            q qVar2 = q.this;
            Throwable e9 = s.e(b8);
            if (e9 != null) {
                qVar2.f26919b.i(e9);
            }
            return I.f6487a;
        }
    }

    public q(X3.k httpClient, U3.c errorReporter, P5.g workContext) {
        AbstractC3159y.i(httpClient, "httpClient");
        AbstractC3159y.i(errorReporter, "errorReporter");
        AbstractC3159y.i(workContext, "workContext");
        this.f26918a = httpClient;
        this.f26919b = errorReporter;
        this.f26920c = workContext;
    }

    @Override // com.stripe.android.stripe3ds2.transaction.k
    public void a(Y3.d errorData) {
        Object b8;
        AbstractC3159y.i(errorData, "errorData");
        try {
            s.a aVar = s.f6511b;
            b8 = s.b(errorData.b().toString());
        } catch (Throwable th) {
            s.a aVar2 = s.f6511b;
            b8 = s.b(t.a(th));
        }
        Throwable e8 = s.e(b8);
        if (e8 != null) {
            this.f26919b.i(new RuntimeException("Could not convert ErrorData to JSON.\n$" + errorData, e8));
        }
        if (s.g(b8)) {
            b8 = null;
        }
        String str = (String) b8;
        if (str != null) {
            AbstractC2829k.d(N.a(this.f26920c), null, null, new c(str, null), 3, null);
        }
    }
}
