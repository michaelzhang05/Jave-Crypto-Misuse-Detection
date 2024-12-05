package G4;

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
import r5.V0;

/* loaded from: classes4.dex */
public final class Q extends RecyclerView.Adapter {

    /* renamed from: d, reason: collision with root package name */
    public static final a f3150d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f3151a;

    /* renamed from: b, reason: collision with root package name */
    private final Z4.H f3152b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3153c;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public Q(ArrayList reviews, Z4.H listener) {
        AbstractC3255y.i(reviews, "reviews");
        AbstractC3255y.i(listener, "listener");
        this.f3151a = reviews;
        this.f3152b = listener;
    }

    public final void a(ArrayList data) {
        AbstractC3255y.i(data, "data");
        this.f3151a.addAll(data);
        notifyDataSetChanged();
    }

    public final ArrayList b() {
        return this.f3151a;
    }

    public final void c(boolean z8) {
        this.f3153c = z8;
        if (z8) {
            notifyItemInserted(getItemCount());
        } else {
            notifyItemRemoved(getItemCount());
        }
    }

    public final void d(a5.K review) {
        AbstractC3255y.i(review, "review");
        Iterator it = this.f3151a.iterator();
        int i8 = 0;
        while (true) {
            if (it.hasNext()) {
                int i9 = i8 + 1;
                if (((a5.K) it.next()).l() == review.l()) {
                    break;
                } else {
                    i8 = i9;
                }
            } else {
                i8 = -1;
                break;
            }
        }
        this.f3151a.set(i8, review);
        notifyItemChanged(i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3151a.size() + (this.f3153c ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        if (i8 == this.f3151a.size()) {
            return 1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3255y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof V0) {
            Object obj = this.f3151a.get(i8);
            AbstractC3255y.h(obj, "reviews[pos]");
            ((V0) viewHolder).h((a5.K) obj, i8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3255y.i(viewGroup, "viewGroup");
        if (i8 != 0) {
            if (i8 == 1) {
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pb_loading_more_content, viewGroup, false);
                AbstractC3255y.h(inflate, "from(viewGroup.context).…ontent, viewGroup, false)");
                return new r5.J(inflate);
            }
            throw new IllegalArgumentException("viewType unknown");
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.review, viewGroup, false);
        AbstractC3255y.h(inflate2, "from(viewGroup.context).…review, viewGroup, false)");
        Z4.H h8 = this.f3152b;
        Context context = viewGroup.getContext();
        AbstractC3255y.h(context, "viewGroup.context");
        return new V0(inflate2, h8, context);
    }
}
