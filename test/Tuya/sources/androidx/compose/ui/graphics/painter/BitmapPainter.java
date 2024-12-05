package androidx.compose.ui.graphics.painter;

import Z5.a;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.c;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class BitmapPainter extends Painter {
    private float alpha;
    private ColorFilter colorFilter;
    private int filterQuality;
    private final ImageBitmap image;
    private final long size;
    private final long srcOffset;
    private final long srcSize;

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j8, long j9, AbstractC3151p abstractC3151p) {
        this(imageBitmap, j8, j9);
    }

    /* renamed from: validateSize-N5eqBDc, reason: not valid java name */
    private final long m3506validateSizeN5eqBDc(long j8, long j9) {
        if (IntOffset.m5302getXimpl(j8) >= 0 && IntOffset.m5303getYimpl(j8) >= 0 && IntSize.m5344getWidthimpl(j9) >= 0 && IntSize.m5343getHeightimpl(j9) >= 0 && IntSize.m5344getWidthimpl(j9) <= this.image.getWidth() && IntSize.m5343getHeightimpl(j9) <= this.image.getHeight()) {
            return j9;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyAlpha(float f8) {
        this.alpha = f8;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) obj;
        if (AbstractC3159y.d(this.image, bitmapPainter.image) && IntOffset.m5301equalsimpl0(this.srcOffset, bitmapPainter.srcOffset) && IntSize.m5342equalsimpl0(this.srcSize, bitmapPainter.srcSize) && FilterQuality.m3065equalsimpl0(this.filterQuality, bitmapPainter.filterQuality)) {
            return true;
        }
        return false;
    }

    /* renamed from: getFilterQuality-f-v9h1I$ui_graphics_release, reason: not valid java name */
    public final int m3507getFilterQualityfv9h1I$ui_graphics_release() {
        return this.filterQuality;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public long mo3508getIntrinsicSizeNHjbRc() {
        return IntSizeKt.m5354toSizeozmzZPI(this.size);
    }

    public int hashCode() {
        return (((((this.image.hashCode() * 31) + IntOffset.m5304hashCodeimpl(this.srcOffset)) * 31) + IntSize.m5345hashCodeimpl(this.srcSize)) * 31) + FilterQuality.m3066hashCodeimpl(this.filterQuality);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(DrawScope drawScope) {
        c.z(drawScope, this.image, this.srcOffset, this.srcSize, 0L, IntSizeKt.IntSize(a.d(Size.m2804getWidthimpl(drawScope.mo3414getSizeNHjbRc())), a.d(Size.m2801getHeightimpl(drawScope.mo3414getSizeNHjbRc()))), this.alpha, null, this.colorFilter, 0, this.filterQuality, 328, null);
    }

    /* renamed from: setFilterQuality-vDHp3xo$ui_graphics_release, reason: not valid java name */
    public final void m3509setFilterQualityvDHp3xo$ui_graphics_release(int i8) {
        this.filterQuality = i8;
    }

    public String toString() {
        return "BitmapPainter(image=" + this.image + ", srcOffset=" + ((Object) IntOffset.m5309toStringimpl(this.srcOffset)) + ", srcSize=" + ((Object) IntSize.m5347toStringimpl(this.srcSize)) + ", filterQuality=" + ((Object) FilterQuality.m3067toStringimpl(this.filterQuality)) + ')';
    }

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j8, long j9, int i8, AbstractC3151p abstractC3151p) {
        this(imageBitmap, (i8 & 2) != 0 ? IntOffset.Companion.m5312getZeronOccac() : j8, (i8 & 4) != 0 ? IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j9, null);
    }

    private BitmapPainter(ImageBitmap imageBitmap, long j8, long j9) {
        this.image = imageBitmap;
        this.srcOffset = j8;
        this.srcSize = j9;
        this.filterQuality = FilterQuality.Companion.m3070getLowfv9h1I();
        this.size = m3506validateSizeN5eqBDc(j8, j9);
        this.alpha = 1.0f;
    }
}
