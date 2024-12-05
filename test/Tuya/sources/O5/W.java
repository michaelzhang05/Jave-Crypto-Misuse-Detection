package o5;

import E4.j;
import X4.C1496f;
import X4.C1498h;
import X4.C1505o;
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
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3326n;

/* loaded from: classes5.dex */
public final class W extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final W4.w f36688a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f36689b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f36690c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f36691d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f36692e;

    /* renamed from: f, reason: collision with root package name */
    private ImageView f36693f;

    /* renamed from: g, reason: collision with root package name */
    private ProgressBar f36694g;

    /* renamed from: h, reason: collision with root package name */
    private RelativeLayout f36695h;

    /* renamed from: i, reason: collision with root package name */
    private ImageView f36696i;

    /* renamed from: j, reason: collision with root package name */
    private final float f36697j;

    /* renamed from: k, reason: collision with root package name */
    private final float f36698k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(View itemView, W4.w wVar) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        this.f36688a = wVar;
        View findViewById = itemView.findViewById(R.id.tv_version_old_version_item);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.…version_old_version_item)");
        this.f36689b = (TextView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_date_old_version_item);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.…tv_date_old_version_item)");
        this.f36690c = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.tv_type_old_version_item);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.…tv_type_old_version_item)");
        this.f36691d = (TextView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_min_sdk_old_version_item);
        AbstractC3159y.h(findViewById4, "itemView.findViewById(R.…min_sdk_old_version_item)");
        this.f36692e = (TextView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.iv_download_old_version_item);
        AbstractC3159y.h(findViewById5, "itemView.findViewById(R.…ownload_old_version_item)");
        this.f36693f = (ImageView) findViewById5;
        View findViewById6 = itemView.findViewById(R.id.pb_progress_old_version);
        AbstractC3159y.h(findViewById6, "itemView.findViewById(R.….pb_progress_old_version)");
        this.f36694g = (ProgressBar) findViewById6;
        View findViewById7 = itemView.findViewById(R.id.rl_download_old_version_item);
        AbstractC3159y.h(findViewById7, "itemView.findViewById(R.…ownload_old_version_item)");
        this.f36695h = (RelativeLayout) findViewById7;
        View findViewById8 = itemView.findViewById(R.id.iv_virustotal_report);
        AbstractC3159y.h(findViewById8, "itemView.findViewById(R.id.iv_virustotal_report)");
        this.f36696i = (ImageView) findViewById8;
        this.f36697j = 1.0f;
        this.f36698k = 0.4f;
        this.f36695h.setOnClickListener(new View.OnClickListener() { // from class: o5.S
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                W.e(W.this, view);
            }
        });
        this.f36696i.setOnClickListener(new View.OnClickListener() { // from class: o5.T
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                W.f(W.this, view);
            }
        });
        TextView textView = this.f36689b;
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.t());
        this.f36690c.setTypeface(aVar.u());
        this.f36691d.setTypeface(aVar.t());
        this.f36692e.setTypeface(aVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(W this$0, View view) {
        int bindingAdapterPosition;
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.f36688a != null && (bindingAdapterPosition = this$0.getBindingAdapterPosition()) != -1) {
            this$0.f36688a.d(bindingAdapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(W this$0, View view) {
        int bindingAdapterPosition;
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.f36688a != null && (bindingAdapterPosition = this$0.getBindingAdapterPosition()) != -1) {
            this$0.f36688a.c(bindingAdapterPosition);
        }
    }

    private final void i() {
        this.f36693f.setImageDrawable(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.core_vector_cross));
        this.f36695h.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.ripple_bg_card));
        this.f36693f.setContentDescription(this.itemView.getContext().getString(R.string.option_button_cancel));
    }

    private final void j() {
        if (this.f36694g.getVisibility() == 0) {
            ValueAnimator endDownloadAnimation$lambda$6 = ValueAnimator.ofFloat(this.f36698k, this.f36697j);
            endDownloadAnimation$lambda$6.setStartDelay(200L);
            endDownloadAnimation$lambda$6.setDuration(300L);
            endDownloadAnimation$lambda$6.setInterpolator(new AccelerateDecelerateInterpolator());
            endDownloadAnimation$lambda$6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o5.V
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    W.k(W.this, valueAnimator);
                }
            });
            AbstractC3159y.h(endDownloadAnimation$lambda$6, "endDownloadAnimation$lambda$6");
            endDownloadAnimation$lambda$6.addListener(new a());
            endDownloadAnimation$lambda$6.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(W this$0, ValueAnimator valueAnimator) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC3159y.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        this$0.f36691d.setScaleX(floatValue);
        this$0.f36691d.setScaleY(floatValue);
        int i8 = (int) (10 * (1 - floatValue));
        this$0.f36691d.setPadding(i8, i8, i8, i8);
    }

    private final void l() {
        if (this.f36694g.getVisibility() == 8) {
            this.f36694g.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f36697j, this.f36698k);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o5.U
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
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC3159y.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        this$0.f36691d.setScaleX(floatValue);
        this$0.f36691d.setScaleY(floatValue);
        int i8 = (int) (10 * (1 - floatValue));
        this$0.f36691d.setPadding(i8, i8, i8, i8);
    }

    private final void n() {
        this.f36693f.setImageDrawable(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.vector_action_install));
        this.f36695h.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.ripple_install_button));
        this.f36693f.setContentDescription(this.itemView.getContext().getString(R.string.action_update));
    }

    public final void h(C1498h appInfo, C1496f c1496f, int i8) {
        boolean z8;
        boolean z9;
        String str;
        AbstractC3159y.i(appInfo, "appInfo");
        C3326n.a aVar = C3326n.f34504t;
        Context context = this.itemView.getContext();
        AbstractC3159y.h(context, "itemView.context");
        C3326n a8 = aVar.a(context);
        a8.a();
        ArrayList w02 = appInfo.w0();
        AbstractC3159y.f(w02);
        String b8 = ((X4.z) w02.get(i8)).b();
        AbstractC3159y.f(b8);
        C1505o Z7 = a8.Z(b8);
        if (Z7 != null && DownloadApkWorker.f30002k.d(Z7.f(), Z7.e0())) {
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
            this.f36694g.setVisibility(8);
            this.f36691d.setScaleX(this.f36697j);
            this.f36691d.setScaleY(this.f36697j);
            this.f36691d.setPadding(10, 10, 10, 10);
        }
        ArrayList w03 = appInfo.w0();
        AbstractC3159y.f(w03);
        String c8 = ((X4.z) w03.get(i8)).c();
        TextView textView = this.f36691d;
        ArrayList w04 = appInfo.w0();
        AbstractC3159y.f(w04);
        textView.setText(((X4.z) w04.get(i8)).c());
        X4.O o8 = null;
        if (g6.n.t(c8, "xapk", false, 2, null)) {
            this.f36691d.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.shape_bg_old_version_xapk_type));
        } else {
            this.f36691d.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.shape_bg_old_version_apk_type));
        }
        TextView textView2 = this.f36689b;
        ArrayList w05 = appInfo.w0();
        AbstractC3159y.f(w05);
        textView2.setText(((X4.z) w05.get(i8)).k());
        ArrayList w06 = appInfo.w0();
        AbstractC3159y.f(w06);
        if (((X4.z) w06.get(i8)).i() >= 650000000) {
            this.f36696i.setVisibility(4);
        } else {
            this.f36696i.setVisibility(0);
        }
        if (c1496f != null) {
            long f02 = c1496f.f0();
            ArrayList w07 = appInfo.w0();
            AbstractC3159y.f(w07);
            if (f02 == ((X4.z) w07.get(i8)).j()) {
                this.f36695h.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.ripple_install_button));
                this.f36693f.setImageDrawable(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.vector_action_install));
                this.f36693f.setContentDescription(this.itemView.getContext().getString(R.string.option_button_install));
                this.f36692e.setVisibility(0);
                TextView textView3 = this.f36692e;
                ArrayList w08 = appInfo.w0();
                AbstractC3159y.f(w08);
                textView3.setText(((X4.z) w08.get(i8)).f());
                this.f36690c.setVisibility(0);
                TextView textView4 = this.f36690c;
                ArrayList w09 = appInfo.w0();
                AbstractC3159y.f(w09);
                textView4.setText(((X4.z) w09.get(i8)).e());
                j();
                a8.g();
            }
        }
        if (z8) {
            i();
            l();
            AbstractC3159y.f(Z7);
            if (Z7.Z() > 0) {
                this.f36694g.setIndeterminate(false);
                this.f36694g.setProgress(Z7.Z());
            } else {
                this.f36694g.setIndeterminate(true);
            }
            this.f36690c.setText(this.itemView.getContext().getString(R.string.percent_of_total_size, Integer.valueOf(Z7.Z()), new N4.g().c(Z7.a0())));
            this.f36692e.setText(this.itemView.getContext().getString(R.string.verified_by_uptodown));
            this.f36692e.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.vector_myappsupdates_dialog_vt_report), (Drawable) null, (Drawable) null, (Drawable) null);
            this.f36692e.setCompoundDrawablePadding((int) this.itemView.getContext().getResources().getDimension(R.dimen.margin_s));
        } else if (Z7 != null && Z7.Z() == 0) {
            l();
            i();
            this.f36694g.setIndeterminate(true);
            TextView textView5 = this.f36690c;
            ArrayList w010 = appInfo.w0();
            AbstractC3159y.f(w010);
            textView5.setText(((X4.z) w010.get(i8)).e());
            TextView textView6 = this.f36692e;
            ArrayList w011 = appInfo.w0();
            AbstractC3159y.f(w011);
            textView6.setText(((X4.z) w011.get(i8)).f());
            this.f36692e.setCompoundDrawables(null, null, null, null);
            this.f36692e.setCompoundDrawablePadding(0);
        } else {
            TextView textView7 = this.f36690c;
            ArrayList w012 = appInfo.w0();
            AbstractC3159y.f(w012);
            textView7.setText(((X4.z) w012.get(i8)).e());
            TextView textView8 = this.f36692e;
            ArrayList w013 = appInfo.w0();
            AbstractC3159y.f(w013);
            textView8.setText(((X4.z) w013.get(i8)).f());
            this.f36692e.setCompoundDrawables(null, null, null, null);
            this.f36692e.setCompoundDrawablePadding(0);
            j();
            K4.a h8 = E4.j.f2274g.h();
            if (h8 != null) {
                str = h8.b();
            } else {
                str = null;
            }
            if (g6.n.s(str, appInfo.y0(), true) && h8 != null) {
                long e8 = h8.e();
                ArrayList w014 = appInfo.w0();
                AbstractC3159y.f(w014);
                if (e8 == ((X4.z) w014.get(i8)).j()) {
                    l();
                    this.f36694g.setIndeterminate(true);
                    this.f36695h.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.shape_bg_download_button_desactivated));
                    this.f36693f.setVisibility(4);
                    this.f36695h.setClickable(false);
                }
            }
            this.f36694g.setIndeterminate(false);
            this.f36694g.setVisibility(8);
            this.f36690c.setVisibility(0);
            this.f36692e.setVisibility(0);
            if (Z7 != null && Z7.Z() == 100) {
                if (c1496f == null) {
                    this.f36693f.setImageDrawable(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.vector_action_install));
                    this.f36695h.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.ripple_install_button));
                    this.f36693f.setContentDescription(this.itemView.getContext().getString(R.string.option_button_install));
                } else {
                    n();
                }
            } else {
                if (appInfo.y0() != null) {
                    String y02 = appInfo.y0();
                    AbstractC3159y.f(y02);
                    o8 = a8.u0(y02);
                }
                if (o8 != null && o8.o() == 100) {
                    String z10 = o8.z();
                    ArrayList w015 = appInfo.w0();
                    AbstractC3159y.f(w015);
                    if (AbstractC3159y.d(z10, ((X4.z) w015.get(i8)).k())) {
                        n();
                    }
                }
                this.f36693f.setImageDrawable(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.vector_action_download));
                this.f36695h.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.ripple_download_icon_button));
                this.f36693f.setContentDescription(this.itemView.getContext().getString(R.string.updates_button_download_app));
            }
        }
        a8.g();
    }

    /* loaded from: classes5.dex */
    public static final class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            W.this.f36694g.setVisibility(8);
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
