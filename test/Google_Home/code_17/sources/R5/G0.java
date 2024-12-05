package r5;

import H4.j;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class G0 extends RecyclerView.ViewHolder {

    /* renamed from: h, reason: collision with root package name */
    public static final a f38782h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Z4.F f38783a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f38784b;

    /* renamed from: c, reason: collision with root package name */
    private int f38785c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f38786d;

    /* renamed from: e, reason: collision with root package name */
    private final TextView f38787e;

    /* renamed from: f, reason: collision with root package name */
    private final RelativeLayout f38788f;

    /* renamed from: g, reason: collision with root package name */
    private final TextView f38789g;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(View itemView, Z4.F listener, Context context) {
        super(itemView);
        AbstractC3255y.i(itemView, "itemView");
        AbstractC3255y.i(listener, "listener");
        AbstractC3255y.i(context, "context");
        this.f38783a = listener;
        this.f38784b = context;
        View findViewById = itemView.findViewById(R.id.tv_updates_available_updates);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.…pdates_available_updates)");
        TextView textView = (TextView) findViewById;
        this.f38786d = textView;
        View findViewById2 = itemView.findViewById(R.id.tv_download_all_update);
        AbstractC3255y.h(findViewById2, "itemView.findViewById(R.id.tv_download_all_update)");
        TextView textView2 = (TextView) findViewById2;
        this.f38787e = textView2;
        View findViewById3 = itemView.findViewById(R.id.rl_updates_available_container);
        AbstractC3255y.h(findViewById3, "itemView.findViewById(R.…ates_available_container)");
        this.f38788f = (RelativeLayout) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_updates_available_value_updates);
        AbstractC3255y.h(findViewById4, "itemView.findViewById(R.…_available_value_updates)");
        TextView textView3 = (TextView) findViewById4;
        this.f38789g = textView3;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        textView2.setTypeface(aVar.t());
        textView3.setTypeface(aVar.u());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: r5.F0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                G0.b(G0.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(G0 this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.f38783a.a();
    }

    private final void d() {
        this.f38787e.setText(android.R.string.cancel);
        this.f38787e.setBackground(ContextCompat.getDrawable(this.f38784b, R.drawable.ripple_cancel_all_button));
        this.f38787e.setTextColor(ContextCompat.getColor(this.f38784b, R.color.white));
        this.f38787e.setVisibility(0);
    }

    private final void e() {
        this.f38787e.setText(R.string.download_all_updates);
        this.f38787e.setBackground(ContextCompat.getDrawable(this.f38784b, R.drawable.ripple_blue_primary_button));
        this.f38787e.setTextColor(ContextCompat.getColor(this.f38784b, R.color.white));
        this.f38787e.setVisibility(0);
    }

    private final void f() {
        this.f38787e.setText(R.string.install_all);
        this.f38787e.setBackground(ContextCompat.getDrawable(this.f38784b, R.drawable.ripple_install_button));
        this.f38787e.setTextColor(ContextCompat.getColor(this.f38784b, R.color.accent_green));
        this.f38787e.setVisibility(0);
    }

    public final void c(int i8, int i9) {
        this.f38785c = i9;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    this.f38787e.setVisibility(4);
                } else {
                    d();
                }
            } else {
                f();
            }
        } else {
            e();
        }
        if (i9 == 0) {
            this.f38786d.setText(this.f38784b.getString(R.string.no_pending_updates));
            this.f38788f.setVisibility(8);
        } else {
            this.f38786d.setText(this.f38784b.getString(R.string.my_downloads_pending));
            this.f38789g.setText(String.valueOf(this.f38785c));
            this.f38788f.setVisibility(0);
        }
    }
}
