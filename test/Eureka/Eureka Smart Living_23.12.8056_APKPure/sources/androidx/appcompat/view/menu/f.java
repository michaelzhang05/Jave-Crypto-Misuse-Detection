package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class f extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    g f616a;

    /* renamed from: b, reason: collision with root package name */
    private int f617b = -1;

    /* renamed from: c, reason: collision with root package name */
    private boolean f618c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f619d;

    /* renamed from: e, reason: collision with root package name */
    private final LayoutInflater f620e;

    /* renamed from: f, reason: collision with root package name */
    private final int f621f;

    public f(g gVar, LayoutInflater layoutInflater, boolean z5, int i6) {
        this.f619d = z5;
        this.f620e = layoutInflater;
        this.f616a = gVar;
        this.f621f = i6;
        a();
    }

    void a() {
        i v5 = this.f616a.v();
        if (v5 != null) {
            ArrayList z5 = this.f616a.z();
            int size = z5.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (((i) z5.get(i6)) == v5) {
                    this.f617b = i6;
                    return;
                }
            }
        }
        this.f617b = -1;
    }

    public g b() {
        return this.f616a;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public i getItem(int i6) {
        ArrayList z5 = this.f619d ? this.f616a.z() : this.f616a.E();
        int i7 = this.f617b;
        if (i7 >= 0 && i6 >= i7) {
            i6++;
        }
        return (i) z5.get(i6);
    }

    public void d(boolean z5) {
        this.f618c = z5;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList z5 = this.f619d ? this.f616a.z() : this.f616a.E();
        int i6 = this.f617b;
        int size = z5.size();
        return i6 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i6) {
        return i6;
    }

    @Override // android.widget.Adapter
    public View getView(int i6, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f620e.inflate(this.f621f, viewGroup, false);
        }
        int groupId = getItem(i6).getGroupId();
        int i7 = i6 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f616a.F() && groupId != (i7 >= 0 ? getItem(i7).getGroupId() : groupId));
        n.a aVar = (n.a) view;
        if (this.f618c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.e(getItem(i6), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
