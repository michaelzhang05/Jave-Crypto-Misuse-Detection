package P7;

import L5.I;
import L5.t;
import X5.n;
import kotlin.coroutines.jvm.internal.l;

/* loaded from: classes5.dex */
public final class e extends l implements n {

    /* renamed from: a, reason: collision with root package name */
    public int f8125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f8126b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f8127c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, boolean z8, P5.d dVar) {
        super(2, dVar);
        this.f8126b = fVar;
        this.f8127c = z8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        return new e(this.f8126b, this.f8127c, dVar);
    }

    @Override // X5.n
    public Object invoke(Object obj, Object obj2) {
        return new e(this.f8126b, this.f8127c, (P5.d) obj2).invokeSuspend(I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = Q5.b.e();
        int i8 = this.f8125a;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            H7.g gVar = this.f8126b.f8132e;
            Boolean a8 = kotlin.coroutines.jvm.internal.b.a(this.f8127c);
            String j8 = this.f8126b.f8128a.j(N7.a.PRIVACY_STRING);
            H7.f fVar = H7.f.CCPA;
            this.f8125a = 1;
            if (H7.g.c(gVar, a8, null, null, null, j8, fVar, this, 14) == e8) {
                return e8;
            }
        }
        return I.f6487a;
    }
}
