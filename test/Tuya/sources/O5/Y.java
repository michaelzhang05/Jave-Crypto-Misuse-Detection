package o5;

import E4.j;
import W4.InterfaceC1479b;
import X4.C1496f;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3307A;

/* loaded from: classes5.dex */
public final class Y extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1479b f36710a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f36711b;

    /* renamed from: c, reason: collision with root package name */
    private final ImageView f36712c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f36713d;

    /* renamed from: e, reason: collision with root package name */
    private final TextView f36714e;

    /* renamed from: f, reason: collision with root package name */
    private final TextView f36715f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(View itemView, InterfaceC1479b interfaceC1479b, Context context) {
        super(itemView);
        AbstractC3159y.i(itemView, "itemView");
        AbstractC3159y.i(context, "context");
        this.f36710a = interfaceC1479b;
        this.f36711b = context;
        View findViewById = itemView.findViewById(R.id.iv_icon_positive);
        AbstractC3159y.h(findViewById, "itemView.findViewById(R.id.iv_icon_positive)");
        this.f36712c = (ImageView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_name_app_positive);
        AbstractC3159y.h(findViewById2, "itemView.findViewById(R.id.tv_name_app_positive)");
        TextView textView = (TextView) findViewById2;
        this.f36713d = textView;
        View findViewById3 = itemView.findViewById(R.id.tv_version_app_positive);
        AbstractC3159y.h(findViewById3, "itemView.findViewById(R.….tv_version_app_positive)");
        TextView textView2 = (TextView) findViewById3;
        this.f36714e = textView2;
        View findViewById4 = itemView.findViewById(R.id.tv_count_positives);
        AbstractC3159y.h(findViewById4, "itemView.findViewById(R.id.tv_count_positives)");
        TextView textView3 = (TextView) findViewById4;
        this.f36715f = textView3;
        itemView.setOnClickListener(new View.OnClickListener() { // from class: o5.X
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Y.b(Y.this, view);
            }
        });
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.t());
        textView2.setTypeface(aVar.u());
        textView3.setTypeface(aVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Y this$0, View view) {
        int bindingAdapterPosition;
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.f36710a != null && (bindingAdapterPosition = this$0.getBindingAdapterPosition()) != -1) {
            this$0.f36710a.a(bindingAdapterPosition);
        }
    }

    public final void c(C1496f c1496f) {
        if (c1496f != null) {
            this.f36712c.setImageDrawable(C3307A.f34473a.k(this.f36711b, c1496f.Q(), R.drawable.vector_uptodown_logo_bag_disabled));
            this.f36713d.setText(c1496f.I());
            this.f36714e.setText(c1496f.h0());
            if (c1496f.T() != null) {
                kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f33766a;
                String string = this.f36711b.getString(R.string.x_positives);
                AbstractC3159y.h(string, "context.getString(R.string.x_positives)");
                X4.C T7 = c1496f.T();
                AbstractC3159y.f(T7);
                String format = String.format(string, Arrays.copyOf(new Object[]{String.valueOf(T7.b())}, 1));
                AbstractC3159y.h(format, "format(...)");
                this.f36715f.setText(format);
            }
        }
    }
}
