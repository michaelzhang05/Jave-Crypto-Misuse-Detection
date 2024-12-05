package androidx.core.widget;

import android.widget.ListView;

/* loaded from: classes.dex */
public class k extends a {

    /* renamed from: s, reason: collision with root package name */
    private final ListView f2476s;

    public k(ListView listView) {
        super(listView);
        this.f2476s = listView;
    }

    @Override // androidx.core.widget.a
    public boolean a(int i6) {
        return false;
    }

    @Override // androidx.core.widget.a
    public boolean b(int i6) {
        ListView listView = this.f2476s;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i7 = firstVisiblePosition + childCount;
        if (i6 > 0) {
            if (i7 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i6 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.a
    public void j(int i6, int i7) {
        l.a(this.f2476s, i7);
    }
}
