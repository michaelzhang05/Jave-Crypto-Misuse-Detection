package androidx.compose.ui.node;

import L5.I;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NodeCoordinator$hit$1 extends AbstractC3160z implements Function0 {
    final /* synthetic */ HitTestResult $hitTestResult;
    final /* synthetic */ NodeCoordinator.HitTestSource $hitTestSource;
    final /* synthetic */ boolean $isInLayer;
    final /* synthetic */ boolean $isTouchEvent;
    final /* synthetic */ long $pointerPosition;
    final /* synthetic */ Modifier.Node $this_hit;
    final /* synthetic */ NodeCoordinator this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$hit$1(NodeCoordinator nodeCoordinator, Modifier.Node node, NodeCoordinator.HitTestSource hitTestSource, long j8, HitTestResult hitTestResult, boolean z8, boolean z9) {
        super(0);
        this.this$0 = nodeCoordinator;
        this.$this_hit = node;
        this.$hitTestSource = hitTestSource;
        this.$pointerPosition = j8;
        this.$hitTestResult = hitTestResult;
        this.$isTouchEvent = z8;
        this.$isInLayer = z9;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m4335invoke();
        return I.f6487a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4335invoke() {
        Modifier.Node m4341nextUntilhw7D004;
        NodeCoordinator nodeCoordinator = this.this$0;
        m4341nextUntilhw7D004 = NodeCoordinatorKt.m4341nextUntilhw7D004(this.$this_hit, this.$hitTestSource.mo4333entityTypeOLwlOKw(), NodeKind.m4343constructorimpl(2));
        nodeCoordinator.m4311hit1hIXUjU(m4341nextUntilhw7D004, this.$hitTestSource, this.$pointerPosition, this.$hitTestResult, this.$isTouchEvent, this.$isInLayer);
    }
}
