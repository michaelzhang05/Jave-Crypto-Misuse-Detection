package androidx.compose.foundation.lazy.layout;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class LazyLayoutSemanticsKt$lazyLayoutSemantics$1$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ ScrollAxisRange $accessibilityScrollState;
    final /* synthetic */ CollectionInfo $collectionInfo;
    final /* synthetic */ Function1 $indexForKeyMapping;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ InterfaceC1668n $scrollByAction;
    final /* synthetic */ Function1 $scrollToIndexAction;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutSemanticsKt$lazyLayoutSemantics$1$1(Function1 function1, boolean z8, ScrollAxisRange scrollAxisRange, InterfaceC1668n interfaceC1668n, Function1 function12, CollectionInfo collectionInfo) {
        super(1);
        this.$indexForKeyMapping = function1;
        this.$isVertical = z8;
        this.$accessibilityScrollState = scrollAxisRange;
        this.$scrollByAction = interfaceC1668n;
        this.$scrollToIndexAction = function12;
        this.$collectionInfo = collectionInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return I.f8278a;
    }

    public final void invoke(SemanticsPropertyReceiver semantics) {
        AbstractC3255y.i(semantics, "$this$semantics");
        SemanticsPropertiesKt.setTraversalGroup(semantics, true);
        SemanticsPropertiesKt.indexForKey(semantics, this.$indexForKeyMapping);
        if (this.$isVertical) {
            SemanticsPropertiesKt.setVerticalScrollAxisRange(semantics, this.$accessibilityScrollState);
        } else {
            SemanticsPropertiesKt.setHorizontalScrollAxisRange(semantics, this.$accessibilityScrollState);
        }
        InterfaceC1668n interfaceC1668n = this.$scrollByAction;
        if (interfaceC1668n != null) {
            SemanticsPropertiesKt.scrollBy$default(semantics, null, interfaceC1668n, 1, null);
        }
        Function1 function1 = this.$scrollToIndexAction;
        if (function1 != null) {
            SemanticsPropertiesKt.scrollToIndex$default(semantics, null, function1, 1, null);
        }
        SemanticsPropertiesKt.setCollectionInfo(semantics, this.$collectionInfo);
    }
}
