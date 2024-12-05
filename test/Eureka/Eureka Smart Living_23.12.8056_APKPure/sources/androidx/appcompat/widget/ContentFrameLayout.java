package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private TypedValue f803a;

    /* renamed from: b, reason: collision with root package name */
    private TypedValue f804b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f805c;

    /* renamed from: d, reason: collision with root package name */
    private TypedValue f806d;

    /* renamed from: e, reason: collision with root package name */
    private TypedValue f807e;

    /* renamed from: f, reason: collision with root package name */
    private TypedValue f808f;

    /* renamed from: g, reason: collision with root package name */
    private final Rect f809g;

    /* renamed from: h, reason: collision with root package name */
    private a f810h;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public void a(int i6, int i7, int i8, int i9) {
        this.f809g.set(i6, i7, i8, i9);
        if (androidx.core.view.b1.U(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f807e == null) {
            this.f807e = new TypedValue();
        }
        return this.f807e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f808f == null) {
            this.f808f = new TypedValue();
        }
        return this.f808f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f805c == null) {
            this.f805c = new TypedValue();
        }
        return this.f805c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f806d == null) {
            this.f806d = new TypedValue();
        }
        return this.f806d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f803a == null) {
            this.f803a = new TypedValue();
        }
        return this.f803a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f804b == null) {
            this.f804b = new TypedValue();
        }
        return this.f804b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f810h;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f810h;
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
        this.f810h = aVar;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f809g = new Rect();
    }
}
