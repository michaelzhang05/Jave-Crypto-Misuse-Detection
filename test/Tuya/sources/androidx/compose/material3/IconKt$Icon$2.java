package androidx.compose.material3;

import L5.I;
import X5.n;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ImageBitmap;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class IconKt$Icon$2 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ ImageBitmap $bitmap;
    final /* synthetic */ String $contentDescription;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ long $tint;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconKt$Icon$2(ImageBitmap imageBitmap, String str, Modifier modifier, long j8, int i8, int i9) {
        super(2);
        this.$bitmap = imageBitmap;
        this.$contentDescription = str;
        this.$modifier = modifier;
        this.$tint = j8;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(Composer composer, int i8) {
        IconKt.m1668Iconww6aTOc(this.$bitmap, this.$contentDescription, this.$modifier, this.$tint, composer, this.$$changed | 1, this.$$default);
    }
}