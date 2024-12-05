package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
@Stable
/* loaded from: classes.dex */
public final class ConsumedInsetsModifier extends InspectorValueInfo implements ModifierLocalConsumer {
    private final Function1 block;
    private WindowInsets oldWindowInsets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsumedInsetsModifier(Function1 block, Function1 inspectorInfo) {
        super(inspectorInfo);
        AbstractC3159y.i(block, "block");
        AbstractC3159y.i(inspectorInfo, "inspectorInfo");
        this.block = block;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return androidx.compose.ui.b.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return androidx.compose.ui.b.b(this, function1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsumedInsetsModifier)) {
            return false;
        }
        return AbstractC3159y.d(((ConsumedInsetsModifier) obj).block, this.block);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, X5.n nVar) {
        return androidx.compose.ui.b.c(this, obj, nVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, X5.n nVar) {
        return androidx.compose.ui.b.d(this, obj, nVar);
    }

    public int hashCode() {
        return this.block.hashCode();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(ModifierLocalReadScope scope) {
        AbstractC3159y.i(scope, "scope");
        WindowInsets windowInsets = (WindowInsets) scope.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets());
        if (!AbstractC3159y.d(windowInsets, this.oldWindowInsets)) {
            this.oldWindowInsets = windowInsets;
            this.block.invoke(windowInsets);
        }
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }
}
