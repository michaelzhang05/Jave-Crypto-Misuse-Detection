package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes.dex */
public abstract class i extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    private final g f2550b;

    /* renamed from: a, reason: collision with root package name */
    private final Paint.FontMetricsInt f2549a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    private short f2551c = -1;

    /* renamed from: d, reason: collision with root package name */
    private short f2552d = -1;

    /* renamed from: e, reason: collision with root package name */
    private float f2553e = 1.0f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(g gVar) {
        androidx.core.util.h.g(gVar, "metadata cannot be null");
        this.f2550b = gVar;
    }

    public final g a() {
        return this.f2550b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        return this.f2551c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i6, int i7, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f2549a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f2549a;
        this.f2553e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f2550b.e();
        this.f2552d = (short) (this.f2550b.e() * this.f2553e);
        short i8 = (short) (this.f2550b.i() * this.f2553e);
        this.f2551c = i8;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f2549a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i8;
    }
}
