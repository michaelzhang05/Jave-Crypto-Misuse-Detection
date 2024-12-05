package androidx.compose.runtime;

import L5.I;
import L5.s;
import androidx.compose.runtime.Recomposer;
import i6.AbstractC2834m0;
import i6.InterfaceC2837o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;
import l6.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Recomposer$broadcastFrameClock$1 extends AbstractC3160z implements Function0 {
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$broadcastFrameClock$1(Recomposer recomposer) {
        super(0);
        this.this$0 = recomposer;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m2481invoke();
        return I.f6487a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m2481invoke() {
        InterfaceC2837o deriveStateLocked;
        v vVar;
        Throwable th;
        Object obj = this.this$0.stateLock;
        Recomposer recomposer = this.this$0;
        synchronized (obj) {
            deriveStateLocked = recomposer.deriveStateLocked();
            vVar = recomposer._state;
            if (((Recomposer.State) vVar.getValue()).compareTo(Recomposer.State.ShuttingDown) <= 0) {
                th = recomposer.closeCause;
                throw AbstractC2834m0.a("Recomposer shutdown; frame clock awaiter will never resume", th);
            }
        }
        if (deriveStateLocked != null) {
            s.a aVar = s.f6511b;
            deriveStateLocked.resumeWith(s.b(I.f6487a));
        }
    }
}
