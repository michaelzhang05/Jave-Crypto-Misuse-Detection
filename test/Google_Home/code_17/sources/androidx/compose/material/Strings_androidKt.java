package androidx.compose.material;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.material.Strings;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class Strings_androidKt {
    @Composable
    /* renamed from: getString-4foXLRw, reason: not valid java name */
    public static final String m1356getString4foXLRw(int i8, Composer composer, int i9) {
        String str;
        composer.startReplaceableGroup(-726638443);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-726638443, i9, -1, "androidx.compose.material.getString (Strings.android.kt:24)");
        }
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        Strings.Companion companion = Strings.Companion;
        if (Strings.m1345equalsimpl0(i8, companion.m1353getNavigationMenuUdPEhr4())) {
            str = resources.getString(androidx.compose.ui.R.string.navigation_menu);
            AbstractC3255y.h(str, "resources.getString(R.string.navigation_menu)");
        } else if (Strings.m1345equalsimpl0(i8, companion.m1349getCloseDrawerUdPEhr4())) {
            str = resources.getString(androidx.compose.ui.R.string.close_drawer);
            AbstractC3255y.h(str, "resources.getString(R.string.close_drawer)");
        } else if (Strings.m1345equalsimpl0(i8, companion.m1350getCloseSheetUdPEhr4())) {
            str = resources.getString(androidx.compose.ui.R.string.close_sheet);
            AbstractC3255y.h(str, "resources.getString(R.string.close_sheet)");
        } else if (Strings.m1345equalsimpl0(i8, companion.m1351getDefaultErrorMessageUdPEhr4())) {
            str = resources.getString(androidx.compose.ui.R.string.default_error_message);
            AbstractC3255y.h(str, "resources.getString(R.st…ng.default_error_message)");
        } else if (Strings.m1345equalsimpl0(i8, companion.m1352getExposedDropdownMenuUdPEhr4())) {
            str = resources.getString(androidx.compose.ui.R.string.dropdown_menu);
            AbstractC3255y.h(str, "resources.getString(R.string.dropdown_menu)");
        } else if (Strings.m1345equalsimpl0(i8, companion.m1355getSliderRangeStartUdPEhr4())) {
            str = resources.getString(androidx.compose.ui.R.string.range_start);
            AbstractC3255y.h(str, "resources.getString(R.string.range_start)");
        } else if (Strings.m1345equalsimpl0(i8, companion.m1354getSliderRangeEndUdPEhr4())) {
            str = resources.getString(androidx.compose.ui.R.string.range_end);
            AbstractC3255y.h(str, "resources.getString(R.string.range_end)");
        } else {
            str = "";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return str;
    }
}
