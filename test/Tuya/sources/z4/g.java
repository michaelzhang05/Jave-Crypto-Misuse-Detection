package Z4;

import L5.I;
import L5.t;
import X5.n;
import a5.InterfaceC1575a;
import kotlin.coroutines.jvm.internal.l;

/* loaded from: classes5.dex */
public final class g extends l implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1575a f13418a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InterfaceC1575a interfaceC1575a, P5.d dVar) {
        super(2, dVar);
        this.f13418a = interfaceC1575a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        return new g(this.f13418a, dVar);
    }

    @Override // X5.n
    public final Object invoke(Object obj, Object obj2) {
        return new g(this.f13418a, (P5.d) obj2).invokeSuspend(I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Q5.b.e();
        t.b(obj);
        this.f13418a.a("Something went wrong");
        return I.f6487a;
    }
}