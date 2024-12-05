package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.accessibility.g0;
import androidx.core.view.b1;
import androidx.core.view.z;
import c3.k;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import m2.i;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: k, reason: collision with root package name */
    private static final int f4814k = i.f7696m;

    /* renamed from: a, reason: collision with root package name */
    private final List f4815a;

    /* renamed from: b, reason: collision with root package name */
    private final e f4816b;

    /* renamed from: c, reason: collision with root package name */
    private final LinkedHashSet f4817c;

    /* renamed from: d, reason: collision with root package name */
    private final Comparator f4818d;

    /* renamed from: e, reason: collision with root package name */
    private Integer[] f4819e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4820f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4821g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4822h;

    /* renamed from: i, reason: collision with root package name */
    private final int f4823i;

    /* renamed from: j, reason: collision with root package name */
    private Set f4824j;

    /* loaded from: classes.dex */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    /* loaded from: classes.dex */
    class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void g(View view, g0 g0Var) {
            super.g(view, g0Var);
            g0Var.a0(g0.d.a(0, 1, MaterialButtonToggleGroup.this.i(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: e, reason: collision with root package name */
        private static final c3.c f4827e = new c3.a(0.0f);

        /* renamed from: a, reason: collision with root package name */
        c3.c f4828a;

        /* renamed from: b, reason: collision with root package name */
        c3.c f4829b;

        /* renamed from: c, reason: collision with root package name */
        c3.c f4830c;

        /* renamed from: d, reason: collision with root package name */
        c3.c f4831d;

        c(c3.c cVar, c3.c cVar2, c3.c cVar3, c3.c cVar4) {
            this.f4828a = cVar;
            this.f4829b = cVar3;
            this.f4830c = cVar4;
            this.f4831d = cVar2;
        }

        public static c a(c cVar) {
            c3.c cVar2 = f4827e;
            return new c(cVar2, cVar.f4831d, cVar2, cVar.f4830c);
        }

        public static c b(c cVar, View view) {
            return n.e(view) ? c(cVar) : d(cVar);
        }

        public static c c(c cVar) {
            c3.c cVar2 = cVar.f4828a;
            c3.c cVar3 = cVar.f4831d;
            c3.c cVar4 = f4827e;
            return new c(cVar2, cVar3, cVar4, cVar4);
        }

        public static c d(c cVar) {
            c3.c cVar2 = f4827e;
            return new c(cVar2, cVar2, cVar.f4829b, cVar.f4830c);
        }

        public static c e(c cVar, View view) {
            return n.e(view) ? d(cVar) : c(cVar);
        }

        public static c f(c cVar) {
            c3.c cVar2 = cVar.f4828a;
            c3.c cVar3 = f4827e;
            return new c(cVar2, cVar3, cVar.f4829b, cVar3);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i6, boolean z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e implements MaterialButton.a {
        private e() {
        }

        @Override // com.google.android.material.button.MaterialButton.a
        public void a(MaterialButton materialButton, boolean z5) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ e(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m2.a.f7567u);
    }

    private void c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i6 = firstVisibleChildIndex + 1; i6 < getChildCount(); i6++) {
            MaterialButton h6 = h(i6);
            int min = Math.min(h6.getStrokeWidth(), h(i6 - 1).getStrokeWidth());
            LinearLayout.LayoutParams d6 = d(h6);
            if (getOrientation() == 0) {
                z.c(d6, 0);
                z.d(d6, -min);
                d6.topMargin = 0;
            } else {
                d6.bottomMargin = 0;
                d6.topMargin = -min;
                z.d(d6, 0);
            }
            h6.setLayoutParams(d6);
        }
        n(firstVisibleChildIndex);
    }

    private LinearLayout.LayoutParams d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private void e(int i6, boolean z5) {
        if (i6 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i6);
            return;
        }
        HashSet hashSet = new HashSet(this.f4824j);
        if (z5 && !hashSet.contains(Integer.valueOf(i6))) {
            if (this.f4821g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i6));
        } else {
            if (z5 || !hashSet.contains(Integer.valueOf(i6))) {
                return;
            }
            if (!this.f4822h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i6));
            }
        }
        q(hashSet);
    }

    private void g(int i6, boolean z5) {
        Iterator it = this.f4817c.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a(this, i6, z5);
        }
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            if (k(i6)) {
                return i6;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (k(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i6 = 0;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            if ((getChildAt(i7) instanceof MaterialButton) && k(i7)) {
                i6++;
            }
        }
        return i6;
    }

    private MaterialButton h(int i6) {
        return (MaterialButton) getChildAt(i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int i(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            if (getChildAt(i7) == view) {
                return i6;
            }
            if ((getChildAt(i7) instanceof MaterialButton) && k(i7)) {
                i6++;
            }
        }
        return -1;
    }

    private c j(int i6, int i7, int i8) {
        c cVar = (c) this.f4815a.get(i6);
        if (i7 == i8) {
            return cVar;
        }
        boolean z5 = getOrientation() == 0;
        if (i6 == i7) {
            return z5 ? c.e(cVar, this) : c.f(cVar);
        }
        if (i6 == i8) {
            return z5 ? c.b(cVar, this) : c.a(cVar);
        }
        return null;
    }

    private boolean k(int i6) {
        return getChildAt(i6).getVisibility() != 8;
    }

    private void n(int i6) {
        if (getChildCount() == 0 || i6 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) h(i6).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            z.c(layoutParams, 0);
            z.d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void o(int i6, boolean z5) {
        View findViewById = findViewById(i6);
        if (findViewById instanceof MaterialButton) {
            this.f4820f = true;
            ((MaterialButton) findViewById).setChecked(z5);
            this.f4820f = false;
        }
    }

    private static void p(k.b bVar, c cVar) {
        if (cVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.B(cVar.f4828a).t(cVar.f4831d).F(cVar.f4829b).x(cVar.f4830c);
        }
    }

    private void q(Set set) {
        Set set2 = this.f4824j;
        this.f4824j = new HashSet(set);
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            int id = h(i6).getId();
            o(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                g(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    private void r() {
        TreeMap treeMap = new TreeMap(this.f4818d);
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            treeMap.put(h(i6), Integer.valueOf(i6));
        }
        this.f4819e = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(b1.m());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f4816b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i6, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        e(materialButton.getId(), materialButton.isChecked());
        k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f4815a.add(new c(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        materialButton.setEnabled(isEnabled());
        b1.q0(materialButton, new b());
    }

    public void b(d dVar) {
        this.f4817c.add(dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        r();
        super.dispatchDraw(canvas);
    }

    public void f() {
        q(new HashSet());
    }

    public int getCheckedButtonId() {
        if (!this.f4821g || this.f4824j.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f4824j.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            int id = h(i6).getId();
            if (this.f4824j.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i6, int i7) {
        Integer[] numArr = this.f4819e;
        if (numArr != null && i7 < numArr.length) {
            return numArr[i7].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i7;
    }

    public boolean l() {
        return this.f4821g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(MaterialButton materialButton, boolean z5) {
        if (this.f4820f) {
            return;
        }
        e(materialButton.getId(), z5);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i6 = this.f4823i;
        if (i6 != -1) {
            q(Collections.singleton(Integer.valueOf(i6)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        g0.y0(accessibilityNodeInfo).Z(g0.c.a(1, getVisibleButtonCount(), false, l() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i6, int i7) {
        s();
        c();
        super.onMeasure(i6, i7);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f4815a.remove(indexOfChild);
        }
        s();
        c();
    }

    void s() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i6 = 0; i6 < childCount; i6++) {
            MaterialButton h6 = h(i6);
            if (h6.getVisibility() != 8) {
                k.b v5 = h6.getShapeAppearanceModel().v();
                p(v5, j(i6, firstVisibleChildIndex, lastVisibleChildIndex));
                h6.setShapeAppearanceModel(v5.m());
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z5) {
        super.setEnabled(z5);
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            h(i6).setEnabled(z5);
        }
    }

    public void setSelectionRequired(boolean z5) {
        this.f4822h = z5;
    }

    public void setSingleSelection(int i6) {
        setSingleSelection(getResources().getBoolean(i6));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.button.MaterialButtonToggleGroup.f4814k
            android.content.Context r7 = f3.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f4815a = r7
            com.google.android.material.button.MaterialButtonToggleGroup$e r7 = new com.google.android.material.button.MaterialButtonToggleGroup$e
            r0 = 0
            r7.<init>(r6, r0)
            r6.f4816b = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f4817c = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.f4818d = r7
            r7 = 0
            r6.f4820f = r7
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.f4824j = r0
            android.content.Context r0 = r6.getContext()
            int[] r2 = m2.j.f7834t2
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.l.i(r0, r1, r2, r3, r4, r5)
            int r9 = m2.j.f7858x2
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection(r9)
            int r9 = m2.j.f7846v2
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.f4823i = r9
            int r9 = m2.j.f7852w2
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f4822h = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            int r9 = m2.j.f7840u2
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setEnabled(r9)
            r8.recycle()
            androidx.core.view.b1.A0(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(boolean z5) {
        if (this.f4821g != z5) {
            this.f4821g = z5;
            f();
        }
    }
}
