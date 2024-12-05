package v5;

import K7.m;
import O5.I;
import O5.t;
import a6.InterfaceC1668n;

/* loaded from: classes5.dex */
public final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

    /* renamed from: a, reason: collision with root package name */
    public int f40288a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f40289b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, S5.d dVar) {
        super(2, dVar);
        this.f40289b = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final S5.d create(Object obj, S5.d dVar) {
        return new j(this.f40289b, dVar);
    }

    @Override // a6.InterfaceC1668n
    public Object invoke(Object obj, Object obj2) {
        return new j(this.f40289b, (S5.d) obj2).invokeSuspend(I.f8278a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = T5.b.e();
        int i8 = this.f40288a;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            m mVar = m.f5260a;
            K7.f fVar = K7.f.GDPR;
            int i9 = this.f40289b.f40301l;
            this.f40288a = 1;
            if (mVar.c(fVar, i9, this) == e8) {
                return e8;
            }
        }
        return I.f8278a;
    }
}
