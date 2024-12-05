package D4;

import M5.AbstractC1246t;
import W4.InterfaceC1489l;
import X4.C1505o;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import o5.C3577w;

/* renamed from: D4.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1099h extends RecyclerView.Adapter {

    /* renamed from: j, reason: collision with root package name */
    public static final a f1681j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f1682a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1489l f1683b;

    /* renamed from: c, reason: collision with root package name */
    private int f1684c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f1685d;

    /* renamed from: e, reason: collision with root package name */
    private final Animation f1686e;

    /* renamed from: f, reason: collision with root package name */
    private final Animation f1687f;

    /* renamed from: g, reason: collision with root package name */
    private Handler f1688g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1689h;

    /* renamed from: i, reason: collision with root package name */
    private final c f1690i;

    /* renamed from: D4.h$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: D4.h$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private C1505o f1691a;

        /* renamed from: b, reason: collision with root package name */
        private int f1692b;

        public b(C1505o download, int i8) {
            AbstractC3159y.i(download, "download");
            this.f1691a = download;
            this.f1692b = i8;
        }

        public final C1505o a() {
            return this.f1691a;
        }

        public final int b() {
            return this.f1692b;
        }

        public final void c(C1505o c1505o) {
            AbstractC3159y.i(c1505o, "<set-?>");
            this.f1691a = c1505o;
        }

        public final void d(int i8) {
            this.f1692b = i8;
        }
    }

    /* renamed from: D4.h$c */
    /* loaded from: classes4.dex */
    public static final class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1099h.this.f().size() == 1) {
                C1099h.this.f1689h = false;
            } else {
                C1099h c1099h = C1099h.this;
                c1099h.f1689h = true ^ c1099h.f1689h;
            }
            C1099h.this.notifyItemChanged(0);
            Handler handler = C1099h.this.f1688g;
            if (handler != null) {
                handler.postDelayed(this, 5000L);
            }
        }
    }

    public C1099h(Context context, InterfaceC1489l listener) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(listener, "listener");
        this.f1682a = context;
        this.f1683b = listener;
        this.f1685d = new ArrayList();
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.slide_back_in);
        AbstractC3159y.h(loadAnimation, "loadAnimation(context, R.anim.slide_back_in)");
        this.f1686e = loadAnimation;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.slide_in_bottom);
        AbstractC3159y.h(loadAnimation2, "loadAnimation(context, R.anim.slide_in_bottom)");
        this.f1687f = loadAnimation2;
        this.f1690i = new c();
        loadAnimation.setDuration(300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(C1099h this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.f1683b.a();
    }

    public final void e(C1505o download) {
        AbstractC3159y.i(download, "download");
        this.f1685d.add(new b(download, -1));
        if (this.f1685d.size() > 1) {
            this.f1689h = true;
        }
    }

    public final ArrayList f() {
        return this.f1685d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.f1685d.size() >= 1) {
            return 1;
        }
        return 0;
    }

    public final void h(C1505o download) {
        AbstractC3159y.i(download, "download");
        Iterator it = this.f1685d.iterator();
        int i8 = 0;
        while (true) {
            if (it.hasNext()) {
                int i9 = i8 + 1;
                b bVar = (b) it.next();
                if (bVar.a().G() == download.G() || (AbstractC3159y.d(bVar.a().Y(), download.Y()) && bVar.a().e0() == download.e0())) {
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
            this.f1685d.remove(i8);
            this.f1684c--;
            if (this.f1685d.size() > 1) {
                this.f1689h = true;
            }
        }
    }

    public final void i(ArrayList downloadsInQueue) {
        AbstractC3159y.i(downloadsInQueue, "downloadsInQueue");
        this.f1685d.clear();
        Iterator it = downloadsInQueue.iterator();
        while (it.hasNext()) {
            C1505o d8 = (C1505o) it.next();
            AbstractC3159y.h(d8, "d");
            this.f1685d.add(new b(d8, -1));
        }
        notifyDataSetChanged();
    }

    public final void j(C1505o c1505o, int i8) {
        if (c1505o != null && (!this.f1685d.isEmpty())) {
            ((b) AbstractC1246t.m0(this.f1685d)).c(c1505o);
            ((b) AbstractC1246t.m0(this.f1685d)).d(i8);
            notifyItemChanged(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        Object obj = this.f1685d.get(viewHolder.getAbsoluteAdapterPosition());
        AbstractC3159y.h(obj, "data[pos]");
        b bVar = (b) obj;
        if (viewHolder instanceof C3577w) {
            C3577w c3577w = (C3577w) viewHolder;
            c3577w.c().setText(String.valueOf(this.f1685d.size()));
            if (this.f1689h) {
                if (c3577w.c().getVisibility() != 0) {
                    c3577w.c().setVisibility(0);
                    c3577w.a().setVisibility(8);
                    c3577w.c().startAnimation(this.f1687f);
                }
            } else if (c3577w.a().getVisibility() != 0) {
                c3577w.c().setVisibility(8);
                c3577w.a().setVisibility(0);
                c3577w.a().startAnimation(this.f1687f);
            }
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: D4.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1099h.g(C1099h.this, view);
                }
            });
            int b8 = bVar.b();
            if (b8 != 199 && b8 != 200 && b8 != 205) {
                c3577w.b().setIndeterminate(false);
                int Z7 = bVar.a().Z();
                if (1 <= Z7 && Z7 < 101) {
                    c3577w.b().setProgress(bVar.a().Z());
                }
            } else {
                c3577w.b().setIndeterminate(true);
            }
            if (this.f1688g == null) {
                Handler handler = new Handler(Looper.getMainLooper());
                this.f1688g = handler;
                handler.postDelayed(this.f1690i, 5000L);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3159y.i(viewGroup, "viewGroup");
        View itemView = LayoutInflater.from(this.f1682a).inflate(R.layout.floating_queue_item, viewGroup, false);
        AbstractC3159y.h(itemView, "itemView");
        return new C3577w(itemView);
    }
}
