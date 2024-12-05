package D4;

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
import o5.V0;

/* loaded from: classes4.dex */
public final class Q extends RecyclerView.Adapter {

    /* renamed from: d, reason: collision with root package name */
    public static final a f1608d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f1609a;

    /* renamed from: b, reason: collision with root package name */
    private final W4.H f1610b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1611c;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public Q(ArrayList reviews, W4.H listener) {
        AbstractC3159y.i(reviews, "reviews");
        AbstractC3159y.i(listener, "listener");
        this.f1609a = reviews;
        this.f1610b = listener;
    }

    public final void a(ArrayList data) {
        AbstractC3159y.i(data, "data");
        this.f1609a.addAll(data);
        notifyDataSetChanged();
    }

    public final ArrayList b() {
        return this.f1609a;
    }

    public final void c(boolean z8) {
        this.f1611c = z8;
        if (z8) {
            notifyItemInserted(getItemCount());
        } else {
            notifyItemRemoved(getItemCount());
        }
    }

    public final void d(X4.K review) {
        AbstractC3159y.i(review, "review");
        Iterator it = this.f1609a.iterator();
        int i8 = 0;
        while (true) {
            if (it.hasNext()) {
                int i9 = i8 + 1;
                if (((X4.K) it.next()).j() == review.j()) {
                    break;
                } else {
                    i8 = i9;
                }
            } else {
                i8 = -1;
                break;
            }
        }
        this.f1609a.set(i8, review);
        notifyItemChanged(i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f1609a.size() + (this.f1611c ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        if (i8 == this.f1609a.size()) {
            return 1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof V0) {
            Object obj = this.f1609a.get(i8);
            AbstractC3159y.h(obj, "reviews[pos]");
            ((V0) viewHolder).h((X4.K) obj, i8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3159y.i(viewGroup, "viewGroup");
        if (i8 != 0) {
            if (i8 == 1) {
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pb_loading_more_content, viewGroup, false);
                AbstractC3159y.h(inflate, "from(viewGroup.context).…ontent, viewGroup, false)");
                return new o5.J(inflate);
            }
            throw new IllegalArgumentException("viewType unknown");
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.review, viewGroup, false);
        AbstractC3159y.h(inflate2, "from(viewGroup.context).…review, viewGroup, false)");
        W4.H h8 = this.f1610b;
        Context context = viewGroup.getContext();
        AbstractC3159y.h(context, "viewGroup.context");
        return new V0(inflate2, h8, context);
    }
}
