package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: f, reason: collision with root package name */
    long f1045f;

    /* renamed from: g, reason: collision with root package name */
    boolean f1046g;

    /* renamed from: h, reason: collision with root package name */
    boolean f1047h;

    /* renamed from: i, reason: collision with root package name */
    boolean f1048i;

    /* renamed from: j, reason: collision with root package name */
    private final Runnable f1049j;

    /* renamed from: k, reason: collision with root package name */
    private final Runnable f1050k;

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1045f = -1L;
        this.f1046g = false;
        this.f1047h = false;
        this.f1048i = false;
        this.f1049j = new Runnable() { // from class: androidx.core.widget.a
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.b();
            }
        };
        this.f1050k = new Runnable() { // from class: androidx.core.widget.b
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.d();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void b() {
        this.f1046g = false;
        this.f1045f = -1L;
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void d() {
        this.f1047h = false;
        if (this.f1048i) {
            return;
        }
        this.f1045f = System.currentTimeMillis();
        setVisibility(0);
    }

    private void e() {
        removeCallbacks(this.f1049j);
        removeCallbacks(this.f1050k);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        e();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }
}
