package com.stripe.android.stripe3ds2.transaction;

import O5.I;
import O5.s;
import O5.t;
import a6.InterfaceC1668n;
import com.stripe.android.stripe3ds2.transaction.k;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import l6.N;

/* loaded from: classes4.dex */
public final class q implements k {

    /* renamed from: d, reason: collision with root package name */
    private static final a f27972d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final a4.k f27973a;

    /* renamed from: b, reason: collision with root package name */
    private final X3.c f27974b;

    /* renamed from: c, reason: collision with root package name */
    private final S5.g f27975c;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements k.a {

        /* renamed from: a, reason: collision with root package name */
        private final S5.g f27976a;

        public b(S5.g workContext) {
            AbstractC3255y.i(workContext, "workContext");
            this.f27976a = workContext;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.k.a
        public k a(String acsUrl, X3.c errorReporter) {
            AbstractC3255y.i(acsUrl, "acsUrl");
            AbstractC3255y.i(errorReporter, "errorReporter");
            return new q(new r(acsUrl, null, errorReporter, this.f27976a, 2, null), errorReporter, C3347b0.b());
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f27977a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f27978b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f27980d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, S5.d dVar) {
            super(2, dVar);
            this.f27980d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            c cVar = new c(this.f27980d, dVar);
            cVar.f27978b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b8;
            Object e8 = T5.b.e();
            int i8 = this.f27977a;
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
                    String str = this.f27980d;
                    s.a aVar = s.f8302b;
                    a4.k kVar = qVar.f27973a;
                    AbstractC3255y.f(str);
                    this.f27977a = 1;
                    obj = kVar.a(str, "application/json; charset=utf-8", this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                b8 = s.b((a4.l) obj);
            } catch (Throwable th) {
                s.a aVar2 = s.f8302b;
                b8 = s.b(t.a(th));
            }
            q qVar2 = q.this;
            Throwable e9 = s.e(b8);
            if (e9 != null) {
                qVar2.f27974b.l(e9);
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public q(a4.k httpClient, X3.c errorReporter, S5.g workContext) {
        AbstractC3255y.i(httpClient, "httpClient");
        AbstractC3255y.i(errorReporter, "errorReporter");
        AbstractC3255y.i(workContext, "workContext");
        this.f27973a = httpClient;
        this.f27974b = errorReporter;
        this.f27975c = workContext;
    }

    @Override // com.stripe.android.stripe3ds2.transaction.k
    public void a(b4.d errorData) {
        Object b8;
        AbstractC3255y.i(errorData, "errorData");
        try {
            s.a aVar = s.f8302b;
            b8 = s.b(errorData.a().toString());
        } catch (Throwable th) {
            s.a aVar2 = s.f8302b;
            b8 = s.b(t.a(th));
        }
        Throwable e8 = s.e(b8);
        if (e8 != null) {
            this.f27974b.l(new RuntimeException("Could not convert ErrorData to JSON.\n$" + errorData, e8));
        }
        if (s.g(b8)) {
            b8 = null;
        }
        String str = (String) b8;
        if (str != null) {
            AbstractC3364k.d(N.a(this.f27975c), null, null, new c(str, null), 3, null);
        }
    }
}
