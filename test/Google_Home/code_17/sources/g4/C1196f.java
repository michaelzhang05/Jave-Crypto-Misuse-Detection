package G4;

import Q4.w;
import Z4.InterfaceC1597k;
import a5.C1648o;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3655A;
import r5.C3965v;

/* renamed from: G4.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1196f extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3215a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1597k f3216b;

    /* renamed from: c, reason: collision with root package name */
    private int f3217c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f3218d;

    /* renamed from: e, reason: collision with root package name */
    private final Animation f3219e;

    /* renamed from: G4.f$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private File f3220a;

        /* renamed from: b, reason: collision with root package name */
        private C1648o f3221b;

        public a(File file, C1648o download) {
            AbstractC3255y.i(file, "file");
            AbstractC3255y.i(download, "download");
            this.f3220a = file;
            this.f3221b = download;
        }

        public final C1648o a() {
            return this.f3221b;
        }

        public final File b() {
            return this.f3220a;
        }
    }

    public C1196f(Context context, InterfaceC1597k listener) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(listener, "listener");
        this.f3215a = context;
        this.f3216b = listener;
        this.f3218d = new ArrayList();
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.slide_in_bottom);
        AbstractC3255y.h(loadAnimation, "loadAnimation(\n        c…nim.slide_in_bottom\n    )");
        this.f3219e = loadAnimation;
        loadAnimation.setDuration(300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C1196f this$0, a item, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(item, "$item");
        this$0.f3216b.a(item.b());
        this$0.e(item.b());
    }

    public final void b(File file, C1648o download) {
        AbstractC3255y.i(file, "file");
        AbstractC3255y.i(download, "download");
        this.f3218d.add(new a(file, download));
        notifyItemInserted(this.f3218d.size());
    }

    public final int c(File file) {
        AbstractC3255y.i(file, "file");
        Iterator it = this.f3218d.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            int i9 = i8 + 1;
            if (!AbstractC3255y.d(((a) it.next()).b().getAbsolutePath(), file.getAbsolutePath())) {
                i8 = i9;
            } else {
                return i8;
            }
        }
        return -1;
    }

    public final void e(File file) {
        AbstractC3255y.i(file, "file");
        Iterator it = this.f3218d.iterator();
        int i8 = 0;
        while (true) {
            if (it.hasNext()) {
                int i9 = i8 + 1;
                if (AbstractC3255y.d(((a) it.next()).b().getAbsolutePath(), file.getAbsolutePath())) {
                    break;
                } else {
                    i8 = i9;
                }
            } else {
                i8 = -1;
                break;
            }
        }
        if (i8 > -1) {
            this.f3218d.remove(i8);
            this.f3217c--;
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3218d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3255y.i(viewHolder, "viewHolder");
        int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
        Object obj = this.f3218d.get(absoluteAdapterPosition);
        AbstractC3255y.h(obj, "data[pos]");
        final a aVar = (a) obj;
        if (viewHolder instanceof C3965v) {
            C3965v c3965v = (C3965v) viewHolder;
            c3965v.d().setText(aVar.a().X());
            String X7 = aVar.a().X();
            AbstractC3255y.f(X7);
            if (j6.n.r(X7, ".apk", false, 2, null)) {
                C3655A c3655a = C3655A.f36474a;
                Context context = this.f3215a;
                String path = aVar.b().getPath();
                AbstractC3255y.h(path, "item.file.path");
                c3965v.a().setImageDrawable(c3655a.l(context, path, R.drawable.core_vector_apk));
            } else {
                w.a aVar2 = Q4.w.f9241b;
                String X8 = aVar.a().X();
                AbstractC3255y.f(X8);
                if (aVar2.a(X8)) {
                    c3965v.a().setImageResource(R.drawable.core_vector_xapk);
                }
            }
        }
        if (absoluteAdapterPosition > this.f3217c) {
            viewHolder.itemView.startAnimation(this.f3219e);
            this.f3217c = absoluteAdapterPosition;
        }
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: G4.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1196f.d(C1196f.this, aVar, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3255y.i(viewGroup, "viewGroup");
        View itemView = LayoutInflater.from(this.f3215a).inflate(R.layout.floating_notification, viewGroup, false);
        AbstractC3255y.h(itemView, "itemView");
        return new C3965v(itemView);
    }
}
