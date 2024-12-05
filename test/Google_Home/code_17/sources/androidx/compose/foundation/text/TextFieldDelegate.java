package androidx.compose.foundation.text;

import O5.w;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.T;

/* loaded from: classes.dex */
public final class TextFieldDelegate {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: layout-_EkL_-Y$foundation_release$default, reason: not valid java name */
        public static /* synthetic */ w m935layout_EkL_Y$foundation_release$default(Companion companion, TextDelegate textDelegate, long j8, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult, int i8, Object obj) {
            if ((i8 & 8) != 0) {
                textLayoutResult = null;
            }
            return companion.m937layout_EkL_Y$foundation_release(textDelegate, j8, layoutDirection, textLayoutResult);
        }

        /* renamed from: applyCompositionDecoration-72CqOWE, reason: not valid java name */
        public final TransformedText m936applyCompositionDecoration72CqOWE(long j8, TransformedText transformed) {
            AbstractC3255y.i(transformed, "transformed");
            AnnotatedString.Builder builder = new AnnotatedString.Builder(transformed.getText());
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (AbstractC3247p) null), transformed.getOffsetMapping().originalToTransformed(TextRange.m4697getStartimpl(j8)), transformed.getOffsetMapping().originalToTransformed(TextRange.m4692getEndimpl(j8)));
            return new TransformedText(builder.toAnnotatedString(), transformed.getOffsetMapping());
        }

        public final void draw$foundation_release(Canvas canvas, TextFieldValue value, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Paint selectionPaint) {
            int originalToTransformed;
            int originalToTransformed2;
            AbstractC3255y.i(canvas, "canvas");
            AbstractC3255y.i(value, "value");
            AbstractC3255y.i(offsetMapping, "offsetMapping");
            AbstractC3255y.i(textLayoutResult, "textLayoutResult");
            AbstractC3255y.i(selectionPaint, "selectionPaint");
            if (!TextRange.m4691getCollapsedimpl(value.m4934getSelectiond9O1mEE()) && (originalToTransformed = offsetMapping.originalToTransformed(TextRange.m4695getMinimpl(value.m4934getSelectiond9O1mEE()))) != (originalToTransformed2 = offsetMapping.originalToTransformed(TextRange.m4694getMaximpl(value.m4934getSelectiond9O1mEE())))) {
                canvas.drawPath(textLayoutResult.getPathForRange(originalToTransformed, originalToTransformed2), selectionPaint);
            }
            TextPainter.INSTANCE.paint(canvas, textLayoutResult);
        }

        /* renamed from: layout-_EkL_-Y$foundation_release, reason: not valid java name */
        public final w m937layout_EkL_Y$foundation_release(TextDelegate textDelegate, long j8, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult) {
            AbstractC3255y.i(textDelegate, "textDelegate");
            AbstractC3255y.i(layoutDirection, "layoutDirection");
            TextLayoutResult m927layoutNN6EwU = textDelegate.m927layoutNN6EwU(j8, layoutDirection, textLayoutResult);
            return new w(Integer.valueOf(IntSize.m5349getWidthimpl(m927layoutNN6EwU.m4670getSizeYbymL2g())), Integer.valueOf(IntSize.m5348getHeightimpl(m927layoutNN6EwU.m4670getSizeYbymL2g())), m927layoutNN6EwU);
        }

        public final void notifyFocusedRect$foundation_release(TextFieldValue value, TextDelegate textDelegate, TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates, TextInputSession textInputSession, boolean z8, OffsetMapping offsetMapping) {
            Rect rect;
            AbstractC3255y.i(value, "value");
            AbstractC3255y.i(textDelegate, "textDelegate");
            AbstractC3255y.i(textLayoutResult, "textLayoutResult");
            AbstractC3255y.i(layoutCoordinates, "layoutCoordinates");
            AbstractC3255y.i(textInputSession, "textInputSession");
            AbstractC3255y.i(offsetMapping, "offsetMapping");
            if (!z8) {
                return;
            }
            int originalToTransformed = offsetMapping.originalToTransformed(TextRange.m4694getMaximpl(value.m4934getSelectiond9O1mEE()));
            if (originalToTransformed < textLayoutResult.getLayoutInput().getText().length()) {
                rect = textLayoutResult.getBoundingBox(originalToTransformed);
            } else if (originalToTransformed != 0) {
                rect = textLayoutResult.getBoundingBox(originalToTransformed - 1);
            } else {
                rect = new Rect(0.0f, 0.0f, 1.0f, IntSize.m5348getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null)));
            }
            long mo4145localToRootMKHz9U = layoutCoordinates.mo4145localToRootMKHz9U(OffsetKt.Offset(rect.getLeft(), rect.getTop()));
            textInputSession.notifyFocusedRect(RectKt.m2780Recttz77jQw(OffsetKt.Offset(Offset.m2740getXimpl(mo4145localToRootMKHz9U), Offset.m2741getYimpl(mo4145localToRootMKHz9U)), SizeKt.Size(rect.getWidth(), rect.getHeight())));
        }

        public final void onBlur$foundation_release(TextInputSession textInputSession, EditProcessor editProcessor, Function1 onValueChange) {
            AbstractC3255y.i(textInputSession, "textInputSession");
            AbstractC3255y.i(editProcessor, "editProcessor");
            AbstractC3255y.i(onValueChange, "onValueChange");
            onValueChange.invoke(TextFieldValue.m4929copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null));
            textInputSession.dispose();
        }

        public final void onEditCommand$foundation_release(List<? extends EditCommand> ops, EditProcessor editProcessor, Function1 onValueChange, TextInputSession textInputSession) {
            AbstractC3255y.i(ops, "ops");
            AbstractC3255y.i(editProcessor, "editProcessor");
            AbstractC3255y.i(onValueChange, "onValueChange");
            TextFieldValue apply = editProcessor.apply(ops);
            if (textInputSession != null) {
                textInputSession.updateState(null, apply);
            }
            onValueChange.invoke(apply);
        }

        public final TextInputSession onFocus$foundation_release(TextInputService textInputService, TextFieldValue value, EditProcessor editProcessor, ImeOptions imeOptions, Function1 onValueChange, Function1 onImeActionPerformed) {
            AbstractC3255y.i(textInputService, "textInputService");
            AbstractC3255y.i(value, "value");
            AbstractC3255y.i(editProcessor, "editProcessor");
            AbstractC3255y.i(imeOptions, "imeOptions");
            AbstractC3255y.i(onValueChange, "onValueChange");
            AbstractC3255y.i(onImeActionPerformed, "onImeActionPerformed");
            return restartInput$foundation_release(textInputService, value, editProcessor, imeOptions, onValueChange, onImeActionPerformed);
        }

        public final TextInputSession restartInput$foundation_release(TextInputService textInputService, TextFieldValue value, EditProcessor editProcessor, ImeOptions imeOptions, Function1 onValueChange, Function1 onImeActionPerformed) {
            AbstractC3255y.i(textInputService, "textInputService");
            AbstractC3255y.i(value, "value");
            AbstractC3255y.i(editProcessor, "editProcessor");
            AbstractC3255y.i(imeOptions, "imeOptions");
            AbstractC3255y.i(onValueChange, "onValueChange");
            AbstractC3255y.i(onImeActionPerformed, "onImeActionPerformed");
            T t8 = new T();
            TextInputSession startInput = textInputService.startInput(value, imeOptions, new TextFieldDelegate$Companion$restartInput$1(editProcessor, onValueChange, t8), onImeActionPerformed);
            t8.f34162a = startInput;
            return startInput;
        }

        /* renamed from: setCursorOffset-ULxng0E$foundation_release, reason: not valid java name */
        public final void m938setCursorOffsetULxng0E$foundation_release(long j8, TextLayoutResultProxy textLayoutResult, EditProcessor editProcessor, OffsetMapping offsetMapping, Function1 onValueChange) {
            AbstractC3255y.i(textLayoutResult, "textLayoutResult");
            AbstractC3255y.i(editProcessor, "editProcessor");
            AbstractC3255y.i(offsetMapping, "offsetMapping");
            AbstractC3255y.i(onValueChange, "onValueChange");
            onValueChange.invoke(TextFieldValue.m4929copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (AnnotatedString) null, TextRangeKt.TextRange(offsetMapping.transformedToOriginal(TextLayoutResultProxy.m962getOffsetForPosition3MmeM6k$default(textLayoutResult, j8, false, 2, null))), (TextRange) null, 5, (Object) null));
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }
}
