package androidx.compose.ui.window;

import P5.AbstractC1378t;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RequiresApi;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(29)
/* loaded from: classes.dex */
public final class PopupLayoutHelperImpl29 extends PopupLayoutHelperImpl {
    @Override // androidx.compose.ui.window.PopupLayoutHelperImpl, androidx.compose.ui.window.PopupLayoutHelper
    public void setGestureExclusionRects(View view, int i8, int i9) {
        view.setSystemGestureExclusionRects(AbstractC1378t.s(new Rect(0, 0, i8, i9)));
    }
}
