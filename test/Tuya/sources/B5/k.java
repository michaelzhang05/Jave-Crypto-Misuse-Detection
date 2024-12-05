package B5;

import L5.I;
import L5.t;
import X5.n;

/* loaded from: classes5.dex */
public final class k extends kotlin.coroutines.jvm.internal.l implements n {

    /* renamed from: a, reason: collision with root package name */
    public int f1018a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f1019b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, P5.d dVar) {
        super(2, dVar);
        this.f1019b = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        return new k(this.f1019b, dVar);
    }

    @Override // X5.n
    public Object invoke(Object obj, Object obj2) {
        return new k(this.f1019b, (P5.d) obj2).invokeSuspend(I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = Q5.b.e();
        int i8 = this.f1018a;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            H7.m mVar = H7.m.f3657a;
            H7.f fVar = H7.f.GDPR;
            int i9 = this.f1019b.f1031l;
            this.f1018a = 1;
            if (mVar.c(fVar, i9, this) == e8) {
                return e8;
            }
        }
        return I.f6487a;
    }
}
