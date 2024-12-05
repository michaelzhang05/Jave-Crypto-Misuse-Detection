package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    private TypedValue f383f;

    /* renamed from: g, reason: collision with root package name */
    private TypedValue f384g;

    /* renamed from: h, reason: collision with root package name */
    private TypedValue f385h;

    /* renamed from: i, reason: collision with root package name */
    private TypedValue f386i;

    /* renamed from: j, reason: collision with root package name */
    private TypedValue f387j;

    /* renamed from: k, reason: collision with root package name */
    private TypedValue f388k;
    private final Rect l;
    private a m;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public void a(Rect rect) {
        fitSystemWindows(rect);
    }

    public void b(int i2, int i3, int i4, int i5) {
        this.l.set(i2, i3, i4, i5);
        if (androidx.core.view.u.O(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f387j == null) {
            this.f387j = new TypedValue();
        }
        return this.f387j;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f388k == null) {
            this.f388k = new TypedValue();
        }
        return this.f388k;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f385h == null) {
            this.f385h = new TypedValue();
        }
        return this.f385h;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f386i == null) {
            this.f386i = new TypedValue();
        }
        return this.f386i;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f383f == null) {
            this.f383f = new TypedValue();
        }
        return this.f383f;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f384g == null) {
            this.f384g = new TypedValue();
        }
        return this.f384g;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.m;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.m;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.m = aVar;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.l = new Rect();
    }
}
