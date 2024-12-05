package o6;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o6.K, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3697K implements InterfaceC3693G {

    /* renamed from: b, reason: collision with root package name */
    private final long f36598b;

    /* renamed from: c, reason: collision with root package name */
    private final long f36599c;

    /* renamed from: o6.K$a */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        int f36600a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f36601b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ int f36602c;

        a(S5.d dVar) {
            super(3, dVar);
        }

        public final Object a(InterfaceC3707g interfaceC3707g, int i8, S5.d dVar) {
            a aVar = new a(dVar);
            aVar.f36601b = interfaceC3707g;
            aVar.f36602c = i8;
            return aVar.invokeSuspend(O5.I.f8278a);
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((InterfaceC3707g) obj, ((Number) obj2).intValue(), (S5.d) obj3);
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
                java.lang.Object r0 = T5.b.e()
                int r1 = r9.f36600a
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
                java.lang.Object r1 = r9.f36601b
                o6.g r1 = (o6.InterfaceC3707g) r1
                O5.t.b(r10)
                goto L8e
            L28:
                java.lang.Object r1 = r9.f36601b
                o6.g r1 = (o6.InterfaceC3707g) r1
                O5.t.b(r10)
                goto L7d
            L30:
                java.lang.Object r1 = r9.f36601b
                o6.g r1 = (o6.InterfaceC3707g) r1
                O5.t.b(r10)
                goto L64
            L38:
                O5.t.b(r10)
                goto L9c
            L3c:
                O5.t.b(r10)
                java.lang.Object r10 = r9.f36601b
                r1 = r10
                o6.g r1 = (o6.InterfaceC3707g) r1
                int r10 = r9.f36602c
                if (r10 <= 0) goto L53
                o6.E r10 = o6.EnumC3691E.START
                r9.f36600a = r6
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L53:
                o6.K r10 = o6.C3697K.this
                long r6 = o6.C3697K.c(r10)
                r9.f36601b = r1
                r9.f36600a = r5
                java.lang.Object r10 = l6.X.b(r6, r9)
                if (r10 != r0) goto L64
                return r0
            L64:
                o6.K r10 = o6.C3697K.this
                long r5 = o6.C3697K.b(r10)
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L8e
                o6.E r10 = o6.EnumC3691E.STOP
                r9.f36601b = r1
                r9.f36600a = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L7d
                return r0
            L7d:
                o6.K r10 = o6.C3697K.this
                long r4 = o6.C3697K.b(r10)
                r9.f36601b = r1
                r9.f36600a = r3
                java.lang.Object r10 = l6.X.b(r4, r9)
                if (r10 != r0) goto L8e
                return r0
            L8e:
                o6.E r10 = o6.EnumC3691E.STOP_AND_RESET_REPLAY_CACHE
                r3 = 0
                r9.f36601b = r3
                r9.f36600a = r2
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L9c:
                O5.I r10 = O5.I.f8278a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: o6.C3697K.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: o6.K$b */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f36604a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f36605b;

        b(S5.d dVar) {
            super(2, dVar);
        }

        @Override // a6.InterfaceC1668n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(EnumC3691E enumC3691E, S5.d dVar) {
            return ((b) create(enumC3691E, dVar)).invokeSuspend(O5.I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            b bVar = new b(dVar);
            bVar.f36605b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            T5.b.e();
            if (this.f36604a == 0) {
                O5.t.b(obj);
                if (((EnumC3691E) this.f36605b) != EnumC3691E.START) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                return kotlin.coroutines.jvm.internal.b.a(z8);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C3697K(long j8, long j9) {
        this.f36598b = j8;
        this.f36599c = j9;
        if (j8 >= 0) {
            if (j9 >= 0) {
                return;
            }
            throw new IllegalArgumentException(("replayExpiration(" + j9 + " ms) cannot be negative").toString());
        }
        throw new IllegalArgumentException(("stopTimeout(" + j8 + " ms) cannot be negative").toString());
    }

    @Override // o6.InterfaceC3693G
    public InterfaceC3706f a(InterfaceC3698L interfaceC3698L) {
        return AbstractC3708h.p(AbstractC3708h.r(AbstractC3708h.M(interfaceC3698L, new a(null)), new b(null)));
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3697K) {
            C3697K c3697k = (C3697K) obj;
            if (this.f36598b == c3697k.f36598b && this.f36599c == c3697k.f36599c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (androidx.collection.a.a(this.f36598b) * 31) + androidx.collection.a.a(this.f36599c);
    }

    public String toString() {
        List d8 = AbstractC1378t.d(2);
        if (this.f36598b > 0) {
            d8.add("stopTimeout=" + this.f36598b + "ms");
        }
        if (this.f36599c < Long.MAX_VALUE) {
            d8.add("replayExpiration=" + this.f36599c + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + AbstractC1378t.w0(AbstractC1378t.a(d8), null, null, null, 0, null, null, 63, null) + ')';
    }
}
