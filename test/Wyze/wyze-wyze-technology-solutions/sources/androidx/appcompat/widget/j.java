package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: AppCompatHintHelper.java */
/* loaded from: classes.dex */
class j {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                }
                if (parent instanceof x0) {
                    editorInfo.hintText = ((x0) parent).a();
                    break;
                }
                parent = parent.getParent();
            }
        }
        return inputConnection;
    }
}
