package androidx.compose.ui.autofill;

import Z5.a;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Rect;
import g.AbstractC2696c;
import g.e;

@StabilityInferred(parameters = 0)
@RequiresApi(26)
@ExperimentalComposeUiApi
/* loaded from: classes.dex */
public final class AndroidAutofill implements Autofill {
    public static final int $stable = 8;
    private final AutofillManager autofillManager;
    private final AutofillTree autofillTree;
    private final View view;

    public AndroidAutofill(View view, AutofillTree autofillTree) {
        Object systemService;
        this.view = view;
        this.autofillTree = autofillTree;
        systemService = view.getContext().getSystemService((Class<Object>) AbstractC2696c.a());
        AutofillManager a8 = e.a(systemService);
        if (a8 != null) {
            this.autofillManager = a8;
            view.setImportantForAutofill(1);
            return;
        }
        throw new IllegalStateException("Autofill service could not be located.".toString());
    }

    @Override // androidx.compose.ui.autofill.Autofill
    public void cancelAutofillForNode(AutofillNode autofillNode) {
        this.autofillManager.notifyViewExited(this.view, autofillNode.getId());
    }

    public final AutofillManager getAutofillManager() {
        return this.autofillManager;
    }

    public final AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    public final View getView() {
        return this.view;
    }

    @Override // androidx.compose.ui.autofill.Autofill
    public void requestAutofillForNode(AutofillNode autofillNode) {
        Rect boundingBox = autofillNode.getBoundingBox();
        if (boundingBox != null) {
            this.autofillManager.notifyViewEntered(this.view, autofillNode.getId(), new android.graphics.Rect(a.d(boundingBox.getLeft()), a.d(boundingBox.getTop()), a.d(boundingBox.getRight()), a.d(boundingBox.getBottom())));
            return;
        }
        throw new IllegalStateException("requestAutofill called before onChildPositioned()".toString());
    }
}
