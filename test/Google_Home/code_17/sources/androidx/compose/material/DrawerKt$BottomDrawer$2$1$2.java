package androidx.compose.material;

import O5.I;
import P5.Q;
import androidx.compose.material.AnchoredDraggableState;
import androidx.compose.ui.unit.IntSize;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class DrawerKt$BottomDrawer$2$1$2 extends AbstractC3256z implements Function1 {
    final /* synthetic */ AnchoredDraggableState.AnchorChangedCallback<BottomDrawerValue> $anchorChangeCallback;
    final /* synthetic */ BottomDrawerState $drawerState;
    final /* synthetic */ float $fullHeight;
    final /* synthetic */ boolean $isLandscape;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$BottomDrawer$2$1$2(BottomDrawerState bottomDrawerState, AnchoredDraggableState.AnchorChangedCallback<BottomDrawerValue> anchorChangedCallback, float f8, boolean z8) {
        super(1);
        this.$drawerState = bottomDrawerState;
        this.$anchorChangeCallback = anchorChangedCallback;
        this.$fullHeight = f8;
        this.$isLandscape = z8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m1232invokeozmzZPI(((IntSize) obj).m5353unboximpl());
        return I.f8278a;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m1232invokeozmzZPI(long j8) {
        float m5348getHeightimpl = IntSize.m5348getHeightimpl(j8);
        float f8 = this.$fullHeight;
        boolean z8 = this.$isLandscape;
        Map c8 = Q.c();
        c8.put(BottomDrawerValue.Closed, Float.valueOf(f8));
        float f9 = 0.5f * f8;
        if (m5348getHeightimpl > f9 || z8) {
            c8.put(BottomDrawerValue.Open, Float.valueOf(f9));
        }
        if (m5348getHeightimpl > 0.0f) {
            c8.put(BottomDrawerValue.Expanded, Float.valueOf(Math.max(0.0f, f8 - m5348getHeightimpl)));
        }
        this.$drawerState.getAnchoredDraggableState$material_release().updateAnchors$material_release(Q.b(c8), this.$anchorChangeCallback);
    }
}
