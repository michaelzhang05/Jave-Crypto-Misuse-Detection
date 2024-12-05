package androidx.compose.foundation.text.selection;

import O5.I;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.c;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ ResolvedTextDirection $direction;
    final /* synthetic */ long $handleColor;
    final /* synthetic */ boolean $handlesCrossed;
    final /* synthetic */ boolean $isStartHandle;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3256z implements Function1 {
        final /* synthetic */ ColorFilter $colorFilter;
        final /* synthetic */ ResolvedTextDirection $direction;
        final /* synthetic */ ImageBitmap $handleImage;
        final /* synthetic */ boolean $handlesCrossed;
        final /* synthetic */ boolean $isStartHandle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z8, ResolvedTextDirection resolvedTextDirection, boolean z9, ImageBitmap imageBitmap, ColorFilter colorFilter) {
            super(1);
            this.$isStartHandle = z8;
            this.$direction = resolvedTextDirection;
            this.$handlesCrossed = z9;
            this.$handleImage = imageBitmap;
            this.$colorFilter = colorFilter;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ContentDrawScope) obj);
            return I.f8278a;
        }

        public final void invoke(ContentDrawScope onDrawWithContent) {
            boolean isLeft;
            AbstractC3255y.i(onDrawWithContent, "$this$onDrawWithContent");
            onDrawWithContent.drawContent();
            isLeft = AndroidSelectionHandles_androidKt.isLeft(this.$isStartHandle, this.$direction, this.$handlesCrossed);
            if (isLeft) {
                ImageBitmap imageBitmap = this.$handleImage;
                ColorFilter colorFilter = this.$colorFilter;
                long mo3418getCenterF1C5BW0 = onDrawWithContent.mo3418getCenterF1C5BW0();
                DrawContext drawContext = onDrawWithContent.getDrawContext();
                long mo3425getSizeNHjbRc = drawContext.mo3425getSizeNHjbRc();
                drawContext.getCanvas().save();
                drawContext.getTransform().mo3432scale0AR0LA0(-1.0f, 1.0f, mo3418getCenterF1C5BW0);
                c.A(onDrawWithContent, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
                drawContext.getCanvas().restore();
                drawContext.mo3426setSizeuvyYCjk(mo3425getSizeNHjbRc);
                return;
            }
            c.A(onDrawWithContent, this.$handleImage, 0L, 0.0f, null, this.$colorFilter, 0, 46, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1(long j8, boolean z8, ResolvedTextDirection resolvedTextDirection, boolean z9) {
        super(1);
        this.$handleColor = j8;
        this.$isStartHandle = z8;
        this.$direction = resolvedTextDirection;
        this.$handlesCrossed = z9;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DrawResult invoke(CacheDrawScope drawWithCache) {
        AbstractC3255y.i(drawWithCache, "$this$drawWithCache");
        return drawWithCache.onDrawWithContent(new AnonymousClass1(this.$isStartHandle, this.$direction, this.$handlesCrossed, AndroidSelectionHandles_androidKt.createHandleImage(drawWithCache, Size.m2809getWidthimpl(drawWithCache.m2644getSizeNHjbRc()) / 2.0f), ColorFilter.Companion.m3017tintxETnrds$default(ColorFilter.Companion, this.$handleColor, 0, 2, null)));
    }
}
