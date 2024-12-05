package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class o extends i {

    /* renamed from: f, reason: collision with root package name */
    private static Paint f2579f;

    public o(g gVar) {
        super(gVar);
    }

    private static Paint c() {
        if (f2579f == null) {
            TextPaint textPaint = new TextPaint();
            f2579f = textPaint;
            textPaint.setColor(e.b().c());
            f2579f.setStyle(Paint.Style.FILL);
        }
        return f2579f;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i6, int i7, float f6, int i8, int i9, int i10, Paint paint) {
        if (e.b().i()) {
            canvas.drawRect(f6, i8, f6 + b(), i10, c());
        }
        a().a(canvas, f6, i9, paint);
    }
}
