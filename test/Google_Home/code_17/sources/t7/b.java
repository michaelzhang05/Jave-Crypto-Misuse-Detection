package T7;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;

/* loaded from: classes5.dex */
public final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

    /* renamed from: a, reason: collision with root package name */
    public int f10182a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f10183b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, S5.d dVar) {
        super(2, dVar);
        this.f10183b = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final S5.d create(Object obj, S5.d dVar) {
        return new b(this.f10183b, dVar);
    }

    @Override // a6.InterfaceC1668n
    public Object invoke(Object obj, Object obj2) {
        return new b(this.f10183b, (S5.d) obj2).invokeSuspend(I.f8278a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = T5.b.e();
        int i8 = this.f10182a;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            O7.a aVar = this.f10183b.f10184a;
            this.f10182a = 1;
            obj = aVar.a(this);
            if (obj == e8) {
                return e8;
            }
        }
        return obj;
    }
}
