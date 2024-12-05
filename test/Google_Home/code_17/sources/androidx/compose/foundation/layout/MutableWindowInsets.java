package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@StabilityInferred(parameters = 0)
@ExperimentalLayoutApi
/* loaded from: classes.dex */
public final class MutableWindowInsets implements WindowInsets {
    public static final int $stable = 0;
    private final MutableState insets$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public MutableWindowInsets() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        AbstractC3255y.i(density, "density");
        return getInsets().getBottom(density);
    }

    public final WindowInsets getInsets() {
        return (WindowInsets) this.insets$delegate.getValue();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        AbstractC3255y.i(density, "density");
        AbstractC3255y.i(layoutDirection, "layoutDirection");
        return getInsets().getLeft(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        AbstractC3255y.i(density, "density");
        AbstractC3255y.i(layoutDirection, "layoutDirection");
        return getInsets().getRight(density, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        AbstractC3255y.i(density, "density");
        return getInsets().getTop(density);
    }

    public final void setInsets(WindowInsets windowInsets) {
        AbstractC3255y.i(windowInsets, "<set-?>");
        this.insets$delegate.setValue(windowInsets);
    }

    public MutableWindowInsets(WindowInsets initialInsets) {
        MutableState mutableStateOf$default;
        AbstractC3255y.i(initialInsets, "initialInsets");
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(initialInsets, null, 2, null);
        this.insets$delegate = mutableStateOf$default;
    }

    public /* synthetic */ MutableWindowInsets(WindowInsets windowInsets, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? WindowInsetsKt.WindowInsets(0, 0, 0, 0) : windowInsets);
    }
}
