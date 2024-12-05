package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import cm.aptoide.pt.DeepLinkIntentReceiver;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: ConstraintHelper.java */
/* loaded from: classes.dex */
public abstract class b extends View {

    /* renamed from: f, reason: collision with root package name */
    protected int[] f706f;

    /* renamed from: g, reason: collision with root package name */
    protected int f707g;

    /* renamed from: h, reason: collision with root package name */
    protected Context f708h;

    /* renamed from: i, reason: collision with root package name */
    protected c.f.b.k.h f709i;

    /* renamed from: j, reason: collision with root package name */
    protected boolean f710j;

    /* renamed from: k, reason: collision with root package name */
    protected String f711k;
    protected String l;
    private View[] m;
    private HashMap<Integer, String> n;

    public b(Context context) {
        super(context);
        this.f706f = new int[32];
        this.f710j = false;
        this.m = null;
        this.n = new HashMap<>();
        this.f708h = context;
        h(null);
    }

    private void a(String str) {
        if (str == null || str.length() == 0 || this.f708h == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int g2 = g(trim);
        if (g2 != 0) {
            this.n.put(Integer.valueOf(g2), trim);
            b(g2);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    private void b(int i2) {
        if (i2 == getId()) {
            return;
        }
        int i3 = this.f707g + 1;
        int[] iArr = this.f706f;
        if (i3 > iArr.length) {
            this.f706f = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f706f;
        int i4 = this.f707g;
        iArr2[i4] = i2;
        this.f707g = i4 + 1;
    }

    private void c(String str) {
        if (str == null || str.length() == 0 || this.f708h == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).V)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    private int f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f708h.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int g(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i2 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object f2 = constraintLayout.f(0, str);
            if (f2 instanceof Integer) {
                i2 = ((Integer) f2).intValue();
            }
        }
        if (i2 == 0 && constraintLayout != null) {
            i2 = f(constraintLayout, str);
        }
        if (i2 == 0) {
            try {
                i2 = h.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i2 == 0 ? this.f708h.getResources().getIdentifier(str, DeepLinkIntentReceiver.DeepLinksKeys.ID, this.f708h.getPackageName()) : i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        e((ConstraintLayout) parent);
    }

    protected void e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i2 = 0; i2 < this.f707g; i2++) {
            View h2 = constraintLayout.h(this.f706f[i2]);
            if (h2 != null) {
                h2.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    h2.setTranslationZ(h2.getTranslationZ() + elevation);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f706f, this.f707g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == i.m1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f711k = string;
                    setIds(string);
                } else if (index == i.n1) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.l = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void i(c.f.b.k.e eVar, boolean z) {
    }

    public void j(ConstraintLayout constraintLayout) {
    }

    public void k(ConstraintLayout constraintLayout) {
    }

    public void l(ConstraintLayout constraintLayout) {
    }

    public void m(ConstraintLayout constraintLayout) {
        String str;
        int f2;
        if (isInEditMode()) {
            setIds(this.f711k);
        }
        c.f.b.k.h hVar = this.f709i;
        if (hVar == null) {
            return;
        }
        hVar.b();
        for (int i2 = 0; i2 < this.f707g; i2++) {
            int i3 = this.f706f[i2];
            View h2 = constraintLayout.h(i3);
            if (h2 == null && (f2 = f(constraintLayout, (str = this.n.get(Integer.valueOf(i3))))) != 0) {
                this.f706f[i2] = f2;
                this.n.put(Integer.valueOf(f2), str);
                h2 = constraintLayout.h(f2);
            }
            if (h2 != null) {
                this.f709i.a(constraintLayout.i(h2));
            }
        }
        this.f709i.c(constraintLayout.f673h);
    }

    public void n() {
        if (this.f709i == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).n0 = (c.f.b.k.e) this.f709i;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f711k;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.l;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.f710j) {
            super.onMeasure(i2, i3);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) {
        this.f711k = str;
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.f707g = 0;
        while (true) {
            int indexOf = str.indexOf(44, i2);
            if (indexOf == -1) {
                a(str.substring(i2));
                return;
            } else {
                a(str.substring(i2, indexOf));
                i2 = indexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.l = str;
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.f707g = 0;
        while (true) {
            int indexOf = str.indexOf(44, i2);
            if (indexOf == -1) {
                c(str.substring(i2));
                return;
            } else {
                c(str.substring(i2, indexOf));
                i2 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f711k = null;
        this.f707g = 0;
        for (int i2 : iArr) {
            b(i2);
        }
    }

    @Override // android.view.View
    public void setTag(int i2, Object obj) {
        super.setTag(i2, obj);
        if (obj == null && this.f711k == null) {
            b(i2);
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f706f = new int[32];
        this.f710j = false;
        this.m = null;
        this.n = new HashMap<>();
        this.f708h = context;
        h(attributeSet);
    }
}
