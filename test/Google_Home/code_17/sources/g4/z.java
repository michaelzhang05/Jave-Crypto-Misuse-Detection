package G4;

import a5.C1632D;
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
import kotlin.jvm.internal.AbstractC3255y;
import r5.C3965v;

/* loaded from: classes4.dex */
public final class z extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3373a;

    /* renamed from: b, reason: collision with root package name */
    private final Z4.y f3374b;

    /* renamed from: c, reason: collision with root package name */
    private int f3375c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f3376d;

    /* renamed from: e, reason: collision with root package name */
    private final Animation f3377e;

    public z(Context context, Z4.y listener) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(listener, "listener");
        this.f3373a = context;
        this.f3374b = listener;
        this.f3376d = new ArrayList();
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.slide_in_bottom);
        AbstractC3255y.h(loadAnimation, "loadAnimation(\n        c…nim.slide_in_bottom\n    )");
        this.f3377e = loadAnimation;
        loadAnimation.setDuration(300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(z this$0, C1632D item, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(item, "$item");
        this$0.f3374b.b(item);
    }

    public final void b(C1632D preRegister) {
        AbstractC3255y.i(preRegister, "preRegister");
        this.f3376d.add(preRegister);
        notifyItemInserted(this.f3376d.size());
    }

    public final void d(C1632D preRegister) {
        AbstractC3255y.i(preRegister, "preRegister");
        Iterator it = this.f3376d.iterator();
        int i8 = 0;
        while (true) {
            if (it.hasNext()) {
                int i9 = i8 + 1;
                if (((C1632D) it.next()).b() == preRegister.b()) {
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
        if (i8 > -1 && i8 < this.f3376d.size()) {
            this.f3376d.remove(i8);
            this.f3375c--;
            notifyDataSetChanged();
            this.f3374b.a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3376d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3255y.i(viewHolder, "viewHolder");
        int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
        Object obj = this.f3376d.get(absoluteAdapterPosition);
        AbstractC3255y.h(obj, "data[pos]");
        final C1632D c1632d = (C1632D) obj;
        if (viewHolder instanceof C3965v) {
            C3965v c3965v = (C3965v) viewHolder;
            c3965v.d().setText(c1632d.d());
            com.squareup.picasso.s.h().l(c1632d.c()).l(R.drawable.shape_bg_placeholder).n(UptodownApp.f29058B.f0(this.f3373a)).i(c3965v.a());
            c3965v.b().setText(this.f3373a.getString(R.string.preregister_available_to_download));
            c3965v.c().setText(this.f3373a.getString(R.string.updates_button_download_app));
        }
        if (absoluteAdapterPosition > this.f3375c) {
            viewHolder.itemView.startAnimation(this.f3377e);
            this.f3375c = absoluteAdapterPosition;
        }
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: G4.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z.c(z.this, c1632d, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3255y.i(viewGroup, "viewGroup");
        View itemView = LayoutInflater.from(this.f3373a).inflate(R.layout.floating_notification, viewGroup, false);
        AbstractC3255y.h(itemView, "itemView");
        return new C3965v(itemView);
    }
}
