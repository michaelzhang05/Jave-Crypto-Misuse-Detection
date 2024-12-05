package Q5;

import L5.t;
import P5.g;
import X5.n;
import X5.o;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.Z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class c {

    /* loaded from: classes5.dex */
    public static final class a extends j {

        /* renamed from: a, reason: collision with root package name */
        private int f8329a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f8330b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f8331c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(P5.d dVar, n nVar, Object obj) {
            super(dVar);
            this.f8330b = nVar;
            this.f8331c = obj;
            AbstractC3159y.g(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i8 = this.f8329a;
            if (i8 != 0) {
                if (i8 == 1) {
                    this.f8329a = 2;
                    t.b(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f8329a = 1;
            t.b(obj);
            AbstractC3159y.g(this.f8330b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            return ((n) Z.d(this.f8330b, 2)).invoke(this.f8331c, this);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        private int f8332a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f8333b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f8334c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(P5.d dVar, g gVar, n nVar, Object obj) {
            super(dVar, gVar);
            this.f8333b = nVar;
            this.f8334c = obj;
            AbstractC3159y.g(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i8 = this.f8332a;
            if (i8 != 0) {
                if (i8 == 1) {
                    this.f8332a = 2;
                    t.b(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f8332a = 1;
            t.b(obj);
            AbstractC3159y.g(this.f8333b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            return ((n) Z.d(this.f8333b, 2)).invoke(this.f8334c, this);
        }
    }

    /* renamed from: Q5.c$c, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0179c extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0179c(P5.d dVar) {
            super(dVar);
            AbstractC3159y.g(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            t.b(obj);
            return obj;
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(P5.d dVar, g gVar) {
            super(dVar, gVar);
            AbstractC3159y.g(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            t.b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static P5.d a(n nVar, Object obj, P5.d completion) {
        AbstractC3159y.i(nVar, "<this>");
        AbstractC3159y.i(completion, "completion");
        P5.d a8 = h.a(completion);
        if (nVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) nVar).create(obj, a8);
        }
        g context = a8.getContext();
        if (context == P5.h.f7994a) {
            return new a(a8, nVar, obj);
        }
        return new b(a8, context, nVar, obj);
    }

    private static final P5.d b(P5.d dVar) {
        g context = dVar.getContext();
        if (context == P5.h.f7994a) {
            return new C0179c(dVar);
        }
        return new d(dVar, context);
    }

    public static P5.d c(P5.d dVar) {
        kotlin.coroutines.jvm.internal.d dVar2;
        P5.d intercepted;
        AbstractC3159y.i(dVar, "<this>");
        if (dVar instanceof kotlin.coroutines.jvm.internal.d) {
            dVar2 = (kotlin.coroutines.jvm.internal.d) dVar;
        } else {
            dVar2 = null;
        }
        if (dVar2 != null && (intercepted = dVar2.intercepted()) != null) {
            return intercepted;
        }
        return dVar;
    }

    public static Object d(o oVar, Object obj, Object obj2, P5.d completion) {
        AbstractC3159y.i(oVar, "<this>");
        AbstractC3159y.i(completion, "completion");
        return ((o) Z.d(oVar, 3)).invoke(obj, obj2, b(h.a(completion)));
    }
}
