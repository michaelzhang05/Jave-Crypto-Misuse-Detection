package k6;

import L5.I;
import L5.s;
import i6.AbstractC2825i;
import i6.M;
import k6.h;

/* loaded from: classes5.dex */
abstract /* synthetic */ class l {

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f33620a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f33621b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ v f33622c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f33623d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v vVar, Object obj, P5.d dVar) {
            super(2, dVar);
            this.f33622c = vVar;
            this.f33623d = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            a aVar = new a(this.f33622c, this.f33623d, dVar);
            aVar.f33621b = obj;
            return aVar;
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b8;
            Object a8;
            Object e8 = Q5.b.e();
            int i8 = this.f33620a;
            try {
                if (i8 != 0) {
                    if (i8 == 1) {
                        L5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    L5.t.b(obj);
                    v vVar = this.f33622c;
                    Object obj2 = this.f33623d;
                    s.a aVar = L5.s.f6511b;
                    this.f33620a = 1;
                    if (vVar.i(obj2, this) == e8) {
                        return e8;
                    }
                }
                b8 = L5.s.b(I.f6487a);
            } catch (Throwable th) {
                s.a aVar2 = L5.s.f6511b;
                b8 = L5.s.b(L5.t.a(th));
            }
            if (L5.s.h(b8)) {
                a8 = h.f33614b.c(I.f6487a);
            } else {
                a8 = h.f33614b.a(L5.s.e(b8));
            }
            return h.b(a8);
        }
    }

    public static final Object a(v vVar, Object obj) {
        Object y8 = vVar.y(obj);
        if (!(y8 instanceof h.c)) {
            return h.f33614b.c(I.f6487a);
        }
        return ((h) AbstractC2825i.f(null, new a(vVar, obj, null), 1, null)).k();
    }
}
