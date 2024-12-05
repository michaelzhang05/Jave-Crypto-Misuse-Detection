package D4;

import D4.C1103l;
import E4.j;
import W4.InterfaceC1478a;
import X4.C1498h;
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
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: D4.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1103l extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private final W4.s f1719a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1478a f1720b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f1721c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f1722d;

    /* renamed from: D4.l$a */
    /* loaded from: classes4.dex */
    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        private W4.s f1723a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC1478a f1724b;

        /* renamed from: c, reason: collision with root package name */
        private Context f1725c;

        /* renamed from: d, reason: collision with root package name */
        private final ImageView f1726d;

        /* renamed from: e, reason: collision with root package name */
        private final TextView f1727e;

        /* renamed from: f, reason: collision with root package name */
        private final TextView f1728f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C1103l f1729g;

        /* renamed from: D4.l$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0031a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f1730a;

            static {
                int[] iArr = new int[C1498h.c.values().length];
                try {
                    iArr[C1498h.c.TRENDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[C1498h.c.LATEST.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[C1498h.c.UPDATE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[C1498h.c.PROMOTED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[C1498h.c.EDITOR_CHOICE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f1730a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1103l c1103l, View view, W4.s sVar, InterfaceC1478a actionsClickListener, Context context) {
            super(view);
            AbstractC3159y.i(view, "view");
            AbstractC3159y.i(actionsClickListener, "actionsClickListener");
            AbstractC3159y.i(context, "context");
            this.f1729g = c1103l;
            this.f1723a = sVar;
            this.f1724b = actionsClickListener;
            this.f1725c = context;
            this.f1726d = (ImageView) view.findViewById(R.id.iv_feature_home);
            TextView textView = (TextView) view.findViewById(R.id.tv_tag_feature_home);
            this.f1727e = textView;
            TextView textView2 = (TextView) view.findViewById(R.id.tv_name_feature_home);
            this.f1728f = textView2;
            j.a aVar = E4.j.f2274g;
            textView.setTypeface(aVar.t());
            textView2.setTypeface(aVar.t());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(a this$0, C1498h appInfo, View view) {
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(appInfo, "$appInfo");
            if (this$0.f1723a != null && this$0.getBindingAdapterPosition() != -1) {
                W4.s sVar = this$0.f1723a;
                AbstractC3159y.f(sVar);
                sVar.b(appInfo);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean e(a this$0, C1498h appInfo, int i8, View view) {
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(appInfo, "$appInfo");
            this$0.f1724b.a(appInfo, i8);
            return true;
        }

        private final void f() {
            this.f1727e.setBackground(ContextCompat.getDrawable(this.f1725c, R.drawable.bg_dev_on_board));
            this.f1727e.setTextColor(ContextCompat.getColor(this.f1725c, R.color.main_dark_grey));
        }

        private final void g() {
            this.f1727e.setBackground(ContextCompat.getDrawable(this.f1725c, R.drawable.shape_bg_tag_latest));
        }

        private final void h() {
            this.f1727e.setBackground(ContextCompat.getDrawable(this.f1725c, R.drawable.shape_bg_tag_promoted));
        }

        private final void i() {
            this.f1727e.setBackground(ContextCompat.getDrawable(this.f1725c, R.drawable.shape_bg_tag_trending));
        }

        private final void j() {
            this.f1727e.setBackground(ContextCompat.getDrawable(this.f1725c, R.drawable.shape_bg_accent_green));
        }

        public final void c(final C1498h appInfo, final int i8) {
            AbstractC3159y.i(appInfo, "appInfo");
            UptodownApp.a aVar = UptodownApp.f28003B;
            int H8 = aVar.H();
            int dimension = (int) this.f1725c.getResources().getDimension(R.dimen.margin_s);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(H8, -2);
            layoutParams.setMargins(dimension, 0, dimension, 0);
            this.itemView.setLayoutParams(layoutParams);
            if (appInfo.a1() != C1498h.c.NONE) {
                this.f1727e.setText(appInfo.Z0());
                this.f1727e.setVisibility(0);
                this.f1727e.setTextColor(ContextCompat.getColor(this.f1725c, R.color.white));
                int i9 = C0031a.f1730a[appInfo.a1().ordinal()];
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
            this.f1728f.setText(appInfo.s0());
            this.f1726d.setLayoutParams(new RelativeLayout.LayoutParams(-1, aVar.z()));
            com.squareup.picasso.s.h().l(appInfo.d0()).f().n(aVar.e0(this.f1725c)).i(this.f1726d);
            this.f1726d.setOnClickListener(new View.OnClickListener() { // from class: D4.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1103l.a.d(C1103l.a.this, appInfo, view);
                }
            });
            this.f1726d.setOnLongClickListener(new View.OnLongClickListener() { // from class: D4.k
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean e8;
                    e8 = C1103l.a.e(C1103l.a.this, appInfo, i8, view);
                    return e8;
                }
            });
        }
    }

    public C1103l(W4.s sVar, InterfaceC1478a actionsClickListener, Context context) {
        AbstractC3159y.i(actionsClickListener, "actionsClickListener");
        AbstractC3159y.i(context, "context");
        this.f1719a = sVar;
        this.f1720b = actionsClickListener;
        this.f1721c = context;
        this.f1722d = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int i8) {
        AbstractC3159y.i(holder, "holder");
        int size = i8 % this.f1722d.size();
        Object obj = this.f1722d.get(size);
        AbstractC3159y.h(obj, "apps[realPosition]");
        holder.c((C1498h) obj, size);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3159y.i(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_fragment_header_image, parent, false);
        AbstractC3159y.h(view, "view");
        return new a(this, view, this.f1719a, this.f1720b, this.f1721c);
    }

    public final void c(ArrayList headerPrograms) {
        AbstractC3159y.i(headerPrograms, "headerPrograms");
        ArrayList arrayList = this.f1722d;
        arrayList.clear();
        arrayList.addAll(headerPrograms);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f1722d.size() * 100;
    }
}
