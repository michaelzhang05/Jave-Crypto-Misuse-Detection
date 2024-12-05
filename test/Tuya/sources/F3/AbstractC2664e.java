package f3;

import L5.I;
import L5.s;
import M5.AbstractC1246t;
import X5.n;
import android.content.Context;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.o;
import e3.m;
import i6.M;
import j2.AbstractC3059K;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.T;
import r2.InterfaceC3684d;
import x2.InterfaceC3864B;
import x2.j;
import x2.r;

/* renamed from: f3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2664e {

    /* renamed from: g, reason: collision with root package name */
    public static final a f31027g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f31028h = 8;

    /* renamed from: i, reason: collision with root package name */
    private static final List f31029i = AbstractC1246t.e("payment_method");

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f31030a;

    /* renamed from: b, reason: collision with root package name */
    private final m f31031b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3684d f31032c;

    /* renamed from: d, reason: collision with root package name */
    private final P5.g f31033d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3864B f31034e;

    /* renamed from: f, reason: collision with root package name */
    private final C2661b f31035f;

    /* renamed from: f3.e$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final List a() {
            return AbstractC2664e.f31029i;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: f3.e$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31036a;

        static {
            int[] iArr = new int[StripeIntent.Status.values().length];
            try {
                iArr[StripeIntent.Status.f24154h.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StripeIntent.Status.f24155i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f31036a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f3.e$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f31037a;

        /* renamed from: c, reason: collision with root package name */
        int f31039c;

        c(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f31037a = obj;
            this.f31039c |= Integer.MIN_VALUE;
            Object p8 = AbstractC2664e.this.p(null, this);
            if (p8 == Q5.b.e()) {
                return p8;
            }
            return s.a(p8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f3.e$d */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        Object f31040a;

        /* renamed from: b, reason: collision with root package name */
        int f31041b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f31042c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C2662c f31044e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C2662c c2662c, P5.d dVar) {
            super(2, dVar);
            this.f31044e = c2662c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            d dVar2 = new d(this.f31044e, dVar);
            dVar2.f31042c = obj;
            return dVar2;
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        /* JADX WARN: Removed duplicated region for block: B:54:0x0192 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0193  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 506
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: f3.AbstractC2664e.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f3.e$e, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0741e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f31045a;

        /* renamed from: b, reason: collision with root package name */
        Object f31046b;

        /* renamed from: c, reason: collision with root package name */
        Object f31047c;

        /* renamed from: d, reason: collision with root package name */
        Object f31048d;

        /* renamed from: e, reason: collision with root package name */
        Object f31049e;

        /* renamed from: f, reason: collision with root package name */
        Object f31050f;

        /* renamed from: g, reason: collision with root package name */
        Object f31051g;

        /* renamed from: h, reason: collision with root package name */
        int f31052h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f31053i;

        /* renamed from: k, reason: collision with root package name */
        int f31055k;

        C0741e(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f31053i = obj;
            this.f31055k |= Integer.MIN_VALUE;
            Object r8 = AbstractC2664e.this.r(null, null, null, this);
            if (r8 == Q5.b.e()) {
                return r8;
            }
            return s.a(r8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f3.e$f */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        Object f31056a;

        /* renamed from: b, reason: collision with root package name */
        int f31057b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f31059d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Q f31060e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f31061f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ StripeIntent f31062g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f31063h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ j.c f31064i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(T t8, Q q8, int i8, StripeIntent stripeIntent, String str, j.c cVar, P5.d dVar) {
            super(2, dVar);
            this.f31059d = t8;
            this.f31060e = q8;
            this.f31061f = i8;
            this.f31062g = stripeIntent;
            this.f31063h = str;
            this.f31064i = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(this.f31059d, this.f31060e, this.f31061f, this.f31062g, this.f31063h, this.f31064i, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x007d -> B:10:0x0097). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0094 -> B:10:0x0097). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = Q5.b.e()
                int r1 = r8.f31057b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2c
                if (r1 == r4) goto L28
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1a:
                java.lang.Object r1 = r8.f31056a
                kotlin.jvm.internal.T r1 = (kotlin.jvm.internal.T) r1
                L5.t.b(r9)
                L5.s r9 = (L5.s) r9
                java.lang.Object r9 = r9.k()
                goto L97
            L28:
                L5.t.b(r9)
                goto L5d
            L2c:
                L5.t.b(r9)
            L2f:
                f3.e r9 = f3.AbstractC2664e.this
                kotlin.jvm.internal.T r1 = r8.f31059d
                java.lang.Object r1 = r1.f33761a
                boolean r9 = f3.AbstractC2664e.k(r9, r1)
                if (r9 == 0) goto La2
                kotlin.jvm.internal.Q r9 = r8.f31060e
                int r9 = r9.f33759a
                if (r9 <= r4) goto La2
                f3.e r9 = f3.AbstractC2664e.this
                x2.B r9 = f3.AbstractC2664e.f(r9)
                int r1 = r8.f31061f
                kotlin.jvm.internal.Q r5 = r8.f31060e
                int r5 = r5.f33759a
                long r5 = r9.a(r1, r5)
                r9 = 0
                r8.f31056a = r9
                r8.f31057b = r4
                java.lang.Object r9 = i6.X.c(r5, r8)
                if (r9 != r0) goto L5d
                return r0
            L5d:
                kotlin.jvm.internal.T r1 = r8.f31059d
                f3.e r9 = f3.AbstractC2664e.this
                com.stripe.android.model.StripeIntent r5 = r8.f31062g
                boolean r9 = f3.AbstractC2664e.h(r9, r5)
                if (r9 == 0) goto L80
                f3.e r9 = f3.AbstractC2664e.this
                java.lang.String r5 = r8.f31063h
                x2.j$c r6 = r8.f31064i
                f3.e$a r7 = f3.AbstractC2664e.f31027g
                java.util.List r7 = r7.a()
                r8.f31056a = r1
                r8.f31057b = r3
                java.lang.Object r9 = r9.q(r5, r6, r7, r8)
                if (r9 != r0) goto L97
                return r0
            L80:
                f3.e r9 = f3.AbstractC2664e.this
                java.lang.String r5 = r8.f31063h
                x2.j$c r6 = r8.f31064i
                f3.e$a r7 = f3.AbstractC2664e.f31027g
                java.util.List r7 = r7.a()
                r8.f31056a = r1
                r8.f31057b = r2
                java.lang.Object r9 = r9.s(r5, r6, r7, r8)
                if (r9 != r0) goto L97
                return r0
            L97:
                r1.f33761a = r9
                kotlin.jvm.internal.Q r9 = r8.f31060e
                int r1 = r9.f33759a
                int r1 = r1 + (-1)
                r9.f33759a = r1
                goto L2f
            La2:
                L5.I r9 = L5.I.f6487a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: f3.AbstractC2664e.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public /* synthetic */ AbstractC2664e(Context context, I5.a aVar, m mVar, InterfaceC3684d interfaceC3684d, P5.g gVar, InterfaceC3864B interfaceC3864B, AbstractC3151p abstractC3151p) {
        this(context, aVar, mVar, interfaceC3684d, gVar, interfaceC3864B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int n(StripeIntent stripeIntent, int i8) {
        int i9;
        StripeIntent.Status status = stripeIntent.getStatus();
        if (status == null) {
            i9 = -1;
        } else {
            i9 = b.f31036a[status.ordinal()];
        }
        if (i9 == 1 || i9 == 2) {
            return 1;
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(com.stripe.android.model.StripeIntent r24, java.lang.String r25, x2.j.c r26, P5.d r27) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.AbstractC2664e.r(com.stripe.android.model.StripeIntent, java.lang.String, x2.j$c, P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean t(StripeIntent stripeIntent) {
        o.a aVar;
        o.p pVar;
        o v8 = stripeIntent.v();
        if (v8 != null && (pVar = v8.f24412e) != null) {
            aVar = pVar.c();
        } else {
            aVar = null;
        }
        return aVar instanceof o.a.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean u(StripeIntent stripeIntent, boolean z8) {
        if (z8 && stripeIntent.w()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(com.stripe.android.model.StripeIntent r8, int r9) {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            if (r9 != r1) goto Lc
            boolean r2 = com.stripe.android.model.y.b(r8)
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            r3 = 0
            r4 = 3
            if (r9 != r4) goto L29
            com.stripe.android.model.StripeIntent$Status r5 = r8.getStatus()
            com.stripe.android.model.StripeIntent$Status r6 = com.stripe.android.model.StripeIntent.Status.f24150d
            if (r5 != r6) goto L29
            com.stripe.android.model.o r5 = r8.v()
            if (r5 == 0) goto L22
            com.stripe.android.model.o$p r5 = r5.f24412e
            goto L23
        L22:
            r5 = r3
        L23:
            com.stripe.android.model.o$p r6 = com.stripe.android.model.o.p.f24532i
            if (r5 != r6) goto L29
            r5 = 1
            goto L2a
        L29:
            r5 = 0
        L2a:
            if (r9 != r4) goto L4a
            com.stripe.android.model.StripeIntent$Status r9 = r8.getStatus()
            com.stripe.android.model.StripeIntent$Status r4 = com.stripe.android.model.StripeIntent.Status.f24151e
            if (r9 != r4) goto L4a
            com.stripe.android.model.o r9 = r8.v()
            if (r9 == 0) goto L3c
            com.stripe.android.model.o$p r3 = r9.f24412e
        L3c:
            com.stripe.android.model.o$p r9 = com.stripe.android.model.o.p.f24532i
            if (r3 != r9) goto L4a
            com.stripe.android.model.StripeIntent$NextActionType r9 = r8.m()
            com.stripe.android.model.StripeIntent$NextActionType r3 = com.stripe.android.model.StripeIntent.NextActionType.f24133d
            if (r9 != r3) goto L4a
            r9 = 1
            goto L4b
        L4a:
            r9 = 0
        L4b:
            boolean r3 = r8.w()
            if (r3 == 0) goto L69
            com.stripe.android.model.o r8 = r8.v()
            if (r8 == 0) goto L69
            com.stripe.android.model.o$p r8 = r8.f24412e
            if (r8 == 0) goto L69
            com.stripe.android.model.o$a r8 = r8.c()
            if (r8 == 0) goto L69
            boolean r8 = r8.U()
            if (r8 != r1) goto L69
            r8 = 1
            goto L6a
        L69:
            r8 = 0
        L6a:
            if (r2 != 0) goto L72
            if (r5 != 0) goto L72
            if (r9 != 0) goto L72
            if (r8 == 0) goto L73
        L72:
            r0 = 1
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.AbstractC2664e.v(com.stripe.android.model.StripeIntent, int):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean w(Object obj) {
        boolean z8;
        o.p pVar = null;
        if (s.g(obj)) {
            obj = null;
        }
        StripeIntent stripeIntent = (StripeIntent) obj;
        if (stripeIntent == null) {
            return true;
        }
        boolean w8 = stripeIntent.w();
        if (stripeIntent.getStatus() == StripeIntent.Status.f24150d) {
            o v8 = stripeIntent.v();
            if (v8 != null) {
                pVar = v8.f24412e;
            }
            if (pVar == o.p.f24532i) {
                z8 = true;
                if (w8 && !z8) {
                    return false;
                }
            }
        }
        z8 = false;
        return w8 ? true : true;
    }

    protected abstract Object l(String str, j.c cVar, String str2, P5.d dVar);

    protected abstract AbstractC3059K m(StripeIntent stripeIntent, int i8, String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public final m o() {
        return this.f31031b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(f3.C2662c r6, P5.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof f3.AbstractC2664e.c
            if (r0 == 0) goto L13
            r0 = r7
            f3.e$c r0 = (f3.AbstractC2664e.c) r0
            int r1 = r0.f31039c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31039c = r1
            goto L18
        L13:
            f3.e$c r0 = new f3.e$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f31037a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f31039c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            L5.t.b(r7)
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            L5.t.b(r7)
            P5.g r7 = r5.f31033d
            f3.e$d r2 = new f3.e$d
            r4 = 0
            r2.<init>(r6, r4)
            r0.f31039c = r3
            java.lang.Object r7 = i6.AbstractC2825i.g(r7, r2, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            L5.s r7 = (L5.s) r7
            java.lang.Object r6 = r7.k()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.AbstractC2664e.p(f3.c, P5.d):java.lang.Object");
    }

    protected abstract Object q(String str, j.c cVar, List list, P5.d dVar);

    protected abstract Object s(String str, j.c cVar, List list, P5.d dVar);

    private AbstractC2664e(Context context, I5.a aVar, m mVar, InterfaceC3684d interfaceC3684d, P5.g gVar, InterfaceC3864B interfaceC3864B) {
        this.f31030a = aVar;
        this.f31031b = mVar;
        this.f31032c = interfaceC3684d;
        this.f31033d = gVar;
        this.f31034e = interfaceC3864B;
        this.f31035f = new C2661b(context);
    }

    public /* synthetic */ AbstractC2664e(Context context, I5.a aVar, m mVar, InterfaceC3684d interfaceC3684d, P5.g gVar, InterfaceC3864B interfaceC3864B, int i8, AbstractC3151p abstractC3151p) {
        this(context, aVar, mVar, interfaceC3684d, gVar, (i8 & 32) != 0 ? new r() : interfaceC3864B, null);
    }
}
