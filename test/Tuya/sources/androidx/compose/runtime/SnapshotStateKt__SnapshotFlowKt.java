package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3360h;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class SnapshotStateKt__SnapshotFlowKt {
    @Composable
    public static final <T> State<T> collectAsState(InterfaceC3349K interfaceC3349K, P5.g gVar, Composer composer, int i8, int i9) {
        composer.startReplaceableGroup(-1439883919);
        if ((i9 & 1) != 0) {
            gVar = P5.h.f7994a;
        }
        P5.g gVar2 = gVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1439883919, i8, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:47)");
        }
        State<T> collectAsState = SnapshotStateKt.collectAsState(interfaceC3349K, interfaceC3349K.getValue(), gVar2, composer, 520, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return collectAsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean intersects$SnapshotStateKt__SnapshotFlowKt(IdentityArraySet<T> identityArraySet, Set<? extends T> set) {
        if (identityArraySet.size() < set.size()) {
            int size = identityArraySet.size();
            if (size != 0) {
                Object[] values = identityArraySet.getValues();
                for (int i8 = 0; i8 < size; i8++) {
                    Object obj = values[i8];
                    AbstractC3159y.g(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    if (set.contains(obj)) {
                        return true;
                    }
                }
            }
        } else if (set instanceof IdentityArraySet) {
            IdentityArraySet identityArraySet2 = (IdentityArraySet) set;
            int size2 = identityArraySet2.size();
            if (size2 != 0) {
                Object[] values2 = identityArraySet2.getValues();
                for (int i9 = 0; i9 < size2; i9++) {
                    Object obj2 = values2[i9];
                    AbstractC3159y.g(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    if (identityArraySet.contains(obj2)) {
                        return true;
                    }
                }
            }
        } else {
            Set<? extends T> set2 = set;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator<T> it = set2.iterator();
                while (it.hasNext()) {
                    if (identityArraySet.contains(it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final <T> InterfaceC3358f snapshotFlow(Function0 function0) {
        return AbstractC3360h.x(new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(function0, null));
    }

    @Composable
    public static final <T extends R, R> State<R> collectAsState(InterfaceC3358f interfaceC3358f, R r8, P5.g gVar, Composer composer, int i8, int i9) {
        composer.startReplaceableGroup(-606625098);
        if ((i9 & 2) != 0) {
            gVar = P5.h.f7994a;
        }
        P5.g gVar2 = gVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-606625098, i8, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:62)");
        }
        int i10 = i8 >> 3;
        State<R> produceState = SnapshotStateKt.produceState(r8, interfaceC3358f, gVar2, new SnapshotStateKt__SnapshotFlowKt$collectAsState$1(gVar2, interfaceC3358f, null), composer, (i10 & 8) | 4672 | (i10 & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return produceState;
    }
}
