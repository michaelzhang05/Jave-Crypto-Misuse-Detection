package com.stripe.android.stripe3ds2.transaction;

import O5.I;
import O5.s;
import O5.t;
import a6.InterfaceC1668n;
import b4.C1975a;
import b4.d;
import com.stripe.android.stripe3ds2.transaction.c;
import com.stripe.android.stripe3ds2.transaction.d;
import com.stripe.android.stripe3ds2.transaction.g;
import java.security.PrivateKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.concurrent.TimeUnit;
import javax.crypto.SecretKey;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.M;
import l6.Y0;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class p implements com.stripe.android.stripe3ds2.transaction.c {

    /* renamed from: l, reason: collision with root package name */
    public static final a f27950l = new a(null);

    /* renamed from: m, reason: collision with root package name */
    private static final long f27951m = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a, reason: collision with root package name */
    private final Y3.k f27952a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27953b;

    /* renamed from: c, reason: collision with root package name */
    private final PrivateKey f27954c;

    /* renamed from: d, reason: collision with root package name */
    private final ECPublicKey f27955d;

    /* renamed from: e, reason: collision with root package name */
    private final X3.c f27956e;

    /* renamed from: f, reason: collision with root package name */
    private final Y3.d f27957f;

    /* renamed from: g, reason: collision with root package name */
    private final S5.g f27958g;

    /* renamed from: h, reason: collision with root package name */
    private final a4.k f27959h;

    /* renamed from: i, reason: collision with root package name */
    private final c.a f27960i;

    /* renamed from: j, reason: collision with root package name */
    private final SecretKey f27961j;

    /* renamed from: k, reason: collision with root package name */
    private final f f27962k;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final d.e b(C1975a c1975a) {
            a4.q u8 = c1975a.u();
            String s8 = c1975a.s();
            String g8 = c1975a.g();
            String v8 = c1975a.v();
            b4.f fVar = b4.f.f15453j;
            return new d.e(new b4.d(v8, g8, null, String.valueOf(fVar.b()), d.c.f15433c, fVar.c(), "Challenge request timed-out", "CReq", s8, u8, 4, null));
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements c.b {

        /* renamed from: a, reason: collision with root package name */
        private final c.a f27963a;

        public b(c.a config) {
            AbstractC3255y.i(config, "config");
            this.f27963a = config;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.c.b
        public com.stripe.android.stripe3ds2.transaction.c H(X3.c errorReporter, S5.g workContext) {
            AbstractC3255y.i(errorReporter, "errorReporter");
            AbstractC3255y.i(workContext, "workContext");
            Y3.f fVar = new Y3.f(errorReporter);
            return new p(this.f27963a.g(), this.f27963a.h(), fVar.a(this.f27963a.b().b()), fVar.b(this.f27963a.b().a()), this.f27963a.a(), errorReporter, new Y3.m(errorReporter), workContext, null, this.f27963a, null, 1280, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f27964a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f27965b;

        /* renamed from: d, reason: collision with root package name */
        int f27967d;

        c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27965b = obj;
            this.f27967d |= Integer.MIN_VALUE;
            return p.this.a(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f27968a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f27969b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1975a f27971d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C1975a c1975a, S5.d dVar) {
            super(2, dVar);
            this.f27971d = c1975a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            d dVar2 = new d(this.f27971d, dVar);
            dVar2.f27969b = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b8;
            Object e8 = T5.b.e();
            int i8 = this.f27968a;
            try {
            } catch (Throwable th) {
                s.a aVar = s.f8302b;
                b8 = s.b(t.a(th));
            }
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return (com.stripe.android.stripe3ds2.transaction.d) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                p pVar = p.this;
                C1975a c1975a = this.f27971d;
                s.a aVar2 = s.f8302b;
                a4.k kVar = pVar.f27959h;
                String g8 = pVar.g(c1975a.x());
                this.f27968a = 1;
                obj = kVar.a(g8, "application/jose; charset=UTF-8", this);
                if (obj == e8) {
                    return e8;
                }
            }
            b8 = s.b((a4.l) obj);
            p pVar2 = p.this;
            Throwable e9 = s.e(b8);
            if (e9 != null) {
                pVar2.f27956e.l(e9);
            }
            p pVar3 = p.this;
            C1975a c1975a2 = this.f27971d;
            Throwable e10 = s.e(b8);
            if (e10 == null) {
                f fVar = pVar3.f27962k;
                this.f27968a = 2;
                obj = fVar.a(c1975a2, (a4.l) b8, this);
                if (obj == e8) {
                    return e8;
                }
                return (com.stripe.android.stripe3ds2.transaction.d) obj;
            }
            if (e10 instanceof Y0) {
                return p.f27950l.b(c1975a2);
            }
            return new d.c(e10);
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public p(Y3.k messageTransformer, String sdkReferenceId, PrivateKey sdkPrivateKey, ECPublicKey acsPublicKey, String acsUrl, X3.c errorReporter, Y3.d dhKeyGenerator, S5.g workContext, a4.k httpClient, c.a creqExecutorConfig, g responseProcessorFactory) {
        AbstractC3255y.i(messageTransformer, "messageTransformer");
        AbstractC3255y.i(sdkReferenceId, "sdkReferenceId");
        AbstractC3255y.i(sdkPrivateKey, "sdkPrivateKey");
        AbstractC3255y.i(acsPublicKey, "acsPublicKey");
        AbstractC3255y.i(acsUrl, "acsUrl");
        AbstractC3255y.i(errorReporter, "errorReporter");
        AbstractC3255y.i(dhKeyGenerator, "dhKeyGenerator");
        AbstractC3255y.i(workContext, "workContext");
        AbstractC3255y.i(httpClient, "httpClient");
        AbstractC3255y.i(creqExecutorConfig, "creqExecutorConfig");
        AbstractC3255y.i(responseProcessorFactory, "responseProcessorFactory");
        this.f27952a = messageTransformer;
        this.f27953b = sdkReferenceId;
        this.f27954c = sdkPrivateKey;
        this.f27955d = acsPublicKey;
        this.f27956e = errorReporter;
        this.f27957f = dhKeyGenerator;
        this.f27958g = workContext;
        this.f27959h = httpClient;
        this.f27960i = creqExecutorConfig;
        SecretKey f8 = f();
        this.f27961j = f8;
        this.f27962k = responseProcessorFactory.a(f8);
    }

    private final SecretKey f() {
        Y3.d dVar = this.f27957f;
        ECPublicKey eCPublicKey = this.f27955d;
        PrivateKey privateKey = this.f27954c;
        AbstractC3255y.g(privateKey, "null cannot be cast to non-null type java.security.interfaces.ECPrivateKey");
        return dVar.p(eCPublicKey, (ECPrivateKey) privateKey, this.f27953b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String g(JSONObject jSONObject) {
        return this.f27952a.U(jSONObject, this.f27961j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.stripe.android.stripe3ds2.transaction.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(b4.C1975a r7, S5.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.stripe.android.stripe3ds2.transaction.p.c
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.stripe3ds2.transaction.p$c r0 = (com.stripe.android.stripe3ds2.transaction.p.c) r0
            int r1 = r0.f27967d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27967d = r1
            goto L18
        L13:
            com.stripe.android.stripe3ds2.transaction.p$c r0 = new com.stripe.android.stripe3ds2.transaction.p$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f27965b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f27967d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f27964a
            b4.a r7 = (b4.C1975a) r7
            O5.t.b(r8)
            goto L4b
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            O5.t.b(r8)
            long r4 = com.stripe.android.stripe3ds2.transaction.p.f27951m
            com.stripe.android.stripe3ds2.transaction.p$d r8 = new com.stripe.android.stripe3ds2.transaction.p$d
            r2 = 0
            r8.<init>(r7, r2)
            r0.f27964a = r7
            r0.f27967d = r3
            java.lang.Object r8 = l6.a1.d(r4, r8, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            com.stripe.android.stripe3ds2.transaction.d r8 = (com.stripe.android.stripe3ds2.transaction.d) r8
            if (r8 != 0) goto L55
            com.stripe.android.stripe3ds2.transaction.p$a r8 = com.stripe.android.stripe3ds2.transaction.p.f27950l
            com.stripe.android.stripe3ds2.transaction.d$e r8 = com.stripe.android.stripe3ds2.transaction.p.a.a(r8, r7)
        L55:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.p.a(b4.a, S5.d):java.lang.Object");
    }

    public /* synthetic */ p(Y3.k kVar, String str, PrivateKey privateKey, ECPublicKey eCPublicKey, String str2, X3.c cVar, Y3.d dVar, S5.g gVar, a4.k kVar2, c.a aVar, g gVar2, int i8, AbstractC3247p abstractC3247p) {
        this(kVar, str, privateKey, eCPublicKey, str2, cVar, dVar, gVar, (i8 & 256) != 0 ? new r(str2, null, cVar, gVar, 2, null) : kVar2, aVar, (i8 & 1024) != 0 ? new g.a(kVar, cVar, aVar) : gVar2);
    }
}
