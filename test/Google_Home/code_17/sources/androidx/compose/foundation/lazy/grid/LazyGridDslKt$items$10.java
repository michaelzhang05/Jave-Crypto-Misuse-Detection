package androidx.compose.foundation.lazy.grid;

import O5.I;
import a6.InterfaceC1670p;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
public final class LazyGridDslKt$items$10 extends AbstractC3256z implements InterfaceC1670p {
    final /* synthetic */ InterfaceC1670p $itemContent;
    final /* synthetic */ T[] $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$items$10(InterfaceC1670p interfaceC1670p, T[] tArr) {
        super(4);
        this.$itemContent = interfaceC1670p;
        this.$items = tArr;
    }

    @Override // a6.InterfaceC1670p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((LazyGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return I.f8278a;
    }

    @Composable
    public final void invoke(LazyGridItemScope items, int i8, Composer composer, int i9) {
        int i10;
        AbstractC3255y.i(items, "$this$items");
        if ((i9 & 14) == 0) {
            i10 = (composer.changed(items) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 112) == 0) {
            i10 |= composer.changed(i8) ? 32 : 16;
        }
        if ((i10 & 731) == 146 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(407562193, i10, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:520)");
        }
        this.$itemContent.invoke(items, this.$items[i8], composer, Integer.valueOf(i10 & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
