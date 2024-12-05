package G4;

import P5.AbstractC1378t;
import Z4.InterfaceC1598l;
import a5.C1648o;
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
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import r5.C3967w;

/* renamed from: G4.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1198h extends RecyclerView.Adapter {

    /* renamed from: j, reason: collision with root package name */
    public static final a f3223j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f3224a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1598l f3225b;

    /* renamed from: c, reason: collision with root package name */
    private int f3226c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f3227d;

    /* renamed from: e, reason: collision with root package name */
    private final Animation f3228e;

    /* renamed from: f, reason: collision with root package name */
    private final Animation f3229f;

    /* renamed from: g, reason: collision with root package name */
    private Handler f3230g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f3231h;

    /* renamed from: i, reason: collision with root package name */
    private final c f3232i;

    /* renamed from: G4.h$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: G4.h$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private C1648o f3233a;

        /* renamed from: b, reason: collision with root package name */
        private int f3234b;

        public b(C1648o download, int i8) {
            AbstractC3255y.i(download, "download");
            this.f3233a = download;
            this.f3234b = i8;
        }

        public final C1648o a() {
            return this.f3233a;
        }

        public final int b() {
            return this.f3234b;
        }

        public final void c(C1648o c1648o) {
            AbstractC3255y.i(c1648o, "<set-?>");
            this.f3233a = c1648o;
        }

        public final void d(int i8) {
            this.f3234b = i8;
        }
    }

    /* renamed from: G4.h$c */
    /* loaded from: classes4.dex */
    public static final class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1198h.this.f().size() == 1) {
                C1198h.this.f3231h = false;
            } else {
                C1198h c1198h = C1198h.this;
                c1198h.f3231h = true ^ c1198h.f3231h;
            }
            C1198h.this.notifyItemChanged(0);
            Handler handler = C1198h.this.f3230g;
            if (handler != null) {
                handler.postDelayed(this, 5000L);
            }
        }
    }

    public C1198h(Context context, InterfaceC1598l listener) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(listener, "listener");
        this.f3224a = context;
        this.f3225b = listener;
        this.f3227d = new ArrayList();
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.slide_back_in);
        AbstractC3255y.h(loadAnimation, "loadAnimation(context, R.anim.slide_back_in)");
        this.f3228e = loadAnimation;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.slide_in_bottom);
        AbstractC3255y.h(loadAnimation2, "loadAnimation(context, R.anim.slide_in_bottom)");
        this.f3229f = loadAnimation2;
        this.f3232i = new c();
        loadAnimation.setDuration(300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(C1198h this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.f3225b.a();
    }

    public final void e(C1648o download) {
        AbstractC3255y.i(download, "download");
        this.f3227d.add(new b(download, -1));
        if (this.f3227d.size() > 1) {
            this.f3231h = true;
        }
    }

    public final ArrayList f() {
        return this.f3227d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.f3227d.size() >= 1) {
            return 1;
        }
        return 0;
    }

    public final void h(C1648o download) {
        AbstractC3255y.i(download, "download");
        Iterator it = this.f3227d.iterator();
        int i8 = 0;
        while (true) {
            if (it.hasNext()) {
                int i9 = i8 + 1;
                b bVar = (b) it.next();
                if (bVar.a().y() == download.y() || (AbstractC3255y.d(bVar.a().Y(), download.Y()) && bVar.a().e0() == download.e0())) {
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
            this.f3227d.remove(i8);
            this.f3226c--;
            if (this.f3227d.size() > 1) {
                this.f3231h = true;
            }
        }
    }

    public final void i(ArrayList downloadsInQueue) {
        AbstractC3255y.i(downloadsInQueue, "downloadsInQueue");
        this.f3227d.clear();
        Iterator it = downloadsInQueue.iterator();
        while (it.hasNext()) {
            C1648o d8 = (C1648o) it.next();
            AbstractC3255y.h(d8, "d");
            this.f3227d.add(new b(d8, -1));
        }
        notifyDataSetChanged();
    }

    public final void j(C1648o c1648o, int i8) {
        if (c1648o != null && (!this.f3227d.isEmpty())) {
            ((b) AbstractC1378t.m0(this.f3227d)).c(c1648o);
            ((b) AbstractC1378t.m0(this.f3227d)).d(i8);
            notifyItemChanged(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3255y.i(viewHolder, "viewHolder");
        Object obj = this.f3227d.get(viewHolder.getAbsoluteAdapterPosition());
        AbstractC3255y.h(obj, "data[pos]");
        b bVar = (b) obj;
        if (viewHolder instanceof C3967w) {
            C3967w c3967w = (C3967w) viewHolder;
            c3967w.c().setText(String.valueOf(this.f3227d.size()));
            if (this.f3231h) {
                if (c3967w.c().getVisibility() != 0) {
                    c3967w.c().setVisibility(0);
                    c3967w.a().setVisibility(8);
                    c3967w.c().startAnimation(this.f3229f);
                }
            } else if (c3967w.a().getVisibility() != 0) {
                c3967w.c().setVisibility(8);
                c3967w.a().setVisibility(0);
                c3967w.a().startAnimation(this.f3229f);
            }
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: G4.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1198h.g(C1198h.this, view);
                }
            });
            int b8 = bVar.b();
            if (b8 != 199 && b8 != 200 && b8 != 205) {
                c3967w.b().setIndeterminate(false);
                int Z7 = bVar.a().Z();
                if (1 <= Z7 && Z7 < 101) {
                    c3967w.b().setProgress(bVar.a().Z());
                }
            } else {
                c3967w.b().setIndeterminate(true);
            }
            if (this.f3230g == null) {
                Handler handler = new Handler(Looper.getMainLooper());
                this.f3230g = handler;
                handler.postDelayed(this.f3232i, 5000L);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3255y.i(viewGroup, "viewGroup");
        View itemView = LayoutInflater.from(this.f3224a).inflate(R.layout.floating_queue_item, viewGroup, false);
        AbstractC3255y.h(itemView, "itemView");
        return new C3967w(itemView);
    }
}
