package androidx.datastore.core;

import L5.I;
import L5.t;
import P5.d;
import Q5.b;
import X5.n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import l6.InterfaceC3359g;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1", f = "SingleProcessCoordinator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SingleProcessCoordinator$updateNotifications$1 extends l implements n {
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
            return I.f6487a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // X5.n
    public final Object invoke(InterfaceC3359g interfaceC3359g, d dVar) {
        return ((SingleProcessCoordinator$updateNotifications$1) create(interfaceC3359g, dVar)).invokeSuspend(I.f6487a);
    }
}
