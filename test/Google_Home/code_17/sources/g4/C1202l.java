package G4;

import G4.C1202l;
import H4.j;
import Z4.InterfaceC1587a;
import a5.C1641h;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: G4.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1202l extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private final Z4.s f3261a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1587a f3262b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f3263c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f3264d;

    /* renamed from: G4.l$a */
    /* loaded from: classes4.dex */
    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        private Z4.s f3265a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC1587a f3266b;

        /* renamed from: c, reason: collision with root package name */
        private Context f3267c;

        /* renamed from: d, reason: collision with root package name */
        private final ImageView f3268d;

        /* renamed from: e, reason: collision with root package name */
        private final TextView f3269e;

        /* renamed from: f, reason: collision with root package name */
        private final TextView f3270f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C1202l f3271g;

        /* renamed from: G4.l$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0056a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f3272a;

            static {
                int[] iArr = new int[C1641h.c.values().length];
                try {
                    iArr[C1641h.c.TRENDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[C1641h.c.LATEST.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[C1641h.c.UPDATE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[C1641h.c.PROMOTED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[C1641h.c.EDITOR_CHOICE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f3272a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1202l c1202l, View view, Z4.s sVar, InterfaceC1587a actionsClickListener, Context context) {
            super(view);
            AbstractC3255y.i(view, "view");
            AbstractC3255y.i(actionsClickListener, "actionsClickListener");
            AbstractC3255y.i(context, "context");
            this.f3271g = c1202l;
            this.f3265a = sVar;
            this.f3266b = actionsClickListener;
            this.f3267c = context;
            this.f3268d = (ImageView) view.findViewById(R.id.iv_feature_home);
            TextView textView = (TextView) view.findViewById(R.id.tv_tag_feature_home);
            this.f3269e = textView;
            TextView textView2 = (TextView) view.findViewById(R.id.tv_name_feature_home);
            this.f3270f = textView2;
            j.a aVar = H4.j.f3824g;
            textView.setTypeface(aVar.t());
            textView2.setTypeface(aVar.t());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(a this$0, C1641h appInfo, View view) {
            AbstractC3255y.i(this$0, "this$0");
            AbstractC3255y.i(appInfo, "$appInfo");
            if (this$0.f3265a != null && this$0.getBindingAdapterPosition() != -1) {
                Z4.s sVar = this$0.f3265a;
                AbstractC3255y.f(sVar);
                sVar.b(appInfo);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean e(a this$0, C1641h appInfo, int i8, View view) {
            AbstractC3255y.i(this$0, "this$0");
            AbstractC3255y.i(appInfo, "$appInfo");
            this$0.f3266b.a(appInfo, i8);
            return true;
        }

        private final void f() {
            this.f3269e.setBackground(ContextCompat.getDrawable(this.f3267c, R.drawable.bg_dev_on_board));
            this.f3269e.setTextColor(ContextCompat.getColor(this.f3267c, R.color.main_dark_grey));
        }

        private final void g() {
            this.f3269e.setBackground(ContextCompat.getDrawable(this.f3267c, R.drawable.shape_bg_tag_latest));
        }

        private final void h() {
            this.f3269e.setBackground(ContextCompat.getDrawable(this.f3267c, R.drawable.shape_bg_tag_promoted));
        }

        private final void i() {
            this.f3269e.setBackground(ContextCompat.getDrawable(this.f3267c, R.drawable.shape_bg_tag_trending));
        }

        private final void j() {
            this.f3269e.setBackground(ContextCompat.getDrawable(this.f3267c, R.drawable.shape_bg_accent_green));
        }

        public final void c(final C1641h appInfo, final int i8) {
            AbstractC3255y.i(appInfo, "appInfo");
            UptodownApp.a aVar = UptodownApp.f29058B;
            int H8 = aVar.H();
            int dimension = (int) this.f3267c.getResources().getDimension(R.dimen.margin_s);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(H8, -2);
            layoutParams.setMargins(dimension, 0, dimension, 0);
            this.itemView.setLayoutParams(layoutParams);
            if (appInfo.a1() != C1641h.c.NONE) {
                this.f3269e.setText(appInfo.Z0());
                this.f3269e.setVisibility(0);
                this.f3269e.setTextColor(ContextCompat.getColor(this.f3267c, R.color.white));
                int i9 = C0056a.f3272a[appInfo.a1().ordinal()];
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            if (i9 != 4) {
                                if (i9 == 5) {
                                    f();
                                }
                            } else {
                                h();
                            }
                        } else {
                            j();
                        }
                    } else {
                        g();
                    }
                } else {
                    i();
                }
            }
            this.f3270f.setText(appInfo.s0());
            this.f3268d.setLayoutParams(new RelativeLayout.LayoutParams(-1, aVar.z()));
            com.squareup.picasso.s.h().l(appInfo.d0()).f().n(aVar.e0(this.f3267c)).i(this.f3268d);
            this.f3268d.setOnClickListener(new View.OnClickListener() { // from class: G4.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1202l.a.d(C1202l.a.this, appInfo, view);
                }
            });
            this.f3268d.setOnLongClickListener(new View.OnLongClickListener() { // from class: G4.k
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean e8;
                    e8 = C1202l.a.e(C1202l.a.this, appInfo, i8, view);
                    return e8;
                }
            });
        }
    }

    public C1202l(Z4.s sVar, InterfaceC1587a actionsClickListener, Context context) {
        AbstractC3255y.i(actionsClickListener, "actionsClickListener");
        AbstractC3255y.i(context, "context");
        this.f3261a = sVar;
        this.f3262b = actionsClickListener;
        this.f3263c = context;
        this.f3264d = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int i8) {
        AbstractC3255y.i(holder, "holder");
        int size = i8 % this.f3264d.size();
        Object obj = this.f3264d.get(size);
        AbstractC3255y.h(obj, "apps[realPosition]");
        holder.c((C1641h) obj, size);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3255y.i(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_fragment_header_image, parent, false);
        AbstractC3255y.h(view, "view");
        return new a(this, view, this.f3261a, this.f3262b, this.f3263c);
    }

    public final void c(ArrayList headerPrograms) {
        AbstractC3255y.i(headerPrograms, "headerPrograms");
        ArrayList arrayList = this.f3264d;
        arrayList.clear();
        arrayList.addAll(headerPrograms);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3264d.size() * 100;
    }
}
