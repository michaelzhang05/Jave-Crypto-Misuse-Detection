package androidx.compose.material;

import X5.n;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SwipeableState$Companion$Saver$1 extends AbstractC3160z implements n {
    public static final SwipeableState$Companion$Saver$1 INSTANCE = new SwipeableState$Companion$Saver$1();

    SwipeableState$Companion$Saver$1() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
    @Override // X5.n
    public final T invoke(SaverScope Saver, SwipeableState<T> it) {
        AbstractC3159y.i(Saver, "$this$Saver");
        AbstractC3159y.i(it, "it");
        return it.getCurrentValue();
    }
}
