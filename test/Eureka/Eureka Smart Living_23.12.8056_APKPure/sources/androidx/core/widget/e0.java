package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.x0;

/* loaded from: classes.dex */
public final class e0 implements x0 {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {
        static CharSequence a(Context context, ClipData.Item item, int i6) {
            if ((i6 & 1) == 0) {
                return item.coerceToStyledText(context);
            }
            CharSequence coerceToText = item.coerceToText(context);
            return coerceToText instanceof Spanned ? coerceToText.toString() : coerceToText;
        }
    }

    private static CharSequence b(Context context, ClipData.Item item, int i6) {
        return a.a(context, item, i6);
    }

    private static void c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @Override // androidx.core.view.x0
    public androidx.core.view.d a(View view, androidx.core.view.d dVar) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + dVar);
        }
        if (dVar.d() == 2) {
            return dVar;
        }
        ClipData b6 = dVar.b();
        int c6 = dVar.c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z5 = false;
        for (int i6 = 0; i6 < b6.getItemCount(); i6++) {
            CharSequence b7 = b(context, b6.getItemAt(i6), c6);
            if (b7 != null) {
                if (z5) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), b7);
                } else {
                    c(editable, b7);
                    z5 = true;
                }
            }
        }
        return null;
    }
}
