package o;

import L5.I;
import L5.t;

/* renamed from: o.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3516l extends kotlin.coroutines.jvm.internal.l implements X5.n {

    /* renamed from: a, reason: collision with root package name */
    public int f36330a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3517m f36331b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3516l(C3517m c3517m, P5.d dVar) {
        super(2, dVar);
        this.f36331b = c3517m;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        return new C3516l(this.f36331b, dVar);
    }

    @Override // X5.n
    public Object invoke(Object obj, Object obj2) {
        return new C3516l(this.f36331b, (P5.d) obj2).invokeSuspend(I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = Q5.b.e();
        int i8 = this.f36330a;
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
            int i9 = this.f36331b.f36343l;
            this.f36330a = 1;
            if (mVar.c(fVar, i9, this) == e8) {
                return e8;
            }
        }
        return I.f6487a;
    }
}
