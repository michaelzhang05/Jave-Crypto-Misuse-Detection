package D4;

import W4.InterfaceC1478a;
import W4.InterfaceC1481d;
import W4.InterfaceC1482e;
import X4.C1498h;
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
import o5.C3576v0;
import o5.C3580x0;
import o5.C3584z0;

/* loaded from: classes4.dex */
public final class G extends RecyclerView.Adapter {

    /* renamed from: l, reason: collision with root package name */
    public static final a f1507l = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1481d f1508a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1482e f1509b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1478a f1510c;

    /* renamed from: d, reason: collision with root package name */
    private final String f1511d;

    /* renamed from: e, reason: collision with root package name */
    private final String f1512e;

    /* renamed from: f, reason: collision with root package name */
    private final String f1513f;

    /* renamed from: g, reason: collision with root package name */
    private final String f1514g;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList f1515h;

    /* renamed from: i, reason: collision with root package name */
    private int f1516i;

    /* renamed from: j, reason: collision with root package name */
    private int f1517j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f1518k;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private C1498h f1519a;

        /* renamed from: b, reason: collision with root package name */
        private int f1520b = 1;

        /* renamed from: c, reason: collision with root package name */
        private int f1521c = 1;

        public final int a() {
            return this.f1521c;
        }

        public final C1498h b() {
            return this.f1519a;
        }

        public final int c() {
            return this.f1520b;
        }

        public final void d(int i8) {
            this.f1521c = i8;
        }

        public final void e(C1498h c1498h) {
            this.f1519a = c1498h;
        }

        public final void f(int i8) {
            this.f1520b = i8;
        }
    }

    public G(InterfaceC1481d listener, InterfaceC1482e topItemsListener, InterfaceC1478a actionsClickListener, String str, String str2, String readMore, String readLess) {
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(topItemsListener, "topItemsListener");
        AbstractC3159y.i(actionsClickListener, "actionsClickListener");
        AbstractC3159y.i(readMore, "readMore");
        AbstractC3159y.i(readLess, "readLess");
        this.f1508a = listener;
        this.f1509b = topItemsListener;
        this.f1510c = actionsClickListener;
        this.f1511d = str;
        this.f1512e = str2;
        this.f1513f = readMore;
        this.f1514g = readLess;
        this.f1515h = new ArrayList();
        this.f1518k = true;
    }

    private final boolean d(X4.N n8) {
        if (n8.b().c() != -2 && n8.b().c() != -3) {
            return true;
        }
        return false;
    }

    public final void a(ArrayList apps, boolean z8) {
        AbstractC3159y.i(apps, "apps");
        int size = this.f1515h.size();
        Iterator it = apps.iterator();
        while (it.hasNext()) {
            C1498h c1498h = (C1498h) it.next();
            b bVar = new b();
            bVar.e(c1498h);
            bVar.f(0);
            if (z8) {
                int i8 = this.f1517j + 1;
                this.f1517j = i8;
                bVar.d(i8);
            } else {
                bVar.d(0);
            }
            this.f1515h.add(bVar);
        }
        notifyItemRangeInserted(size, this.f1515h.size());
    }

    public final void b(X4.N topByCategory, int i8) {
        AbstractC3159y.i(topByCategory, "topByCategory");
        this.f1515h = new ArrayList();
        this.f1516i = i8;
        boolean d8 = d(topByCategory);
        this.f1518k = d8;
        if (!d8) {
            Iterator it = topByCategory.a().iterator();
            while (it.hasNext()) {
                C1498h c1498h = (C1498h) it.next();
                b bVar = new b();
                bVar.e(c1498h);
                bVar.f(0);
                bVar.d(0);
                this.f1515h.add(bVar);
            }
            return;
        }
        String b8 = topByCategory.b().b();
        if (b8 != null && b8.length() != 0) {
            b bVar2 = new b();
            bVar2.f(2);
            this.f1515h.add(bVar2);
        }
        Iterator it2 = topByCategory.a().iterator();
        int i9 = 0;
        while (it2.hasNext()) {
            int i10 = i9 + 1;
            C1498h c1498h2 = (C1498h) it2.next();
            b bVar3 = new b();
            bVar3.e(c1498h2);
            if (i9 == 0 && c1498h2.q1()) {
                bVar3.f(3);
            } else if (i9 < 10) {
                bVar3.f(1);
            } else {
                bVar3.f(0);
            }
            this.f1517j = i10;
            bVar3.d(i10);
            this.f1515h.add(bVar3);
            i9 = i10;
        }
    }

    public final ArrayList c() {
        return this.f1515h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f1515h.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        return ((b) this.f1515h.get(i8)).c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof C3576v0) {
            C1498h b8 = ((b) this.f1515h.get(i8)).b();
            AbstractC3159y.f(b8);
            ((C3576v0) viewHolder).r(b8, ((b) this.f1515h.get(i8)).a(), i8);
        } else if (viewHolder instanceof C3580x0) {
            C1498h b9 = ((b) this.f1515h.get(i8)).b();
            AbstractC3159y.f(b9);
            ((C3580x0) viewHolder).m(b9, ((b) this.f1515h.get(i8)).a());
        } else if (viewHolder instanceof C3584z0) {
        } else {
            throw new IllegalArgumentException("ViewHolder unknown!!");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3159y.i(viewGroup, "viewGroup");
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.app_info_promoted_top_by_cat_item, viewGroup, false);
                        AbstractC3159y.h(inflate, "from(viewGroup.context).…t_item, viewGroup, false)");
                        InterfaceC1481d interfaceC1481d = this.f1508a;
                        InterfaceC1482e interfaceC1482e = this.f1509b;
                        InterfaceC1478a interfaceC1478a = this.f1510c;
                        Context context = viewGroup.getContext();
                        AbstractC3159y.h(context, "viewGroup.context");
                        return new C3576v0(inflate, interfaceC1481d, interfaceC1482e, interfaceC1478a, context);
                    }
                    throw new IllegalArgumentException("viewType unknown");
                }
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.top_by_category_title_view, viewGroup, false);
                AbstractC3159y.h(inflate2, "from(viewGroup.context).…e_view, viewGroup, false)");
                return new C3584z0(inflate2, this.f1511d, this.f1512e, this.f1513f, this.f1514g);
            }
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.app_info_top_by_cat_item, viewGroup, false);
            AbstractC3159y.h(inflate3, "from(viewGroup.context).…t_item, viewGroup, false)");
            InterfaceC1481d interfaceC1481d2 = this.f1508a;
            InterfaceC1482e interfaceC1482e2 = this.f1509b;
            InterfaceC1478a interfaceC1478a2 = this.f1510c;
            Context context2 = viewGroup.getContext();
            AbstractC3159y.h(context2, "viewGroup.context");
            return new C3576v0(inflate3, interfaceC1481d2, interfaceC1482e2, interfaceC1478a2, context2);
        }
        View inflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.app_info_top_by_cat_item_small, viewGroup, false);
        AbstractC3159y.h(inflate4, "from(viewGroup.context).…_small, viewGroup, false)");
        InterfaceC1481d interfaceC1481d3 = this.f1508a;
        InterfaceC1478a interfaceC1478a3 = this.f1510c;
        Context context3 = viewGroup.getContext();
        AbstractC3159y.h(context3, "viewGroup.context");
        return new C3580x0(inflate4, interfaceC1481d3, interfaceC1478a3, context3);
    }
}
