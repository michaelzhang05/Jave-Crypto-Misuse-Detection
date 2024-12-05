package androidx.compose.ui.text;

import M5.AbstractC1246t;
import X5.n;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class SaversKt$TextUnitSaver$1 extends AbstractC3160z implements n {
    public static final SaversKt$TextUnitSaver$1 INSTANCE = new SaversKt$TextUnitSaver$1();

    SaversKt$TextUnitSaver$1() {
        super(2);
    }

    @Override // X5.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m4639invokempE4wyQ((SaverScope) obj, ((TextUnit) obj2).m5374unboximpl());
    }

    /* renamed from: invoke-mpE4wyQ, reason: not valid java name */
    public final Object m4639invokempE4wyQ(SaverScope saverScope, long j8) {
        return AbstractC1246t.g(SaversKt.save(Float.valueOf(TextUnit.m5365getValueimpl(j8))), SaversKt.save(TextUnitType.m5390boximpl(TextUnit.m5364getTypeUIouoOA(j8))));
    }
}
