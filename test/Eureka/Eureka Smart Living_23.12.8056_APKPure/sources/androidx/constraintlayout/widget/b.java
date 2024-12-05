package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class b extends View {

    /* renamed from: a, reason: collision with root package name */
    protected int[] f1590a;

    /* renamed from: b, reason: collision with root package name */
    protected int f1591b;

    /* renamed from: c, reason: collision with root package name */
    protected Context f1592c;

    /* renamed from: d, reason: collision with root package name */
    protected p.i f1593d;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f1594e;

    /* renamed from: f, reason: collision with root package name */
    protected String f1595f;

    /* renamed from: g, reason: collision with root package name */
    private View[] f1596g;

    /* renamed from: h, reason: collision with root package name */
    private HashMap f1597h;

    public b(Context context) {
        super(context);
        this.f1590a = new int[32];
        this.f1594e = false;
        this.f1596g = null;
        this.f1597h = new HashMap();
        this.f1592c = context;
        g(null);
    }

    private void a(String str) {
        if (str == null || str.length() == 0 || this.f1592c == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int f6 = f(trim);
        if (f6 != 0) {
            this.f1597h.put(Integer.valueOf(f6), trim);
            b(f6);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    private void b(int i6) {
        if (i6 == getId()) {
            return;
        }
        int i7 = this.f1591b + 1;
        int[] iArr = this.f1590a;
        if (i7 > iArr.length) {
            this.f1590a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1590a;
        int i8 = this.f1591b;
        iArr2[i8] = i6;
        this.f1591b = i8 + 1;
    }

    private int e(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f1592c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = constraintLayout.getChildAt(i6);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int f(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i6 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object f6 = constraintLayout.f(0, str);
            if (f6 instanceof Integer) {
                i6 = ((Integer) f6).intValue();
            }
        }
        if (i6 == 0 && constraintLayout != null) {
            i6 = e(constraintLayout, str);
        }
        if (i6 == 0) {
            try {
                i6 = g.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i6 == 0 ? this.f1592c.getResources().getIdentifier(str, "id", this.f1592c.getPackageName()) : i6;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        d((ConstraintLayout) parent);
    }

    protected void d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i6 = 0; i6 < this.f1591b; i6++) {
            View h6 = constraintLayout.h(this.f1590a[i6]);
            if (h6 != null) {
                h6.setVisibility(visibility);
                if (elevation > 0.0f) {
                    h6.setTranslationZ(h6.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.f1690a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == h.f1821t1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1595f = string;
                    setIds(string);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1590a, this.f1591b);
    }

    public abstract void h(p.e eVar, boolean z5);

    public void i(ConstraintLayout constraintLayout) {
    }

    public void j(ConstraintLayout constraintLayout) {
    }

    public void k(ConstraintLayout constraintLayout) {
    }

    public void l(ConstraintLayout constraintLayout) {
        String str;
        int e6;
        if (isInEditMode()) {
            setIds(this.f1595f);
        }
        p.i iVar = this.f1593d;
        if (iVar == null) {
            return;
        }
        iVar.a();
        for (int i6 = 0; i6 < this.f1591b; i6++) {
            int i7 = this.f1590a[i6];
            View h6 = constraintLayout.h(i7);
            if (h6 == null && (e6 = e(constraintLayout, (str = (String) this.f1597h.get(Integer.valueOf(i7))))) != 0) {
                this.f1590a[i6] = e6;
                this.f1597h.put(Integer.valueOf(e6), str);
                h6 = constraintLayout.h(e6);
            }
            if (h6 != null) {
                this.f1593d.c(constraintLayout.i(h6));
            }
        }
        this.f1593d.b(constraintLayout.f1502c);
    }

    public void m() {
        if (this.f1593d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f1551n0 = (p.e) this.f1593d;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1595f;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i6, int i7) {
        if (this.f1594e) {
            super.onMeasure(i6, i7);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) {
        this.f1595f = str;
        if (str == null) {
            return;
        }
        int i6 = 0;
        this.f1591b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i6);
            if (indexOf == -1) {
                a(str.substring(i6));
                return;
            } else {
                a(str.substring(i6, indexOf));
                i6 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1595f = null;
        this.f1591b = 0;
        for (int i6 : iArr) {
            b(i6);
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1590a = new int[32];
        this.f1594e = false;
        this.f1596g = null;
        this.f1597h = new HashMap();
        this.f1592c = context;
        g(attributeSet);
    }
}
