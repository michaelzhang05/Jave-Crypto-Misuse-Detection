package androidx.compose.ui.platform;

import O5.C1352h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class CompositionLocalsKt$LocalClipboardManager$1 extends AbstractC3256z implements Function0 {
    public static final CompositionLocalsKt$LocalClipboardManager$1 INSTANCE = new CompositionLocalsKt$LocalClipboardManager$1();

    CompositionLocalsKt$LocalClipboardManager$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ClipboardManager invoke() {
        CompositionLocalsKt.noLocalProvidedFor("LocalClipboardManager");
        throw new C1352h();
    }
}
