package r5;

import H4.j;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3655A;

/* loaded from: classes5.dex */
public final class a1 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f38932a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f38933b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f38934c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(View itemView, Context context, final Z4.L listener) {
        super(itemView);
        AbstractC3255y.i(itemView, "itemView");
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(listener, "listener");
        View findViewById = itemView.findViewById(R.id.ll_no_tracking_container_updates);
        AbstractC3255y.h(findViewById, "itemView.findViewById(R.…acking_container_updates)");
        this.f38932a = (LinearLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_no_tracking_msg_updates);
        AbstractC3255y.h(findViewById2, "itemView.findViewById(R.…_no_tracking_msg_updates)");
        TextView textView = (TextView) findViewById2;
        this.f38933b = textView;
        View findViewById3 = itemView.findViewById(R.id.tv_gdpr_set_up_updates);
        AbstractC3255y.h(findViewById3, "itemView.findViewById(R.id.tv_gdpr_set_up_updates)");
        TextView textView2 = (TextView) findViewById3;
        this.f38934c = textView2;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.u());
        textView.setText(C3655A.f36474a.c(context.getString(R.string.gdpr_no_tracking_enabled)));
        textView2.setTypeface(aVar.t());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: r5.Z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a1.b(Z4.L.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Z4.L listener, View view) {
        AbstractC3255y.i(listener, "$listener");
        listener.a();
    }

    public final void c(boolean z8) {
        if (z8) {
            this.f38932a.setVisibility(0);
        } else {
            this.f38932a.setVisibility(8);
        }
    }
}
