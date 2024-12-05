package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;

/* loaded from: classes.dex */
public final class CanvasDrawScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawTransform asDrawTransform(final DrawContext drawContext) {
        return new DrawTransform() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt$asDrawTransform$1
            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: clipPath-mtrdD-E, reason: not valid java name */
            public void mo3427clipPathmtrdDE(Path path, int i8) {
                DrawContext.this.getCanvas().mo2834clipPathmtrdDE(path, i8);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: clipRect-N_I0leg, reason: not valid java name */
            public void mo3428clipRectN_I0leg(float f8, float f9, float f10, float f11, int i8) {
                DrawContext.this.getCanvas().mo2835clipRectN_I0leg(f8, f9, f10, f11, i8);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
            public long mo3429getCenterF1C5BW0() {
                return SizeKt.m2819getCenteruvyYCjk(mo3430getSizeNHjbRc());
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: getSize-NH-jbRc, reason: not valid java name */
            public long mo3430getSizeNHjbRc() {
                return DrawContext.this.mo3425getSizeNHjbRc();
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void inset(float f8, float f9, float f10, float f11) {
                Canvas canvas = DrawContext.this.getCanvas();
                DrawContext drawContext2 = DrawContext.this;
                long Size = SizeKt.Size(Size.m2809getWidthimpl(mo3430getSizeNHjbRc()) - (f10 + f8), Size.m2806getHeightimpl(mo3430getSizeNHjbRc()) - (f11 + f9));
                if (Size.m2809getWidthimpl(Size) >= 0.0f && Size.m2806getHeightimpl(Size) >= 0.0f) {
                    drawContext2.mo3426setSizeuvyYCjk(Size);
                    canvas.translate(f8, f9);
                    return;
                }
                throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: rotate-Uv8p0NA, reason: not valid java name */
            public void mo3431rotateUv8p0NA(float f8, long j8) {
                Canvas canvas = DrawContext.this.getCanvas();
                canvas.translate(Offset.m2740getXimpl(j8), Offset.m2741getYimpl(j8));
                canvas.rotate(f8);
                canvas.translate(-Offset.m2740getXimpl(j8), -Offset.m2741getYimpl(j8));
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: scale-0AR0LA0, reason: not valid java name */
            public void mo3432scale0AR0LA0(float f8, float f9, long j8) {
                Canvas canvas = DrawContext.this.getCanvas();
                canvas.translate(Offset.m2740getXimpl(j8), Offset.m2741getYimpl(j8));
                canvas.scale(f8, f9);
                canvas.translate(-Offset.m2740getXimpl(j8), -Offset.m2741getYimpl(j8));
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: transform-58bKbWc, reason: not valid java name */
            public void mo3433transform58bKbWc(float[] fArr) {
                DrawContext.this.getCanvas().mo2837concat58bKbWc(fArr);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void translate(float f8, float f9) {
                DrawContext.this.getCanvas().translate(f8, f9);
            }
        };
    }
}
