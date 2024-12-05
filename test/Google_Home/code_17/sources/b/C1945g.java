package b;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;

/* renamed from: b.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1945g extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

    /* renamed from: a, reason: collision with root package name */
    public int f15012a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1950l f15013b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1945g(C1950l c1950l, S5.d dVar) {
        super(2, dVar);
        this.f15013b = c1950l;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final S5.d create(Object obj, S5.d dVar) {
        return new C1945g(this.f15013b, dVar);
    }

    @Override // a6.InterfaceC1668n
    public Object invoke(Object obj, Object obj2) {
        return new C1945g(this.f15013b, (S5.d) obj2).invokeSuspend(I.f8278a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = T5.b.e();
        int i8 = this.f15012a;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            O7.k kVar = this.f15013b.f15032j;
            this.f15012a = 1;
            obj = kVar.a(this);
            if (obj == e8) {
                return e8;
            }
        }
        return obj;
    }
}
