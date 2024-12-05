package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: a, reason: collision with root package name */
    private int f899a;

    /* renamed from: b, reason: collision with root package name */
    private int f900b;

    /* renamed from: c, reason: collision with root package name */
    private WeakReference f901c;

    /* renamed from: d, reason: collision with root package name */
    private LayoutInflater f902d;

    /* loaded from: classes.dex */
    public interface a {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f899a == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.f902d;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.f899a, viewGroup, false);
        int i6 = this.f900b;
        if (i6 != -1) {
            inflate.setId(i6);
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(inflate, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(inflate, indexOfChild);
        }
        this.f901c = new WeakReference(inflate);
        return inflate;
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f900b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f902d;
    }

    public int getLayoutResource() {
        return this.f899a;
    }

    @Override // android.view.View
    protected void onMeasure(int i6, int i7) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i6) {
        this.f900b = i6;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f902d = layoutInflater;
    }

    public void setLayoutResource(int i6) {
        this.f899a = i6;
    }

    public void setOnInflateListener(a aVar) {
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        WeakReference weakReference = this.f901c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i6);
            return;
        }
        super.setVisibility(i6);
        if (i6 == 0 || i6 == 4) {
            a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f899a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.j.C3, i6, 0);
        this.f900b = obtainStyledAttributes.getResourceId(d.j.F3, -1);
        this.f899a = obtainStyledAttributes.getResourceId(d.j.E3, 0);
        setId(obtainStyledAttributes.getResourceId(d.j.D3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
