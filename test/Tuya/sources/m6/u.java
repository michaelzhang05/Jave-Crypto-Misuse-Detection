package m6;

import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.C3156v;
import kotlin.jvm.internal.Z;
import l6.InterfaceC3359g;

/* loaded from: classes5.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    private static final X5.o f35943a;

    /* loaded from: classes5.dex */
    /* synthetic */ class a extends C3156v implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35944a = new a();

        a() {
            super(3, InterfaceC3359g.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // X5.o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3359g interfaceC3359g, Object obj, P5.d dVar) {
            return interfaceC3359g.emit(obj, dVar);
        }
    }

    static {
        a aVar = a.f35944a;
        AbstractC3159y.g(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f35943a = (X5.o) Z.d(aVar, 3);
    }

    public static final /* synthetic */ X5.o a() {
        return f35943a;
    }
}
