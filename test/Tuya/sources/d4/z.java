package D4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3159y;
import o5.C3575v;

/* loaded from: classes4.dex */
public final class z extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1831a;

    /* renamed from: b, reason: collision with root package name */
    private final W4.y f1832b;

    /* renamed from: c, reason: collision with root package name */
    private int f1833c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f1834d;

    /* renamed from: e, reason: collision with root package name */
    private final Animation f1835e;

    public z(Context context, W4.y listener) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(listener, "listener");
        this.f1831a = context;
        this.f1832b = listener;
        this.f1834d = new ArrayList();
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.slide_in_bottom);
        AbstractC3159y.h(loadAnimation, "loadAnimation(\n        c…nim.slide_in_bottom\n    )");
        this.f1835e = loadAnimation;
        loadAnimation.setDuration(300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(z this$0, X4.D item, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(item, "$item");
        this$0.f1832b.b(item);
    }

    public final void b(X4.D preRegister) {
        AbstractC3159y.i(preRegister, "preRegister");
        this.f1834d.add(preRegister);
        notifyItemInserted(this.f1834d.size());
    }

    public final void d(X4.D preRegister) {
        AbstractC3159y.i(preRegister, "preRegister");
        Iterator it = this.f1834d.iterator();
        int i8 = 0;
        while (true) {
            if (it.hasNext()) {
                int i9 = i8 + 1;
                if (((X4.D) it.next()).b() == preRegister.b()) {
                    break;
                } else {
                    i8 = i9;
                }
            } else {
                i8 = -1;
                break;
            }
        }
        e(i8);
    }

    public final void e(int i8) {
        if (i8 > -1 && i8 < this.f1834d.size()) {
            this.f1834d.remove(i8);
            this.f1833c--;
            notifyDataSetChanged();
            this.f1832b.a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f1834d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
        Object obj = this.f1834d.get(absoluteAdapterPosition);
        AbstractC3159y.h(obj, "data[pos]");
        final X4.D d8 = (X4.D) obj;
        if (viewHolder instanceof C3575v) {
            C3575v c3575v = (C3575v) viewHolder;
            c3575v.d().setText(d8.d());
            com.squareup.picasso.s.h().l(d8.c()).l(R.drawable.shape_bg_placeholder).n(UptodownApp.f28003B.f0(this.f1831a)).i(c3575v.a());
            c3575v.b().setText(this.f1831a.getString(R.string.preregister_available_to_download));
            c3575v.c().setText(this.f1831a.getString(R.string.updates_button_download_app));
        }
        if (absoluteAdapterPosition > this.f1833c) {
            viewHolder.itemView.startAnimation(this.f1835e);
            this.f1833c = absoluteAdapterPosition;
        }
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: D4.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z.c(z.this, d8, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3159y.i(viewGroup, "viewGroup");
        View itemView = LayoutInflater.from(this.f1831a).inflate(R.layout.floating_notification, viewGroup, false);
        AbstractC3159y.h(itemView, "itemView");
        return new C3575v(itemView);
    }
}
