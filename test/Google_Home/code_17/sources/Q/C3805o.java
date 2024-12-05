package q;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;

/* renamed from: q.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3805o extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

    /* renamed from: a, reason: collision with root package name */
    public int f38050a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3803m f38051b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3805o(C3803m c3803m, S5.d dVar) {
        super(2, dVar);
        this.f38051b = c3803m;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final S5.d create(Object obj, S5.d dVar) {
        return new C3805o(this.f38051b, dVar);
    }

    @Override // a6.InterfaceC1668n
    public Object invoke(Object obj, Object obj2) {
        return new C3805o(this.f38051b, (S5.d) obj2).invokeSuspend(I.f8278a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = T5.b.e();
        int i8 = this.f38050a;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            K7.m mVar = K7.m.f5260a;
            K7.f fVar = K7.f.MSPA;
            int i9 = this.f38051b.f38047d;
            this.f38050a = 1;
            if (mVar.c(fVar, i9, this) == e8) {
                return e8;
            }
        }
        return I.f8278a;
    }
}
