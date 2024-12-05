package r5;

import H4.j;
import a5.C1639f;
import a5.C1641h;
import a5.C1648o;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.workers.DownloadApkWorker;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3674n;

/* loaded from: classes5.dex */
public final class W extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final Z4.w f38896a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f38897b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f38898c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f38899d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f38900e;

    /* renamed from: f, reason: collision with root package name */
    private ImageView f38901f;

    /* renamed from: g, reason: collision with root package name */
    private ProgressBar f38902g;

    /* renamed from: h, reason: collision with root package name */
    private RelativeLayout f38903h;

    /* renamed from: i, reason: collision with root package name */
    private ImageView f38904i;

    /* renamed from: j, reason: collision with root package name */
    private final float f38905j;

    /* renamed from: k, reason: collision with root package name */
    private final float f38906k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(View itemView, Z4.w wVar) {
        super(itemView);
        AbstractC3255y.i(itemView, "itemView");
        this.f38896a = wVar;
        View findViewById = itemView.findViewById(R.id.tv_version_old_version_item);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.…version_old_version_item)");
        this.f38897b = (TextView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_date_old_version_item);
        AbstractC3255y.h(findViewById2, "itemView.findViewById(R.…tv_date_old_version_item)");
        this.f38898c = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.tv_type_old_version_item);
        AbstractC3255y.h(findViewById3, "itemView.findViewById(R.…tv_type_old_version_item)");
        this.f38899d = (TextView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_min_sdk_old_version_item);
        AbstractC3255y.h(findViewById4, "itemView.findViewById(R.…min_sdk_old_version_item)");
        this.f38900e = (TextView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.iv_download_old_version_item);
        AbstractC3255y.h(findViewById5, "itemView.findViewById(R.…ownload_old_version_item)");
        this.f38901f = (ImageView) findViewById5;
        View findViewById6 = itemView.findViewById(R.id.pb_progress_old_version);
        AbstractC3255y.h(findViewById6, "itemView.findViewById(R.….pb_progress_old_version)");
        this.f38902g = (ProgressBar) findViewById6;
        View findViewById7 = itemView.findViewById(R.id.rl_download_old_version_item);
        AbstractC3255y.h(findViewById7, "itemView.findViewById(R.…ownload_old_version_item)");
        this.f38903h = (RelativeLayout) findViewById7;
        View findViewById8 = itemView.findViewById(R.id.iv_virustotal_report);
        AbstractC3255y.h(findViewById8, "itemView.findViewById(R.id.iv_virustotal_report)");
        this.f38904i = (ImageView) findViewById8;
        this.f38905j = 1.0f;
        this.f38906k = 0.4f;
        this.f38903h.setOnClickListener(new View.OnClickListener() { // from class: r5.S
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                W.e(W.this, view);
            }
        });
        this.f38904i.setOnClickListener(new View.OnClickListener() { // from class: r5.T
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                W.f(W.this, view);
            }
        });
        TextView textView = this.f38897b;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        this.f38898c.setTypeface(aVar.u());
        this.f38899d.setTypeface(aVar.t());
        this.f38900e.setTypeface(aVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(W this$0, View view) {
        int bindingAdapterPosition;
        AbstractC3255y.i(this$0, "this$0");
        if (this$0.f38896a != null && (bindingAdapterPosition = this$0.getBindingAdapterPosition()) != -1) {
            this$0.f38896a.d(bindingAdapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(W this$0, View view) {
        int bindingAdapterPosition;
        AbstractC3255y.i(this$0, "this$0");
        if (this$0.f38896a != null && (bindingAdapterPosition = this$0.getBindingAdapterPosition()) != -1) {
            this$0.f38896a.b(bindingAdapterPosition);
        }
    }

    private final void i() {
        this.f38901f.setImageDrawable(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.core_vector_cross));
        this.f38903h.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.ripple_bg_card));
        this.f38901f.setContentDescription(this.itemView.getContext().getString(R.string.option_button_cancel));
    }

    private final void j() {
        if (this.f38902g.getVisibility() == 0) {
            ValueAnimator endDownloadAnimation$lambda$6 = ValueAnimator.ofFloat(this.f38906k, this.f38905j);
            endDownloadAnimation$lambda$6.setStartDelay(200L);
            endDownloadAnimation$lambda$6.setDuration(300L);
            endDownloadAnimation$lambda$6.setInterpolator(new AccelerateDecelerateInterpolator());
            endDownloadAnimation$lambda$6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: r5.V
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    W.k(W.this, valueAnimator);
                }
            });
            AbstractC3255y.h(endDownloadAnimation$lambda$6, "endDownloadAnimation$lambda$6");
            endDownloadAnimation$lambda$6.addListener(new a());
            endDownloadAnimation$lambda$6.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(W this$0, ValueAnimator valueAnimator) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC3255y.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        this$0.f38899d.setScaleX(floatValue);
        this$0.f38899d.setScaleY(floatValue);
        int i8 = (int) (10 * (1 - floatValue));
        this$0.f38899d.setPadding(i8, i8, i8, i8);
    }

    private final void l() {
        if (this.f38902g.getVisibility() == 8) {
            this.f38902g.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f38905j, this.f38906k);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: r5.U
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    W.m(W.this, valueAnimator);
                }
            });
            ofFloat.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(W this$0, ValueAnimator valueAnimator) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC3255y.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        this$0.f38899d.setScaleX(floatValue);
        this$0.f38899d.setScaleY(floatValue);
        int i8 = (int) (10 * (1 - floatValue));
        this$0.f38899d.setPadding(i8, i8, i8, i8);
    }

    private final void n() {
        this.f38901f.setImageDrawable(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.vector_action_install));
        this.f38903h.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.ripple_install_button));
        this.f38901f.setContentDescription(this.itemView.getContext().getString(R.string.action_update));
    }

    public final void h(C1641h appInfo, C1639f c1639f, int i8) {
        boolean z8;
        boolean z9;
        String str;
        AbstractC3255y.i(appInfo, "appInfo");
        C3674n.a aVar = C3674n.f36505t;
        Context context = this.itemView.getContext();
        AbstractC3255y.h(context, "itemView.context");
        C3674n a8 = aVar.a(context);
        a8.a();
        ArrayList w02 = appInfo.w0();
        AbstractC3255y.f(w02);
        String a9 = ((a5.z) w02.get(i8)).a();
        AbstractC3255y.f(a9);
        C1648o Z7 = a8.Z(a9);
        if (Z7 != null && DownloadApkWorker.f31034k.d(Z7.h(), Z7.e0())) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (Z7 != null && Z7.h0()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z8 && !z9) {
            this.f38902g.setVisibility(8);
            this.f38899d.setScaleX(this.f38905j);
            this.f38899d.setScaleY(this.f38905j);
            this.f38899d.setPadding(10, 10, 10, 10);
        }
        ArrayList w03 = appInfo.w0();
        AbstractC3255y.f(w03);
        String b8 = ((a5.z) w03.get(i8)).b();
        TextView textView = this.f38899d;
        ArrayList w04 = appInfo.w0();
        AbstractC3255y.f(w04);
        textView.setText(((a5.z) w04.get(i8)).b());
        a5.O o8 = null;
        if (j6.n.t(b8, "xapk", false, 2, null)) {
            this.f38899d.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.shape_bg_old_version_xapk_type));
        } else {
            this.f38899d.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.shape_bg_old_version_apk_type));
        }
        TextView textView2 = this.f38897b;
        ArrayList w05 = appInfo.w0();
        AbstractC3255y.f(w05);
        textView2.setText(((a5.z) w05.get(i8)).p());
        ArrayList w06 = appInfo.w0();
        AbstractC3255y.f(w06);
        if (((a5.z) w06.get(i8)).i() >= 650000000) {
            this.f38904i.setVisibility(4);
        } else {
            this.f38904i.setVisibility(0);
        }
        if (c1639f != null) {
            long f02 = c1639f.f0();
            ArrayList w07 = appInfo.w0();
            AbstractC3255y.f(w07);
            if (f02 == ((a5.z) w07.get(i8)).l()) {
                this.f38903h.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.ripple_install_button));
                this.f38901f.setImageDrawable(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.vector_action_install));
                this.f38901f.setContentDescription(this.itemView.getContext().getString(R.string.option_button_install));
                this.f38900e.setVisibility(0);
                TextView textView3 = this.f38900e;
                ArrayList w08 = appInfo.w0();
                AbstractC3255y.f(w08);
                textView3.setText(((a5.z) w08.get(i8)).h());
                this.f38898c.setVisibility(0);
                TextView textView4 = this.f38898c;
                ArrayList w09 = appInfo.w0();
                AbstractC3255y.f(w09);
                textView4.setText(((a5.z) w09.get(i8)).g());
                j();
                a8.l();
            }
        }
        if (z8) {
            i();
            l();
            AbstractC3255y.f(Z7);
            if (Z7.Z() > 0) {
                this.f38902g.setIndeterminate(false);
                this.f38902g.setProgress(Z7.Z());
            } else {
                this.f38902g.setIndeterminate(true);
            }
            this.f38898c.setText(this.itemView.getContext().getString(R.string.percent_of_total_size, Integer.valueOf(Z7.Z()), new Q4.g().c(Z7.a0())));
            this.f38900e.setText(this.itemView.getContext().getString(R.string.verified_by_uptodown));
            this.f38900e.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.vector_myappsupdates_dialog_vt_report), (Drawable) null, (Drawable) null, (Drawable) null);
            this.f38900e.setCompoundDrawablePadding((int) this.itemView.getContext().getResources().getDimension(R.dimen.margin_s));
        } else if (Z7 != null && Z7.Z() == 0) {
            l();
            i();
            this.f38902g.setIndeterminate(true);
            TextView textView5 = this.f38898c;
            ArrayList w010 = appInfo.w0();
            AbstractC3255y.f(w010);
            textView5.setText(((a5.z) w010.get(i8)).g());
            TextView textView6 = this.f38900e;
            ArrayList w011 = appInfo.w0();
            AbstractC3255y.f(w011);
            textView6.setText(((a5.z) w011.get(i8)).h());
            this.f38900e.setCompoundDrawables(null, null, null, null);
            this.f38900e.setCompoundDrawablePadding(0);
        } else {
            TextView textView7 = this.f38898c;
            ArrayList w012 = appInfo.w0();
            AbstractC3255y.f(w012);
            textView7.setText(((a5.z) w012.get(i8)).g());
            TextView textView8 = this.f38900e;
            ArrayList w013 = appInfo.w0();
            AbstractC3255y.f(w013);
            textView8.setText(((a5.z) w013.get(i8)).h());
            this.f38900e.setCompoundDrawables(null, null, null, null);
            this.f38900e.setCompoundDrawablePadding(0);
            j();
            N4.a h8 = H4.j.f3824g.h();
            if (h8 != null) {
                str = h8.b();
            } else {
                str = null;
            }
            if (j6.n.s(str, appInfo.y0(), true) && h8 != null) {
                long e8 = h8.e();
                ArrayList w014 = appInfo.w0();
                AbstractC3255y.f(w014);
                if (e8 == ((a5.z) w014.get(i8)).l()) {
                    l();
                    this.f38902g.setIndeterminate(true);
                    this.f38903h.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.shape_bg_download_button_desactivated));
                    this.f38901f.setVisibility(4);
                    this.f38903h.setClickable(false);
                }
            }
            this.f38902g.setIndeterminate(false);
            this.f38902g.setVisibility(8);
            this.f38898c.setVisibility(0);
            this.f38900e.setVisibility(0);
            if (Z7 != null && Z7.Z() == 100) {
                if (c1639f == null) {
                    this.f38901f.setImageDrawable(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.vector_action_install));
                    this.f38903h.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.ripple_install_button));
                    this.f38901f.setContentDescription(this.itemView.getContext().getString(R.string.option_button_install));
                } else {
                    n();
                }
            } else {
                if (appInfo.y0() != null) {
                    String y02 = appInfo.y0();
                    AbstractC3255y.f(y02);
                    o8 = a8.u0(y02);
                }
                if (o8 != null && o8.u() == 100) {
                    String x8 = o8.x();
                    ArrayList w015 = appInfo.w0();
                    AbstractC3255y.f(w015);
                    if (AbstractC3255y.d(x8, ((a5.z) w015.get(i8)).p())) {
                        n();
                    }
                }
                this.f38901f.setImageDrawable(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.vector_action_download));
                this.f38903h.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.ripple_download_icon_button));
                this.f38901f.setContentDescription(this.itemView.getContext().getString(R.string.updates_button_download_app));
            }
        }
        a8.l();
    }

    /* loaded from: classes5.dex */
    public static final class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            W.this.f38902g.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }
}
