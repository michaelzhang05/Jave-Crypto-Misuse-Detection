package androidx.compose.ui.text;

import X5.n;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.intl.Locale;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class SaversKt$LocaleSaver$1 extends AbstractC3160z implements n {
    public static final SaversKt$LocaleSaver$1 INSTANCE = new SaversKt$LocaleSaver$1();

    SaversKt$LocaleSaver$1() {
        super(2);
    }

    @Override // X5.n
    public final Object invoke(SaverScope saverScope, Locale locale) {
        return locale.toLanguageTag();
    }
}
