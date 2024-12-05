package G4;

import P5.AbstractC1378t;
import W4.o0;
import a5.C1632D;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import r5.C3953o0;
import r5.E0;

/* loaded from: classes4.dex */
public final class L extends RecyclerView.Adapter {

    /* renamed from: i, reason: collision with root package name */
    public static final a f3103i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f3104a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList f3105b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f3106c;

    /* renamed from: d, reason: collision with root package name */
    private final Z4.J f3107d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3108e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f3109f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f3110g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f3111h;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return R5.a.a(((C1632D) obj).e(), ((C1632D) obj2).e());
        }
    }

    public L(ArrayList userData, ArrayList data, Context context, Z4.J listener) {
        AbstractC3255y.i(userData, "userData");
        AbstractC3255y.i(data, "data");
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(listener, "listener");
        this.f3104a = userData;
        this.f3105b = data;
        this.f3106c = context;
        this.f3107d = listener;
        this.f3109f = new ArrayList();
        this.f3110g = new ArrayList();
        a();
    }

    private final void a() {
        Object obj;
        c(new ArrayList());
        this.f3109f = new ArrayList();
        this.f3110g = new ArrayList();
        if (!this.f3104a.isEmpty()) {
            Iterator it = this.f3104a.iterator();
            while (it.hasNext()) {
                this.f3109f.add((C1632D) it.next());
            }
        }
        if (!this.f3105b.isEmpty()) {
            Iterator it2 = this.f3105b.iterator();
            while (it2.hasNext()) {
                C1632D c1632d = (C1632D) it2.next();
                Iterator it3 = this.f3109f.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj = it3.next();
                        if (((C1632D) obj).b() == c1632d.b()) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                if (obj == null) {
                    if (!this.f3110g.contains(c1632d)) {
                        this.f3110g.add(c1632d);
                    }
                } else {
                    this.f3110g.remove(c1632d);
                }
            }
        }
        if (!this.f3109f.isEmpty()) {
            b().add("title_user_upcoming_releases");
            b().addAll(AbstractC1378t.P0(this.f3109f, new b()));
        }
        if (!this.f3110g.isEmpty()) {
            b().add("title_upcoming_releases");
            b().addAll(this.f3110g);
        }
        notifyDataSetChanged();
    }

    public final ArrayList b() {
        ArrayList arrayList = this.f3108e;
        if (arrayList != null) {
            return arrayList;
        }
        AbstractC3255y.y("adapterData");
        return null;
    }

    public final void c(ArrayList arrayList) {
        AbstractC3255y.i(arrayList, "<set-?>");
        this.f3108e = arrayList;
    }

    public final void d(ArrayList userData, ArrayList data) {
        AbstractC3255y.i(userData, "userData");
        AbstractC3255y.i(data, "data");
        this.f3104a = new ArrayList(userData);
        this.f3105b = new ArrayList(data);
        a();
    }

    public final void e(boolean z8) {
        this.f3111h = z8;
        if (z8) {
            notifyItemInserted(getItemCount());
        } else {
            notifyItemRemoved(getItemCount());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return b().size() + (this.f3111h ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        if (i8 == b().size()) {
            return 4;
        }
        Object obj = b().get(i8);
        AbstractC3255y.h(obj, "adapterData[position]");
        if (obj instanceof C1632D) {
            if (this.f3109f.contains(obj)) {
                return 0;
            }
            return 1;
        }
        if (obj instanceof String) {
            if (AbstractC3255y.d(obj, "title_user_upcoming_releases")) {
                return 2;
            }
            if (AbstractC3255y.d(obj, "title_upcoming_releases")) {
                return 3;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3255y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof E0) {
            Object obj = b().get(i8);
            AbstractC3255y.g(obj, "null cannot be cast to non-null type com.uptodown.models.PreRegister");
            ((E0) viewHolder).e((C1632D) obj);
        } else if (viewHolder instanceof C3953o0) {
            ((C3953o0) viewHolder).b(true);
        } else if (viewHolder instanceof r5.J) {
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
                    if (i8 != 3) {
                        if (i8 == 4) {
                            View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pb_loading_more_content, viewGroup, false);
                            AbstractC3255y.h(itemView, "itemView");
                            return new r5.J(itemView);
                        }
                        throw new IllegalArgumentException("viewType unknown");
                    }
                    View itemView2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tv_list_title, viewGroup, false);
                    AbstractC3255y.h(itemView2, "itemView");
                    String string = this.f3106c.getString(R.string.upcoming_releases_title);
                    AbstractC3255y.h(string, "context.getString(R.stri….upcoming_releases_title)");
                    return new C3953o0(itemView2, string, null);
                }
                View itemView3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tv_list_title, viewGroup, false);
                AbstractC3255y.h(itemView3, "itemView");
                String string2 = this.f3106c.getString(R.string.user_upcoming_releases_title);
                AbstractC3255y.h(string2, "context.getString(R.stri…_upcoming_releases_title)");
                return new C3953o0(itemView3, string2, null);
            }
            o0 c8 = o0.c(LayoutInflater.from(this.f3106c), viewGroup, false);
            AbstractC3255y.h(c8, "inflate(LayoutInflater.f…ntext), viewGroup, false)");
            return new E0(c8, this.f3106c, this.f3107d, false);
        }
        o0 c9 = o0.c(LayoutInflater.from(this.f3106c), viewGroup, false);
        AbstractC3255y.h(c9, "inflate(LayoutInflater.f…ntext), viewGroup, false)");
        return new E0(c9, this.f3106c, this.f3107d, true);
    }
}
