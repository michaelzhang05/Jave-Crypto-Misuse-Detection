package cm.aptoide.aptoideviews.common;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import cm.aptoide.pt.root.execution.Command;
import kotlin.Metadata;
import kotlin.b0.c;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;

/* compiled from: NonbreakingSpan.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JP\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J4\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016¨\u0006\u0016"}, d2 = {"Lcm/aptoide/aptoideviews/common/NonbreakingSpan;", "Landroid/text/style/ReplacementSpan;", "()V", "draw", HttpUrl.FRAGMENT_ENCODE_SET, "canvas", "Landroid/graphics/Canvas;", Command.CommandHandler.TEXT, HttpUrl.FRAGMENT_ENCODE_SET, "start", HttpUrl.FRAGMENT_ENCODE_SET, "end", "x", HttpUrl.FRAGMENT_ENCODE_SET, "top", "y", "bottom", "paint", "Landroid/graphics/Paint;", "getSize", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "aptoide-views_prodRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NonbreakingSpan extends ReplacementSpan {
    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        l.f(canvas, "canvas");
        l.f(text, Command.CommandHandler.TEXT);
        l.f(paint, "paint");
        canvas.drawText(text, start, end, x, y, paint);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) {
        int a;
        l.f(paint, "paint");
        a = c.a(paint.measureText(text, start, end));
        return a;
    }
}
