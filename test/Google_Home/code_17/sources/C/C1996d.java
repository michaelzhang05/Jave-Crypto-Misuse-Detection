package c;

import K7.m;
import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import kotlin.coroutines.jvm.internal.l;

/* renamed from: c.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1996d extends l implements InterfaceC1668n {

    /* renamed from: a, reason: collision with root package name */
    public int f15537a;

    public C1996d(S5.d dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final S5.d create(Object obj, S5.d dVar) {
        return new C1996d(dVar);
    }

    @Override // a6.InterfaceC1668n
    public Object invoke(Object obj, Object obj2) {
        return new C1996d((S5.d) obj2).invokeSuspend(I.f8278a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = T5.b.e();
        int i8 = this.f15537a;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            m mVar = m.f5260a;
            this.f15537a = 1;
            if (mVar.d(this) == e8) {
                return e8;
            }
        }
        return I.f8278a;
    }
}
