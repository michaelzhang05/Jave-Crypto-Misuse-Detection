package b;

import O5.I;
import O5.t;
import O7.o;
import a6.InterfaceC1668n;

/* renamed from: b.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1947i extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

    /* renamed from: a, reason: collision with root package name */
    public int f15016a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1950l f15017b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1947i(C1950l c1950l, S5.d dVar) {
        super(2, dVar);
        this.f15017b = c1950l;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final S5.d create(Object obj, S5.d dVar) {
        return new C1947i(this.f15017b, dVar);
    }

    @Override // a6.InterfaceC1668n
    public Object invoke(Object obj, Object obj2) {
        return new C1947i(this.f15017b, (S5.d) obj2).invokeSuspend(I.f8278a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = T5.b.e();
        int i8 = this.f15016a;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            o oVar = this.f15017b.f15031i;
            this.f15016a = 1;
            obj = oVar.a(this);
            if (obj == e8) {
                return e8;
            }
        }
        return obj;
    }
}
