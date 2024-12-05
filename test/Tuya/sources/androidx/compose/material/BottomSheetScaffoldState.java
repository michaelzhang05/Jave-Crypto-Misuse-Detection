package androidx.compose.material;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3159y;

@Stable
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class BottomSheetScaffoldState {
    public static final int $stable = 0;
    private final BottomSheetState bottomSheetState;
    private final DrawerState drawerState;
    private final SnackbarHostState snackbarHostState;

    public BottomSheetScaffoldState(DrawerState drawerState, BottomSheetState bottomSheetState, SnackbarHostState snackbarHostState) {
        AbstractC3159y.i(drawerState, "drawerState");
        AbstractC3159y.i(bottomSheetState, "bottomSheetState");
        AbstractC3159y.i(snackbarHostState, "snackbarHostState");
        this.drawerState = drawerState;
        this.bottomSheetState = bottomSheetState;
        this.snackbarHostState = snackbarHostState;
    }

    public final BottomSheetState getBottomSheetState() {
        return this.bottomSheetState;
    }

    public final DrawerState getDrawerState() {
        return this.drawerState;
    }

    public final SnackbarHostState getSnackbarHostState() {
        return this.snackbarHostState;
    }
}
