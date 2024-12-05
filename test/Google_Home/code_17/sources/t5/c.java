package T5;

import O5.t;
import S5.g;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.Z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class c {

    /* loaded from: classes5.dex */
    public static final class a extends j {

        /* renamed from: a, reason: collision with root package name */
        private int f10126a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f10127b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f10128c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(S5.d dVar, InterfaceC1668n interfaceC1668n, Object obj) {
            super(dVar);
            this.f10127b = interfaceC1668n;
            this.f10128c = obj;
            AbstractC3255y.g(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i8 = this.f10126a;
            if (i8 != 0) {
                if (i8 == 1) {
                    this.f10126a = 2;
                    t.b(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f10126a = 1;
            t.b(obj);
            AbstractC3255y.g(this.f10127b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            return ((InterfaceC1668n) Z.d(this.f10127b, 2)).invoke(this.f10128c, this);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        private int f10129a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f10130b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f10131c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(S5.d dVar, g gVar, InterfaceC1668n interfaceC1668n, Object obj) {
            super(dVar, gVar);
            this.f10130b = interfaceC1668n;
            this.f10131c = obj;
            AbstractC3255y.g(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i8 = this.f10129a;
            if (i8 != 0) {
                if (i8 == 1) {
                    this.f10129a = 2;
                    t.b(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f10129a = 1;
            t.b(obj);
            AbstractC3255y.g(this.f10130b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            return ((InterfaceC1668n) Z.d(this.f10130b, 2)).invoke(this.f10131c, this);
        }
    }

    /* renamed from: T5.c$c, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0205c extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0205c(S5.d dVar) {
            super(dVar);
            AbstractC3255y.g(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
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
        d(S5.d dVar, g gVar) {
            super(dVar, gVar);
            AbstractC3255y.g(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            t.b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static S5.d a(InterfaceC1668n interfaceC1668n, Object obj, S5.d completion) {
        AbstractC3255y.i(interfaceC1668n, "<this>");
        AbstractC3255y.i(completion, "completion");
        S5.d a8 = h.a(completion);
        if (interfaceC1668n instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) interfaceC1668n).create(obj, a8);
        }
        g context = a8.getContext();
        if (context == S5.h.f9825a) {
            return new a(a8, interfaceC1668n, obj);
        }
        return new b(a8, context, interfaceC1668n, obj);
    }

    private static final S5.d b(S5.d dVar) {
        g context = dVar.getContext();
        if (context == S5.h.f9825a) {
            return new C0205c(dVar);
        }
        return new d(dVar, context);
    }

    public static S5.d c(S5.d dVar) {
        kotlin.coroutines.jvm.internal.d dVar2;
        S5.d intercepted;
        AbstractC3255y.i(dVar, "<this>");
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

    public static Object d(InterfaceC1669o interfaceC1669o, Object obj, Object obj2, S5.d completion) {
        AbstractC3255y.i(interfaceC1669o, "<this>");
        AbstractC3255y.i(completion, "completion");
        return ((InterfaceC1669o) Z.d(interfaceC1669o, 3)).invoke(obj, obj2, b(h.a(completion)));
    }
}
