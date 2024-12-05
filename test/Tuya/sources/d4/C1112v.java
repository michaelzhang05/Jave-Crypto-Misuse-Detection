package D4;

import X4.C1496f;
import X4.C1498h;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import o5.C3579x;
import o5.W;

/* renamed from: D4.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1112v extends RecyclerView.Adapter {

    /* renamed from: g, reason: collision with root package name */
    public static final a f1791g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private C1498h f1792a;

    /* renamed from: b, reason: collision with root package name */
    private C1496f f1793b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f1794c;

    /* renamed from: d, reason: collision with root package name */
    private final W4.w f1795d;

    /* renamed from: e, reason: collision with root package name */
    private final int f1796e;

    /* renamed from: f, reason: collision with root package name */
    private int f1797f;

    /* renamed from: D4.v$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C1112v(C1498h appInfo, C1496f c1496f, Context context, W4.w listener, int i8) {
        AbstractC3159y.i(appInfo, "appInfo");
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(listener, "listener");
        this.f1792a = appInfo;
        this.f1793b = c1496f;
        this.f1794c = context;
        this.f1795d = listener;
        this.f1796e = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C1112v this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.f1795d.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C1112v this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.f1795d.f();
    }

    public final void e(C1496f c1496f) {
        this.f1793b = c1496f;
    }

    public final void f(ArrayList arrayList) {
        this.f1792a.y1(arrayList);
    }

    public final void g(int i8) {
        this.f1797f = i8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList w02 = this.f1792a.w0();
        AbstractC3159y.f(w02);
        return w02.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        if (i8 == 0) {
            return 0;
        }
        ArrayList w02 = this.f1792a.w0();
        AbstractC3159y.f(w02);
        if (i8 < w02.size()) {
            return 1;
        }
        return 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof C3579x) {
            C1496f c1496f = this.f1793b;
            if (c1496f != null) {
                ((C3579x) viewHolder).a(c1496f);
                return;
            } else {
                ((C3579x) viewHolder).b(this.f1792a);
                return;
            }
        }
        if (viewHolder instanceof W) {
            ((W) viewHolder).h(this.f1792a, this.f1793b, i8);
            return;
        }
        if (viewHolder instanceof o5.I) {
            if (this.f1796e > 20) {
                o5.I i9 = (o5.I) viewHolder;
                i9.a().setOnClickListener(new View.OnClickListener() { // from class: D4.t
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C1112v.c(C1112v.this, view);
                    }
                });
                i9.b().setOnClickListener(new View.OnClickListener() { // from class: D4.u
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C1112v.d(C1112v.this, view);
                    }
                });
                if (this.f1797f <= 0) {
                    i9.a().setVisibility(4);
                } else {
                    i9.a().setVisibility(0);
                }
                int i10 = this.f1797f + 1;
                ArrayList w02 = this.f1792a.w0();
                AbstractC3159y.f(w02);
                if (w02.size() >= 20 && i10 * 20 != this.f1796e - 1) {
                    i9.b().setVisibility(0);
                } else {
                    i9.b().setVisibility(4);
                }
                i9.d().setText(String.valueOf(i10));
                return;
            }
            ((o5.I) viewHolder).c().setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3159y.i(viewGroup, "viewGroup");
        if (i8 != 0) {
            if (i8 != 1) {
                View itemView = LayoutInflater.from(this.f1794c).inflate(R.layout.load_more_versions, viewGroup, false);
                AbstractC3159y.h(itemView, "itemView");
                return new o5.I(itemView);
            }
            View itemView2 = LayoutInflater.from(this.f1794c).inflate(R.layout.old_version_item, viewGroup, false);
            AbstractC3159y.h(itemView2, "itemView");
            return new W(itemView2, this.f1795d);
        }
        View itemView3 = LayoutInflater.from(this.f1794c).inflate(R.layout.header_installed_app, viewGroup, false);
        AbstractC3159y.h(itemView3, "itemView");
        return new C3579x(itemView3, this.f1794c);
    }
}
