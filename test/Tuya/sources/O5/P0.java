package o5;

import E4.j;
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
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class P0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final W4.G f36638a;

    /* renamed from: b, reason: collision with root package name */
    private final LinearLayout f36639b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f36640c;

    /* renamed from: d, reason: collision with root package name */
    private final ImageView f36641d;

    /* renamed from: e, reason: collision with root package name */
    private final TextView f36642e;

    /* renamed from: f, reason: collision with root package name */
    private final TextView f36643f;

    /* renamed from: g, reason: collision with root package name */
    private final RelativeLayout f36644g;

    /* renamed from: h, reason: collision with root package name */
    private final ImageView f36645h;

    /* renamed from: i, reason: collision with root package name */
    private final int f36646i;

    /* renamed from: j, reason: collision with root package name */
    private long f36647j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(View itemView, W4.G listener) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(listener, "listener");
        this.f36638a = listener;
        View findViewById = itemView.findViewById(R.id.ll_uptodown_protect);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.id.ll_uptodown_protect)");
        this.f36639b = (LinearLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_uptodown_protect);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.id.tv_uptodown_protect)");
        TextView textView = (TextView) findViewById2;
        this.f36640c = textView;
        View findViewById3 = itemView.findViewById(R.id.iv_shield);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.id.iv_shield)");
        this.f36641d = (ImageView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_title);
        AbstractC3159y.h(findViewById4, "itemView.findViewById(R.id.tv_title)");
        TextView textView2 = (TextView) findViewById4;
        this.f36642e = textView2;
        View findViewById5 = itemView.findViewById(R.id.tv_msg);
        AbstractC3159y.h(findViewById5, "itemView.findViewById(R.id.tv_msg)");
        TextView textView3 = (TextView) findViewById5;
        this.f36643f = textView3;
        View findViewById6 = itemView.findViewById(R.id.rl_reload);
        AbstractC3159y.h(findViewById6, "itemView.findViewById(R.id.rl_reload)");
        this.f36644g = (RelativeLayout) findViewById6;
        View findViewById7 = itemView.findViewById(R.id.iv_reload);
        AbstractC3159y.h(findViewById7, "itemView.findViewById(R.id.iv_reload)");
        this.f36645h = (ImageView) findViewById7;
        this.f36646i = 600;
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.t());
        textView2.setTypeface(aVar.u());
        textView3.setTypeface(aVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(P0 this$0, Context context, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(context, "$context");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this$0.f36647j > this$0.f36646i) {
            this$0.f36647j = currentTimeMillis;
            Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.rotate);
            loadAnimation.setRepeatCount(-1);
            this$0.f36645h.startAnimation(loadAnimation);
            this$0.f36638a.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(P0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.f36638a.a();
    }

    public final void d(ArrayList arrayList, final Context context) {
        AbstractC3159y.i(context, "context");
        this.f36639b.setVisibility(0);
        this.f36644g.setOnClickListener(new View.OnClickListener() { // from class: o5.M0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                P0.e(P0.this, context, view);
            }
        });
        if (arrayList != null && arrayList.size() > 0) {
            this.f36641d.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_shield_protect_bad));
            this.f36642e.setText(R.string.positives_title_security_badge);
            this.f36643f.setText(R.string.positives_msg_security_badge);
            this.f36644g.setBackground(ContextCompat.getDrawable(context, R.drawable.ripple_cancel_button));
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: o5.N0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    P0.f(P0.this, view);
                }
            });
        } else {
            this.f36641d.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_shield_protect_ok));
            this.f36642e.setText(R.string.no_positives_title_security_badge);
            this.f36643f.setText(R.string.no_positives_msg_security_badge);
            this.f36644g.setBackground(ContextCompat.getDrawable(context, R.drawable.ripple_blue_primary_button));
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: o5.O0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    P0.g(view);
                }
            });
        }
        if (this.f36645h.getAnimation() != null && this.f36645h.getAnimation().getRepeatCount() != 0) {
            this.f36645h.getAnimation().setRepeatCount(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(View view) {
    }
}
