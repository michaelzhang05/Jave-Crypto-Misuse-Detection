package androidx.compose.material3;

import O5.I;
import a6.InterfaceC1668n;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavigationDrawerKt$Scrim$2 extends AbstractC3256z implements InterfaceC1668n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $color;
    final /* synthetic */ Function0 $fraction;
    final /* synthetic */ Function0 $onClose;
    final /* synthetic */ boolean $open;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$Scrim$2(boolean z8, Function0 function0, Function0 function02, long j8, int i8) {
        super(2);
        this.$open = z8;
        this.$onClose = function0;
        this.$fraction = function02;
        this.$color = j8;
        this.$$changed = i8;
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8278a;
    }

    public final void invoke(Composer composer, int i8) {
        NavigationDrawerKt.m1722ScrimBx497Mc(this.$open, this.$onClose, this.$fraction, this.$color, composer, this.$$changed | 1);
    }
}
