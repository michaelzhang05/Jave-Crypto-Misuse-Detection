package o5;

import E4.j;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class G0 extends RecyclerView.ViewHolder {

    /* renamed from: h, reason: collision with root package name */
    public static final a f36574h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final W4.F f36575a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f36576b;

    /* renamed from: c, reason: collision with root package name */
    private int f36577c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f36578d;

    /* renamed from: e, reason: collision with root package name */
    private final TextView f36579e;

    /* renamed from: f, reason: collision with root package name */
    private final RelativeLayout f36580f;

    /* renamed from: g, reason: collision with root package name */
    private final TextView f36581g;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(View itemView, W4.F listener, Context context) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(context, "context");
        this.f36575a = listener;
        this.f36576b = context;
        View findViewById = itemView.findViewById(R.id.tv_updates_available_updates);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.…pdates_available_updates)");
        TextView textView = (TextView) findViewById;
        this.f36578d = textView;
        View findViewById2 = itemView.findViewById(R.id.tv_download_all_update);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.id.tv_download_all_update)");
        TextView textView2 = (TextView) findViewById2;
        this.f36579e = textView2;
        View findViewById3 = itemView.findViewById(R.id.rl_updates_available_container);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.…ates_available_container)");
        this.f36580f = (RelativeLayout) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_updates_available_value_updates);
        AbstractC3159y.h(findViewById4, "itemView.findViewById(R.…_available_value_updates)");
        TextView textView3 = (TextView) findViewById4;
        this.f36581g = textView3;
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.t());
        textView2.setTypeface(aVar.t());
        textView3.setTypeface(aVar.u());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: o5.F0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                G0.b(G0.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(G0 this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.f36575a.a();
    }

    private final void d() {
        this.f36579e.setText(android.R.string.cancel);
        this.f36579e.setBackground(ContextCompat.getDrawable(this.f36576b, R.drawable.ripple_cancel_all_button));
        this.f36579e.setTextColor(ContextCompat.getColor(this.f36576b, R.color.white));
        this.f36579e.setVisibility(0);
    }

    private final void e() {
        this.f36579e.setText(R.string.download_all_updates);
        this.f36579e.setBackground(ContextCompat.getDrawable(this.f36576b, R.drawable.ripple_blue_primary_button));
        this.f36579e.setTextColor(ContextCompat.getColor(this.f36576b, R.color.white));
        this.f36579e.setVisibility(0);
    }

    private final void f() {
        this.f36579e.setText(R.string.install_all);
        this.f36579e.setBackground(ContextCompat.getDrawable(this.f36576b, R.drawable.ripple_install_button));
        this.f36579e.setTextColor(ContextCompat.getColor(this.f36576b, R.color.accent_green));
        this.f36579e.setVisibility(0);
    }

    public final void c(int i8, int i9) {
        this.f36577c = i9;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    this.f36579e.setVisibility(4);
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
            this.f36578d.setText(this.f36576b.getString(R.string.no_pending_updates));
            this.f36580f.setVisibility(8);
        } else {
            this.f36578d.setText(this.f36576b.getString(R.string.my_downloads_pending));
            this.f36581g.setText(String.valueOf(this.f36577c));
            this.f36580f.setVisibility(0);
        }
    }
}
