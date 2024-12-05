package androidx.compose.runtime.snapshots;

import L5.I;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class GlobalSnapshot$1$1$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ List<Function1> $it;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GlobalSnapshot$1$1$1(List<? extends Function1> list) {
        super(1);
        this.$it = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m2587invoke(obj);
        return I.f6487a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m2587invoke(Object obj) {
        List<Function1> list = this.$it;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            list.get(i8).invoke(obj);
        }
    }
}
