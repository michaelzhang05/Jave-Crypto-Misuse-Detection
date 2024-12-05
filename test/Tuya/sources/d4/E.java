package D4;

import W4.InterfaceC1481d;
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
import o5.C3540d;

/* loaded from: classes4.dex */
public final class E extends RecyclerView.Adapter {

    /* renamed from: e, reason: collision with root package name */
    public static final a f1496e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f1497a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1481d f1498b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f1499c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1500d;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public E(ArrayList searchResults, InterfaceC1481d listener, Context context) {
        AbstractC3159y.i(searchResults, "searchResults");
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(context, "context");
        this.f1497a = searchResults;
        this.f1498b = listener;
        this.f1499c = context;
    }

    public final void a(ArrayList data) {
        AbstractC3159y.i(data, "data");
        Iterator it = data.iterator();
        while (it.hasNext()) {
            C1498h c1498h = (C1498h) it.next();
            if (!this.f1497a.contains(c1498h)) {
                this.f1497a.add(c1498h);
            }
        }
        notifyDataSetChanged();
    }

    public final ArrayList b() {
        return this.f1497a;
    }

    public final void c(ArrayList data) {
        AbstractC3159y.i(data, "data");
        this.f1497a = data;
        notifyDataSetChanged();
    }

    public final void d(boolean z8) {
        this.f1500d = z8;
        if (z8) {
            notifyItemInserted(getItemCount());
        } else {
            notifyItemRemoved(getItemCount());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f1497a.size() + (this.f1500d ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        if (i8 == this.f1497a.size()) {
            return 1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof C3540d) {
            Object obj = this.f1497a.get(i8);
            AbstractC3159y.h(obj, "searchResults[pos]");
            ((C3540d) viewHolder).m((C1498h) obj, i8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3159y.i(viewGroup, "viewGroup");
        if (i8 != 0) {
            if (i8 == 1) {
                View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pb_loading_more_content, viewGroup, false);
                AbstractC3159y.h(itemView, "itemView");
                return new o5.J(itemView);
            }
            throw new IllegalArgumentException("viewType unknown");
        }
        View itemView2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.app_info_item, viewGroup, false);
        AbstractC3159y.h(itemView2, "itemView");
        return new C3540d(itemView2, this.f1498b, null, this.f1499c);
    }
}
