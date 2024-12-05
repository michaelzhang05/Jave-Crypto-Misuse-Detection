package androidx.compose.material3;

import L5.I;
import X5.n;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AlertDialogKt$AlertDialogContent$2 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $buttonContentColor;
    final /* synthetic */ n $buttons;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ n $icon;
    final /* synthetic */ long $iconContentColor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ n $text;
    final /* synthetic */ long $textContentColor;
    final /* synthetic */ n $title;
    final /* synthetic */ long $titleContentColor;
    final /* synthetic */ float $tonalElevation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$AlertDialogContent$2(n nVar, Modifier modifier, n nVar2, n nVar3, n nVar4, Shape shape, long j8, float f8, long j9, long j10, long j11, long j12, int i8, int i9, int i10) {
        super(2);
        this.$buttons = nVar;
        this.$modifier = modifier;
        this.$icon = nVar2;
        this.$title = nVar3;
        this.$text = nVar4;
        this.$shape = shape;
        this.$containerColor = j8;
        this.$tonalElevation = f8;
        this.$buttonContentColor = j9;
        this.$iconContentColor = j10;
        this.$titleContentColor = j11;
        this.$textContentColor = j12;
        this.$$changed = i8;
        this.$$changed1 = i9;
        this.$$default = i10;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(Composer composer, int i8) {
        AlertDialogKt.m1451AlertDialogContent4hvqGtA(this.$buttons, this.$modifier, this.$icon, this.$title, this.$text, this.$shape, this.$containerColor, this.$tonalElevation, this.$buttonContentColor, this.$iconContentColor, this.$titleContentColor, this.$textContentColor, composer, this.$$changed | 1, this.$$changed1, this.$$default);
    }
}
