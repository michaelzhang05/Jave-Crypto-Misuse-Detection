package o6;

import a6.InterfaceC1668n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.T;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o6.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3705e implements InterfaceC3706f {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3706f f36633a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f36634b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1668n f36635c;

    /* renamed from: o6.e$a */
    /* loaded from: classes5.dex */
    static final class a implements InterfaceC3707g {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f36637b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3707g f36638c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o6.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0815a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f36639a;

            /* renamed from: c, reason: collision with root package name */
            int f36641c;

            C0815a(S5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f36639a = obj;
                this.f36641c |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        a(T t8, InterfaceC3707g interfaceC3707g) {
            this.f36637b = t8;
            this.f36638c = interfaceC3707g;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // o6.InterfaceC3707g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r6, S5.d r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof o6.C3705e.a.C0815a
                if (r0 == 0) goto L13
                r0 = r7
                o6.e$a$a r0 = (o6.C3705e.a.C0815a) r0
                int r1 = r0.f36641c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f36641c = r1
                goto L18
            L13:
                o6.e$a$a r0 = new o6.e$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f36639a
                java.lang.Object r1 = T5.b.e()
                int r2 = r0.f36641c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                O5.t.b(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                O5.t.b(r7)
                o6.e r7 = o6.C3705e.this
                kotlin.jvm.functions.Function1 r7 = r7.f36634b
                java.lang.Object r7 = r7.invoke(r6)
                kotlin.jvm.internal.T r2 = r5.f36637b
                java.lang.Object r2 = r2.f34162a
                q6.F r4 = p6.s.f37960a
                if (r2 == r4) goto L58
                o6.e r4 = o6.C3705e.this
                a6.n r4 = r4.f36635c
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                O5.I r6 = O5.I.f8278a
                return r6
            L58:
                kotlin.jvm.internal.T r2 = r5.f36637b
                r2.f34162a = r7
                o6.g r7 = r5.f36638c
                r0.f36641c = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                O5.I r6 = O5.I.f8278a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o6.C3705e.a.emit(java.lang.Object, S5.d):java.lang.Object");
        }
    }

    public C3705e(InterfaceC3706f interfaceC3706f, Function1 function1, InterfaceC1668n interfaceC1668n) {
        this.f36633a = interfaceC3706f;
        this.f36634b = function1;
        this.f36635c = interfaceC1668n;
    }

    @Override // o6.InterfaceC3706f
    public Object collect(InterfaceC3707g interfaceC3707g, S5.d dVar) {
        T t8 = new T();
        t8.f34162a = p6.s.f37960a;
        Object collect = this.f36633a.collect(new a(t8, interfaceC3707g), dVar);
        if (collect == T5.b.e()) {
            return collect;
        }
        return O5.I.f8278a;
    }
}
