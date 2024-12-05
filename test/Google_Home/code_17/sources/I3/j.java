package i3;

import O5.s;
import android.content.Context;
import com.stripe.android.model.u;
import h3.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import m2.C3410H;
import u2.InterfaceC4057d;

/* loaded from: classes4.dex */
public final class j extends AbstractC2982e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f32944a;

        /* renamed from: c, reason: collision with root package name */
        int f32946c;

        a(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f32944a = obj;
            this.f32946c |= Integer.MIN_VALUE;
            Object l8 = j.this.l(null, null, null, this);
            if (l8 == T5.b.e()) {
                return l8;
            }
            return s.a(l8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f32947a;

        /* renamed from: c, reason: collision with root package name */
        int f32949c;

        b(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f32947a = obj;
            this.f32949c |= Integer.MIN_VALUE;
            Object q8 = j.this.q(null, null, null, this);
            if (q8 == T5.b.e()) {
                return q8;
            }
            return s.a(q8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f32950a;

        /* renamed from: c, reason: collision with root package name */
        int f32952c;

        c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f32950a = obj;
            this.f32952c |= Integer.MIN_VALUE;
            Object s8 = j.this.s(null, null, null, this);
            if (s8 == T5.b.e()) {
                return s8;
            }
            return s.a(s8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, final Function0 publishableKeyProvider, m stripeRepository, InterfaceC4057d logger, S5.g workContext) {
        super(context, new L5.a() { // from class: i3.i
            @Override // L5.a
            public final Object get() {
                String y8;
                y8 = j.y(Function0.this);
                return y8;
            }
        }, stripeRepository, logger, workContext, null, 32, null);
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3255y.i(stripeRepository, "stripeRepository");
        AbstractC3255y.i(logger, "logger");
        AbstractC3255y.i(workContext, "workContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String y(Function0 tmp0) {
        AbstractC3255y.i(tmp0, "$tmp0");
        return (String) tmp0.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // i3.AbstractC2982e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object l(java.lang.String r5, A2.j.c r6, java.lang.String r7, S5.d r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof i3.j.a
            if (r0 == 0) goto L13
            r0 = r8
            i3.j$a r0 = (i3.j.a) r0
            int r1 = r0.f32946c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32946c = r1
            goto L18
        L13:
            i3.j$a r0 = new i3.j$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f32944a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f32946c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            O5.t.b(r8)
            O5.s r8 = (O5.s) r8
            java.lang.Object r5 = r8.j()
            goto L47
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            O5.t.b(r8)
            h3.m r8 = r4.o()
            r0.f32946c = r3
            java.lang.Object r5 = r8.p(r5, r7, r6, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.j.l(java.lang.String, A2.j$c, java.lang.String, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // i3.AbstractC2982e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object q(java.lang.String r4, A2.j.c r5, java.util.List r6, S5.d r7) {
        /*
            r3 = this;
            boolean r6 = r7 instanceof i3.j.b
            if (r6 == 0) goto L13
            r6 = r7
            i3.j$b r6 = (i3.j.b) r6
            int r0 = r6.f32949c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.f32949c = r0
            goto L18
        L13:
            i3.j$b r6 = new i3.j$b
            r6.<init>(r7)
        L18:
            java.lang.Object r7 = r6.f32947a
            java.lang.Object r0 = T5.b.e()
            int r1 = r6.f32949c
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            O5.t.b(r7)
            O5.s r7 = (O5.s) r7
            java.lang.Object r4 = r7.j()
            goto L47
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            O5.t.b(r7)
            h3.m r7 = r3.o()
            r6.f32949c = r2
            java.lang.Object r4 = r7.B(r4, r5, r6)
            if (r4 != r0) goto L47
            return r0
        L47:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.j.q(java.lang.String, A2.j$c, java.util.List, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // i3.AbstractC2982e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object s(java.lang.String r5, A2.j.c r6, java.util.List r7, S5.d r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof i3.j.c
            if (r0 == 0) goto L13
            r0 = r8
            i3.j$c r0 = (i3.j.c) r0
            int r1 = r0.f32952c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32952c = r1
            goto L18
        L13:
            i3.j$c r0 = new i3.j$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f32950a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f32952c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            O5.t.b(r8)
            O5.s r8 = (O5.s) r8
            java.lang.Object r5 = r8.j()
            goto L47
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            O5.t.b(r8)
            h3.m r8 = r4.o()
            r0.f32952c = r3
            java.lang.Object r5 = r8.b(r5, r6, r7, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.j.s(java.lang.String, A2.j$c, java.util.List, S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // i3.AbstractC2982e
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public C3410H m(u stripeIntent, int i8, String str) {
        AbstractC3255y.i(stripeIntent, "stripeIntent");
        return new C3410H(stripeIntent, i8, str);
    }
}
