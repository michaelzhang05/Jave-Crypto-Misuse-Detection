package D4;

import N4.w;
import W4.InterfaceC1488k;
import X4.C1505o;
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
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3307A;
import o5.C3575v;

/* renamed from: D4.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1097f extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1673a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1488k f1674b;

    /* renamed from: c, reason: collision with root package name */
    private int f1675c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f1676d;

    /* renamed from: e, reason: collision with root package name */
    private final Animation f1677e;

    /* renamed from: D4.f$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private File f1678a;

        /* renamed from: b, reason: collision with root package name */
        private C1505o f1679b;

        public a(File file, C1505o download) {
            AbstractC3159y.i(file, "file");
            AbstractC3159y.i(download, "download");
            this.f1678a = file;
            this.f1679b = download;
        }

        public final C1505o a() {
            return this.f1679b;
        }

        public final File b() {
            return this.f1678a;
        }
    }

    public C1097f(Context context, InterfaceC1488k listener) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(listener, "listener");
        this.f1673a = context;
        this.f1674b = listener;
        this.f1676d = new ArrayList();
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.slide_in_bottom);
        AbstractC3159y.h(loadAnimation, "loadAnimation(\n        c…nim.slide_in_bottom\n    )");
        this.f1677e = loadAnimation;
        loadAnimation.setDuration(300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C1097f this$0, a item, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(item, "$item");
        this$0.f1674b.a(item.b());
        this$0.e(item.b());
    }

    public final void b(File file, C1505o download) {
        AbstractC3159y.i(file, "file");
        AbstractC3159y.i(download, "download");
        this.f1676d.add(new a(file, download));
        notifyItemInserted(this.f1676d.size());
    }

    public final int c(File file) {
        AbstractC3159y.i(file, "file");
        Iterator it = this.f1676d.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            int i9 = i8 + 1;
            if (!AbstractC3159y.d(((a) it.next()).b().getAbsolutePath(), file.getAbsolutePath())) {
                i8 = i9;
            } else {
                return i8;
            }
        }
        return -1;
    }

    public final void e(File file) {
        AbstractC3159y.i(file, "file");
        Iterator it = this.f1676d.iterator();
        int i8 = 0;
        while (true) {
            if (it.hasNext()) {
                int i9 = i8 + 1;
                if (AbstractC3159y.d(((a) it.next()).b().getAbsolutePath(), file.getAbsolutePath())) {
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
            this.f1676d.remove(i8);
            this.f1675c--;
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f1676d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
        Object obj = this.f1676d.get(absoluteAdapterPosition);
        AbstractC3159y.h(obj, "data[pos]");
        final a aVar = (a) obj;
        if (viewHolder instanceof C3575v) {
            C3575v c3575v = (C3575v) viewHolder;
            c3575v.d().setText(aVar.a().X());
            String X7 = aVar.a().X();
            AbstractC3159y.f(X7);
            if (g6.n.r(X7, ".apk", false, 2, null)) {
                C3307A c3307a = C3307A.f34473a;
                Context context = this.f1673a;
                String path = aVar.b().getPath();
                AbstractC3159y.h(path, "item.file.path");
                c3575v.a().setImageDrawable(c3307a.l(context, path, R.drawable.core_vector_apk));
            } else {
                w.a aVar2 = N4.w.f7281b;
                String X8 = aVar.a().X();
                AbstractC3159y.f(X8);
                if (aVar2.a(X8)) {
                    c3575v.a().setImageResource(R.drawable.core_vector_xapk);
                }
            }
        }
        if (absoluteAdapterPosition > this.f1675c) {
            viewHolder.itemView.startAnimation(this.f1677e);
            this.f1675c = absoluteAdapterPosition;
        }
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: D4.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1097f.d(C1097f.this, aVar, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3159y.i(viewGroup, "viewGroup");
        View itemView = LayoutInflater.from(this.f1673a).inflate(R.layout.floating_notification, viewGroup, false);
        AbstractC3159y.h(itemView, "itemView");
        return new C3575v(itemView);
    }
}
