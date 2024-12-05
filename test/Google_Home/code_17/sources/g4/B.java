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
import r5.C3939h0;

/* loaded from: classes4.dex */
public final class B extends RecyclerView.Adapter {

    /* renamed from: e, reason: collision with root package name */
    public static final a f3027e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f3028a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f3029b;

    /* renamed from: c, reason: collision with root package name */
    private final Z4.A f3030c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3031d;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public B(ArrayList datos, Context context, Z4.A listener) {
        AbstractC3255y.i(datos, "datos");
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(listener, "listener");
        this.f3028a = datos;
        this.f3029b = context;
        this.f3030c = listener;
    }

    public final void a(a5.K review) {
        AbstractC3255y.i(review, "review");
        this.f3028a.add(review);
        notifyItemInserted(getItemCount());
    }

    public final ArrayList b() {
        return this.f3028a;
    }

    public final void c(boolean z8) {
        this.f3031d = z8;
        if (z8) {
            notifyItemInserted(getItemCount());
        } else {
            notifyItemRemoved(getItemCount());
        }
    }

    public final void d(a5.K review) {
        AbstractC3255y.i(review, "review");
        Iterator it = this.f3028a.iterator();
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
        this.f3028a.set(i8, review);
        notifyItemChanged(i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3028a.size() + (this.f3031d ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        if (i8 == this.f3028a.size()) {
            return 2;
        }
        if (((a5.K) this.f3028a.get(i8)).H()) {
            return 1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3255y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof C3939h0) {
            Object obj = this.f3028a.get(i8);
            AbstractC3255y.h(obj, "datos[pos]");
            a5.K k8 = (a5.K) obj;
            if (k8.H()) {
                ((C3939h0) viewHolder).f(k8, i8);
            } else {
                ((C3939h0) viewHolder).e(k8, i8);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3255y.i(viewGroup, "viewGroup");
        if (i8 != 1) {
            if (i8 != 2) {
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.review, viewGroup, false);
                AbstractC3255y.h(inflate, "from(viewGroup.context).…review, viewGroup, false)");
                return new C3939h0(inflate, this.f3029b, this.f3030c);
            }
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pb_loading_more_content, viewGroup, false);
            AbstractC3255y.h(inflate2, "from(viewGroup.context).…ontent, viewGroup, false)");
            return new r5.J(inflate2);
        }
        View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.review_turbo, viewGroup, false);
        AbstractC3255y.h(inflate3, "from(viewGroup.context).…_turbo, viewGroup, false)");
        return new C3939h0(inflate3, this.f3029b, this.f3030c);
    }
}
