package androidx.compose.ui.platform;

import L5.C1224h;
import androidx.compose.ui.text.font.Font;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class CompositionLocalsKt$LocalFontLoader$1 extends AbstractC3160z implements Function0 {
    public static final CompositionLocalsKt$LocalFontLoader$1 INSTANCE = new CompositionLocalsKt$LocalFontLoader$1();

    CompositionLocalsKt$LocalFontLoader$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Font.ResourceLoader invoke() {
        CompositionLocalsKt.noLocalProvidedFor("LocalFontLoader");
        throw new C1224h();
    }
}
