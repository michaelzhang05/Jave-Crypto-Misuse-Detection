package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.c3;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements g.b, n, AdapterView.OnItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f517c = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    private g f518a;

    /* renamed from: b, reason: collision with root package name */
    private int f519b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.g.b
    public boolean a(i iVar) {
        return this.f518a.L(iVar, 0);
    }

    @Override // androidx.appcompat.view.menu.n
    public void b(g gVar) {
        this.f518a = gVar;
    }

    public int getWindowAnimations() {
        return this.f519b;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i6, long j6) {
        a((i) getAdapter().getItem(i6));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        c3 v5 = c3.v(context, attributeSet, f517c, i6, 0);
        if (v5.s(0)) {
            setBackgroundDrawable(v5.g(0));
        }
        if (v5.s(1)) {
            setDivider(v5.g(1));
        }
        v5.w();
    }
}
