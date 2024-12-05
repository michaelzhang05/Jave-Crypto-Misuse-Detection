package androidx.compose.ui.text;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes.dex */
final class SaversKt$TextUnitSaver$1 extends AbstractC3256z implements InterfaceC1668n {
    public static final SaversKt$TextUnitSaver$1 INSTANCE = new SaversKt$TextUnitSaver$1();

    SaversKt$TextUnitSaver$1() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m4644invokempE4wyQ((SaverScope) obj, ((TextUnit) obj2).m5379unboximpl());
    }

    /* renamed from: invoke-mpE4wyQ, reason: not valid java name */
    public final Object m4644invokempE4wyQ(SaverScope saverScope, long j8) {
        return AbstractC1378t.g(SaversKt.save(Float.valueOf(TextUnit.m5370getValueimpl(j8))), SaversKt.save(TextUnitType.m5395boximpl(TextUnit.m5369getTypeUIouoOA(j8))));
    }
}
