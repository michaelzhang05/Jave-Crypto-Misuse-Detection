package t3;

import B3.i;
import O5.I;
import O5.InterfaceC1355k;
import a6.InterfaceC1668n;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3360i;
import l6.M;

/* renamed from: t3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4031e implements q {

    /* renamed from: e, reason: collision with root package name */
    public static final a f39639e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f39640f = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Context f39641a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39642b;

    /* renamed from: c, reason: collision with root package name */
    private final S5.g f39643c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1355k f39644d;

    /* renamed from: t3.e$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: t3.e$b */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f39645a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f39647c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f39648d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, boolean z9, S5.d dVar) {
            super(2, dVar);
            this.f39647c = z8;
            this.f39648d = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f39647c, this.f39648d, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
        
            if (r8.f39648d != false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
        
            r1 = r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
        
            if (r8.f39647c != false) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                T5.b.e()
                int r0 = r8.f39645a
                if (r0 != 0) goto L88
                O5.t.b(r9)
                t3.e r9 = t3.C4031e.this
                android.content.SharedPreferences r9 = t3.C4031e.e(r9)
                t3.e r0 = t3.C4031e.this
                java.lang.String r0 = t3.C4031e.d(r0)
                r1 = 0
                java.lang.String r9 = r9.getString(r0, r1)
                if (r9 != 0) goto L1f
                java.lang.String r9 = ""
            L1f:
                r2 = r9
                java.lang.String r9 = ":"
                java.lang.String[] r3 = new java.lang.String[]{r9}
                r6 = 6
                r7 = 0
                r4 = 0
                r5 = 0
                java.util.List r9 = j6.n.s0(r2, r3, r4, r5, r6, r7)
                java.lang.Object r0 = P5.AbstractC1378t.o0(r9)
                java.lang.String r0 = (java.lang.String) r0
                if (r0 == 0) goto L83
                int r2 = r0.hashCode()
                r3 = -1534821982(0xffffffffa48479a2, float:-5.745193E-17)
                if (r2 == r3) goto L73
                r3 = -1029412550(0xffffffffc2a4693a, float:-82.20552)
                if (r2 == r3) goto L5b
                r9 = 3321850(0x32affa, float:4.654903E-39)
                if (r2 == r9) goto L4a
                goto L83
            L4a:
                java.lang.String r9 = "link"
                boolean r9 = r0.equals(r9)
                if (r9 != 0) goto L53
                goto L83
            L53:
                B3.i$b r9 = B3.i.b.f877a
                boolean r0 = r8.f39648d
                if (r0 == 0) goto L83
            L59:
                r1 = r9
                goto L83
            L5b:
                java.lang.String r2 = "payment_method"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L64
                goto L83
            L64:
                r0 = 1
                java.lang.Object r9 = P5.AbstractC1378t.p0(r9, r0)
                java.lang.String r9 = (java.lang.String) r9
                if (r9 == 0) goto L83
                B3.i$d r1 = new B3.i$d
                r1.<init>(r9)
                goto L83
            L73:
                java.lang.String r9 = "google_pay"
                boolean r9 = r0.equals(r9)
                if (r9 != 0) goto L7c
                goto L83
            L7c:
                B3.i$a r9 = B3.i.a.f876a
                boolean r0 = r8.f39647c
                if (r0 == 0) goto L83
                goto L59
            L83:
                if (r1 != 0) goto L87
                B3.i$c r1 = B3.i.c.f878a
            L87:
                return r1
            L88:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: t3.C4031e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* renamed from: t3.e$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            return C4031e.this.f39641a.getSharedPreferences("DefaultPrefsRepository", 0);
        }
    }

    public C4031e(Context context, String str, S5.g workContext) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(workContext, "workContext");
        this.f39641a = context;
        this.f39642b = str;
        this.f39643c = workContext;
        this.f39644d = O5.l.b(new c());
    }

    private final void f(String str) {
        h().edit().putString(g(), str).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String g() {
        String str = this.f39642b;
        if (str != null) {
            String str2 = "customer[" + str + "]";
            if (str2 != null) {
                return str2;
            }
        }
        return "guest";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences h() {
        Object value = this.f39644d.getValue();
        AbstractC3255y.h(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    @Override // t3.q
    public void a(B3.f fVar) {
        B3.i iVar;
        String str = null;
        if (fVar != null) {
            iVar = B3.j.a(fVar);
        } else {
            iVar = null;
        }
        if (AbstractC3255y.d(iVar, i.a.f876a)) {
            str = "google_pay";
        } else if (AbstractC3255y.d(iVar, i.b.f877a)) {
            str = "link";
        } else if (iVar instanceof i.d) {
            str = "payment_method:" + ((i.d) iVar).getId();
        }
        if (str != null) {
            f(str);
        }
    }

    @Override // t3.q
    public Object b(boolean z8, boolean z9, S5.d dVar) {
        return AbstractC3360i.g(this.f39643c, new b(z8, z9, null), dVar);
    }
}
