package androidx.compose.material;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TabRowKt$ScrollableTabRow$3 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ InterfaceC1668n $divider;
    final /* synthetic */ float $edgePadding;
    final /* synthetic */ InterfaceC1669o $indicator;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ int $selectedTabIndex;
    final /* synthetic */ InterfaceC1668n $tabs;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowKt$ScrollableTabRow$3(int i8, Modifier modifier, long j8, long j9, float f8, InterfaceC1669o interfaceC1669o, InterfaceC1668n interfaceC1668n, InterfaceC1668n interfaceC1668n2, int i9, int i10) {
        super(2);
        this.$selectedTabIndex = i8;
        this.$modifier = modifier;
        this.$backgroundColor = j8;
        this.$contentColor = j9;
        this.$edgePadding = f8;
        this.$indicator = interfaceC1669o;
        this.$divider = interfaceC1668n;
        this.$tabs = interfaceC1668n2;
        this.$$changed = i9;
        this.$$default = i10;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    public final void invoke(Composer composer, int i8) {
        TabRowKt.m1388ScrollableTabRowsKfQg0A(this.$selectedTabIndex, this.$modifier, this.$backgroundColor, this.$contentColor, this.$edgePadding, this.$indicator, this.$divider, this.$tabs, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}