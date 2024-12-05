package androidx.datastore.core;

import O5.I;
import O5.t;
import S5.d;
import T5.b;
import a6.InterfaceC1668n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import o6.InterfaceC3707g;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1", f = "SingleProcessCoordinator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SingleProcessCoordinator$updateNotifications$1 extends l implements InterfaceC1668n {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SingleProcessCoordinator$updateNotifications$1(d dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new SingleProcessCoordinator$updateNotifications$1(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        b.e();
        if (this.label == 0) {
            t.b(obj);
            return I.f8278a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(InterfaceC3707g interfaceC3707g, d dVar) {
        return ((SingleProcessCoordinator$updateNotifications$1) create(interfaceC3707g, dVar)).invokeSuspend(I.f8278a);
    }
}
