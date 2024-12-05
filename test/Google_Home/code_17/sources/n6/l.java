package n6;

import O5.I;
import O5.s;
import a6.InterfaceC1668n;
import l6.AbstractC3360i;
import l6.M;
import n6.h;

/* loaded from: classes5.dex */
abstract /* synthetic */ class l {

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f35612a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f35613b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ v f35614c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f35615d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v vVar, Object obj, S5.d dVar) {
            super(2, dVar);
            this.f35614c = vVar;
            this.f35615d = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            a aVar = new a(this.f35614c, this.f35615d, dVar);
            aVar.f35613b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b8;
            Object a8;
            Object e8 = T5.b.e();
            int i8 = this.f35612a;
            try {
                if (i8 != 0) {
                    if (i8 == 1) {
                        O5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    O5.t.b(obj);
                    v vVar = this.f35614c;
                    Object obj2 = this.f35615d;
                    s.a aVar = O5.s.f8302b;
                    this.f35612a = 1;
                    if (vVar.d(obj2, this) == e8) {
                        return e8;
                    }
                }
                b8 = O5.s.b(I.f8278a);
            } catch (Throwable th) {
                s.a aVar2 = O5.s.f8302b;
                b8 = O5.s.b(O5.t.a(th));
            }
            if (O5.s.h(b8)) {
                a8 = h.f35606b.c(I.f8278a);
            } else {
                a8 = h.f35606b.a(O5.s.e(b8));
            }
            return h.b(a8);
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public static final Object a(v vVar, Object obj) {
        Object w8 = vVar.w(obj);
        if (!(w8 instanceof h.c)) {
            return h.f35606b.c(I.f8278a);
        }
        return ((h) AbstractC3360i.f(null, new a(vVar, obj, null), 1, null)).k();
    }
}
