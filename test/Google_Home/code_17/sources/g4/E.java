package G4;

import Z4.InterfaceC1590d;
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
import r5.C3930d;

/* loaded from: classes4.dex */
public final class E extends RecyclerView.Adapter {

    /* renamed from: e, reason: collision with root package name */
    public static final a f3038e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f3039a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1590d f3040b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f3041c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3042d;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public E(ArrayList searchResults, InterfaceC1590d listener, Context context) {
        AbstractC3255y.i(searchResults, "searchResults");
        AbstractC3255y.i(listener, "listener");
        AbstractC3255y.i(context, "context");
        this.f3039a = searchResults;
        this.f3040b = listener;
        this.f3041c = context;
    }

    public final void a(ArrayList data) {
        AbstractC3255y.i(data, "data");
        Iterator it = data.iterator();
        while (it.hasNext()) {
            C1641h c1641h = (C1641h) it.next();
            if (!this.f3039a.contains(c1641h)) {
                this.f3039a.add(c1641h);
            }
        }
        notifyDataSetChanged();
    }

    public final ArrayList b() {
        return this.f3039a;
    }

    public final void c(ArrayList data) {
        AbstractC3255y.i(data, "data");
        this.f3039a = data;
        notifyDataSetChanged();
    }

    public final void d(boolean z8) {
        this.f3042d = z8;
        if (z8) {
            notifyItemInserted(getItemCount());
        } else {
            notifyItemRemoved(getItemCount());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3039a.size() + (this.f3042d ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        if (i8 == this.f3039a.size()) {
            return 1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3255y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof C3930d) {
            Object obj = this.f3039a.get(i8);
            AbstractC3255y.h(obj, "searchResults[pos]");
            ((C3930d) viewHolder).m((C1641h) obj, i8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3255y.i(viewGroup, "viewGroup");
        if (i8 != 0) {
            if (i8 == 1) {
                View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pb_loading_more_content, viewGroup, false);
                AbstractC3255y.h(itemView, "itemView");
                return new r5.J(itemView);
            }
            throw new IllegalArgumentException("viewType unknown");
        }
        View itemView2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.app_info_item, viewGroup, false);
        AbstractC3255y.h(itemView2, "itemView");
        return new C3930d(itemView2, this.f3040b, null, this.f3041c);
    }
}
