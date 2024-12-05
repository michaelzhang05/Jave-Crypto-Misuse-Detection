package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import I3.e;
import O5.I;
import O5.p;
import S5.d;
import a6.InterfaceC1668n;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingContract;
import i3.C2980c;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3255y;
import o6.AbstractC3708h;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;

/* loaded from: classes4.dex */
public abstract class c {

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27396a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f27397b;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.f4032a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.f4034c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.f4033b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.f4035d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f27396a = iArr;
            int[] iArr2 = new int[StripeIntent.Status.values().length];
            try {
                iArr2[StripeIntent.Status.f25206e.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[StripeIntent.Status.f25209h.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[StripeIntent.Status.f25204c.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[StripeIntent.Status.f25205d.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[StripeIntent.Status.f25207f.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[StripeIntent.Status.f25208g.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[StripeIntent.Status.f25210i.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            f27397b = iArr2;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends l implements InterfaceC1668n {

        /* renamed from: a */
        long f27398a;

        /* renamed from: b */
        int f27399b;

        /* renamed from: c */
        private /* synthetic */ Object f27400c;

        /* renamed from: d */
        final /* synthetic */ long f27401d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j8, d dVar) {
            super(2, dVar);
            this.f27401d = j8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            b bVar = new b(this.f27401d, dVar);
            bVar.f27400c = obj;
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
                java.lang.Object r0 = T5.b.e()
                int r1 = r9.f27399b
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
                long r5 = r9.f27398a
                java.lang.Object r1 = r9.f27400c
                o6.g r1 = (o6.InterfaceC3707g) r1
                O5.t.b(r10)
                goto L68
            L24:
                long r5 = r9.f27398a
                java.lang.Object r1 = r9.f27400c
                o6.g r1 = (o6.InterfaceC3707g) r1
                O5.t.b(r10)
                goto L49
            L2e:
                O5.t.b(r10)
                java.lang.Object r10 = r9.f27400c
                r1 = r10
                o6.g r1 = (o6.InterfaceC3707g) r1
                long r5 = r9.f27401d
                k6.a r10 = k6.C3225a.e(r5)
                r9.f27400c = r1
                r9.f27398a = r5
                r9.f27399b = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L49
                return r0
            L49:
                k6.a$a r10 = k6.C3225a.f34131b
                long r7 = r10.b()
                int r10 = k6.C3225a.g(r5, r7)
                if (r10 <= 0) goto L85
                k6.d r10 = k6.EnumC3228d.f34141e
                long r7 = k6.AbstractC3227c.s(r4, r10)
                r9.f27400c = r1
                r9.f27398a = r5
                r9.f27399b = r3
                java.lang.Object r10 = l6.X.c(r7, r9)
                if (r10 != r0) goto L68
                return r0
            L68:
                k6.a$a r10 = k6.C3225a.f34131b
                k6.d r10 = k6.EnumC3228d.f34141e
                long r7 = k6.AbstractC3227c.s(r4, r10)
                long r5 = k6.C3225a.H(r5, r7)
                k6.a r10 = k6.C3225a.e(r5)
                r9.f27400c = r1
                r9.f27398a = r5
                r9.f27399b = r2
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L49
                return r0
            L85:
                O5.I r10 = O5.I.f8278a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.paymentdatacollection.polling.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(InterfaceC3707g interfaceC3707g, d dVar) {
            return ((b) create(interfaceC3707g, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public static final InterfaceC3706f c(long j8) {
        return AbstractC3708h.z(new b(j8, null));
    }

    public static final C2980c d(e eVar, PollingContract.a args) {
        AbstractC3255y.i(eVar, "<this>");
        AbstractC3255y.i(args, "args");
        int i8 = a.f27396a[eVar.ordinal()];
        if (i8 == 1 || i8 == 2) {
            return null;
        }
        if (i8 != 3) {
            if (i8 == 4) {
                return new C2980c(args.d(), 3, null, false, null, null, null, 116, null);
            }
            throw new p();
        }
        return new C2980c(args.d(), 1, null, false, null, null, null, 124, null);
    }

    public static final e e(StripeIntent.Status status) {
        switch (a.f27397b[status.ordinal()]) {
            case 1:
                return e.f4032a;
            case 2:
                return e.f4033b;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return e.f4034c;
            default:
                throw new p();
        }
    }
}
