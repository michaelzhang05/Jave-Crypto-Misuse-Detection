package o6;

import O5.C1352h;
import a6.InterfaceC1668n;

/* renamed from: o6.J, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C3696J implements InterfaceC3693G {

    /* renamed from: o6.J$a */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f36590a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f36591b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3698L f36592c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o6.J$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0812a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.O f36593a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3707g f36594b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: o6.J$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0813a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f36595a;

                /* renamed from: c, reason: collision with root package name */
                int f36597c;

                C0813a(S5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f36595a = obj;
                    this.f36597c |= Integer.MIN_VALUE;
                    return C0812a.this.a(0, this);
                }
            }

            C0812a(kotlin.jvm.internal.O o8, InterfaceC3707g interfaceC3707g) {
                this.f36593a = o8;
                this.f36594b = interfaceC3707g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(int r5, S5.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof o6.C3696J.a.C0812a.C0813a
                    if (r0 == 0) goto L13
                    r0 = r6
                    o6.J$a$a$a r0 = (o6.C3696J.a.C0812a.C0813a) r0
                    int r1 = r0.f36597c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f36597c = r1
                    goto L18
                L13:
                    o6.J$a$a$a r0 = new o6.J$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f36595a
                    java.lang.Object r1 = T5.b.e()
                    int r2 = r0.f36597c
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    O5.t.b(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    O5.t.b(r6)
                    if (r5 <= 0) goto L4e
                    kotlin.jvm.internal.O r5 = r4.f36593a
                    boolean r6 = r5.f34158a
                    if (r6 != 0) goto L4e
                    r5.f34158a = r3
                    o6.g r5 = r4.f36594b
                    o6.E r6 = o6.EnumC3691E.START
                    r0.f36597c = r3
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    O5.I r5 = O5.I.f8278a
                    return r5
                L4e:
                    O5.I r5 = O5.I.f8278a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: o6.C3696J.a.C0812a.a(int, S5.d):java.lang.Object");
            }

            @Override // o6.InterfaceC3707g
            public /* bridge */ /* synthetic */ Object emit(Object obj, S5.d dVar) {
                return a(((Number) obj).intValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3698L interfaceC3698L, S5.d dVar) {
            super(2, dVar);
            this.f36592c = interfaceC3698L;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            a aVar = new a(this.f36592c, dVar);
            aVar.f36591b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f36590a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3707g interfaceC3707g = (InterfaceC3707g) this.f36591b;
                kotlin.jvm.internal.O o8 = new kotlin.jvm.internal.O();
                InterfaceC3698L interfaceC3698L = this.f36592c;
                C0812a c0812a = new C0812a(o8, interfaceC3707g);
                this.f36590a = 1;
                if (interfaceC3698L.collect(c0812a, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(InterfaceC3707g interfaceC3707g, S5.d dVar) {
            return ((a) create(interfaceC3707g, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    @Override // o6.InterfaceC3693G
    public InterfaceC3706f a(InterfaceC3698L interfaceC3698L) {
        return AbstractC3708h.z(new a(interfaceC3698L, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
