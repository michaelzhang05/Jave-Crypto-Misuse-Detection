package androidx.compose.ui.node;

import O5.I;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NodeCoordinator$hitNear$1 extends AbstractC3256z implements Function0 {
    final /* synthetic */ float $distanceFromEdge;
    final /* synthetic */ HitTestResult $hitTestResult;
    final /* synthetic */ NodeCoordinator.HitTestSource $hitTestSource;
    final /* synthetic */ boolean $isInLayer;
    final /* synthetic */ boolean $isTouchEvent;
    final /* synthetic */ long $pointerPosition;
    final /* synthetic */ Modifier.Node $this_hitNear;
    final /* synthetic */ NodeCoordinator this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$hitNear$1(NodeCoordinator nodeCoordinator, Modifier.Node node, NodeCoordinator.HitTestSource hitTestSource, long j8, HitTestResult hitTestResult, boolean z8, boolean z9, float f8) {
        super(0);
        this.this$0 = nodeCoordinator;
        this.$this_hitNear = node;
        this.$hitTestSource = hitTestSource;
        this.$pointerPosition = j8;
        this.$hitTestResult = hitTestResult;
        this.$isTouchEvent = z8;
        this.$isInLayer = z9;
        this.$distanceFromEdge = f8;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m4341invoke();
        return I.f8278a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4341invoke() {
        Modifier.Node m4346nextUntilhw7D004;
        NodeCoordinator nodeCoordinator = this.this$0;
        m4346nextUntilhw7D004 = NodeCoordinatorKt.m4346nextUntilhw7D004(this.$this_hitNear, this.$hitTestSource.mo4338entityTypeOLwlOKw(), NodeKind.m4348constructorimpl(2));
        nodeCoordinator.m4317hitNearJHbHoSQ(m4346nextUntilhw7D004, this.$hitTestSource, this.$pointerPosition, this.$hitTestResult, this.$isTouchEvent, this.$isInLayer, this.$distanceFromEdge);
    }
}
