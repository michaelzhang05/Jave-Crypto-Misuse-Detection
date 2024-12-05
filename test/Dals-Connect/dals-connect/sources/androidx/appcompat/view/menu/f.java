package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* compiled from: MenuAdapter.java */
/* loaded from: classes.dex */
public class f extends BaseAdapter {

    /* renamed from: f, reason: collision with root package name */
    g f263f;

    /* renamed from: g, reason: collision with root package name */
    private int f264g = -1;

    /* renamed from: h, reason: collision with root package name */
    private boolean f265h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f266i;

    /* renamed from: j, reason: collision with root package name */
    private final LayoutInflater f267j;

    /* renamed from: k, reason: collision with root package name */
    private final int f268k;

    public f(g gVar, LayoutInflater layoutInflater, boolean z, int i2) {
        this.f266i = z;
        this.f267j = layoutInflater;
        this.f263f = gVar;
        this.f268k = i2;
        a();
    }

    void a() {
        i x = this.f263f.x();
        if (x != null) {
            ArrayList<i> B = this.f263f.B();
            int size = B.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (B.get(i2) == x) {
                    this.f264g = i2;
                    return;
                }
            }
        }
        this.f264g = -1;
    }

    public g b() {
        return this.f263f;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public i getItem(int i2) {
        ArrayList<i> B = this.f266i ? this.f263f.B() : this.f263f.G();
        int i3 = this.f264g;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return B.get(i2);
    }

    public void d(boolean z) {
        this.f265h = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<i> B = this.f266i ? this.f263f.B() : this.f263f.G();
        if (this.f264g < 0) {
            return B.size();
        }
        return B.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f267j.inflate(this.f268k, viewGroup, false);
        }
        int groupId = getItem(i2).getGroupId();
        int i3 = i2 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f263f.H() && groupId != (i3 >= 0 ? getItem(i3).getGroupId() : groupId));
        n.a aVar = (n.a) view;
        if (this.f265h) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.e(getItem(i2), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
