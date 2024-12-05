package p5;

import android.text.TextUtils;
import android.widget.TextView;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: p5.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3611i {
    public static final void b(final TextView textView) {
        AbstractC3159y.i(textView, "<this>");
        textView.postDelayed(new Runnable() { // from class: p5.h
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3611i.c(textView);
            }
        }, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(TextView this_delayScroll) {
        AbstractC3159y.i(this_delayScroll, "$this_delayScroll");
        this_delayScroll.setSelected(true);
    }

    public static final void d(TextView textView) {
        AbstractC3159y.i(textView, "<this>");
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView.setMarqueeRepeatLimit(1);
        textView.setFocusable(true);
        textView.setFocusableInTouchMode(true);
        textView.setHorizontallyScrolling(true);
    }
}
