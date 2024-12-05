package androidx.compose.material3;

import L5.I;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavigationBarKt$NavigationBarItem$2$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ MutableState<Integer> $itemWidth$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBarKt$NavigationBarItem$2$1(MutableState<Integer> mutableState) {
        super(1);
        this.$itemWidth$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m1708invokeozmzZPI(((IntSize) obj).m5348unboximpl());
        return I.f6487a;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m1708invokeozmzZPI(long j8) {
        NavigationBarKt.m1700NavigationBarItem$lambda4(this.$itemWidth$delegate, IntSize.m5344getWidthimpl(j8));
    }
}
