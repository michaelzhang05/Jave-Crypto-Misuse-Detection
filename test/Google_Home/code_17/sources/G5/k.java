package G5;

import O5.I;
import O5.t;
import O7.u;
import a6.InterfaceC1668n;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

    /* renamed from: a, reason: collision with root package name */
    public Object f3404a;

    /* renamed from: b, reason: collision with root package name */
    public int f3405b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f3406c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f3407d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Function1 function1, l lVar, S5.d dVar) {
        super(2, dVar);
        this.f3406c = function1;
        this.f3407d = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final S5.d create(Object obj, S5.d dVar) {
        return new k(this.f3406c, this.f3407d, dVar);
    }

    @Override // a6.InterfaceC1668n
    public Object invoke(Object obj, Object obj2) {
        return new k(this.f3406c, this.f3407d, (S5.d) obj2).invokeSuspend(I.f8278a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        Object e8 = T5.b.e();
        int i8 = this.f3405b;
        if (i8 != 0) {
            if (i8 == 1) {
                function1 = (Function1) this.f3404a;
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            Function1 function12 = this.f3406c;
            u uVar = this.f3407d.f3412e;
            this.f3404a = function12;
            this.f3405b = 1;
            Object a8 = uVar.a(this);
            if (a8 == e8) {
                return e8;
            }
            function1 = function12;
            obj = a8;
        }
        function1.invoke(obj);
        return I.f8278a;
    }
}
