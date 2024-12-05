package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Picture;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3253w;

/* loaded from: classes3.dex */
public final class PictureKt {
    public static final Picture record(Picture picture, int i8, int i9, Function1 function1) {
        Canvas beginRecording = picture.beginRecording(i8, i9);
        try {
            function1.invoke(beginRecording);
            return picture;
        } finally {
            AbstractC3253w.b(1);
            picture.endRecording();
            AbstractC3253w.a(1);
        }
    }
}
