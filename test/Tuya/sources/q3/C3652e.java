package q3;

import L5.I;
import L5.InterfaceC1227k;
import android.content.Context;
import android.content.SharedPreferences;
import i6.AbstractC2825i;
import i6.M;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import y3.AbstractC3991f;
import y3.i;

/* renamed from: q3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3652e implements q {

    /* renamed from: e, reason: collision with root package name */
    public static final a f37317e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f37318f = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Context f37319a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37320b;

    /* renamed from: c, reason: collision with root package name */
    private final P5.g f37321c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1227k f37322d;

    /* renamed from: q3.e$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: q3.e$b */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f37323a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f37325c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f37326d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, boolean z9, P5.d dVar) {
            super(2, dVar);
            this.f37325c = z8;
            this.f37326d = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f37325c, this.f37326d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
        
            if (r8.f37326d != false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
        
            r1 = r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
        
            if (r8.f37325c != false) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                Q5.b.e()
                int r0 = r8.f37323a
                if (r0 != 0) goto L88
                L5.t.b(r9)
                q3.e r9 = q3.C3652e.this
                android.content.SharedPreferences r9 = q3.C3652e.e(r9)
                q3.e r0 = q3.C3652e.this
                java.lang.String r0 = q3.C3652e.d(r0)
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
                java.util.List r9 = g6.n.s0(r2, r3, r4, r5, r6, r7)
                java.lang.Object r0 = M5.AbstractC1246t.o0(r9)
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
                y3.i$b r9 = y3.i.b.f39833a
                boolean r0 = r8.f37326d
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
                java.lang.Object r9 = M5.AbstractC1246t.p0(r9, r0)
                java.lang.String r9 = (java.lang.String) r9
                if (r9 == 0) goto L83
                y3.i$d r1 = new y3.i$d
                r1.<init>(r9)
                goto L83
            L73:
                java.lang.String r9 = "google_pay"
                boolean r9 = r0.equals(r9)
                if (r9 != 0) goto L7c
                goto L83
            L7c:
                y3.i$a r9 = y3.i.a.f39832a
                boolean r0 = r8.f37325c
                if (r0 == 0) goto L83
                goto L59
            L83:
                if (r1 != 0) goto L87
                y3.i$c r1 = y3.i.c.f39834a
            L87:
                return r1
            L88:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: q3.C3652e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: q3.e$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            return C3652e.this.f37319a.getSharedPreferences("DefaultPrefsRepository", 0);
        }
    }

    public C3652e(Context context, String str, P5.g workContext) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(workContext, "workContext");
        this.f37319a = context;
        this.f37320b = str;
        this.f37321c = workContext;
        this.f37322d = L5.l.b(new c());
    }

    private final void f(String str) {
        h().edit().putString(g(), str).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String g() {
        String str = this.f37320b;
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
        Object value = this.f37322d.getValue();
        AbstractC3159y.h(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    @Override // q3.q
    public void a(AbstractC3991f abstractC3991f) {
        y3.i iVar;
        String str = null;
        if (abstractC3991f != null) {
            iVar = y3.j.a(abstractC3991f);
        } else {
            iVar = null;
        }
        if (AbstractC3159y.d(iVar, i.a.f39832a)) {
            str = "google_pay";
        } else if (AbstractC3159y.d(iVar, i.b.f39833a)) {
            str = "link";
        } else if (iVar instanceof i.d) {
            str = "payment_method:" + ((i.d) iVar).getId();
        }
        if (str != null) {
            f(str);
        }
    }

    @Override // q3.q
    public Object b(boolean z8, boolean z9, P5.d dVar) {
        return AbstractC2825i.g(this.f37321c, new b(z8, z9, null), dVar);
    }
}
