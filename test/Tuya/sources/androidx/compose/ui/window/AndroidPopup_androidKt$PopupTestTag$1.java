package androidx.compose.ui.window;

import L5.I;
import X5.n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidPopup_androidKt$PopupTestTag$1 extends AbstractC3160z implements n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ n $content;
    final /* synthetic */ String $tag;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$PopupTestTag$1(String str, n nVar, int i8) {
        super(2);
        this.$tag = str;
        this.$content = nVar;
        this.$$changed = i8;
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f6487a;
    }

    public final void invoke(Composer composer, int i8) {
        AndroidPopup_androidKt.PopupTestTag(this.$tag, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}