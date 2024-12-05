package D4;

import M5.AbstractC1246t;
import T4.o0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import o5.C3563o0;
import o5.E0;

/* loaded from: classes4.dex */
public final class L extends RecyclerView.Adapter {

    /* renamed from: i, reason: collision with root package name */
    public static final a f1561i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f1562a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList f1563b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f1564c;

    /* renamed from: d, reason: collision with root package name */
    private final W4.J f1565d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f1566e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f1567f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f1568g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1569h;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return O5.a.a(((X4.D) obj).e(), ((X4.D) obj2).e());
        }
    }

    public L(ArrayList userData, ArrayList data, Context context, W4.J listener) {
        AbstractC3159y.i(userData, "userData");
        AbstractC3159y.i(data, "data");
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(listener, "listener");
        this.f1562a = userData;
        this.f1563b = data;
        this.f1564c = context;
        this.f1565d = listener;
        this.f1567f = new ArrayList();
        this.f1568g = new ArrayList();
        a();
    }

    private final void a() {
        Object obj;
        c(new ArrayList());
        this.f1567f = new ArrayList();
        this.f1568g = new ArrayList();
        if (!this.f1562a.isEmpty()) {
            Iterator it = this.f1562a.iterator();
            while (it.hasNext()) {
                this.f1567f.add((X4.D) it.next());
            }
        }
        if (!this.f1563b.isEmpty()) {
            Iterator it2 = this.f1563b.iterator();
            while (it2.hasNext()) {
                X4.D d8 = (X4.D) it2.next();
                Iterator it3 = this.f1567f.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj = it3.next();
                        if (((X4.D) obj).b() == d8.b()) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                if (obj == null) {
                    if (!this.f1568g.contains(d8)) {
                        this.f1568g.add(d8);
                    }
                } else {
                    this.f1568g.remove(d8);
                }
            }
        }
        if (!this.f1567f.isEmpty()) {
            b().add("title_user_upcoming_releases");
            b().addAll(AbstractC1246t.P0(this.f1567f, new b()));
        }
        if (!this.f1568g.isEmpty()) {
            b().add("title_upcoming_releases");
            b().addAll(this.f1568g);
        }
        notifyDataSetChanged();
    }

    public final ArrayList b() {
        ArrayList arrayList = this.f1566e;
        if (arrayList != null) {
            return arrayList;
        }
        AbstractC3159y.y("adapterData");
        return null;
    }

    public final void c(ArrayList arrayList) {
        AbstractC3159y.i(arrayList, "<set-?>");
        this.f1566e = arrayList;
    }

    public final void d(ArrayList userData, ArrayList data) {
        AbstractC3159y.i(userData, "userData");
        AbstractC3159y.i(data, "data");
        this.f1562a = new ArrayList(userData);
        this.f1563b = new ArrayList(data);
        a();
    }

    public final void e(boolean z8) {
        this.f1569h = z8;
        if (z8) {
            notifyItemInserted(getItemCount());
        } else {
            notifyItemRemoved(getItemCount());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return b().size() + (this.f1569h ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        if (i8 == b().size()) {
            return 4;
        }
        Object obj = b().get(i8);
        AbstractC3159y.h(obj, "adapterData[position]");
        if (obj instanceof X4.D) {
            if (this.f1567f.contains(obj)) {
                return 0;
            }
            return 1;
        }
        if (obj instanceof String) {
            if (AbstractC3159y.d(obj, "title_user_upcoming_releases")) {
                return 2;
            }
            if (AbstractC3159y.d(obj, "title_upcoming_releases")) {
                return 3;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof E0) {
            Object obj = b().get(i8);
            AbstractC3159y.g(obj, "null cannot be cast to non-null type com.uptodown.models.PreRegister");
            ((E0) viewHolder).e((X4.D) obj);
        } else if (viewHolder instanceof C3563o0) {
            ((C3563o0) viewHolder).b(true);
        } else if (viewHolder instanceof o5.J) {
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
                    if (i8 != 3) {
                        if (i8 == 4) {
                            View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pb_loading_more_content, viewGroup, false);
                            AbstractC3159y.h(itemView, "itemView");
                            return new o5.J(itemView);
                        }
                        throw new IllegalArgumentException("viewType unknown");
                    }
                    View itemView2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tv_list_title, viewGroup, false);
                    AbstractC3159y.h(itemView2, "itemView");
                    String string = this.f1564c.getString(R.string.upcoming_releases_title);
                    AbstractC3159y.h(string, "context.getString(R.stri….upcoming_releases_title)");
                    return new C3563o0(itemView2, string, null);
                }
                View itemView3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tv_list_title, viewGroup, false);
                AbstractC3159y.h(itemView3, "itemView");
                String string2 = this.f1564c.getString(R.string.user_upcoming_releases_title);
                AbstractC3159y.h(string2, "context.getString(R.stri…_upcoming_releases_title)");
                return new C3563o0(itemView3, string2, null);
            }
            o0 c8 = o0.c(LayoutInflater.from(this.f1564c), viewGroup, false);
            AbstractC3159y.h(c8, "inflate(LayoutInflater.f…ntext), viewGroup, false)");
            return new E0(c8, this.f1564c, this.f1565d, false);
        }
        o0 c9 = o0.c(LayoutInflater.from(this.f1564c), viewGroup, false);
        AbstractC3159y.h(c9, "inflate(LayoutInflater.f…ntext), viewGroup, false)");
        return new E0(c9, this.f1564c, this.f1565d, true);
    }
}
