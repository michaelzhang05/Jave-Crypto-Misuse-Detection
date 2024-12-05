package o;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;

/* renamed from: o.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3502l extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

    /* renamed from: a, reason: collision with root package name */
    public int f35765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3503m f35766b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3502l(C3503m c3503m, S5.d dVar) {
        super(2, dVar);
        this.f35766b = c3503m;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final S5.d create(Object obj, S5.d dVar) {
        return new C3502l(this.f35766b, dVar);
    }

    @Override // a6.InterfaceC1668n
    public Object invoke(Object obj, Object obj2) {
        return new C3502l(this.f35766b, (S5.d) obj2).invokeSuspend(I.f8278a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = T5.b.e();
        int i8 = this.f35765a;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            K7.m mVar = K7.m.f5260a;
            K7.f fVar = K7.f.GDPR;
            int i9 = this.f35766b.f35778l;
            this.f35765a = 1;
            if (mVar.c(fVar, i9, this) == e8) {
                return e8;
            }
        }
        return I.f8278a;
    }
}
