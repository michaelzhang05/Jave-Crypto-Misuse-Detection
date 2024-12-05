package l6;

import M5.AbstractC1246t;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l6.J, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3348J implements InterfaceC3344F {

    /* renamed from: b, reason: collision with root package name */
    private final long f34597b;

    /* renamed from: c, reason: collision with root package name */
    private final long f34598c;

    /* renamed from: l6.J$a */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        int f34599a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f34600b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ int f34601c;

        a(P5.d dVar) {
            super(3, dVar);
        }

        public final Object g(InterfaceC3359g interfaceC3359g, int i8, P5.d dVar) {
            a aVar = new a(dVar);
            aVar.f34600b = interfaceC3359g;
            aVar.f34601c = i8;
            return aVar.invokeSuspend(L5.I.f6487a);
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return g((InterfaceC3359g) obj, ((Number) obj2).intValue(), (P5.d) obj3);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x009b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x008d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = Q5.b.e()
                int r1 = r9.f34599a
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3c
                if (r1 == r6) goto L38
                if (r1 == r5) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L38
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                java.lang.Object r1 = r9.f34600b
                l6.g r1 = (l6.InterfaceC3359g) r1
                L5.t.b(r10)
                goto L8e
            L28:
                java.lang.Object r1 = r9.f34600b
                l6.g r1 = (l6.InterfaceC3359g) r1
                L5.t.b(r10)
                goto L7d
            L30:
                java.lang.Object r1 = r9.f34600b
                l6.g r1 = (l6.InterfaceC3359g) r1
                L5.t.b(r10)
                goto L64
            L38:
                L5.t.b(r10)
                goto L9c
            L3c:
                L5.t.b(r10)
                java.lang.Object r10 = r9.f34600b
                r1 = r10
                l6.g r1 = (l6.InterfaceC3359g) r1
                int r10 = r9.f34601c
                if (r10 <= 0) goto L53
                l6.D r10 = l6.EnumC3342D.START
                r9.f34599a = r6
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L53:
                l6.J r10 = l6.C3348J.this
                long r6 = l6.C3348J.c(r10)
                r9.f34600b = r1
                r9.f34599a = r5
                java.lang.Object r10 = i6.X.b(r6, r9)
                if (r10 != r0) goto L64
                return r0
            L64:
                l6.J r10 = l6.C3348J.this
                long r5 = l6.C3348J.b(r10)
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L8e
                l6.D r10 = l6.EnumC3342D.STOP
                r9.f34600b = r1
                r9.f34599a = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L7d
                return r0
            L7d:
                l6.J r10 = l6.C3348J.this
                long r4 = l6.C3348J.b(r10)
                r9.f34600b = r1
                r9.f34599a = r3
                java.lang.Object r10 = i6.X.b(r4, r9)
                if (r10 != r0) goto L8e
                return r0
            L8e:
                l6.D r10 = l6.EnumC3342D.STOP_AND_RESET_REPLAY_CACHE
                r3 = 0
                r9.f34600b = r3
                r9.f34599a = r2
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L9c:
                L5.I r10 = L5.I.f6487a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: l6.C3348J.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: l6.J$b */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f34603a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f34604b;

        b(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            b bVar = new b(dVar);
            bVar.f34604b = obj;
            return bVar;
        }

        @Override // X5.n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(EnumC3342D enumC3342D, P5.d dVar) {
            return ((b) create(enumC3342D, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            Q5.b.e();
            if (this.f34603a == 0) {
                L5.t.b(obj);
                if (((EnumC3342D) this.f34604b) != EnumC3342D.START) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                return kotlin.coroutines.jvm.internal.b.a(z8);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C3348J(long j8, long j9) {
        this.f34597b = j8;
        this.f34598c = j9;
        if (j8 >= 0) {
            if (j9 >= 0) {
                return;
            }
            throw new IllegalArgumentException(("replayExpiration(" + j9 + " ms) cannot be negative").toString());
        }
        throw new IllegalArgumentException(("stopTimeout(" + j8 + " ms) cannot be negative").toString());
    }

    @Override // l6.InterfaceC3344F
    public InterfaceC3358f a(InterfaceC3349K interfaceC3349K) {
        return AbstractC3360h.n(AbstractC3360h.p(AbstractC3360h.K(interfaceC3349K, new a(null)), new b(null)));
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3348J) {
            C3348J c3348j = (C3348J) obj;
            if (this.f34597b == c3348j.f34597b && this.f34598c == c3348j.f34598c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (androidx.collection.a.a(this.f34597b) * 31) + androidx.collection.a.a(this.f34598c);
    }

    public String toString() {
        List d8 = AbstractC1246t.d(2);
        if (this.f34597b > 0) {
            d8.add("stopTimeout=" + this.f34597b + "ms");
        }
        if (this.f34598c < Long.MAX_VALUE) {
            d8.add("replayExpiration=" + this.f34598c + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + AbstractC1246t.w0(AbstractC1246t.a(d8), null, null, null, 0, null, null, 63, null) + ')';
    }
}
