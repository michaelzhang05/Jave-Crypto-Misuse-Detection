package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;

/* loaded from: classes.dex */
public final class BitmapPainterKt {
    /* renamed from: BitmapPainter-QZhYCtY, reason: not valid java name */
    public static final BitmapPainter m3510BitmapPainterQZhYCtY(ImageBitmap imageBitmap, long j8, long j9, int i8) {
        BitmapPainter bitmapPainter = new BitmapPainter(imageBitmap, j8, j9, null);
        bitmapPainter.m3509setFilterQualityvDHp3xo$ui_graphics_release(i8);
        return bitmapPainter;
    }

    /* renamed from: BitmapPainter-QZhYCtY$default, reason: not valid java name */
    public static /* synthetic */ BitmapPainter m3511BitmapPainterQZhYCtY$default(ImageBitmap imageBitmap, long j8, long j9, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            j8 = IntOffset.Companion.m5312getZeronOccac();
        }
        long j10 = j8;
        if ((i9 & 4) != 0) {
            j9 = IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight());
        }
        long j11 = j9;
        if ((i9 & 8) != 0) {
            i8 = FilterQuality.Companion.m3070getLowfv9h1I();
        }
        return m3510BitmapPainterQZhYCtY(imageBitmap, j10, j11, i8);
    }
}
