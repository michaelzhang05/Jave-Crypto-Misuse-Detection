package i3;

import A2.B;
import A2.j;
import A2.r;
import O5.I;
import O5.s;
import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import android.content.Context;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.o;
import h3.m;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.T;
import l6.M;
import m2.AbstractC3413K;
import u2.InterfaceC4057d;

/* renamed from: i3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2982e {

    /* renamed from: g, reason: collision with root package name */
    public static final a f32890g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f32891h = 8;

    /* renamed from: i, reason: collision with root package name */
    private static final List f32892i = AbstractC1378t.e("payment_method");

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f32893a;

    /* renamed from: b, reason: collision with root package name */
    private final m f32894b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4057d f32895c;

    /* renamed from: d, reason: collision with root package name */
    private final S5.g f32896d;

    /* renamed from: e, reason: collision with root package name */
    private final B f32897e;

    /* renamed from: f, reason: collision with root package name */
    private final C2979b f32898f;

    /* renamed from: i3.e$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final List a() {
            return AbstractC2982e.f32892i;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: i3.e$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32899a;

        static {
            int[] iArr = new int[StripeIntent.Status.values().length];
            try {
                iArr[StripeIntent.Status.f25209h.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StripeIntent.Status.f25210i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f32899a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i3.e$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f32900a;

        /* renamed from: c, reason: collision with root package name */
        int f32902c;

        c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f32900a = obj;
            this.f32902c |= Integer.MIN_VALUE;
            Object p8 = AbstractC2982e.this.p(null, this);
            if (p8 == T5.b.e()) {
                return p8;
            }
            return s.a(p8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i3.e$d */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f32903a;

        /* renamed from: b, reason: collision with root package name */
        int f32904b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f32905c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C2980c f32907e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C2980c c2980c, S5.d dVar) {
            super(2, dVar);
            this.f32907e = c2980c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            d dVar2 = new d(this.f32907e, dVar);
            dVar2.f32905c = obj;
            return dVar2;
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
            throw new UnsupportedOperationException("Method not decompiled: i3.AbstractC2982e.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i3.e$e, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0767e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f32908a;

        /* renamed from: b, reason: collision with root package name */
        Object f32909b;

        /* renamed from: c, reason: collision with root package name */
        Object f32910c;

        /* renamed from: d, reason: collision with root package name */
        Object f32911d;

        /* renamed from: e, reason: collision with root package name */
        Object f32912e;

        /* renamed from: f, reason: collision with root package name */
        Object f32913f;

        /* renamed from: g, reason: collision with root package name */
        Object f32914g;

        /* renamed from: h, reason: collision with root package name */
        int f32915h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f32916i;

        /* renamed from: k, reason: collision with root package name */
        int f32918k;

        C0767e(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f32916i = obj;
            this.f32918k |= Integer.MIN_VALUE;
            Object r8 = AbstractC2982e.this.r(null, null, null, this);
            if (r8 == T5.b.e()) {
                return r8;
            }
            return s.a(r8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i3.e$f */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f32919a;

        /* renamed from: b, reason: collision with root package name */
        int f32920b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f32922d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Q f32923e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f32924f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ StripeIntent f32925g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f32926h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ j.c f32927i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(T t8, Q q8, int i8, StripeIntent stripeIntent, String str, j.c cVar, S5.d dVar) {
            super(2, dVar);
            this.f32922d = t8;
            this.f32923e = q8;
            this.f32924f = i8;
            this.f32925g = stripeIntent;
            this.f32926h = str;
            this.f32927i = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(this.f32922d, this.f32923e, this.f32924f, this.f32925g, this.f32926h, this.f32927i, dVar);
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
                java.lang.Object r0 = T5.b.e()
                int r1 = r8.f32920b
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
                java.lang.Object r1 = r8.f32919a
                kotlin.jvm.internal.T r1 = (kotlin.jvm.internal.T) r1
                O5.t.b(r9)
                O5.s r9 = (O5.s) r9
                java.lang.Object r9 = r9.j()
                goto L97
            L28:
                O5.t.b(r9)
                goto L5d
            L2c:
                O5.t.b(r9)
            L2f:
                i3.e r9 = i3.AbstractC2982e.this
                kotlin.jvm.internal.T r1 = r8.f32922d
                java.lang.Object r1 = r1.f34162a
                boolean r9 = i3.AbstractC2982e.k(r9, r1)
                if (r9 == 0) goto La2
                kotlin.jvm.internal.Q r9 = r8.f32923e
                int r9 = r9.f34160a
                if (r9 <= r4) goto La2
                i3.e r9 = i3.AbstractC2982e.this
                A2.B r9 = i3.AbstractC2982e.f(r9)
                int r1 = r8.f32924f
                kotlin.jvm.internal.Q r5 = r8.f32923e
                int r5 = r5.f34160a
                long r5 = r9.a(r1, r5)
                r9 = 0
                r8.f32919a = r9
                r8.f32920b = r4
                java.lang.Object r9 = l6.X.c(r5, r8)
                if (r9 != r0) goto L5d
                return r0
            L5d:
                kotlin.jvm.internal.T r1 = r8.f32922d
                i3.e r9 = i3.AbstractC2982e.this
                com.stripe.android.model.StripeIntent r5 = r8.f32925g
                boolean r9 = i3.AbstractC2982e.h(r9, r5)
                if (r9 == 0) goto L80
                i3.e r9 = i3.AbstractC2982e.this
                java.lang.String r5 = r8.f32926h
                A2.j$c r6 = r8.f32927i
                i3.e$a r7 = i3.AbstractC2982e.f32890g
                java.util.List r7 = r7.a()
                r8.f32919a = r1
                r8.f32920b = r3
                java.lang.Object r9 = r9.q(r5, r6, r7, r8)
                if (r9 != r0) goto L97
                return r0
            L80:
                i3.e r9 = i3.AbstractC2982e.this
                java.lang.String r5 = r8.f32926h
                A2.j$c r6 = r8.f32927i
                i3.e$a r7 = i3.AbstractC2982e.f32890g
                java.util.List r7 = r7.a()
                r8.f32919a = r1
                r8.f32920b = r2
                java.lang.Object r9 = r9.s(r5, r6, r7, r8)
                if (r9 != r0) goto L97
                return r0
            L97:
                r1.f34162a = r9
                kotlin.jvm.internal.Q r9 = r8.f32923e
                int r1 = r9.f34160a
                int r1 = r1 + (-1)
                r9.f34160a = r1
                goto L2f
            La2:
                O5.I r9 = O5.I.f8278a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: i3.AbstractC2982e.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public /* synthetic */ AbstractC2982e(Context context, L5.a aVar, m mVar, InterfaceC4057d interfaceC4057d, S5.g gVar, B b8, AbstractC3247p abstractC3247p) {
        this(context, aVar, mVar, interfaceC4057d, gVar, b8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int n(StripeIntent stripeIntent, int i8) {
        int i9;
        StripeIntent.Status status = stripeIntent.getStatus();
        if (status == null) {
            i9 = -1;
        } else {
            i9 = b.f32899a[status.ordinal()];
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
    public final java.lang.Object r(com.stripe.android.model.StripeIntent r24, java.lang.String r25, A2.j.c r26, S5.d r27) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.AbstractC2982e.r(com.stripe.android.model.StripeIntent, java.lang.String, A2.j$c, S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean t(StripeIntent stripeIntent) {
        o.a aVar;
        o.p pVar;
        o r8 = stripeIntent.r();
        if (r8 != null && (pVar = r8.f25467e) != null) {
            aVar = pVar.b();
        } else {
            aVar = null;
        }
        return aVar instanceof o.a.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean u(StripeIntent stripeIntent, boolean z8) {
        if (z8 && stripeIntent.t()) {
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
            com.stripe.android.model.StripeIntent$Status r6 = com.stripe.android.model.StripeIntent.Status.f25205d
            if (r5 != r6) goto L29
            com.stripe.android.model.o r5 = r8.r()
            if (r5 == 0) goto L22
            com.stripe.android.model.o$p r5 = r5.f25467e
            goto L23
        L22:
            r5 = r3
        L23:
            com.stripe.android.model.o$p r6 = com.stripe.android.model.o.p.f25587i
            if (r5 != r6) goto L29
            r5 = 1
            goto L2a
        L29:
            r5 = 0
        L2a:
            if (r9 != r4) goto L4a
            com.stripe.android.model.StripeIntent$Status r9 = r8.getStatus()
            com.stripe.android.model.StripeIntent$Status r4 = com.stripe.android.model.StripeIntent.Status.f25206e
            if (r9 != r4) goto L4a
            com.stripe.android.model.o r9 = r8.r()
            if (r9 == 0) goto L3c
            com.stripe.android.model.o$p r3 = r9.f25467e
        L3c:
            com.stripe.android.model.o$p r9 = com.stripe.android.model.o.p.f25587i
            if (r3 != r9) goto L4a
            com.stripe.android.model.StripeIntent$NextActionType r9 = r8.k()
            com.stripe.android.model.StripeIntent$NextActionType r3 = com.stripe.android.model.StripeIntent.NextActionType.f25188d
            if (r9 != r3) goto L4a
            r9 = 1
            goto L4b
        L4a:
            r9 = 0
        L4b:
            boolean r3 = r8.t()
            if (r3 == 0) goto L69
            com.stripe.android.model.o r8 = r8.r()
            if (r8 == 0) goto L69
            com.stripe.android.model.o$p r8 = r8.f25467e
            if (r8 == 0) goto L69
            com.stripe.android.model.o$a r8 = r8.b()
            if (r8 == 0) goto L69
            boolean r8 = r8.T()
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
        throw new UnsupportedOperationException("Method not decompiled: i3.AbstractC2982e.v(com.stripe.android.model.StripeIntent, int):boolean");
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
        boolean t8 = stripeIntent.t();
        if (stripeIntent.getStatus() == StripeIntent.Status.f25205d) {
            o r8 = stripeIntent.r();
            if (r8 != null) {
                pVar = r8.f25467e;
            }
            if (pVar == o.p.f25587i) {
                z8 = true;
                if (t8 && !z8) {
                    return false;
                }
            }
        }
        z8 = false;
        return t8 ? true : true;
    }

    protected abstract Object l(String str, j.c cVar, String str2, S5.d dVar);

    protected abstract AbstractC3413K m(StripeIntent stripeIntent, int i8, String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public final m o() {
        return this.f32894b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(i3.C2980c r6, S5.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof i3.AbstractC2982e.c
            if (r0 == 0) goto L13
            r0 = r7
            i3.e$c r0 = (i3.AbstractC2982e.c) r0
            int r1 = r0.f32902c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32902c = r1
            goto L18
        L13:
            i3.e$c r0 = new i3.e$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f32900a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f32902c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            O5.t.b(r7)
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            O5.t.b(r7)
            S5.g r7 = r5.f32896d
            i3.e$d r2 = new i3.e$d
            r4 = 0
            r2.<init>(r6, r4)
            r0.f32902c = r3
            java.lang.Object r7 = l6.AbstractC3360i.g(r7, r2, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            O5.s r7 = (O5.s) r7
            java.lang.Object r6 = r7.j()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.AbstractC2982e.p(i3.c, S5.d):java.lang.Object");
    }

    protected abstract Object q(String str, j.c cVar, List list, S5.d dVar);

    protected abstract Object s(String str, j.c cVar, List list, S5.d dVar);

    private AbstractC2982e(Context context, L5.a aVar, m mVar, InterfaceC4057d interfaceC4057d, S5.g gVar, B b8) {
        this.f32893a = aVar;
        this.f32894b = mVar;
        this.f32895c = interfaceC4057d;
        this.f32896d = gVar;
        this.f32897e = b8;
        this.f32898f = new C2979b(context);
    }

    public /* synthetic */ AbstractC2982e(Context context, L5.a aVar, m mVar, InterfaceC4057d interfaceC4057d, S5.g gVar, B b8, int i8, AbstractC3247p abstractC3247p) {
        this(context, aVar, mVar, interfaceC4057d, gVar, (i8 & 32) != 0 ? new r() : b8, null);
    }
}
