package androidx.compose.runtime;

import L5.I;
import L5.s;
import X5.n;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import i6.InterfaceC2837o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.v;

/* loaded from: classes.dex */
final class Recomposer$recompositionRunner$2$unregisterApplyObserver$1 extends AbstractC3160z implements n {
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$recompositionRunner$2$unregisterApplyObserver$1(Recomposer recomposer) {
        super(2);
        this.this$0 = recomposer;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Set<? extends Object>) obj, (Snapshot) obj2);
        return I.f6487a;
    }

    public final void invoke(Set<? extends Object> set, Snapshot snapshot) {
        v vVar;
        InterfaceC2837o interfaceC2837o;
        Object obj = this.this$0.stateLock;
        Recomposer recomposer = this.this$0;
        synchronized (obj) {
            try {
                vVar = recomposer._state;
                if (((Recomposer.State) vVar.getValue()).compareTo(Recomposer.State.Idle) >= 0) {
                    if (set instanceof IdentityArraySet) {
                        IdentityArraySet identityArraySet = (IdentityArraySet) set;
                        Object[] values = identityArraySet.getValues();
                        int size = identityArraySet.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            Object obj2 = values[i8];
                            AbstractC3159y.g(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            if (!(obj2 instanceof StateObjectImpl) || ((StateObjectImpl) obj2).m2606isReadInh_f27i8$runtime_release(ReaderKind.m2591constructorimpl(1))) {
                                recomposer.snapshotInvalidations.add(obj2);
                            }
                        }
                    } else {
                        for (Object obj3 : set) {
                            if (!(obj3 instanceof StateObjectImpl) || ((StateObjectImpl) obj3).m2606isReadInh_f27i8$runtime_release(ReaderKind.m2591constructorimpl(1))) {
                                recomposer.snapshotInvalidations.add(obj3);
                            }
                        }
                    }
                    interfaceC2837o = recomposer.deriveStateLocked();
                } else {
                    interfaceC2837o = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC2837o != null) {
            s.a aVar = s.f6511b;
            interfaceC2837o.resumeWith(s.b(I.f6487a));
        }
    }
}
