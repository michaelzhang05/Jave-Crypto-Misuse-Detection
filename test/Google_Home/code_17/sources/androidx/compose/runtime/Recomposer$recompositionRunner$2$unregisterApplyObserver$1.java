package androidx.compose.runtime;

import O5.I;
import O5.s;
import a6.InterfaceC1668n;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.InterfaceC3372o;
import o6.w;

/* loaded from: classes.dex */
final class Recomposer$recompositionRunner$2$unregisterApplyObserver$1 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$recompositionRunner$2$unregisterApplyObserver$1(Recomposer recomposer) {
        super(2);
        this.this$0 = recomposer;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Set<? extends Object>) obj, (Snapshot) obj2);
        return I.f8278a;
    }

    public final void invoke(Set<? extends Object> set, Snapshot snapshot) {
        w wVar;
        InterfaceC3372o interfaceC3372o;
        Object obj = this.this$0.stateLock;
        Recomposer recomposer = this.this$0;
        synchronized (obj) {
            try {
                wVar = recomposer._state;
                if (((Recomposer.State) wVar.getValue()).compareTo(Recomposer.State.Idle) >= 0) {
                    if (set instanceof IdentityArraySet) {
                        IdentityArraySet identityArraySet = (IdentityArraySet) set;
                        Object[] values = identityArraySet.getValues();
                        int size = identityArraySet.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            Object obj2 = values[i8];
                            AbstractC3255y.g(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            if (!(obj2 instanceof StateObjectImpl) || ((StateObjectImpl) obj2).m2611isReadInh_f27i8$runtime_release(ReaderKind.m2596constructorimpl(1))) {
                                recomposer.snapshotInvalidations.add(obj2);
                            }
                        }
                    } else {
                        for (Object obj3 : set) {
                            if (!(obj3 instanceof StateObjectImpl) || ((StateObjectImpl) obj3).m2611isReadInh_f27i8$runtime_release(ReaderKind.m2596constructorimpl(1))) {
                                recomposer.snapshotInvalidations.add(obj3);
                            }
                        }
                    }
                    interfaceC3372o = recomposer.deriveStateLocked();
                } else {
                    interfaceC3372o = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC3372o != null) {
            s.a aVar = s.f8302b;
            interfaceC3372o.resumeWith(s.b(I.f8278a));
        }
    }
}
