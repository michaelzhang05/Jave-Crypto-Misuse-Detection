package androidx.compose.runtime;

import O5.I;
import O5.s;
import androidx.compose.runtime.Recomposer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3369m0;
import l6.InterfaceC3372o;
import o6.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Recomposer$broadcastFrameClock$1 extends AbstractC3256z implements Function0 {
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$broadcastFrameClock$1(Recomposer recomposer) {
        super(0);
        this.this$0 = recomposer;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m2486invoke();
        return I.f8278a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m2486invoke() {
        InterfaceC3372o deriveStateLocked;
        w wVar;
        Throwable th;
        Object obj = this.this$0.stateLock;
        Recomposer recomposer = this.this$0;
        synchronized (obj) {
            deriveStateLocked = recomposer.deriveStateLocked();
            wVar = recomposer._state;
            if (((Recomposer.State) wVar.getValue()).compareTo(Recomposer.State.ShuttingDown) <= 0) {
                th = recomposer.closeCause;
                throw AbstractC3369m0.a("Recomposer shutdown; frame clock awaiter will never resume", th);
            }
        }
        if (deriveStateLocked != null) {
            s.a aVar = s.f8302b;
            deriveStateLocked.resumeWith(s.b(I.f8278a));
        }
    }
}
