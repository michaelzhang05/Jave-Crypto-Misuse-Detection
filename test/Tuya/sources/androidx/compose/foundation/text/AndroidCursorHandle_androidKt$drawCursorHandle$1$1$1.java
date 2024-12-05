package androidx.compose.foundation.text;

import L5.I;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.graphics.drawscope.c;
import androidx.compose.ui.graphics.drawscope.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ long $handleColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3160z implements Function1 {
        final /* synthetic */ ColorFilter $colorFilter;
        final /* synthetic */ ImageBitmap $imageBitmap;
        final /* synthetic */ float $radius;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(float f8, ImageBitmap imageBitmap, ColorFilter colorFilter) {
            super(1);
            this.$radius = f8;
            this.$imageBitmap = imageBitmap;
            this.$colorFilter = colorFilter;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ContentDrawScope) obj);
            return I.f6487a;
        }

        public final void invoke(ContentDrawScope onDrawWithContent) {
            AbstractC3159y.i(onDrawWithContent, "$this$onDrawWithContent");
            onDrawWithContent.drawContent();
            float f8 = this.$radius;
            ImageBitmap imageBitmap = this.$imageBitmap;
            ColorFilter colorFilter = this.$colorFilter;
            DrawContext drawContext = onDrawWithContent.getDrawContext();
            long mo3420getSizeNHjbRc = drawContext.mo3420getSizeNHjbRc();
            drawContext.getCanvas().save();
            DrawTransform transform = drawContext.getTransform();
            d.g(transform, f8, 0.0f, 2, null);
            transform.mo3426rotateUv8p0NA(45.0f, Offset.Companion.m2751getZeroF1C5BW0());
            c.A(onDrawWithContent, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
            drawContext.getCanvas().restore();
            drawContext.mo3421setSizeuvyYCjk(mo3420getSizeNHjbRc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1(long j8) {
        super(1);
        this.$handleColor = j8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DrawResult invoke(CacheDrawScope drawWithCache) {
        AbstractC3159y.i(drawWithCache, "$this$drawWithCache");
        float m2804getWidthimpl = Size.m2804getWidthimpl(drawWithCache.m2639getSizeNHjbRc()) / 2.0f;
        return drawWithCache.onDrawWithContent(new AnonymousClass1(m2804getWidthimpl, AndroidSelectionHandles_androidKt.createHandleImage(drawWithCache, m2804getWidthimpl), ColorFilter.Companion.m3012tintxETnrds$default(ColorFilter.Companion, this.$handleColor, 0, 2, null)));
    }
}
