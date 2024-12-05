package k5;

import E4.j;
import X4.C1498h;
import X4.F;
import X4.L;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.leanback.widget.Presenter;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.squareup.picasso.s;
import com.uptodown.R;
import com.uptodown.activities.Gallery;
import com.uptodown.tv.utils.FullWidthImageViewTv;
import j5.C3089b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.Y;

/* renamed from: k5.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3131e extends Presenter.ViewHolder {

    /* renamed from: l, reason: collision with root package name */
    public static final a f33521l = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final TextView f33522a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f33523b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f33524c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f33525d;

    /* renamed from: e, reason: collision with root package name */
    private final TextView f33526e;

    /* renamed from: f, reason: collision with root package name */
    private final TextView f33527f;

    /* renamed from: g, reason: collision with root package name */
    private final ProgressBar f33528g;

    /* renamed from: h, reason: collision with root package name */
    private final LinearLayout f33529h;

    /* renamed from: i, reason: collision with root package name */
    private final LinearLayout f33530i;

    /* renamed from: j, reason: collision with root package name */
    private final RelativeLayout f33531j;

    /* renamed from: k, reason: collision with root package name */
    private final TextView f33532k;

    /* renamed from: k5.e$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3131e(View view) {
        super(view);
        AbstractC3159y.i(view, "view");
        View findViewById = view.findViewById(R.id.tv_name);
        AbstractC3159y.h(findViewById, "view.findViewById(R.id.tv_name)");
        this.f33522a = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.tv_short_desc);
        AbstractC3159y.h(findViewById2, "view.findViewById(R.id.tv_short_desc)");
        this.f33523b = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.tv_overview);
        AbstractC3159y.h(findViewById3, "view.findViewById(R.id.tv_overview)");
        this.f33524c = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.tv_percent);
        AbstractC3159y.h(findViewById4, "view.findViewById(R.id.tv_percent)");
        this.f33525d = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.tv_version);
        AbstractC3159y.h(findViewById5, "view.findViewById(R.id.tv_version)");
        this.f33526e = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.tv_autor);
        AbstractC3159y.h(findViewById6, "view.findViewById(R.id.tv_autor)");
        this.f33527f = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.pb_download);
        AbstractC3159y.h(findViewById7, "view.findViewById(R.id.pb_download)");
        this.f33528g = (ProgressBar) findViewById7;
        this.f33529h = (LinearLayout) view.findViewById(R.id.ll_screenshots);
        View findViewById8 = view.findViewById(R.id.ll_related_posts);
        AbstractC3159y.h(findViewById8, "view.findViewById(R.id.ll_related_posts)");
        this.f33530i = (LinearLayout) findViewById8;
        View findViewById9 = view.findViewById(R.id.rl_contaier_valoration_tv_app_detail);
        AbstractC3159y.h(findViewById9, "view.findViewById(R.id.r…valoration_tv_app_detail)");
        this.f33531j = (RelativeLayout) findViewById9;
        View findViewById10 = view.findViewById(R.id.tv_related_post_title);
        AbstractC3159y.h(findViewById10, "view.findViewById(R.id.tv_related_post_title)");
        this.f33532k = (TextView) findViewById10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Context context, View view) {
        try {
            Object tag = view.getTag();
            AbstractC3159y.g(tag, "null cannot be cast to non-null type kotlin.String");
            view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String) tag)));
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, R.string.msg_web_browser_needed, 1).show();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(View view, boolean z8) {
        if (z8) {
            view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.main_light_grey));
        } else {
            view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.main_light_grey));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(C1498h c1498h, View view) {
        Object tag = view.getTag();
        AbstractC3159y.g(tag, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) tag).intValue();
        Intent intent = new Intent(view.getContext(), (Class<?>) Gallery.class);
        intent.putParcelableArrayListExtra("imagenes", c1498h.R0());
        intent.putExtra("indice", intValue);
        view.getContext().startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(int i8, View view, boolean z8) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, i8);
        if (z8) {
            view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.main_light_grey));
            layoutParams.setMargins(12, 0, 12, 12);
        } else {
            view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.white));
            layoutParams.setMargins(12, 12, 12, 12);
        }
        view.setLayoutParams(layoutParams);
    }

    private final void l(Context context, C1498h c1498h) {
        if (c1498h.F0() == 0) {
            this.f33531j.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f33531j.findViewById(R.id.tv_valoration_value_tv_app_detail);
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.u());
        textView.setText(String.valueOf(c1498h.F0() / 10.0d));
        TextView textView2 = (TextView) this.f33531j.findViewById(R.id.tv_num_ratings);
        textView2.setTypeface(aVar.u());
        textView2.setText(String.valueOf(c1498h.G0()));
        View findViewById = this.f33531j.findViewById(R.id.iv_star1);
        AbstractC3159y.h(findViewById, "rlValoration.findViewById(R.id.iv_star1)");
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = this.f33531j.findViewById(R.id.iv_star2);
        AbstractC3159y.h(findViewById2, "rlValoration.findViewById(R.id.iv_star2)");
        ImageView imageView2 = (ImageView) findViewById2;
        View findViewById3 = this.f33531j.findViewById(R.id.iv_star3);
        AbstractC3159y.h(findViewById3, "rlValoration.findViewById(R.id.iv_star3)");
        ImageView imageView3 = (ImageView) findViewById3;
        View findViewById4 = this.f33531j.findViewById(R.id.iv_star4);
        AbstractC3159y.h(findViewById4, "rlValoration.findViewById(R.id.iv_star4)");
        ImageView imageView4 = (ImageView) findViewById4;
        View findViewById5 = this.f33531j.findViewById(R.id.iv_star5);
        AbstractC3159y.h(findViewById5, "rlValoration.findViewById(R.id.iv_star5)");
        ImageView imageView5 = (ImageView) findViewById5;
        imageView.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off));
        imageView2.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off));
        imageView3.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off));
        imageView4.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off));
        imageView5.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off));
        if (c1498h.F0() > 5) {
            imageView.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
        }
        if (c1498h.F0() > 15) {
            imageView2.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
        }
        if (c1498h.F0() > 25) {
            imageView3.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
        }
        if (c1498h.F0() > 35) {
            imageView4.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
        }
        if (c1498h.F0() > 45) {
            imageView5.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
        }
    }

    public final void e(Context context, C1498h appInfo, int i8) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(appInfo, "appInfo");
        this.f33522a.setText(appInfo.s0());
        this.f33523b.setText(appInfo.T0());
        this.f33524c.setText(appInfo.s());
        m(i8);
        this.f33526e.setText(appInfo.g1());
        this.f33527f.setText(appInfo.k());
        l(context, appInfo);
    }

    public final void f(final Context context, C1498h c1498h) {
        ArrayList arrayList;
        if (c1498h != null) {
            arrayList = c1498h.N0();
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            ArrayList N02 = c1498h.N0();
            AbstractC3159y.f(N02);
            if (N02.size() > 0) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(12, 12, 12, 12);
                ArrayList N03 = c1498h.N0();
                AbstractC3159y.f(N03);
                Iterator it = N03.iterator();
                while (it.hasNext()) {
                    F f8 = (F) it.next();
                    View inflate = LayoutInflater.from(context).inflate(R.layout.tv_article, (ViewGroup) this.f33530i, false);
                    AbstractC3159y.g(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
                    RelativeLayout relativeLayout = (RelativeLayout) inflate;
                    relativeLayout.setLayoutParams(layoutParams);
                    View findViewById = relativeLayout.findViewById(R.id.iv_image_article);
                    AbstractC3159y.h(findViewById, "rlArticle.findViewById(R.id.iv_image_article)");
                    FullWidthImageViewTv fullWidthImageViewTv = (FullWidthImageViewTv) findViewById;
                    TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_date_article);
                    TextView textView2 = (TextView) relativeLayout.findViewById(R.id.tv_desc_article);
                    j.a aVar = E4.j.f2274g;
                    textView.setTypeface(aVar.t());
                    textView2.setTypeface(aVar.u());
                    textView.setText(f8.b());
                    textView2.setText(f8.f());
                    String c8 = f8.c();
                    if (c8 != null && c8.length() != 0) {
                        s.h().l(c8).i(fullWidthImageViewTv);
                    }
                    relativeLayout.setTag(f8.i());
                    relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: k5.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C3131e.g(context, view);
                        }
                    });
                    relativeLayout.setFocusable(true);
                    relativeLayout.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: k5.d
                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view, boolean z8) {
                            C3131e.h(view, z8);
                        }
                    });
                    this.f33530i.addView(relativeLayout);
                }
                return;
            }
        }
        this.f33532k.setVisibility(8);
        this.f33530i.setVisibility(8);
    }

    public final void i(Context context, final C1498h c1498h) {
        ArrayList arrayList;
        LinearLayout linearLayout;
        AbstractC3159y.i(context, "context");
        if (c1498h != null) {
            arrayList = c1498h.R0();
        } else {
            arrayList = null;
        }
        if (arrayList != null && (linearLayout = this.f33529h) != null) {
            if (linearLayout.getChildCount() > 0) {
                this.f33529h.removeAllViews();
            }
            final int i8 = ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
            layoutParams.setMargins(12, 12, 12, 12);
            ArrayList R02 = c1498h.R0();
            AbstractC3159y.f(R02);
            int size = R02.size();
            for (int i9 = 0; i9 < size; i9++) {
                C3089b c3089b = new C3089b(context);
                s h8 = s.h();
                ArrayList R03 = c1498h.R0();
                AbstractC3159y.f(R03);
                h8.l(((L) R03.get(i9)).f()).i(c3089b);
                c3089b.setPadding(4, 4, 4, 4);
                c3089b.setLayoutParams(layoutParams);
                c3089b.setFocusable(true);
                c3089b.setTag(Integer.valueOf(i9));
                c3089b.setOnClickListener(new View.OnClickListener() { // from class: k5.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C3131e.j(C1498h.this, view);
                    }
                });
                c3089b.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: k5.b
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z8) {
                        C3131e.k(i8, view, z8);
                    }
                });
                this.f33529h.addView(c3089b);
            }
        }
    }

    public final void m(int i8) {
        if (i8 > 0) {
            this.f33528g.setVisibility(0);
            this.f33528g.setProgress(i8);
            this.f33525d.setVisibility(0);
            TextView textView = this.f33525d;
            Y y8 = Y.f33766a;
            String format = String.format("%s%%", Arrays.copyOf(new Object[]{String.valueOf(i8)}, 1));
            AbstractC3159y.h(format, "format(...)");
            textView.setText(format);
            return;
        }
        this.f33528g.setVisibility(8);
        this.f33525d.setVisibility(8);
    }

    public final void n(boolean z8) {
        this.f33528g.setIndeterminate(z8);
    }
}
