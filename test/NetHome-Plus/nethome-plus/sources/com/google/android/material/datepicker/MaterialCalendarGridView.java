package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.u;
import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: f, reason: collision with root package name */
    private final Calendar f16540f;

    /* loaded from: classes2.dex */
    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.d0.c cVar) {
            super.g(view, cVar);
            cVar.a0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(int i2, Rect rect) {
        if (i2 == 33) {
            setSelection(getAdapter().h());
        } else if (i2 == 130) {
            setSelection(getAdapter().b());
        } else {
            super.onFocusChanged(true, i2, rect);
        }
    }

    private static int c(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private static boolean d(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public g getAdapter2() {
        return (g) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int a2;
        int c2;
        int a3;
        int c3;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        g adapter = getAdapter();
        DateSelector<?> dateSelector = adapter.f16591h;
        b bVar = adapter.f16592i;
        Long item = adapter.getItem(adapter.b());
        Long item2 = adapter.getItem(adapter.h());
        for (c.h.j.f<Long, Long> fVar : dateSelector.o()) {
            Long l = fVar.a;
            if (l != null) {
                if (fVar.f2746b == null) {
                    continue;
                } else {
                    long longValue = l.longValue();
                    long longValue2 = fVar.f2746b.longValue();
                    if (d(item, item2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        return;
                    }
                    if (longValue < item.longValue()) {
                        a2 = adapter.b();
                        c2 = adapter.f(a2) ? 0 : materialCalendarGridView.getChildAt(a2 - 1).getRight();
                    } else {
                        materialCalendarGridView.f16540f.setTimeInMillis(longValue);
                        a2 = adapter.a(materialCalendarGridView.f16540f.get(5));
                        c2 = c(materialCalendarGridView.getChildAt(a2));
                    }
                    if (longValue2 > item2.longValue()) {
                        a3 = adapter.h();
                        if (adapter.g(a3)) {
                            c3 = getWidth();
                        } else {
                            c3 = materialCalendarGridView.getChildAt(a3).getRight();
                        }
                    } else {
                        materialCalendarGridView.f16540f.setTimeInMillis(longValue2);
                        a3 = adapter.a(materialCalendarGridView.f16540f.get(5));
                        c3 = c(materialCalendarGridView.getChildAt(a3));
                    }
                    int itemId = (int) adapter.getItemId(a2);
                    int itemId2 = (int) adapter.getItemId(a3);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (getNumColumns() + numColumns) - 1;
                        View childAt = materialCalendarGridView.getChildAt(numColumns);
                        canvas.drawRect(numColumns > a2 ? 0 : c2, childAt.getTop() + bVar.a.c(), a3 > numColumns2 ? getWidth() : c3, childAt.getBottom() - bVar.a.b(), bVar.f16559h);
                        itemId++;
                        materialCalendarGridView = this;
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z, int i2, Rect rect) {
        if (z) {
            a(i2, rect);
        } else {
            super.onFocusChanged(false, i2, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (!super.onKeyDown(i2, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i2) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i2) {
        if (i2 < getAdapter().b()) {
            super.setSelection(getAdapter().b());
        } else {
            super.setSelection(i2);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f16540f = m.l();
        if (f.d(getContext())) {
            setNextFocusLeftId(e.e.b.b.f.a);
            setNextFocusRightId(e.e.b.b.f.f17455b);
        }
        u.i0(this, new a());
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof g) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), g.class.getCanonicalName()));
    }
}
