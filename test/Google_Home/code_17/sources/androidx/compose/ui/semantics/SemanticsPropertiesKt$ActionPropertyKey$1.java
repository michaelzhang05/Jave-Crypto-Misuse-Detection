package androidx.compose.ui.semantics;

import O5.InterfaceC1351g;
import a6.InterfaceC1668n;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
public final class SemanticsPropertiesKt$ActionPropertyKey$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final SemanticsPropertiesKt$ActionPropertyKey$1 INSTANCE = new SemanticsPropertiesKt$ActionPropertyKey$1();

    public SemanticsPropertiesKt$ActionPropertyKey$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public final AccessibilityAction<T> invoke(AccessibilityAction<T> accessibilityAction, AccessibilityAction<T> accessibilityAction2) {
        String label;
        InterfaceC1351g action;
        if (accessibilityAction == 0 || (label = accessibilityAction.getLabel()) == null) {
            label = accessibilityAction2.getLabel();
        }
        if (accessibilityAction == 0 || (action = accessibilityAction.getAction()) == null) {
            action = accessibilityAction2.getAction();
        }
        return new AccessibilityAction<>(label, action);
    }
}
