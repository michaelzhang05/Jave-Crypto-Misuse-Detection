package androidx.preference;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.u;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.j;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PreferenceGroupAdapter.java */
/* loaded from: classes.dex */
public class h extends RecyclerView.g<l> implements Preference.b, PreferenceGroup.c {

    /* renamed from: f, reason: collision with root package name */
    private PreferenceGroup f1323f;

    /* renamed from: g, reason: collision with root package name */
    private List<Preference> f1324g;

    /* renamed from: h, reason: collision with root package name */
    private List<Preference> f1325h;

    /* renamed from: i, reason: collision with root package name */
    private List<d> f1326i;

    /* renamed from: k, reason: collision with root package name */
    private Runnable f1328k = new a();

    /* renamed from: j, reason: collision with root package name */
    private Handler f1327j = new Handler();

    /* compiled from: PreferenceGroupAdapter.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PreferenceGroupAdapter.java */
    /* loaded from: classes.dex */
    public class b extends f.b {
        final /* synthetic */ List a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f1330b;

        b(List list, List list2, j.d dVar) {
            this.a = list;
            this.f1330b = list2;
        }

        @Override // androidx.recyclerview.widget.f.b
        public boolean areContentsTheSame(int i2, int i3) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.f.b
        public boolean areItemsTheSame(int i2, int i3) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.f.b
        public int getNewListSize() {
            return this.f1330b.size();
        }

