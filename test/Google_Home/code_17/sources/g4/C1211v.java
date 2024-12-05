package G4;

import a5.C1639f;
import a5.C1641h;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import r5.C3969x;
import r5.W;

/* renamed from: G4.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1211v extends RecyclerView.Adapter {

    /* renamed from: g, reason: collision with root package name */
    public static final a f3333g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private C1641h f3334a;

    /* renamed from: b, reason: collision with root package name */
    private C1639f f3335b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f3336c;

    /* renamed from: d, reason: collision with root package name */
    private final Z4.w f3337d;

    /* renamed from: e, reason: collision with root package name */
    private final int f3338e;

    /* renamed from: f, reason: collision with root package name */
    private int f3339f;

    /* renamed from: G4.v$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C1211v(C1641h appInfo, C1639f c1639f, Context context, Z4.w listener, int i8) {
        AbstractC3255y.i(appInfo, "appInfo");
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(listener, "listener");
        this.f3334a = appInfo;
        this.f3335b = c1639f;
        this.f3336c = context;
        this.f3337d = listener;
        this.f3338e = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C1211v this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.f3337d.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C1211v this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.f3337d.f();
    }

    public final void e(C1639f c1639f) {
        this.f3335b = c1639f;
    }

    public final void f(ArrayList arrayList) {
        this.f3334a.y1(arrayList);
    }

    public final void g(int i8) {
        this.f3339f = i8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList w02 = this.f3334a.w0();
        AbstractC3255y.f(w02);
        return w02.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        if (i8 == 0) {
            return 0;
        }
        ArrayList w02 = this.f3334a.w0();
        AbstractC3255y.f(w02);
        if (i8 < w02.size()) {
            return 1;
        }
        return 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3255y.i(viewHolder, "viewHolder");
        if (viewHolder instanceof C3969x) {
            C1639f c1639f = this.f3335b;
            if (c1639f != null) {
                ((C3969x) viewHolder).a(c1639f);
                return;
            } else {
                ((C3969x) viewHolder).b(this.f3334a);
                return;
            }
        }
        if (viewHolder instanceof W) {
            ((W) viewHolder).h(this.f3334a, this.f3335b, i8);
            return;
        }
        if (viewHolder instanceof r5.I) {
            if (this.f3338e > 20) {
                r5.I i9 = (r5.I) viewHolder;
                i9.a().setOnClickListener(new View.OnClickListener() { // from class: G4.t
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C1211v.c(C1211v.this, view);
                    }
                });
                i9.b().setOnClickListener(new View.OnClickListener() { // from class: G4.u
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C1211v.d(C1211v.this, view);
                    }
                });
                if (this.f3339f <= 0) {
                    i9.a().setVisibility(4);
                } else {
                    i9.a().setVisibility(0);
                }
                int i10 = this.f3339f + 1;
                ArrayList w02 = this.f3334a.w0();
                AbstractC3255y.f(w02);
                if (w02.size() >= 20 && i10 * 20 != this.f3338e - 1) {
                    i9.b().setVisibility(0);
                } else {
                    i9.b().setVisibility(4);
                }
                i9.d().setText(String.valueOf(i10));
                return;
            }
            ((r5.I) viewHolder).c().setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3255y.i(viewGroup, "viewGroup");
        if (i8 != 0) {
            if (i8 != 1) {
                View itemView = LayoutInflater.from(this.f3336c).inflate(R.layout.load_more_versions, viewGroup, false);
                AbstractC3255y.h(itemView, "itemView");
                return new r5.I(itemView);
            }
            View itemView2 = LayoutInflater.from(this.f3336c).inflate(R.layout.old_version_item, viewGroup, false);
            AbstractC3255y.h(itemView2, "itemView");
            return new W(itemView2, this.f3337d);
        }
        View itemView3 = LayoutInflater.from(this.f3336c).inflate(R.layout.header_installed_app, viewGroup, false);
        AbstractC3255y.h(itemView3, "itemView");
        return new C3969x(itemView3, this.f3336c);
    }
}
