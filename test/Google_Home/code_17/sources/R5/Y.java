package r5;

import H4.j;
import Z4.InterfaceC1588b;
import a5.C1631C;
import a5.C1639f;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3655A;

/* loaded from: classes5.dex */
public final class Y extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1588b f38918a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f38919b;

    /* renamed from: c, reason: collision with root package name */
    private final ImageView f38920c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f38921d;

    /* renamed from: e, reason: collision with root package name */
    private final TextView f38922e;

    /* renamed from: f, reason: collision with root package name */
    private final TextView f38923f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(View itemView, InterfaceC1588b interfaceC1588b, Context context) {
        super(itemView);
        AbstractC3255y.i(itemView, "itemView");
        AbstractC3255y.i(context, "context");
        this.f38918a = interfaceC1588b;
        this.f38919b = context;
        View findViewById = itemView.findViewById(R.id.iv_icon_positive);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.id.iv_icon_positive)");
        this.f38920c = (ImageView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_name_app_positive);
        AbstractC3255y.h(findViewById2, "itemView.findViewById(R.id.tv_name_app_positive)");
        TextView textView = (TextView) findViewById2;
        this.f38921d = textView;
        View findViewById3 = itemView.findViewById(R.id.tv_version_app_positive);
        AbstractC3255y.h(findViewById3, "itemView.findViewById(R.….tv_version_app_positive)");
        TextView textView2 = (TextView) findViewById3;
        this.f38922e = textView2;
        View findViewById4 = itemView.findViewById(R.id.tv_count_positives);
        AbstractC3255y.h(findViewById4, "itemView.findViewById(R.id.tv_count_positives)");
        TextView textView3 = (TextView) findViewById4;
        this.f38923f = textView3;
        itemView.setOnClickListener(new View.OnClickListener() { // from class: r5.X
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Y.b(Y.this, view);
            }
        });
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        textView2.setTypeface(aVar.u());
        textView3.setTypeface(aVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Y this$0, View view) {
        int bindingAdapterPosition;
        AbstractC3255y.i(this$0, "this$0");
        if (this$0.f38918a != null && (bindingAdapterPosition = this$0.getBindingAdapterPosition()) != -1) {
            this$0.f38918a.a(bindingAdapterPosition);
        }
    }

    public final void c(C1639f c1639f) {
        if (c1639f != null) {
            this.f38920c.setImageDrawable(C3655A.f36474a.k(this.f38919b, c1639f.J(), R.drawable.vector_uptodown_logo_bag_disabled));
            this.f38921d.setText(c1639f.z());
            this.f38922e.setText(c1639f.h0());
            if (c1639f.U() != null) {
                kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34167a;
                String string = this.f38919b.getString(R.string.x_positives);
                AbstractC3255y.h(string, "context.getString(R.string.x_positives)");
                C1631C U8 = c1639f.U();
                AbstractC3255y.f(U8);
                String format = String.format(string, Arrays.copyOf(new Object[]{String.valueOf(U8.b())}, 1));
                AbstractC3255y.h(format, "format(...)");
                this.f38923f.setText(format);
            }
        }
    }
}
