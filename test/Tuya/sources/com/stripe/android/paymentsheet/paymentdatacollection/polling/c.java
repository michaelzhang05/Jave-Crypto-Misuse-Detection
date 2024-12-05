package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import F3.e;
import L5.I;
import L5.p;
import P5.d;
import X5.n;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingContract;
import f3.C2662c;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3360h;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;

/* loaded from: classes4.dex */
public abstract class c {

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26341a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f26342b;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.f2492a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.f2494c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.f2493b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.f2495d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f26341a = iArr;
            int[] iArr2 = new int[StripeIntent.Status.values().length];
            try {
                iArr2[StripeIntent.Status.f24151e.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[StripeIntent.Status.f24154h.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[StripeIntent.Status.f24149c.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[StripeIntent.Status.f24150d.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[StripeIntent.Status.f24152f.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[StripeIntent.Status.f24153g.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[StripeIntent.Status.f24155i.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            f26342b = iArr2;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends l implements n {

        /* renamed from: a */
        long f26343a;

        /* renamed from: b */
        int f26344b;

        /* renamed from: c */
        private /* synthetic */ Object f26345c;

        /* renamed from: d */
        final /* synthetic */ long f26346d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j8, d dVar) {
            super(2, dVar);
            this.f26346d = j8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            b bVar = new b(this.f26346d, dVar);
            bVar.f26345c = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0084 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0082 -> B:12:0x0049). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = Q5.b.e()
                int r1 = r9.f26344b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L24
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L24
            L12:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1a:
                long r5 = r9.f26343a
                java.lang.Object r1 = r9.f26345c
                l6.g r1 = (l6.InterfaceC3359g) r1
                L5.t.b(r10)
                goto L68
            L24:
                long r5 = r9.f26343a
                java.lang.Object r1 = r9.f26345c
                l6.g r1 = (l6.InterfaceC3359g) r1
                L5.t.b(r10)
                goto L49
            L2e:
                L5.t.b(r10)
                java.lang.Object r10 = r9.f26345c
                r1 = r10
                l6.g r1 = (l6.InterfaceC3359g) r1
                long r5 = r9.f26346d
                h6.a r10 = h6.C2758a.e(r5)
                r9.f26345c = r1
                r9.f26343a = r5
                r9.f26344b = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L49
                return r0
            L49:
                h6.a$a r10 = h6.C2758a.f31409b
                long r7 = r10.b()
                int r10 = h6.C2758a.g(r5, r7)
                if (r10 <= 0) goto L85
                h6.d r10 = h6.EnumC2761d.f31419e
                long r7 = h6.AbstractC2760c.s(r4, r10)
                r9.f26345c = r1
                r9.f26343a = r5
                r9.f26344b = r3
                java.lang.Object r10 = i6.X.c(r7, r9)
                if (r10 != r0) goto L68
                return r0
            L68:
                h6.a$a r10 = h6.C2758a.f31409b
                h6.d r10 = h6.EnumC2761d.f31419e
                long r7 = h6.AbstractC2760c.s(r4, r10)
                long r5 = h6.C2758a.D(r5, r7)
                h6.a r10 = h6.C2758a.e(r5)
                r9.f26345c = r1
                r9.f26343a = r5
                r9.f26344b = r2
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L49
                return r0
            L85:
                L5.I r10 = L5.I.f6487a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.paymentdatacollection.polling.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X5.n
        public final Object invoke(InterfaceC3359g interfaceC3359g, d dVar) {
            return ((b) create(interfaceC3359g, dVar)).invokeSuspend(I.f6487a);
        }
    }

    public static final InterfaceC3358f c(long j8) {
        return AbstractC3360h.x(new b(j8, null));
    }

    public static final C2662c d(e eVar, PollingContract.a args) {
        AbstractC3159y.i(eVar, "<this>");
        AbstractC3159y.i(args, "args");
        int i8 = a.f26341a[eVar.ordinal()];
        if (i8 == 1 || i8 == 2) {
            return null;
        }
        if (i8 != 3) {
            if (i8 == 4) {
                return new C2662c(args.d(), 3, null, false, null, null, null, 116, null);
            }
            throw new p();
        }
        return new C2662c(args.d(), 1, null, false, null, null, null, 124, null);
    }

    public static final e e(StripeIntent.Status status) {
        switch (a.f26342b[status.ordinal()]) {
            case 1:
                return e.f2492a;
            case 2:
                return e.f2493b;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return e.f2494c;
            default:
                throw new p();
        }
    }
}
