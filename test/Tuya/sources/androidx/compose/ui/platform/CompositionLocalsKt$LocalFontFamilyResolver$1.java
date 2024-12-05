package androidx.compose.ui.platform;

import L5.C1224h;
import androidx.compose.ui.text.font.FontFamily;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class CompositionLocalsKt$LocalFontFamilyResolver$1 extends AbstractC3160z implements Function0 {
    public static final CompositionLocalsKt$LocalFontFamilyResolver$1 INSTANCE = new CompositionLocalsKt$LocalFontFamilyResolver$1();

    CompositionLocalsKt$LocalFontFamilyResolver$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final FontFamily.Resolver invoke() {
        CompositionLocalsKt.noLocalProvidedFor("LocalFontFamilyResolver");
        throw new C1224h();
    }
}
