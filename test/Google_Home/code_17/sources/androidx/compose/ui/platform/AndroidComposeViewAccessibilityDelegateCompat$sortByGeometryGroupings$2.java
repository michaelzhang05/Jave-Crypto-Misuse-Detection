package androidx.compose.ui.platform;

import a6.InterfaceC1668n;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2 extends AbstractC3256z implements InterfaceC1668n {
    public static final AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2 INSTANCE = new AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2();

    AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public final Integer invoke(SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        SemanticsPropertyKey<Float> traversalIndex = semanticsProperties.getTraversalIndex();
        AndroidComposeViewAccessibilityDelegateCompat_androidKt$traversalIndex$1 androidComposeViewAccessibilityDelegateCompat_androidKt$traversalIndex$1 = AndroidComposeViewAccessibilityDelegateCompat_androidKt$traversalIndex$1.INSTANCE;
        return Integer.valueOf(Float.compare(((Number) config.getOrElse(traversalIndex, androidComposeViewAccessibilityDelegateCompat_androidKt$traversalIndex$1)).floatValue(), ((Number) semanticsNode2.getConfig().getOrElse(semanticsProperties.getTraversalIndex(), androidComposeViewAccessibilityDelegateCompat_androidKt$traversalIndex$1)).floatValue()));
    }
}
