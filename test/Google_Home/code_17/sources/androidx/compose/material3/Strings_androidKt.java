package androidx.compose.material3;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.material3.Strings;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class Strings_androidKt {
    @Composable
    /* renamed from: getString-NWtq2-8, reason: not valid java name */
    public static final String m1800getStringNWtq28(int i8, Composer composer, int i9) {
        String str;
        composer.startReplaceableGroup(-176762646);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-176762646, i9, -1, "androidx.compose.material3.getString (Strings.android.kt:24)");
        }
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        Strings.Companion companion = Strings.Companion;
        if (Strings.m1786equalsimpl0(i8, companion.m1797getNavigationMenuadMyvUU())) {
            str = resources.getString(androidx.compose.ui.R.string.navigation_menu);
            AbstractC3255y.h(str, "resources.getString(R.string.navigation_menu)");
        } else if (Strings.m1786equalsimpl0(i8, companion.m1790getCloseDraweradMyvUU())) {
            str = resources.getString(androidx.compose.ui.R.string.close_drawer);
            AbstractC3255y.h(str, "resources.getString(R.string.close_drawer)");
        } else if (Strings.m1786equalsimpl0(i8, companion.m1791getCloseSheetadMyvUU())) {
            str = resources.getString(androidx.compose.ui.R.string.close_sheet);
            AbstractC3255y.h(str, "resources.getString(R.string.close_sheet)");
        } else if (Strings.m1786equalsimpl0(i8, companion.m1792getDefaultErrorMessageadMyvUU())) {
            str = resources.getString(androidx.compose.ui.R.string.default_error_message);
            AbstractC3255y.h(str, "resources.getString(R.st…ng.default_error_message)");
        } else if (Strings.m1786equalsimpl0(i8, companion.m1794getExposedDropdownMenuadMyvUU())) {
            str = resources.getString(androidx.compose.ui.R.string.dropdown_menu);
            AbstractC3255y.h(str, "resources.getString(R.string.dropdown_menu)");
        } else if (Strings.m1786equalsimpl0(i8, companion.m1799getSliderRangeStartadMyvUU())) {
            str = resources.getString(androidx.compose.ui.R.string.range_start);
            AbstractC3255y.h(str, "resources.getString(R.string.range_start)");
        } else if (Strings.m1786equalsimpl0(i8, companion.m1798getSliderRangeEndadMyvUU())) {
            str = resources.getString(androidx.compose.ui.R.string.range_end);
            AbstractC3255y.h(str, "resources.getString(R.string.range_end)");
        } else if (Strings.m1786equalsimpl0(i8, companion.m1793getDialogadMyvUU())) {
            str = resources.getString(R.string.dialog);
            AbstractC3255y.h(str, "resources.getString(andr…aterial3.R.string.dialog)");
        } else if (Strings.m1786equalsimpl0(i8, companion.m1796getMenuExpandedadMyvUU())) {
            str = resources.getString(R.string.expanded);
            AbstractC3255y.h(str, "resources.getString(andr…erial3.R.string.expanded)");
        } else if (Strings.m1786equalsimpl0(i8, companion.m1795getMenuCollapsedadMyvUU())) {
            str = resources.getString(R.string.collapsed);
            AbstractC3255y.h(str, "resources.getString(andr…rial3.R.string.collapsed)");
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