        @Override // androidx.recyclerview.widget.f.b
        public int getOldListSize() {
            return this.a.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PreferenceGroupAdapter.java */
    /* loaded from: classes.dex */
    public class c implements Preference.d {
        final /* synthetic */ PreferenceGroup a;

        c(PreferenceGroup preferenceGroup) {
            this.a = preferenceGroup;
        }

        @Override // androidx.preference.Preference.d
        public boolean onPreferenceClick(Preference preference) {
            this.a.j1(Integer.MAX_VALUE);
            h.this.a(preference);
            PreferenceGroup.b c1 = this.a.c1();
            if (c1 == null) {
                return true;
            }
            c1.a();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PreferenceGroupAdapter.java */
    /* loaded from: classes.dex */
    public static class d {
        int a;

        /* renamed from: b, reason: collision with root package name */
        int f1333b;

        /* renamed from: c, reason: collision with root package name */
        String f1334c;

        d(Preference preference) {
            this.f1334c = preference.getClass().getName();
            this.a = preference.J();
            this.f1333b = preference.W();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.f1333b == dVar.f1333b && TextUtils.equals(this.f1334c, dVar.f1334c);
        }

        public int hashCode() {
            return ((((527 + this.a) * 31) + this.f1333b) * 31) + this.f1334c.hashCode();
        }
    }

    public h(PreferenceGroup preferenceGroup) {
        this.f1323f = preferenceGroup;
        this.f1323f.L0(this);
        this.f1324g = new ArrayList();
        this.f1325h = new ArrayList();
        this.f1326i = new ArrayList();
        PreferenceGroup preferenceGroup2 = this.f1323f;
        if (preferenceGroup2 instanceof PreferenceScreen) {
            setHasStableIds(((PreferenceScreen) preferenceGroup2).m1());
        } else {
            setHasStableIds(true);
        }
        n();
    }

    private androidx.preference.b g(PreferenceGroup preferenceGroup, List<Preference> list) {
        androidx.preference.b bVar = new androidx.preference.b(preferenceGroup.C(), list, preferenceGroup.G());
        bVar.M0(new c(preferenceGroup));
        return bVar;
    }

    private List<Preference> h(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int e1 = preferenceGroup.e1();
        int i2 = 0;
        for (int i3 = 0; i3 < e1; i3++) {
            Preference d1 = preferenceGroup.d1(i3);
            if (d1.c0()) {
                if (k(preferenceGroup) && i2 >= preferenceGroup.b1()) {
                    arrayList2.add(d1);
                } else {
                    arrayList.add(d1);
                }
                if (d1 instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) d1;
                    if (!preferenceGroup2.f1()) {
                        continue;
                    } else {
                        if (k(preferenceGroup) && k(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference : h(preferenceGroup2)) {
                            if (k(preferenceGroup) && i2 >= preferenceGroup.b1()) {
                                arrayList2.add(preference);
                            } else {
                                arrayList.add(preference);
                            }
                            i2++;
                        }
                    }
                } else {
                    i2++;
                }
            }
        }
        if (k(preferenceGroup) && i2 > preferenceGroup.b1()) {
            arrayList.add(g(preferenceGroup, arrayList2));
        }
        return arrayList;
    }

    private void i(List<Preference> list, PreferenceGroup preferenceGroup) {
        preferenceGroup.l1();
        int e1 = preferenceGroup.e1();
        for (int i2 = 0; i2 < e1; i2++) {
            Preference d1 = preferenceGroup.d1(i2);
            list.add(d1);
            d dVar = new d(d1);
            if (!this.f1326i.contains(dVar)) {
                this.f1326i.add(dVar);
            }
            if (d1 instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) d1;
                if (preferenceGroup2.f1()) {
                    i(list, preferenceGroup2);
                }
            }
            d1.L0(this);
        }
    }

    private boolean k(PreferenceGroup preferenceGroup) {
        return preferenceGroup.b1() != Integer.MAX_VALUE;
    }

    @Override // androidx.preference.Preference.b
    public void a(Preference preference) {
        this.f1327j.removeCallbacks(this.f1328k);
        this.f1327j.post(this.f1328k);
    }

    @Override // androidx.preference.Preference.b
    public void b(Preference preference) {
        a(preference);
    }

    @Override // androidx.preference.PreferenceGroup.c
    public int c(Preference preference) {
        int size = this.f1325h.size();
        for (int i2 = 0; i2 < size; i2++) {
            Preference preference2 = this.f1325h.get(i2);
            if (preference2 != null && preference2.equals(preference)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.preference.Preference.b
    public void e(Preference preference) {
        int indexOf = this.f1325h.indexOf(preference);
        if (indexOf != -1) {
            notifyItemChanged(indexOf, preference);
        }
    }

    @Override // androidx.preference.PreferenceGroup.c
    public int f(String str) {
        int size = this.f1325h.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (TextUtils.equals(str, this.f1325h.get(i2).I())) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemCount() {
        return this.f1325h.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long getItemId(int i2) {
        if (hasStableIds()) {
            return j(i2).G();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int i2) {
        d dVar = new d(j(i2));
        int indexOf = this.f1326i.indexOf(dVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.f1326i.size();
        this.f1326i.add(dVar);
        return size;
    }

    public Preference j(int i2) {
        if (i2 < 0 || i2 >= getItemCount()) {
            return null;
        }
        return this.f1325h.get(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(l lVar, int i2) {
        j(i2).j0(lVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public l onCreateViewHolder(ViewGroup viewGroup, int i2) {
        d dVar = this.f1326i.get(i2);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, t.p);
        Drawable drawable = obtainStyledAttributes.getDrawable(t.q);
        if (drawable == null) {
            drawable = c.a.k.a.a.d(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(dVar.a, viewGroup, false);
        if (inflate.getBackground() == null) {
            u.m0(inflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i3 = dVar.f1333b;
            if (i3 != 0) {
                from.inflate(i3, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new l(inflate);
    }

    void n() {
        Iterator<Preference> it = this.f1324g.iterator();
        while (it.hasNext()) {
            it.next().L0(null);
        }
        ArrayList arrayList = new ArrayList(this.f1324g.size());
        this.f1324g = arrayList;
        i(arrayList, this.f1323f);
        List<Preference> list = this.f1325h;
        List<Preference> h2 = h(this.f1323f);
        this.f1325h = h2;
        j R = this.f1323f.R();
        if (R != null && R.g() != null) {
            androidx.recyclerview.widget.f.a(new b(list, h2, R.g())).e(this);
        } else {
            notifyDataSetChanged();
        }
        Iterator<Preference> it2 = this.f1324g.iterator();
        while (it2.hasNext()) {
            it2.next().i();
        }
    }
}
