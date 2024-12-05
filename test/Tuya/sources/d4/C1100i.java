package D4;

import M5.AbstractC1246t;
import W4.InterfaceC1478a;
import X4.C1498h;
import X4.C1501k;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import o5.B0;
import o5.C3531B;
import o5.C3533D;
import o5.C3558m;
import o5.C3569s;
import o5.C3573u;
import o5.C3583z;
import o5.X0;

/* renamed from: D4.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1100i extends RecyclerView.Adapter {

    /* renamed from: p, reason: collision with root package name */
    public static final a f1694p = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final W4.s f1695a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1478a f1696b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f1697c;

    /* renamed from: d, reason: collision with root package name */
    private final String f1698d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f1699e;

    /* renamed from: f, reason: collision with root package name */
    private int f1700f;

    /* renamed from: g, reason: collision with root package name */
    private int f1701g;

    /* renamed from: h, reason: collision with root package name */
    private int f1702h;

    /* renamed from: i, reason: collision with root package name */
    private int f1703i;

    /* renamed from: j, reason: collision with root package name */
    private int f1704j;

    /* renamed from: k, reason: collision with root package name */
    private int f1705k;

    /* renamed from: l, reason: collision with root package name */
    private int f1706l;

    /* renamed from: m, reason: collision with root package name */
    private int f1707m;

    /* renamed from: n, reason: collision with root package name */
    private int f1708n;

    /* renamed from: o, reason: collision with root package name */
    private int f1709o;

    /* renamed from: D4.i$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: D4.i$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList f1710a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f1711b;

        public final ArrayList a() {
            ArrayList arrayList = this.f1711b;
            if (arrayList != null) {
                return arrayList;
            }
            AbstractC3159y.y("categories");
            return null;
        }

        public final ArrayList b() {
            ArrayList arrayList = this.f1710a;
            if (arrayList != null) {
                return arrayList;
            }
            AbstractC3159y.y("homeFeatures");
            return null;
        }

        public final void c(ArrayList arrayList) {
            AbstractC3159y.i(arrayList, "<set-?>");
            this.f1711b = arrayList;
        }

        public final void d(ArrayList arrayList) {
            AbstractC3159y.i(arrayList, "<set-?>");
            this.f1710a = arrayList;
        }
    }

    /* renamed from: D4.i$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public Object f1712a;

        /* renamed from: b, reason: collision with root package name */
        private int f1713b = -1;

        public final Object a() {
            Object obj = this.f1712a;
            if (obj != null) {
                return obj;
            }
            AbstractC3159y.y("item");
            return L5.I.f6487a;
        }

        public final int b() {
            return this.f1713b;
        }

        public final void c(Object obj) {
            AbstractC3159y.i(obj, "<set-?>");
            this.f1712a = obj;
        }

        public final void d(int i8) {
            this.f1713b = i8;
        }
    }

    public C1100i(W4.s listener, InterfaceC1478a actionsClickListener, Context context, String fragmentName) {
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(actionsClickListener, "actionsClickListener");
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(fragmentName, "fragmentName");
        this.f1695a = listener;
        this.f1696b = actionsClickListener;
        this.f1697c = context;
        this.f1698d = fragmentName;
        this.f1699e = new ArrayList();
        this.f1700f = -1;
        this.f1701g = -1;
        this.f1702h = -1;
        this.f1703i = -1;
        this.f1704j = -1;
        this.f1705k = -1;
        this.f1706l = -1;
        this.f1707m = -1;
        this.f1708n = -1;
        this.f1709o = -1;
    }

    private final void c(ArrayList arrayList, int i8) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            X4.N n8 = (X4.N) it.next();
            if (n8.b().c() == i8) {
                h(n8);
                arrayList.remove(n8);
                return;
            }
        }
    }

    private final void d(C1498h c1498h) {
        c cVar = new c();
        cVar.c(c1498h);
        cVar.d(2);
        this.f1699e.add(cVar);
    }

    private final void e(ArrayList arrayList) {
        c cVar = new c();
        cVar.c(arrayList);
        cVar.d(7);
        this.f1699e.add(cVar);
        notifyItemInserted(this.f1699e.size() - 1);
    }

    private final void f(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            c(arrayList, 558);
        }
        if (!arrayList.isEmpty()) {
            c(arrayList, 566);
        }
        if (!arrayList.isEmpty()) {
            c(arrayList, 562);
        }
        if (!arrayList.isEmpty()) {
            c(arrayList, 564);
        }
        if (!arrayList.isEmpty()) {
            c(arrayList, 559);
        }
        if (!arrayList.isEmpty()) {
            c(arrayList, 645);
        }
        if (!arrayList.isEmpty()) {
            c(arrayList, 560);
        }
        if (!arrayList.isEmpty()) {
            c(arrayList, 561);
        }
        if (!arrayList.isEmpty()) {
            c(arrayList, 565);
        }
        if (!arrayList.isEmpty()) {
            c(arrayList, 593);
        }
        if (!arrayList.isEmpty()) {
            c(arrayList, 568);
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                h((X4.N) it.next());
            }
        }
    }

    private final void g(ArrayList arrayList, ArrayList arrayList2) {
        b bVar = new b();
        bVar.d(arrayList);
        bVar.c(arrayList2);
        c cVar = new c();
        cVar.c(bVar);
        cVar.d(0);
        this.f1699e.add(cVar);
    }

    private final void h(X4.N n8) {
        if (n8 != null) {
            c cVar = new c();
            cVar.c(n8);
            cVar.d(n8.c());
            this.f1699e.add(cVar);
            notifyItemInserted(this.f1699e.size() - 1);
        }
    }

    private final void n(ArrayList arrayList, ArrayList arrayList2) {
        b bVar = new b();
        bVar.d(arrayList);
        bVar.c(arrayList2);
        c cVar = new c();
        cVar.c(bVar);
        cVar.d(0);
        this.f1699e.add(cVar);
    }

    private final void v(X4.N n8, int i8) {
        if (i8 >= 0 && i8 < this.f1699e.size()) {
            c cVar = new c();
            cVar.c(n8);
            cVar.d(n8.c());
            this.f1699e.set(i8, cVar);
            notifyItemChanged(i8);
        }
    }

    public final void a(X4.N floatingCategory) {
        AbstractC3159y.i(floatingCategory, "floatingCategory");
        h(floatingCategory);
    }

    public final void b(C1498h appReplacement) {
        AbstractC3159y.i(appReplacement, "appReplacement");
        Iterator it = this.f1699e.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            int i9 = i8 + 1;
            c cVar = (c) it.next();
            if (cVar != null && cVar.b() == 0) {
                Object a8 = cVar.a();
                AbstractC3159y.g(a8, "null cannot be cast to non-null type com.uptodown.adapters.HomeAdapter.HomeHeader");
                ((b) a8).b().add(appReplacement);
                notifyItemChanged(i8);
                return;
            }
            i8 = i9;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f1699e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        c cVar = (c) this.f1699e.get(i8);
        if (cVar != null) {
            return cVar.b();
        }
        return -1;
    }

    public final void i(ArrayList floatingCategories) {
        AbstractC3159y.i(floatingCategories, "floatingCategories");
        if (!floatingCategories.isEmpty()) {
            e(floatingCategories);
        }
    }

    public final void j(C1498h mainApp) {
        AbstractC3159y.i(mainApp, "mainApp");
        c cVar = new c();
        cVar.c(mainApp);
        cVar.d(3);
        this.f1699e.set(this.f1703i, cVar);
        notifyItemChanged(this.f1703i);
    }

    public final void k(X4.N miniTop) {
        AbstractC3159y.i(miniTop, "miniTop");
        h(miniTop);
    }

    public final void l(ArrayList miniTops) {
        AbstractC3159y.i(miniTops, "miniTops");
        Iterator it = miniTops.iterator();
        while (it.hasNext()) {
            X4.N miniTop = (X4.N) it.next();
            int c8 = miniTop.b().c();
            if (c8 != 521) {
                if (c8 != 523) {
                    if (c8 != 524) {
                        h(miniTop);
                    } else {
                        AbstractC3159y.h(miniTop, "miniTop");
                        v(miniTop, this.f1706l);
                    }
                } else {
                    AbstractC3159y.h(miniTop, "miniTop");
                    v(miniTop, this.f1705k);
                }
            } else {
                AbstractC3159y.h(miniTop, "miniTop");
                v(miniTop, this.f1704j);
            }
        }
    }

    public final void m(ArrayList miniTops, C1501k parentCategory) {
        AbstractC3159y.i(miniTops, "miniTops");
        AbstractC3159y.i(parentCategory, "parentCategory");
        if (parentCategory.c() == 523) {
            f(miniTops);
            return;
        }
        Iterator it = miniTops.iterator();
        while (it.hasNext()) {
            h((X4.N) it.next());
        }
    }

    public final void o(ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            Object obj = arrayList.get(0);
            AbstractC3159y.h(obj, "tops[0]");
            v((X4.N) obj, this.f1707m);
            if (arrayList.size() > 1) {
                Object obj2 = arrayList.get(1);
                AbstractC3159y.h(obj2, "tops[1]");
                v((X4.N) obj2, this.f1708n);
            }
            if (arrayList.size() > 2) {
                Object obj3 = arrayList.get(2);
                AbstractC3159y.h(obj3, "tops[2]");
                v((X4.N) obj3, this.f1709o);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        Object obj;
        Object obj2;
        AbstractC3159y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof C3569s) {
            ((C3569s) viewHolder).a();
            return;
        }
        Object obj3 = null;
        if (viewHolder instanceof C3583z) {
            C3583z c3583z = (C3583z) viewHolder;
            c cVar = (c) this.f1699e.get(i8);
            if (cVar != null) {
                obj3 = cVar.a();
            }
            AbstractC3159y.g(obj3, "null cannot be cast to non-null type com.uptodown.adapters.HomeAdapter.HomeHeader");
            c3583z.d((b) obj3);
            return;
        }
        if (viewHolder instanceof C3533D) {
            c cVar2 = (c) this.f1699e.get(i8);
            if (cVar2 != null) {
                obj2 = cVar2.a();
            } else {
                obj2 = null;
            }
            if (obj2 instanceof X4.N) {
                C3533D c3533d = (C3533D) viewHolder;
                c cVar3 = (c) this.f1699e.get(i8);
                if (cVar3 != null) {
                    obj3 = cVar3.a();
                }
                AbstractC3159y.g(obj3, "null cannot be cast to non-null type com.uptodown.models.TopByCategory");
                c3533d.b((X4.N) obj3);
                return;
            }
            return;
        }
        if (viewHolder instanceof C3531B) {
            c cVar4 = (c) this.f1699e.get(i8);
            if (cVar4 != null) {
                obj = cVar4.a();
            } else {
                obj = null;
            }
            if (obj instanceof X4.N) {
                C3531B c3531b = (C3531B) viewHolder;
                c cVar5 = (c) this.f1699e.get(i8);
                if (cVar5 != null) {
                    obj3 = cVar5.a();
                }
                AbstractC3159y.g(obj3, "null cannot be cast to non-null type com.uptodown.models.TopByCategory");
                c3531b.b((X4.N) obj3);
                return;
            }
            return;
        }
        if (viewHolder instanceof C3558m) {
            C3558m c3558m = (C3558m) viewHolder;
            c cVar6 = (c) this.f1699e.get(i8);
            if (cVar6 != null) {
                obj3 = cVar6.a();
            }
            AbstractC3159y.g(obj3, "null cannot be cast to non-null type com.uptodown.models.AppInfo");
            c3558m.m((C1498h) obj3);
            return;
        }
        if (viewHolder instanceof o5.M) {
            o5.M m8 = (o5.M) viewHolder;
            c cVar7 = (c) this.f1699e.get(i8);
            if (cVar7 != null) {
                obj3 = cVar7.a();
            }
            AbstractC3159y.g(obj3, "null cannot be cast to non-null type com.uptodown.models.AppInfo");
            m8.p((C1498h) obj3);
            return;
        }
        if (viewHolder instanceof X0) {
            X0 x02 = (X0) viewHolder;
            c cVar8 = (c) this.f1699e.get(i8);
            if (cVar8 != null) {
                obj3 = cVar8.a();
            }
            AbstractC3159y.g(obj3, "null cannot be cast to non-null type com.uptodown.models.TopByCategory");
            x02.c((X4.N) obj3);
            return;
        }
        if (viewHolder instanceof B0) {
            B0 b02 = (B0) viewHolder;
            c cVar9 = (c) this.f1699e.get(i8);
            if (cVar9 != null) {
                obj3 = cVar9.a();
            }
            AbstractC3159y.g(obj3, "null cannot be cast to non-null type com.uptodown.models.TopByCategory");
            b02.b((X4.N) obj3);
            return;
        }
        if (viewHolder instanceof o5.F) {
            o5.F f8 = (o5.F) viewHolder;
            c cVar10 = (c) this.f1699e.get(i8);
            if (cVar10 != null) {
                obj3 = cVar10.a();
            }
            AbstractC3159y.g(obj3, "null cannot be cast to non-null type com.uptodown.models.TopByCategory");
            f8.b((X4.N) obj3);
            return;
        }
        if (viewHolder instanceof C3573u) {
            C3573u c3573u = (C3573u) viewHolder;
            c cVar11 = (c) this.f1699e.get(i8);
            if (cVar11 != null) {
                obj3 = cVar11.a();
            }
            AbstractC3159y.g(obj3, "null cannot be cast to non-null type java.util.ArrayList<com.uptodown.models.Category>{ kotlin.collections.TypeAliasesKt.ArrayList<com.uptodown.models.Category> }");
            c3573u.b((ArrayList) obj3);
            return;
        }
        throw new IllegalArgumentException("ViewHolder unknown!!");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3159y.i(viewGroup, "viewGroup");
        switch (i8) {
            case -1:
                View inflate = LayoutInflater.from(this.f1697c).inflate(R.layout.empty_view, viewGroup, false);
                AbstractC3159y.h(inflate, "from(context).inflate(R.…y_view, viewGroup, false)");
                return new C3569s(inflate);
            case 0:
                View inflate2 = LayoutInflater.from(this.f1697c).inflate(R.layout.home_fragment_header, viewGroup, false);
                AbstractC3159y.h(inflate2, "from(context).inflate(R.…header, viewGroup, false)");
                return new C3583z(inflate2, this.f1695a, this.f1696b, this.f1697c);
            case 1:
                View inflate3 = LayoutInflater.from(this.f1697c).inflate(R.layout.home_recycler_view_top, viewGroup, false);
                AbstractC3159y.h(inflate3, "from(context).inflate(R.…ew_top, viewGroup, false)");
                return new C3533D(inflate3, this.f1695a, this.f1696b, this.f1697c);
            case 2:
                View inflate4 = LayoutInflater.from(this.f1697c).inflate(R.layout.card_featured, viewGroup, false);
                AbstractC3159y.h(inflate4, "from(context).inflate(R.…atured, viewGroup, false)");
                return new C3558m(inflate4, this.f1695a, this.f1696b, this.f1697c);
            case 3:
                View inflate5 = LayoutInflater.from(this.f1697c).inflate(R.layout.home_gallery_featured, viewGroup, false);
                AbstractC3159y.h(inflate5, "from(context).inflate(R.…atured, viewGroup, false)");
                return new o5.M(inflate5, this.f1695a, this.f1696b, this.f1697c);
            case 4:
                View inflate6 = LayoutInflater.from(this.f1697c).inflate(R.layout.home_recycler_view_top, viewGroup, false);
                AbstractC3159y.h(inflate6, "from(context).inflate(R.…ew_top, viewGroup, false)");
                return new X0(inflate6, this.f1695a, this.f1696b, this.f1697c, this.f1698d);
            case 5:
                View inflate7 = LayoutInflater.from(this.f1697c).inflate(R.layout.home_recycler_view_top, viewGroup, false);
                AbstractC3159y.h(inflate7, "from(context).inflate(R.…ew_top, viewGroup, false)");
                return new B0(inflate7, this.f1695a, this.f1696b, this.f1697c);
            case 6:
                View inflate8 = LayoutInflater.from(this.f1697c).inflate(R.layout.home_recycler_view_top, viewGroup, false);
                AbstractC3159y.h(inflate8, "from(context).inflate(R.…ew_top, viewGroup, false)");
                return new o5.F(inflate8, this.f1695a, this.f1696b, this.f1697c);
            case 7:
                View inflate9 = LayoutInflater.from(this.f1697c).inflate(R.layout.floating_categories, viewGroup, false);
                AbstractC3159y.h(inflate9, "from(context).inflate(R.…gories, viewGroup, false)");
                return new C3573u(inflate9, this.f1695a, this.f1697c);
            case 8:
                View inflate10 = LayoutInflater.from(this.f1697c).inflate(R.layout.home_recycler_view_top, viewGroup, false);
                AbstractC3159y.h(inflate10, "from(context).inflate(R.…ew_top, viewGroup, false)");
                return new C3531B(inflate10, this.f1695a, this.f1696b, this.f1697c);
            default:
                throw new IllegalArgumentException("viewType unknown");
        }
    }

    public final void p(ArrayList appsFeatured, ArrayList leafCategories, X4.N n8, C1498h c1498h, X4.N n9) {
        ArrayList a8;
        ArrayList a9;
        ArrayList a10;
        AbstractC3159y.i(appsFeatured, "appsFeatured");
        AbstractC3159y.i(leafCategories, "leafCategories");
        this.f1699e = new ArrayList();
        if (!appsFeatured.isEmpty()) {
            n(appsFeatured, leafCategories);
        }
        if (n8 != null && (a10 = n8.a()) != null && (!a10.isEmpty())) {
            h(n8);
        }
        if ((!leafCategories.isEmpty()) && ((C1501k) leafCategories.get(0)).i() == 523) {
            if (n9 != null && (a9 = n9.a()) != null && (!a9.isEmpty())) {
                h(n9);
            }
            if (c1498h != null) {
                d(c1498h);
                return;
            }
            return;
        }
        if (c1498h != null) {
            d(c1498h);
        }
        if (n9 != null && (a8 = n9.a()) != null && (!a8.isEmpty())) {
            h(n9);
        }
    }

    public final void q(ArrayList homeFeatures, X4.N n8, X4.N n9) {
        AbstractC3159y.i(homeFeatures, "homeFeatures");
        this.f1699e = new ArrayList();
        g(homeFeatures, new ArrayList());
        h(n8);
        this.f1699e.add(null);
        this.f1700f = this.f1699e.size() - 1;
        h(n9);
        this.f1699e.add(null);
        this.f1701g = this.f1699e.size() - 1;
        this.f1699e.add(null);
        this.f1708n = this.f1699e.size() - 1;
        this.f1699e.add(null);
        this.f1702h = this.f1699e.size() - 1;
        this.f1699e.add(null);
        this.f1709o = this.f1699e.size() - 1;
        this.f1699e.add(null);
        this.f1703i = this.f1699e.size() - 1;
        this.f1699e.add(null);
        this.f1704j = this.f1699e.size() - 1;
        this.f1699e.add(null);
        this.f1705k = this.f1699e.size() - 1;
        this.f1699e.add(null);
        this.f1706l = this.f1699e.size() - 1;
    }

    public final ArrayList r() {
        return this.f1699e;
    }

    public final void s(C1498h featuredApp) {
        AbstractC3159y.i(featuredApp, "featuredApp");
        if (this.f1701g > 0) {
            c cVar = new c();
            cVar.c(featuredApp);
            cVar.d(2);
            this.f1699e.set(this.f1701g, cVar);
            notifyItemChanged(this.f1701g);
        }
    }

    public final void t(X4.N top) {
        AbstractC3159y.i(top, "top");
        v(top, this.f1700f);
    }

    public final void u(X4.N top) {
        AbstractC3159y.i(top, "top");
        v(top, this.f1702h);
    }

    public final void w(String packageName, RecyclerView recyclerView) {
        AbstractC3159y.i(packageName, "packageName");
        AbstractC3159y.i(recyclerView, "recyclerView");
        int itemCount = getItemCount();
        for (int i8 = 0; i8 < itemCount; i8++) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i8);
            Object obj = null;
            if (findViewHolderForAdapterPosition instanceof C3533D) {
                C3533D c3533d = (C3533D) findViewHolderForAdapterPosition;
                Iterator it = c3533d.d().c().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (AbstractC3159y.d(((C1498h) next).y0(), packageName)) {
                        obj = next;
                        break;
                    }
                }
                c3533d.d().notifyItemChanged(AbstractC1246t.r0(c3533d.d().c(), (C1498h) obj));
            } else if (findViewHolderForAdapterPosition instanceof C3531B) {
                C3531B c3531b = (C3531B) findViewHolderForAdapterPosition;
                Iterator it2 = c3531b.d().b().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (AbstractC3159y.d(((C1498h) next2).y0(), packageName)) {
                        obj = next2;
                        break;
                    }
                }
                c3531b.d().notifyItemChanged(AbstractC1246t.r0(c3531b.d().b(), (C1498h) obj));
            } else if (findViewHolderForAdapterPosition instanceof C3558m) {
                if (AbstractC3159y.d(((C3558m) findViewHolderForAdapterPosition).o(), packageName)) {
                    notifyItemChanged(this.f1701g);
                }
            } else if (findViewHolderForAdapterPosition instanceof o5.M) {
                if (AbstractC3159y.d(((o5.M) findViewHolderForAdapterPosition).s(), packageName)) {
                    notifyItemChanged(this.f1703i);
                }
            } else if (findViewHolderForAdapterPosition instanceof X0) {
                X0 x02 = (X0) findViewHolderForAdapterPosition;
                Iterator it3 = x02.e().l().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next3 = it3.next();
                    if (AbstractC3159y.d(((C1498h) next3).y0(), packageName)) {
                        obj = next3;
                        break;
                    }
                }
                x02.e().notifyItemChanged(AbstractC1246t.r0(x02.e().l(), (C1498h) obj));
            } else if (findViewHolderForAdapterPosition instanceof B0) {
                B0 b02 = (B0) findViewHolderForAdapterPosition;
                Iterator it4 = b02.d().a().iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next4 = it4.next();
                    if (AbstractC3159y.d(((C1498h) next4).y0(), packageName)) {
                        obj = next4;
                        break;
                    }
                }
                b02.d().notifyItemChanged(AbstractC1246t.r0(b02.d().a(), (C1498h) obj));
            } else if (findViewHolderForAdapterPosition instanceof o5.F) {
                o5.F f8 = (o5.F) findViewHolderForAdapterPosition;
                Iterator it5 = f8.d().a().iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Object next5 = it5.next();
                    if (AbstractC3159y.d(((C1498h) next5).y0(), packageName)) {
                        obj = next5;
                        break;
                    }
                }
                f8.d().notifyItemChanged(AbstractC1246t.r0(f8.d().a(), (C1498h) obj));
            }
        }
    }
}
