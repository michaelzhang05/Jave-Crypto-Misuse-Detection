package androidx.compose.ui.platform;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeKind;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1 extends AbstractC3160z implements Function1 {
    public static final AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1 INSTANCE = new AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1();

    AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(LayoutNode layoutNode) {
        return Boolean.valueOf(layoutNode.getNodes$ui_release().m4300hasH91voCI$ui_release(NodeKind.m4343constructorimpl(8)));
    }
}
