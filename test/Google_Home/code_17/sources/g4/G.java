package G4;

import Z4.InterfaceC1587a;
import Z4.InterfaceC1590d;
import Z4.InterfaceC1591e;
import a5.C1641h;
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
import r5.C3966v0;
import r5.C3970x0;
import r5.C3974z0;

/* loaded from: classes4.dex */
public final class G extends RecyclerView.Adapter {

    /* renamed from: l, reason: collision with root package name */
    public static final a f3049l = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1590d f3050a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1591e f3051b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1587a f3052c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3053d;

    /* renamed from: e, reason: collision with root package name */
    private final String f3054e;

    /* renamed from: f, reason: collision with root package name */
    private final String f3055f;

    /* renamed from: g, reason: collision with root package name */
    private final String f3056g;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList f3057h;

    /* renamed from: i, reason: collision with root package name */
    private int f3058i;

    /* renamed from: j, reason: collision with root package name */
    private int f3059j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f3060k;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private C1641h f3061a;

        /* renamed from: b, reason: collision with root package name */
        private int f3062b = 1;

        /* renamed from: c, reason: collision with root package name */
        private int f3063c = 1;

        public final int a() {
            return this.f3063c;
        }

        public final C1641h b() {
            return this.f3061a;
        }

        public final int c() {
            return this.f3062b;
        }

        public final void d(int i8) {
            this.f3063c = i8;
        }

        public final void e(C1641h c1641h) {
            this.f3061a = c1641h;
        }

        public final void f(int i8) {
            this.f3062b = i8;
        }
    }

    public G(InterfaceC1590d listener, InterfaceC1591e topItemsListener, InterfaceC1587a actionsClickListener, String str, String str2, String readMore, String readLess) {
        AbstractC3255y.i(listener, "listener");
        AbstractC3255y.i(topItemsListener, "topItemsListener");
        AbstractC3255y.i(actionsClickListener, "actionsClickListener");
        AbstractC3255y.i(readMore, "readMore");
        AbstractC3255y.i(readLess, "readLess");
        this.f3050a = listener;
        this.f3051b = topItemsListener;
        this.f3052c = actionsClickListener;
        this.f3053d = str;
        this.f3054e = str2;
        this.f3055f = readMore;
        this.f3056g = readLess;
        this.f3057h = new ArrayList();
        this.f3060k = true;
    }

    private final boolean d(a5.N n8) {
        if (n8.b().b() != -2 && n8.b().b() != -3) {
            return true;
        }
        return false;
    }

    public final void a(ArrayList apps, boolean z8) {
        AbstractC3255y.i(apps, "apps");
        int size = this.f3057h.size();
        Iterator it = apps.iterator();
        while (it.hasNext()) {
            C1641h c1641h = (C1641h) it.next();
            b bVar = new b();
            bVar.e(c1641h);
            bVar.f(0);
            if (z8) {
                int i8 = this.f3059j + 1;
                this.f3059j = i8;
                bVar.d(i8);
            } else {
                bVar.d(0);
            }
            this.f3057h.add(bVar);
        }
        notifyItemRangeInserted(size, this.f3057h.size());
    }

    public final void b(a5.N topByCategory, int i8) {
        AbstractC3255y.i(topByCategory, "topByCategory");
        this.f3057h = new ArrayList();
        this.f3058i = i8;
        boolean d8 = d(topByCategory);
        this.f3060k = d8;
        if (!d8) {
            Iterator it = topByCategory.a().iterator();
            while (it.hasNext()) {
                C1641h c1641h = (C1641h) it.next();
                b bVar = new b();
                bVar.e(c1641h);
                bVar.f(0);
                bVar.d(0);
                this.f3057h.add(bVar);
            }
            return;
        }
        String a8 = topByCategory.b().a();
        if (a8 != null && a8.length() != 0) {
            b bVar2 = new b();
            bVar2.f(2);
            this.f3057h.add(bVar2);
        }
        Iterator it2 = topByCategory.a().iterator();
        int i9 = 0;
        while (it2.hasNext()) {
            int i10 = i9 + 1;
            C1641h c1641h2 = (C1641h) it2.next();
            b bVar3 = new b();
            bVar3.e(c1641h2);
            if (i9 == 0 && c1641h2.q1()) {
                bVar3.f(3);
            } else if (i9 < 10) {
                bVar3.f(1);
            } else {
                bVar3.f(0);
            }
            this.f3059j = i10;
            bVar3.d(i10);
            this.f3057h.add(bVar3);
            i9 = i10;
        }
    }

    public final ArrayList c() {
        return this.f3057h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3057h.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        return ((b) this.f3057h.get(i8)).c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3255y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof C3966v0) {
            C1641h b8 = ((b) this.f3057h.get(i8)).b();
            AbstractC3255y.f(b8);
            ((C3966v0) viewHolder).r(b8, ((b) this.f3057h.get(i8)).a(), i8);
        } else if (viewHolder instanceof C3970x0) {
            C1641h b9 = ((b) this.f3057h.get(i8)).b();
            AbstractC3255y.f(b9);
            ((C3970x0) viewHolder).m(b9, ((b) this.f3057h.get(i8)).a());
        } else if (viewHolder instanceof C3974z0) {
        } else {
            throw new IllegalArgumentException("ViewHolder unknown!!");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3255y.i(viewGroup, "viewGroup");
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.app_info_promoted_top_by_cat_item, viewGroup, false);
                        AbstractC3255y.h(inflate, "from(viewGroup.context).…t_item, viewGroup, false)");
                        InterfaceC1590d interfaceC1590d = this.f3050a;
                        InterfaceC1591e interfaceC1591e = this.f3051b;
                        InterfaceC1587a interfaceC1587a = this.f3052c;
                        Context context = viewGroup.getContext();
                        AbstractC3255y.h(context, "viewGroup.context");
                        return new C3966v0(inflate, interfaceC1590d, interfaceC1591e, interfaceC1587a, context);
                    }
                    throw new IllegalArgumentException("viewType unknown");
                }
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.top_by_category_title_view, viewGroup, false);
                AbstractC3255y.h(inflate2, "from(viewGroup.context).…e_view, viewGroup, false)");
                return new C3974z0(inflate2, this.f3053d, this.f3054e, this.f3055f, this.f3056g);
            }
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.app_info_top_by_cat_item, viewGroup, false);
            AbstractC3255y.h(inflate3, "from(viewGroup.context).…t_item, viewGroup, false)");
            InterfaceC1590d interfaceC1590d2 = this.f3050a;
            InterfaceC1591e interfaceC1591e2 = this.f3051b;
            InterfaceC1587a interfaceC1587a2 = this.f3052c;
            Context context2 = viewGroup.getContext();
            AbstractC3255y.h(context2, "viewGroup.context");
            return new C3966v0(inflate3, interfaceC1590d2, interfaceC1591e2, interfaceC1587a2, context2);
        }
        View inflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.app_info_top_by_cat_item_small, viewGroup, false);
        AbstractC3255y.h(inflate4, "from(viewGroup.context).…_small, viewGroup, false)");
        InterfaceC1590d interfaceC1590d3 = this.f3050a;
        InterfaceC1587a interfaceC1587a3 = this.f3052c;
        Context context3 = viewGroup.getContext();
        AbstractC3255y.h(context3, "viewGroup.context");
        return new C3970x0(inflate4, interfaceC1590d3, interfaceC1587a3, context3);
    }
}
