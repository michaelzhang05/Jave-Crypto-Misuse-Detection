package p6;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import l6.M;
import n6.v;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;

/* loaded from: classes5.dex */
public abstract class k {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f37935a;

        /* renamed from: b, reason: collision with root package name */
        Object f37936b;

        /* renamed from: c, reason: collision with root package name */
        int f37937c;

        /* renamed from: d, reason: collision with root package name */
        int f37938d;

        /* renamed from: e, reason: collision with root package name */
        int f37939e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f37940f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC3706f[] f37941g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f37942h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC1669o f37943i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC3707g f37944j;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: p6.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0857a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f37945a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3706f[] f37946b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f37947c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AtomicInteger f37948d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ n6.d f37949e;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: p6.k$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0858a implements InterfaceC3707g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ n6.d f37950a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ int f37951b;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: p6.k$a$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes5.dex */
                public static final class C0859a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f37952a;

                    /* renamed from: c, reason: collision with root package name */
                    int f37954c;

                    C0859a(S5.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f37952a = obj;
                        this.f37954c |= Integer.MIN_VALUE;
                        return C0858a.this.emit(null, this);
                    }
                }

                C0858a(n6.d dVar, int i8) {
                    this.f37950a = dVar;
                    this.f37951b = i8;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // o6.InterfaceC3707g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, S5.d r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof p6.k.a.C0857a.C0858a.C0859a
                        if (r0 == 0) goto L13
                        r0 = r8
                        p6.k$a$a$a$a r0 = (p6.k.a.C0857a.C0858a.C0859a) r0
                        int r1 = r0.f37954c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f37954c = r1
                        goto L18
                    L13:
                        p6.k$a$a$a$a r0 = new p6.k$a$a$a$a
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f37952a
                        java.lang.Object r1 = T5.b.e()
                        int r2 = r0.f37954c
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L38
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        O5.t.b(r8)
                        goto L56
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        O5.t.b(r8)
                        goto L4d
                    L38:
                        O5.t.b(r8)
                        n6.d r8 = r6.f37950a
                        P5.K r2 = new P5.K
                        int r5 = r6.f37951b
                        r2.<init>(r5, r7)
                        r0.f37954c = r4
                        java.lang.Object r7 = r8.d(r2, r0)
                        if (r7 != r1) goto L4d
                        return r1
                    L4d:
                        r0.f37954c = r3
                        java.lang.Object r7 = l6.g1.a(r0)
                        if (r7 != r1) goto L56
                        return r1
                    L56:
                        O5.I r7 = O5.I.f8278a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p6.k.a.C0857a.C0858a.emit(java.lang.Object, S5.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0857a(InterfaceC3706f[] interfaceC3706fArr, int i8, AtomicInteger atomicInteger, n6.d dVar, S5.d dVar2) {
                super(2, dVar2);
                this.f37946b = interfaceC3706fArr;
                this.f37947c = i8;
                this.f37948d = atomicInteger;
                this.f37949e = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0857a(this.f37946b, this.f37947c, this.f37948d, this.f37949e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AtomicInteger atomicInteger;
                Object e8 = T5.b.e();
                int i8 = this.f37945a;
                try {
                    if (i8 != 0) {
                        if (i8 == 1) {
                            O5.t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        O5.t.b(obj);
                        InterfaceC3706f[] interfaceC3706fArr = this.f37946b;
                        int i9 = this.f37947c;
                        InterfaceC3706f interfaceC3706f = interfaceC3706fArr[i9];
                        C0858a c0858a = new C0858a(this.f37949e, i9);
                        this.f37945a = 1;
                        if (interfaceC3706f.collect(c0858a, this) == e8) {
                            return e8;
                        }
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        v.a.a(this.f37949e, null, 1, null);
                    }
                    return I.f8278a;
                } finally {
                    if (this.f37948d.decrementAndGet() == 0) {
                        v.a.a(this.f37949e, null, 1, null);
                    }
                }
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0857a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3706f[] interfaceC3706fArr, Function0 function0, InterfaceC1669o interfaceC1669o, InterfaceC3707g interfaceC3707g, S5.d dVar) {
            super(2, dVar);
            this.f37941g = interfaceC3706fArr;
            this.f37942h = function0;
            this.f37943i = interfaceC1669o;
            this.f37944j = interfaceC3707g;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            a aVar = new a(this.f37941g, this.f37942h, this.f37943i, this.f37944j, dVar);
            aVar.f37940f = obj;
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00bc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00f0  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ee A[EDGE_INSN: B:38:0x00ee->B:27:0x00ee BREAK  A[LOOP:0: B:19:0x00c9->B:37:?], SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r2v7, types: [int] */
        /* JADX WARN: Type inference failed for: r2v9, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0134 -> B:10:0x0136). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 313
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p6.k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public static final Object a(InterfaceC3707g interfaceC3707g, InterfaceC3706f[] interfaceC3706fArr, Function0 function0, InterfaceC1669o interfaceC1669o, S5.d dVar) {
        Object a8 = n.a(new a(interfaceC3706fArr, function0, interfaceC1669o, interfaceC3707g, null), dVar);
        if (a8 == T5.b.e()) {
            return a8;
        }
        return I.f8278a;
    }
}
