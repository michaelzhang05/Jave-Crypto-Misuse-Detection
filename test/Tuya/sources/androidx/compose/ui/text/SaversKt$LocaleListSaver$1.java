package androidx.compose.ui.text;

import X5.n;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes.dex */
final class SaversKt$LocaleListSaver$1 extends AbstractC3160z implements n {
    public static final SaversKt$LocaleListSaver$1 INSTANCE = new SaversKt$LocaleListSaver$1();

    SaversKt$LocaleListSaver$1() {
        super(2);
    }

    @Override // X5.n
    public final Object invoke(SaverScope saverScope, LocaleList localeList) {
        List<Locale> localeList2 = localeList.getLocaleList();
        ArrayList arrayList = new ArrayList(localeList2.size());
        int size = localeList2.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(SaversKt.save(localeList2.get(i8), SaversKt.getSaver(Locale.Companion), saverScope));
        }
        return arrayList;
    }
}
