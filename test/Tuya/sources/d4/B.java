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
import o5.C3549h0;

/* loaded from: classes4.dex */
public final class B extends RecyclerView.Adapter {

    /* renamed from: e, reason: collision with root package name */
    public static final a f1485e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f1486a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f1487b;

    /* renamed from: c, reason: collision with root package name */
    private final W4.A f1488c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1489d;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public B(ArrayList datos, Context context, W4.A listener) {
        AbstractC3159y.i(datos, "datos");
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(listener, "listener");
        this.f1486a = datos;
        this.f1487b = context;
        this.f1488c = listener;
    }

    public final void a(X4.K review) {
        AbstractC3159y.i(review, "review");
        this.f1486a.add(review);
        notifyItemInserted(getItemCount());
    }

    public final ArrayList b() {
        return this.f1486a;
    }

    public final void c(boolean z8) {
        this.f1489d = z8;
        if (z8) {
            notifyItemInserted(getItemCount());
        } else {
            notifyItemRemoved(getItemCount());
        }
    }

    public final void d(X4.K review) {
        AbstractC3159y.i(review, "review");
        Iterator it = this.f1486a.iterator();
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
        this.f1486a.set(i8, review);
        notifyItemChanged(i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f1486a.size() + (this.f1489d ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        if (i8 == this.f1486a.size()) {
            return 2;
        }
        if (((X4.K) this.f1486a.get(i8)).L()) {
            return 1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof C3549h0) {
            Object obj = this.f1486a.get(i8);
            AbstractC3159y.h(obj, "datos[pos]");
            X4.K k8 = (X4.K) obj;
            if (k8.L()) {
                ((C3549h0) viewHolder).f(k8, i8);
            } else {
                ((C3549h0) viewHolder).e(k8, i8);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3159y.i(viewGroup, "viewGroup");
        if (i8 != 1) {
            if (i8 != 2) {
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.review, viewGroup, false);
                AbstractC3159y.h(inflate, "from(viewGroup.context).…review, viewGroup, false)");
                return new C3549h0(inflate, this.f1487b, this.f1488c);
            }
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pb_loading_more_content, viewGroup, false);
            AbstractC3159y.h(inflate2, "from(viewGroup.context).…ontent, viewGroup, false)");
            return new o5.J(inflate2);
        }
        View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.review_turbo, viewGroup, false);
        AbstractC3159y.h(inflate3, "from(viewGroup.context).…_turbo, viewGroup, false)");
        return new C3549h0(inflate3, this.f1487b, this.f1488c);
    }
}
