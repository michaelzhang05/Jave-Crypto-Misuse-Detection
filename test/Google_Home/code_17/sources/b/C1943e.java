package b;

import O5.I;
import O5.t;
import O7.q;
import a6.InterfaceC1668n;

/* renamed from: b.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1943e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

    /* renamed from: a, reason: collision with root package name */
    public int f15008a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1950l f15009b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1943e(C1950l c1950l, S5.d dVar) {
        super(2, dVar);
        this.f15009b = c1950l;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final S5.d create(Object obj, S5.d dVar) {
        return new C1943e(this.f15009b, dVar);
    }

    @Override // a6.InterfaceC1668n
    public Object invoke(Object obj, Object obj2) {
        return new C1943e(this.f15009b, (S5.d) obj2).invokeSuspend(I.f8278a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = T5.b.e();
        int i8 = this.f15008a;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            C1950l c1950l = this.f15009b;
            q qVar = c1950l.f15026d;
            int i9 = c1950l.f15025c.f3925b.f3870G;
            this.f15008a = 1;
            obj = qVar.a(i9, this);
            if (obj == e8) {
                return e8;
            }
        }
        return obj;
    }
}
