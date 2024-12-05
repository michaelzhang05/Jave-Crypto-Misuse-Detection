package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Picture;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3157w;

/* loaded from: classes3.dex */
public final class PictureKt {
    public static final Picture record(Picture picture, int i8, int i9, Function1 function1) {
        Canvas beginRecording = picture.beginRecording(i8, i9);
        try {
            function1.invoke(beginRecording);
            return picture;
        } finally {
            AbstractC3157w.b(1);
            picture.endRecording();
            AbstractC3157w.a(1);
        }
    }
}
