package S7;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import kotlin.coroutines.jvm.internal.l;

/* loaded from: classes5.dex */
public final class e extends l implements InterfaceC1668n {

    /* renamed from: a, reason: collision with root package name */
    public int f9956a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f9957b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f9958c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, boolean z8, S5.d dVar) {
        super(2, dVar);
        this.f9957b = fVar;
        this.f9958c = z8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final S5.d create(Object obj, S5.d dVar) {
        return new e(this.f9957b, this.f9958c, dVar);
    }

    @Override // a6.InterfaceC1668n
    public Object invoke(Object obj, Object obj2) {
        return new e(this.f9957b, this.f9958c, (S5.d) obj2).invokeSuspend(I.f8278a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = T5.b.e();
        int i8 = this.f9956a;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            K7.g gVar = this.f9957b.f9963e;
            Boolean a8 = kotlin.coroutines.jvm.internal.b.a(this.f9958c);
            String j8 = this.f9957b.f9959a.j(Q7.a.PRIVACY_STRING);
            K7.f fVar = K7.f.CCPA;
            this.f9956a = 1;
            if (K7.g.c(gVar, a8, null, null, null, j8, fVar, this, 14) == e8) {
                return e8;
            }
        }
        return I.f8278a;
    }
}
