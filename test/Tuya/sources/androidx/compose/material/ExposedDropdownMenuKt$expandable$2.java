package androidx.compose.material;

import L5.I;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ExposedDropdownMenuKt$expandable$2 extends AbstractC3160z implements Function1 {
    final /* synthetic */ String $menuLabel;
    final /* synthetic */ Function0 $onExpandedChange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.ExposedDropdownMenuKt$expandable$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3160z implements Function0 {
        final /* synthetic */ Function0 $onExpandedChange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function0 function0) {
            super(0);
            this.$onExpandedChange = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            this.$onExpandedChange.invoke();
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuKt$expandable$2(String str, Function0 function0) {
        super(1);
        this.$menuLabel = str;
        this.$onExpandedChange = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return I.f6487a;
    }

    public final void invoke(SemanticsPropertyReceiver semantics) {
        AbstractC3159y.i(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, this.$menuLabel);
        SemanticsPropertiesKt.onClick$default(semantics, null, new AnonymousClass1(this.$onExpandedChange), 1, null);
    }
}
