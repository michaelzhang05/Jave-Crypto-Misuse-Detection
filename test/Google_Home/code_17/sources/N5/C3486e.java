package n5;

import H4.j;
import a5.C1641h;
import a5.F;
import a5.L;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.Y;
import m5.C3443b;

/* renamed from: n5.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3486e extends Presenter.ViewHolder {

    /* renamed from: l, reason: collision with root package name */
    public static final a f35513l = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final TextView f35514a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f35515b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f35516c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f35517d;

    /* renamed from: e, reason: collision with root package name */
    private final TextView f35518e;

    /* renamed from: f, reason: collision with root package name */
    private final TextView f35519f;

    /* renamed from: g, reason: collision with root package name */
    private final ProgressBar f35520g;

    /* renamed from: h, reason: collision with root package name */
    private final LinearLayout f35521h;

    /* renamed from: i, reason: collision with root package name */
    private final LinearLayout f35522i;

    /* renamed from: j, reason: collision with root package name */
    private final RelativeLayout f35523j;

    /* renamed from: k, reason: collision with root package name */
    private final TextView f35524k;

    /* renamed from: n5.e$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3486e(View view) {
        super(view);
        AbstractC3255y.i(view, "view");
        View findViewById = view.findViewById(R.id.tv_name);
        AbstractC3255y.h(findViewById, "view.findViewById(R.id.tv_name)");
        this.f35514a = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.tv_short_desc);
        AbstractC3255y.h(findViewById2, "view.findViewById(R.id.tv_short_desc)");
        this.f35515b = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.tv_overview);
        AbstractC3255y.h(findViewById3, "view.findViewById(R.id.tv_overview)");
        this.f35516c = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.tv_percent);
        AbstractC3255y.h(findViewById4, "view.findViewById(R.id.tv_percent)");
        this.f35517d = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.tv_version);
        AbstractC3255y.h(findViewById5, "view.findViewById(R.id.tv_version)");
        this.f35518e = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.tv_autor);
        AbstractC3255y.h(findViewById6, "view.findViewById(R.id.tv_autor)");
        this.f35519f = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.pb_download);
        AbstractC3255y.h(findViewById7, "view.findViewById(R.id.pb_download)");
        this.f35520g = (ProgressBar) findViewById7;
        this.f35521h = (LinearLayout) view.findViewById(R.id.ll_screenshots);
        View findViewById8 = view.findViewById(R.id.ll_related_posts);
        AbstractC3255y.h(findViewById8, "view.findViewById(R.id.ll_related_posts)");
        this.f35522i = (LinearLayout) findViewById8;
        View findViewById9 = view.findViewById(R.id.rl_contaier_valoration_tv_app_detail);
        AbstractC3255y.h(findViewById9, "view.findViewById(R.id.r…valoration_tv_app_detail)");
        this.f35523j = (RelativeLayout) findViewById9;
        View findViewById10 = view.findViewById(R.id.tv_related_post_title);
        AbstractC3255y.h(findViewById10, "view.findViewById(R.id.tv_related_post_title)");
        this.f35524k = (TextView) findViewById10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Context context, View view) {
        try {
            Object tag = view.getTag();
            AbstractC3255y.g(tag, "null cannot be cast to non-null type kotlin.String");
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
    public static final void j(C1641h c1641h, View view) {
        Object tag = view.getTag();
        AbstractC3255y.g(tag, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) tag).intValue();
        Intent intent = new Intent(view.getContext(), (Class<?>) Gallery.class);
        intent.putParcelableArrayListExtra("imagenes", c1641h.R0());
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

    private final void l(Context context, C1641h c1641h) {
        if (c1641h.F0() == 0) {
            this.f35523j.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f35523j.findViewById(R.id.tv_valoration_value_tv_app_detail);
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.u());
        textView.setText(String.valueOf(c1641h.F0() / 10.0d));
        TextView textView2 = (TextView) this.f35523j.findViewById(R.id.tv_num_ratings);
        textView2.setTypeface(aVar.u());
        textView2.setText(String.valueOf(c1641h.G0()));
        View findViewById = this.f35523j.findViewById(R.id.iv_star1);
        AbstractC3255y.h(findViewById, "rlValoration.findViewById(R.id.iv_star1)");
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = this.f35523j.findViewById(R.id.iv_star2);
        AbstractC3255y.h(findViewById2, "rlValoration.findViewById(R.id.iv_star2)");
        ImageView imageView2 = (ImageView) findViewById2;
        View findViewById3 = this.f35523j.findViewById(R.id.iv_star3);
        AbstractC3255y.h(findViewById3, "rlValoration.findViewById(R.id.iv_star3)");
        ImageView imageView3 = (ImageView) findViewById3;
        View findViewById4 = this.f35523j.findViewById(R.id.iv_star4);
        AbstractC3255y.h(findViewById4, "rlValoration.findViewById(R.id.iv_star4)");
        ImageView imageView4 = (ImageView) findViewById4;
        View findViewById5 = this.f35523j.findViewById(R.id.iv_star5);
        AbstractC3255y.h(findViewById5, "rlValoration.findViewById(R.id.iv_star5)");
        ImageView imageView5 = (ImageView) findViewById5;
        imageView.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off));
        imageView2.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off));
        imageView3.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off));
        imageView4.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off));
        imageView5.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off));
        if (c1641h.F0() > 5) {
            imageView.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
        }
        if (c1641h.F0() > 15) {
            imageView2.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
        }
        if (c1641h.F0() > 25) {
            imageView3.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
        }
        if (c1641h.F0() > 35) {
            imageView4.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
        }
        if (c1641h.F0() > 45) {
            imageView5.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
        }
    }

    public final void e(Context context, C1641h appInfo, int i8) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(appInfo, "appInfo");
        this.f35514a.setText(appInfo.s0());
        this.f35515b.setText(appInfo.T0());
        this.f35516c.setText(appInfo.v());
        m(i8);
        this.f35518e.setText(appInfo.g1());
        this.f35519f.setText(appInfo.p());
        l(context, appInfo);
    }

    public final void f(final Context context, C1641h c1641h) {
        ArrayList arrayList;
        if (c1641h != null) {
            arrayList = c1641h.N0();
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            ArrayList N02 = c1641h.N0();
            AbstractC3255y.f(N02);
            if (N02.size() > 0) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(12, 12, 12, 12);
                ArrayList N03 = c1641h.N0();
                AbstractC3255y.f(N03);
                Iterator it = N03.iterator();
                while (it.hasNext()) {
                    F f8 = (F) it.next();
                    View inflate = LayoutInflater.from(context).inflate(R.layout.tv_article, (ViewGroup) this.f35522i, false);
                    AbstractC3255y.g(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
                    RelativeLayout relativeLayout = (RelativeLayout) inflate;
                    relativeLayout.setLayoutParams(layoutParams);
                    View findViewById = relativeLayout.findViewById(R.id.iv_image_article);
                    AbstractC3255y.h(findViewById, "rlArticle.findViewById(R.id.iv_image_article)");
                    FullWidthImageViewTv fullWidthImageViewTv = (FullWidthImageViewTv) findViewById;
                    TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_date_article);
                    TextView textView2 = (TextView) relativeLayout.findViewById(R.id.tv_desc_article);
                    j.a aVar = H4.j.f3824g;
                    textView.setTypeface(aVar.t());
                    textView2.setTypeface(aVar.u());
                    textView.setText(f8.a());
                    textView2.setText(f8.h());
                    String b8 = f8.b();
                    if (b8 != null && b8.length() != 0) {
                        s.h().l(b8).i(fullWidthImageViewTv);
                    }
                    relativeLayout.setTag(f8.i());
                    relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: n5.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C3486e.g(context, view);
                        }
                    });
                    relativeLayout.setFocusable(true);
                    relativeLayout.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: n5.d
                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view, boolean z8) {
                            C3486e.h(view, z8);
                        }
                    });
                    this.f35522i.addView(relativeLayout);
                }
                return;
            }
        }
        this.f35524k.setVisibility(8);
        this.f35522i.setVisibility(8);
    }

    public final void i(Context context, final C1641h c1641h) {
        ArrayList arrayList;
        LinearLayout linearLayout;
        AbstractC3255y.i(context, "context");
        if (c1641h != null) {
            arrayList = c1641h.R0();
        } else {
            arrayList = null;
        }
        if (arrayList != null && (linearLayout = this.f35521h) != null) {
            if (linearLayout.getChildCount() > 0) {
                this.f35521h.removeAllViews();
            }
            final int i8 = ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
            layoutParams.setMargins(12, 12, 12, 12);
            ArrayList R02 = c1641h.R0();
            AbstractC3255y.f(R02);
            int size = R02.size();
            for (int i9 = 0; i9 < size; i9++) {
                C3443b c3443b = new C3443b(context);
                s h8 = s.h();
                ArrayList R03 = c1641h.R0();
                AbstractC3255y.f(R03);
                h8.l(((L) R03.get(i9)).h()).i(c3443b);
                c3443b.setPadding(4, 4, 4, 4);
                c3443b.setLayoutParams(layoutParams);
                c3443b.setFocusable(true);
                c3443b.setTag(Integer.valueOf(i9));
                c3443b.setOnClickListener(new View.OnClickListener() { // from class: n5.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C3486e.j(C1641h.this, view);
                    }
                });
                c3443b.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: n5.b
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z8) {
                        C3486e.k(i8, view, z8);
                    }
                });
                this.f35521h.addView(c3443b);
            }
        }
    }

    public final void m(int i8) {
        if (i8 > 0) {
            this.f35520g.setVisibility(0);
            this.f35520g.setProgress(i8);
            this.f35517d.setVisibility(0);
            TextView textView = this.f35517d;
            Y y8 = Y.f34167a;
            String format = String.format("%s%%", Arrays.copyOf(new Object[]{String.valueOf(i8)}, 1));
            AbstractC3255y.h(format, "format(...)");
            textView.setText(format);
            return;
        }
        this.f35520g.setVisibility(8);
        this.f35517d.setVisibility(8);
    }

    public final void n(boolean z8) {
        this.f35520g.setIndeterminate(z8);
    }
}
