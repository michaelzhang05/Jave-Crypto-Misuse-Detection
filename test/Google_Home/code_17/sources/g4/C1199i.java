package G4;

import P5.AbstractC1378t;
import Z4.InterfaceC1587a;
import a5.C1641h;
import a5.C1644k;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import r5.B0;
import r5.C3921B;
import r5.C3923D;
import r5.C3948m;
import r5.C3959s;
import r5.C3963u;
import r5.C3973z;
import r5.X0;

/* renamed from: G4.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1199i extends RecyclerView.Adapter {

    /* renamed from: p, reason: collision with root package name */
    public static final a f3236p = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Z4.s f3237a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1587a f3238b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f3239c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3240d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f3241e;

    /* renamed from: f, reason: collision with root package name */
    private int f3242f;

    /* renamed from: g, reason: collision with root package name */
    private int f3243g;

    /* renamed from: h, reason: collision with root package name */
    private int f3244h;

    /* renamed from: i, reason: collision with root package name */
    private int f3245i;

    /* renamed from: j, reason: collision with root package name */
    private int f3246j;

    /* renamed from: k, reason: collision with root package name */
    private int f3247k;

    /* renamed from: l, reason: collision with root package name */
    private int f3248l;

    /* renamed from: m, reason: collision with root package name */
    private int f3249m;

    /* renamed from: n, reason: collision with root package name */
    private int f3250n;

    /* renamed from: o, reason: collision with root package name */
    private int f3251o;

    /* renamed from: G4.i$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: G4.i$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList f3252a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f3253b;

        public final ArrayList a() {
            ArrayList arrayList = this.f3253b;
            if (arrayList != null) {
                return arrayList;
            }
            AbstractC3255y.y("categories");
            return null;
        }

        public final ArrayList b() {
            ArrayList arrayList = this.f3252a;
            if (arrayList != null) {
                return arrayList;
            }
            AbstractC3255y.y("homeFeatures");
            return null;
        }

        public final void c(ArrayList arrayList) {
            AbstractC3255y.i(arrayList, "<set-?>");
            this.f3253b = arrayList;
        }

        public final void d(ArrayList arrayList) {
            AbstractC3255y.i(arrayList, "<set-?>");
            this.f3252a = arrayList;
        }
    }

    /* renamed from: G4.i$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public Object f3254a;

        /* renamed from: b, reason: collision with root package name */
        private int f3255b = -1;

        public final Object a() {
            Object obj = this.f3254a;
            if (obj != null) {
                return obj;
            }
            AbstractC3255y.y("item");
            return O5.I.f8278a;
        }

        public final int b() {
            return this.f3255b;
        }

        public final void c(Object obj) {
            AbstractC3255y.i(obj, "<set-?>");
            this.f3254a = obj;
        }

        public final void d(int i8) {
            this.f3255b = i8;
        }
    }

    public C1199i(Z4.s listener, InterfaceC1587a actionsClickListener, Context context, String fragmentName) {
        AbstractC3255y.i(listener, "listener");
        AbstractC3255y.i(actionsClickListener, "actionsClickListener");
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(fragmentName, "fragmentName");
        this.f3237a = listener;
        this.f3238b = actionsClickListener;
        this.f3239c = context;
        this.f3240d = fragmentName;
        this.f3241e = new ArrayList();
        this.f3242f = -1;
        this.f3243g = -1;
        this.f3244h = -1;
        this.f3245i = -1;
        this.f3246j = -1;
        this.f3247k = -1;
        this.f3248l = -1;
        this.f3249m = -1;
        this.f3250n = -1;
        this.f3251o = -1;
    }

    private final void c(ArrayList arrayList, int i8) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a5.N n8 = (a5.N) it.next();
            if (n8.b().b() == i8) {
                h(n8);
                arrayList.remove(n8);
                return;
            }
        }
    }

    private final void d(C1641h c1641h) {
        c cVar = new c();
        cVar.c(c1641h);
        cVar.d(2);
        this.f3241e.add(cVar);
    }

    private final void e(ArrayList arrayList) {
        c cVar = new c();
        cVar.c(arrayList);
        cVar.d(7);
        this.f3241e.add(cVar);
        notifyItemInserted(this.f3241e.size() - 1);
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
                h((a5.N) it.next());
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
        this.f3241e.add(cVar);
    }

    private final void h(a5.N n8) {
        if (n8 != null) {
            c cVar = new c();
            cVar.c(n8);
            cVar.d(n8.c());
            this.f3241e.add(cVar);
            notifyItemInserted(this.f3241e.size() - 1);
        }
    }

    private final void n(ArrayList arrayList, ArrayList arrayList2) {
        b bVar = new b();
        bVar.d(arrayList);
        bVar.c(arrayList2);
        c cVar = new c();
        cVar.c(bVar);
        cVar.d(0);
        this.f3241e.add(cVar);
    }

    private final void v(a5.N n8, int i8) {
        if (i8 >= 0 && i8 < this.f3241e.size()) {
            c cVar = new c();
            cVar.c(n8);
            cVar.d(n8.c());
            this.f3241e.set(i8, cVar);
            notifyItemChanged(i8);
        }
    }

    public final void a(a5.N floatingCategory) {
        AbstractC3255y.i(floatingCategory, "floatingCategory");
        h(floatingCategory);
    }

    public final void b(C1641h appReplacement) {
        AbstractC3255y.i(appReplacement, "appReplacement");
        Iterator it = this.f3241e.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            int i9 = i8 + 1;
            c cVar = (c) it.next();
            if (cVar != null && cVar.b() == 0) {
                Object a8 = cVar.a();
                AbstractC3255y.g(a8, "null cannot be cast to non-null type com.uptodown.adapters.HomeAdapter.HomeHeader");
                ((b) a8).b().add(appReplacement);
                notifyItemChanged(i8);
                return;
            }
            i8 = i9;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3241e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        c cVar = (c) this.f3241e.get(i8);
        if (cVar != null) {
            return cVar.b();
        }
        return -1;
    }

    public final void i(ArrayList floatingCategories) {
        AbstractC3255y.i(floatingCategories, "floatingCategories");
        if (!floatingCategories.isEmpty()) {
            e(floatingCategories);
        }
    }

    public final void j(C1641h mainApp) {
        AbstractC3255y.i(mainApp, "mainApp");
        c cVar = new c();
        cVar.c(mainApp);
        cVar.d(3);
        this.f3241e.set(this.f3245i, cVar);
        notifyItemChanged(this.f3245i);
    }

    public final void k(a5.N miniTop) {
        AbstractC3255y.i(miniTop, "miniTop");
        h(miniTop);
    }

    public final void l(ArrayList miniTops) {
        AbstractC3255y.i(miniTops, "miniTops");
        Iterator it = miniTops.iterator();
        while (it.hasNext()) {
            a5.N miniTop = (a5.N) it.next();
            int b8 = miniTop.b().b();
            if (b8 != 521) {
                if (b8 != 523) {
                    if (b8 != 524) {
                        h(miniTop);
                    } else {
                        AbstractC3255y.h(miniTop, "miniTop");
                        v(miniTop, this.f3248l);
                    }
                } else {
                    AbstractC3255y.h(miniTop, "miniTop");
                    v(miniTop, this.f3247k);
                }
            } else {
                AbstractC3255y.h(miniTop, "miniTop");
                v(miniTop, this.f3246j);
            }
        }
    }

    public final void m(ArrayList miniTops, C1644k parentCategory) {
        AbstractC3255y.i(miniTops, "miniTops");
        AbstractC3255y.i(parentCategory, "parentCategory");
        if (parentCategory.b() == 523) {
            f(miniTops);
            return;
        }
        Iterator it = miniTops.iterator();
        while (it.hasNext()) {
            h((a5.N) it.next());
        }
    }

    public final void o(ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            Object obj = arrayList.get(0);
            AbstractC3255y.h(obj, "tops[0]");
            v((a5.N) obj, this.f3249m);
            if (arrayList.size() > 1) {
                Object obj2 = arrayList.get(1);
                AbstractC3255y.h(obj2, "tops[1]");
                v((a5.N) obj2, this.f3250n);
            }
            if (arrayList.size() > 2) {
                Object obj3 = arrayList.get(2);
                AbstractC3255y.h(obj3, "tops[2]");
                v((a5.N) obj3, this.f3251o);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        Object obj;
        Object obj2;
        AbstractC3255y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof C3959s) {
            ((C3959s) viewHolder).a();
            return;
        }
        Object obj3 = null;
        if (viewHolder instanceof C3973z) {
            C3973z c3973z = (C3973z) viewHolder;
            c cVar = (c) this.f3241e.get(i8);
            if (cVar != null) {
                obj3 = cVar.a();
            }
            AbstractC3255y.g(obj3, "null cannot be cast to non-null type com.uptodown.adapters.HomeAdapter.HomeHeader");
            c3973z.d((b) obj3);
            return;
        }
        if (viewHolder instanceof C3923D) {
            c cVar2 = (c) this.f3241e.get(i8);
            if (cVar2 != null) {
                obj2 = cVar2.a();
            } else {
                obj2 = null;
            }
            if (obj2 instanceof a5.N) {
                C3923D c3923d = (C3923D) viewHolder;
                c cVar3 = (c) this.f3241e.get(i8);
                if (cVar3 != null) {
                    obj3 = cVar3.a();
                }
                AbstractC3255y.g(obj3, "null cannot be cast to non-null type com.uptodown.models.TopByCategory");
                c3923d.b((a5.N) obj3);
                return;
            }
            return;
        }
        if (viewHolder instanceof C3921B) {
            c cVar4 = (c) this.f3241e.get(i8);
            if (cVar4 != null) {
                obj = cVar4.a();
            } else {
                obj = null;
            }
            if (obj instanceof a5.N) {
                C3921B c3921b = (C3921B) viewHolder;
                c cVar5 = (c) this.f3241e.get(i8);
                if (cVar5 != null) {
                    obj3 = cVar5.a();
                }
                AbstractC3255y.g(obj3, "null cannot be cast to non-null type com.uptodown.models.TopByCategory");
                c3921b.b((a5.N) obj3);
                return;
            }
            return;
        }
        if (viewHolder instanceof C3948m) {
            C3948m c3948m = (C3948m) viewHolder;
            c cVar6 = (c) this.f3241e.get(i8);
            if (cVar6 != null) {
                obj3 = cVar6.a();
            }
            AbstractC3255y.g(obj3, "null cannot be cast to non-null type com.uptodown.models.AppInfo");
            c3948m.m((C1641h) obj3);
            return;
        }
        if (viewHolder instanceof r5.M) {
            r5.M m8 = (r5.M) viewHolder;
            c cVar7 = (c) this.f3241e.get(i8);
            if (cVar7 != null) {
                obj3 = cVar7.a();
            }
            AbstractC3255y.g(obj3, "null cannot be cast to non-null type com.uptodown.models.AppInfo");
            m8.p((C1641h) obj3);
            return;
        }
        if (viewHolder instanceof X0) {
            X0 x02 = (X0) viewHolder;
            c cVar8 = (c) this.f3241e.get(i8);
            if (cVar8 != null) {
                obj3 = cVar8.a();
            }
            AbstractC3255y.g(obj3, "null cannot be cast to non-null type com.uptodown.models.TopByCategory");
            x02.c((a5.N) obj3);
            return;
        }
        if (viewHolder instanceof B0) {
            B0 b02 = (B0) viewHolder;
            c cVar9 = (c) this.f3241e.get(i8);
            if (cVar9 != null) {
                obj3 = cVar9.a();
            }
            AbstractC3255y.g(obj3, "null cannot be cast to non-null type com.uptodown.models.TopByCategory");
            b02.b((a5.N) obj3);
            return;
        }
        if (viewHolder instanceof r5.F) {
            r5.F f8 = (r5.F) viewHolder;
            c cVar10 = (c) this.f3241e.get(i8);
            if (cVar10 != null) {
                obj3 = cVar10.a();
            }
            AbstractC3255y.g(obj3, "null cannot be cast to non-null type com.uptodown.models.TopByCategory");
            f8.b((a5.N) obj3);
            return;
        }
        if (viewHolder instanceof C3963u) {
            C3963u c3963u = (C3963u) viewHolder;
            c cVar11 = (c) this.f3241e.get(i8);
            if (cVar11 != null) {
                obj3 = cVar11.a();
            }
            AbstractC3255y.g(obj3, "null cannot be cast to non-null type java.util.ArrayList<com.uptodown.models.Category>{ kotlin.collections.TypeAliasesKt.ArrayList<com.uptodown.models.Category> }");
            c3963u.b((ArrayList) obj3);
            return;
        }
        throw new IllegalArgumentException("ViewHolder unknown!!");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3255y.i(viewGroup, "viewGroup");
        switch (i8) {
            case -1:
                View inflate = LayoutInflater.from(this.f3239c).inflate(R.layout.empty_view, viewGroup, false);
                AbstractC3255y.h(inflate, "from(context).inflate(R.…y_view, viewGroup, false)");
                return new C3959s(inflate);
            case 0:
                View inflate2 = LayoutInflater.from(this.f3239c).inflate(R.layout.home_fragment_header, viewGroup, false);
                AbstractC3255y.h(inflate2, "from(context).inflate(R.…header, viewGroup, false)");
                return new C3973z(inflate2, this.f3237a, this.f3238b, this.f3239c);
            case 1:
                View inflate3 = LayoutInflater.from(this.f3239c).inflate(R.layout.home_recycler_view_top, viewGroup, false);
                AbstractC3255y.h(inflate3, "from(context).inflate(R.…ew_top, viewGroup, false)");
                return new C3923D(inflate3, this.f3237a, this.f3238b, this.f3239c);
            case 2:
                View inflate4 = LayoutInflater.from(this.f3239c).inflate(R.layout.card_featured, viewGroup, false);
                AbstractC3255y.h(inflate4, "from(context).inflate(R.…atured, viewGroup, false)");
                return new C3948m(inflate4, this.f3237a, this.f3238b, this.f3239c);
            case 3:
                View inflate5 = LayoutInflater.from(this.f3239c).inflate(R.layout.home_gallery_featured, viewGroup, false);
                AbstractC3255y.h(inflate5, "from(context).inflate(R.…atured, viewGroup, false)");
                return new r5.M(inflate5, this.f3237a, this.f3238b, this.f3239c);
            case 4:
                View inflate6 = LayoutInflater.from(this.f3239c).inflate(R.layout.home_recycler_view_top, viewGroup, false);
                AbstractC3255y.h(inflate6, "from(context).inflate(R.…ew_top, viewGroup, false)");
                return new X0(inflate6, this.f3237a, this.f3238b, this.f3239c, this.f3240d);
            case 5:
                View inflate7 = LayoutInflater.from(this.f3239c).inflate(R.layout.home_recycler_view_top, viewGroup, false);
                AbstractC3255y.h(inflate7, "from(context).inflate(R.…ew_top, viewGroup, false)");
                return new B0(inflate7, this.f3237a, this.f3238b, this.f3239c);
            case 6:
                View inflate8 = LayoutInflater.from(this.f3239c).inflate(R.layout.home_recycler_view_top, viewGroup, false);
                AbstractC3255y.h(inflate8, "from(context).inflate(R.…ew_top, viewGroup, false)");
                return new r5.F(inflate8, this.f3237a, this.f3238b, this.f3239c);
            case 7:
                View inflate9 = LayoutInflater.from(this.f3239c).inflate(R.layout.floating_categories, viewGroup, false);
                AbstractC3255y.h(inflate9, "from(context).inflate(R.…gories, viewGroup, false)");
                return new C3963u(inflate9, this.f3237a, this.f3239c);
            case 8:
                View inflate10 = LayoutInflater.from(this.f3239c).inflate(R.layout.home_recycler_view_top, viewGroup, false);
                AbstractC3255y.h(inflate10, "from(context).inflate(R.…ew_top, viewGroup, false)");
                return new C3921B(inflate10, this.f3237a, this.f3238b, this.f3239c);
            default:
                throw new IllegalArgumentException("viewType unknown");
        }
    }

    public final void p(ArrayList appsFeatured, ArrayList leafCategories, a5.N n8, C1641h c1641h, a5.N n9) {
        ArrayList a8;
        ArrayList a9;
        ArrayList a10;
        AbstractC3255y.i(appsFeatured, "appsFeatured");
        AbstractC3255y.i(leafCategories, "leafCategories");
        this.f3241e = new ArrayList();
        if (!appsFeatured.isEmpty()) {
            n(appsFeatured, leafCategories);
        }
        if (n8 != null && (a10 = n8.a()) != null && (!a10.isEmpty())) {
            h(n8);
        }
        if ((!leafCategories.isEmpty()) && ((C1644k) leafCategories.get(0)).i() == 523) {
            if (n9 != null && (a9 = n9.a()) != null && (!a9.isEmpty())) {
                h(n9);
            }
            if (c1641h != null) {
                d(c1641h);
                return;
            }
            return;
        }
        if (c1641h != null) {
            d(c1641h);
        }
        if (n9 != null && (a8 = n9.a()) != null && (!a8.isEmpty())) {
            h(n9);
        }
    }

    public final void q(ArrayList homeFeatures, a5.N n8, a5.N n9) {
        AbstractC3255y.i(homeFeatures, "homeFeatures");
        this.f3241e = new ArrayList();
        g(homeFeatures, new ArrayList());
        h(n8);
        this.f3241e.add(null);
        this.f3242f = this.f3241e.size() - 1;
        h(n9);
        this.f3241e.add(null);
        this.f3243g = this.f3241e.size() - 1;
        this.f3241e.add(null);
        this.f3250n = this.f3241e.size() - 1;
        this.f3241e.add(null);
        this.f3244h = this.f3241e.size() - 1;
        this.f3241e.add(null);
        this.f3251o = this.f3241e.size() - 1;
        this.f3241e.add(null);
        this.f3245i = this.f3241e.size() - 1;
        this.f3241e.add(null);
        this.f3246j = this.f3241e.size() - 1;
        this.f3241e.add(null);
        this.f3247k = this.f3241e.size() - 1;
        this.f3241e.add(null);
        this.f3248l = this.f3241e.size() - 1;
    }

    public final ArrayList r() {
        return this.f3241e;
    }

    public final void s(C1641h featuredApp) {
        AbstractC3255y.i(featuredApp, "featuredApp");
        if (this.f3243g > 0) {
            c cVar = new c();
            cVar.c(featuredApp);
            cVar.d(2);
            this.f3241e.set(this.f3243g, cVar);
            notifyItemChanged(this.f3243g);
        }
    }

    public final void t(a5.N top) {
        AbstractC3255y.i(top, "top");
        v(top, this.f3242f);
    }

    public final void u(a5.N top) {
        AbstractC3255y.i(top, "top");
        v(top, this.f3244h);
    }

    public final void w(String packageName, RecyclerView recyclerView) {
        AbstractC3255y.i(packageName, "packageName");
        AbstractC3255y.i(recyclerView, "recyclerView");
        int itemCount = getItemCount();
        for (int i8 = 0; i8 < itemCount; i8++) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i8);
            Object obj = null;
            if (findViewHolderForAdapterPosition instanceof C3923D) {
                C3923D c3923d = (C3923D) findViewHolderForAdapterPosition;
                Iterator it = c3923d.d().c().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (AbstractC3255y.d(((C1641h) next).y0(), packageName)) {
                        obj = next;
                        break;
                    }
                }
                c3923d.d().notifyItemChanged(AbstractC1378t.r0(c3923d.d().c(), (C1641h) obj));
            } else if (findViewHolderForAdapterPosition instanceof C3921B) {
                C3921B c3921b = (C3921B) findViewHolderForAdapterPosition;
                Iterator it2 = c3921b.d().b().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (AbstractC3255y.d(((C1641h) next2).y0(), packageName)) {
                        obj = next2;
                        break;
                    }
                }
                c3921b.d().notifyItemChanged(AbstractC1378t.r0(c3921b.d().b(), (C1641h) obj));
            } else if (findViewHolderForAdapterPosition instanceof C3948m) {
                if (AbstractC3255y.d(((C3948m) findViewHolderForAdapterPosition).o(), packageName)) {
                    notifyItemChanged(this.f3243g);
                }
            } else if (findViewHolderForAdapterPosition instanceof r5.M) {
                if (AbstractC3255y.d(((r5.M) findViewHolderForAdapterPosition).s(), packageName)) {
                    notifyItemChanged(this.f3245i);
                }
            } else if (findViewHolderForAdapterPosition instanceof X0) {
                X0 x02 = (X0) findViewHolderForAdapterPosition;
                Iterator it3 = x02.e().l().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next3 = it3.next();
                    if (AbstractC3255y.d(((C1641h) next3).y0(), packageName)) {
                        obj = next3;
                        break;
                    }
                }
                x02.e().notifyItemChanged(AbstractC1378t.r0(x02.e().l(), (C1641h) obj));
            } else if (findViewHolderForAdapterPosition instanceof B0) {
                B0 b02 = (B0) findViewHolderForAdapterPosition;
                Iterator it4 = b02.d().a().iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next4 = it4.next();
                    if (AbstractC3255y.d(((C1641h) next4).y0(), packageName)) {
                        obj = next4;
                        break;
                    }
                }
                b02.d().notifyItemChanged(AbstractC1378t.r0(b02.d().a(), (C1641h) obj));
            } else if (findViewHolderForAdapterPosition instanceof r5.F) {
                r5.F f8 = (r5.F) findViewHolderForAdapterPosition;
                Iterator it5 = f8.d().a().iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Object next5 = it5.next();
                    if (AbstractC3255y.d(((C1641h) next5).y0(), packageName)) {
                        obj = next5;
                        break;
                    }
                }
                f8.d().notifyItemChanged(AbstractC1378t.r0(f8.d().a(), (C1641h) obj));
            }
        }
    }
}
