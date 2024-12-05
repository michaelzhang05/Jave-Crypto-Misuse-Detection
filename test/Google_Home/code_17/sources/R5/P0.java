package r5;

import H4.j;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class P0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final Z4.G f38846a;

    /* renamed from: b, reason: collision with root package name */
    private final LinearLayout f38847b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f38848c;

    /* renamed from: d, reason: collision with root package name */
    private final ImageView f38849d;

    /* renamed from: e, reason: collision with root package name */
    private final TextView f38850e;

    /* renamed from: f, reason: collision with root package name */
    private final TextView f38851f;

    /* renamed from: g, reason: collision with root package name */
    private final RelativeLayout f38852g;

    /* renamed from: h, reason: collision with root package name */
    private final ImageView f38853h;

    /* renamed from: i, reason: collision with root package name */
    private final int f38854i;

    /* renamed from: j, reason: collision with root package name */
    private long f38855j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(View itemView, Z4.G listener) {
        super(itemView);
        AbstractC3255y.i(itemView, "itemView");
        AbstractC3255y.i(listener, "listener");
        this.f38846a = listener;
        View findViewById = itemView.findViewById(R.id.ll_uptodown_protect);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.id.ll_uptodown_protect)");
        this.f38847b = (LinearLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_uptodown_protect);
        AbstractC3255y.h(findViewById2, "itemView.findViewById(R.id.tv_uptodown_protect)");
        TextView textView = (TextView) findViewById2;
        this.f38848c = textView;
        View findViewById3 = itemView.findViewById(R.id.iv_shield);
        AbstractC3255y.h(findViewById3, "itemView.findViewById(R.id.iv_shield)");
        this.f38849d = (ImageView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_title);
        AbstractC3255y.h(findViewById4, "itemView.findViewById(R.id.tv_title)");
        TextView textView2 = (TextView) findViewById4;
        this.f38850e = textView2;
        View findViewById5 = itemView.findViewById(R.id.tv_msg);
        AbstractC3255y.h(findViewById5, "itemView.findViewById(R.id.tv_msg)");
        TextView textView3 = (TextView) findViewById5;
        this.f38851f = textView3;
        View findViewById6 = itemView.findViewById(R.id.rl_reload);
        AbstractC3255y.h(findViewById6, "itemView.findViewById(R.id.rl_reload)");
        this.f38852g = (RelativeLayout) findViewById6;
        View findViewById7 = itemView.findViewById(R.id.iv_reload);
        AbstractC3255y.h(findViewById7, "itemView.findViewById(R.id.iv_reload)");
        this.f38853h = (ImageView) findViewById7;
        this.f38854i = 600;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        textView2.setTypeface(aVar.u());
        textView3.setTypeface(aVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(P0 this$0, Context context, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(context, "$context");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this$0.f38855j > this$0.f38854i) {
            this$0.f38855j = currentTimeMillis;
            Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.rotate);
            loadAnimation.setRepeatCount(-1);
            this$0.f38853h.startAnimation(loadAnimation);
            this$0.f38846a.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(P0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.f38846a.a();
    }

    public final void d(ArrayList arrayList, final Context context) {
        AbstractC3255y.i(context, "context");
        this.f38847b.setVisibility(0);
        this.f38852g.setOnClickListener(new View.OnClickListener() { // from class: r5.M0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                P0.e(P0.this, context, view);
            }
        });
        if (arrayList != null && arrayList.size() > 0) {
            this.f38849d.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_shield_protect_bad));
            this.f38850e.setText(R.string.positives_title_security_badge);
            this.f38851f.setText(R.string.positives_msg_security_badge);
            this.f38852g.setBackground(ContextCompat.getDrawable(context, R.drawable.ripple_cancel_button));
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: r5.N0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    P0.f(P0.this, view);
                }
            });
        } else {
            this.f38849d.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_shield_protect_ok));
            this.f38850e.setText(R.string.no_positives_title_security_badge);
            this.f38851f.setText(R.string.no_positives_msg_security_badge);
            this.f38852g.setBackground(ContextCompat.getDrawable(context, R.drawable.ripple_blue_primary_button));
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: r5.O0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    P0.g(view);
                }
            });
        }
        if (this.f38853h.getAnimation() != null && this.f38853h.getAnimation().getRepeatCount() != 0) {
            this.f38853h.getAnimation().setRepeatCount(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(View view) {
    }
}
