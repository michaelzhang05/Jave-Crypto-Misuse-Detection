package v;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f9490a = new String[0];

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {
        static void a(EditorInfo editorInfo, CharSequence charSequence, int i6) {
            editorInfo.setInitialSurroundingSubText(charSequence, i6);
        }
    }

    public static String[] a(EditorInfo editorInfo) {
        String[] strArr;
        if (Build.VERSION.SDK_INT >= 25) {
            strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : f9490a;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f9490a;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        return stringArray != null ? stringArray : f9490a;
    }

    private static boolean b(CharSequence charSequence, int i6, int i7) {
        if (i7 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i6));
        }
        if (i7 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i6));
    }

    private static boolean c(int i6) {
        int i7 = i6 & 4095;
        return i7 == 129 || i7 == 225 || i7 == 18;
    }

    public static void d(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    public static void e(EditorInfo editorInfo, CharSequence charSequence, int i6) {
        androidx.core.util.h.f(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            a.a(editorInfo, charSequence, i6);
            return;
        }
        int i7 = editorInfo.initialSelStart;
        int i8 = editorInfo.initialSelEnd;
        int i9 = i7 > i8 ? i8 - i6 : i7 - i6;
        int i10 = i7 > i8 ? i7 - i6 : i8 - i6;
        int length = charSequence.length();
        if (i6 < 0 || i9 < 0 || i10 > length) {
            g(editorInfo, null, 0, 0);
            return;
        }
        if (c(editorInfo.inputType)) {
            g(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            g(editorInfo, charSequence, i9, i10);
        } else {
            h(editorInfo, charSequence, i9, i10);
        }
    }

    public static void f(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            a.a(editorInfo, charSequence, 0);
        } else {
            e(editorInfo, charSequence, 0);
        }
    }

    private static void g(EditorInfo editorInfo, CharSequence charSequence, int i6, int i7) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i6);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i7);
    }

    private static void h(EditorInfo editorInfo, CharSequence charSequence, int i6, int i7) {
        int i8 = i7 - i6;
        int i9 = i8 > 1024 ? 0 : i8;
        int i10 = 2048 - i9;
        int min = Math.min(charSequence.length() - i7, i10 - Math.min(i6, (int) (i10 * 0.8d)));
        int min2 = Math.min(i6, i10 - min);
        int i11 = i6 - min2;
        if (b(charSequence, i11, 0)) {
            i11++;
            min2--;
        }
        if (b(charSequence, (i7 + min) - 1, 1)) {
            min--;
        }
        CharSequence concat = i9 != i8 ? TextUtils.concat(charSequence.subSequence(i11, i11 + min2), charSequence.subSequence(i7, min + i7)) : charSequence.subSequence(i11, min2 + i9 + min + i11);
        int i12 = min2 + 0;
        g(editorInfo, concat, i12, i9 + i12);
    }
}
