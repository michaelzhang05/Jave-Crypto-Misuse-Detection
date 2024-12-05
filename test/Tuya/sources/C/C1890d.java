package c;

import H7.m;
import L5.I;
import L5.t;
import X5.n;
import kotlin.coroutines.jvm.internal.l;

/* renamed from: c.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1890d extends l implements n {

    /* renamed from: a, reason: collision with root package name */
    public int f14825a;

    public C1890d(P5.d dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        return new C1890d(dVar);
    }

    @Override // X5.n
    public Object invoke(Object obj, Object obj2) {
        return new C1890d((P5.d) obj2).invokeSuspend(I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = Q5.b.e();
        int i8 = this.f14825a;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            m mVar = m.f3657a;
            this.f14825a = 1;
            if (mVar.d(this) == e8) {
                return e8;
            }
        }
        return I.f6487a;
    }
}
