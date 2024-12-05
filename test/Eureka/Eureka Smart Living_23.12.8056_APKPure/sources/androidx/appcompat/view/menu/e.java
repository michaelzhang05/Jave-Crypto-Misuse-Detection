package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class e implements m, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    Context f605a;

    /* renamed from: b, reason: collision with root package name */
    LayoutInflater f606b;

    /* renamed from: c, reason: collision with root package name */
    g f607c;

    /* renamed from: d, reason: collision with root package name */
    ExpandedMenuView f608d;

    /* renamed from: e, reason: collision with root package name */
    int f609e;

    /* renamed from: f, reason: collision with root package name */
    int f610f;

    /* renamed from: g, reason: collision with root package name */
    int f611g;

    /* renamed from: h, reason: collision with root package name */
    private m.a f612h;

    /* renamed from: i, reason: collision with root package name */
    a f613i;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: a, reason: collision with root package name */
        private int f614a = -1;

        public a() {
            a();
        }

        void a() {
            i v5 = e.this.f607c.v();
            if (v5 != null) {
                ArrayList z5 = e.this.f607c.z();
                int size = z5.size();
                for (int i6 = 0; i6 < size; i6++) {
                    if (((i) z5.get(i6)) == v5) {
                        this.f614a = i6;
                        return;
                    }
                }
            }
            this.f614a = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i getItem(int i6) {
            ArrayList z5 = e.this.f607c.z();
            int i7 = i6 + e.this.f609e;
            int i8 = this.f614a;
            if (i8 >= 0 && i7 >= i8) {
                i7++;
            }
            return (i) z5.get(i7);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = e.this.f607c.z().size() - e.this.f609e;
            return this.f614a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i6) {
            return i6;
        }

        @Override // android.widget.Adapter
        public View getView(int i6, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.f606b.inflate(eVar.f611g, viewGroup, false);
            }
            ((n.a) view).e(getItem(i6), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(int i6, int i7) {
        this.f611g = i6;
        this.f610f = i7;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z5) {
        m.a aVar = this.f612h;
        if (aVar != null) {
            aVar.a(gVar, z5);
        }
    }

    public ListAdapter b() {
        if (this.f613i == null) {
            this.f613i = new a();
        }
        return this.f613i;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean c() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @Override // androidx.appcompat.view.menu.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(android.content.Context r3, androidx.appcompat.view.menu.g r4) {
        /*
            r2 = this;
            int r0 = r2.f610f
            if (r0 == 0) goto L14
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f610f
            r0.<init>(r3, r1)
            r2.f605a = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L11:
            r2.f606b = r3
            goto L23
        L14:
            android.content.Context r0 = r2.f605a
            if (r0 == 0) goto L23
            r2.f605a = r3
            android.view.LayoutInflater r0 = r2.f606b
            if (r0 != 0) goto L23
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L11
        L23:
            r2.f607c = r4
            androidx.appcompat.view.menu.e$a r3 = r2.f613i
            if (r3 == 0) goto L2c
            r3.notifyDataSetChanged()
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.d(android.content.Context, androidx.appcompat.view.menu.g):void");
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean e(g gVar, i iVar) {
        return false;
    }

    public n f(ViewGroup viewGroup) {
        if (this.f608d == null) {
            this.f608d = (ExpandedMenuView) this.f606b.inflate(d.g.f6220g, viewGroup, false);
            if (this.f613i == null) {
                this.f613i = new a();
            }
            this.f608d.setAdapter((ListAdapter) this.f613i);
            this.f608d.setOnItemClickListener(this);
        }
        return this.f608d;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean g(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(m.a aVar) {
        this.f612h = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean i(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new h(rVar).d(null);
        m.a aVar = this.f612h;
        if (aVar == null) {
            return true;
        }
        aVar.b(rVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public void j(boolean z5) {
        a aVar = this.f613i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i6, long j6) {
        this.f607c.M(this.f613i.getItem(i6), this, 0);
    }

    public e(Context context, int i6) {
        this(i6, 0);
        this.f605a = context;
        this.f606b = LayoutInflater.from(context);
    }
}
